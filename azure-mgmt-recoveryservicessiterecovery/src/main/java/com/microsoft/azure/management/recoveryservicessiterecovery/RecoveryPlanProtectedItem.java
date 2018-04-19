/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Recovery plan protected item.
 */
public class RecoveryPlanProtectedItem {
    /**
     * The ARM Id of the recovery plan protected item.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The virtual machine Id.
     */
    @JsonProperty(value = "virtualMachineId")
    private String virtualMachineId;

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
     * @return the RecoveryPlanProtectedItem object itself.
     */
    public RecoveryPlanProtectedItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the virtualMachineId value.
     *
     * @return the virtualMachineId value
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     * Set the virtualMachineId value.
     *
     * @param virtualMachineId the virtualMachineId value to set
     * @return the RecoveryPlanProtectedItem object itself.
     */
    public RecoveryPlanProtectedItem withVirtualMachineId(String virtualMachineId) {
        this.virtualMachineId = virtualMachineId;
        return this;
    }

}