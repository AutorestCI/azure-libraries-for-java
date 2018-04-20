/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the health state chunk of a service, which contains the service
 * name, its aggregated health state and any partitions that respect the
 * filters in the cluster health chunk query description.
 */
public class ServiceHealthStateChunk extends EntityHealthStateChunk {
    /**
     * The name of the service whose health state chunk is provided in this
     * object.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /**
     * The list of partition health state chunks belonging to the service that
     * respect the filters in the cluster health chunk query description.
     */
    @JsonProperty(value = "PartitionHealthStateChunks")
    private PartitionHealthStateChunkList partitionHealthStateChunks;

    /**
     * Get the serviceName value.
     *
     * @return the serviceName value
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName value.
     *
     * @param serviceName the serviceName value to set
     * @return the ServiceHealthStateChunk object itself.
     */
    public ServiceHealthStateChunk withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the partitionHealthStateChunks value.
     *
     * @return the partitionHealthStateChunks value
     */
    public PartitionHealthStateChunkList partitionHealthStateChunks() {
        return this.partitionHealthStateChunks;
    }

    /**
     * Set the partitionHealthStateChunks value.
     *
     * @param partitionHealthStateChunks the partitionHealthStateChunks value to set
     * @return the ServiceHealthStateChunk object itself.
     */
    public ServiceHealthStateChunk withPartitionHealthStateChunks(PartitionHealthStateChunkList partitionHealthStateChunks) {
        this.partitionHealthStateChunks = partitionHealthStateChunks;
        return this;
    }

}
