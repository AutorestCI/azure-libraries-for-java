/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes a partitioning scheme where an integer range is allocated evenly
 * across a number of partitions.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "PartitionScheme")
@JsonTypeName("UniformInt64Range")
public class UniformInt64RangePartitionSchemeDescription extends PartitionSchemeDescription {
    /**
     * The number of partitions.
     */
    @JsonProperty(value = "Count", required = true)
    private int count;

    /**
     * String indicating the lower bound of the partition key range that
     * should be split between the partition ‘Count’.
     */
    @JsonProperty(value = "LowKey", required = true)
    private String lowKey;

    /**
     * String indicating the upper bound of the partition key range that
     * should be split between the partition ‘Count’.
     */
    @JsonProperty(value = "HighKey", required = true)
    private String highKey;

    /**
     * Get the count value.
     *
     * @return the count value
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the count value.
     *
     * @param count the count value to set
     * @return the UniformInt64RangePartitionSchemeDescription object itself.
     */
    public UniformInt64RangePartitionSchemeDescription withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the lowKey value.
     *
     * @return the lowKey value
     */
    public String lowKey() {
        return this.lowKey;
    }

    /**
     * Set the lowKey value.
     *
     * @param lowKey the lowKey value to set
     * @return the UniformInt64RangePartitionSchemeDescription object itself.
     */
    public UniformInt64RangePartitionSchemeDescription withLowKey(String lowKey) {
        this.lowKey = lowKey;
        return this;
    }

    /**
     * Get the highKey value.
     *
     * @return the highKey value
     */
    public String highKey() {
        return this.highKey;
    }

    /**
     * Set the highKey value.
     *
     * @param highKey the highKey value to set
     * @return the UniformInt64RangePartitionSchemeDescription object itself.
     */
    public UniformInt64RangePartitionSchemeDescription withHighKey(String highKey) {
        this.highKey = highKey;
        return this;
    }

}
