/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The routes table associated with the ExpressRouteCircuit.
 */
public class ExpressRouteCircuitRoutesTable {
    /**
     * network.
     */
    @JsonProperty(value = "network")
    private String network;

    /**
     * nextHop.
     */
    @JsonProperty(value = "nextHop")
    private String nextHop;

    /**
     * locPrf.
     */
    @JsonProperty(value = "locPrf")
    private String locPrf;

    /**
     * weight.
     */
    @JsonProperty(value = "weight")
    private Integer weight;

    /**
     * path.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * Get network.
     *
     * @return the network value
     */
    public String network() {
        return this.network;
    }

    /**
     * Set network.
     *
     * @param network the network value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withNetwork(String network) {
        this.network = network;
        return this;
    }

    /**
     * Get nextHop.
     *
     * @return the nextHop value
     */
    public String nextHop() {
        return this.nextHop;
    }

    /**
     * Set nextHop.
     *
     * @param nextHop the nextHop value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }

    /**
     * Get locPrf.
     *
     * @return the locPrf value
     */
    public String locPrf() {
        return this.locPrf;
    }

    /**
     * Set locPrf.
     *
     * @param locPrf the locPrf value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withLocPrf(String locPrf) {
        this.locPrf = locPrf;
        return this;
    }

    /**
     * Get weight.
     *
     * @return the weight value
     */
    public Integer weight() {
        return this.weight;
    }

    /**
     * Set weight.
     *
     * @param weight the weight value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get path.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set path.
     *
     * @param path the path value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withPath(String path) {
        this.path = path;
        return this;
    }

}
