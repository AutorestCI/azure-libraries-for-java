/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A container group or container instance event.
 */
public class Event {
    /**
     * The count of the event.
     */
    @JsonProperty(value = "count", access = JsonProperty.Access.WRITE_ONLY)
    private Integer count;

    /**
     * The date-time of the earliest logged event.
     */
    @JsonProperty(value = "firstTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime firstTimestamp;

    /**
     * The date-time of the latest logged event.
     */
    @JsonProperty(value = "lastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastTimestamp;

    /**
     * The event name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The event message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * The event type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the count of the event.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Get the date-time of the earliest logged event.
     *
     * @return the firstTimestamp value
     */
    public DateTime firstTimestamp() {
        return this.firstTimestamp;
    }

    /**
     * Get the date-time of the latest logged event.
     *
     * @return the lastTimestamp value
     */
    public DateTime lastTimestamp() {
        return this.lastTimestamp;
    }

    /**
     * Get the event name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the event message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the event type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
