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
 * Class for NoEncryption scheme.
 */
public class NoEncryption {
    /**
     * Representing supported protocols.
     */
    @JsonProperty(value = "enabledProtocols")
    private EnabledProtocols enabledProtocols;

    /**
     * Get representing supported protocols.
     *
     * @return the enabledProtocols value
     */
    public EnabledProtocols enabledProtocols() {
        return this.enabledProtocols;
    }

    /**
     * Set representing supported protocols.
     *
     * @param enabledProtocols the enabledProtocols value to set
     * @return the NoEncryption object itself.
     */
    public NoEncryption withEnabledProtocols(EnabledProtocols enabledProtocols) {
        this.enabledProtocols = enabledProtocols;
        return this;
    }

}
