/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.VirtualMachineScaleSetNetworkConfigurationDnsSettings;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a virtual machine scale set network profile's network
 * configurations.
 */
@JsonFlatten
public class VirtualMachineScaleSetUpdateNetworkConfigurationInner extends SubResource {
    /**
     * The network configuration name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Whether this is a primary NIC on a virtual machine.
     */
    @JsonProperty(value = "properties.primary")
    private Boolean primary;

    /**
     * Specifies whether the network interface is accelerated
     * networking-enabled.
     */
    @JsonProperty(value = "properties.enableAcceleratedNetworking")
    private Boolean enableAcceleratedNetworking;

    /**
     * The network security group.
     */
    @JsonProperty(value = "properties.networkSecurityGroup")
    private SubResource networkSecurityGroup;

    /**
     * The dns settings to be applied on the network interfaces.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings;

    /**
     * The virtual machine scale set IP Configuration.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<VirtualMachineScaleSetUpdateIPConfigurationInner> ipConfigurations;

    /**
     * Whether IP forwarding enabled on this NIC.
     */
    @JsonProperty(value = "properties.enableIPForwarding")
    private Boolean enableIPForwarding;

    /**
     * Get the network configuration name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the network configuration name.
     *
     * @param name the name value to set
     * @return the VirtualMachineScaleSetUpdateNetworkConfigurationInner object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get whether this is a primary NIC on a virtual machine.
     *
     * @return the primary value
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set whether this is a primary NIC on a virtual machine.
     *
     * @param primary the primary value to set
     * @return the VirtualMachineScaleSetUpdateNetworkConfigurationInner object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfigurationInner withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get specifies whether the network interface is accelerated networking-enabled.
     *
     * @return the enableAcceleratedNetworking value
     */
    public Boolean enableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }

    /**
     * Set specifies whether the network interface is accelerated networking-enabled.
     *
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value to set
     * @return the VirtualMachineScaleSetUpdateNetworkConfigurationInner object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfigurationInner withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        return this;
    }

    /**
     * Get the network security group.
     *
     * @return the networkSecurityGroup value
     */
    public SubResource networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the network security group.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set
     * @return the VirtualMachineScaleSetUpdateNetworkConfigurationInner object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfigurationInner withNetworkSecurityGroup(SubResource networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the dns settings to be applied on the network interfaces.
     *
     * @return the dnsSettings value
     */
    public VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dns settings to be applied on the network interfaces.
     *
     * @param dnsSettings the dnsSettings value to set
     * @return the VirtualMachineScaleSetUpdateNetworkConfigurationInner object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfigurationInner withDnsSettings(VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the virtual machine scale set IP Configuration.
     *
     * @return the ipConfigurations value
     */
    public List<VirtualMachineScaleSetUpdateIPConfigurationInner> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the virtual machine scale set IP Configuration.
     *
     * @param ipConfigurations the ipConfigurations value to set
     * @return the VirtualMachineScaleSetUpdateNetworkConfigurationInner object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfigurationInner withIpConfigurations(List<VirtualMachineScaleSetUpdateIPConfigurationInner> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get whether IP forwarding enabled on this NIC.
     *
     * @return the enableIPForwarding value
     */
    public Boolean enableIPForwarding() {
        return this.enableIPForwarding;
    }

    /**
     * Set whether IP forwarding enabled on this NIC.
     *
     * @param enableIPForwarding the enableIPForwarding value to set
     * @return the VirtualMachineScaleSetUpdateNetworkConfigurationInner object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfigurationInner withEnableIPForwarding(Boolean enableIPForwarding) {
        this.enableIPForwarding = enableIPForwarding;
        return this;
    }

}
