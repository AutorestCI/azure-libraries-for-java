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
 * A base type for the list of health state chunks found in the cluster. It
 * contains the total number of health states that match the input filters.
 */
public class EntityHealthStateChunkList {
    /**
     * Total number of entity health state objects that match the specified
     * filters from the cluster health chunk query description.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /**
     * Get the totalCount value.
     *
     * @return the totalCount value
     */
    public Long totalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount value.
     *
     * @param totalCount the totalCount value to set
     * @return the EntityHealthStateChunkList object itself.
     */
    public EntityHealthStateChunkList withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

}
