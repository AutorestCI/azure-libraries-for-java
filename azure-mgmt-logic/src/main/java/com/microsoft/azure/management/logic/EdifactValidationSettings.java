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
 * The Edifact agreement validation settings.
 */
public class EdifactValidationSettings {
    /**
     * The value indicating whether to validate character set in the message.
     */
    @JsonProperty(value = "validateCharacterSet", required = true)
    private boolean validateCharacterSet;

    /**
     * The value indicating whether to check for duplicate interchange control
     * number.
     */
    @JsonProperty(value = "checkDuplicateInterchangeControlNumber", required = true)
    private boolean checkDuplicateInterchangeControlNumber;

    /**
     * The validity period of interchange control number.
     */
    @JsonProperty(value = "interchangeControlNumberValidityDays", required = true)
    private int interchangeControlNumberValidityDays;

    /**
     * The value indicating whether to check for duplicate group control
     * number.
     */
    @JsonProperty(value = "checkDuplicateGroupControlNumber", required = true)
    private boolean checkDuplicateGroupControlNumber;

    /**
     * The value indicating whether to check for duplicate transaction set
     * control number.
     */
    @JsonProperty(value = "checkDuplicateTransactionSetControlNumber", required = true)
    private boolean checkDuplicateTransactionSetControlNumber;

    /**
     * The value indicating whether to Whether to validate EDI types.
     */
    @JsonProperty(value = "validateEdiTypes", required = true)
    private boolean validateEdiTypes;

    /**
     * The value indicating whether to Whether to validate XSD types.
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
     * The value indicating whether to trim leading and trailing spaces and
     * zeroes.
     */
    @JsonProperty(value = "trimLeadingAndTrailingSpacesAndZeroes", required = true)
    private boolean trimLeadingAndTrailingSpacesAndZeroes;

    /**
     * The trailing separator policy. Possible values include: 'NotSpecified',
     * 'NotAllowed', 'Optional', 'Mandatory'.
     */
    @JsonProperty(value = "trailingSeparatorPolicy", required = true)
    private TrailingSeparatorPolicy trailingSeparatorPolicy;

    /**
     * Get the value indicating whether to validate character set in the message.
     *
     * @return the validateCharacterSet value
     */
    public boolean validateCharacterSet() {
        return this.validateCharacterSet;
    }

    /**
     * Set the value indicating whether to validate character set in the message.
     *
     * @param validateCharacterSet the validateCharacterSet value to set
     * @return the EdifactValidationSettings object itself.
     */
    public EdifactValidationSettings withValidateCharacterSet(boolean validateCharacterSet) {
        this.validateCharacterSet = validateCharacterSet;
        return this;
    }

    /**
     * Get the value indicating whether to check for duplicate interchange control number.
     *
     * @return the checkDuplicateInterchangeControlNumber value
     */
    public boolean checkDuplicateInterchangeControlNumber() {
        return this.checkDuplicateInterchangeControlNumber;
    }

    /**
     * Set the value indicating whether to check for duplicate interchange control number.
     *
     * @param checkDuplicateInterchangeControlNumber the checkDuplicateInterchangeControlNumber value to set
     * @return the EdifactValidationSettings object itself.
     */
    public EdifactValidationSettings withCheckDuplicateInterchangeControlNumber(boolean checkDuplicateInterchangeControlNumber) {
        this.checkDuplicateInterchangeControlNumber = checkDuplicateInterchangeControlNumber;
        return this;
    }

    /**
     * Get the validity period of interchange control number.
     *
     * @return the interchangeControlNumberValidityDays value
     */
    public int interchangeControlNumberValidityDays() {
        return this.interchangeControlNumberValidityDays;
    }

    /**
     * Set the validity period of interchange control number.
     *
     * @param interchangeControlNumberValidityDays the interchangeControlNumberValidityDays value to set
     * @return the EdifactValidationSettings object itself.
     */
    public EdifactValidationSettings withInterchangeControlNumberValidityDays(int interchangeControlNumberValidityDays) {
        this.interchangeControlNumberValidityDays = interchangeControlNumberValidityDays;
        return this;
    }

    /**
     * Get the value indicating whether to check for duplicate group control number.
     *
     * @return the checkDuplicateGroupControlNumber value
     */
    public boolean checkDuplicateGroupControlNumber() {
        return this.checkDuplicateGroupControlNumber;
    }

    /**
     * Set the value indicating whether to check for duplicate group control number.
     *
     * @param checkDuplicateGroupControlNumber the checkDuplicateGroupControlNumber value to set
     * @return the EdifactValidationSettings object itself.
     */
    public EdifactValidationSettings withCheckDuplicateGroupControlNumber(boolean checkDuplicateGroupControlNumber) {
        this.checkDuplicateGroupControlNumber = checkDuplicateGroupControlNumber;
        return this;
    }

    /**
     * Get the value indicating whether to check for duplicate transaction set control number.
     *
     * @return the checkDuplicateTransactionSetControlNumber value
     */
    public boolean checkDuplicateTransactionSetControlNumber() {
        return this.checkDuplicateTransactionSetControlNumber;
    }

    /**
     * Set the value indicating whether to check for duplicate transaction set control number.
     *
     * @param checkDuplicateTransactionSetControlNumber the checkDuplicateTransactionSetControlNumber value to set
     * @return the EdifactValidationSettings object itself.
     */
    public EdifactValidationSettings withCheckDuplicateTransactionSetControlNumber(boolean checkDuplicateTransactionSetControlNumber) {
        this.checkDuplicateTransactionSetControlNumber = checkDuplicateTransactionSetControlNumber;
        return this;
    }

    /**
     * Get the value indicating whether to Whether to validate EDI types.
     *
     * @return the validateEdiTypes value
     */
    public boolean validateEdiTypes() {
        return this.validateEdiTypes;
    }

    /**
     * Set the value indicating whether to Whether to validate EDI types.
     *
     * @param validateEdiTypes the validateEdiTypes value to set
     * @return the EdifactValidationSettings object itself.
     */
    public EdifactValidationSettings withValidateEdiTypes(boolean validateEdiTypes) {
        this.validateEdiTypes = validateEdiTypes;
        return this;
    }

    /**
     * Get the value indicating whether to Whether to validate XSD types.
     *
     * @return the validateXsdTypes value
     */
    public boolean validateXsdTypes() {
        return this.validateXsdTypes;
    }

    /**
     * Set the value indicating whether to Whether to validate XSD types.
     *
     * @param validateXsdTypes the validateXsdTypes value to set
     * @return the EdifactValidationSettings object itself.
     */
    public EdifactValidationSettings withValidateXsdTypes(boolean validateXsdTypes) {
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
     * @return the EdifactValidationSettings object itself.
     */
    public EdifactValidationSettings withAllowLeadingAndTrailingSpacesAndZeroes(boolean allowLeadingAndTrailingSpacesAndZeroes) {
        this.allowLeadingAndTrailingSpacesAndZeroes = allowLeadingAndTrailingSpacesAndZeroes;
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
     * @return the EdifactValidationSettings object itself.
     */
    public EdifactValidationSettings withTrimLeadingAndTrailingSpacesAndZeroes(boolean trimLeadingAndTrailingSpacesAndZeroes) {
        this.trimLeadingAndTrailingSpacesAndZeroes = trimLeadingAndTrailingSpacesAndZeroes;
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
     * @return the EdifactValidationSettings object itself.
     */
    public EdifactValidationSettings withTrailingSeparatorPolicy(TrailingSeparatorPolicy trailingSeparatorPolicy) {
        this.trailingSeparatorPolicy = trailingSeparatorPolicy;
        return this;
    }

}
