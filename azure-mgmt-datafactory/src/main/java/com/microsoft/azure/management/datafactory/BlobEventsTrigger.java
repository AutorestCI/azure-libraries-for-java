/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Trigger that runs everytime a Blob event occurs.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("BlobEventsTrigger")
@JsonFlatten
public class BlobEventsTrigger extends MultiplePipelineTrigger {
    /**
     * Path to container, folder, blob, or file extension for which events can
     * trigger the pipeline.
     */
    @JsonProperty(value = "typeProperties.blobPath", required = true)
    private String blobPath;

    /**
     * The type of events that cause this trigger to fire.
     */
    @JsonProperty(value = "typeProperties.events", required = true)
    private List<BlobEventTypes> events;

    /**
     * The ARM resource ID of the Storage Account.
     */
    @JsonProperty(value = "typeProperties.scope", required = true)
    private String scope;

    /**
     * Get the blobPath value.
     *
     * @return the blobPath value
     */
    public String blobPath() {
        return this.blobPath;
    }

    /**
     * Set the blobPath value.
     *
     * @param blobPath the blobPath value to set
     * @return the BlobEventsTrigger object itself.
     */
    public BlobEventsTrigger withBlobPath(String blobPath) {
        this.blobPath = blobPath;
        return this;
    }

    /**
     * Get the events value.
     *
     * @return the events value
     */
    public List<BlobEventTypes> events() {
        return this.events;
    }

    /**
     * Set the events value.
     *
     * @param events the events value to set
     * @return the BlobEventsTrigger object itself.
     */
    public BlobEventsTrigger withEvents(List<BlobEventTypes> events) {
        this.events = events;
        return this;
    }

    /**
     * Get the scope value.
     *
     * @return the scope value
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope value.
     *
     * @param scope the scope value to set
     * @return the BlobEventsTrigger object itself.
     */
    public BlobEventsTrigger withScope(String scope) {
        this.scope = scope;
        return this;
    }

}
