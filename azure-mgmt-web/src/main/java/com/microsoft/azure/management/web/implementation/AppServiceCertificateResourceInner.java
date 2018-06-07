/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web.implementation;

import com.microsoft.azure.management.web.KeyVaultSecretStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Key Vault container ARM resource for a certificate that is purchased through
 * Azure.
 */
@JsonFlatten
public class AppServiceCertificateResourceInner extends Resource {
    /**
     * Key Vault resource Id.
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
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private KeyVaultSecretStatus provisioningState;

    /**
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get key Vault resource Id.
     *
     * @return the keyVaultId value
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set key Vault resource Id.
     *
     * @param keyVaultId the keyVaultId value to set
     * @return the AppServiceCertificateResourceInner object itself.
     */
    public AppServiceCertificateResourceInner withKeyVaultId(String keyVaultId) {
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
     * @return the AppServiceCertificateResourceInner object itself.
     */
    public AppServiceCertificateResourceInner withKeyVaultSecretName(String keyVaultSecretName) {
        this.keyVaultSecretName = keyVaultSecretName;
        return this;
    }

    /**
     * Get status of the Key Vault secret. Possible values include: 'Initialized', 'WaitingOnCertificateOrder', 'Succeeded', 'CertificateOrderFailed', 'OperationNotPermittedOnKeyVault', 'AzureServiceUnauthorizedToAccessKeyVault', 'KeyVaultDoesNotExist', 'KeyVaultSecretDoesNotExist', 'UnknownError', 'ExternalPrivateKey', 'Unknown'.
     *
     * @return the provisioningState value
     */
    public KeyVaultSecretStatus provisioningState() {
        return this.provisioningState;
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
     * @return the AppServiceCertificateResourceInner object itself.
     */
    public AppServiceCertificateResourceInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

}
