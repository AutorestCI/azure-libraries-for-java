/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.implementation;

import com.microsoft.azure.management.containerregistry.BuildTaskStatus;
import com.microsoft.azure.management.containerregistry.PlatformProperties;
import com.microsoft.azure.management.containerregistry.SourceRepositoryUpdateParameters;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters for updating a build task.
 */
@JsonFlatten
public class BuildTaskUpdateParametersInner {
    /**
     * The alternative updatable name for a build task.
     */
    @JsonProperty(value = "properties.alias")
    private String alias;

    /**
     * The current status of build task. Possible values include: 'Disabled',
     * 'Enabled'.
     */
    @JsonProperty(value = "properties.status")
    private BuildTaskStatus status;

    /**
     * The platform properties against which the build has to happen.
     */
    @JsonProperty(value = "properties.platform")
    private PlatformProperties platform;

    /**
     * Build timeout in seconds.
     */
    @JsonProperty(value = "properties.timeout")
    private Integer timeout;

    /**
     * The properties that describes the source(code) for the build task.
     */
    @JsonProperty(value = "properties.sourceRepository")
    private SourceRepositoryUpdateParameters sourceRepository;

    /**
     * The ARM resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the alias value.
     *
     * @return the alias value
     */
    public String alias() {
        return this.alias;
    }

    /**
     * Set the alias value.
     *
     * @param alias the alias value to set
     * @return the BuildTaskUpdateParametersInner object itself.
     */
    public BuildTaskUpdateParametersInner withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public BuildTaskStatus status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the BuildTaskUpdateParametersInner object itself.
     */
    public BuildTaskUpdateParametersInner withStatus(BuildTaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the platform value.
     *
     * @return the platform value
     */
    public PlatformProperties platform() {
        return this.platform;
    }

    /**
     * Set the platform value.
     *
     * @param platform the platform value to set
     * @return the BuildTaskUpdateParametersInner object itself.
     */
    public BuildTaskUpdateParametersInner withPlatform(PlatformProperties platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the timeout value.
     *
     * @return the timeout value
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout value.
     *
     * @param timeout the timeout value to set
     * @return the BuildTaskUpdateParametersInner object itself.
     */
    public BuildTaskUpdateParametersInner withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the sourceRepository value.
     *
     * @return the sourceRepository value
     */
    public SourceRepositoryUpdateParameters sourceRepository() {
        return this.sourceRepository;
    }

    /**
     * Set the sourceRepository value.
     *
     * @param sourceRepository the sourceRepository value to set
     * @return the BuildTaskUpdateParametersInner object itself.
     */
    public BuildTaskUpdateParametersInner withSourceRepository(SourceRepositoryUpdateParameters sourceRepository) {
        this.sourceRepository = sourceRepository;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the BuildTaskUpdateParametersInner object itself.
     */
    public BuildTaskUpdateParametersInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
