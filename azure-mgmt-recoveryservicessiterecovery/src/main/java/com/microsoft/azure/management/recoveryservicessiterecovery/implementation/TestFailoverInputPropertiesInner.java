/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.implementation;

import com.microsoft.azure.management.recoveryservicessiterecovery.ProviderSpecificFailoverInput;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input definition for planned failover input properties.
 */
public class TestFailoverInputPropertiesInner {
    /**
     * Failover direction.
     */
    @JsonProperty(value = "failoverDirection")
    private String failoverDirection;

    /**
     * Network type to be used for test failover.
     */
    @JsonProperty(value = "networkType")
    private String networkType;

    /**
     * The id of the network to be used for test failover.
     */
    @JsonProperty(value = "networkId")
    private String networkId;

    /**
     * A value indicating whether the test failover cleanup is to be skipped.
     */
    @JsonProperty(value = "skipTestFailoverCleanup")
    private String skipTestFailoverCleanup;

    /**
     * Provider specific settings.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private ProviderSpecificFailoverInput providerSpecificDetails;

    /**
     * Get the failoverDirection value.
     *
     * @return the failoverDirection value
     */
    public String failoverDirection() {
        return this.failoverDirection;
    }

    /**
     * Set the failoverDirection value.
     *
     * @param failoverDirection the failoverDirection value to set
     * @return the TestFailoverInputPropertiesInner object itself.
     */
    public TestFailoverInputPropertiesInner withFailoverDirection(String failoverDirection) {
        this.failoverDirection = failoverDirection;
        return this;
    }

    /**
     * Get the networkType value.
     *
     * @return the networkType value
     */
    public String networkType() {
        return this.networkType;
    }

    /**
     * Set the networkType value.
     *
     * @param networkType the networkType value to set
     * @return the TestFailoverInputPropertiesInner object itself.
     */
    public TestFailoverInputPropertiesInner withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * Get the networkId value.
     *
     * @return the networkId value
     */
    public String networkId() {
        return this.networkId;
    }

    /**
     * Set the networkId value.
     *
     * @param networkId the networkId value to set
     * @return the TestFailoverInputPropertiesInner object itself.
     */
    public TestFailoverInputPropertiesInner withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * Get the skipTestFailoverCleanup value.
     *
     * @return the skipTestFailoverCleanup value
     */
    public String skipTestFailoverCleanup() {
        return this.skipTestFailoverCleanup;
    }

    /**
     * Set the skipTestFailoverCleanup value.
     *
     * @param skipTestFailoverCleanup the skipTestFailoverCleanup value to set
     * @return the TestFailoverInputPropertiesInner object itself.
     */
    public TestFailoverInputPropertiesInner withSkipTestFailoverCleanup(String skipTestFailoverCleanup) {
        this.skipTestFailoverCleanup = skipTestFailoverCleanup;
        return this;
    }

    /**
     * Get the providerSpecificDetails value.
     *
     * @return the providerSpecificDetails value
     */
    public ProviderSpecificFailoverInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails value.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set
     * @return the TestFailoverInputPropertiesInner object itself.
     */
    public TestFailoverInputPropertiesInner withProviderSpecificDetails(ProviderSpecificFailoverInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

}