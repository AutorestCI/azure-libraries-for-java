/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.resources.v20180201.implementation.ProviderInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment properties with additional details.
 */
public class DeploymentPropertiesExtended {
    /**
     * The state of the provisioning.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The correlation ID of the deployment.
     */
    @JsonProperty(value = "correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationId;

    /**
     * The timestamp of the template deployment.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timestamp;

    /**
     * Key/value pairs that represent deploymentoutput.
     */
    @JsonProperty(value = "outputs")
    private Object outputs;

    /**
     * The list of resource providers needed for the deployment.
     */
    @JsonProperty(value = "providers")
    private List<ProviderInner> providers;

    /**
     * The list of deployment dependencies.
     */
    @JsonProperty(value = "dependencies")
    private List<Dependency> dependencies;

    /**
     * The template content. Use only one of Template or TemplateLink.
     */
    @JsonProperty(value = "template")
    private Object template;

    /**
     * The URI referencing the template. Use only one of Template or
     * TemplateLink.
     */
    @JsonProperty(value = "templateLink")
    private TemplateLink templateLink;

    /**
     * Deployment parameters. Use only one of Parameters or ParametersLink.
     */
    @JsonProperty(value = "parameters")
    private Object parameters;

    /**
     * The URI referencing the parameters. Use only one of Parameters or
     * ParametersLink.
     */
    @JsonProperty(value = "parametersLink")
    private ParametersLink parametersLink;

    /**
     * The deployment mode. Possible values are Incremental and Complete.
     * Possible values include: 'Incremental', 'Complete'.
     */
    @JsonProperty(value = "mode")
    private DeploymentMode mode;

    /**
     * The debug setting of the deployment.
     */
    @JsonProperty(value = "debugSetting")
    private DebugSetting debugSetting;

    /**
     * The deployment on error behavior.
     */
    @JsonProperty(value = "onErrorDeployment")
    private OnErrorDeploymentExtended onErrorDeployment;

    /**
     * Get the state of the provisioning.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the correlation ID of the deployment.
     *
     * @return the correlationId value
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Get the timestamp of the template deployment.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get key/value pairs that represent deploymentoutput.
     *
     * @return the outputs value
     */
    public Object outputs() {
        return this.outputs;
    }

    /**
     * Set key/value pairs that represent deploymentoutput.
     *
     * @param outputs the outputs value to set
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended withOutputs(Object outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get the list of resource providers needed for the deployment.
     *
     * @return the providers value
     */
    public List<ProviderInner> providers() {
        return this.providers;
    }

    /**
     * Set the list of resource providers needed for the deployment.
     *
     * @param providers the providers value to set
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended withProviders(List<ProviderInner> providers) {
        this.providers = providers;
        return this;
    }

    /**
     * Get the list of deployment dependencies.
     *
     * @return the dependencies value
     */
    public List<Dependency> dependencies() {
        return this.dependencies;
    }

    /**
     * Set the list of deployment dependencies.
     *
     * @param dependencies the dependencies value to set
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended withDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    /**
     * Get the template content. Use only one of Template or TemplateLink.
     *
     * @return the template value
     */
    public Object template() {
        return this.template;
    }

    /**
     * Set the template content. Use only one of Template or TemplateLink.
     *
     * @param template the template value to set
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended withTemplate(Object template) {
        this.template = template;
        return this;
    }

    /**
     * Get the URI referencing the template. Use only one of Template or TemplateLink.
     *
     * @return the templateLink value
     */
    public TemplateLink templateLink() {
        return this.templateLink;
    }

    /**
     * Set the URI referencing the template. Use only one of Template or TemplateLink.
     *
     * @param templateLink the templateLink value to set
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended withTemplateLink(TemplateLink templateLink) {
        this.templateLink = templateLink;
        return this;
    }

    /**
     * Get deployment parameters. Use only one of Parameters or ParametersLink.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set deployment parameters. Use only one of Parameters or ParametersLink.
     *
     * @param parameters the parameters value to set
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the URI referencing the parameters. Use only one of Parameters or ParametersLink.
     *
     * @return the parametersLink value
     */
    public ParametersLink parametersLink() {
        return this.parametersLink;
    }

    /**
     * Set the URI referencing the parameters. Use only one of Parameters or ParametersLink.
     *
     * @param parametersLink the parametersLink value to set
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended withParametersLink(ParametersLink parametersLink) {
        this.parametersLink = parametersLink;
        return this;
    }

    /**
     * Get the deployment mode. Possible values are Incremental and Complete. Possible values include: 'Incremental', 'Complete'.
     *
     * @return the mode value
     */
    public DeploymentMode mode() {
        return this.mode;
    }

    /**
     * Set the deployment mode. Possible values are Incremental and Complete. Possible values include: 'Incremental', 'Complete'.
     *
     * @param mode the mode value to set
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended withMode(DeploymentMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the debug setting of the deployment.
     *
     * @return the debugSetting value
     */
    public DebugSetting debugSetting() {
        return this.debugSetting;
    }

    /**
     * Set the debug setting of the deployment.
     *
     * @param debugSetting the debugSetting value to set
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended withDebugSetting(DebugSetting debugSetting) {
        this.debugSetting = debugSetting;
        return this;
    }

    /**
     * Get the deployment on error behavior.
     *
     * @return the onErrorDeployment value
     */
    public OnErrorDeploymentExtended onErrorDeployment() {
        return this.onErrorDeployment;
    }

    /**
     * Set the deployment on error behavior.
     *
     * @param onErrorDeployment the onErrorDeployment value to set
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended withOnErrorDeployment(OnErrorDeploymentExtended onErrorDeployment) {
        this.onErrorDeployment = onErrorDeployment;
        return this;
    }

}
