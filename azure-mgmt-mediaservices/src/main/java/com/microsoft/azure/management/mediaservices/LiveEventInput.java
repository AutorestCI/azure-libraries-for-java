/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Live Event input.
 */
public class LiveEventInput {
    /**
     * The streaming protocol for the Live Event. Possible values include:
     * 'FragmentedMP4', 'RTMP'.
     */
    @JsonProperty(value = "streamingProtocol")
    private LiveEventInputProtocol streamingProtocol;

    /**
     * ISO 8601 timespan duration of the key frame interval duration.
     */
    @JsonProperty(value = "keyFrameIntervalDuration")
    private String keyFrameIntervalDuration;

    /**
     * The access token.
     */
    @JsonProperty(value = "accessToken")
    private String accessToken;

    /**
     * The input endpoints for the Live Event.
     */
    @JsonProperty(value = "endpoints")
    private List<LiveEventEndpoint> endpoints;

    /**
     * Get the streamingProtocol value.
     *
     * @return the streamingProtocol value
     */
    public LiveEventInputProtocol streamingProtocol() {
        return this.streamingProtocol;
    }

    /**
     * Set the streamingProtocol value.
     *
     * @param streamingProtocol the streamingProtocol value to set
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withStreamingProtocol(LiveEventInputProtocol streamingProtocol) {
        this.streamingProtocol = streamingProtocol;
        return this;
    }

    /**
     * Get the keyFrameIntervalDuration value.
     *
     * @return the keyFrameIntervalDuration value
     */
    public String keyFrameIntervalDuration() {
        return this.keyFrameIntervalDuration;
    }

    /**
     * Set the keyFrameIntervalDuration value.
     *
     * @param keyFrameIntervalDuration the keyFrameIntervalDuration value to set
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withKeyFrameIntervalDuration(String keyFrameIntervalDuration) {
        this.keyFrameIntervalDuration = keyFrameIntervalDuration;
        return this;
    }

    /**
     * Get the accessToken value.
     *
     * @return the accessToken value
     */
    public String accessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken value.
     *
     * @param accessToken the accessToken value to set
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the endpoints value.
     *
     * @return the endpoints value
     */
    public List<LiveEventEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints value.
     *
     * @param endpoints the endpoints value to set
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withEndpoints(List<LiveEventEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

}
