/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the policy to be used for placement of a Service Fabric service
 * where a particular fault or upgrade domain should not be used for placement
 * of the instances or replicas of that service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Type")
@JsonTypeName("InvalidDomain")
public class ServicePlacementInvalidDomainPolicyDescription extends ServicePlacementPolicyDescription {
    /**
     * The name of the domain that should not be used for placement.
     */
    @JsonProperty(value = "DomainName")
    private String domainName;

    /**
     * Get the domainName value.
     *
     * @return the domainName value
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Set the domainName value.
     *
     * @param domainName the domainName value to set
     * @return the ServicePlacementInvalidDomainPolicyDescription object itself.
     */
    public ServicePlacementInvalidDomainPolicyDescription withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

}
