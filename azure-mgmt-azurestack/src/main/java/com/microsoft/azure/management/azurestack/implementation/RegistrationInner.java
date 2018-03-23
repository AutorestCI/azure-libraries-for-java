/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Registration information.
 */
@JsonFlatten
public class RegistrationInner extends Resource {
    /**
     * The object identifier associated with the Azure Stack connecting to
     * Azure.
     */
    @JsonProperty(value = "properties.objectId")
    private String objectId;

    /**
     * The identifier of the registered Azure Stack.
     */
    @JsonProperty(value = "properties.cloudId")
    private String cloudId;

    /**
     * Specifies the billing mode for the Azure Stack registration.
     */
    @JsonProperty(value = "properties.billingModel")
    private String billingModel;

    /**
     * Get the objectId value.
     *
     * @return the objectId value
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId value.
     *
     * @param objectId the objectId value to set
     * @return the RegistrationInner object itself.
     */
    public RegistrationInner withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the cloudId value.
     *
     * @return the cloudId value
     */
    public String cloudId() {
        return this.cloudId;
    }

    /**
     * Set the cloudId value.
     *
     * @param cloudId the cloudId value to set
     * @return the RegistrationInner object itself.
     */
    public RegistrationInner withCloudId(String cloudId) {
        this.cloudId = cloudId;
        return this;
    }

    /**
     * Get the billingModel value.
     *
     * @return the billingModel value
     */
    public String billingModel() {
        return this.billingModel;
    }

    /**
     * Set the billingModel value.
     *
     * @param billingModel the billingModel value to set
     * @return the RegistrationInner object itself.
     */
    public RegistrationInner withBillingModel(String billingModel) {
        this.billingModel = billingModel;
        return this;
    }

}