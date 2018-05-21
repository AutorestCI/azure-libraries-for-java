/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.implementation;

import com.microsoft.azure.management.compute.VirtualMachineScaleSetInstanceViewStatusesSummary;
import java.util.List;
import com.microsoft.azure.management.compute.VirtualMachineScaleSetVMExtensionsSummary;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of a virtual machine scale set.
 */
public class VirtualMachineScaleSetInstanceViewInner {
    /**
     * The instance view status summary for the virtual machine scale set.
     */
    @JsonProperty(value = "virtualMachine", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineScaleSetInstanceViewStatusesSummary virtualMachine;

    /**
     * The extensions information.
     */
    @JsonProperty(value = "extensions", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualMachineScaleSetVMExtensionsSummary> extensions;

    /**
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatusInner> statuses;

    /**
     * Get the virtualMachine value.
     *
     * @return the virtualMachine value
     */
    public VirtualMachineScaleSetInstanceViewStatusesSummary virtualMachine() {
        return this.virtualMachine;
    }

    /**
     * Get the extensions value.
     *
     * @return the extensions value
     */
    public List<VirtualMachineScaleSetVMExtensionsSummary> extensions() {
        return this.extensions;
    }

    /**
     * Get the statuses value.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatusInner> statuses() {
        return this.statuses;
    }

    /**
     * Set the statuses value.
     *
     * @param statuses the statuses value to set
     * @return the VirtualMachineScaleSetInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetInstanceViewInner withStatuses(List<InstanceViewStatusInner> statuses) {
        this.statuses = statuses;
        return this;
    }

}
