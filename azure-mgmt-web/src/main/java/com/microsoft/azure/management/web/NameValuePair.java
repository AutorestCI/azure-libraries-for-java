/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Name value pair.
 */
public class NameValuePair {
    /**
     * Pair name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Pair value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get pair name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set pair name.
     *
     * @param name the name value to set
     * @return the NameValuePair object itself.
     */
    public NameValuePair withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get pair value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set pair value.
     *
     * @param value the value value to set
     * @return the NameValuePair object itself.
     */
    public NameValuePair withValue(String value) {
        this.value = value;
        return this;
    }

}
