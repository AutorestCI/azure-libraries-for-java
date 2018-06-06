/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.reservations;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The Patch model.
 */
@JsonFlatten
public class Patch {
    /**
     * Possible values include: 'Single', 'Shared'.
     */
    @JsonProperty(value = "properties.appliedScopeType")
    private String appliedScopeType;

    /**
     * The appliedScopes property.
     */
    @JsonProperty(value = "properties.appliedScopes")
    private List<String> appliedScopes;

    /**
     * Possible values include: 'On', 'Off', 'NotSupported'.
     */
    @JsonProperty(value = "properties.instanceFlexibility")
    private String instanceFlexibility;

    /**
     * Get possible values include: 'Single', 'Shared'.
     *
     * @return the appliedScopeType value
     */
    public String appliedScopeType() {
        return this.appliedScopeType;
    }

    /**
     * Set possible values include: 'Single', 'Shared'.
     *
     * @param appliedScopeType the appliedScopeType value to set
     * @return the Patch object itself.
     */
    public Patch withAppliedScopeType(String appliedScopeType) {
        this.appliedScopeType = appliedScopeType;
        return this;
    }

    /**
     * Get the appliedScopes value.
     *
     * @return the appliedScopes value
     */
    public List<String> appliedScopes() {
        return this.appliedScopes;
    }

    /**
     * Set the appliedScopes value.
     *
     * @param appliedScopes the appliedScopes value to set
     * @return the Patch object itself.
     */
    public Patch withAppliedScopes(List<String> appliedScopes) {
        this.appliedScopes = appliedScopes;
        return this;
    }

    /**
     * Get possible values include: 'On', 'Off', 'NotSupported'.
     *
     * @return the instanceFlexibility value
     */
    public String instanceFlexibility() {
        return this.instanceFlexibility;
    }

    /**
     * Set possible values include: 'On', 'Off', 'NotSupported'.
     *
     * @param instanceFlexibility the instanceFlexibility value to set
     * @return the Patch object itself.
     */
    public Patch withInstanceFlexibility(String instanceFlexibility) {
        this.instanceFlexibility = instanceFlexibility;
        return this;
    }

}
