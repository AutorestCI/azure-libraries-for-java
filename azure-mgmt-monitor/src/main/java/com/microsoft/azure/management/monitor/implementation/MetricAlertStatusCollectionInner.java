/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.implementation;

import java.util.List;
import com.microsoft.azure.management.monitor.MetricAlertStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a collection of alert rule resources.
 */
public class MetricAlertStatusCollectionInner {
    /**
     * the values for the alert rule resources.
     */
    @JsonProperty(value = "value")
    private List<MetricAlertStatus> value;

    /**
     * Get the values for the alert rule resources.
     *
     * @return the value value
     */
    public List<MetricAlertStatus> value() {
        return this.value;
    }

    /**
     * Set the values for the alert rule resources.
     *
     * @param value the value value to set
     * @return the MetricAlertStatusCollectionInner object itself.
     */
    public MetricAlertStatusCollectionInner withValue(List<MetricAlertStatus> value) {
        this.value = value;
        return this;
    }

}
