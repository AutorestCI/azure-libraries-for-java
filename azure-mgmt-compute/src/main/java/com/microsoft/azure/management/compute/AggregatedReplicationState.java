/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AggregatedReplicationState.
 */
public enum AggregatedReplicationState {
    /** Enum value Unknown. */
    UNKNOWN("Unknown"),

    /** Enum value InProgress. */
    IN_PROGRESS("InProgress"),

    /** Enum value Completed. */
    COMPLETED("Completed"),

    /** Enum value Failed. */
    FAILED("Failed");

    /** The actual serialized value for a AggregatedReplicationState instance. */
    private String value;

    AggregatedReplicationState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AggregatedReplicationState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AggregatedReplicationState object, or null if unable to parse.
     */
    @JsonCreator
    public static AggregatedReplicationState fromString(String value) {
        AggregatedReplicationState[] items = AggregatedReplicationState.values();
        for (AggregatedReplicationState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
