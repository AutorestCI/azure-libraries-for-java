/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_02_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network rule set.
 */
public class NetworkRuleSet {
    /**
     * Specifies whether traffic is bypassed for Logging/Metrics/AzureServices.
     * Possible values are any combination of Logging|Metrics|AzureServices
     * (For example, "Logging, Metrics"), or None to bypass none of those
     * traffics. Possible values include: 'None', 'Logging', 'Metrics',
     * 'AzureServices'.
     */
    @JsonProperty(value = "bypass")
    private Bypass bypass;

    /**
     * Sets the virtual network rules.
     */
    @JsonProperty(value = "virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /**
     * Sets the IP ACL rules.
     */
    @JsonProperty(value = "ipRules")
    private List<IPRule> ipRules;

    /**
     * Specifies the default action of allow or deny when no other rules match.
     * Possible values include: 'Allow', 'Deny'.
     */
    @JsonProperty(value = "defaultAction", required = true)
    private DefaultAction defaultAction;

    /**
     * Get specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values are any combination of Logging|Metrics|AzureServices (For example, "Logging, Metrics"), or None to bypass none of those traffics. Possible values include: 'None', 'Logging', 'Metrics', 'AzureServices'.
     *
     * @return the bypass value
     */
    public Bypass bypass() {
        return this.bypass;
    }

    /**
     * Set specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values are any combination of Logging|Metrics|AzureServices (For example, "Logging, Metrics"), or None to bypass none of those traffics. Possible values include: 'None', 'Logging', 'Metrics', 'AzureServices'.
     *
     * @param bypass the bypass value to set
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withBypass(Bypass bypass) {
        this.bypass = bypass;
        return this;
    }

    /**
     * Get sets the virtual network rules.
     *
     * @return the virtualNetworkRules value
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set sets the virtual network rules.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get sets the IP ACL rules.
     *
     * @return the ipRules value
     */
    public List<IPRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set sets the IP ACL rules.
     *
     * @param ipRules the ipRules value to set
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withIpRules(List<IPRule> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get specifies the default action of allow or deny when no other rules match. Possible values include: 'Allow', 'Deny'.
     *
     * @return the defaultAction value
     */
    public DefaultAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set specifies the default action of allow or deny when no other rules match. Possible values include: 'Allow', 'Deny'.
     *
     * @param defaultAction the defaultAction value to set
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

}
