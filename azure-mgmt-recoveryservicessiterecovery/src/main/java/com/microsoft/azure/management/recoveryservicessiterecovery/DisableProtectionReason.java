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
 * Defines values for DisableProtectionReason.
 */
public final class DisableProtectionReason extends ExpandableStringEnum<DisableProtectionReason> {
    /** Static value NotSpecified for DisableProtectionReason. */
    public static final DisableProtectionReason NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value MigrationComplete for DisableProtectionReason. */
    public static final DisableProtectionReason MIGRATION_COMPLETE = fromString("MigrationComplete");

    /**
     * Creates or finds a DisableProtectionReason from its string representation.
     * @param name a name to look for
     * @return the corresponding DisableProtectionReason
     */
    @JsonCreator
    public static DisableProtectionReason fromString(String name) {
        return fromString(name, DisableProtectionReason.class);
    }

    /**
     * @return known DisableProtectionReason values
     */
    public static Collection<DisableProtectionReason> values() {
        return values(DisableProtectionReason.class);
    }
}
