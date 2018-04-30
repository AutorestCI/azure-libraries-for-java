/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.implementation;

import com.microsoft.azure.management.logic.TrackEventsOperationOptions;
import java.util.List;
import com.microsoft.azure.management.logic.TrackingEvent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TrackingEventsDefinitionInner model.
 */
public class TrackingEventsDefinitionInner {
    /**
     * The sourceType property.
     */
    @JsonProperty(value = "sourceType", required = true)
    private String sourceType;

    /**
     * Possible values include: 'None', 'DisableSourceInfoEnrich'.
     */
    @JsonProperty(value = "trackEventsOptions")
    private TrackEventsOperationOptions trackEventsOptions;

    /**
     * The events property.
     */
    @JsonProperty(value = "events", required = true)
    private List<TrackingEvent> events;

    /**
     * Get the sourceType value.
     *
     * @return the sourceType value
     */
    public String sourceType() {
        return this.sourceType;
    }

    /**
     * Set the sourceType value.
     *
     * @param sourceType the sourceType value to set
     * @return the TrackingEventsDefinitionInner object itself.
     */
    public TrackingEventsDefinitionInner withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get the trackEventsOptions value.
     *
     * @return the trackEventsOptions value
     */
    public TrackEventsOperationOptions trackEventsOptions() {
        return this.trackEventsOptions;
    }

    /**
     * Set the trackEventsOptions value.
     *
     * @param trackEventsOptions the trackEventsOptions value to set
     * @return the TrackingEventsDefinitionInner object itself.
     */
    public TrackingEventsDefinitionInner withTrackEventsOptions(TrackEventsOperationOptions trackEventsOptions) {
        this.trackEventsOptions = trackEventsOptions;
        return this;
    }

    /**
     * Get the events value.
     *
     * @return the events value
     */
    public List<TrackingEvent> events() {
        return this.events;
    }

    /**
     * Set the events value.
     *
     * @param events the events value to set
     * @return the TrackingEventsDefinitionInner object itself.
     */
    public TrackingEventsDefinitionInner withEvents(List<TrackingEvent> events) {
        this.events = events;
        return this;
    }

}