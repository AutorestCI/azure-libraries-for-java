/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import com.microsoft.azure.management.recoveryservicessiterecovery.implementation.StorageMappingInputPropertiesInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Storage mapping input.
 */
public class StorageClassificationMappingInput {
    /**
     * Storage mapping input properties.
     */
    @JsonProperty(value = "properties")
    private StorageMappingInputPropertiesInner properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public StorageMappingInputPropertiesInner properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the StorageClassificationMappingInput object itself.
     */
    public StorageClassificationMappingInput withProperties(StorageMappingInputPropertiesInner properties) {
        this.properties = properties;
        return this;
    }

}
