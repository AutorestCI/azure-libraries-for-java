/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Specifies a configuration for PlayReady licenses.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.ContentKeyPolicyPlayReadyConfiguration")
public class ContentKeyPolicyPlayReadyConfiguration extends ContentKeyPolicyConfiguration {
    /**
     * The PlayReady licenses.
     */
    @JsonProperty(value = "licenses", required = true)
    private List<ContentKeyPolicyPlayReadyLicense> licenses;

    /**
     * The custom response data.
     */
    @JsonProperty(value = "responseCustomData")
    private String responseCustomData;

    /**
     * Get the PlayReady licenses.
     *
     * @return the licenses value
     */
    public List<ContentKeyPolicyPlayReadyLicense> licenses() {
        return this.licenses;
    }

    /**
     * Set the PlayReady licenses.
     *
     * @param licenses the licenses value to set
     * @return the ContentKeyPolicyPlayReadyConfiguration object itself.
     */
    public ContentKeyPolicyPlayReadyConfiguration withLicenses(List<ContentKeyPolicyPlayReadyLicense> licenses) {
        this.licenses = licenses;
        return this;
    }

    /**
     * Get the custom response data.
     *
     * @return the responseCustomData value
     */
    public String responseCustomData() {
        return this.responseCustomData;
    }

    /**
     * Set the custom response data.
     *
     * @param responseCustomData the responseCustomData value to set
     * @return the ContentKeyPolicyPlayReadyConfiguration object itself.
     */
    public ContentKeyPolicyPlayReadyConfiguration withResponseCustomData(String responseCustomData) {
        this.responseCustomData = responseCustomData;
        return this;
    }

}
