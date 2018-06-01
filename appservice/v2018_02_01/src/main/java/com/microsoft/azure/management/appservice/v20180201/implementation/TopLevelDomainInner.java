/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v20180201.ProxyOnlyResource;

/**
 * A top level domain object.
 */
@JsonFlatten
public class TopLevelDomainInner extends ProxyOnlyResource {
    /**
     * If &lt;code&gt;true&lt;/code&gt;, then the top level domain supports
     * domain privacy; otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.privacy")
    private Boolean privacy;

    /**
     * Get if &lt;code&gt;true&lt;/code&gt;, then the top level domain supports domain privacy; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the privacy value
     */
    public Boolean privacy() {
        return this.privacy;
    }

    /**
     * Set if &lt;code&gt;true&lt;/code&gt;, then the top level domain supports domain privacy; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param privacy the privacy value to set
     * @return the TopLevelDomainInner object itself.
     */
    public TopLevelDomainInner withPrivacy(Boolean privacy) {
        this.privacy = privacy;
        return this;
    }

}
