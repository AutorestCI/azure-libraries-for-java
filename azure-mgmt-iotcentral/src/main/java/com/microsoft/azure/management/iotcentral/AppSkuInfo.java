/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the SKU of the IoT Central application.
 */
public class AppSkuInfo {
    /**
     * The name of the SKU. Possible values include: 'F1', 'S1'.
     */
    @JsonProperty(value = "name", required = true)
    private AppSku name;

    /**
     * Get the name of the SKU. Possible values include: 'F1', 'S1'.
     *
     * @return the name value
     */
    public AppSku name() {
        return this.name;
    }

    /**
     * Set the name of the SKU. Possible values include: 'F1', 'S1'.
     *
     * @param name the name value to set
     * @return the AppSkuInfo object itself.
     */
    public AppSkuInfo withName(AppSku name) {
        this.name = name;
        return this;
    }

}
