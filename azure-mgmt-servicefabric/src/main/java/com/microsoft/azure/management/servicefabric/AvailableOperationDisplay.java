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
 * Operation supported by Service Fabric resource provider.
 */
public class AvailableOperationDisplay {
    /**
     * The name of the provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * The resource on which the operation is performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * The operation that can be performed.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Operation description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the provider value.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider value.
     *
     * @param provider the provider value to set
     * @return the AvailableOperationDisplay object itself.
     */
    public AvailableOperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource value.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource value.
     *
     * @param resource the resource value to set
     * @return the AvailableOperationDisplay object itself.
     */
    public AvailableOperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation value.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation value.
     *
     * @param operation the operation value to set
     * @return the AvailableOperationDisplay object itself.
     */
    public AvailableOperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the AvailableOperationDisplay object itself.
     */
    public AvailableOperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

}
