/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ReplicaRole.
 */
public final class ReplicaRole extends ExpandableStringEnum<ReplicaRole> {
    /** Static value Unknown for ReplicaRole. */
    public static final ReplicaRole UNKNOWN = fromString("Unknown");

    /** Static value None for ReplicaRole. */
    public static final ReplicaRole NONE = fromString("None");

    /** Static value Primary for ReplicaRole. */
    public static final ReplicaRole PRIMARY = fromString("Primary");

    /** Static value IdleSecondary for ReplicaRole. */
    public static final ReplicaRole IDLE_SECONDARY = fromString("IdleSecondary");

    /** Static value ActiveSecondary for ReplicaRole. */
    public static final ReplicaRole ACTIVE_SECONDARY = fromString("ActiveSecondary");

    /**
     * Creates or finds a ReplicaRole from its string representation.
     * @param name a name to look for
     * @return the corresponding ReplicaRole
     */
    @JsonCreator
    public static ReplicaRole fromString(String name) {
        return fromString(name, ReplicaRole.class);
    }

    /**
     * @return known ReplicaRole values
     */
    public static Collection<ReplicaRole> values() {
        return values(ReplicaRole.class);
    }
}
