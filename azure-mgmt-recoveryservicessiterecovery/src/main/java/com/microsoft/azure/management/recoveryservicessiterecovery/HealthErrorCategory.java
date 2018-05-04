/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for HealthErrorCategory.
 */
public final class HealthErrorCategory extends ExpandableStringEnum<HealthErrorCategory> {
    /** Static value None for HealthErrorCategory. */
    public static final HealthErrorCategory NONE = fromString("None");

    /** Static value Replication for HealthErrorCategory. */
    public static final HealthErrorCategory REPLICATION = fromString("Replication");

    /** Static value TestFailover for HealthErrorCategory. */
    public static final HealthErrorCategory TEST_FAILOVER = fromString("TestFailover");

    /** Static value Configuration for HealthErrorCategory. */
    public static final HealthErrorCategory CONFIGURATION = fromString("Configuration");

    /** Static value FabricInfrastructure for HealthErrorCategory. */
    public static final HealthErrorCategory FABRIC_INFRASTRUCTURE = fromString("FabricInfrastructure");

    /** Static value VersionExpiry for HealthErrorCategory. */
    public static final HealthErrorCategory VERSION_EXPIRY = fromString("VersionExpiry");

    /** Static value AgentAutoUpdate for HealthErrorCategory. */
    public static final HealthErrorCategory AGENT_AUTO_UPDATE = fromString("AgentAutoUpdate");

    /**
     * Creates or finds a HealthErrorCategory from its string representation.
     * @param name a name to look for
     * @return the corresponding HealthErrorCategory
     */
    @JsonCreator
    public static HealthErrorCategory fromString(String name) {
        return fromString(name, HealthErrorCategory.class);
    }

    /**
     * @return known HealthErrorCategory values
     */
    public static Collection<HealthErrorCategory> values() {
        return values(HealthErrorCategory.class);
    }
}
