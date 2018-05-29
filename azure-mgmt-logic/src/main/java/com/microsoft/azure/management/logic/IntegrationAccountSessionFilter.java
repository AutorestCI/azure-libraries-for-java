/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The integration account session filter.
 */
public class IntegrationAccountSessionFilter {
    /**
     * The changed time of integration account sessions.
     */
    @JsonProperty(value = "changedTime", required = true)
    private DateTime changedTime;

    /**
     * Get the changed time of integration account sessions.
     *
     * @return the changedTime value
     */
    public DateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Set the changed time of integration account sessions.
     *
     * @param changedTime the changedTime value to set
     * @return the IntegrationAccountSessionFilter object itself.
     */
    public IntegrationAccountSessionFilter withChangedTime(DateTime changedTime) {
        this.changedTime = changedTime;
        return this;
    }

}
