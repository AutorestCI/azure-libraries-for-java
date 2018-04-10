/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes an application parameter override to be applied when creating or
 * upgrading an application.
 */
public class ApplicationParameter {
    /**
     * The name of the parameter.
     */
    @JsonProperty(value = "Key", required = true)
    private String key;

    /**
     * The value of the parameter.
     */
    @JsonProperty(value = "Value", required = true)
    private String value;

    /**
     * Get the key value.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key value.
     *
     * @param key the key value to set
     * @return the ApplicationParameter object itself.
     */
    public ApplicationParameter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the ApplicationParameter object itself.
     */
    public ApplicationParameter withValue(String value) {
        this.value = value;
        return this;
    }

}
