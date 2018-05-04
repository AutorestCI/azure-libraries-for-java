/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.adhybridhealthservice.AssociatedObject;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The merged export error.
 */
public class MergedExportErrorInner {
    /**
     * The incoming object display name.
     */
    @JsonProperty(value = "incomingObjectDisplayName")
    private String incomingObjectDisplayName;

    /**
     * The incoming object type.
     */
    @JsonProperty(value = "incomingObjectType")
    private String incomingObjectType;

    /**
     * The user principal name.
     */
    @JsonProperty(value = "userPrincipalName")
    private String userPrincipalName;

    /**
     * The type of the error.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The attribute name.
     */
    @JsonProperty(value = "attributeName")
    private String attributeName;

    /**
     * The attribute value.
     */
    @JsonProperty(value = "attributeValue")
    private String attributeValue;

    /**
     * The date and time when the error occurred.
     */
    @JsonProperty(value = "timeOccurred")
    private DateTime timeOccurred;

    /**
     * The time when the error first occurred.
     */
    @JsonProperty(value = "timeFirstOccurred")
    private DateTime timeFirstOccurred;

    /**
     * the cs object Id.
     */
    @JsonProperty(value = "csObjectId")
    private String csObjectId;

    /**
     * the DN of the object.
     */
    @JsonProperty(value = "dn")
    private String dn;

    /**
     * The incoming object details.
     */
    @JsonProperty(value = "incomingObject")
    private AssociatedObject incomingObject;

    /**
     * The existing object.
     */
    @JsonProperty(value = "existingObject")
    private AssociatedObject existingObject;

    /**
     * The modified or removed attribute vlaue.
     */
    @JsonProperty(value = "modifiedOrRemovedAttributeValue")
    private String modifiedOrRemovedAttributeValue;

    /**
     * The run step result Id.
     */
    @JsonProperty(value = "runStepResultId")
    private UUID runStepResultId;

    /**
     * The sam account name.
     */
    @JsonProperty(value = "samAccountName")
    private String samAccountName;

    /**
     * The server error details.
     */
    @JsonProperty(value = "serverErrorDetail")
    private String serverErrorDetail;

    /**
     * The service Id.
     */
    @JsonProperty(value = "serviceId")
    private UUID serviceId;

    /**
     * The server Id.
     */
    @JsonProperty(value = "serviceMemberId")
    private UUID serviceMemberId;

    /**
     * The merged entity Id.
     */
    @JsonProperty(value = "mergedEntityId")
    private UUID mergedEntityId;

    /**
     * The date and time, in UTC, when the error was created.
     */
    @JsonProperty(value = "createdDate")
    private DateTime createdDate;

    /**
     * The export error status.
     */
    @JsonProperty(value = "exportErrorStatus")
    private Integer exportErrorStatus;

    /**
     * Get the incomingObjectDisplayName value.
     *
     * @return the incomingObjectDisplayName value
     */
    public String incomingObjectDisplayName() {
        return this.incomingObjectDisplayName;
    }

    /**
     * Set the incomingObjectDisplayName value.
     *
     * @param incomingObjectDisplayName the incomingObjectDisplayName value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withIncomingObjectDisplayName(String incomingObjectDisplayName) {
        this.incomingObjectDisplayName = incomingObjectDisplayName;
        return this;
    }

    /**
     * Get the incomingObjectType value.
     *
     * @return the incomingObjectType value
     */
    public String incomingObjectType() {
        return this.incomingObjectType;
    }

    /**
     * Set the incomingObjectType value.
     *
     * @param incomingObjectType the incomingObjectType value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withIncomingObjectType(String incomingObjectType) {
        this.incomingObjectType = incomingObjectType;
        return this;
    }

    /**
     * Get the userPrincipalName value.
     *
     * @return the userPrincipalName value
     */
    public String userPrincipalName() {
        return this.userPrincipalName;
    }

    /**
     * Set the userPrincipalName value.
     *
     * @param userPrincipalName the userPrincipalName value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the attributeName value.
     *
     * @return the attributeName value
     */
    public String attributeName() {
        return this.attributeName;
    }

    /**
     * Set the attributeName value.
     *
     * @param attributeName the attributeName value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * Get the attributeValue value.
     *
     * @return the attributeValue value
     */
    public String attributeValue() {
        return this.attributeValue;
    }

    /**
     * Set the attributeValue value.
     *
     * @param attributeValue the attributeValue value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }

    /**
     * Get the timeOccurred value.
     *
     * @return the timeOccurred value
     */
    public DateTime timeOccurred() {
        return this.timeOccurred;
    }

    /**
     * Set the timeOccurred value.
     *
     * @param timeOccurred the timeOccurred value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withTimeOccurred(DateTime timeOccurred) {
        this.timeOccurred = timeOccurred;
        return this;
    }

    /**
     * Get the timeFirstOccurred value.
     *
     * @return the timeFirstOccurred value
     */
    public DateTime timeFirstOccurred() {
        return this.timeFirstOccurred;
    }

    /**
     * Set the timeFirstOccurred value.
     *
     * @param timeFirstOccurred the timeFirstOccurred value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withTimeFirstOccurred(DateTime timeFirstOccurred) {
        this.timeFirstOccurred = timeFirstOccurred;
        return this;
    }

    /**
     * Get the csObjectId value.
     *
     * @return the csObjectId value
     */
    public String csObjectId() {
        return this.csObjectId;
    }

    /**
     * Set the csObjectId value.
     *
     * @param csObjectId the csObjectId value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withCsObjectId(String csObjectId) {
        this.csObjectId = csObjectId;
        return this;
    }

    /**
     * Get the dn value.
     *
     * @return the dn value
     */
    public String dn() {
        return this.dn;
    }

    /**
     * Set the dn value.
     *
     * @param dn the dn value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withDn(String dn) {
        this.dn = dn;
        return this;
    }

    /**
     * Get the incomingObject value.
     *
     * @return the incomingObject value
     */
    public AssociatedObject incomingObject() {
        return this.incomingObject;
    }

    /**
     * Set the incomingObject value.
     *
     * @param incomingObject the incomingObject value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withIncomingObject(AssociatedObject incomingObject) {
        this.incomingObject = incomingObject;
        return this;
    }

    /**
     * Get the existingObject value.
     *
     * @return the existingObject value
     */
    public AssociatedObject existingObject() {
        return this.existingObject;
    }

    /**
     * Set the existingObject value.
     *
     * @param existingObject the existingObject value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withExistingObject(AssociatedObject existingObject) {
        this.existingObject = existingObject;
        return this;
    }

    /**
     * Get the modifiedOrRemovedAttributeValue value.
     *
     * @return the modifiedOrRemovedAttributeValue value
     */
    public String modifiedOrRemovedAttributeValue() {
        return this.modifiedOrRemovedAttributeValue;
    }

    /**
     * Set the modifiedOrRemovedAttributeValue value.
     *
     * @param modifiedOrRemovedAttributeValue the modifiedOrRemovedAttributeValue value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withModifiedOrRemovedAttributeValue(String modifiedOrRemovedAttributeValue) {
        this.modifiedOrRemovedAttributeValue = modifiedOrRemovedAttributeValue;
        return this;
    }

    /**
     * Get the runStepResultId value.
     *
     * @return the runStepResultId value
     */
    public UUID runStepResultId() {
        return this.runStepResultId;
    }

    /**
     * Set the runStepResultId value.
     *
     * @param runStepResultId the runStepResultId value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withRunStepResultId(UUID runStepResultId) {
        this.runStepResultId = runStepResultId;
        return this;
    }

    /**
     * Get the samAccountName value.
     *
     * @return the samAccountName value
     */
    public String samAccountName() {
        return this.samAccountName;
    }

    /**
     * Set the samAccountName value.
     *
     * @param samAccountName the samAccountName value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withSamAccountName(String samAccountName) {
        this.samAccountName = samAccountName;
        return this;
    }

    /**
     * Get the serverErrorDetail value.
     *
     * @return the serverErrorDetail value
     */
    public String serverErrorDetail() {
        return this.serverErrorDetail;
    }

    /**
     * Set the serverErrorDetail value.
     *
     * @param serverErrorDetail the serverErrorDetail value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withServerErrorDetail(String serverErrorDetail) {
        this.serverErrorDetail = serverErrorDetail;
        return this;
    }

    /**
     * Get the serviceId value.
     *
     * @return the serviceId value
     */
    public UUID serviceId() {
        return this.serviceId;
    }

    /**
     * Set the serviceId value.
     *
     * @param serviceId the serviceId value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withServiceId(UUID serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Get the serviceMemberId value.
     *
     * @return the serviceMemberId value
     */
    public UUID serviceMemberId() {
        return this.serviceMemberId;
    }

    /**
     * Set the serviceMemberId value.
     *
     * @param serviceMemberId the serviceMemberId value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withServiceMemberId(UUID serviceMemberId) {
        this.serviceMemberId = serviceMemberId;
        return this;
    }

    /**
     * Get the mergedEntityId value.
     *
     * @return the mergedEntityId value
     */
    public UUID mergedEntityId() {
        return this.mergedEntityId;
    }

    /**
     * Set the mergedEntityId value.
     *
     * @param mergedEntityId the mergedEntityId value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withMergedEntityId(UUID mergedEntityId) {
        this.mergedEntityId = mergedEntityId;
        return this;
    }

    /**
     * Get the createdDate value.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Set the createdDate value.
     *
     * @param createdDate the createdDate value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get the exportErrorStatus value.
     *
     * @return the exportErrorStatus value
     */
    public Integer exportErrorStatus() {
        return this.exportErrorStatus;
    }

    /**
     * Set the exportErrorStatus value.
     *
     * @param exportErrorStatus the exportErrorStatus value to set
     * @return the MergedExportErrorInner object itself.
     */
    public MergedExportErrorInner withExportErrorStatus(Integer exportErrorStatus) {
        this.exportErrorStatus = exportErrorStatus;
        return this;
    }

}
