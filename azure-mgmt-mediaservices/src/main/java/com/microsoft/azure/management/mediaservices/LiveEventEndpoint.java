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
 * The Live Event endpoint.
 */
public class LiveEventEndpoint {
    /**
     * The endpoint protocol.
     */
    @JsonProperty(value = "protocol")
    private String protocol;

    /**
     * The endpoint URL.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public String protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     * @return the LiveEventEndpoint object itself.
     */
    public LiveEventEndpoint withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the LiveEventEndpoint object itself.
     */
    public LiveEventEndpoint withUrl(String url) {
        this.url = url;
        return this;
    }

}
