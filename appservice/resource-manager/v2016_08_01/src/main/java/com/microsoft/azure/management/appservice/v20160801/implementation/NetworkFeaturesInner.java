/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v20160801.ProxyOnlyResource;

/**
 * Full view of network features for an app (presently VNET integration and
 * Hybrid Connections).
 */
@JsonFlatten
public class NetworkFeaturesInner extends ProxyOnlyResource {
    /**
     * The Virtual Network name.
     */
    @JsonProperty(value = "properties.virtualNetworkName", access = JsonProperty.Access.WRITE_ONLY)
    private String virtualNetworkName;

    /**
     * The Virtual Network summary view.
     */
    @JsonProperty(value = "properties.virtualNetworkConnection", access = JsonProperty.Access.WRITE_ONLY)
    private VnetInfoInner virtualNetworkConnection;

    /**
     * The Hybrid Connections summary view.
     */
    @JsonProperty(value = "properties.hybridConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<RelayServiceConnectionEntityInner> hybridConnections;

    /**
     * The Hybrid Connection V2 (Service Bus) view.
     */
    @JsonProperty(value = "properties.hybridConnectionsV2", access = JsonProperty.Access.WRITE_ONLY)
    private List<HybridConnectionInner> hybridConnectionsV2;

    /**
     * Get the Virtual Network name.
     *
     * @return the virtualNetworkName value
     */
    public String virtualNetworkName() {
        return this.virtualNetworkName;
    }

    /**
     * Get the Virtual Network summary view.
     *
     * @return the virtualNetworkConnection value
     */
    public VnetInfoInner virtualNetworkConnection() {
        return this.virtualNetworkConnection;
    }

    /**
     * Get the Hybrid Connections summary view.
     *
     * @return the hybridConnections value
     */
    public List<RelayServiceConnectionEntityInner> hybridConnections() {
        return this.hybridConnections;
    }

    /**
     * Get the Hybrid Connection V2 (Service Bus) view.
     *
     * @return the hybridConnectionsV2 value
     */
    public List<HybridConnectionInner> hybridConnectionsV2() {
        return this.hybridConnectionsV2;
    }

}
