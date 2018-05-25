/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Represents a server firewall rule.
 */
@JsonFlatten
public class FirewallRuleInner extends ProxyResource {
    /**
     * The start IP address of the server firewall rule. Must be IPv4 format.
     */
    @JsonProperty(value = "properties.startIpAddress", required = true)
    private String startIpAddress;

    /**
     * The end IP address of the server firewall rule. Must be IPv4 format.
     */
    @JsonProperty(value = "properties.endIpAddress", required = true)
    private String endIpAddress;

    /**
     * Get the start IP address of the server firewall rule. Must be IPv4 format.
     *
     * @return the startIpAddress value
     */
    public String startIpAddress() {
        return this.startIpAddress;
    }

    /**
     * Set the start IP address of the server firewall rule. Must be IPv4 format.
     *
     * @param startIpAddress the startIpAddress value to set
     * @return the FirewallRuleInner object itself.
     */
    public FirewallRuleInner withStartIpAddress(String startIpAddress) {
        this.startIpAddress = startIpAddress;
        return this;
    }

    /**
     * Get the end IP address of the server firewall rule. Must be IPv4 format.
     *
     * @return the endIpAddress value
     */
    public String endIpAddress() {
        return this.endIpAddress;
    }

    /**
     * Set the end IP address of the server firewall rule. Must be IPv4 format.
     *
     * @param endIpAddress the endIpAddress value to set
     * @return the FirewallRuleInner object itself.
     */
    public FirewallRuleInner withEndIpAddress(String endIpAddress) {
        this.endIpAddress = endIpAddress;
        return this;
    }

}
