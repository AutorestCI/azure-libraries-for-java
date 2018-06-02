/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The HLS configuration.
 */
public class Hls {
    /**
     * The amount of fragments per HTTP Live Streaming (HLS) segment.
     */
    @JsonProperty(value = "fragmentsPerTsSegment")
    private Integer fragmentsPerTsSegment;

    /**
     * Get the amount of fragments per HTTP Live Streaming (HLS) segment.
     *
     * @return the fragmentsPerTsSegment value
     */
    public Integer fragmentsPerTsSegment() {
        return this.fragmentsPerTsSegment;
    }

    /**
     * Set the amount of fragments per HTTP Live Streaming (HLS) segment.
     *
     * @param fragmentsPerTsSegment the fragmentsPerTsSegment value to set
     * @return the Hls object itself.
     */
    public Hls withFragmentsPerTsSegment(Integer fragmentsPerTsSegment) {
        this.fragmentsPerTsSegment = fragmentsPerTsSegment;
        return this;
    }

}
