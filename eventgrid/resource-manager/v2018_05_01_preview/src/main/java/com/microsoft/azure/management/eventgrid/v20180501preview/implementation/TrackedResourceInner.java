/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_05_01_preview.implementation;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Definition of a Tracked Resource.
 */
public class TrackedResourceInner extends ProxyResource {
    /**
     * Location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Tags of the resource.
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
