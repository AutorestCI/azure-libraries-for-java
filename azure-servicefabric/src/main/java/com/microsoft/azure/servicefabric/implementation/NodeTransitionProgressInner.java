/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.microsoft.azure.servicefabric.OperationState;
import com.microsoft.azure.servicefabric.NodeTransitionResult;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about an NodeTransition operation.  This class contains an
 * OperationState and a NodeTransitionResult.  The NodeTransitionResult is not
 * valid until OperationState
 * is Completed or Faulted.
 */
public class NodeTransitionProgressInner {
    /**
     * The state of the operation. Possible values include: 'Invalid',
     * 'Running', 'RollingBack', 'Completed', 'Faulted', 'Cancelled',
     * 'ForceCancelled'.
     */
    @JsonProperty(value = "State")
    private OperationState state;

    /**
     * Represents information about an operation in a terminal state (Completed
     * or Faulted).
     */
    @JsonProperty(value = "NodeTransitionResult")
    private NodeTransitionResult nodeTransitionResult;

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public OperationState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the NodeTransitionProgressInner object itself.
     */
    public NodeTransitionProgressInner withState(OperationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the nodeTransitionResult value.
     *
     * @return the nodeTransitionResult value
     */
    public NodeTransitionResult nodeTransitionResult() {
        return this.nodeTransitionResult;
    }

    /**
     * Set the nodeTransitionResult value.
     *
     * @param nodeTransitionResult the nodeTransitionResult value to set
     * @return the NodeTransitionProgressInner object itself.
     */
    public NodeTransitionProgressInner withNodeTransitionResult(NodeTransitionResult nodeTransitionResult) {
        this.nodeTransitionResult = nodeTransitionResult;
        return this;
    }

}
