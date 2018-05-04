/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The credential for a given server.
 */
public class CredentialInner {
    /**
     * The credential identifier.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /**
     * The type of credential.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The credential data.
     */
    @JsonProperty(value = "credentialData")
    private List<String> credentialData;

    /**
     * Get the identifier value.
     *
     * @return the identifier value
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier value.
     *
     * @param identifier the identifier value to set
     * @return the CredentialInner object itself.
     */
    public CredentialInner withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the CredentialInner object itself.
     */
    public CredentialInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the credentialData value.
     *
     * @return the credentialData value
     */
    public List<String> credentialData() {
        return this.credentialData;
    }

    /**
     * Set the credentialData value.
     *
     * @param credentialData the credentialData value to set
     * @return the CredentialInner object itself.
     */
    public CredentialInner withCredentialData(List<String> credentialData) {
        this.credentialData = credentialData;
        return this;
    }

}