/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The error details in legacy rule processing.
 */
public class RuleErrorInfo {
    /**
     * The attribute mapping details.
     */
    @JsonProperty(value = "attributeMapping")
    private AttributeMapping attributeMapping;

    /**
     * The connector Id.
     */
    @JsonProperty(value = "connectorId")
    private String connectorId;

    /**
     * The connector name.
     */
    @JsonProperty(value = "connectorName")
    private String connectorName;

    /**
     * The object Id.
     */
    @JsonProperty(value = "csObjectId")
    private String csObjectId;

    /**
     * The distinguished name.
     */
    @JsonProperty(value = "dn")
    private String dn;

    /**
     * Get the attributeMapping value.
     *
     * @return the attributeMapping value
     */
    public AttributeMapping attributeMapping() {
        return this.attributeMapping;
    }

    /**
     * Set the attributeMapping value.
     *
     * @param attributeMapping the attributeMapping value to set
     * @return the RuleErrorInfo object itself.
     */
    public RuleErrorInfo withAttributeMapping(AttributeMapping attributeMapping) {
        this.attributeMapping = attributeMapping;
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
     * @return the RuleErrorInfo object itself.
     */
    public RuleErrorInfo withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * Get the connectorName value.
     *
     * @return the connectorName value
     */
    public String connectorName() {
        return this.connectorName;
    }

    /**
     * Set the connectorName value.
     *
     * @param connectorName the connectorName value to set
     * @return the RuleErrorInfo object itself.
     */
    public RuleErrorInfo withConnectorName(String connectorName) {
        this.connectorName = connectorName;
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
     * @return the RuleErrorInfo object itself.
     */
    public RuleErrorInfo withCsObjectId(String csObjectId) {
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
     * @return the RuleErrorInfo object itself.
     */
    public RuleErrorInfo withDn(String dn) {
        this.dn = dn;
        return this;
    }

}
