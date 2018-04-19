/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import com.microsoft.azure.management.recoveryservicessiterecovery.implementation.ResumeJobParamsPropertiesInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resume job params.
 */
public class ResumeJobParams {
    /**
     * Resume job properties.
     */
    @JsonProperty(value = "properties")
    private ResumeJobParamsPropertiesInner properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public ResumeJobParamsPropertiesInner properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the ResumeJobParams object itself.
     */
    public ResumeJobParams withProperties(ResumeJobParamsPropertiesInner properties) {
        this.properties = properties;
        return this;
    }

}