/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v20180201.HostingEnvironmentProfile;
import com.microsoft.azure.management.appservice.v20180201.KeyVaultSecretStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * SSL certificate for an app.
 */
@JsonFlatten
public class CertificateInner extends Resource {
    /**
     * Friendly name of the certificate.
     */
    @JsonProperty(value = "properties.friendlyName", access = JsonProperty.Access.WRITE_ONLY)
    private String friendlyName;

    /**
     * Subject name of the certificate.
     */
    @JsonProperty(value = "properties.subjectName", access = JsonProperty.Access.WRITE_ONLY)
    private String subjectName;

    /**
     * Host names the certificate applies to.
     */
    @JsonProperty(value = "properties.hostNames")
    private List<String> hostNames;

    /**
     * Pfx blob.
     */
    @JsonProperty(value = "properties.pfxBlob")
    private byte[] pfxBlob;

    /**
     * App name.
     */
    @JsonProperty(value = "properties.siteName", access = JsonProperty.Access.WRITE_ONLY)
    private String siteName;

    /**
     * Self link.
     */
    @JsonProperty(value = "properties.selfLink", access = JsonProperty.Access.WRITE_ONLY)
    private String selfLink;

    /**
     * Certificate issuer.
     */
    @JsonProperty(value = "properties.issuer", access = JsonProperty.Access.WRITE_ONLY)
    private String issuer;

    /**
     * Certificate issue Date.
     */
    @JsonProperty(value = "properties.issueDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime issueDate;

    /**
     * Certificate expriration date.
     */
    @JsonProperty(value = "properties.expirationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime expirationDate;

    /**
     * Certificate password.
     */
    @JsonProperty(value = "properties.password", required = true)
    private String password;

    /**
     * Certificate thumbprint.
     */
    @JsonProperty(value = "properties.thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /**
     * Is the certificate valid?.
     */
    @JsonProperty(value = "properties.valid", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean valid;

    /**
     * Raw bytes of .cer file.
     */
    @JsonProperty(value = "properties.cerBlob", access = JsonProperty.Access.WRITE_ONLY)
    private byte[] cerBlob;

    /**
     * Public key hash.
     */
    @JsonProperty(value = "properties.publicKeyHash", access = JsonProperty.Access.WRITE_ONLY)
    private String publicKeyHash;

    /**
     * Specification for the App Service Environment to use for the
     * certificate.
     */
    @JsonProperty(value = "properties.hostingEnvironmentProfile", access = JsonProperty.Access.WRITE_ONLY)
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /**
     * Key Vault Csm resource Id.
     */
    @JsonProperty(value = "properties.keyVaultId")
    private String keyVaultId;

    /**
     * Key Vault secret name.
     */
    @JsonProperty(value = "properties.keyVaultSecretName")
    private String keyVaultSecretName;

    /**
     * Status of the Key Vault secret. Possible values include: 'Initialized',
     * 'WaitingOnCertificateOrder', 'Succeeded', 'CertificateOrderFailed',
     * 'OperationNotPermittedOnKeyVault',
     * 'AzureServiceUnauthorizedToAccessKeyVault', 'KeyVaultDoesNotExist',
     * 'KeyVaultSecretDoesNotExist', 'UnknownError', 'ExternalPrivateKey',
     * 'Unknown'.
     */
    @JsonProperty(value = "properties.keyVaultSecretStatus", access = JsonProperty.Access.WRITE_ONLY)
    private KeyVaultSecretStatus keyVaultSecretStatus;

    /**
     * Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     */
    @JsonProperty(value = "properties.serverFarmId")
    private String serverFarmId;

    /**
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get friendly name of the certificate.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Get subject name of the certificate.
     *
     * @return the subjectName value
     */
    public String subjectName() {
        return this.subjectName;
    }

    /**
     * Get host names the certificate applies to.
     *
     * @return the hostNames value
     */
    public List<String> hostNames() {
        return this.hostNames;
    }

    /**
     * Set host names the certificate applies to.
     *
     * @param hostNames the hostNames value to set
     * @return the CertificateInner object itself.
     */
    public CertificateInner withHostNames(List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }

    /**
     * Get pfx blob.
     *
     * @return the pfxBlob value
     */
    public byte[] pfxBlob() {
        return this.pfxBlob;
    }

    /**
     * Set pfx blob.
     *
     * @param pfxBlob the pfxBlob value to set
     * @return the CertificateInner object itself.
     */
    public CertificateInner withPfxBlob(byte[] pfxBlob) {
        this.pfxBlob = pfxBlob;
        return this;
    }

    /**
     * Get app name.
     *
     * @return the siteName value
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Get self link.
     *
     * @return the selfLink value
     */
    public String selfLink() {
        return this.selfLink;
    }

    /**
     * Get certificate issuer.
     *
     * @return the issuer value
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Get certificate issue Date.
     *
     * @return the issueDate value
     */
    public DateTime issueDate() {
        return this.issueDate;
    }

    /**
     * Get certificate expriration date.
     *
     * @return the expirationDate value
     */
    public DateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Get certificate password.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set certificate password.
     *
     * @param password the password value to set
     * @return the CertificateInner object itself.
     */
    public CertificateInner withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get certificate thumbprint.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get is the certificate valid?.
     *
     * @return the valid value
     */
    public Boolean valid() {
        return this.valid;
    }

    /**
     * Get raw bytes of .cer file.
     *
     * @return the cerBlob value
     */
    public byte[] cerBlob() {
        return this.cerBlob;
    }

    /**
     * Get public key hash.
     *
     * @return the publicKeyHash value
     */
    public String publicKeyHash() {
        return this.publicKeyHash;
    }

    /**
     * Get specification for the App Service Environment to use for the certificate.
     *
     * @return the hostingEnvironmentProfile value
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Get key Vault Csm resource Id.
     *
     * @return the keyVaultId value
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set key Vault Csm resource Id.
     *
     * @param keyVaultId the keyVaultId value to set
     * @return the CertificateInner object itself.
     */
    public CertificateInner withKeyVaultId(String keyVaultId) {
        this.keyVaultId = keyVaultId;
        return this;
    }

    /**
     * Get key Vault secret name.
     *
     * @return the keyVaultSecretName value
     */
    public String keyVaultSecretName() {
        return this.keyVaultSecretName;
    }

    /**
     * Set key Vault secret name.
     *
     * @param keyVaultSecretName the keyVaultSecretName value to set
     * @return the CertificateInner object itself.
     */
    public CertificateInner withKeyVaultSecretName(String keyVaultSecretName) {
        this.keyVaultSecretName = keyVaultSecretName;
        return this;
    }

    /**
     * Get status of the Key Vault secret. Possible values include: 'Initialized', 'WaitingOnCertificateOrder', 'Succeeded', 'CertificateOrderFailed', 'OperationNotPermittedOnKeyVault', 'AzureServiceUnauthorizedToAccessKeyVault', 'KeyVaultDoesNotExist', 'KeyVaultSecretDoesNotExist', 'UnknownError', 'ExternalPrivateKey', 'Unknown'.
     *
     * @return the keyVaultSecretStatus value
     */
    public KeyVaultSecretStatus keyVaultSecretStatus() {
        return this.keyVaultSecretStatus;
    }

    /**
     * Get resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     *
     * @return the serverFarmId value
     */
    public String serverFarmId() {
        return this.serverFarmId;
    }

    /**
     * Set resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     *
     * @param serverFarmId the serverFarmId value to set
     * @return the CertificateInner object itself.
     */
    public CertificateInner withServerFarmId(String serverFarmId) {
        this.serverFarmId = serverFarmId;
        return this;
    }

    /**
     * Get kind of resource.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set kind of resource.
     *
     * @param kind the kind value to set
     * @return the CertificateInner object itself.
     */
    public CertificateInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

}
