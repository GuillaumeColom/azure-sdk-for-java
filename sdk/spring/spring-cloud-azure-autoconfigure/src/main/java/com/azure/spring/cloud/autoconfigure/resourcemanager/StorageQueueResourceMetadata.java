// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.resourcemanager;

import com.azure.spring.cloud.autoconfigure.storage.queue.properties.AzureStorageQueueProperties;
import com.azure.spring.core.properties.resource.AzureResourceMetadata;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Azure Storage Queue resource metadata
 */
@ConfigurationProperties(prefix = AzureStorageQueueProperties.PREFIX + ".resource")
public class StorageQueueResourceMetadata extends AzureResourceMetadata {

    @Value("${spring.cloud.azure.storage.queue.accountName:}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}