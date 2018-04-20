/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the cluster manifest.
 */
public class ClusterManifestInner {
    /**
     * The contents of the cluster manifest file.
     */
    @JsonProperty(value = "Manifest")
    private String manifest;

    /**
     * Get the manifest value.
     *
     * @return the manifest value
     */
    public String manifest() {
        return this.manifest;
    }

    /**
     * Set the manifest value.
     *
     * @param manifest the manifest value to set
     * @return the ClusterManifestInner object itself.
     */
    public ClusterManifestInner withManifest(String manifest) {
        this.manifest = manifest;
        return this;
    }

}
