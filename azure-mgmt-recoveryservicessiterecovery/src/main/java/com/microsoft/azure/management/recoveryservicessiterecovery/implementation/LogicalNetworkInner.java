/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.implementation;

import com.microsoft.azure.management.recoveryservicessiterecovery.LogicalNetworkProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Resource;

/**
 * Logical network data model.
 */
public class LogicalNetworkInner extends Resource {
    /**
     * The Logical Network Properties.
     */
    @JsonProperty(value = "properties")
    private LogicalNetworkProperties properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public LogicalNetworkProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the LogicalNetworkInner object itself.
     */
    public LogicalNetworkInner withProperties(LogicalNetworkProperties properties) {
        this.properties = properties;
        return this;
    }

}