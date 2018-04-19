/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import com.microsoft.azure.management.recoveryservicessiterecovery.implementation.DisableProtectionInputPropertiesInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Disable protection input.
 */
public class DisableProtectionInput {
    /**
     * Disable protection input properties.
     */
    @JsonProperty(value = "properties")
    private DisableProtectionInputPropertiesInner properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public DisableProtectionInputPropertiesInner properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the DisableProtectionInput object itself.
     */
    public DisableProtectionInput withProperties(DisableProtectionInputPropertiesInner properties) {
        this.properties = properties;
        return this;
    }

}
