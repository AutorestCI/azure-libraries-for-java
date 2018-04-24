/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration of the protocol.
 */
public class ProtocolConfiguration {
    /**
     * The httpConfiguration property.
     */
    @JsonProperty(value = "HttpConfiguration")
    private HttpConfiguration httpConfiguration;

    /**
     * Get the httpConfiguration value.
     *
     * @return the httpConfiguration value
     */
    public HttpConfiguration httpConfiguration() {
        return this.httpConfiguration;
    }

    /**
     * Set the httpConfiguration value.
     *
     * @param httpConfiguration the httpConfiguration value to set
     * @return the ProtocolConfiguration object itself.
     */
    public ProtocolConfiguration withHttpConfiguration(HttpConfiguration httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
        return this;
    }

}