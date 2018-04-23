/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RecoveryPointType.
 */
public enum RecoveryPointType {
    /** Enum value LatestTime. */
    LATEST_TIME("LatestTime"),

    /** Enum value LatestTag. */
    LATEST_TAG("LatestTag"),

    /** Enum value Custom. */
    CUSTOM("Custom");

    /** The actual serialized value for a RecoveryPointType instance. */
    private String value;

    RecoveryPointType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RecoveryPointType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RecoveryPointType object, or null if unable to parse.
     */
    @JsonCreator
    public static RecoveryPointType fromString(String value) {
        RecoveryPointType[] items = RecoveryPointType.values();
        for (RecoveryPointType item : items) {
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
