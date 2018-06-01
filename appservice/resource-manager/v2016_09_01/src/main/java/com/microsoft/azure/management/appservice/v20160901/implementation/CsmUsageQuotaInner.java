/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v20160901.LocalizableString;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Usage of the quota resource.
 */
public class CsmUsageQuotaInner {
    /**
     * Units of measurement for the quota resourse.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * Next reset time for the resource counter.
     */
    @JsonProperty(value = "nextResetTime")
    private DateTime nextResetTime;

    /**
     * The current value of the resource counter.
     */
    @JsonProperty(value = "currentValue")
    private Long currentValue;

    /**
     * The resource limit.
     */
    @JsonProperty(value = "limit")
    private Long limit;

    /**
     * Quota name.
     */
    @JsonProperty(value = "name")
    private LocalizableString name;

    /**
     * Get units of measurement for the quota resourse.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set units of measurement for the quota resourse.
     *
     * @param unit the unit value to set
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get next reset time for the resource counter.
     *
     * @return the nextResetTime value
     */
    public DateTime nextResetTime() {
        return this.nextResetTime;
    }

    /**
     * Set next reset time for the resource counter.
     *
     * @param nextResetTime the nextResetTime value to set
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withNextResetTime(DateTime nextResetTime) {
        this.nextResetTime = nextResetTime;
        return this;
    }

    /**
     * Get the current value of the resource counter.
     *
     * @return the currentValue value
     */
    public Long currentValue() {
        return this.currentValue;
    }

    /**
     * Set the current value of the resource counter.
     *
     * @param currentValue the currentValue value to set
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the resource limit.
     *
     * @return the limit value
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Set the resource limit.
     *
     * @param limit the limit value to set
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get quota name.
     *
     * @return the name value
     */
    public LocalizableString name() {
        return this.name;
    }

    /**
     * Set quota name.
     *
     * @param name the name value to set
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withName(LocalizableString name) {
        this.name = name;
        return this;
    }

}
