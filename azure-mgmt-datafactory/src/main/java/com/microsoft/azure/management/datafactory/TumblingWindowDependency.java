/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tumbling Window dependency information.
 */
public class TumblingWindowDependency {
    /**
     * Reference type 'TriggerReference' for Tumbling Window.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Trigger reference name.
     */
    @JsonProperty(value = "referenceName", required = true)
    private String referenceName;

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the TumblingWindowDependency object itself.
     */
    public TumblingWindowDependency withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the referenceName value.
     *
     * @return the referenceName value
     */
    public String referenceName() {
        return this.referenceName;
    }

    /**
     * Set the referenceName value.
     *
     * @param referenceName the referenceName value to set
     * @return the TumblingWindowDependency object itself.
     */
    public TumblingWindowDependency withReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

}
