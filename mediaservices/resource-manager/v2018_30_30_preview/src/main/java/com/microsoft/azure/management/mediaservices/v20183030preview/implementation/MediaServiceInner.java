/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview.implementation;

import java.util.UUID;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v20183030preview.StorageAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A Media Services account.
 */
@JsonFlatten
public class MediaServiceInner extends TrackedResourceInner {
    /**
     * The Media Services account ID.
     */
    @JsonProperty(value = "properties.mediaServiceId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID mediaServiceId;

    /**
     * The storage accounts for this resource.
     */
    @JsonProperty(value = "properties.storageAccounts")
    private List<StorageAccount> storageAccounts;

    /**
     * Get the mediaServiceId value.
     *
     * @return the mediaServiceId value
     */
    public UUID mediaServiceId() {
        return this.mediaServiceId;
    }

    /**
     * Get the storageAccounts value.
     *
     * @return the storageAccounts value
     */
    public List<StorageAccount> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Set the storageAccounts value.
     *
     * @param storageAccounts the storageAccounts value to set
     * @return the MediaServiceInner object itself.
     */
    public MediaServiceInner withStorageAccounts(List<StorageAccount> storageAccounts) {
        this.storageAccounts = storageAccounts;
        return this;
    }

}
