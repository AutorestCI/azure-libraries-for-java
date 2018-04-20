/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.NodeEventInner;

/**
 * Node Up event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeUp")
public class NodeUpEvent extends NodeEventInner {
    /**
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstance", required = true)
    private long nodeInstance;

    /**
     * Time when Node was last down.
     */
    @JsonProperty(value = "LastNodeDownAt", required = true)
    private DateTime lastNodeDownAt;

    /**
     * Get the nodeInstance value.
     *
     * @return the nodeInstance value
     */
    public long nodeInstance() {
        return this.nodeInstance;
    }

    /**
     * Set the nodeInstance value.
     *
     * @param nodeInstance the nodeInstance value to set
     * @return the NodeUpEvent object itself.
     */
    public NodeUpEvent withNodeInstance(long nodeInstance) {
        this.nodeInstance = nodeInstance;
        return this;
    }

    /**
     * Get the lastNodeDownAt value.
     *
     * @return the lastNodeDownAt value
     */
    public DateTime lastNodeDownAt() {
        return this.lastNodeDownAt;
    }

    /**
     * Set the lastNodeDownAt value.
     *
     * @param lastNodeDownAt the lastNodeDownAt value to set
     * @return the NodeUpEvent object itself.
     */
    public NodeUpEvent withLastNodeDownAt(DateTime lastNodeDownAt) {
        this.lastNodeDownAt = lastNodeDownAt;
        return this;
    }

}
