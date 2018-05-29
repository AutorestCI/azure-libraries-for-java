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
 * The X12 one-way agreement.
 */
public class X12OneWayAgreement {
    /**
     * The sender business identity.
     */
    @JsonProperty(value = "senderBusinessIdentity", required = true)
    private BusinessIdentity senderBusinessIdentity;

    /**
     * The receiver business identity.
     */
    @JsonProperty(value = "receiverBusinessIdentity", required = true)
    private BusinessIdentity receiverBusinessIdentity;

    /**
     * The X12 protocol settings.
     */
    @JsonProperty(value = "protocolSettings", required = true)
    private X12ProtocolSettings protocolSettings;

    /**
     * Get the sender business identity.
     *
     * @return the senderBusinessIdentity value
     */
    public BusinessIdentity senderBusinessIdentity() {
        return this.senderBusinessIdentity;
    }

    /**
     * Set the sender business identity.
     *
     * @param senderBusinessIdentity the senderBusinessIdentity value to set
     * @return the X12OneWayAgreement object itself.
     */
    public X12OneWayAgreement withSenderBusinessIdentity(BusinessIdentity senderBusinessIdentity) {
        this.senderBusinessIdentity = senderBusinessIdentity;
        return this;
    }

    /**
     * Get the receiver business identity.
     *
     * @return the receiverBusinessIdentity value
     */
    public BusinessIdentity receiverBusinessIdentity() {
        return this.receiverBusinessIdentity;
    }

    /**
     * Set the receiver business identity.
     *
     * @param receiverBusinessIdentity the receiverBusinessIdentity value to set
     * @return the X12OneWayAgreement object itself.
     */
    public X12OneWayAgreement withReceiverBusinessIdentity(BusinessIdentity receiverBusinessIdentity) {
        this.receiverBusinessIdentity = receiverBusinessIdentity;
        return this;
    }

    /**
     * Get the X12 protocol settings.
     *
     * @return the protocolSettings value
     */
    public X12ProtocolSettings protocolSettings() {
        return this.protocolSettings;
    }

    /**
     * Set the X12 protocol settings.
     *
     * @param protocolSettings the protocolSettings value to set
     * @return the X12OneWayAgreement object itself.
     */
    public X12OneWayAgreement withProtocolSettings(X12ProtocolSettings protocolSettings) {
        this.protocolSettings = protocolSettings;
        return this;
    }

}
