/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata about an Analysis Event.
 */
public class AnalysisEventMetadata {
    /**
     * The analysis delay.
     */
    @JsonProperty(value = "Delay")
    private Period delay;

    /**
     * The duration of analysis.
     */
    @JsonProperty(value = "Duration")
    private Period duration;

    /**
     * Get the delay value.
     *
     * @return the delay value
     */
    public Period delay() {
        return this.delay;
    }

    /**
     * Set the delay value.
     *
     * @param delay the delay value to set
     * @return the AnalysisEventMetadata object itself.
     */
    public AnalysisEventMetadata withDelay(Period delay) {
        this.delay = delay;
        return this;
    }

    /**
     * Get the duration value.
     *
     * @return the duration value
     */
    public Period duration() {
        return this.duration;
    }

    /**
     * Set the duration value.
     *
     * @param duration the duration value to set
     * @return the AnalysisEventMetadata object itself.
     */
    public AnalysisEventMetadata withDuration(Period duration) {
        this.duration = duration;
        return this;
    }

}
