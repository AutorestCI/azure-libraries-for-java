/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SKU of rule.
 */
public class Sku1 {
    /**
     * The name of the SKU (L1, L2, L3). Possible values include: 'L1', 'L2',
     * 'L3'.
     */
    @JsonProperty(value = "name")
    private Sku name;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public Sku name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Sku1 object itself.
     */
    public Sku1 withName(Sku name) {
        this.name = name;
        return this;
    }

}