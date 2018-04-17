/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Specifiy action need to be taken when rule type is Alert.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata.type")
@JsonTypeName("Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.AlertingAction")
public class AlertingAction extends Action {
    /**
     * Severity of the alert. Possible values include: '0', '1', '2', '3', '4'.
     */
    @JsonProperty(value = "severity")
    private AlertSeverity severity;

    /**
     * azns notification group reference.
     */
    @JsonProperty(value = "aznsAction", required = true)
    private AzNsActionGroup aznsAction;

    /**
     * Time untill alert should not be fired in ISO8601 format.
     */
    @JsonProperty(value = "throttleTillDate")
    private DateTime throttleTillDate;

    /**
     * The trigger condition that results in the alert rule being.
     */
    @JsonProperty(value = "trigger", required = true)
    private TriggerCondition trigger;

    /**
     * Get the severity value.
     *
     * @return the severity value
     */
    public AlertSeverity severity() {
        return this.severity;
    }

    /**
     * Set the severity value.
     *
     * @param severity the severity value to set
     * @return the AlertingAction object itself.
     */
    public AlertingAction withSeverity(AlertSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the aznsAction value.
     *
     * @return the aznsAction value
     */
    public AzNsActionGroup aznsAction() {
        return this.aznsAction;
    }

    /**
     * Set the aznsAction value.
     *
     * @param aznsAction the aznsAction value to set
     * @return the AlertingAction object itself.
     */
    public AlertingAction withAznsAction(AzNsActionGroup aznsAction) {
        this.aznsAction = aznsAction;
        return this;
    }

    /**
     * Get the throttleTillDate value.
     *
     * @return the throttleTillDate value
     */
    public DateTime throttleTillDate() {
        return this.throttleTillDate;
    }

    /**
     * Set the throttleTillDate value.
     *
     * @param throttleTillDate the throttleTillDate value to set
     * @return the AlertingAction object itself.
     */
    public AlertingAction withThrottleTillDate(DateTime throttleTillDate) {
        this.throttleTillDate = throttleTillDate;
        return this;
    }

    /**
     * Get the trigger value.
     *
     * @return the trigger value
     */
    public TriggerCondition trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger value.
     *
     * @param trigger the trigger value to set
     * @return the AlertingAction object itself.
     */
    public AlertingAction withTrigger(TriggerCondition trigger) {
        this.trigger = trigger;
        return this;
    }

}
