// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VnetValidationTestFailure resource specific properties. */
@Fluent
public final class VnetValidationTestFailureProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VnetValidationTestFailureProperties.class);

    /*
     * The name of the test that failed.
     */
    @JsonProperty(value = "testName")
    private String testName;

    /*
     * The details of what caused the failure, e.g. the blocking rule name,
     * etc.
     */
    @JsonProperty(value = "details")
    private String details;

    /**
     * Get the testName property: The name of the test that failed.
     *
     * @return the testName value.
     */
    public String testName() {
        return this.testName;
    }

    /**
     * Set the testName property: The name of the test that failed.
     *
     * @param testName the testName value to set.
     * @return the VnetValidationTestFailureProperties object itself.
     */
    public VnetValidationTestFailureProperties withTestName(String testName) {
        this.testName = testName;
        return this;
    }

    /**
     * Get the details property: The details of what caused the failure, e.g. the blocking rule name, etc.
     *
     * @return the details value.
     */
    public String details() {
        return this.details;
    }

    /**
     * Set the details property: The details of what caused the failure, e.g. the blocking rule name, etc.
     *
     * @param details the details value to set.
     * @return the VnetValidationTestFailureProperties object itself.
     */
    public VnetValidationTestFailureProperties withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}