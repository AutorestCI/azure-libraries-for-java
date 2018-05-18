/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview.implementation;

import com.microsoft.azure.management.batchai.v20170901preview.VmPriority;
import com.microsoft.azure.management.batchai.v20170901preview.ScaleSettings;
import com.microsoft.azure.management.batchai.v20170901preview.VirtualMachineConfiguration;
import com.microsoft.azure.management.batchai.v20170901preview.NodeSetup;
import com.microsoft.azure.management.batchai.v20170901preview.UserAccountSettings;
import com.microsoft.azure.management.batchai.v20170901preview.ResourceId;
import org.joda.time.DateTime;
import com.microsoft.azure.management.batchai.v20170901preview.ProvisioningState;
import com.microsoft.azure.management.batchai.v20170901preview.AllocationState;
import java.util.List;
import com.microsoft.azure.management.batchai.v20170901preview.BatchAIError;
import com.microsoft.azure.management.batchai.v20170901preview.NodeStateCounts;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Contains information about a Cluster.
 */
@JsonFlatten
@SkipParentValidation
public class ClusterInner extends Resource {
    /**
     * The size of the virtual machines in the cluster.
     * All virtual machines in a cluster are the same size. For information
     * about available VM sizes for clusters using images from the Virtual
     * Machines Marketplace (see Sizes for Virtual Machines (Linux) or Sizes
     * for Virtual Machines (Windows). Batch AI service supports all Azure VM
     * sizes except STANDARD_A0 and those with premium storage (STANDARD_GS,
     * STANDARD_DS, and STANDARD_DSV2 series).
     */
    @JsonProperty(value = "properties.vmSize")
    private String vmSize;

    /**
     * dedicated or lowpriority.
     * The default value is dedicated. The node can get preempted while the
     * task is running if lowpriority is choosen. This is best suited if the
     * workload is checkpointing and can be restarted. Possible values include:
     * 'dedicated', 'lowpriority'.
     */
    @JsonProperty(value = "properties.vmPriority")
    private VmPriority vmPriority;

    /**
     * Desired scale for the Cluster.
     */
    @JsonProperty(value = "properties.scaleSettings")
    private ScaleSettings scaleSettings;

    /**
     * Settings for OS image and mounted data volumes.
     */
    @JsonProperty(value = "properties.virtualMachineConfiguration")
    private VirtualMachineConfiguration virtualMachineConfiguration;

    /**
     * Setup to be done on all compute nodes in the Cluster.
     */
    @JsonProperty(value = "properties.nodeSetup")
    private NodeSetup nodeSetup;

    /**
     * Settings for user account of compute nodes.
     */
    @JsonProperty(value = "properties.userAccountSettings")
    private UserAccountSettings userAccountSettings;

    /**
     * Specifies the identifier of the subnet.
     */
    @JsonProperty(value = "properties.subnet")
    private ResourceId subnet;

    /**
     * The creation time of the cluster.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * Specifies the provisioning state of the cluster.
     * Possible value are: creating - Specifies that the cluster is being
     * created. succeeded - Specifies that the cluster has been created
     * successfully. failed - Specifies that the cluster creation has failed.
     * deleting - Specifies that the cluster is being deleted. Possible values
     * include: 'creating', 'succeeded', 'failed', 'deleting'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The provisioning state transition time of the cluster.
     */
    @JsonProperty(value = "properties.provisioningStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime provisioningStateTransitionTime;

    /**
     * Indicates whether the cluster is resizing.
     * Possible values are: steady and resizing. steady state indicates that
     * the cluster is not resizing. There are no changes to the number of
     * compute nodes in the cluster in progress. A cluster enters this state
     * when it is created and when no operations are being performed on the
     * cluster to change the number of compute nodes. resizing state indicates
     * that the cluster is resizing; that is, compute nodes are being added to
     * or removed from the cluster. Possible values include: 'steady',
     * 'resizing'.
     */
    @JsonProperty(value = "properties.allocationState", access = JsonProperty.Access.WRITE_ONLY)
    private AllocationState allocationState;

    /**
     * The time at which the cluster entered its current allocation state.
     */
    @JsonProperty(value = "properties.allocationStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime allocationStateTransitionTime;

    /**
     * Contains details of various errors on the cluster including resize and
     * node setup task.
     * This element contains all the errors encountered by various compute
     * nodes during node setup.
     */
    @JsonProperty(value = "properties.errors")
    private List<BatchAIError> errors;

    /**
     * The number of compute nodes currently assigned to the cluster.
     */
    @JsonProperty(value = "properties.currentNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer currentNodeCount;

    /**
     * Counts of various node states on the cluster.
     */
    @JsonProperty(value = "properties.nodeStateCounts", access = JsonProperty.Access.WRITE_ONLY)
    private NodeStateCounts nodeStateCounts;

    /**
     * Get the vmSize value.
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize value.
     *
     * @param vmSize the vmSize value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the vmPriority value.
     *
     * @return the vmPriority value
     */
    public VmPriority vmPriority() {
        return this.vmPriority;
    }

    /**
     * Set the vmPriority value.
     *
     * @param vmPriority the vmPriority value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withVmPriority(VmPriority vmPriority) {
        this.vmPriority = vmPriority;
        return this;
    }

    /**
     * Get the scaleSettings value.
     *
     * @return the scaleSettings value
     */
    public ScaleSettings scaleSettings() {
        return this.scaleSettings;
    }

    /**
     * Set the scaleSettings value.
     *
     * @param scaleSettings the scaleSettings value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withScaleSettings(ScaleSettings scaleSettings) {
        this.scaleSettings = scaleSettings;
        return this;
    }

    /**
     * Get the virtualMachineConfiguration value.
     *
     * @return the virtualMachineConfiguration value
     */
    public VirtualMachineConfiguration virtualMachineConfiguration() {
        return this.virtualMachineConfiguration;
    }

    /**
     * Set the virtualMachineConfiguration value.
     *
     * @param virtualMachineConfiguration the virtualMachineConfiguration value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withVirtualMachineConfiguration(VirtualMachineConfiguration virtualMachineConfiguration) {
        this.virtualMachineConfiguration = virtualMachineConfiguration;
        return this;
    }

    /**
     * Get the nodeSetup value.
     *
     * @return the nodeSetup value
     */
    public NodeSetup nodeSetup() {
        return this.nodeSetup;
    }

    /**
     * Set the nodeSetup value.
     *
     * @param nodeSetup the nodeSetup value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withNodeSetup(NodeSetup nodeSetup) {
        this.nodeSetup = nodeSetup;
        return this;
    }

    /**
     * Get the userAccountSettings value.
     *
     * @return the userAccountSettings value
     */
    public UserAccountSettings userAccountSettings() {
        return this.userAccountSettings;
    }

    /**
     * Set the userAccountSettings value.
     *
     * @param userAccountSettings the userAccountSettings value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUserAccountSettings(UserAccountSettings userAccountSettings) {
        this.userAccountSettings = userAccountSettings;
        return this;
    }

    /**
     * Get the subnet value.
     *
     * @return the subnet value
     */
    public ResourceId subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet value.
     *
     * @param subnet the subnet value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSubnet(ResourceId subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the creationTime value.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the provisioningStateTransitionTime value.
     *
     * @return the provisioningStateTransitionTime value
     */
    public DateTime provisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }

    /**
     * Get the allocationState value.
     *
     * @return the allocationState value
     */
    public AllocationState allocationState() {
        return this.allocationState;
    }

    /**
     * Get the allocationStateTransitionTime value.
     *
     * @return the allocationStateTransitionTime value
     */
    public DateTime allocationStateTransitionTime() {
        return this.allocationStateTransitionTime;
    }

    /**
     * Get the errors value.
     *
     * @return the errors value
     */
    public List<BatchAIError> errors() {
        return this.errors;
    }

    /**
     * Set the errors value.
     *
     * @param errors the errors value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withErrors(List<BatchAIError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the currentNodeCount value.
     *
     * @return the currentNodeCount value
     */
    public Integer currentNodeCount() {
        return this.currentNodeCount;
    }

    /**
     * Get the nodeStateCounts value.
     *
     * @return the nodeStateCounts value
     */
    public NodeStateCounts nodeStateCounts() {
        return this.nodeStateCounts;
    }

}
