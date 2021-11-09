// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.models.AnalyticalStorageConfiguration;
import com.azure.resourcemanager.cosmos.models.ApiProperties;
import com.azure.resourcemanager.cosmos.models.BackupPolicy;
import com.azure.resourcemanager.cosmos.models.Capability;
import com.azure.resourcemanager.cosmos.models.Capacity;
import com.azure.resourcemanager.cosmos.models.ConnectorOffer;
import com.azure.resourcemanager.cosmos.models.ConsistencyPolicy;
import com.azure.resourcemanager.cosmos.models.CorsPolicy;
import com.azure.resourcemanager.cosmos.models.CreateMode;
import com.azure.resourcemanager.cosmos.models.IpAddressOrRange;
import com.azure.resourcemanager.cosmos.models.Location;
import com.azure.resourcemanager.cosmos.models.NetworkAclBypass;
import com.azure.resourcemanager.cosmos.models.PublicNetworkAccess;
import com.azure.resourcemanager.cosmos.models.RestoreParameters;
import com.azure.resourcemanager.cosmos.models.VirtualNetworkRule;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties to create and update Azure Cosmos DB database accounts. */
@Fluent
public final class DatabaseAccountCreateUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseAccountCreateUpdateProperties.class);

    /*
     * The consistency policy for the Cosmos DB account.
     */
    @JsonProperty(value = "consistencyPolicy")
    private ConsistencyPolicy consistencyPolicy;

    /*
     * An array that contains the georeplication locations enabled for the
     * Cosmos DB account.
     */
    @JsonProperty(value = "locations", required = true)
    private List<Location> locations;

    /*
     * The offer type for the database
     */
    @JsonProperty(value = "databaseAccountOfferType", required = true)
    private String databaseAccountOfferType = "Standard";

    /*
     * List of IpRules.
     */
    @JsonProperty(value = "ipRules")
    private List<IpAddressOrRange> ipRules;

    /*
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     */
    @JsonProperty(value = "isVirtualNetworkFilterEnabled")
    private Boolean isVirtualNetworkFilterEnabled;

    /*
     * Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will
     * result in a new write region for the account and is chosen based on the
     * failover priorities configured for the account.
     */
    @JsonProperty(value = "enableAutomaticFailover")
    private Boolean enableAutomaticFailover;

    /*
     * List of Cosmos DB capabilities for the account
     */
    @JsonProperty(value = "capabilities")
    private List<Capability> capabilities;

    /*
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     */
    @JsonProperty(value = "virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /*
     * Enables the account to write in multiple locations
     */
    @JsonProperty(value = "enableMultipleWriteLocations")
    private Boolean enableMultipleWriteLocations;

    /*
     * Enables the cassandra connector on the Cosmos DB C* account
     */
    @JsonProperty(value = "enableCassandraConnector")
    private Boolean enableCassandraConnector;

    /*
     * The cassandra connector offer type for the Cosmos DB database C*
     * account.
     */
    @JsonProperty(value = "connectorOffer")
    private ConnectorOffer connectorOffer;

    /*
     * Disable write operations on metadata resources (databases, containers,
     * throughput) via account keys
     */
    @JsonProperty(value = "disableKeyBasedMetadataWriteAccess")
    private Boolean disableKeyBasedMetadataWriteAccess;

    /*
     * The URI of the key vault
     */
    @JsonProperty(value = "keyVaultKeyUri")
    private String keyVaultKeyUri;

    /*
     * The default identity for accessing key vault used in features like
     * customer managed keys. The default identity needs to be explicitly set
     * by the users. It can be "FirstPartyIdentity", "SystemAssignedIdentity"
     * and more.
     */
    @JsonProperty(value = "defaultIdentity")
    private String defaultIdentity;

    /*
     * Whether requests from Public Network are allowed
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Flag to indicate whether Free Tier is enabled.
     */
    @JsonProperty(value = "enableFreeTier")
    private Boolean enableFreeTier;

    /*
     * API specific properties. Currently, supported only for MongoDB API.
     */
    @JsonProperty(value = "apiProperties")
    private ApiProperties apiProperties;

    /*
     * Flag to indicate whether to enable storage analytics.
     */
    @JsonProperty(value = "enableAnalyticalStorage")
    private Boolean enableAnalyticalStorage;

    /*
     * Analytical storage specific properties.
     */
    @JsonProperty(value = "analyticalStorageConfiguration")
    private AnalyticalStorageConfiguration analyticalStorageConfiguration;

    /*
     * Enum to indicate the mode of account creation.
     */
    @JsonProperty(value = "createMode")
    private CreateMode createMode;

    /*
     * The object representing the policy for taking backups on an account.
     */
    @JsonProperty(value = "backupPolicy")
    private BackupPolicy backupPolicy;

    /*
     * The CORS policy for the Cosmos DB database account.
     */
    @JsonProperty(value = "cors")
    private List<CorsPolicy> cors;

    /*
     * Indicates what services are allowed to bypass firewall checks.
     */
    @JsonProperty(value = "networkAclBypass")
    private NetworkAclBypass networkAclBypass;

    /*
     * An array that contains the Resource Ids for Network Acl Bypass for the
     * Cosmos DB account.
     */
    @JsonProperty(value = "networkAclBypassResourceIds")
    private List<String> networkAclBypassResourceIds;

    /*
     * Opt-out of local authentication and ensure only MSI and AAD can be used
     * exclusively for authentication.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * Parameters to indicate the information about the restore.
     */
    @JsonProperty(value = "restoreParameters")
    private RestoreParameters restoreParameters;

    /*
     * The object that represents all properties related to capacity
     * enforcement on an account.
     */
    @JsonProperty(value = "capacity")
    private Capacity capacity;

    /** Creates an instance of DatabaseAccountCreateUpdateProperties class. */
    public DatabaseAccountCreateUpdateProperties() {
        databaseAccountOfferType = "Standard";
    }

    /**
     * Get the consistencyPolicy property: The consistency policy for the Cosmos DB account.
     *
     * @return the consistencyPolicy value.
     */
    public ConsistencyPolicy consistencyPolicy() {
        return this.consistencyPolicy;
    }

    /**
     * Set the consistencyPolicy property: The consistency policy for the Cosmos DB account.
     *
     * @param consistencyPolicy the consistencyPolicy value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withConsistencyPolicy(ConsistencyPolicy consistencyPolicy) {
        this.consistencyPolicy = consistencyPolicy;
        return this;
    }

    /**
     * Get the locations property: An array that contains the georeplication locations enabled for the Cosmos DB
     * account.
     *
     * @return the locations value.
     */
    public List<Location> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: An array that contains the georeplication locations enabled for the Cosmos DB
     * account.
     *
     * @param locations the locations value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the databaseAccountOfferType property: The offer type for the database.
     *
     * @return the databaseAccountOfferType value.
     */
    public String databaseAccountOfferType() {
        return this.databaseAccountOfferType;
    }

    /**
     * Set the databaseAccountOfferType property: The offer type for the database.
     *
     * @param databaseAccountOfferType the databaseAccountOfferType value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withDatabaseAccountOfferType(String databaseAccountOfferType) {
        this.databaseAccountOfferType = databaseAccountOfferType;
        return this;
    }

    /**
     * Get the ipRules property: List of IpRules.
     *
     * @return the ipRules value.
     */
    public List<IpAddressOrRange> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: List of IpRules.
     *
     * @param ipRules the ipRules value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withIpRules(List<IpAddressOrRange> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     *
     * @return the isVirtualNetworkFilterEnabled value.
     */
    public Boolean isVirtualNetworkFilterEnabled() {
        return this.isVirtualNetworkFilterEnabled;
    }

    /**
     * Set the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     *
     * @param isVirtualNetworkFilterEnabled the isVirtualNetworkFilterEnabled value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withIsVirtualNetworkFilterEnabled(
        Boolean isVirtualNetworkFilterEnabled) {
        this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
        return this;
    }

    /**
     * Get the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     *
     * @return the enableAutomaticFailover value.
     */
    public Boolean enableAutomaticFailover() {
        return this.enableAutomaticFailover;
    }

    /**
     * Set the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     *
     * @param enableAutomaticFailover the enableAutomaticFailover value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withEnableAutomaticFailover(Boolean enableAutomaticFailover) {
        this.enableAutomaticFailover = enableAutomaticFailover;
        return this;
    }

    /**
     * Get the capabilities property: List of Cosmos DB capabilities for the account.
     *
     * @return the capabilities value.
     */
    public List<Capability> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: List of Cosmos DB capabilities for the account.
     *
     * @param capabilities the capabilities value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withCapabilities(List<Capability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     *
     * @return the enableMultipleWriteLocations value.
     */
    public Boolean enableMultipleWriteLocations() {
        return this.enableMultipleWriteLocations;
    }

    /**
     * Set the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     *
     * @param enableMultipleWriteLocations the enableMultipleWriteLocations value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withEnableMultipleWriteLocations(
        Boolean enableMultipleWriteLocations) {
        this.enableMultipleWriteLocations = enableMultipleWriteLocations;
        return this;
    }

    /**
     * Get the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     *
     * @return the enableCassandraConnector value.
     */
    public Boolean enableCassandraConnector() {
        return this.enableCassandraConnector;
    }

    /**
     * Set the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     *
     * @param enableCassandraConnector the enableCassandraConnector value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withEnableCassandraConnector(Boolean enableCassandraConnector) {
        this.enableCassandraConnector = enableCassandraConnector;
        return this;
    }

    /**
     * Get the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     *
     * @return the connectorOffer value.
     */
    public ConnectorOffer connectorOffer() {
        return this.connectorOffer;
    }

    /**
     * Set the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     *
     * @param connectorOffer the connectorOffer value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withConnectorOffer(ConnectorOffer connectorOffer) {
        this.connectorOffer = connectorOffer;
        return this;
    }

    /**
     * Get the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     *
     * @return the disableKeyBasedMetadataWriteAccess value.
     */
    public Boolean disableKeyBasedMetadataWriteAccess() {
        return this.disableKeyBasedMetadataWriteAccess;
    }

    /**
     * Set the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     *
     * @param disableKeyBasedMetadataWriteAccess the disableKeyBasedMetadataWriteAccess value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withDisableKeyBasedMetadataWriteAccess(
        Boolean disableKeyBasedMetadataWriteAccess) {
        this.disableKeyBasedMetadataWriteAccess = disableKeyBasedMetadataWriteAccess;
        return this;
    }

    /**
     * Get the keyVaultKeyUri property: The URI of the key vault.
     *
     * @return the keyVaultKeyUri value.
     */
    public String keyVaultKeyUri() {
        return this.keyVaultKeyUri;
    }

    /**
     * Set the keyVaultKeyUri property: The URI of the key vault.
     *
     * @param keyVaultKeyUri the keyVaultKeyUri value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withKeyVaultKeyUri(String keyVaultKeyUri) {
        this.keyVaultKeyUri = keyVaultKeyUri;
        return this;
    }

    /**
     * Get the defaultIdentity property: The default identity for accessing key vault used in features like customer
     * managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity",
     * "SystemAssignedIdentity" and more.
     *
     * @return the defaultIdentity value.
     */
    public String defaultIdentity() {
        return this.defaultIdentity;
    }

    /**
     * Set the defaultIdentity property: The default identity for accessing key vault used in features like customer
     * managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity",
     * "SystemAssignedIdentity" and more.
     *
     * @param defaultIdentity the defaultIdentity value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withDefaultIdentity(String defaultIdentity) {
        this.defaultIdentity = defaultIdentity;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the enableFreeTier property: Flag to indicate whether Free Tier is enabled.
     *
     * @return the enableFreeTier value.
     */
    public Boolean enableFreeTier() {
        return this.enableFreeTier;
    }

    /**
     * Set the enableFreeTier property: Flag to indicate whether Free Tier is enabled.
     *
     * @param enableFreeTier the enableFreeTier value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withEnableFreeTier(Boolean enableFreeTier) {
        this.enableFreeTier = enableFreeTier;
        return this;
    }

    /**
     * Get the apiProperties property: API specific properties. Currently, supported only for MongoDB API.
     *
     * @return the apiProperties value.
     */
    public ApiProperties apiProperties() {
        return this.apiProperties;
    }

    /**
     * Set the apiProperties property: API specific properties. Currently, supported only for MongoDB API.
     *
     * @param apiProperties the apiProperties value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withApiProperties(ApiProperties apiProperties) {
        this.apiProperties = apiProperties;
        return this;
    }

    /**
     * Get the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics.
     *
     * @return the enableAnalyticalStorage value.
     */
    public Boolean enableAnalyticalStorage() {
        return this.enableAnalyticalStorage;
    }

    /**
     * Set the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics.
     *
     * @param enableAnalyticalStorage the enableAnalyticalStorage value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withEnableAnalyticalStorage(Boolean enableAnalyticalStorage) {
        this.enableAnalyticalStorage = enableAnalyticalStorage;
        return this;
    }

    /**
     * Get the analyticalStorageConfiguration property: Analytical storage specific properties.
     *
     * @return the analyticalStorageConfiguration value.
     */
    public AnalyticalStorageConfiguration analyticalStorageConfiguration() {
        return this.analyticalStorageConfiguration;
    }

    /**
     * Set the analyticalStorageConfiguration property: Analytical storage specific properties.
     *
     * @param analyticalStorageConfiguration the analyticalStorageConfiguration value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withAnalyticalStorageConfiguration(
        AnalyticalStorageConfiguration analyticalStorageConfiguration) {
        this.analyticalStorageConfiguration = analyticalStorageConfiguration;
        return this;
    }

    /**
     * Get the createMode property: Enum to indicate the mode of account creation.
     *
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: Enum to indicate the mode of account creation.
     *
     * @param createMode the createMode value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the backupPolicy property: The object representing the policy for taking backups on an account.
     *
     * @return the backupPolicy value.
     */
    public BackupPolicy backupPolicy() {
        return this.backupPolicy;
    }

    /**
     * Set the backupPolicy property: The object representing the policy for taking backups on an account.
     *
     * @param backupPolicy the backupPolicy value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withBackupPolicy(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    /**
     * Get the cors property: The CORS policy for the Cosmos DB database account.
     *
     * @return the cors value.
     */
    public List<CorsPolicy> cors() {
        return this.cors;
    }

    /**
     * Set the cors property: The CORS policy for the Cosmos DB database account.
     *
     * @param cors the cors value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withCors(List<CorsPolicy> cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the networkAclBypass property: Indicates what services are allowed to bypass firewall checks.
     *
     * @return the networkAclBypass value.
     */
    public NetworkAclBypass networkAclBypass() {
        return this.networkAclBypass;
    }

    /**
     * Set the networkAclBypass property: Indicates what services are allowed to bypass firewall checks.
     *
     * @param networkAclBypass the networkAclBypass value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withNetworkAclBypass(NetworkAclBypass networkAclBypass) {
        this.networkAclBypass = networkAclBypass;
        return this;
    }

    /**
     * Get the networkAclBypassResourceIds property: An array that contains the Resource Ids for Network Acl Bypass for
     * the Cosmos DB account.
     *
     * @return the networkAclBypassResourceIds value.
     */
    public List<String> networkAclBypassResourceIds() {
        return this.networkAclBypassResourceIds;
    }

    /**
     * Set the networkAclBypassResourceIds property: An array that contains the Resource Ids for Network Acl Bypass for
     * the Cosmos DB account.
     *
     * @param networkAclBypassResourceIds the networkAclBypassResourceIds value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withNetworkAclBypassResourceIds(
        List<String> networkAclBypassResourceIds) {
        this.networkAclBypassResourceIds = networkAclBypassResourceIds;
        return this;
    }

    /**
     * Get the disableLocalAuth property: Opt-out of local authentication and ensure only MSI and AAD can be used
     * exclusively for authentication.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: Opt-out of local authentication and ensure only MSI and AAD can be used
     * exclusively for authentication.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the restoreParameters property: Parameters to indicate the information about the restore.
     *
     * @return the restoreParameters value.
     */
    public RestoreParameters restoreParameters() {
        return this.restoreParameters;
    }

    /**
     * Set the restoreParameters property: Parameters to indicate the information about the restore.
     *
     * @param restoreParameters the restoreParameters value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withRestoreParameters(RestoreParameters restoreParameters) {
        this.restoreParameters = restoreParameters;
        return this;
    }

    /**
     * Get the capacity property: The object that represents all properties related to capacity enforcement on an
     * account.
     *
     * @return the capacity value.
     */
    public Capacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The object that represents all properties related to capacity enforcement on an
     * account.
     *
     * @param capacity the capacity value to set.
     * @return the DatabaseAccountCreateUpdateProperties object itself.
     */
    public DatabaseAccountCreateUpdateProperties withCapacity(Capacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (consistencyPolicy() != null) {
            consistencyPolicy().validate();
        }
        if (locations() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property locations in model DatabaseAccountCreateUpdateProperties"));
        } else {
            locations().forEach(e -> e.validate());
        }
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
        if (virtualNetworkRules() != null) {
            virtualNetworkRules().forEach(e -> e.validate());
        }
        if (apiProperties() != null) {
            apiProperties().validate();
        }
        if (analyticalStorageConfiguration() != null) {
            analyticalStorageConfiguration().validate();
        }
        if (backupPolicy() != null) {
            backupPolicy().validate();
        }
        if (cors() != null) {
            cors().forEach(e -> e.validate());
        }
        if (restoreParameters() != null) {
            restoreParameters().validate();
        }
        if (capacity() != null) {
            capacity().validate();
        }
    }
}