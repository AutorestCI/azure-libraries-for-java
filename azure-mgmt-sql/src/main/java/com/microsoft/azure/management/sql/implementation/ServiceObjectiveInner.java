/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Represents a database service objective.
 */
@JsonFlatten
public class ServiceObjectiveInner extends ProxyResourceInner {
    /**
     * The name for the service objective.
     */
    @JsonProperty(value = "properties.serviceObjectiveName", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceObjectiveName;

    /**
     * Gets whether the service level objective is the default service
     * objective.
     */
    @JsonProperty(value = "properties.isDefault", access = JsonProperty.Access.WRITE_ONLY)
    private boolean isDefault;

    /**
     * Gets whether the service level objective is a system service objective.
     */
    @JsonProperty(value = "properties.isSystem", access = JsonProperty.Access.WRITE_ONLY)
    private boolean isSystem;

    /**
     * The description for the service level objective.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Gets whether the service level objective is enabled.
     */
    @JsonProperty(value = "properties.enabled", access = JsonProperty.Access.WRITE_ONLY)
    private boolean enabled;

    /**
     * Get the name for the service objective.
     *
     * @return the serviceObjectiveName value
     */
    public String serviceObjectiveName() {
        return this.serviceObjectiveName;
    }

    /**
     * Get gets whether the service level objective is the default service objective.
     *
     * @return the isDefault value
     */
    public boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Get gets whether the service level objective is a system service objective.
     *
     * @return the isSystem value
     */
    public boolean isSystem() {
        return this.isSystem;
    }

    /**
     * Get the description for the service level objective.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get gets whether the service level objective is enabled.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

}
