/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import java.util.UUID;
import com.microsoft.azure.management.adhybridhealthservice.Level;
import com.microsoft.azure.management.adhybridhealthservice.State;
import java.util.List;
import com.microsoft.azure.management.adhybridhealthservice.HelpLink;
import com.microsoft.azure.management.adhybridhealthservice.AdditionalInformation;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The alert details indicating an issue with service or server.
 */
public class AlertInner {
    /**
     * The alert Id.
     */
    @JsonProperty(value = "alertId")
    private UUID alertId;

    /**
     * The alert level which indicates the severity of the alert. Possible
     * values include: 'Warning', 'Error', 'PreWarning'.
     */
    @JsonProperty(value = "level")
    private Level level;

    /**
     * The alert state which can be either active or resolved with multile
     * resolution types. Possible values include: 'Active',
     * 'ResolvedByPositiveResult', 'ResolvedManually', 'ResolvedByTimer',
     * 'ResolvedByStateChange'.
     */
    @JsonProperty(value = "state")
    private State state;

    /**
     * The alert short name.
     */
    @JsonProperty(value = "shortName")
    private String shortName;

    /**
     * The display name for the alert.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The alert description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The alert remediation.
     */
    @JsonProperty(value = "remediation")
    private String remediation;

    /**
     * The help links to get more information related to the alert.
     */
    @JsonProperty(value = "relatedLinks")
    private List<HelpLink> relatedLinks;

    /**
     * The scope of the alert. Indicates if it is a service or a server related
     * alert.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /**
     * Additional information related to the alert.
     */
    @JsonProperty(value = "additionalInformation")
    private List<AdditionalInformation> additionalInformation;

    /**
     * The date and time,in UTC,when the alert was created.
     */
    @JsonProperty(value = "createdDate")
    private DateTime createdDate;

    /**
     * The date and time, in UTC, when the alert was resolved.
     */
    @JsonProperty(value = "resolvedDate")
    private DateTime resolvedDate;

    /**
     * The date and time, in UTC, when the alert was last updated.
     */
    @JsonProperty(value = "lastUpdated")
    private DateTime lastUpdated;

    /**
     * The monitoring role type for which the alert was raised.
     */
    @JsonProperty(value = "monitorRoleType")
    private String monitorRoleType;

    /**
     * The active alert properties.
     */
    @JsonProperty(value = "activeAlertProperties")
    private Object activeAlertProperties;

    /**
     * The active alert properties.
     */
    @JsonProperty(value = "resolvedAlertProperties")
    private Object resolvedAlertProperties;

    /**
     * The tenant Id.
     */
    @JsonProperty(value = "tenantId")
    private UUID tenantId;

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
     * Get the alertId value.
     *
     * @return the alertId value
     */
    public UUID alertId() {
        return this.alertId;
    }

    /**
     * Set the alertId value.
     *
     * @param alertId the alertId value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withAlertId(UUID alertId) {
        this.alertId = alertId;
        return this;
    }

    /**
     * Get the level value.
     *
     * @return the level value
     */
    public Level level() {
        return this.level;
    }

    /**
     * Set the level value.
     *
     * @param level the level value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withLevel(Level level) {
        this.level = level;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public State state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withState(State state) {
        this.state = state;
        return this;
    }

    /**
     * Get the shortName value.
     *
     * @return the shortName value
     */
    public String shortName() {
        return this.shortName;
    }

    /**
     * Set the shortName value.
     *
     * @param shortName the shortName value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the remediation value.
     *
     * @return the remediation value
     */
    public String remediation() {
        return this.remediation;
    }

    /**
     * Set the remediation value.
     *
     * @param remediation the remediation value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withRemediation(String remediation) {
        this.remediation = remediation;
        return this;
    }

    /**
     * Get the relatedLinks value.
     *
     * @return the relatedLinks value
     */
    public List<HelpLink> relatedLinks() {
        return this.relatedLinks;
    }

    /**
     * Set the relatedLinks value.
     *
     * @param relatedLinks the relatedLinks value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withRelatedLinks(List<HelpLink> relatedLinks) {
        this.relatedLinks = relatedLinks;
        return this;
    }

    /**
     * Get the scope value.
     *
     * @return the scope value
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope value.
     *
     * @param scope the scope value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the additionalInformation value.
     *
     * @return the additionalInformation value
     */
    public List<AdditionalInformation> additionalInformation() {
        return this.additionalInformation;
    }

    /**
     * Set the additionalInformation value.
     *
     * @param additionalInformation the additionalInformation value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withAdditionalInformation(List<AdditionalInformation> additionalInformation) {
        this.additionalInformation = additionalInformation;
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
     * @return the AlertInner object itself.
     */
    public AlertInner withCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get the resolvedDate value.
     *
     * @return the resolvedDate value
     */
    public DateTime resolvedDate() {
        return this.resolvedDate;
    }

    /**
     * Set the resolvedDate value.
     *
     * @param resolvedDate the resolvedDate value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withResolvedDate(DateTime resolvedDate) {
        this.resolvedDate = resolvedDate;
        return this;
    }

    /**
     * Get the lastUpdated value.
     *
     * @return the lastUpdated value
     */
    public DateTime lastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Set the lastUpdated value.
     *
     * @param lastUpdated the lastUpdated value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withLastUpdated(DateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * Get the monitorRoleType value.
     *
     * @return the monitorRoleType value
     */
    public String monitorRoleType() {
        return this.monitorRoleType;
    }

    /**
     * Set the monitorRoleType value.
     *
     * @param monitorRoleType the monitorRoleType value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withMonitorRoleType(String monitorRoleType) {
        this.monitorRoleType = monitorRoleType;
        return this;
    }

    /**
     * Get the activeAlertProperties value.
     *
     * @return the activeAlertProperties value
     */
    public Object activeAlertProperties() {
        return this.activeAlertProperties;
    }

    /**
     * Set the activeAlertProperties value.
     *
     * @param activeAlertProperties the activeAlertProperties value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withActiveAlertProperties(Object activeAlertProperties) {
        this.activeAlertProperties = activeAlertProperties;
        return this;
    }

    /**
     * Get the resolvedAlertProperties value.
     *
     * @return the resolvedAlertProperties value
     */
    public Object resolvedAlertProperties() {
        return this.resolvedAlertProperties;
    }

    /**
     * Set the resolvedAlertProperties value.
     *
     * @param resolvedAlertProperties the resolvedAlertProperties value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withResolvedAlertProperties(Object resolvedAlertProperties) {
        this.resolvedAlertProperties = resolvedAlertProperties;
        return this;
    }

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId value.
     *
     * @param tenantId the tenantId value to set
     * @return the AlertInner object itself.
     */
    public AlertInner withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
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
     * @return the AlertInner object itself.
     */
    public AlertInner withServiceId(UUID serviceId) {
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
     * @return the AlertInner object itself.
     */
    public AlertInner withServiceMemberId(UUID serviceMemberId) {
        this.serviceMemberId = serviceMemberId;
        return this;
    }

}
