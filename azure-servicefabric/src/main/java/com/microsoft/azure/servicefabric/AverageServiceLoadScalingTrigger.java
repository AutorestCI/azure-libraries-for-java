/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a scaling policy related to an average load of a metric/resource
 * of a service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("AverageServiceLoad")
public class AverageServiceLoadScalingTrigger extends ScalingTriggerDescription {
    /**
     * The name of the metric for which usage should be tracked.
     */
    @JsonProperty(value = "MetricName", required = true)
    private String metricName;

    /**
     * The lower limit of the load below which a scale in operation should be
     * performed.
     */
    @JsonProperty(value = "LowerLoadThreshold", required = true)
    private String lowerLoadThreshold;

    /**
     * The upper limit of the load beyond which a scale out operation should be
     * performed.
     */
    @JsonProperty(value = "UpperLoadThreshold", required = true)
    private String upperLoadThreshold;

    /**
     * The period in seconds on which a decision is made whether to scale or
     * not.
     */
    @JsonProperty(value = "ScaleIntervalInSeconds", required = true)
    private long scaleIntervalInSeconds;

    /**
     * Get the metricName value.
     *
     * @return the metricName value
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Set the metricName value.
     *
     * @param metricName the metricName value to set
     * @return the AverageServiceLoadScalingTrigger object itself.
     */
    public AverageServiceLoadScalingTrigger withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get the lowerLoadThreshold value.
     *
     * @return the lowerLoadThreshold value
     */
    public String lowerLoadThreshold() {
        return this.lowerLoadThreshold;
    }

    /**
     * Set the lowerLoadThreshold value.
     *
     * @param lowerLoadThreshold the lowerLoadThreshold value to set
     * @return the AverageServiceLoadScalingTrigger object itself.
     */
    public AverageServiceLoadScalingTrigger withLowerLoadThreshold(String lowerLoadThreshold) {
        this.lowerLoadThreshold = lowerLoadThreshold;
        return this;
    }

    /**
     * Get the upperLoadThreshold value.
     *
     * @return the upperLoadThreshold value
     */
    public String upperLoadThreshold() {
        return this.upperLoadThreshold;
    }

    /**
     * Set the upperLoadThreshold value.
     *
     * @param upperLoadThreshold the upperLoadThreshold value to set
     * @return the AverageServiceLoadScalingTrigger object itself.
     */
    public AverageServiceLoadScalingTrigger withUpperLoadThreshold(String upperLoadThreshold) {
        this.upperLoadThreshold = upperLoadThreshold;
        return this;
    }

    /**
     * Get the scaleIntervalInSeconds value.
     *
     * @return the scaleIntervalInSeconds value
     */
    public long scaleIntervalInSeconds() {
        return this.scaleIntervalInSeconds;
    }

    /**
     * Set the scaleIntervalInSeconds value.
     *
     * @param scaleIntervalInSeconds the scaleIntervalInSeconds value to set
     * @return the AverageServiceLoadScalingTrigger object itself.
     */
    public AverageServiceLoadScalingTrigger withScaleIntervalInSeconds(long scaleIntervalInSeconds) {
        this.scaleIntervalInSeconds = scaleIntervalInSeconds;
        return this;
    }

}
