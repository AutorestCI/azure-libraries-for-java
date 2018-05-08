/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.notificationhubs.NamespaceType;
import com.microsoft.azure.management.notificationhubs.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Description of a Namespace resource.
 */
@JsonFlatten
@SkipParentValidation
public class NamespaceResourceInner extends Resource {
    /**
     * The name of the namespace.
     */
    @JsonProperty(value = "properties.name")
    private String namespaceResourceName;

    /**
     * Provisioning state of the Namespace.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Specifies the targeted region in which the namespace should be created.
     * It can be any of the following values: Australia EastAustralia
     * SoutheastCentral USEast USEast US 2West USNorth Central USSouth Central
     * USEast AsiaSoutheast AsiaBrazil SouthJapan EastJapan WestNorth
     * EuropeWest Europe.
     */
    @JsonProperty(value = "properties.region")
    private String region;

    /**
     * Identifier for Azure Insights metrics.
     */
    @JsonProperty(value = "properties.metricId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricId;

    /**
     * Status of the namespace. It can be any of these values:1 =
     * Created/Active2 = Creating3 = Suspended4 = Deleting.
     */
    @JsonProperty(value = "properties.status")
    private String status;

    /**
     * The time the namespace was created.
     */
    @JsonProperty(value = "properties.createdAt")
    private DateTime createdAt;

    /**
     * The time the namespace was updated.
     */
    @JsonProperty(value = "properties.updatedAt")
    private DateTime updatedAt;

    /**
     * Endpoint you can use to perform NotificationHub operations.
     */
    @JsonProperty(value = "properties.serviceBusEndpoint")
    private String serviceBusEndpoint;

    /**
     * The Id of the Azure subscription associated with the namespace.
     */
    @JsonProperty(value = "properties.subscriptionId")
    private String subscriptionId;

    /**
     * ScaleUnit where the namespace gets created.
     */
    @JsonProperty(value = "properties.scaleUnit")
    private String scaleUnit;

    /**
     * Whether or not the namespace is currently enabled.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Whether or not the namespace is set as Critical.
     */
    @JsonProperty(value = "properties.critical")
    private Boolean critical;

    /**
     * Data center for the namespace.
     */
    @JsonProperty(value = "properties.dataCenter")
    private String dataCenter;

    /**
     * The namespace type. Possible values include: 'Messaging',
     * 'NotificationHub'.
     */
    @JsonProperty(value = "properties.namespaceType")
    private NamespaceType namespaceType;

    /**
     * The sku of the created namespace.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get the namespaceResourceName value.
     *
     * @return the namespaceResourceName value
     */
    public String namespaceResourceName() {
        return this.namespaceResourceName;
    }

    /**
     * Set the namespaceResourceName value.
     *
     * @param namespaceResourceName the namespaceResourceName value to set
     * @return the NamespaceResourceInner object itself.
     */
    public NamespaceResourceInner withNamespaceResourceName(String namespaceResourceName) {
        this.namespaceResourceName = namespaceResourceName;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the NamespaceResourceInner object itself.
     */
    public NamespaceResourceInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the region value.
     *
     * @return the region value
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region value.
     *
     * @param region the region value to set
     * @return the NamespaceResourceInner object itself.
     */
    public NamespaceResourceInner withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the metricId value.
     *
     * @return the metricId value
     */
    public String metricId() {
        return this.metricId;
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
     * @return the NamespaceResourceInner object itself.
     */
    public NamespaceResourceInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the createdAt value.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt value.
     *
     * @param createdAt the createdAt value to set
     * @return the NamespaceResourceInner object itself.
     */
    public NamespaceResourceInner withCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the updatedAt value.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the updatedAt value.
     *
     * @param updatedAt the updatedAt value to set
     * @return the NamespaceResourceInner object itself.
     */
    public NamespaceResourceInner withUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get the serviceBusEndpoint value.
     *
     * @return the serviceBusEndpoint value
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Set the serviceBusEndpoint value.
     *
     * @param serviceBusEndpoint the serviceBusEndpoint value to set
     * @return the NamespaceResourceInner object itself.
     */
    public NamespaceResourceInner withServiceBusEndpoint(String serviceBusEndpoint) {
        this.serviceBusEndpoint = serviceBusEndpoint;
        return this;
    }

    /**
     * Get the subscriptionId value.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId value.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the NamespaceResourceInner object itself.
     */
    public NamespaceResourceInner withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the scaleUnit value.
     *
     * @return the scaleUnit value
     */
    public String scaleUnit() {
        return this.scaleUnit;
    }

    /**
     * Set the scaleUnit value.
     *
     * @param scaleUnit the scaleUnit value to set
     * @return the NamespaceResourceInner object itself.
     */
    public NamespaceResourceInner withScaleUnit(String scaleUnit) {
        this.scaleUnit = scaleUnit;
        return this;
    }

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the NamespaceResourceInner object itself.
     */
    public NamespaceResourceInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the critical value.
     *
     * @return the critical value
     */
    public Boolean critical() {
        return this.critical;
    }

    /**
     * Set the critical value.
     *
     * @param critical the critical value to set
     * @return the NamespaceResourceInner object itself.
     */
    public NamespaceResourceInner withCritical(Boolean critical) {
        this.critical = critical;
        return this;
    }

    /**
     * Get the dataCenter value.
     *
     * @return the dataCenter value
     */
    public String dataCenter() {
        return this.dataCenter;
    }

    /**
     * Set the dataCenter value.
     *
     * @param dataCenter the dataCenter value to set
     * @return the NamespaceResourceInner object itself.
     */
    public NamespaceResourceInner withDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * Get the namespaceType value.
     *
     * @return the namespaceType value
     */
    public NamespaceType namespaceType() {
        return this.namespaceType;
    }

    /**
     * Set the namespaceType value.
     *
     * @param namespaceType the namespaceType value to set
     * @return the NamespaceResourceInner object itself.
     */
    public NamespaceResourceInner withNamespaceType(NamespaceType namespaceType) {
        this.namespaceType = namespaceType;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the NamespaceResourceInner object itself.
     */
    public NamespaceResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}
