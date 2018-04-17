/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.implementation;

import java.util.Map;
import com.microsoft.azure.management.signalr.ResourceSku;
import com.microsoft.azure.management.signalr.SignalRCreateOrUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for SignalR service update operation.
 */
public class SignalRUpdateParametersInner {
    /**
     * A list of key value pairs that describe the resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The billing information of the resource.(e.g. basic vs. standard).
     */
    @JsonProperty(value = "sku")
    private ResourceSku sku;

    /**
     * Settings used to provision or configure the resource.
     */
    @JsonProperty(value = "properties")
    private SignalRCreateOrUpdateProperties properties;

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the SignalRUpdateParametersInner object itself.
     */
    public SignalRUpdateParametersInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public ResourceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the SignalRUpdateParametersInner object itself.
     */
    public SignalRUpdateParametersInner withSku(ResourceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public SignalRCreateOrUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the SignalRUpdateParametersInner object itself.
     */
    public SignalRUpdateParametersInner withProperties(SignalRCreateOrUpdateProperties properties) {
        this.properties = properties;
        return this;
    }

}
