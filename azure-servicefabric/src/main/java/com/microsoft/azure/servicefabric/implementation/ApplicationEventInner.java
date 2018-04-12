/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Represents the base for all Application Events.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ApplicationEvent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ApplicationCreated", value = ApplicationCreatedEvent.class),
    @JsonSubTypes.Type(name = "ApplicationDeleted", value = ApplicationDeletedEvent.class),
    @JsonSubTypes.Type(name = "ApplicationHealthReportCreated", value = ApplicationHealthReportCreatedEvent.class),
    @JsonSubTypes.Type(name = "ApplicationHealthReportExpired", value = ApplicationHealthReportExpiredEvent.class),
    @JsonSubTypes.Type(name = "ApplicationUpgradeComplete", value = ApplicationUpgradeCompleteEvent.class),
    @JsonSubTypes.Type(name = "ApplicationUpgradeDomainComplete", value = ApplicationUpgradeDomainCompleteEvent.class),
    @JsonSubTypes.Type(name = "ApplicationUpgradeRollbackComplete", value = ApplicationUpgradeRollbackCompleteEvent.class),
    @JsonSubTypes.Type(name = "ApplicationUpgradeRollbackStart", value = ApplicationUpgradeRollbackStartEvent.class),
    @JsonSubTypes.Type(name = "ApplicationUpgradeStart", value = ApplicationUpgradeStartEvent.class),
    @JsonSubTypes.Type(name = "DeployedApplicationHealthReportCreated", value = DeployedApplicationHealthReportCreatedEvent.class),
    @JsonSubTypes.Type(name = "DeployedApplicationHealthReportExpired", value = DeployedApplicationHealthReportExpiredEvent.class),
    @JsonSubTypes.Type(name = "ProcessDeactivated", value = ProcessDeactivatedEvent.class),
    @JsonSubTypes.Type(name = "ContainerDeactivated", value = ContainerDeactivatedEvent.class),
    @JsonSubTypes.Type(name = "DeployedServiceHealthReportCreated", value = DeployedServiceHealthReportCreatedEvent.class),
    @JsonSubTypes.Type(name = "DeployedServiceHealthReportExpired", value = DeployedServiceHealthReportExpiredEvent.class),
    @JsonSubTypes.Type(name = "ChaosRestartCodePackageFaultScheduled", value = ChaosRestartCodePackageFaultScheduledEvent.class),
    @JsonSubTypes.Type(name = "ChaosRestartCodePackageFaultCompleted", value = ChaosRestartCodePackageFaultCompletedEvent.class)
})
public class ApplicationEventInner extends FabricEventInner {
    /**
     * The identity of the application. This is an encoded representation of
     * the application name. This is used in the REST APIs to identify the
     * application resource.
     * Starting in version 6.0, hierarchical names are delimited with the "\~"
     * character. For example, if the application name is "fabric:/myapp/app1",
     * the application identity would be "myapp\~app1" in 6.0+ and "myapp/app1"
     * in previous versions.
     */
    @JsonProperty(value = "ApplicationId", required = true)
    private String applicationId;

    /**
     * Get the applicationId value.
     *
     * @return the applicationId value
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId value.
     *
     * @param applicationId the applicationId value to set
     * @return the ApplicationEventInner object itself.
     */
    public ApplicationEventInner withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

}
