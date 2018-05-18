/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_03_01.implementation;

import com.microsoft.azure.management.batchai.v20180301.UsageName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes Batch AI Resource Usage.
 */
public class UsageInner {
    /**
     * An enum describing the unit of usage measurement.
     */
    @JsonProperty(value = "unit", required = true)
    private String unit;

    /**
     * The current usage of the resource.
     */
    @JsonProperty(value = "currentValue", required = true)
    private int currentValue;

    /**
     * The maximum permitted usage of the resource.
     */
    @JsonProperty(value = "limit", required = true)
    private long limit;

    /**
     * The name of the type of usage.
     */
    @JsonProperty(value = "name", required = true)
    private UsageName name;

    /**
     * Creates an instance of UsageInner class.
     */
    public UsageInner() {
        unit = "Count";
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit value.
     *
     * @param unit the unit value to set
     * @return the UsageInner object itself.
     */
    public UsageInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the currentValue value.
     *
     * @return the currentValue value
     */
    public int currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue value.
     *
     * @param currentValue the currentValue value to set
     * @return the UsageInner object itself.
     */
    public UsageInner withCurrentValue(int currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit value.
     *
     * @return the limit value
     */
    public long limit() {
        return this.limit;
    }

    /**
     * Set the limit value.
     *
     * @param limit the limit value to set
     * @return the UsageInner object itself.
     */
    public UsageInner withLimit(long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public UsageName name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the UsageInner object itself.
     */
    public UsageInner withName(UsageName name) {
        this.name = name;
        return this;
    }

}
