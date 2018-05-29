/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Edifact validation override settings.
 */
public class EdifactValidationOverride {
    /**
     * The message id on which the validation settings has to be applied.
     */
    @JsonProperty(value = "messageId", required = true)
    private String messageId;

    /**
     * The value indicating whether to validate character Set.
     */
    @JsonProperty(value = "enforceCharacterSet", required = true)
    private boolean enforceCharacterSet;

    /**
     * The value indicating whether to validate EDI types.
     */
    @JsonProperty(value = "validateEdiTypes", required = true)
    private boolean validateEdiTypes;

    /**
     * The value indicating whether to validate XSD types.
     */
    @JsonProperty(value = "validateXsdTypes", required = true)
    private boolean validateXsdTypes;

    /**
     * The value indicating whether to allow leading and trailing spaces and
     * zeroes.
     */
    @JsonProperty(value = "allowLeadingAndTrailingSpacesAndZeroes", required = true)
    private boolean allowLeadingAndTrailingSpacesAndZeroes;

    /**
     * The trailing separator policy. Possible values include: 'NotSpecified',
     * 'NotAllowed', 'Optional', 'Mandatory'.
     */
    @JsonProperty(value = "trailingSeparatorPolicy", required = true)
    private TrailingSeparatorPolicy trailingSeparatorPolicy;

    /**
     * The value indicating whether to trim leading and trailing spaces and
     * zeroes.
     */
    @JsonProperty(value = "trimLeadingAndTrailingSpacesAndZeroes", required = true)
    private boolean trimLeadingAndTrailingSpacesAndZeroes;

    /**
     * Get the message id on which the validation settings has to be applied.
     *
     * @return the messageId value
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set the message id on which the validation settings has to be applied.
     *
     * @param messageId the messageId value to set
     * @return the EdifactValidationOverride object itself.
     */
    public EdifactValidationOverride withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the value indicating whether to validate character Set.
     *
     * @return the enforceCharacterSet value
     */
    public boolean enforceCharacterSet() {
        return this.enforceCharacterSet;
    }

    /**
     * Set the value indicating whether to validate character Set.
     *
     * @param enforceCharacterSet the enforceCharacterSet value to set
     * @return the EdifactValidationOverride object itself.
     */
    public EdifactValidationOverride withEnforceCharacterSet(boolean enforceCharacterSet) {
        this.enforceCharacterSet = enforceCharacterSet;
        return this;
    }

    /**
     * Get the value indicating whether to validate EDI types.
     *
     * @return the validateEdiTypes value
     */
    public boolean validateEdiTypes() {
        return this.validateEdiTypes;
    }

    /**
     * Set the value indicating whether to validate EDI types.
     *
     * @param validateEdiTypes the validateEdiTypes value to set
     * @return the EdifactValidationOverride object itself.
     */
    public EdifactValidationOverride withValidateEdiTypes(boolean validateEdiTypes) {
        this.validateEdiTypes = validateEdiTypes;
        return this;
    }

    /**
     * Get the value indicating whether to validate XSD types.
     *
     * @return the validateXsdTypes value
     */
    public boolean validateXsdTypes() {
        return this.validateXsdTypes;
    }

    /**
     * Set the value indicating whether to validate XSD types.
     *
     * @param validateXsdTypes the validateXsdTypes value to set
     * @return the EdifactValidationOverride object itself.
     */
    public EdifactValidationOverride withValidateXsdTypes(boolean validateXsdTypes) {
        this.validateXsdTypes = validateXsdTypes;
        return this;
    }

    /**
     * Get the value indicating whether to allow leading and trailing spaces and zeroes.
     *
     * @return the allowLeadingAndTrailingSpacesAndZeroes value
     */
    public boolean allowLeadingAndTrailingSpacesAndZeroes() {
        return this.allowLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * Set the value indicating whether to allow leading and trailing spaces and zeroes.
     *
     * @param allowLeadingAndTrailingSpacesAndZeroes the allowLeadingAndTrailingSpacesAndZeroes value to set
     * @return the EdifactValidationOverride object itself.
     */
    public EdifactValidationOverride withAllowLeadingAndTrailingSpacesAndZeroes(boolean allowLeadingAndTrailingSpacesAndZeroes) {
        this.allowLeadingAndTrailingSpacesAndZeroes = allowLeadingAndTrailingSpacesAndZeroes;
        return this;
    }

    /**
     * Get the trailing separator policy. Possible values include: 'NotSpecified', 'NotAllowed', 'Optional', 'Mandatory'.
     *
     * @return the trailingSeparatorPolicy value
     */
    public TrailingSeparatorPolicy trailingSeparatorPolicy() {
        return this.trailingSeparatorPolicy;
    }

    /**
     * Set the trailing separator policy. Possible values include: 'NotSpecified', 'NotAllowed', 'Optional', 'Mandatory'.
     *
     * @param trailingSeparatorPolicy the trailingSeparatorPolicy value to set
     * @return the EdifactValidationOverride object itself.
     */
    public EdifactValidationOverride withTrailingSeparatorPolicy(TrailingSeparatorPolicy trailingSeparatorPolicy) {
        this.trailingSeparatorPolicy = trailingSeparatorPolicy;
        return this;
    }

    /**
     * Get the value indicating whether to trim leading and trailing spaces and zeroes.
     *
     * @return the trimLeadingAndTrailingSpacesAndZeroes value
     */
    public boolean trimLeadingAndTrailingSpacesAndZeroes() {
        return this.trimLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * Set the value indicating whether to trim leading and trailing spaces and zeroes.
     *
     * @param trimLeadingAndTrailingSpacesAndZeroes the trimLeadingAndTrailingSpacesAndZeroes value to set
     * @return the EdifactValidationOverride object itself.
     */
    public EdifactValidationOverride withTrimLeadingAndTrailingSpacesAndZeroes(boolean trimLeadingAndTrailingSpacesAndZeroes) {
        this.trimLeadingAndTrailingSpacesAndZeroes = trimLeadingAndTrailingSpacesAndZeroes;
        return this;
    }

}
