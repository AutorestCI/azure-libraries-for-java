/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.implementation;

import com.microsoft.azure.management.eventgrid.EventSubscriptionDestination;
import com.microsoft.azure.management.eventgrid.EventSubscriptionFilter;
import java.util.List;
import com.microsoft.azure.management.eventgrid.EventDeliverySchema;
import com.microsoft.azure.management.eventgrid.RetryPolicy;
import com.microsoft.azure.management.eventgrid.DeadLetterDestination;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the Event Subscription update.
 */
public class EventSubscriptionUpdateParametersInner {
    /**
     * Information about the destination where events have to be delivered for
     * the event subscription.
     */
    @JsonProperty(value = "destination")
    private EventSubscriptionDestination destination;

    /**
     * Information about the filter for the event subscription.
     */
    @JsonProperty(value = "filter")
    private EventSubscriptionFilter filter;

    /**
     * List of user defined labels.
     */
    @JsonProperty(value = "labels")
    private List<String> labels;

    /**
     * The event delivery schema for the event subscription. Possible values
     * include: 'EventGridSchema', 'InputEventSchema', 'CloudEventV01Schema'.
     */
    @JsonProperty(value = "eventDeliverySchema")
    private EventDeliverySchema eventDeliverySchema;

    /**
     * The retry policy for events. This can be used to configure maximum
     * number of delivery attempts and time to live for events.
     */
    @JsonProperty(value = "retryPolicy")
    private RetryPolicy retryPolicy;

    /**
     * The DeadLetter destination of the event subscription.
     */
    @JsonProperty(value = "deadLetterDestination")
    private DeadLetterDestination deadLetterDestination;

    /**
     * Get the destination value.
     *
     * @return the destination value
     */
    public EventSubscriptionDestination destination() {
        return this.destination;
    }

    /**
     * Set the destination value.
     *
     * @param destination the destination value to set
     * @return the EventSubscriptionUpdateParametersInner object itself.
     */
    public EventSubscriptionUpdateParametersInner withDestination(EventSubscriptionDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the filter value.
     *
     * @return the filter value
     */
    public EventSubscriptionFilter filter() {
        return this.filter;
    }

    /**
     * Set the filter value.
     *
     * @param filter the filter value to set
     * @return the EventSubscriptionUpdateParametersInner object itself.
     */
    public EventSubscriptionUpdateParametersInner withFilter(EventSubscriptionFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the labels value.
     *
     * @return the labels value
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Set the labels value.
     *
     * @param labels the labels value to set
     * @return the EventSubscriptionUpdateParametersInner object itself.
     */
    public EventSubscriptionUpdateParametersInner withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the eventDeliverySchema value.
     *
     * @return the eventDeliverySchema value
     */
    public EventDeliverySchema eventDeliverySchema() {
        return this.eventDeliverySchema;
    }

    /**
     * Set the eventDeliverySchema value.
     *
     * @param eventDeliverySchema the eventDeliverySchema value to set
     * @return the EventSubscriptionUpdateParametersInner object itself.
     */
    public EventSubscriptionUpdateParametersInner withEventDeliverySchema(EventDeliverySchema eventDeliverySchema) {
        this.eventDeliverySchema = eventDeliverySchema;
        return this;
    }

    /**
     * Get the retryPolicy value.
     *
     * @return the retryPolicy value
     */
    public RetryPolicy retryPolicy() {
        return this.retryPolicy;
    }

    /**
     * Set the retryPolicy value.
     *
     * @param retryPolicy the retryPolicy value to set
     * @return the EventSubscriptionUpdateParametersInner object itself.
     */
    public EventSubscriptionUpdateParametersInner withRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Get the deadLetterDestination value.
     *
     * @return the deadLetterDestination value
     */
    public DeadLetterDestination deadLetterDestination() {
        return this.deadLetterDestination;
    }

    /**
     * Set the deadLetterDestination value.
     *
     * @param deadLetterDestination the deadLetterDestination value to set
     * @return the EventSubscriptionUpdateParametersInner object itself.
     */
    public EventSubscriptionUpdateParametersInner withDeadLetterDestination(DeadLetterDestination deadLetterDestination) {
        this.deadLetterDestination = deadLetterDestination;
        return this;
    }

}
