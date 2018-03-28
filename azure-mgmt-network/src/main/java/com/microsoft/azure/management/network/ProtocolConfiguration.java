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
     * The hTTPConfiguration property.
     */
    @JsonProperty(value = "hTTPConfiguration")
    private HTTPConfiguration hTTPConfiguration;

    /**
     * Get the hTTPConfiguration value.
     *
     * @return the hTTPConfiguration value
     */
    public HTTPConfiguration hTTPConfiguration() {
        return this.hTTPConfiguration;
    }

    /**
     * Set the hTTPConfiguration value.
     *
     * @param hTTPConfiguration the hTTPConfiguration value to set
     * @return the ProtocolConfiguration object itself.
     */
    public ProtocolConfiguration withHTTPConfiguration(HTTPConfiguration hTTPConfiguration) {
        this.hTTPConfiguration = hTTPConfiguration;
        return this;
    }

}
