// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Gets or sets the application server configuration. */
@Fluent
public final class ApplicationServerConfiguration {
    /*
     * The subnet id.
     */
    @JsonProperty(value = "subnetId", required = true)
    private String subnetId;

    /*
     * Gets or sets the virtual machine configuration.
     */
    @JsonProperty(value = "virtualMachineConfiguration", required = true)
    private VirtualMachineConfiguration virtualMachineConfiguration;

    /*
     * The number of app server instances.
     */
    @JsonProperty(value = "instanceCount", required = true)
    private long instanceCount;

    /**
     * Get the subnetId property: The subnet id.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The subnet id.
     *
     * @param subnetId the subnetId value to set.
     * @return the ApplicationServerConfiguration object itself.
     */
    public ApplicationServerConfiguration withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the virtualMachineConfiguration property: Gets or sets the virtual machine configuration.
     *
     * @return the virtualMachineConfiguration value.
     */
    public VirtualMachineConfiguration virtualMachineConfiguration() {
        return this.virtualMachineConfiguration;
    }

    /**
     * Set the virtualMachineConfiguration property: Gets or sets the virtual machine configuration.
     *
     * @param virtualMachineConfiguration the virtualMachineConfiguration value to set.
     * @return the ApplicationServerConfiguration object itself.
     */
    public ApplicationServerConfiguration withVirtualMachineConfiguration(
        VirtualMachineConfiguration virtualMachineConfiguration) {
        this.virtualMachineConfiguration = virtualMachineConfiguration;
        return this;
    }

    /**
     * Get the instanceCount property: The number of app server instances.
     *
     * @return the instanceCount value.
     */
    public long instanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: The number of app server instances.
     *
     * @param instanceCount the instanceCount value to set.
     * @return the ApplicationServerConfiguration object itself.
     */
    public ApplicationServerConfiguration withInstanceCount(long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnetId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property subnetId in model ApplicationServerConfiguration"));
        }
        if (virtualMachineConfiguration() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property virtualMachineConfiguration in model"
                            + " ApplicationServerConfiguration"));
        } else {
            virtualMachineConfiguration().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationServerConfiguration.class);
}
