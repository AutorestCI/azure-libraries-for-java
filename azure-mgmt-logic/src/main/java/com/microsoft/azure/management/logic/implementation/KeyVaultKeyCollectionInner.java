/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Collection of key vault keys.
 */
public class KeyVaultKeyCollectionInner {
    /**
     * The key vault keys.
     */
    @JsonProperty(value = "value")
    private List<ListKeyVaultKeysDefinitionInner> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<ListKeyVaultKeysDefinitionInner> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the KeyVaultKeyCollectionInner object itself.
     */
    public KeyVaultKeyCollectionInner withValue(List<ListKeyVaultKeysDefinitionInner> value) {
        this.value = value;
        return this;
    }

}