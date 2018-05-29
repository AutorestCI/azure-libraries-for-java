/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Effective network security rules.
 */
public class EffectiveNetworkSecurityRule {
    /**
     * The name of the security rule specified by the user (if created by the
     * user).
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The network protocol this rule applies to. Possible values are: 'Tcp',
     * 'Udp', and 'All'. Possible values include: 'Tcp', 'Udp', 'All'.
     */
    @JsonProperty(value = "protocol")
    private EffectiveSecurityRuleProtocol protocol;

    /**
     * The source port or range.
     */
    @JsonProperty(value = "sourcePortRange")
    private String sourcePortRange;

    /**
     * The destination port or range.
     */
    @JsonProperty(value = "destinationPortRange")
    private String destinationPortRange;

    /**
     * The source port ranges. Expected values include a single integer between
     * 0 and 65535, a range using '-' as seperator (e.g. 100-400), or an
     * asterix (*).
     */
    @JsonProperty(value = "sourcePortRanges")
    private List<String> sourcePortRanges;

    /**
     * The destination port ranges. Expected values include a single integer
     * between 0 and 65535, a range using '-' as seperator (e.g. 100-400), or
     * an asterix (*).
     */
    @JsonProperty(value = "destinationPortRanges")
    private List<String> destinationPortRanges;

    /**
     * The source address prefix.
     */
    @JsonProperty(value = "sourceAddressPrefix")
    private String sourceAddressPrefix;

    /**
     * The destination address prefix.
     */
    @JsonProperty(value = "destinationAddressPrefix")
    private String destinationAddressPrefix;

    /**
     * The source address prefixes. Expected values include CIDR IP ranges,
     * Default Tags (VirtualNetwork, AureLoadBalancer, Internet), System Tags,
     * and the asterix (*).
     */
    @JsonProperty(value = "sourceAddressPrefixes")
    private List<String> sourceAddressPrefixes;

    /**
     * The destination address prefixes. Expected values include CIDR IP
     * ranges, Default Tags (VirtualNetwork, AureLoadBalancer, Internet),
     * System Tags, and the asterix (*).
     */
    @JsonProperty(value = "destinationAddressPrefixes")
    private List<String> destinationAddressPrefixes;

    /**
     * The expanded source address prefix.
     */
    @JsonProperty(value = "expandedSourceAddressPrefix")
    private List<String> expandedSourceAddressPrefix;

    /**
     * Expanded destination address prefix.
     */
    @JsonProperty(value = "expandedDestinationAddressPrefix")
    private List<String> expandedDestinationAddressPrefix;

    /**
     * Whether network traffic is allowed or denied. Possible values are:
     * 'Allow' and 'Deny'. Possible values include: 'Allow', 'Deny'.
     */
    @JsonProperty(value = "access")
    private SecurityRuleAccess access;

    /**
     * The priority of the rule.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * The direction of the rule. Possible values are: 'Inbound and Outbound'.
     * Possible values include: 'Inbound', 'Outbound'.
     */
    @JsonProperty(value = "direction")
    private SecurityRuleDirection direction;

    /**
     * Get the name of the security rule specified by the user (if created by the user).
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the security rule specified by the user (if created by the user).
     *
     * @param name the name value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the network protocol this rule applies to. Possible values are: 'Tcp', 'Udp', and 'All'. Possible values include: 'Tcp', 'Udp', 'All'.
     *
     * @return the protocol value
     */
    public EffectiveSecurityRuleProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the network protocol this rule applies to. Possible values are: 'Tcp', 'Udp', and 'All'. Possible values include: 'Tcp', 'Udp', 'All'.
     *
     * @param protocol the protocol value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withProtocol(EffectiveSecurityRuleProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the source port or range.
     *
     * @return the sourcePortRange value
     */
    public String sourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * Set the source port or range.
     *
     * @param sourcePortRange the sourcePortRange value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }

    /**
     * Get the destination port or range.
     *
     * @return the destinationPortRange value
     */
    public String destinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * Set the destination port or range.
     *
     * @param destinationPortRange the destinationPortRange value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withDestinationPortRange(String destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }

    /**
     * Get the source port ranges. Expected values include a single integer between 0 and 65535, a range using '-' as seperator (e.g. 100-400), or an asterix (*).
     *
     * @return the sourcePortRanges value
     */
    public List<String> sourcePortRanges() {
        return this.sourcePortRanges;
    }

    /**
     * Set the source port ranges. Expected values include a single integer between 0 and 65535, a range using '-' as seperator (e.g. 100-400), or an asterix (*).
     *
     * @param sourcePortRanges the sourcePortRanges value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withSourcePortRanges(List<String> sourcePortRanges) {
        this.sourcePortRanges = sourcePortRanges;
        return this;
    }

    /**
     * Get the destination port ranges. Expected values include a single integer between 0 and 65535, a range using '-' as seperator (e.g. 100-400), or an asterix (*).
     *
     * @return the destinationPortRanges value
     */
    public List<String> destinationPortRanges() {
        return this.destinationPortRanges;
    }

    /**
     * Set the destination port ranges. Expected values include a single integer between 0 and 65535, a range using '-' as seperator (e.g. 100-400), or an asterix (*).
     *
     * @param destinationPortRanges the destinationPortRanges value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withDestinationPortRanges(List<String> destinationPortRanges) {
        this.destinationPortRanges = destinationPortRanges;
        return this;
    }

    /**
     * Get the source address prefix.
     *
     * @return the sourceAddressPrefix value
     */
    public String sourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    /**
     * Set the source address prefix.
     *
     * @param sourceAddressPrefix the sourceAddressPrefix value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withSourceAddressPrefix(String sourceAddressPrefix) {
        this.sourceAddressPrefix = sourceAddressPrefix;
        return this;
    }

    /**
     * Get the destination address prefix.
     *
     * @return the destinationAddressPrefix value
     */
    public String destinationAddressPrefix() {
        return this.destinationAddressPrefix;
    }

    /**
     * Set the destination address prefix.
     *
     * @param destinationAddressPrefix the destinationAddressPrefix value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withDestinationAddressPrefix(String destinationAddressPrefix) {
        this.destinationAddressPrefix = destinationAddressPrefix;
        return this;
    }

    /**
     * Get the source address prefixes. Expected values include CIDR IP ranges, Default Tags (VirtualNetwork, AureLoadBalancer, Internet), System Tags, and the asterix (*).
     *
     * @return the sourceAddressPrefixes value
     */
    public List<String> sourceAddressPrefixes() {
        return this.sourceAddressPrefixes;
    }

    /**
     * Set the source address prefixes. Expected values include CIDR IP ranges, Default Tags (VirtualNetwork, AureLoadBalancer, Internet), System Tags, and the asterix (*).
     *
     * @param sourceAddressPrefixes the sourceAddressPrefixes value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withSourceAddressPrefixes(List<String> sourceAddressPrefixes) {
        this.sourceAddressPrefixes = sourceAddressPrefixes;
        return this;
    }

    /**
     * Get the destination address prefixes. Expected values include CIDR IP ranges, Default Tags (VirtualNetwork, AureLoadBalancer, Internet), System Tags, and the asterix (*).
     *
     * @return the destinationAddressPrefixes value
     */
    public List<String> destinationAddressPrefixes() {
        return this.destinationAddressPrefixes;
    }

    /**
     * Set the destination address prefixes. Expected values include CIDR IP ranges, Default Tags (VirtualNetwork, AureLoadBalancer, Internet), System Tags, and the asterix (*).
     *
     * @param destinationAddressPrefixes the destinationAddressPrefixes value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withDestinationAddressPrefixes(List<String> destinationAddressPrefixes) {
        this.destinationAddressPrefixes = destinationAddressPrefixes;
        return this;
    }

    /**
     * Get the expanded source address prefix.
     *
     * @return the expandedSourceAddressPrefix value
     */
    public List<String> expandedSourceAddressPrefix() {
        return this.expandedSourceAddressPrefix;
    }

    /**
     * Set the expanded source address prefix.
     *
     * @param expandedSourceAddressPrefix the expandedSourceAddressPrefix value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withExpandedSourceAddressPrefix(List<String> expandedSourceAddressPrefix) {
        this.expandedSourceAddressPrefix = expandedSourceAddressPrefix;
        return this;
    }

    /**
     * Get expanded destination address prefix.
     *
     * @return the expandedDestinationAddressPrefix value
     */
    public List<String> expandedDestinationAddressPrefix() {
        return this.expandedDestinationAddressPrefix;
    }

    /**
     * Set expanded destination address prefix.
     *
     * @param expandedDestinationAddressPrefix the expandedDestinationAddressPrefix value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withExpandedDestinationAddressPrefix(List<String> expandedDestinationAddressPrefix) {
        this.expandedDestinationAddressPrefix = expandedDestinationAddressPrefix;
        return this;
    }

    /**
     * Get whether network traffic is allowed or denied. Possible values are: 'Allow' and 'Deny'. Possible values include: 'Allow', 'Deny'.
     *
     * @return the access value
     */
    public SecurityRuleAccess access() {
        return this.access;
    }

    /**
     * Set whether network traffic is allowed or denied. Possible values are: 'Allow' and 'Deny'. Possible values include: 'Allow', 'Deny'.
     *
     * @param access the access value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withAccess(SecurityRuleAccess access) {
        this.access = access;
        return this;
    }

    /**
     * Get the priority of the rule.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority of the rule.
     *
     * @param priority the priority value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the direction of the rule. Possible values are: 'Inbound and Outbound'. Possible values include: 'Inbound', 'Outbound'.
     *
     * @return the direction value
     */
    public SecurityRuleDirection direction() {
        return this.direction;
    }

    /**
     * Set the direction of the rule. Possible values are: 'Inbound and Outbound'. Possible values include: 'Inbound', 'Outbound'.
     *
     * @param direction the direction value to set
     * @return the EffectiveNetworkSecurityRule object itself.
     */
    public EffectiveNetworkSecurityRule withDirection(SecurityRuleDirection direction) {
        this.direction = direction;
        return this;
    }

}
