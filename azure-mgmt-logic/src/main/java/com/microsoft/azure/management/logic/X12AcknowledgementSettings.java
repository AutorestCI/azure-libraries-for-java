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
 * The X12 agreement acknowledgement settings.
 */
public class X12AcknowledgementSettings {
    /**
     * The value indicating whether technical acknowledgement is needed.
     */
    @JsonProperty(value = "needTechnicalAcknowledgement", required = true)
    private boolean needTechnicalAcknowledgement;

    /**
     * The value indicating whether to batch the technical acknowledgements.
     */
    @JsonProperty(value = "batchTechnicalAcknowledgements", required = true)
    private boolean batchTechnicalAcknowledgements;

    /**
     * The value indicating whether functional acknowledgement is needed.
     */
    @JsonProperty(value = "needFunctionalAcknowledgement", required = true)
    private boolean needFunctionalAcknowledgement;

    /**
     * The functional acknowledgement version.
     */
    @JsonProperty(value = "functionalAcknowledgementVersion")
    private String functionalAcknowledgementVersion;

    /**
     * The value indicating whether to batch functional acknowledgements.
     */
    @JsonProperty(value = "batchFunctionalAcknowledgements", required = true)
    private boolean batchFunctionalAcknowledgements;

    /**
     * The value indicating whether implementation acknowledgement is needed.
     */
    @JsonProperty(value = "needImplementationAcknowledgement", required = true)
    private boolean needImplementationAcknowledgement;

    /**
     * The implementation acknowledgement version.
     */
    @JsonProperty(value = "implementationAcknowledgementVersion")
    private String implementationAcknowledgementVersion;

    /**
     * The value indicating whether to batch implementation acknowledgements.
     */
    @JsonProperty(value = "batchImplementationAcknowledgements", required = true)
    private boolean batchImplementationAcknowledgements;

    /**
     * The value indicating whether a loop is needed for valid messages.
     */
    @JsonProperty(value = "needLoopForValidMessages", required = true)
    private boolean needLoopForValidMessages;

    /**
     * The value indicating whether to send synchronous acknowledgement.
     */
    @JsonProperty(value = "sendSynchronousAcknowledgement", required = true)
    private boolean sendSynchronousAcknowledgement;

    /**
     * The acknowledgement control number prefix.
     */
    @JsonProperty(value = "acknowledgementControlNumberPrefix")
    private String acknowledgementControlNumberPrefix;

    /**
     * The acknowledgement control number suffix.
     */
    @JsonProperty(value = "acknowledgementControlNumberSuffix")
    private String acknowledgementControlNumberSuffix;

    /**
     * The acknowledgement control number lower bound.
     */
    @JsonProperty(value = "acknowledgementControlNumberLowerBound", required = true)
    private int acknowledgementControlNumberLowerBound;

    /**
     * The acknowledgement control number upper bound.
     */
    @JsonProperty(value = "acknowledgementControlNumberUpperBound", required = true)
    private int acknowledgementControlNumberUpperBound;

    /**
     * The value indicating whether to rollover acknowledgement control number.
     */
    @JsonProperty(value = "rolloverAcknowledgementControlNumber", required = true)
    private boolean rolloverAcknowledgementControlNumber;

    /**
     * Get the value indicating whether technical acknowledgement is needed.
     *
     * @return the needTechnicalAcknowledgement value
     */
    public boolean needTechnicalAcknowledgement() {
        return this.needTechnicalAcknowledgement;
    }

    /**
     * Set the value indicating whether technical acknowledgement is needed.
     *
     * @param needTechnicalAcknowledgement the needTechnicalAcknowledgement value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withNeedTechnicalAcknowledgement(boolean needTechnicalAcknowledgement) {
        this.needTechnicalAcknowledgement = needTechnicalAcknowledgement;
        return this;
    }

    /**
     * Get the value indicating whether to batch the technical acknowledgements.
     *
     * @return the batchTechnicalAcknowledgements value
     */
    public boolean batchTechnicalAcknowledgements() {
        return this.batchTechnicalAcknowledgements;
    }

    /**
     * Set the value indicating whether to batch the technical acknowledgements.
     *
     * @param batchTechnicalAcknowledgements the batchTechnicalAcknowledgements value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withBatchTechnicalAcknowledgements(boolean batchTechnicalAcknowledgements) {
        this.batchTechnicalAcknowledgements = batchTechnicalAcknowledgements;
        return this;
    }

    /**
     * Get the value indicating whether functional acknowledgement is needed.
     *
     * @return the needFunctionalAcknowledgement value
     */
    public boolean needFunctionalAcknowledgement() {
        return this.needFunctionalAcknowledgement;
    }

    /**
     * Set the value indicating whether functional acknowledgement is needed.
     *
     * @param needFunctionalAcknowledgement the needFunctionalAcknowledgement value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withNeedFunctionalAcknowledgement(boolean needFunctionalAcknowledgement) {
        this.needFunctionalAcknowledgement = needFunctionalAcknowledgement;
        return this;
    }

    /**
     * Get the functional acknowledgement version.
     *
     * @return the functionalAcknowledgementVersion value
     */
    public String functionalAcknowledgementVersion() {
        return this.functionalAcknowledgementVersion;
    }

    /**
     * Set the functional acknowledgement version.
     *
     * @param functionalAcknowledgementVersion the functionalAcknowledgementVersion value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withFunctionalAcknowledgementVersion(String functionalAcknowledgementVersion) {
        this.functionalAcknowledgementVersion = functionalAcknowledgementVersion;
        return this;
    }

    /**
     * Get the value indicating whether to batch functional acknowledgements.
     *
     * @return the batchFunctionalAcknowledgements value
     */
    public boolean batchFunctionalAcknowledgements() {
        return this.batchFunctionalAcknowledgements;
    }

    /**
     * Set the value indicating whether to batch functional acknowledgements.
     *
     * @param batchFunctionalAcknowledgements the batchFunctionalAcknowledgements value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withBatchFunctionalAcknowledgements(boolean batchFunctionalAcknowledgements) {
        this.batchFunctionalAcknowledgements = batchFunctionalAcknowledgements;
        return this;
    }

    /**
     * Get the value indicating whether implementation acknowledgement is needed.
     *
     * @return the needImplementationAcknowledgement value
     */
    public boolean needImplementationAcknowledgement() {
        return this.needImplementationAcknowledgement;
    }

    /**
     * Set the value indicating whether implementation acknowledgement is needed.
     *
     * @param needImplementationAcknowledgement the needImplementationAcknowledgement value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withNeedImplementationAcknowledgement(boolean needImplementationAcknowledgement) {
        this.needImplementationAcknowledgement = needImplementationAcknowledgement;
        return this;
    }

    /**
     * Get the implementation acknowledgement version.
     *
     * @return the implementationAcknowledgementVersion value
     */
    public String implementationAcknowledgementVersion() {
        return this.implementationAcknowledgementVersion;
    }

    /**
     * Set the implementation acknowledgement version.
     *
     * @param implementationAcknowledgementVersion the implementationAcknowledgementVersion value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withImplementationAcknowledgementVersion(String implementationAcknowledgementVersion) {
        this.implementationAcknowledgementVersion = implementationAcknowledgementVersion;
        return this;
    }

    /**
     * Get the value indicating whether to batch implementation acknowledgements.
     *
     * @return the batchImplementationAcknowledgements value
     */
    public boolean batchImplementationAcknowledgements() {
        return this.batchImplementationAcknowledgements;
    }

    /**
     * Set the value indicating whether to batch implementation acknowledgements.
     *
     * @param batchImplementationAcknowledgements the batchImplementationAcknowledgements value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withBatchImplementationAcknowledgements(boolean batchImplementationAcknowledgements) {
        this.batchImplementationAcknowledgements = batchImplementationAcknowledgements;
        return this;
    }

    /**
     * Get the value indicating whether a loop is needed for valid messages.
     *
     * @return the needLoopForValidMessages value
     */
    public boolean needLoopForValidMessages() {
        return this.needLoopForValidMessages;
    }

    /**
     * Set the value indicating whether a loop is needed for valid messages.
     *
     * @param needLoopForValidMessages the needLoopForValidMessages value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withNeedLoopForValidMessages(boolean needLoopForValidMessages) {
        this.needLoopForValidMessages = needLoopForValidMessages;
        return this;
    }

    /**
     * Get the value indicating whether to send synchronous acknowledgement.
     *
     * @return the sendSynchronousAcknowledgement value
     */
    public boolean sendSynchronousAcknowledgement() {
        return this.sendSynchronousAcknowledgement;
    }

    /**
     * Set the value indicating whether to send synchronous acknowledgement.
     *
     * @param sendSynchronousAcknowledgement the sendSynchronousAcknowledgement value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withSendSynchronousAcknowledgement(boolean sendSynchronousAcknowledgement) {
        this.sendSynchronousAcknowledgement = sendSynchronousAcknowledgement;
        return this;
    }

    /**
     * Get the acknowledgement control number prefix.
     *
     * @return the acknowledgementControlNumberPrefix value
     */
    public String acknowledgementControlNumberPrefix() {
        return this.acknowledgementControlNumberPrefix;
    }

    /**
     * Set the acknowledgement control number prefix.
     *
     * @param acknowledgementControlNumberPrefix the acknowledgementControlNumberPrefix value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withAcknowledgementControlNumberPrefix(String acknowledgementControlNumberPrefix) {
        this.acknowledgementControlNumberPrefix = acknowledgementControlNumberPrefix;
        return this;
    }

    /**
     * Get the acknowledgement control number suffix.
     *
     * @return the acknowledgementControlNumberSuffix value
     */
    public String acknowledgementControlNumberSuffix() {
        return this.acknowledgementControlNumberSuffix;
    }

    /**
     * Set the acknowledgement control number suffix.
     *
     * @param acknowledgementControlNumberSuffix the acknowledgementControlNumberSuffix value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withAcknowledgementControlNumberSuffix(String acknowledgementControlNumberSuffix) {
        this.acknowledgementControlNumberSuffix = acknowledgementControlNumberSuffix;
        return this;
    }

    /**
     * Get the acknowledgement control number lower bound.
     *
     * @return the acknowledgementControlNumberLowerBound value
     */
    public int acknowledgementControlNumberLowerBound() {
        return this.acknowledgementControlNumberLowerBound;
    }

    /**
     * Set the acknowledgement control number lower bound.
     *
     * @param acknowledgementControlNumberLowerBound the acknowledgementControlNumberLowerBound value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withAcknowledgementControlNumberLowerBound(int acknowledgementControlNumberLowerBound) {
        this.acknowledgementControlNumberLowerBound = acknowledgementControlNumberLowerBound;
        return this;
    }

    /**
     * Get the acknowledgement control number upper bound.
     *
     * @return the acknowledgementControlNumberUpperBound value
     */
    public int acknowledgementControlNumberUpperBound() {
        return this.acknowledgementControlNumberUpperBound;
    }

    /**
     * Set the acknowledgement control number upper bound.
     *
     * @param acknowledgementControlNumberUpperBound the acknowledgementControlNumberUpperBound value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withAcknowledgementControlNumberUpperBound(int acknowledgementControlNumberUpperBound) {
        this.acknowledgementControlNumberUpperBound = acknowledgementControlNumberUpperBound;
        return this;
    }

    /**
     * Get the value indicating whether to rollover acknowledgement control number.
     *
     * @return the rolloverAcknowledgementControlNumber value
     */
    public boolean rolloverAcknowledgementControlNumber() {
        return this.rolloverAcknowledgementControlNumber;
    }

    /**
     * Set the value indicating whether to rollover acknowledgement control number.
     *
     * @param rolloverAcknowledgementControlNumber the rolloverAcknowledgementControlNumber value to set
     * @return the X12AcknowledgementSettings object itself.
     */
    public X12AcknowledgementSettings withRolloverAcknowledgementControlNumber(boolean rolloverAcknowledgementControlNumber) {
        this.rolloverAcknowledgementControlNumber = rolloverAcknowledgementControlNumber;
        return this;
    }

}
