/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servermanagement;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A multipart-numeric version number.
 */
public class Version {
    /**
     * The leftmost number of the version.
     */
    @JsonProperty(value = "major")
    private Integer major;

    /**
     * The second leftmost number of the version.
     */
    @JsonProperty(value = "minor")
    private Integer minor;

    /**
     * The third number of the version.
     */
    @JsonProperty(value = "build")
    private Integer build;

    /**
     * The fourth number of the version.
     */
    @JsonProperty(value = "revision")
    private Integer revision;

    /**
     * The MSW of the fourth part.
     */
    @JsonProperty(value = "majorRevision")
    private Integer majorRevision;

    /**
     * The LSW of the fourth part.
     */
    @JsonProperty(value = "minorRevision")
    private Integer minorRevision;

    /**
     * Get the leftmost number of the version.
     *
     * @return the major value
     */
    public Integer major() {
        return this.major;
    }

    /**
     * Set the leftmost number of the version.
     *
     * @param major the major value to set
     * @return the Version object itself.
     */
    public Version withMajor(Integer major) {
        this.major = major;
        return this;
    }

    /**
     * Get the second leftmost number of the version.
     *
     * @return the minor value
     */
    public Integer minor() {
        return this.minor;
    }

    /**
     * Set the second leftmost number of the version.
     *
     * @param minor the minor value to set
     * @return the Version object itself.
     */
    public Version withMinor(Integer minor) {
        this.minor = minor;
        return this;
    }

    /**
     * Get the third number of the version.
     *
     * @return the build value
     */
    public Integer build() {
        return this.build;
    }

    /**
     * Set the third number of the version.
     *
     * @param build the build value to set
     * @return the Version object itself.
     */
    public Version withBuild(Integer build) {
        this.build = build;
        return this;
    }

    /**
     * Get the fourth number of the version.
     *
     * @return the revision value
     */
    public Integer revision() {
        return this.revision;
    }

    /**
     * Set the fourth number of the version.
     *
     * @param revision the revision value to set
     * @return the Version object itself.
     */
    public Version withRevision(Integer revision) {
        this.revision = revision;
        return this;
    }

    /**
     * Get the MSW of the fourth part.
     *
     * @return the majorRevision value
     */
    public Integer majorRevision() {
        return this.majorRevision;
    }

    /**
     * Set the MSW of the fourth part.
     *
     * @param majorRevision the majorRevision value to set
     * @return the Version object itself.
     */
    public Version withMajorRevision(Integer majorRevision) {
        this.majorRevision = majorRevision;
        return this;
    }

    /**
     * Get the LSW of the fourth part.
     *
     * @return the minorRevision value
     */
    public Integer minorRevision() {
        return this.minorRevision;
    }

    /**
     * Set the LSW of the fourth part.
     *
     * @param minorRevision the minorRevision value to set
     * @return the Version object itself.
     */
    public Version withMinorRevision(Integer minorRevision) {
        this.minorRevision = minorRevision;
        return this;
    }

}