/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web.implementation;

import com.microsoft.azure.management.web.CertificateOrderActionType;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.web.ProxyOnlyResource;

/**
 * Certificate order action.
 */
@JsonFlatten
public class CertificateOrderActionInner extends ProxyOnlyResource {
    /**
     * Action type. Possible values include: 'CertificateIssued',
     * 'CertificateOrderCanceled', 'CertificateOrderCreated',
     * 'CertificateRevoked', 'DomainValidationComplete', 'FraudDetected',
     * 'OrgNameChange', 'OrgValidationComplete', 'SanDrop', 'FraudCleared',
     * 'CertificateExpired', 'CertificateExpirationWarning',
     * 'FraudDocumentationRequired', 'Unknown'.
     */
    @JsonProperty(value = "properties.type")
    private CertificateOrderActionType certificateOrderActionType;

    /**
     * Time at which the certificate action was performed.
     */
    @JsonProperty(value = "properties.createdAt")
    private DateTime createdAt;

    /**
     * Get action type. Possible values include: 'CertificateIssued', 'CertificateOrderCanceled', 'CertificateOrderCreated', 'CertificateRevoked', 'DomainValidationComplete', 'FraudDetected', 'OrgNameChange', 'OrgValidationComplete', 'SanDrop', 'FraudCleared', 'CertificateExpired', 'CertificateExpirationWarning', 'FraudDocumentationRequired', 'Unknown'.
     *
     * @return the certificateOrderActionType value
     */
    public CertificateOrderActionType certificateOrderActionType() {
        return this.certificateOrderActionType;
    }

    /**
     * Set action type. Possible values include: 'CertificateIssued', 'CertificateOrderCanceled', 'CertificateOrderCreated', 'CertificateRevoked', 'DomainValidationComplete', 'FraudDetected', 'OrgNameChange', 'OrgValidationComplete', 'SanDrop', 'FraudCleared', 'CertificateExpired', 'CertificateExpirationWarning', 'FraudDocumentationRequired', 'Unknown'.
     *
     * @param certificateOrderActionType the certificateOrderActionType value to set
     * @return the CertificateOrderActionInner object itself.
     */
    public CertificateOrderActionInner withCertificateOrderActionType(CertificateOrderActionType certificateOrderActionType) {
        this.certificateOrderActionType = certificateOrderActionType;
        return this;
    }

    /**
     * Get time at which the certificate action was performed.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Set time at which the certificate action was performed.
     *
     * @param createdAt the createdAt value to set
     * @return the CertificateOrderActionInner object itself.
     */
    public CertificateOrderActionInner withCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

}
