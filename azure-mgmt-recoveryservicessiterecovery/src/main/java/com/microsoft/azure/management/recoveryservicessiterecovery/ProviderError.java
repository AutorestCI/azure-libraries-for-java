/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class contains the error details per object.
 */
public class ProviderError {
    /**
     * The Error code.
     */
    @JsonProperty(value = "errorCode")
    private Integer errorCode;

    /**
     * The Error message.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /**
     * The Provider error Id.
     */
    @JsonProperty(value = "errorId")
    private String errorId;

    /**
     * The possible causes for the error.
     */
    @JsonProperty(value = "possibleCauses")
    private String possibleCauses;

    /**
     * The recommended action to resolve the error.
     */
    @JsonProperty(value = "recommendedAction")
    private String recommendedAction;

    /**
     * Get the errorCode value.
     *
     * @return the errorCode value
     */
    public Integer errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode value.
     *
     * @param errorCode the errorCode value to set
     * @return the ProviderError object itself.
     */
    public ProviderError withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorMessage value.
     *
     * @return the errorMessage value
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage value.
     *
     * @param errorMessage the errorMessage value to set
     * @return the ProviderError object itself.
     */
    public ProviderError withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get the errorId value.
     *
     * @return the errorId value
     */
    public String errorId() {
        return this.errorId;
    }

    /**
     * Set the errorId value.
     *
     * @param errorId the errorId value to set
     * @return the ProviderError object itself.
     */
    public ProviderError withErrorId(String errorId) {
        this.errorId = errorId;
        return this;
    }

    /**
     * Get the possibleCauses value.
     *
     * @return the possibleCauses value
     */
    public String possibleCauses() {
        return this.possibleCauses;
    }

    /**
     * Set the possibleCauses value.
     *
     * @param possibleCauses the possibleCauses value to set
     * @return the ProviderError object itself.
     */
    public ProviderError withPossibleCauses(String possibleCauses) {
        this.possibleCauses = possibleCauses;
        return this;
    }

    /**
     * Get the recommendedAction value.
     *
     * @return the recommendedAction value
     */
    public String recommendedAction() {
        return this.recommendedAction;
    }

    /**
     * Set the recommendedAction value.
     *
     * @param recommendedAction the recommendedAction value to set
     * @return the ProviderError object itself.
     */
    public ProviderError withRecommendedAction(String recommendedAction) {
        this.recommendedAction = recommendedAction;
        return this;
    }

}
