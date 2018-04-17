/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Extra Operation properties.
 */
public class OperationProperties {
    /**
     * The service specifications.
     */
    @JsonProperty(value = "serviceSpecification")
    private ServiceSpecification serviceSpecification;

    /**
     * Get the serviceSpecification value.
     *
     * @return the serviceSpecification value
     */
    public ServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set the serviceSpecification value.
     *
     * @param serviceSpecification the serviceSpecification value to set
     * @return the OperationProperties object itself.
     */
    public OperationProperties withServiceSpecification(ServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

}
