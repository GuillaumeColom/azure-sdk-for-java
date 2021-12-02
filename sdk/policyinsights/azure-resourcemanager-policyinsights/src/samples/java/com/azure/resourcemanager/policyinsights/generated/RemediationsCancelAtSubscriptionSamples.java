// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.Context;

/** Samples for Remediations CancelAtSubscription. */
public final class RemediationsCancelAtSubscriptionSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2021-10-01/examples/Remediations_CancelSubscriptionScope.json
     */
    /**
     * Sample code: Cancel a remediation at subscription scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void cancelARemediationAtSubscriptionScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations().cancelAtSubscriptionWithResponse("myRemediation", Context.NONE);
    }
}