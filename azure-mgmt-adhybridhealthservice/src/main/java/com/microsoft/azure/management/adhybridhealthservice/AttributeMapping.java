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
 * The attribute mapping details.
 */
public class AttributeMapping {
    /**
     * The mapping source.
     */
    @JsonProperty(value = "mappingSource")
    private AttributeMppingSource mappingSource;

    /**
     * The attribute mapping type. Possible values include: 'Constant',
     * 'Direct', 'DnPart', 'Script'.
     */
    @JsonProperty(value = "type")
    private AttributeMappingType type;

    /**
     * The destination attribute.
     */
    @JsonProperty(value = "destinationAttribute")
    private String destinationAttribute;

    /**
     * The context Id.
     */
    @JsonProperty(value = "contextId")
    private String contextId;

    /**
     * Get the mappingSource value.
     *
     * @return the mappingSource value
     */
    public AttributeMppingSource mappingSource() {
        return this.mappingSource;
    }

    /**
     * Set the mappingSource value.
     *
     * @param mappingSource the mappingSource value to set
     * @return the AttributeMapping object itself.
     */
    public AttributeMapping withMappingSource(AttributeMppingSource mappingSource) {
        this.mappingSource = mappingSource;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public AttributeMappingType type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the AttributeMapping object itself.
     */
    public AttributeMapping withType(AttributeMappingType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the destinationAttribute value.
     *
     * @return the destinationAttribute value
     */
    public String destinationAttribute() {
        return this.destinationAttribute;
    }

    /**
     * Set the destinationAttribute value.
     *
     * @param destinationAttribute the destinationAttribute value to set
     * @return the AttributeMapping object itself.
     */
    public AttributeMapping withDestinationAttribute(String destinationAttribute) {
        this.destinationAttribute = destinationAttribute;
        return this;
    }

    /**
     * Get the contextId value.
     *
     * @return the contextId value
     */
    public String contextId() {
        return this.contextId;
    }

    /**
     * Set the contextId value.
     *
     * @param contextId the contextId value to set
     * @return the AttributeMapping object itself.
     */
    public AttributeMapping withContextId(String contextId) {
        this.contextId = contextId;
        return this;
    }

}
