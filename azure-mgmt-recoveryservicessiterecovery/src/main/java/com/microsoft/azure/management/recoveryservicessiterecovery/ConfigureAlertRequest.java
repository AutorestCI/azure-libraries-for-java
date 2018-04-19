/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import com.microsoft.azure.management.recoveryservicessiterecovery.implementation.ConfigureAlertRequestPropertiesInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request to configure alerts for the system.
 */
public class ConfigureAlertRequest {
    /**
     * The properties of a configure alert request.
     */
    @JsonProperty(value = "properties")
    private ConfigureAlertRequestPropertiesInner properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public ConfigureAlertRequestPropertiesInner properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the ConfigureAlertRequest object itself.
     */
    public ConfigureAlertRequest withProperties(ConfigureAlertRequestPropertiesInner properties) {
        this.properties = properties;
        return this;
    }

}