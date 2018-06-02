/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configures the Explicit Analog Television Output Restriction control bits.
 * For further details see the PlayReady Compliance Rules.
 */
public class ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction {
    /**
     * Indicates whether this restriction is enforced on a Best Effort basis.
     */
    @JsonProperty(value = "bestEffort", required = true)
    private boolean bestEffort;

    /**
     * Configures the restriction control bits. Must be between 0 and 3
     * inclusive.
     */
    @JsonProperty(value = "configurationData", required = true)
    private int configurationData;

    /**
     * Get indicates whether this restriction is enforced on a Best Effort basis.
     *
     * @return the bestEffort value
     */
    public boolean bestEffort() {
        return this.bestEffort;
    }

    /**
     * Set indicates whether this restriction is enforced on a Best Effort basis.
     *
     * @param bestEffort the bestEffort value to set
     * @return the ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction object itself.
     */
    public ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction withBestEffort(boolean bestEffort) {
        this.bestEffort = bestEffort;
        return this;
    }

    /**
     * Get configures the restriction control bits. Must be between 0 and 3 inclusive.
     *
     * @return the configurationData value
     */
    public int configurationData() {
        return this.configurationData;
    }

    /**
     * Set configures the restriction control bits. Must be between 0 and 3 inclusive.
     *
     * @param configurationData the configurationData value to set
     * @return the ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction object itself.
     */
    public ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction withConfigurationData(int configurationData) {
        this.configurationData = configurationData;
        return this;
    }

}
