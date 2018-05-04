/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.adhybridhealthservice.ServerDisabledReason;
import com.microsoft.azure.management.adhybridhealthservice.Hotfix;
import com.microsoft.azure.management.adhybridhealthservice.MonitoringLevel;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The server details for ADDS service.
 */
public class AddsServiceMemberInner {
    /**
     * The domain name.
     */
    @JsonProperty(value = "domainName")
    private String domainName;

    /**
     * The site name.
     */
    @JsonProperty(value = "siteName")
    private String siteName;

    /**
     * The list of ADDS roles.
     */
    @JsonProperty(value = "addsRoles")
    private List<String> addsRoles;

    /**
     * Indicates if the global catalog for this domain is reachable or not.
     */
    @JsonProperty(value = "gcReachable")
    private Boolean gcReachable;

    /**
     * Indicates if the Dc is advertising or not.
     */
    @JsonProperty(value = "isAdvertising")
    private Boolean isAdvertising;

    /**
     * Indicates if the primary domain controller is reachable or not.
     */
    @JsonProperty(value = "pdcReachable")
    private Boolean pdcReachable;

    /**
     * Indicates if the SYSVOL state is healthy or not.
     */
    @JsonProperty(value = "sysvolState")
    private Boolean sysvolState;

    /**
     * The list of domain controller types.
     */
    @JsonProperty(value = "dcTypes")
    private List<String> dcTypes;

    /**
     * The id of the server.
     */
    @JsonProperty(value = "serviceMemberId")
    private String serviceMemberId;

    /**
     * The service id to whom this server belongs.
     */
    @JsonProperty(value = "serviceId")
    private String serviceId;

    /**
     * The tenant id to whom this server belongs.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * The total number of alerts that are currently active for the server.
     */
    @JsonProperty(value = "activeAlerts")
    private Integer activeAlerts;

    /**
     * The additional information, if any, for the server.
     */
    @JsonProperty(value = "additionalInformation")
    private String additionalInformation;

    /**
     * The date time , in UTC, when the server was onboaraded to Azure Active
     * Directory Connect Health.
     */
    @JsonProperty(value = "createdDate")
    private DateTime createdDate;

    /**
     * The server specific configuration related dimensions.
     */
    @JsonProperty(value = "dimensions")
    private List<ItemInner> dimensions;

    /**
     * Indicates if the server is disabled or not.
     */
    @JsonProperty(value = "disabled")
    private Boolean disabled;

    /**
     * The reason for disabling the server. Possible values include: 'None',
     * 'GdprStopCollection', 'DeletedFromPortal', 'DisabledDueToInactivity'.
     */
    @JsonProperty(value = "disabledReason")
    private ServerDisabledReason disabledReason;

    /**
     * The list of installed QFEs for the server.
     */
    @JsonProperty(value = "installedQfes")
    private List<Hotfix> installedQfes;

    /**
     * The date and time , in UTC, when the server was last disabled.
     */
    @JsonProperty(value = "lastDisabled")
    private DateTime lastDisabled;

    /**
     * The date and time, in UTC, when the server was last rebooted.
     */
    @JsonProperty(value = "lastReboot")
    private DateTime lastReboot;

    /**
     * The date and time, in UTC, when the server's data monitoring
     * configuration was last changed.
     */
    @JsonProperty(value = "lastServerReportedMonitoringLevelChange")
    private DateTime lastServerReportedMonitoringLevelChange;

    /**
     * The date and time, in UTC, when the server proeprties were last updated.
     */
    @JsonProperty(value = "lastUpdated")
    private DateTime lastUpdated;

    /**
     * The id of the machine.
     */
    @JsonProperty(value = "machineId")
    private String machineId;

    /**
     * The name of the server.
     */
    @JsonProperty(value = "machineName")
    private String machineName;

    /**
     * The monitoring configuration of the server which determines what
     * activities are monitored by Azure Active Directory Connect Health.
     */
    @JsonProperty(value = "monitoringConfigurationsComputed")
    private List<ItemInner> monitoringConfigurationsComputed;

    /**
     * The customized monitoring configuration of the server which determines
     * what activities are monitored by Azure Active Directory Connect Health.
     */
    @JsonProperty(value = "monitoringConfigurationsCustomized")
    private List<ItemInner> monitoringConfigurationsCustomized;

    /**
     * The name of the operating system installed in the machine.
     */
    @JsonProperty(value = "osName")
    private String osName;

    /**
     * The version of the operating system installed in the machine.
     */
    @JsonProperty(value = "osVersion")
    private String osVersion;

    /**
     * Server specific properties.
     */
    @JsonProperty(value = "properties")
    private List<ItemInner> properties;

    /**
     * The list of recommended hotfixes for the server.
     */
    @JsonProperty(value = "recommendedQfes")
    private List<Hotfix> recommendedQfes;

    /**
     * The total count of alerts that are resolved for this server.
     */
    @JsonProperty(value = "resolvedAlerts")
    private Integer resolvedAlerts;

    /**
     * The service role that is being monitored in the server.
     */
    @JsonProperty(value = "role")
    private String role;

    /**
     * The monitoring level reported by the server. Possible values include:
     * 'Partial', 'Full', 'Off'.
     */
    @JsonProperty(value = "serverReportedMonitoringLevel")
    private MonitoringLevel serverReportedMonitoringLevel;

    /**
     * The health status of the server.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Get the domainName value.
     *
     * @return the domainName value
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Set the domainName value.
     *
     * @param domainName the domainName value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Get the siteName value.
     *
     * @return the siteName value
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Set the siteName value.
     *
     * @param siteName the siteName value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * Get the addsRoles value.
     *
     * @return the addsRoles value
     */
    public List<String> addsRoles() {
        return this.addsRoles;
    }

    /**
     * Set the addsRoles value.
     *
     * @param addsRoles the addsRoles value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withAddsRoles(List<String> addsRoles) {
        this.addsRoles = addsRoles;
        return this;
    }

    /**
     * Get the gcReachable value.
     *
     * @return the gcReachable value
     */
    public Boolean gcReachable() {
        return this.gcReachable;
    }

    /**
     * Set the gcReachable value.
     *
     * @param gcReachable the gcReachable value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withGcReachable(Boolean gcReachable) {
        this.gcReachable = gcReachable;
        return this;
    }

    /**
     * Get the isAdvertising value.
     *
     * @return the isAdvertising value
     */
    public Boolean isAdvertising() {
        return this.isAdvertising;
    }

    /**
     * Set the isAdvertising value.
     *
     * @param isAdvertising the isAdvertising value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withIsAdvertising(Boolean isAdvertising) {
        this.isAdvertising = isAdvertising;
        return this;
    }

    /**
     * Get the pdcReachable value.
     *
     * @return the pdcReachable value
     */
    public Boolean pdcReachable() {
        return this.pdcReachable;
    }

    /**
     * Set the pdcReachable value.
     *
     * @param pdcReachable the pdcReachable value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withPdcReachable(Boolean pdcReachable) {
        this.pdcReachable = pdcReachable;
        return this;
    }

    /**
     * Get the sysvolState value.
     *
     * @return the sysvolState value
     */
    public Boolean sysvolState() {
        return this.sysvolState;
    }

    /**
     * Set the sysvolState value.
     *
     * @param sysvolState the sysvolState value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withSysvolState(Boolean sysvolState) {
        this.sysvolState = sysvolState;
        return this;
    }

    /**
     * Get the dcTypes value.
     *
     * @return the dcTypes value
     */
    public List<String> dcTypes() {
        return this.dcTypes;
    }

    /**
     * Set the dcTypes value.
     *
     * @param dcTypes the dcTypes value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withDcTypes(List<String> dcTypes) {
        this.dcTypes = dcTypes;
        return this;
    }

    /**
     * Get the serviceMemberId value.
     *
     * @return the serviceMemberId value
     */
    public String serviceMemberId() {
        return this.serviceMemberId;
    }

    /**
     * Set the serviceMemberId value.
     *
     * @param serviceMemberId the serviceMemberId value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withServiceMemberId(String serviceMemberId) {
        this.serviceMemberId = serviceMemberId;
        return this;
    }

    /**
     * Get the serviceId value.
     *
     * @return the serviceId value
     */
    public String serviceId() {
        return this.serviceId;
    }

    /**
     * Set the serviceId value.
     *
     * @param serviceId the serviceId value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId value.
     *
     * @param tenantId the tenantId value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the activeAlerts value.
     *
     * @return the activeAlerts value
     */
    public Integer activeAlerts() {
        return this.activeAlerts;
    }

    /**
     * Set the activeAlerts value.
     *
     * @param activeAlerts the activeAlerts value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withActiveAlerts(Integer activeAlerts) {
        this.activeAlerts = activeAlerts;
        return this;
    }

    /**
     * Get the additionalInformation value.
     *
     * @return the additionalInformation value
     */
    public String additionalInformation() {
        return this.additionalInformation;
    }

    /**
     * Set the additionalInformation value.
     *
     * @param additionalInformation the additionalInformation value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withAdditionalInformation(String additionalInformation) {
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
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get the dimensions value.
     *
     * @return the dimensions value
     */
    public List<ItemInner> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions value.
     *
     * @param dimensions the dimensions value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withDimensions(List<ItemInner> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the disabled value.
     *
     * @return the disabled value
     */
    public Boolean disabled() {
        return this.disabled;
    }

    /**
     * Set the disabled value.
     *
     * @param disabled the disabled value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Get the disabledReason value.
     *
     * @return the disabledReason value
     */
    public ServerDisabledReason disabledReason() {
        return this.disabledReason;
    }

    /**
     * Set the disabledReason value.
     *
     * @param disabledReason the disabledReason value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withDisabledReason(ServerDisabledReason disabledReason) {
        this.disabledReason = disabledReason;
        return this;
    }

    /**
     * Get the installedQfes value.
     *
     * @return the installedQfes value
     */
    public List<Hotfix> installedQfes() {
        return this.installedQfes;
    }

    /**
     * Set the installedQfes value.
     *
     * @param installedQfes the installedQfes value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withInstalledQfes(List<Hotfix> installedQfes) {
        this.installedQfes = installedQfes;
        return this;
    }

    /**
     * Get the lastDisabled value.
     *
     * @return the lastDisabled value
     */
    public DateTime lastDisabled() {
        return this.lastDisabled;
    }

    /**
     * Set the lastDisabled value.
     *
     * @param lastDisabled the lastDisabled value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withLastDisabled(DateTime lastDisabled) {
        this.lastDisabled = lastDisabled;
        return this;
    }

    /**
     * Get the lastReboot value.
     *
     * @return the lastReboot value
     */
    public DateTime lastReboot() {
        return this.lastReboot;
    }

    /**
     * Set the lastReboot value.
     *
     * @param lastReboot the lastReboot value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withLastReboot(DateTime lastReboot) {
        this.lastReboot = lastReboot;
        return this;
    }

    /**
     * Get the lastServerReportedMonitoringLevelChange value.
     *
     * @return the lastServerReportedMonitoringLevelChange value
     */
    public DateTime lastServerReportedMonitoringLevelChange() {
        return this.lastServerReportedMonitoringLevelChange;
    }

    /**
     * Set the lastServerReportedMonitoringLevelChange value.
     *
     * @param lastServerReportedMonitoringLevelChange the lastServerReportedMonitoringLevelChange value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withLastServerReportedMonitoringLevelChange(DateTime lastServerReportedMonitoringLevelChange) {
        this.lastServerReportedMonitoringLevelChange = lastServerReportedMonitoringLevelChange;
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
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withLastUpdated(DateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * Get the machineId value.
     *
     * @return the machineId value
     */
    public String machineId() {
        return this.machineId;
    }

    /**
     * Set the machineId value.
     *
     * @param machineId the machineId value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withMachineId(String machineId) {
        this.machineId = machineId;
        return this;
    }

    /**
     * Get the machineName value.
     *
     * @return the machineName value
     */
    public String machineName() {
        return this.machineName;
    }

    /**
     * Set the machineName value.
     *
     * @param machineName the machineName value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }

    /**
     * Get the monitoringConfigurationsComputed value.
     *
     * @return the monitoringConfigurationsComputed value
     */
    public List<ItemInner> monitoringConfigurationsComputed() {
        return this.monitoringConfigurationsComputed;
    }

    /**
     * Set the monitoringConfigurationsComputed value.
     *
     * @param monitoringConfigurationsComputed the monitoringConfigurationsComputed value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withMonitoringConfigurationsComputed(List<ItemInner> monitoringConfigurationsComputed) {
        this.monitoringConfigurationsComputed = monitoringConfigurationsComputed;
        return this;
    }

    /**
     * Get the monitoringConfigurationsCustomized value.
     *
     * @return the monitoringConfigurationsCustomized value
     */
    public List<ItemInner> monitoringConfigurationsCustomized() {
        return this.monitoringConfigurationsCustomized;
    }

    /**
     * Set the monitoringConfigurationsCustomized value.
     *
     * @param monitoringConfigurationsCustomized the monitoringConfigurationsCustomized value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withMonitoringConfigurationsCustomized(List<ItemInner> monitoringConfigurationsCustomized) {
        this.monitoringConfigurationsCustomized = monitoringConfigurationsCustomized;
        return this;
    }

    /**
     * Get the osName value.
     *
     * @return the osName value
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Set the osName value.
     *
     * @param osName the osName value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * Get the osVersion value.
     *
     * @return the osVersion value
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set the osVersion value.
     *
     * @param osVersion the osVersion value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<ItemInner> properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withProperties(List<ItemInner> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the recommendedQfes value.
     *
     * @return the recommendedQfes value
     */
    public List<Hotfix> recommendedQfes() {
        return this.recommendedQfes;
    }

    /**
     * Set the recommendedQfes value.
     *
     * @param recommendedQfes the recommendedQfes value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withRecommendedQfes(List<Hotfix> recommendedQfes) {
        this.recommendedQfes = recommendedQfes;
        return this;
    }

    /**
     * Get the resolvedAlerts value.
     *
     * @return the resolvedAlerts value
     */
    public Integer resolvedAlerts() {
        return this.resolvedAlerts;
    }

    /**
     * Set the resolvedAlerts value.
     *
     * @param resolvedAlerts the resolvedAlerts value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withResolvedAlerts(Integer resolvedAlerts) {
        this.resolvedAlerts = resolvedAlerts;
        return this;
    }

    /**
     * Get the role value.
     *
     * @return the role value
     */
    public String role() {
        return this.role;
    }

    /**
     * Set the role value.
     *
     * @param role the role value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Get the serverReportedMonitoringLevel value.
     *
     * @return the serverReportedMonitoringLevel value
     */
    public MonitoringLevel serverReportedMonitoringLevel() {
        return this.serverReportedMonitoringLevel;
    }

    /**
     * Set the serverReportedMonitoringLevel value.
     *
     * @param serverReportedMonitoringLevel the serverReportedMonitoringLevel value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withServerReportedMonitoringLevel(MonitoringLevel serverReportedMonitoringLevel) {
        this.serverReportedMonitoringLevel = serverReportedMonitoringLevel;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the AddsServiceMemberInner object itself.
     */
    public AddsServiceMemberInner withStatus(String status) {
        this.status = status;
        return this;
    }

}