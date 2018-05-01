/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The export error details.
 */
public class ExportError {
    /**
     * The error Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The run step result Id.
     */
    @JsonProperty(value = "runStepResultId")
    private String runStepResultId;

    /**
     * The connector Id.
     */
    @JsonProperty(value = "connectorId")
    private String connectorId;

    /**
     * The type of error.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The error code.
     */
    @JsonProperty(value = "errorCode")
    private String errorCode;

    /**
     * The export error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * The server error detail.
     */
    @JsonProperty(value = "servverErrorDetail")
    private String servverErrorDetail;

    /**
     * The date and time when the export error first occured.
     */
    @JsonProperty(value = "timeFirstOccured")
    private DateTime timeFirstOccured;

    /**
     * The retry count.
     */
    @JsonProperty(value = "retryCount")
    private Integer retryCount;

    /**
     * The cloud object Id.
     */
    @JsonProperty(value = "csObjectId")
    private String csObjectId;

    /**
     * The distinguished name.
     */
    @JsonProperty(value = "dn")
    private String dn;

    /**
     * The minimum limit.
     */
    @JsonProperty(value = "minLimit")
    private String minLimit;

    /**
     * The maximum limit.
     */
    @JsonProperty(value = "maxLimit")
    private String maxLimit;

    /**
     * The name of the cloud anchor.
     */
    @JsonProperty(value = "cloudAnchor")
    private String cloudAnchor;

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
     * Indicates if the attribute is multi valued or not.
     */
    @JsonProperty(value = "attributeMultiValue")
    private Boolean attributeMultiValue;

    /**
     * The object Id with which there was an attribute conflict.
     */
    @JsonProperty(value = "objectIdConflict")
    private String objectIdConflict;

    /**
     * The SAM account name.
     */
    @JsonProperty(value = "samAccountName")
    private String samAccountName;

    /**
     * The AD object type.
     */
    @JsonProperty(value = "adObjectType")
    private String adObjectType;

    /**
     * The AD object guid.
     */
    @JsonProperty(value = "adObjectGuid")
    private String adObjectGuid;

    /**
     * The display name for the AD object.
     */
    @JsonProperty(value = "adDisplayName")
    private String adDisplayName;

    /**
     * The source of authority for the AD object.
     */
    @JsonProperty(value = "adSourceOfAuthority")
    private String adSourceOfAuthority;

    /**
     * The AD source anchor.
     */
    @JsonProperty(value = "adSourceAnchor")
    private String adSourceAnchor;

    /**
     * The user principal name for the AD object.
     */
    @JsonProperty(value = "adUserPrincipalName")
    private String adUserPrincipalName;

    /**
     * The distinguished name for the AD object.
     */
    @JsonProperty(value = "adDistinguishedName")
    private String adDistinguishedName;

    /**
     * The email for the AD object.
     */
    @JsonProperty(value = "adMail")
    private String adMail;

    /**
     * The date and time of occurance.
     */
    @JsonProperty(value = "timeOccured")
    private DateTime timeOccured;

    /**
     * The AAD side object type.
     */
    @JsonProperty(value = "aadObjectType")
    private String aadObjectType;

    /**
     * The AAD side object guid.
     */
    @JsonProperty(value = "aadObjectGuid")
    private String aadObjectGuid;

    /**
     * The AAD side display name.
     */
    @JsonProperty(value = "aadDisplayName")
    private String aadDisplayName;

    /**
     * The AAD side source of authority for the object.
     */
    @JsonProperty(value = "aadSourceOfAuthority")
    private String aadSourceOfAuthority;

    /**
     * The AAD side user principal name.
     */
    @JsonProperty(value = "aadUserPrincipalName")
    private String aadUserPrincipalName;

    /**
     * The AAD side distinguished name for the object.
     */
    @JsonProperty(value = "aadDistringuishedName")
    private String aadDistringuishedName;

    /**
     * The AAD side email for the object.
     */
    @JsonProperty(value = "aadMail")
    private String aadMail;

    /**
     * The date and time of last sync run.
     */
    @JsonProperty(value = "lastDirSyncTime")
    private DateTime lastDirSyncTime;

    /**
     * The modified atttribute value.
     */
    @JsonProperty(value = "modifiedAttributeValue")
    private String modifiedAttributeValue;

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
     * @return the ExportError object itself.
     */
    public ExportError withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the runStepResultId value.
     *
     * @return the runStepResultId value
     */
    public String runStepResultId() {
        return this.runStepResultId;
    }

    /**
     * Set the runStepResultId value.
     *
     * @param runStepResultId the runStepResultId value to set
     * @return the ExportError object itself.
     */
    public ExportError withRunStepResultId(String runStepResultId) {
        this.runStepResultId = runStepResultId;
        return this;
    }

    /**
     * Get the connectorId value.
     *
     * @return the connectorId value
     */
    public String connectorId() {
        return this.connectorId;
    }

    /**
     * Set the connectorId value.
     *
     * @param connectorId the connectorId value to set
     * @return the ExportError object itself.
     */
    public ExportError withConnectorId(String connectorId) {
        this.connectorId = connectorId;
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
     * @return the ExportError object itself.
     */
    public ExportError withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the errorCode value.
     *
     * @return the errorCode value
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode value.
     *
     * @param errorCode the errorCode value to set
     * @return the ExportError object itself.
     */
    public ExportError withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the ExportError object itself.
     */
    public ExportError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the servverErrorDetail value.
     *
     * @return the servverErrorDetail value
     */
    public String servverErrorDetail() {
        return this.servverErrorDetail;
    }

    /**
     * Set the servverErrorDetail value.
     *
     * @param servverErrorDetail the servverErrorDetail value to set
     * @return the ExportError object itself.
     */
    public ExportError withServverErrorDetail(String servverErrorDetail) {
        this.servverErrorDetail = servverErrorDetail;
        return this;
    }

    /**
     * Get the timeFirstOccured value.
     *
     * @return the timeFirstOccured value
     */
    public DateTime timeFirstOccured() {
        return this.timeFirstOccured;
    }

    /**
     * Set the timeFirstOccured value.
     *
     * @param timeFirstOccured the timeFirstOccured value to set
     * @return the ExportError object itself.
     */
    public ExportError withTimeFirstOccured(DateTime timeFirstOccured) {
        this.timeFirstOccured = timeFirstOccured;
        return this;
    }

    /**
     * Get the retryCount value.
     *
     * @return the retryCount value
     */
    public Integer retryCount() {
        return this.retryCount;
    }

    /**
     * Set the retryCount value.
     *
     * @param retryCount the retryCount value to set
     * @return the ExportError object itself.
     */
    public ExportError withRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
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
     * @return the ExportError object itself.
     */
    public ExportError withCsObjectId(String csObjectId) {
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
     * @return the ExportError object itself.
     */
    public ExportError withDn(String dn) {
        this.dn = dn;
        return this;
    }

    /**
     * Get the minLimit value.
     *
     * @return the minLimit value
     */
    public String minLimit() {
        return this.minLimit;
    }

    /**
     * Set the minLimit value.
     *
     * @param minLimit the minLimit value to set
     * @return the ExportError object itself.
     */
    public ExportError withMinLimit(String minLimit) {
        this.minLimit = minLimit;
        return this;
    }

    /**
     * Get the maxLimit value.
     *
     * @return the maxLimit value
     */
    public String maxLimit() {
        return this.maxLimit;
    }

    /**
     * Set the maxLimit value.
     *
     * @param maxLimit the maxLimit value to set
     * @return the ExportError object itself.
     */
    public ExportError withMaxLimit(String maxLimit) {
        this.maxLimit = maxLimit;
        return this;
    }

    /**
     * Get the cloudAnchor value.
     *
     * @return the cloudAnchor value
     */
    public String cloudAnchor() {
        return this.cloudAnchor;
    }

    /**
     * Set the cloudAnchor value.
     *
     * @param cloudAnchor the cloudAnchor value to set
     * @return the ExportError object itself.
     */
    public ExportError withCloudAnchor(String cloudAnchor) {
        this.cloudAnchor = cloudAnchor;
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
     * @return the ExportError object itself.
     */
    public ExportError withAttributeName(String attributeName) {
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
     * @return the ExportError object itself.
     */
    public ExportError withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }

    /**
     * Get the attributeMultiValue value.
     *
     * @return the attributeMultiValue value
     */
    public Boolean attributeMultiValue() {
        return this.attributeMultiValue;
    }

    /**
     * Set the attributeMultiValue value.
     *
     * @param attributeMultiValue the attributeMultiValue value to set
     * @return the ExportError object itself.
     */
    public ExportError withAttributeMultiValue(Boolean attributeMultiValue) {
        this.attributeMultiValue = attributeMultiValue;
        return this;
    }

    /**
     * Get the objectIdConflict value.
     *
     * @return the objectIdConflict value
     */
    public String objectIdConflict() {
        return this.objectIdConflict;
    }

    /**
     * Set the objectIdConflict value.
     *
     * @param objectIdConflict the objectIdConflict value to set
     * @return the ExportError object itself.
     */
    public ExportError withObjectIdConflict(String objectIdConflict) {
        this.objectIdConflict = objectIdConflict;
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
     * @return the ExportError object itself.
     */
    public ExportError withSamAccountName(String samAccountName) {
        this.samAccountName = samAccountName;
        return this;
    }

    /**
     * Get the adObjectType value.
     *
     * @return the adObjectType value
     */
    public String adObjectType() {
        return this.adObjectType;
    }

    /**
     * Set the adObjectType value.
     *
     * @param adObjectType the adObjectType value to set
     * @return the ExportError object itself.
     */
    public ExportError withAdObjectType(String adObjectType) {
        this.adObjectType = adObjectType;
        return this;
    }

    /**
     * Get the adObjectGuid value.
     *
     * @return the adObjectGuid value
     */
    public String adObjectGuid() {
        return this.adObjectGuid;
    }

    /**
     * Set the adObjectGuid value.
     *
     * @param adObjectGuid the adObjectGuid value to set
     * @return the ExportError object itself.
     */
    public ExportError withAdObjectGuid(String adObjectGuid) {
        this.adObjectGuid = adObjectGuid;
        return this;
    }

    /**
     * Get the adDisplayName value.
     *
     * @return the adDisplayName value
     */
    public String adDisplayName() {
        return this.adDisplayName;
    }

    /**
     * Set the adDisplayName value.
     *
     * @param adDisplayName the adDisplayName value to set
     * @return the ExportError object itself.
     */
    public ExportError withAdDisplayName(String adDisplayName) {
        this.adDisplayName = adDisplayName;
        return this;
    }

    /**
     * Get the adSourceOfAuthority value.
     *
     * @return the adSourceOfAuthority value
     */
    public String adSourceOfAuthority() {
        return this.adSourceOfAuthority;
    }

    /**
     * Set the adSourceOfAuthority value.
     *
     * @param adSourceOfAuthority the adSourceOfAuthority value to set
     * @return the ExportError object itself.
     */
    public ExportError withAdSourceOfAuthority(String adSourceOfAuthority) {
        this.adSourceOfAuthority = adSourceOfAuthority;
        return this;
    }

    /**
     * Get the adSourceAnchor value.
     *
     * @return the adSourceAnchor value
     */
    public String adSourceAnchor() {
        return this.adSourceAnchor;
    }

    /**
     * Set the adSourceAnchor value.
     *
     * @param adSourceAnchor the adSourceAnchor value to set
     * @return the ExportError object itself.
     */
    public ExportError withAdSourceAnchor(String adSourceAnchor) {
        this.adSourceAnchor = adSourceAnchor;
        return this;
    }

    /**
     * Get the adUserPrincipalName value.
     *
     * @return the adUserPrincipalName value
     */
    public String adUserPrincipalName() {
        return this.adUserPrincipalName;
    }

    /**
     * Set the adUserPrincipalName value.
     *
     * @param adUserPrincipalName the adUserPrincipalName value to set
     * @return the ExportError object itself.
     */
    public ExportError withAdUserPrincipalName(String adUserPrincipalName) {
        this.adUserPrincipalName = adUserPrincipalName;
        return this;
    }

    /**
     * Get the adDistinguishedName value.
     *
     * @return the adDistinguishedName value
     */
    public String adDistinguishedName() {
        return this.adDistinguishedName;
    }

    /**
     * Set the adDistinguishedName value.
     *
     * @param adDistinguishedName the adDistinguishedName value to set
     * @return the ExportError object itself.
     */
    public ExportError withAdDistinguishedName(String adDistinguishedName) {
        this.adDistinguishedName = adDistinguishedName;
        return this;
    }

    /**
     * Get the adMail value.
     *
     * @return the adMail value
     */
    public String adMail() {
        return this.adMail;
    }

    /**
     * Set the adMail value.
     *
     * @param adMail the adMail value to set
     * @return the ExportError object itself.
     */
    public ExportError withAdMail(String adMail) {
        this.adMail = adMail;
        return this;
    }

    /**
     * Get the timeOccured value.
     *
     * @return the timeOccured value
     */
    public DateTime timeOccured() {
        return this.timeOccured;
    }

    /**
     * Set the timeOccured value.
     *
     * @param timeOccured the timeOccured value to set
     * @return the ExportError object itself.
     */
    public ExportError withTimeOccured(DateTime timeOccured) {
        this.timeOccured = timeOccured;
        return this;
    }

    /**
     * Get the aadObjectType value.
     *
     * @return the aadObjectType value
     */
    public String aadObjectType() {
        return this.aadObjectType;
    }

    /**
     * Set the aadObjectType value.
     *
     * @param aadObjectType the aadObjectType value to set
     * @return the ExportError object itself.
     */
    public ExportError withAadObjectType(String aadObjectType) {
        this.aadObjectType = aadObjectType;
        return this;
    }

    /**
     * Get the aadObjectGuid value.
     *
     * @return the aadObjectGuid value
     */
    public String aadObjectGuid() {
        return this.aadObjectGuid;
    }

    /**
     * Set the aadObjectGuid value.
     *
     * @param aadObjectGuid the aadObjectGuid value to set
     * @return the ExportError object itself.
     */
    public ExportError withAadObjectGuid(String aadObjectGuid) {
        this.aadObjectGuid = aadObjectGuid;
        return this;
    }

    /**
     * Get the aadDisplayName value.
     *
     * @return the aadDisplayName value
     */
    public String aadDisplayName() {
        return this.aadDisplayName;
    }

    /**
     * Set the aadDisplayName value.
     *
     * @param aadDisplayName the aadDisplayName value to set
     * @return the ExportError object itself.
     */
    public ExportError withAadDisplayName(String aadDisplayName) {
        this.aadDisplayName = aadDisplayName;
        return this;
    }

    /**
     * Get the aadSourceOfAuthority value.
     *
     * @return the aadSourceOfAuthority value
     */
    public String aadSourceOfAuthority() {
        return this.aadSourceOfAuthority;
    }

    /**
     * Set the aadSourceOfAuthority value.
     *
     * @param aadSourceOfAuthority the aadSourceOfAuthority value to set
     * @return the ExportError object itself.
     */
    public ExportError withAadSourceOfAuthority(String aadSourceOfAuthority) {
        this.aadSourceOfAuthority = aadSourceOfAuthority;
        return this;
    }

    /**
     * Get the aadUserPrincipalName value.
     *
     * @return the aadUserPrincipalName value
     */
    public String aadUserPrincipalName() {
        return this.aadUserPrincipalName;
    }

    /**
     * Set the aadUserPrincipalName value.
     *
     * @param aadUserPrincipalName the aadUserPrincipalName value to set
     * @return the ExportError object itself.
     */
    public ExportError withAadUserPrincipalName(String aadUserPrincipalName) {
        this.aadUserPrincipalName = aadUserPrincipalName;
        return this;
    }

    /**
     * Get the aadDistringuishedName value.
     *
     * @return the aadDistringuishedName value
     */
    public String aadDistringuishedName() {
        return this.aadDistringuishedName;
    }

    /**
     * Set the aadDistringuishedName value.
     *
     * @param aadDistringuishedName the aadDistringuishedName value to set
     * @return the ExportError object itself.
     */
    public ExportError withAadDistringuishedName(String aadDistringuishedName) {
        this.aadDistringuishedName = aadDistringuishedName;
        return this;
    }

    /**
     * Get the aadMail value.
     *
     * @return the aadMail value
     */
    public String aadMail() {
        return this.aadMail;
    }

    /**
     * Set the aadMail value.
     *
     * @param aadMail the aadMail value to set
     * @return the ExportError object itself.
     */
    public ExportError withAadMail(String aadMail) {
        this.aadMail = aadMail;
        return this;
    }

    /**
     * Get the lastDirSyncTime value.
     *
     * @return the lastDirSyncTime value
     */
    public DateTime lastDirSyncTime() {
        return this.lastDirSyncTime;
    }

    /**
     * Set the lastDirSyncTime value.
     *
     * @param lastDirSyncTime the lastDirSyncTime value to set
     * @return the ExportError object itself.
     */
    public ExportError withLastDirSyncTime(DateTime lastDirSyncTime) {
        this.lastDirSyncTime = lastDirSyncTime;
        return this;
    }

    /**
     * Get the modifiedAttributeValue value.
     *
     * @return the modifiedAttributeValue value
     */
    public String modifiedAttributeValue() {
        return this.modifiedAttributeValue;
    }

    /**
     * Set the modifiedAttributeValue value.
     *
     * @param modifiedAttributeValue the modifiedAttributeValue value to set
     * @return the ExportError object itself.
     */
    public ExportError withModifiedAttributeValue(String modifiedAttributeValue) {
        this.modifiedAttributeValue = modifiedAttributeValue;
        return this;
    }

}
