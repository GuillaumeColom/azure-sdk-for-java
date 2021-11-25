// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Virtual Network gateway contract. This is used to give the Virtual Network gateway access to the VPN package. */
@Fluent
public final class VnetGatewayInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VnetGatewayInner.class);

    /*
     * VnetGateway resource specific properties
     */
    @JsonProperty(value = "properties")
    private VnetGatewayProperties innerProperties;

    /**
     * Get the innerProperties property: VnetGateway resource specific properties.
     *
     * @return the innerProperties value.
     */
    private VnetGatewayProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public VnetGatewayInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the vnetName property: The Virtual Network name.
     *
     * @return the vnetName value.
     */
    public String vnetName() {
        return this.innerProperties() == null ? null : this.innerProperties().vnetName();
    }

    /**
     * Set the vnetName property: The Virtual Network name.
     *
     * @param vnetName the vnetName value to set.
     * @return the VnetGatewayInner object itself.
     */
    public VnetGatewayInner withVnetName(String vnetName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetGatewayProperties();
        }
        this.innerProperties().withVnetName(vnetName);
        return this;
    }

    /**
     * Get the vpnPackageUri property: The URI where the VPN package can be downloaded.
     *
     * @return the vpnPackageUri value.
     */
    public String vpnPackageUri() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnPackageUri();
    }

    /**
     * Set the vpnPackageUri property: The URI where the VPN package can be downloaded.
     *
     * @param vpnPackageUri the vpnPackageUri value to set.
     * @return the VnetGatewayInner object itself.
     */
    public VnetGatewayInner withVpnPackageUri(String vpnPackageUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetGatewayProperties();
        }
        this.innerProperties().withVpnPackageUri(vpnPackageUri);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}