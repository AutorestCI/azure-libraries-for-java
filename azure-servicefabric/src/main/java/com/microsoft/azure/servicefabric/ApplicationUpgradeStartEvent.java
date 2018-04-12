/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.ApplicationEventInner;

/**
 * Application Upgrade Start event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ApplicationUpgradeStart")
public class ApplicationUpgradeStartEvent extends ApplicationEventInner {
    /**
     * Application type name.
     */
    @JsonProperty(value = "ApplicationTypeName", required = true)
    private String applicationTypeName;

    /**
     * Current Application type version.
     */
    @JsonProperty(value = "CurrentApplicationTypeVersion", required = true)
    private String currentApplicationTypeVersion;

    /**
     * Target Application type version.
     */
    @JsonProperty(value = "ApplicationTypeVersion", required = true)
    private String applicationTypeVersion;

    /**
     * Type of upgrade.
     */
    @JsonProperty(value = "UpgradeType", required = true)
    private String upgradeType;

    /**
     * Mode of upgrade.
     */
    @JsonProperty(value = "RollingUpgradeMode", required = true)
    private String rollingUpgradeMode;

    /**
     * Action if failed.
     */
    @JsonProperty(value = "FailureAction", required = true)
    private String failureAction;

    /**
     * Get the applicationTypeName value.
     *
     * @return the applicationTypeName value
     */
    public String applicationTypeName() {
        return this.applicationTypeName;
    }

    /**
     * Set the applicationTypeName value.
     *
     * @param applicationTypeName the applicationTypeName value to set
     * @return the ApplicationUpgradeStartEvent object itself.
     */
    public ApplicationUpgradeStartEvent withApplicationTypeName(String applicationTypeName) {
        this.applicationTypeName = applicationTypeName;
        return this;
    }

    /**
     * Get the currentApplicationTypeVersion value.
     *
     * @return the currentApplicationTypeVersion value
     */
    public String currentApplicationTypeVersion() {
        return this.currentApplicationTypeVersion;
    }

    /**
     * Set the currentApplicationTypeVersion value.
     *
     * @param currentApplicationTypeVersion the currentApplicationTypeVersion value to set
     * @return the ApplicationUpgradeStartEvent object itself.
     */
    public ApplicationUpgradeStartEvent withCurrentApplicationTypeVersion(String currentApplicationTypeVersion) {
        this.currentApplicationTypeVersion = currentApplicationTypeVersion;
        return this;
    }

    /**
     * Get the applicationTypeVersion value.
     *
     * @return the applicationTypeVersion value
     */
    public String applicationTypeVersion() {
        return this.applicationTypeVersion;
    }

    /**
     * Set the applicationTypeVersion value.
     *
     * @param applicationTypeVersion the applicationTypeVersion value to set
     * @return the ApplicationUpgradeStartEvent object itself.
     */
    public ApplicationUpgradeStartEvent withApplicationTypeVersion(String applicationTypeVersion) {
        this.applicationTypeVersion = applicationTypeVersion;
        return this;
    }

    /**
     * Get the upgradeType value.
     *
     * @return the upgradeType value
     */
    public String upgradeType() {
        return this.upgradeType;
    }

    /**
     * Set the upgradeType value.
     *
     * @param upgradeType the upgradeType value to set
     * @return the ApplicationUpgradeStartEvent object itself.
     */
    public ApplicationUpgradeStartEvent withUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }

    /**
     * Get the rollingUpgradeMode value.
     *
     * @return the rollingUpgradeMode value
     */
    public String rollingUpgradeMode() {
        return this.rollingUpgradeMode;
    }

    /**
     * Set the rollingUpgradeMode value.
     *
     * @param rollingUpgradeMode the rollingUpgradeMode value to set
     * @return the ApplicationUpgradeStartEvent object itself.
     */
    public ApplicationUpgradeStartEvent withRollingUpgradeMode(String rollingUpgradeMode) {
        this.rollingUpgradeMode = rollingUpgradeMode;
        return this;
    }

    /**
     * Get the failureAction value.
     *
     * @return the failureAction value
     */
    public String failureAction() {
        return this.failureAction;
    }

    /**
     * Set the failureAction value.
     *
     * @param failureAction the failureAction value to set
     * @return the ApplicationUpgradeStartEvent object itself.
     */
    public ApplicationUpgradeStartEvent withFailureAction(String failureAction) {
        this.failureAction = failureAction;
        return this;
    }

}
