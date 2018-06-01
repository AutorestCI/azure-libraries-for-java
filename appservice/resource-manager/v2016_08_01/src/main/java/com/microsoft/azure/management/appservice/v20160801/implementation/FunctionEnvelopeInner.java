/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v20160801.ProxyOnlyResource;

/**
 * Web Job Information.
 */
@JsonFlatten
public class FunctionEnvelopeInner extends ProxyOnlyResource {
    /**
     * Function name.
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String functionEnvelopeName;

    /**
     * Function App ID.
     */
    @JsonProperty(value = "properties.functionAppId", access = JsonProperty.Access.WRITE_ONLY)
    private String functionAppId;

    /**
     * Script root path URI.
     */
    @JsonProperty(value = "properties.scriptRootPathHref")
    private String scriptRootPathHref;

    /**
     * Script URI.
     */
    @JsonProperty(value = "properties.scriptHref")
    private String scriptHref;

    /**
     * Config URI.
     */
    @JsonProperty(value = "properties.configHref")
    private String configHref;

    /**
     * Secrets file URI.
     */
    @JsonProperty(value = "properties.secretsFileHref")
    private String secretsFileHref;

    /**
     * Function URI.
     */
    @JsonProperty(value = "properties.href")
    private String href;

    /**
     * Config information.
     */
    @JsonProperty(value = "properties.config")
    private Object config;

    /**
     * File list.
     */
    @JsonProperty(value = "properties.files")
    private Map<String, String> files;

    /**
     * Test data used when testing via the Azure Portal.
     */
    @JsonProperty(value = "properties.testData")
    private String testData;

    /**
     * Get function name.
     *
     * @return the functionEnvelopeName value
     */
    public String functionEnvelopeName() {
        return this.functionEnvelopeName;
    }

    /**
     * Get function App ID.
     *
     * @return the functionAppId value
     */
    public String functionAppId() {
        return this.functionAppId;
    }

    /**
     * Get script root path URI.
     *
     * @return the scriptRootPathHref value
     */
    public String scriptRootPathHref() {
        return this.scriptRootPathHref;
    }

    /**
     * Set script root path URI.
     *
     * @param scriptRootPathHref the scriptRootPathHref value to set
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withScriptRootPathHref(String scriptRootPathHref) {
        this.scriptRootPathHref = scriptRootPathHref;
        return this;
    }

    /**
     * Get script URI.
     *
     * @return the scriptHref value
     */
    public String scriptHref() {
        return this.scriptHref;
    }

    /**
     * Set script URI.
     *
     * @param scriptHref the scriptHref value to set
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withScriptHref(String scriptHref) {
        this.scriptHref = scriptHref;
        return this;
    }

    /**
     * Get config URI.
     *
     * @return the configHref value
     */
    public String configHref() {
        return this.configHref;
    }

    /**
     * Set config URI.
     *
     * @param configHref the configHref value to set
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withConfigHref(String configHref) {
        this.configHref = configHref;
        return this;
    }

    /**
     * Get secrets file URI.
     *
     * @return the secretsFileHref value
     */
    public String secretsFileHref() {
        return this.secretsFileHref;
    }

    /**
     * Set secrets file URI.
     *
     * @param secretsFileHref the secretsFileHref value to set
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withSecretsFileHref(String secretsFileHref) {
        this.secretsFileHref = secretsFileHref;
        return this;
    }

    /**
     * Get function URI.
     *
     * @return the href value
     */
    public String href() {
        return this.href;
    }

    /**
     * Set function URI.
     *
     * @param href the href value to set
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get config information.
     *
     * @return the config value
     */
    public Object config() {
        return this.config;
    }

    /**
     * Set config information.
     *
     * @param config the config value to set
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withConfig(Object config) {
        this.config = config;
        return this;
    }

    /**
     * Get file list.
     *
     * @return the files value
     */
    public Map<String, String> files() {
        return this.files;
    }

    /**
     * Set file list.
     *
     * @param files the files value to set
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withFiles(Map<String, String> files) {
        this.files = files;
        return this;
    }

    /**
     * Get test data used when testing via the Azure Portal.
     *
     * @return the testData value
     */
    public String testData() {
        return this.testData;
    }

    /**
     * Set test data used when testing via the Azure Portal.
     *
     * @param testData the testData value to set
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withTestData(String testData) {
        this.testData = testData;
        return this;
    }

}
