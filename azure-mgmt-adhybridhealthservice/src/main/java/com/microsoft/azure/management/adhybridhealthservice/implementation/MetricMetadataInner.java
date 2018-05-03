/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import java.util.List;
import com.microsoft.azure.management.adhybridhealthservice.MetricGroup;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The metric meta data.
 */
public class MetricMetadataInner {
    /**
     * The name of the class which retrieve and process the metric.
     */
    @JsonProperty(value = "metricsProcessorClassName")
    private String metricsProcessorClassName;

    /**
     * The metric name.
     */
    @JsonProperty(value = "metricName")
    private String metricName;

    /**
     * The groupings for the metrics.
     */
    @JsonProperty(value = "groupings")
    private List<MetricGroup> groupings;

    /**
     * The display name for the metric.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Indicates if the metrics is a rate,value, percent or duration type.
     */
    @JsonProperty(value = "valueKind")
    private String valueKind;

    /**
     * The minimun value.
     */
    @JsonProperty(value = "minValue")
    private Integer minValue;

    /**
     * The maximum value.
     */
    @JsonProperty(value = "maxValue")
    private Integer maxValue;

    /**
     * Indicates whether the dashboard to represent the metric is a line,
     * bar,pie, area or donut chart.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Indicates if the metric is a default metric or not.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /**
     * Indicates if the metric is a performance counter metric or not.
     */
    @JsonProperty(value = "isPerfCounter")
    private Boolean isPerfCounter;

    /**
     * Indicates if the metric is visible to DevOps or not.
     */
    @JsonProperty(value = "isDevOps")
    private Boolean isDevOps;

    /**
     * Get the metricsProcessorClassName value.
     *
     * @return the metricsProcessorClassName value
     */
    public String metricsProcessorClassName() {
        return this.metricsProcessorClassName;
    }

    /**
     * Set the metricsProcessorClassName value.
     *
     * @param metricsProcessorClassName the metricsProcessorClassName value to set
     * @return the MetricMetadataInner object itself.
     */
    public MetricMetadataInner withMetricsProcessorClassName(String metricsProcessorClassName) {
        this.metricsProcessorClassName = metricsProcessorClassName;
        return this;
    }

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
     * @return the MetricMetadataInner object itself.
     */
    public MetricMetadataInner withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get the groupings value.
     *
     * @return the groupings value
     */
    public List<MetricGroup> groupings() {
        return this.groupings;
    }

    /**
     * Set the groupings value.
     *
     * @param groupings the groupings value to set
     * @return the MetricMetadataInner object itself.
     */
    public MetricMetadataInner withGroupings(List<MetricGroup> groupings) {
        this.groupings = groupings;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the MetricMetadataInner object itself.
     */
    public MetricMetadataInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the valueKind value.
     *
     * @return the valueKind value
     */
    public String valueKind() {
        return this.valueKind;
    }

    /**
     * Set the valueKind value.
     *
     * @param valueKind the valueKind value to set
     * @return the MetricMetadataInner object itself.
     */
    public MetricMetadataInner withValueKind(String valueKind) {
        this.valueKind = valueKind;
        return this;
    }

    /**
     * Get the minValue value.
     *
     * @return the minValue value
     */
    public Integer minValue() {
        return this.minValue;
    }

    /**
     * Set the minValue value.
     *
     * @param minValue the minValue value to set
     * @return the MetricMetadataInner object itself.
     */
    public MetricMetadataInner withMinValue(Integer minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * Get the maxValue value.
     *
     * @return the maxValue value
     */
    public Integer maxValue() {
        return this.maxValue;
    }

    /**
     * Set the maxValue value.
     *
     * @param maxValue the maxValue value to set
     * @return the MetricMetadataInner object itself.
     */
    public MetricMetadataInner withMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * Get the kind value.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind value.
     *
     * @param kind the kind value to set
     * @return the MetricMetadataInner object itself.
     */
    public MetricMetadataInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the isDefault value.
     *
     * @return the isDefault value
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set the isDefault value.
     *
     * @param isDefault the isDefault value to set
     * @return the MetricMetadataInner object itself.
     */
    public MetricMetadataInner withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get the isPerfCounter value.
     *
     * @return the isPerfCounter value
     */
    public Boolean isPerfCounter() {
        return this.isPerfCounter;
    }

    /**
     * Set the isPerfCounter value.
     *
     * @param isPerfCounter the isPerfCounter value to set
     * @return the MetricMetadataInner object itself.
     */
    public MetricMetadataInner withIsPerfCounter(Boolean isPerfCounter) {
        this.isPerfCounter = isPerfCounter;
        return this;
    }

    /**
     * Get the isDevOps value.
     *
     * @return the isDevOps value
     */
    public Boolean isDevOps() {
        return this.isDevOps;
    }

    /**
     * Set the isDevOps value.
     *
     * @param isDevOps the isDevOps value to set
     * @return the MetricMetadataInner object itself.
     */
    public MetricMetadataInner withIsDevOps(Boolean isDevOps) {
        this.isDevOps = isDevOps;
        return this;
    }

}
