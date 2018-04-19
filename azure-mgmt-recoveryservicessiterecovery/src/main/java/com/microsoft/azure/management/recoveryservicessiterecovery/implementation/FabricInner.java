/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.implementation;

import com.microsoft.azure.management.recoveryservicessiterecovery.FabricProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Resource;

/**
 * Fabric definition.
 */
public class FabricInner extends Resource {
    /**
     * Fabric related data.
     */
    @JsonProperty(value = "properties")
    private FabricProperties properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public FabricProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the FabricInner object itself.
     */
    public FabricInner withProperties(FabricProperties properties) {
        this.properties = properties;
        return this;
    }

}