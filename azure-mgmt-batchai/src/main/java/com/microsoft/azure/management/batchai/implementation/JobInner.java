/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.implementation;

import com.microsoft.azure.management.batchai.JobPriority;
import com.microsoft.azure.management.batchai.ResourceId;
import com.microsoft.azure.management.batchai.MountVolumes;
import com.microsoft.azure.management.batchai.ContainerSettings;
import com.microsoft.azure.management.batchai.ToolType;
import com.microsoft.azure.management.batchai.CNTKsettings;
import com.microsoft.azure.management.batchai.PyTorchSettings;
import com.microsoft.azure.management.batchai.TensorFlowSettings;
import com.microsoft.azure.management.batchai.CaffeSettings;
import com.microsoft.azure.management.batchai.ChainerSettings;
import com.microsoft.azure.management.batchai.CustomToolkitSettings;
import com.microsoft.azure.management.batchai.CustomMpiSettings;
import com.microsoft.azure.management.batchai.HorovodSettings;
import com.microsoft.azure.management.batchai.JobPreparation;
import java.util.List;
import com.microsoft.azure.management.batchai.InputDirectory;
import com.microsoft.azure.management.batchai.OutputDirectory;
import com.microsoft.azure.management.batchai.EnvironmentVariable;
import com.microsoft.azure.management.batchai.EnvironmentVariableWithSecretValue;
import com.microsoft.azure.management.batchai.JobPropertiesConstraints;
import org.joda.time.DateTime;
import com.microsoft.azure.management.batchai.ProvisioningState;
import com.microsoft.azure.management.batchai.ExecutionState;
import com.microsoft.azure.management.batchai.JobPropertiesExecutionInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Contains information about a Job.
 */
@JsonFlatten
public class JobInner extends ProxyResource {
    /**
     * Priority associated with the job.
     * Priority associated with the job. Possible values include: 'low',
     * 'normal', 'high'.
     */
    @JsonProperty(value = "properties.priority")
    private JobPriority priority;

    /**
     * Specifies the Id of the cluster on which this job will run.
     */
    @JsonProperty(value = "properties.cluster")
    private ResourceId cluster;

    /**
     * Information on mount volumes to be used by the job.
     * These volumes will be mounted before the job execution and will be
     * unmouted after the job completion. The volumes will be mounted at
     * location specified by $AZ_BATCHAI_JOB_MOUNT_ROOT environment variable.
     */
    @JsonProperty(value = "properties.mountVolumes")
    private MountVolumes mountVolumes;

    /**
     * A segment of job's output directories path created by BatchAI.
     * Batch AI creates job's output directories under an unique path to avoid
     * conflicts between jobs. This value contains a path segment generated by
     * Batch AI to make the path unique and can be used to find the output
     * directory on the node or mounted filesystem.
     */
    @JsonProperty(value = "properties.jobOutputDirectoryPathSegment", access = JsonProperty.Access.WRITE_ONLY)
    private String jobOutputDirectoryPathSegment;

    /**
     * Number of compute nodes to run the job on.
     * The job will be gang scheduled on that many compute nodes.
     */
    @JsonProperty(value = "properties.nodeCount")
    private Integer nodeCount;

    /**
     * If provided the job will run in the specified container.
     * If the container was downloaded as part of cluster setup then the same
     * container image will be used. If not provided, the job will run on the
     * VM.
     */
    @JsonProperty(value = "properties.containerSettings")
    private ContainerSettings containerSettings;

    /**
     * The toolkit type of this job.
     * Possible values are: cntk, tensorflow, caffe, caffe2, chainer, pytorch,
     * custom, mpi, horovod. Possible values include: 'cntk', 'tensorflow',
     * 'caffe', 'caffe2', 'chainer', 'horovod', 'mpi', 'custom'.
     */
    @JsonProperty(value = "properties.toolType")
    private ToolType toolType;

    /**
     * Specifies the settings for CNTK (aka Microsoft Cognitive Toolkit) job.
     */
    @JsonProperty(value = "properties.cntkSettings")
    private CNTKsettings cntkSettings;

    /**
     * Specifies the settings for pyTorch job.
     */
    @JsonProperty(value = "properties.pyTorchSettings")
    private PyTorchSettings pyTorchSettings;

    /**
     * Specifies the settings for Tensor Flow job.
     */
    @JsonProperty(value = "properties.tensorFlowSettings")
    private TensorFlowSettings tensorFlowSettings;

    /**
     * Specifies the settings for Caffe job.
     */
    @JsonProperty(value = "properties.caffeSettings")
    private CaffeSettings caffeSettings;

    /**
     * Specifies the settings for Chainer job.
     */
    @JsonProperty(value = "properties.chainerSettings")
    private ChainerSettings chainerSettings;

    /**
     * Specifies the settings for custom tool kit job.
     */
    @JsonProperty(value = "properties.customToolkitSettings")
    private CustomToolkitSettings customToolkitSettings;

    /**
     * Specifies the settings for custom MPI job.
     */
    @JsonProperty(value = "properties.customMpiSettings")
    private CustomMpiSettings customMpiSettings;

    /**
     * Specifies the settings for Horovod job.
     */
    @JsonProperty(value = "properties.horovodSettings")
    private HorovodSettings horovodSettings;

    /**
     * Specifies the actions to be performed before tool kit is launched.
     * The specified actions will run on all the nodes that are part of the
     * job.
     */
    @JsonProperty(value = "properties.jobPreparation")
    private JobPreparation jobPreparation;

    /**
     * The path where the Batch AI service will upload stdout and stderror of
     * the job.
     */
    @JsonProperty(value = "properties.stdOutErrPathPrefix")
    private String stdOutErrPathPrefix;

    /**
     * Specifies the list of input directories for the Job.
     */
    @JsonProperty(value = "properties.inputDirectories")
    private List<InputDirectory> inputDirectories;

    /**
     * Specifies the list of output directories where the models will be
     * created.
     */
    @JsonProperty(value = "properties.outputDirectories")
    private List<OutputDirectory> outputDirectories;

    /**
     * Additional environment variables to set on the job.
     * Batch AI will setup these additional environment variables for the job.
     */
    @JsonProperty(value = "properties.environmentVariables")
    private List<EnvironmentVariable> environmentVariables;

    /**
     * Additional environment variables with secret values to set on the job.
     * Batch AI will setup these additional environment variables for the job.
     * Server will never report values of these variables back.
     */
    @JsonProperty(value = "properties.secrets")
    private List<EnvironmentVariableWithSecretValue> secrets;

    /**
     * Constraints associated with the Job.
     */
    @JsonProperty(value = "properties.constraints")
    private JobPropertiesConstraints constraints;

    /**
     * The job creation time.
     * The creation time of the job.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * The provisioned state of the Batch AI job. Possible values include:
     * 'creating', 'succeeded', 'failed', 'deleting'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The time at which the job entered its current provisioning state.
     * The time at which the job entered its current provisioning state.
     */
    @JsonProperty(value = "properties.provisioningStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime provisioningStateTransitionTime;

    /**
     * The current state of the job.
     * The current state of the job. Possible values are: queued - The job is
     * queued and able to run. A job enters this state when it is created, or
     * when it is awaiting a retry after a failed run. running - The job is
     * running on a compute cluster. This includes job-level preparation such
     * as downloading resource files or set up container specified on the job -
     * it does not necessarily mean that the job command line has started
     * executing. terminating - The job is terminated by the user, the
     * terminate operation is in progress. succeeded - The job has completed
     * running succesfully and exited with exit code 0. failed - The job has
     * finished unsuccessfully (failed with a non-zero exit code) and has
     * exhausted its retry limit. A job is also marked as failed if an error
     * occurred launching the job. Possible values include: 'queued',
     * 'running', 'terminating', 'succeeded', 'failed'.
     */
    @JsonProperty(value = "properties.executionState", access = JsonProperty.Access.WRITE_ONLY)
    private ExecutionState executionState;

    /**
     * The time at which the job entered its current execution state.
     * The time at which the job entered its current execution state.
     */
    @JsonProperty(value = "properties.executionStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime executionStateTransitionTime;

    /**
     * Contains information about the execution of a job in the Azure Batch
     * service.
     */
    @JsonProperty(value = "properties.executionInfo")
    private JobPropertiesExecutionInfo executionInfo;

    /**
     * Get the priority value.
     *
     * @return the priority value
     */
    public JobPriority priority() {
        return this.priority;
    }

    /**
     * Set the priority value.
     *
     * @param priority the priority value to set
     * @return the JobInner object itself.
     */
    public JobInner withPriority(JobPriority priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the cluster value.
     *
     * @return the cluster value
     */
    public ResourceId cluster() {
        return this.cluster;
    }

    /**
     * Set the cluster value.
     *
     * @param cluster the cluster value to set
     * @return the JobInner object itself.
     */
    public JobInner withCluster(ResourceId cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * Get the mountVolumes value.
     *
     * @return the mountVolumes value
     */
    public MountVolumes mountVolumes() {
        return this.mountVolumes;
    }

    /**
     * Set the mountVolumes value.
     *
     * @param mountVolumes the mountVolumes value to set
     * @return the JobInner object itself.
     */
    public JobInner withMountVolumes(MountVolumes mountVolumes) {
        this.mountVolumes = mountVolumes;
        return this;
    }

    /**
     * Get the jobOutputDirectoryPathSegment value.
     *
     * @return the jobOutputDirectoryPathSegment value
     */
    public String jobOutputDirectoryPathSegment() {
        return this.jobOutputDirectoryPathSegment;
    }

    /**
     * Get the nodeCount value.
     *
     * @return the nodeCount value
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }

    /**
     * Set the nodeCount value.
     *
     * @param nodeCount the nodeCount value to set
     * @return the JobInner object itself.
     */
    public JobInner withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * Get the containerSettings value.
     *
     * @return the containerSettings value
     */
    public ContainerSettings containerSettings() {
        return this.containerSettings;
    }

    /**
     * Set the containerSettings value.
     *
     * @param containerSettings the containerSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withContainerSettings(ContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    /**
     * Get the toolType value.
     *
     * @return the toolType value
     */
    public ToolType toolType() {
        return this.toolType;
    }

    /**
     * Set the toolType value.
     *
     * @param toolType the toolType value to set
     * @return the JobInner object itself.
     */
    public JobInner withToolType(ToolType toolType) {
        this.toolType = toolType;
        return this;
    }

    /**
     * Get the cntkSettings value.
     *
     * @return the cntkSettings value
     */
    public CNTKsettings cntkSettings() {
        return this.cntkSettings;
    }

    /**
     * Set the cntkSettings value.
     *
     * @param cntkSettings the cntkSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withCntkSettings(CNTKsettings cntkSettings) {
        this.cntkSettings = cntkSettings;
        return this;
    }

    /**
     * Get the pyTorchSettings value.
     *
     * @return the pyTorchSettings value
     */
    public PyTorchSettings pyTorchSettings() {
        return this.pyTorchSettings;
    }

    /**
     * Set the pyTorchSettings value.
     *
     * @param pyTorchSettings the pyTorchSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withPyTorchSettings(PyTorchSettings pyTorchSettings) {
        this.pyTorchSettings = pyTorchSettings;
        return this;
    }

    /**
     * Get the tensorFlowSettings value.
     *
     * @return the tensorFlowSettings value
     */
    public TensorFlowSettings tensorFlowSettings() {
        return this.tensorFlowSettings;
    }

    /**
     * Set the tensorFlowSettings value.
     *
     * @param tensorFlowSettings the tensorFlowSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withTensorFlowSettings(TensorFlowSettings tensorFlowSettings) {
        this.tensorFlowSettings = tensorFlowSettings;
        return this;
    }

    /**
     * Get the caffeSettings value.
     *
     * @return the caffeSettings value
     */
    public CaffeSettings caffeSettings() {
        return this.caffeSettings;
    }

    /**
     * Set the caffeSettings value.
     *
     * @param caffeSettings the caffeSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withCaffeSettings(CaffeSettings caffeSettings) {
        this.caffeSettings = caffeSettings;
        return this;
    }

    /**
     * Get the chainerSettings value.
     *
     * @return the chainerSettings value
     */
    public ChainerSettings chainerSettings() {
        return this.chainerSettings;
    }

    /**
     * Set the chainerSettings value.
     *
     * @param chainerSettings the chainerSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withChainerSettings(ChainerSettings chainerSettings) {
        this.chainerSettings = chainerSettings;
        return this;
    }

    /**
     * Get the customToolkitSettings value.
     *
     * @return the customToolkitSettings value
     */
    public CustomToolkitSettings customToolkitSettings() {
        return this.customToolkitSettings;
    }

    /**
     * Set the customToolkitSettings value.
     *
     * @param customToolkitSettings the customToolkitSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withCustomToolkitSettings(CustomToolkitSettings customToolkitSettings) {
        this.customToolkitSettings = customToolkitSettings;
        return this;
    }

    /**
     * Get the customMpiSettings value.
     *
     * @return the customMpiSettings value
     */
    public CustomMpiSettings customMpiSettings() {
        return this.customMpiSettings;
    }

    /**
     * Set the customMpiSettings value.
     *
     * @param customMpiSettings the customMpiSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withCustomMpiSettings(CustomMpiSettings customMpiSettings) {
        this.customMpiSettings = customMpiSettings;
        return this;
    }

    /**
     * Get the horovodSettings value.
     *
     * @return the horovodSettings value
     */
    public HorovodSettings horovodSettings() {
        return this.horovodSettings;
    }

    /**
     * Set the horovodSettings value.
     *
     * @param horovodSettings the horovodSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withHorovodSettings(HorovodSettings horovodSettings) {
        this.horovodSettings = horovodSettings;
        return this;
    }

    /**
     * Get the jobPreparation value.
     *
     * @return the jobPreparation value
     */
    public JobPreparation jobPreparation() {
        return this.jobPreparation;
    }

    /**
     * Set the jobPreparation value.
     *
     * @param jobPreparation the jobPreparation value to set
     * @return the JobInner object itself.
     */
    public JobInner withJobPreparation(JobPreparation jobPreparation) {
        this.jobPreparation = jobPreparation;
        return this;
    }

    /**
     * Get the stdOutErrPathPrefix value.
     *
     * @return the stdOutErrPathPrefix value
     */
    public String stdOutErrPathPrefix() {
        return this.stdOutErrPathPrefix;
    }

    /**
     * Set the stdOutErrPathPrefix value.
     *
     * @param stdOutErrPathPrefix the stdOutErrPathPrefix value to set
     * @return the JobInner object itself.
     */
    public JobInner withStdOutErrPathPrefix(String stdOutErrPathPrefix) {
        this.stdOutErrPathPrefix = stdOutErrPathPrefix;
        return this;
    }

    /**
     * Get the inputDirectories value.
     *
     * @return the inputDirectories value
     */
    public List<InputDirectory> inputDirectories() {
        return this.inputDirectories;
    }

    /**
     * Set the inputDirectories value.
     *
     * @param inputDirectories the inputDirectories value to set
     * @return the JobInner object itself.
     */
    public JobInner withInputDirectories(List<InputDirectory> inputDirectories) {
        this.inputDirectories = inputDirectories;
        return this;
    }

    /**
     * Get the outputDirectories value.
     *
     * @return the outputDirectories value
     */
    public List<OutputDirectory> outputDirectories() {
        return this.outputDirectories;
    }

    /**
     * Set the outputDirectories value.
     *
     * @param outputDirectories the outputDirectories value to set
     * @return the JobInner object itself.
     */
    public JobInner withOutputDirectories(List<OutputDirectory> outputDirectories) {
        this.outputDirectories = outputDirectories;
        return this;
    }

    /**
     * Get the environmentVariables value.
     *
     * @return the environmentVariables value
     */
    public List<EnvironmentVariable> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environmentVariables value.
     *
     * @param environmentVariables the environmentVariables value to set
     * @return the JobInner object itself.
     */
    public JobInner withEnvironmentVariables(List<EnvironmentVariable> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the secrets value.
     *
     * @return the secrets value
     */
    public List<EnvironmentVariableWithSecretValue> secrets() {
        return this.secrets;
    }

    /**
     * Set the secrets value.
     *
     * @param secrets the secrets value to set
     * @return the JobInner object itself.
     */
    public JobInner withSecrets(List<EnvironmentVariableWithSecretValue> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Get the constraints value.
     *
     * @return the constraints value
     */
    public JobPropertiesConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set the constraints value.
     *
     * @param constraints the constraints value to set
     * @return the JobInner object itself.
     */
    public JobInner withConstraints(JobPropertiesConstraints constraints) {
        this.constraints = constraints;
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
     * Get the executionState value.
     *
     * @return the executionState value
     */
    public ExecutionState executionState() {
        return this.executionState;
    }

    /**
     * Get the executionStateTransitionTime value.
     *
     * @return the executionStateTransitionTime value
     */
    public DateTime executionStateTransitionTime() {
        return this.executionStateTransitionTime;
    }

    /**
     * Get the executionInfo value.
     *
     * @return the executionInfo value
     */
    public JobPropertiesExecutionInfo executionInfo() {
        return this.executionInfo;
    }

    /**
     * Set the executionInfo value.
     *
     * @param executionInfo the executionInfo value to set
     * @return the JobInner object itself.
     */
    public JobInner withExecutionInfo(JobPropertiesExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
        return this;
    }

}
