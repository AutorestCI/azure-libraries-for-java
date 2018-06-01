/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import java.util.List;
import com.microsoft.azure.management.appservice.v20180201.ResourceMetricAvailability;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v20180201.ProxyOnlyResource;

/**
 * Metadata for the metrics.
 */
@JsonFlatten
public class ResourceMetricDefinitionInner extends ProxyOnlyResource {
    /**
     * Unit of the metric.
     */
    @JsonProperty(value = "properties.unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /**
     * Primary aggregation type.
     */
    @JsonProperty(value = "properties.primaryAggregationType", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryAggregationType;

    /**
     * List of time grains supported for the metric together with retention
     * period.
     */
    @JsonProperty(value = "properties.metricAvailabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceMetricAvailability> metricAvailabilities;

    /**
     * Resource URI.
     */
    @JsonProperty(value = "properties.resourceUri", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceUri;

    /**
     * Resource metric definition properties.
     */
    @JsonProperty(value = "properties.properties", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> properties;

    /**
     * Get unit of the metric.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get primary aggregation type.
     *
     * @return the primaryAggregationType value
     */
    public String primaryAggregationType() {
        return this.primaryAggregationType;
    }

    /**
     * Get list of time grains supported for the metric together with retention period.
     *
     * @return the metricAvailabilities value
     */
    public List<ResourceMetricAvailability> metricAvailabilities() {
        return this.metricAvailabilities;
    }

    /**
     * Get resource URI.
     *
     * @return the resourceUri value
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    /**
     * Get resource metric definition properties.
     *
     * @return the properties value
     */
    public Map<String, String> properties() {
        return this.properties;
    }

}
