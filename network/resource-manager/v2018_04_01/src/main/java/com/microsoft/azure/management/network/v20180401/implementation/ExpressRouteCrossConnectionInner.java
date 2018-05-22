/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01.implementation;

import com.microsoft.azure.management.network.v20180401.ExpressRouteCircuitReference;
import com.microsoft.azure.management.network.v20180401.ServiceProviderProvisioningState;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * ExpressRouteCrossConnection resource.
 */
@JsonFlatten
@SkipParentValidation
public class ExpressRouteCrossConnectionInner extends Resource {
    /**
     * The name of the primary  port.
     */
    @JsonProperty(value = "properties.primaryAzurePort", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryAzurePort;

    /**
     * The name of the secondary  port.
     */
    @JsonProperty(value = "properties.secondaryAzurePort", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryAzurePort;

    /**
     * The identifier of the circuit traffic.
     */
    @JsonProperty(value = "properties.sTag", access = JsonProperty.Access.WRITE_ONLY)
    private Integer sTag;

    /**
     * The peering location of the ExpressRoute circuit.
     */
    @JsonProperty(value = "properties.peeringLocation")
    private String peeringLocation;

    /**
     * The circuit bandwidth In Mbps.
     */
    @JsonProperty(value = "properties.bandwidthInMbps")
    private Integer bandwidthInMbps;

    /**
     * The ExpressRouteCircuit.
     */
    @JsonProperty(value = "properties.expressRouteCircuit")
    private ExpressRouteCircuitReference expressRouteCircuit;

    /**
     * The provisioning state of the circuit in the connectivity provider
     * system. Possible values are 'NotProvisioned', 'Provisioning',
     * 'Provisioned'. Possible values include: 'NotProvisioned',
     * 'Provisioning', 'Provisioned', 'Deprovisioning'.
     */
    @JsonProperty(value = "properties.serviceProviderProvisioningState")
    private ServiceProviderProvisioningState serviceProviderProvisioningState;

    /**
     * Additional read only notes set by the connectivity provider.
     */
    @JsonProperty(value = "properties.serviceProviderNotes")
    private String serviceProviderNotes;

    /**
     * Gets the provisioning state of the public IP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The list of peerings.
     */
    @JsonProperty(value = "properties.peerings")
    private List<ExpressRouteCrossConnectionPeeringInner> peerings;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the primaryAzurePort value.
     *
     * @return the primaryAzurePort value
     */
    public String primaryAzurePort() {
        return this.primaryAzurePort;
    }

    /**
     * Get the secondaryAzurePort value.
     *
     * @return the secondaryAzurePort value
     */
    public String secondaryAzurePort() {
        return this.secondaryAzurePort;
    }

    /**
     * Get the sTag value.
     *
     * @return the sTag value
     */
    public Integer sTag() {
        return this.sTag;
    }

    /**
     * Get the peeringLocation value.
     *
     * @return the peeringLocation value
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Set the peeringLocation value.
     *
     * @param peeringLocation the peeringLocation value to set
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withPeeringLocation(String peeringLocation) {
        this.peeringLocation = peeringLocation;
        return this;
    }

    /**
     * Get the bandwidthInMbps value.
     *
     * @return the bandwidthInMbps value
     */
    public Integer bandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    /**
     * Set the bandwidthInMbps value.
     *
     * @param bandwidthInMbps the bandwidthInMbps value to set
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    /**
     * Get the expressRouteCircuit value.
     *
     * @return the expressRouteCircuit value
     */
    public ExpressRouteCircuitReference expressRouteCircuit() {
        return this.expressRouteCircuit;
    }

    /**
     * Set the expressRouteCircuit value.
     *
     * @param expressRouteCircuit the expressRouteCircuit value to set
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withExpressRouteCircuit(ExpressRouteCircuitReference expressRouteCircuit) {
        this.expressRouteCircuit = expressRouteCircuit;
        return this;
    }

    /**
     * Get the serviceProviderProvisioningState value.
     *
     * @return the serviceProviderProvisioningState value
     */
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.serviceProviderProvisioningState;
    }

    /**
     * Set the serviceProviderProvisioningState value.
     *
     * @param serviceProviderProvisioningState the serviceProviderProvisioningState value to set
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState) {
        this.serviceProviderProvisioningState = serviceProviderProvisioningState;
        return this;
    }

    /**
     * Get the serviceProviderNotes value.
     *
     * @return the serviceProviderNotes value
     */
    public String serviceProviderNotes() {
        return this.serviceProviderNotes;
    }

    /**
     * Set the serviceProviderNotes value.
     *
     * @param serviceProviderNotes the serviceProviderNotes value to set
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withServiceProviderNotes(String serviceProviderNotes) {
        this.serviceProviderNotes = serviceProviderNotes;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the peerings value.
     *
     * @return the peerings value
     */
    public List<ExpressRouteCrossConnectionPeeringInner> peerings() {
        return this.peerings;
    }

    /**
     * Set the peerings value.
     *
     * @param peerings the peerings value to set
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withPeerings(List<ExpressRouteCrossConnectionPeeringInner> peerings) {
        this.peerings = peerings;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withId(String id) {
        this.id = id;
        return this;
    }

}
