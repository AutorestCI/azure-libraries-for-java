/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Execution policy for an activity.
 */
public class RetryPolicy {
    /**
     * Maximum ordinary retry attempts. Default is 0. Type: integer (or
     * Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "count")
    private Object count;

    /**
     * Interval between retries in seconds. Default is 30.
     */
    @JsonProperty(value = "intervalInSeconds")
    private Integer intervalInSeconds;

    /**
     * Get the count value.
     *
     * @return the count value
     */
    public Object count() {
        return this.count;
    }

    /**
     * Set the count value.
     *
     * @param count the count value to set
     * @return the RetryPolicy object itself.
     */
    public RetryPolicy withCount(Object count) {
        this.count = count;
        return this;
    }

    /**
     * Get the intervalInSeconds value.
     *
     * @return the intervalInSeconds value
     */
    public Integer intervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Set the intervalInSeconds value.
     *
     * @param intervalInSeconds the intervalInSeconds value to set
     * @return the RetryPolicy object itself.
     */
    public RetryPolicy withIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

}
