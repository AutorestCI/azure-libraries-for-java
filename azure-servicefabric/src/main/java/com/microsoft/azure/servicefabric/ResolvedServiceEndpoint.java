/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Endpoint of a resolved service partition.
 */
public class ResolvedServiceEndpoint {
    /**
     * The role of the replica where the endpoint is reported. Possible values
     * include: 'Invalid', 'Stateless', 'StatefulPrimary', 'StatefulSecondary'.
     */
    @JsonProperty(value = "Kind")
    private ServiceEndpointRole kind;

    /**
     * The address of the endpoint. If the endpoint has multiple listeners the
     * address is a JSON object with one property per listener with the value
     * as the address of that listener.
     */
    @JsonProperty(value = "Address")
    private String address;

    /**
     * Get the kind value.
     *
     * @return the kind value
     */
    public ServiceEndpointRole kind() {
        return this.kind;
    }

    /**
     * Set the kind value.
     *
     * @param kind the kind value to set
     * @return the ResolvedServiceEndpoint object itself.
     */
    public ResolvedServiceEndpoint withKind(ServiceEndpointRole kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the address value.
     *
     * @return the address value
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address value.
     *
     * @param address the address value to set
     * @return the ResolvedServiceEndpoint object itself.
     */
    public ResolvedServiceEndpoint withAddress(String address) {
        this.address = address;
        return this;
    }

}
