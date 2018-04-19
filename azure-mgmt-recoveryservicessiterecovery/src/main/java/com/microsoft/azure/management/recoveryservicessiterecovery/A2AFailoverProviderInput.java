/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A2A provider specific input for failover.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
public class A2AFailoverProviderInput extends ProviderSpecificFailoverInput {
    /**
     * The recovery point id to be passed to failover to a particular recovery
     * point. In case of latest recovery point, null should be passed.
     */
    @JsonProperty(value = "recoveryPointId")
    private String recoveryPointId;

    /**
     * A value indicating whether to use recovery cloud service for TFO or not.
     */
    @JsonProperty(value = "cloudServiceCreationOption")
    private String cloudServiceCreationOption;

    /**
     * Get the recoveryPointId value.
     *
     * @return the recoveryPointId value
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set the recoveryPointId value.
     *
     * @param recoveryPointId the recoveryPointId value to set
     * @return the A2AFailoverProviderInput object itself.
     */
    public A2AFailoverProviderInput withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }

    /**
     * Get the cloudServiceCreationOption value.
     *
     * @return the cloudServiceCreationOption value
     */
    public String cloudServiceCreationOption() {
        return this.cloudServiceCreationOption;
    }

    /**
     * Set the cloudServiceCreationOption value.
     *
     * @param cloudServiceCreationOption the cloudServiceCreationOption value to set
     * @return the A2AFailoverProviderInput object itself.
     */
    public A2AFailoverProviderInput withCloudServiceCreationOption(String cloudServiceCreationOption) {
        this.cloudServiceCreationOption = cloudServiceCreationOption;
        return this;
    }

}