/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * An alert action.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata.type")
@JsonTypeName("Action")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.AlertingAction", value = AlertingAction.class)
})
public class Action {
    /**
     * the id of the action group to use.
     */
    @JsonProperty(value = "actionGroupId")
    private String actionGroupId;

    /**
     * The webhookProperties property.
     */
    @JsonProperty(value = "webhookProperties")
    private Map<String, String> webhookProperties;

    /**
     * Get the actionGroupId value.
     *
     * @return the actionGroupId value
     */
    public String actionGroupId() {
        return this.actionGroupId;
    }

    /**
     * Set the actionGroupId value.
     *
     * @param actionGroupId the actionGroupId value to set
     * @return the Action object itself.
     */
    public Action withActionGroupId(String actionGroupId) {
        this.actionGroupId = actionGroupId;
        return this;
    }

    /**
     * Get the webhookProperties value.
     *
     * @return the webhookProperties value
     */
    public Map<String, String> webhookProperties() {
        return this.webhookProperties;
    }

    /**
     * Set the webhookProperties value.
     *
     * @param webhookProperties the webhookProperties value to set
     * @return the Action object itself.
     */
    public Action withWebhookProperties(Map<String, String> webhookProperties) {
        this.webhookProperties = webhookProperties;
        return this;
    }

}
