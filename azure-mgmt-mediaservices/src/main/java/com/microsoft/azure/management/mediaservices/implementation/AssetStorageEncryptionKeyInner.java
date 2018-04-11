/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Asset Storage encryption key.
 */
public class AssetStorageEncryptionKeyInner {
    /**
     * The Asset storage encryption key.
     */
    @JsonProperty(value = "storageEncryptionKey")
    private String storageEncryptionKey;

    /**
     * Get the storageEncryptionKey value.
     *
     * @return the storageEncryptionKey value
     */
    public String storageEncryptionKey() {
        return this.storageEncryptionKey;
    }

    /**
     * Set the storageEncryptionKey value.
     *
     * @param storageEncryptionKey the storageEncryptionKey value to set
     * @return the AssetStorageEncryptionKeyInner object itself.
     */
    public AssetStorageEncryptionKeyInner withStorageEncryptionKey(String storageEncryptionKey) {
        this.storageEncryptionKey = storageEncryptionKey;
        return this;
    }

}
