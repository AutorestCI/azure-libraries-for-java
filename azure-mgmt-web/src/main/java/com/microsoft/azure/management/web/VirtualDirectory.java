/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Directory for virtual application.
 */
public class VirtualDirectory {
    /**
     * Path to virtual application.
     */
    @JsonProperty(value = "virtualPath")
    private String virtualPath;

    /**
     * Physical path.
     */
    @JsonProperty(value = "physicalPath")
    private String physicalPath;

    /**
     * Get path to virtual application.
     *
     * @return the virtualPath value
     */
    public String virtualPath() {
        return this.virtualPath;
    }

    /**
     * Set path to virtual application.
     *
     * @param virtualPath the virtualPath value to set
     * @return the VirtualDirectory object itself.
     */
    public VirtualDirectory withVirtualPath(String virtualPath) {
        this.virtualPath = virtualPath;
        return this;
    }

    /**
     * Get physical path.
     *
     * @return the physicalPath value
     */
    public String physicalPath() {
        return this.physicalPath;
    }

    /**
     * Set physical path.
     *
     * @param physicalPath the physicalPath value to set
     * @return the VirtualDirectory object itself.
     */
    public VirtualDirectory withPhysicalPath(String physicalPath) {
        this.physicalPath = physicalPath;
        return this;
    }

}
