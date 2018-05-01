/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration parameters used for performing automatic OS upgrade.
 */
public class AutoOSUpgradePolicy {
    /**
     * whether OS image rollback feature should be disabled.
     */
    @JsonProperty(value = "disableAutoRollback")
    private Boolean disableAutoRollback;

    /**
     * Get the disableAutoRollback value.
     *
     * @return the disableAutoRollback value
     */
    public Boolean disableAutoRollback() {
        return this.disableAutoRollback;
    }

    /**
     * Set the disableAutoRollback value.
     *
     * @param disableAutoRollback the disableAutoRollback value to set
     * @return the AutoOSUpgradePolicy object itself.
     */
    public AutoOSUpgradePolicy withDisableAutoRollback(Boolean disableAutoRollback) {
        this.disableAutoRollback = disableAutoRollback;
        return this;
    }

}
