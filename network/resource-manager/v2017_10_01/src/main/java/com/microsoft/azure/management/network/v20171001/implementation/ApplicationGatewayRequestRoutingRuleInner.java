/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01.implementation;

import com.microsoft.azure.management.network.v20171001.ApplicationGatewayRequestRoutingRuleType;
import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Request routing rule of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayRequestRoutingRuleInner extends SubResource {
    /**
     * Rule type. Possible values include: 'Basic', 'PathBasedRouting'.
     */
    @JsonProperty(value = "properties.ruleType")
    private ApplicationGatewayRequestRoutingRuleType ruleType;

    /**
     * Backend address pool resource of the application gateway.
     */
    @JsonProperty(value = "properties.backendAddressPool")
    private SubResource backendAddressPool;

    /**
     * Frontend port resource of the application gateway.
     */
    @JsonProperty(value = "properties.backendHttpSettings")
    private SubResource backendHttpSettings;

    /**
     * Http listener resource of the application gateway.
     */
    @JsonProperty(value = "properties.httpListener")
    private SubResource httpListener;

    /**
     * URL path map resource of the application gateway.
     */
    @JsonProperty(value = "properties.urlPathMap")
    private SubResource urlPathMap;

    /**
     * Redirect configuration resource of the application gateway.
     */
    @JsonProperty(value = "properties.redirectConfiguration")
    private SubResource redirectConfiguration;

    /**
     * Provisioning state of the request routing rule resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get rule type. Possible values include: 'Basic', 'PathBasedRouting'.
     *
     * @return the ruleType value
     */
    public ApplicationGatewayRequestRoutingRuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Set rule type. Possible values include: 'Basic', 'PathBasedRouting'.
     *
     * @param ruleType the ruleType value to set
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withRuleType(ApplicationGatewayRequestRoutingRuleType ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get backend address pool resource of the application gateway.
     *
     * @return the backendAddressPool value
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set backend address pool resource of the application gateway.
     *
     * @param backendAddressPool the backendAddressPool value to set
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get frontend port resource of the application gateway.
     *
     * @return the backendHttpSettings value
     */
    public SubResource backendHttpSettings() {
        return this.backendHttpSettings;
    }

    /**
     * Set frontend port resource of the application gateway.
     *
     * @param backendHttpSettings the backendHttpSettings value to set
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withBackendHttpSettings(SubResource backendHttpSettings) {
        this.backendHttpSettings = backendHttpSettings;
        return this;
    }

    /**
     * Get http listener resource of the application gateway.
     *
     * @return the httpListener value
     */
    public SubResource httpListener() {
        return this.httpListener;
    }

    /**
     * Set http listener resource of the application gateway.
     *
     * @param httpListener the httpListener value to set
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withHttpListener(SubResource httpListener) {
        this.httpListener = httpListener;
        return this;
    }

    /**
     * Get uRL path map resource of the application gateway.
     *
     * @return the urlPathMap value
     */
    public SubResource urlPathMap() {
        return this.urlPathMap;
    }

    /**
     * Set uRL path map resource of the application gateway.
     *
     * @param urlPathMap the urlPathMap value to set
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withUrlPathMap(SubResource urlPathMap) {
        this.urlPathMap = urlPathMap;
        return this;
    }

    /**
     * Get redirect configuration resource of the application gateway.
     *
     * @return the redirectConfiguration value
     */
    public SubResource redirectConfiguration() {
        return this.redirectConfiguration;
    }

    /**
     * Set redirect configuration resource of the application gateway.
     *
     * @param redirectConfiguration the redirectConfiguration value to set
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withRedirectConfiguration(SubResource redirectConfiguration) {
        this.redirectConfiguration = redirectConfiguration;
        return this;
    }

    /**
     * Get provisioning state of the request routing rule resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the request routing rule resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set type of the resource.
     *
     * @param type the type value to set
     * @return the ApplicationGatewayRequestRoutingRuleInner object itself.
     */
    public ApplicationGatewayRequestRoutingRuleInner withType(String type) {
        this.type = type;
        return this;
    }

}
