/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.NodeEventInner;

/**
 * Node Added event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeAdded")
public class NodeAddedEvent extends NodeEventInner {
    /**
     * Id of Node.
     */
    @JsonProperty(value = "NodeId", required = true)
    private String nodeId;

    /**
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstance", required = true)
    private long nodeInstance;

    /**
     * Type of Node.
     */
    @JsonProperty(value = "NodeType", required = true)
    private String nodeType;

    /**
     * Fabric version.
     */
    @JsonProperty(value = "FabricVersion", required = true)
    private String fabricVersion;

    /**
     * IP address or FQDN.
     */
    @JsonProperty(value = "IpAddressOrFQDN", required = true)
    private String ipAddressOrFQDN;

    /**
     * Capacities.
     */
    @JsonProperty(value = "NodeCapacities", required = true)
    private String nodeCapacities;

    /**
     * Get the nodeId value.
     *
     * @return the nodeId value
     */
    public String nodeId() {
        return this.nodeId;
    }

    /**
     * Set the nodeId value.
     *
     * @param nodeId the nodeId value to set
     * @return the NodeAddedEvent object itself.
     */
    public NodeAddedEvent withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get the nodeInstance value.
     *
     * @return the nodeInstance value
     */
    public long nodeInstance() {
        return this.nodeInstance;
    }

    /**
     * Set the nodeInstance value.
     *
     * @param nodeInstance the nodeInstance value to set
     * @return the NodeAddedEvent object itself.
     */
    public NodeAddedEvent withNodeInstance(long nodeInstance) {
        this.nodeInstance = nodeInstance;
        return this;
    }

    /**
     * Get the nodeType value.
     *
     * @return the nodeType value
     */
    public String nodeType() {
        return this.nodeType;
    }

    /**
     * Set the nodeType value.
     *
     * @param nodeType the nodeType value to set
     * @return the NodeAddedEvent object itself.
     */
    public NodeAddedEvent withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * Get the fabricVersion value.
     *
     * @return the fabricVersion value
     */
    public String fabricVersion() {
        return this.fabricVersion;
    }

    /**
     * Set the fabricVersion value.
     *
     * @param fabricVersion the fabricVersion value to set
     * @return the NodeAddedEvent object itself.
     */
    public NodeAddedEvent withFabricVersion(String fabricVersion) {
        this.fabricVersion = fabricVersion;
        return this;
    }

    /**
     * Get the ipAddressOrFQDN value.
     *
     * @return the ipAddressOrFQDN value
     */
    public String ipAddressOrFQDN() {
        return this.ipAddressOrFQDN;
    }

    /**
     * Set the ipAddressOrFQDN value.
     *
     * @param ipAddressOrFQDN the ipAddressOrFQDN value to set
     * @return the NodeAddedEvent object itself.
     */
    public NodeAddedEvent withIpAddressOrFQDN(String ipAddressOrFQDN) {
        this.ipAddressOrFQDN = ipAddressOrFQDN;
        return this;
    }

    /**
     * Get the nodeCapacities value.
     *
     * @return the nodeCapacities value
     */
    public String nodeCapacities() {
        return this.nodeCapacities;
    }

    /**
     * Set the nodeCapacities value.
     *
     * @param nodeCapacities the nodeCapacities value to set
     * @return the NodeAddedEvent object itself.
     */
    public NodeAddedEvent withNodeCapacities(String nodeCapacities) {
        this.nodeCapacities = nodeCapacities;
        return this;
    }

}
