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
 * The object that represents the operation.
 */
public class OperationDisplay {
    /**
     * Service provider: Microsoft IoT Central.
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /**
     * Resource Type: IoT Central.
     */
    @JsonProperty(value = "resource", access = JsonProperty.Access.WRITE_ONLY)
    private String resource;

    /**
     * Name of the operation.
     */
    @JsonProperty(value = "operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /**
     * Friendly description for the operation,.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get service provider: Microsoft IoT Central.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get resource Type: IoT Central.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Get name of the operation.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get friendly description for the operation,.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

}
