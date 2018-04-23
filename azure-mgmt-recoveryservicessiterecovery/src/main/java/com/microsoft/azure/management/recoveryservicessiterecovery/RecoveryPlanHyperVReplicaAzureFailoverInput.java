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
 * Recovery plan HVR Azure failover input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaAzure")
public class RecoveryPlanHyperVReplicaAzureFailoverInput extends RecoveryPlanProviderSpecificFailoverInput {
    /**
     * The vault location.
     */
    @JsonProperty(value = "vaultLocation", required = true)
    private String vaultLocation;

    /**
     * The primary KEK certificate PFX.
     */
    @JsonProperty(value = "primaryKekCertificatePfx")
    private String primaryKekCertificatePfx;

    /**
     * The secondary KEK certificate PFX.
     */
    @JsonProperty(value = "secondaryKekCertificatePfx")
    private String secondaryKekCertificatePfx;

    /**
     * The recovery point type. Possible values include: 'Latest',
     * 'LatestApplicationConsistent', 'LatestProcessed'.
     */
    @JsonProperty(value = "recoveryPointType")
    private HyperVReplicaAzureRpRecoveryPointType recoveryPointType;

    /**
     * Get the vaultLocation value.
     *
     * @return the vaultLocation value
     */
    public String vaultLocation() {
        return this.vaultLocation;
    }

    /**
     * Set the vaultLocation value.
     *
     * @param vaultLocation the vaultLocation value to set
     * @return the RecoveryPlanHyperVReplicaAzureFailoverInput object itself.
     */
    public RecoveryPlanHyperVReplicaAzureFailoverInput withVaultLocation(String vaultLocation) {
        this.vaultLocation = vaultLocation;
        return this;
    }

    /**
     * Get the primaryKekCertificatePfx value.
     *
     * @return the primaryKekCertificatePfx value
     */
    public String primaryKekCertificatePfx() {
        return this.primaryKekCertificatePfx;
    }

    /**
     * Set the primaryKekCertificatePfx value.
     *
     * @param primaryKekCertificatePfx the primaryKekCertificatePfx value to set
     * @return the RecoveryPlanHyperVReplicaAzureFailoverInput object itself.
     */
    public RecoveryPlanHyperVReplicaAzureFailoverInput withPrimaryKekCertificatePfx(String primaryKekCertificatePfx) {
        this.primaryKekCertificatePfx = primaryKekCertificatePfx;
        return this;
    }

    /**
     * Get the secondaryKekCertificatePfx value.
     *
     * @return the secondaryKekCertificatePfx value
     */
    public String secondaryKekCertificatePfx() {
        return this.secondaryKekCertificatePfx;
    }

    /**
     * Set the secondaryKekCertificatePfx value.
     *
     * @param secondaryKekCertificatePfx the secondaryKekCertificatePfx value to set
     * @return the RecoveryPlanHyperVReplicaAzureFailoverInput object itself.
     */
    public RecoveryPlanHyperVReplicaAzureFailoverInput withSecondaryKekCertificatePfx(String secondaryKekCertificatePfx) {
        this.secondaryKekCertificatePfx = secondaryKekCertificatePfx;
        return this;
    }

    /**
     * Get the recoveryPointType value.
     *
     * @return the recoveryPointType value
     */
    public HyperVReplicaAzureRpRecoveryPointType recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set the recoveryPointType value.
     *
     * @param recoveryPointType the recoveryPointType value to set
     * @return the RecoveryPlanHyperVReplicaAzureFailoverInput object itself.
     */
    public RecoveryPlanHyperVReplicaAzureFailoverInput withRecoveryPointType(HyperVReplicaAzureRpRecoveryPointType recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

}
