/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_03_01_preview.implementation;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * The resource model definition for a ARM tracked top level resource.
 */
public class TrackedResourceInner extends ProxyResource {
    /**
     * The GEO location of the SignalR service. e.g. West US | East US | North
     * Central US | South Central US.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Tags of the service which is a list of key value pairs that describe the
     * resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the TrackedResourceInner object itself.
     */
    public TrackedResourceInner withLocation(String location) {
        this.location = location;
        return this;
    }

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
     * @return the TrackedResourceInner object itself.
     */
    public TrackedResourceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}