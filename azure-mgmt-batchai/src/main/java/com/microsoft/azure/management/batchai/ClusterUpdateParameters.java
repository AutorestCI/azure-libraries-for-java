/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Update operation.
 */
@JsonFlatten
public class ClusterUpdateParameters {
    /**
     * The user specified tags associated with the Cluster.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Desired scale for the cluster.
     */
    @JsonProperty(value = "properties.scaleSettings")
    private ScaleSettings scaleSettings;

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
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the scaleSettings value.
     *
     * @return the scaleSettings value
     */
    public ScaleSettings scaleSettings() {
        return this.scaleSettings;
    }

    /**
     * Set the scaleSettings value.
     *
     * @param scaleSettings the scaleSettings value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withScaleSettings(ScaleSettings scaleSettings) {
        this.scaleSettings = scaleSettings;
        return this;
    }

}
