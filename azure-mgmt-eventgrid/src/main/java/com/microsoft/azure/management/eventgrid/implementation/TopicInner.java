/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.implementation;

import com.microsoft.azure.management.eventgrid.TopicProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * EventGrid Topic.
 */
@JsonFlatten
public class TopicInner extends TrackedResourceInner {
    /**
     * Provisioning state of the topic. Possible values include: 'Creating',
     * 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private TopicProvisioningState provisioningState;

    /**
     * Endpoint for the topic.
     */
    @JsonProperty(value = "properties.endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public TopicProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the endpoint value.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

}
