// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.autoconfigure.aad.b2c.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.FilteredClassLoader;
import org.springframework.boot.test.context.runner.WebApplicationContextRunner;
import org.springframework.security.oauth2.server.resource.BearerTokenAuthenticationToken;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

class AADB2CAutoConfigurationTest extends AbstractAADB2COAuth2ClientTestConfiguration {

    @Override
    WebApplicationContextRunner getDefaultContextRunner() {
        return new WebApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(WebOAuth2ClientApp.class, AADB2CAutoConfiguration.class))
            .withClassLoader(new FilteredClassLoader(BearerTokenAuthenticationToken.class))
            .withPropertyValues(getWebappCommonPropertyValues());
    }

    private String[] getWebappCommonPropertyValues() {
        return new String[] { String.format("%s=%s", AADB2CConstants.BASE_URI, AADB2CConstants.TEST_BASE_URI),
            String.format("%s=%s", AADB2CConstants.TENANT_ID, AADB2CConstants.TEST_TENANT_ID),
            String.format("%s=%s", AADB2CConstants.CLIENT_ID, AADB2CConstants.TEST_CLIENT_ID),
            String.format("%s=%s", AADB2CConstants.CLIENT_SECRET, AADB2CConstants.TEST_CLIENT_SECRET),
            String.format("%s=%s", AADB2CConstants.LOGOUT_SUCCESS_URL, AADB2CConstants.TEST_LOGOUT_SUCCESS_URL),
            String.format("%s=%s", AADB2CConstants.LOGIN_FLOW, AADB2CConstants.TEST_KEY_SIGN_UP_OR_IN),
            String.format("%s.%s=%s", AADB2CConstants.USER_FLOWS,
                AADB2CConstants.TEST_KEY_SIGN_UP_OR_IN, AADB2CConstants.TEST_SIGN_UP_OR_IN_NAME),
            String.format("%s.%s=%s", AADB2CConstants.USER_FLOWS,
                AADB2CConstants.TEST_KEY_SIGN_IN, AADB2CConstants.TEST_SIGN_IN_NAME),
            String.format("%s.%s=%s", AADB2CConstants.USER_FLOWS,
                AADB2CConstants.TEST_KEY_SIGN_UP, AADB2CConstants.TEST_SIGN_UP_NAME),
            String.format("%s=%s", AADB2CConstants.CONFIG_PROMPT, AADB2CConstants.TEST_PROMPT),
            String.format("%s=%s", AADB2CConstants.CONFIG_LOGIN_HINT, AADB2CConstants.TEST_LOGIN_HINT),
            String.format("%s=%s", AADB2CConstants.USER_NAME_ATTRIBUTE_NAME, AADB2CConstants.TEST_ATTRIBUTE_NAME) };
    }

    @Test
    void testAutoConfigurationBean() {
        getDefaultContextRunner()
            .withPropertyValues("spring.cloud.azure.active-directory.b2c.enabled=true")
            .run(c -> {
                final AADB2CAutoConfiguration autoConfig = c.getBean(AADB2CAutoConfiguration.class);
                Assertions.assertNotNull(autoConfig);
            });
    }

    @Test
    void testPropertiesBean() {
        getDefaultContextRunner()
            .withPropertyValues("spring.cloud.azure.active-directory.b2c.enabled=true")
            .run(c -> {
                final AADB2CProperties properties = c.getBean(AADB2CProperties.class);

                Assertions.assertNotNull(properties);
                Assertions.assertEquals(properties.getClientId(), AADB2CConstants.TEST_CLIENT_ID);
                Assertions.assertEquals(properties.getClientSecret(), AADB2CConstants.TEST_CLIENT_SECRET);
                Assertions.assertEquals(properties.getUserNameAttributeName(), AADB2CConstants.TEST_ATTRIBUTE_NAME);

                Map<String, String> userFlows = properties.getUserFlows();
                Assertions.assertTrue(userFlows.size() > 0);
                final Object prompt = properties.getAuthenticateAdditionalParameters().get(AADB2CConstants.PROMPT);
                final String loginHint =
                    String.valueOf(properties.getAuthenticateAdditionalParameters().get(AADB2CConstants.LOGIN_HINT));
                Set<Object> clientNames = new HashSet<>(Arrays.asList(AADB2CConstants.TEST_SIGN_IN_NAME,
                    AADB2CConstants.TEST_SIGN_UP_NAME, AADB2CConstants.TEST_SIGN_UP_OR_IN_NAME));
                for (String clientName : userFlows.keySet()) {
                    Assertions.assertTrue(clientNames.contains(userFlows.get(clientName)));
                }
                Assertions.assertEquals(prompt, AADB2CConstants.TEST_PROMPT);
                Assertions.assertEquals(loginHint, AADB2CConstants.TEST_LOGIN_HINT);
            });
    }

    @Test
    void testAADB2CAuthorizationRequestResolverBean() {
        getDefaultContextRunner()
            .withPropertyValues("spring.cloud.azure.active-directory.b2c.enabled=true")
            .run(c -> {
                final AADB2CAuthorizationRequestResolver resolver = c.getBean(AADB2CAuthorizationRequestResolver.class);
                Assertions.assertNotNull(resolver);
            });
    }

    @Test
    void testLogoutSuccessHandlerBean() {
        getDefaultContextRunner()
            .withPropertyValues("spring.cloud.azure.active-directory.b2c.enabled=true")
            .run(c -> {
                final AADB2CLogoutSuccessHandler handler = c.getBean(AADB2CLogoutSuccessHandler.class);
                Assertions.assertNotNull(handler);
            });
    }

    @Test
    void testWebappConditionsIsInvokedWhenAADB2CEnabled() {
        try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class, Mockito.CALLS_REAL_METHODS)) {
            AADB2CConditions.UserFlowCondition userFlowCondition = spy(AADB2CConditions.UserFlowCondition.class);
            AADB2CConditions.ClientRegistrationCondition clientRegistrationCondition =
                spy(AADB2CConditions.ClientRegistrationCondition.class);
            beanUtils.when(() -> BeanUtils.instantiateClass(AADB2CConditions.UserFlowCondition.class))
                     .thenReturn(userFlowCondition);
            beanUtils.when(() -> BeanUtils.instantiateClass(AADB2CConditions.ClientRegistrationCondition.class))
                     .thenReturn(clientRegistrationCondition);
            getDefaultContextRunner()
                .withPropertyValues("spring.cloud.azure.active-directory.b2c.enabled=true")
                .run(c -> {
                    verify(userFlowCondition, atLeastOnce()).getMatchOutcome(any(), any());
                    verify(clientRegistrationCondition, atLeastOnce()).getMatchOutcome(any(), any());
                });
        }
    }

    @Test
    void testWebappConditionsIsNotInvokedWhenAADB2CDisabled() {
        try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class, Mockito.CALLS_REAL_METHODS)) {
            AADB2CConditions.UserFlowCondition userFlowCondition = mock(AADB2CConditions.UserFlowCondition.class);
            AADB2CConditions.ClientRegistrationCondition clientRegistrationCondition =
                spy(AADB2CConditions.ClientRegistrationCondition.class);
            beanUtils.when(() -> BeanUtils.instantiateClass(AADB2CConditions.UserFlowCondition.class))
                     .thenReturn(userFlowCondition);
            beanUtils.when(() -> BeanUtils.instantiateClass(AADB2CConditions.ClientRegistrationCondition.class))
                     .thenReturn(clientRegistrationCondition);
            new WebApplicationContextRunner()
                .withConfiguration(AutoConfigurations.of(WebResourceServerApp.class,
                    AADB2CResourceServerAutoConfiguration.class))
                .withPropertyValues(getWebappCommonPropertyValues())
                .run(c -> {
                    verify(userFlowCondition, never()).getMatchOutcome(any(), any());
                    verify(clientRegistrationCondition, never()).getMatchOutcome(any(), any());
                });
        }
    }
}