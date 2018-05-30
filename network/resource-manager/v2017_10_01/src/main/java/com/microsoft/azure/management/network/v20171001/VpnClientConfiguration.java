/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import java.util.List;
import com.microsoft.azure.management.network.v20171001.implementation.VpnClientRootCertificateInner;
import com.microsoft.azure.management.network.v20171001.implementation.VpnClientRevokedCertificateInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VpnClientConfiguration for P2S client.
 */
public class VpnClientConfiguration {
    /**
     * The reference of the address space resource which represents Address
     * space for P2S VpnClient.
     */
    @JsonProperty(value = "vpnClientAddressPool")
    private AddressSpace vpnClientAddressPool;

    /**
     * VpnClientRootCertificate for virtual network gateway.
     */
    @JsonProperty(value = "vpnClientRootCertificates")
    private List<VpnClientRootCertificateInner> vpnClientRootCertificates;

    /**
     * VpnClientRevokedCertificate for Virtual network gateway.
     */
    @JsonProperty(value = "vpnClientRevokedCertificates")
    private List<VpnClientRevokedCertificateInner> vpnClientRevokedCertificates;

    /**
     * VpnClientProtocols for Virtual network gateway.
     */
    @JsonProperty(value = "vpnClientProtocols")
    private List<VpnClientProtocol> vpnClientProtocols;

    /**
     * The radius server address property of the VirtualNetworkGateway resource
     * for vpn client connection.
     */
    @JsonProperty(value = "radiusServerAddress")
    private String radiusServerAddress;

    /**
     * The radius secret property of the VirtualNetworkGateway resource for vpn
     * client connection.
     */
    @JsonProperty(value = "radiusServerSecret")
    private String radiusServerSecret;

    /**
     * Get the reference of the address space resource which represents Address space for P2S VpnClient.
     *
     * @return the vpnClientAddressPool value
     */
    public AddressSpace vpnClientAddressPool() {
        return this.vpnClientAddressPool;
    }

    /**
     * Set the reference of the address space resource which represents Address space for P2S VpnClient.
     *
     * @param vpnClientAddressPool the vpnClientAddressPool value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientAddressPool(AddressSpace vpnClientAddressPool) {
        this.vpnClientAddressPool = vpnClientAddressPool;
        return this;
    }

    /**
     * Get vpnClientRootCertificate for virtual network gateway.
     *
     * @return the vpnClientRootCertificates value
     */
    public List<VpnClientRootCertificateInner> vpnClientRootCertificates() {
        return this.vpnClientRootCertificates;
    }

    /**
     * Set vpnClientRootCertificate for virtual network gateway.
     *
     * @param vpnClientRootCertificates the vpnClientRootCertificates value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientRootCertificates(List<VpnClientRootCertificateInner> vpnClientRootCertificates) {
        this.vpnClientRootCertificates = vpnClientRootCertificates;
        return this;
    }

    /**
     * Get vpnClientRevokedCertificate for Virtual network gateway.
     *
     * @return the vpnClientRevokedCertificates value
     */
    public List<VpnClientRevokedCertificateInner> vpnClientRevokedCertificates() {
        return this.vpnClientRevokedCertificates;
    }

    /**
     * Set vpnClientRevokedCertificate for Virtual network gateway.
     *
     * @param vpnClientRevokedCertificates the vpnClientRevokedCertificates value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientRevokedCertificates(List<VpnClientRevokedCertificateInner> vpnClientRevokedCertificates) {
        this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
        return this;
    }

    /**
     * Get vpnClientProtocols for Virtual network gateway.
     *
     * @return the vpnClientProtocols value
     */
    public List<VpnClientProtocol> vpnClientProtocols() {
        return this.vpnClientProtocols;
    }

    /**
     * Set vpnClientProtocols for Virtual network gateway.
     *
     * @param vpnClientProtocols the vpnClientProtocols value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientProtocols(List<VpnClientProtocol> vpnClientProtocols) {
        this.vpnClientProtocols = vpnClientProtocols;
        return this;
    }

    /**
     * Get the radius server address property of the VirtualNetworkGateway resource for vpn client connection.
     *
     * @return the radiusServerAddress value
     */
    public String radiusServerAddress() {
        return this.radiusServerAddress;
    }

    /**
     * Set the radius server address property of the VirtualNetworkGateway resource for vpn client connection.
     *
     * @param radiusServerAddress the radiusServerAddress value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withRadiusServerAddress(String radiusServerAddress) {
        this.radiusServerAddress = radiusServerAddress;
        return this;
    }

    /**
     * Get the radius secret property of the VirtualNetworkGateway resource for vpn client connection.
     *
     * @return the radiusServerSecret value
     */
    public String radiusServerSecret() {
        return this.radiusServerSecret;
    }

    /**
     * Set the radius secret property of the VirtualNetworkGateway resource for vpn client connection.
     *
     * @param radiusServerSecret the radiusServerSecret value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withRadiusServerSecret(String radiusServerSecret) {
        this.radiusServerSecret = radiusServerSecret;
        return this;
    }

}
