/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Job custom data details.
 */
public class JobProperties {
    /**
     * The activity id.
     */
    @JsonProperty(value = "activityId")
    private String activityId;

    /**
     * The ScenarioName.
     */
    @JsonProperty(value = "scenarioName")
    private String scenarioName;

    /**
     * The DisplayName.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * The status of the Job. It is one of these values - NotStarted,
     * InProgress, Succeeded, Failed, Cancelled, Suspended or Other.
     */
    @JsonProperty(value = "state")
    private String state;

    /**
     * The description of the state of the Job. For e.g. - For Succeeded state,
     * description can be Completed, PartiallySucceeded,
     * CompletedWithInformation or Skipped.
     */
    @JsonProperty(value = "stateDescription")
    private String stateDescription;

    /**
     * The tasks.
     */
    @JsonProperty(value = "tasks")
    private List<ASRTask> tasks;

    /**
     * The errors.
     */
    @JsonProperty(value = "errors")
    private List<JobErrorDetails> errors;

    /**
     * The start time.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * The end time.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * The Allowed action the job.
     */
    @JsonProperty(value = "allowedActions")
    private List<String> allowedActions;

    /**
     * The affected Object Id.
     */
    @JsonProperty(value = "targetObjectId")
    private String targetObjectId;

    /**
     * The name of the affected object.
     */
    @JsonProperty(value = "targetObjectName")
    private String targetObjectName;

    /**
     * The type of the affected object which is of
     * {Microsoft.Azure.SiteRecovery.V2015_11_10.AffectedObjectType} class.
     */
    @JsonProperty(value = "targetInstanceType")
    private String targetInstanceType;

    /**
     * The custom job details like test failover job details.
     */
    @JsonProperty(value = "customDetails")
    private JobDetails customDetails;

    /**
     * Get the activityId value.
     *
     * @return the activityId value
     */
    public String activityId() {
        return this.activityId;
    }

    /**
     * Set the activityId value.
     *
     * @param activityId the activityId value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
     * Get the scenarioName value.
     *
     * @return the scenarioName value
     */
    public String scenarioName() {
        return this.scenarioName;
    }

    /**
     * Set the scenarioName value.
     *
     * @param scenarioName the scenarioName value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
        return this;
    }

    /**
     * Get the friendlyName value.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName value.
     *
     * @param friendlyName the friendlyName value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the stateDescription value.
     *
     * @return the stateDescription value
     */
    public String stateDescription() {
        return this.stateDescription;
    }

    /**
     * Set the stateDescription value.
     *
     * @param stateDescription the stateDescription value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
        return this;
    }

    /**
     * Get the tasks value.
     *
     * @return the tasks value
     */
    public List<ASRTask> tasks() {
        return this.tasks;
    }

    /**
     * Set the tasks value.
     *
     * @param tasks the tasks value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withTasks(List<ASRTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    /**
     * Get the errors value.
     *
     * @return the errors value
     */
    public List<JobErrorDetails> errors() {
        return this.errors;
    }

    /**
     * Set the errors value.
     *
     * @param errors the errors value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withErrors(List<JobErrorDetails> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the allowedActions value.
     *
     * @return the allowedActions value
     */
    public List<String> allowedActions() {
        return this.allowedActions;
    }

    /**
     * Set the allowedActions value.
     *
     * @param allowedActions the allowedActions value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withAllowedActions(List<String> allowedActions) {
        this.allowedActions = allowedActions;
        return this;
    }

    /**
     * Get the targetObjectId value.
     *
     * @return the targetObjectId value
     */
    public String targetObjectId() {
        return this.targetObjectId;
    }

    /**
     * Set the targetObjectId value.
     *
     * @param targetObjectId the targetObjectId value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withTargetObjectId(String targetObjectId) {
        this.targetObjectId = targetObjectId;
        return this;
    }

    /**
     * Get the targetObjectName value.
     *
     * @return the targetObjectName value
     */
    public String targetObjectName() {
        return this.targetObjectName;
    }

    /**
     * Set the targetObjectName value.
     *
     * @param targetObjectName the targetObjectName value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withTargetObjectName(String targetObjectName) {
        this.targetObjectName = targetObjectName;
        return this;
    }

    /**
     * Get the targetInstanceType value.
     *
     * @return the targetInstanceType value
     */
    public String targetInstanceType() {
        return this.targetInstanceType;
    }

    /**
     * Set the targetInstanceType value.
     *
     * @param targetInstanceType the targetInstanceType value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withTargetInstanceType(String targetInstanceType) {
        this.targetInstanceType = targetInstanceType;
        return this;
    }

    /**
     * Get the customDetails value.
     *
     * @return the customDetails value
     */
    public JobDetails customDetails() {
        return this.customDetails;
    }

    /**
     * Set the customDetails value.
     *
     * @param customDetails the customDetails value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withCustomDetails(JobDetails customDetails) {
        this.customDetails = customDetails;
        return this;
    }

}