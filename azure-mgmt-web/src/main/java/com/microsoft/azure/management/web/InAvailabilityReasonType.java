/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for InAvailabilityReasonType.
 */
public final class InAvailabilityReasonType extends ExpandableStringEnum<InAvailabilityReasonType> {
    /** Static value Invalid for InAvailabilityReasonType. */
    public static final InAvailabilityReasonType INVALID = fromString("Invalid");

    /** Static value AlreadyExists for InAvailabilityReasonType. */
    public static final InAvailabilityReasonType ALREADY_EXISTS = fromString("AlreadyExists");

    /**
     * Creates or finds a InAvailabilityReasonType from its string representation.
     * @param name a name to look for
     * @return the corresponding InAvailabilityReasonType
     */
    @JsonCreator
    public static InAvailabilityReasonType fromString(String name) {
        return fromString(name, InAvailabilityReasonType.class);
    }

    /**
     * @return known InAvailabilityReasonType values
     */
    public static Collection<InAvailabilityReasonType> values() {
        return values(InAvailabilityReasonType.class);
    }
}
