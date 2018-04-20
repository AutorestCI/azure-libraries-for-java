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
 * Node Opened Success event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeOpenedSuccess")
public class NodeOpenedSuccessEvent extends NodeEventInner {
    /**
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstance", required = true)
    private long nodeInstance;

    /**
     * Id of Node.
     */
    @JsonProperty(value = "NodeId", required = true)
    private String nodeId;

    /**
     * Upgrade domain of Node.
     */
    @JsonProperty(value = "UpgradeDomain", required = true)
    private String upgradeDomain;

    /**
     * Fault domain of Node.
     */
    @JsonProperty(value = "FaultDomain", required = true)
    private String faultDomain;

    /**
     * IP address or FQDN.
     */
    @JsonProperty(value = "IpAddressOrFQDN", required = true)
    private String ipAddressOrFQDN;

    /**
     * Name of Host.
     */
    @JsonProperty(value = "Hostname", required = true)
    private String hostname;

    /**
     * Indicates if it is seed node.
     */
    @JsonProperty(value = "IsSeedNode", required = true)
    private boolean isSeedNode;

    /**
     * Version of Node.
     */
    @JsonProperty(value = "NodeVersion", required = true)
    private String nodeVersion;

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
     * @return the NodeOpenedSuccessEvent object itself.
     */
    public NodeOpenedSuccessEvent withNodeInstance(long nodeInstance) {
        this.nodeInstance = nodeInstance;
        return this;
    }

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
     * @return the NodeOpenedSuccessEvent object itself.
     */
    public NodeOpenedSuccessEvent withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get the upgradeDomain value.
     *
     * @return the upgradeDomain value
     */
    public String upgradeDomain() {
        return this.upgradeDomain;
    }

    /**
     * Set the upgradeDomain value.
     *
     * @param upgradeDomain the upgradeDomain value to set
     * @return the NodeOpenedSuccessEvent object itself.
     */
    public NodeOpenedSuccessEvent withUpgradeDomain(String upgradeDomain) {
        this.upgradeDomain = upgradeDomain;
        return this;
    }

    /**
     * Get the faultDomain value.
     *
     * @return the faultDomain value
     */
    public String faultDomain() {
        return this.faultDomain;
    }

    /**
     * Set the faultDomain value.
     *
     * @param faultDomain the faultDomain value to set
     * @return the NodeOpenedSuccessEvent object itself.
     */
    public NodeOpenedSuccessEvent withFaultDomain(String faultDomain) {
        this.faultDomain = faultDomain;
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
     * @return the NodeOpenedSuccessEvent object itself.
     */
    public NodeOpenedSuccessEvent withIpAddressOrFQDN(String ipAddressOrFQDN) {
        this.ipAddressOrFQDN = ipAddressOrFQDN;
        return this;
    }

    /**
     * Get the hostname value.
     *
     * @return the hostname value
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname value.
     *
     * @param hostname the hostname value to set
     * @return the NodeOpenedSuccessEvent object itself.
     */
    public NodeOpenedSuccessEvent withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the isSeedNode value.
     *
     * @return the isSeedNode value
     */
    public boolean isSeedNode() {
        return this.isSeedNode;
    }

    /**
     * Set the isSeedNode value.
     *
     * @param isSeedNode the isSeedNode value to set
     * @return the NodeOpenedSuccessEvent object itself.
     */
    public NodeOpenedSuccessEvent withIsSeedNode(boolean isSeedNode) {
        this.isSeedNode = isSeedNode;
        return this;
    }

    /**
     * Get the nodeVersion value.
     *
     * @return the nodeVersion value
     */
    public String nodeVersion() {
        return this.nodeVersion;
    }

    /**
     * Set the nodeVersion value.
     *
     * @param nodeVersion the nodeVersion value to set
     * @return the NodeOpenedSuccessEvent object itself.
     */
    public NodeOpenedSuccessEvent withNodeVersion(String nodeVersion) {
        this.nodeVersion = nodeVersion;
        return this;
    }

}
