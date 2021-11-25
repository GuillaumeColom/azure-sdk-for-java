// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.fluent.models.AppRoleAssignmentInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** AppRoleAssignment list operation result. */
@Fluent
public final class AppRoleAssignmentListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppRoleAssignmentListResult.class);

    /*
     * A collection of AppRoleAssignment.
     */
    @JsonProperty(value = "value")
    private List<AppRoleAssignmentInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "odata.nextLink")
    private String odataNextLink;

    /**
     * Get the value property: A collection of AppRoleAssignment.
     *
     * @return the value value.
     */
    public List<AppRoleAssignmentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of AppRoleAssignment.
     *
     * @param value the value value to set.
     * @return the AppRoleAssignmentListResult object itself.
     */
    public AppRoleAssignmentListResult withValue(List<AppRoleAssignmentInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the odataNextLink property: The URL to get the next set of results.
     *
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: The URL to get the next set of results.
     *
     * @param odataNextLink the odataNextLink value to set.
     * @return the AppRoleAssignmentListResult object itself.
     */
    public AppRoleAssignmentListResult withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}