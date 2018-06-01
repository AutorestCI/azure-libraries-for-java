/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v20180201.ProxyOnlyResource;

/**
 * Process Module Information.
 */
@JsonFlatten
public class ProcessModuleInfoInner extends ProxyOnlyResource {
    /**
     * Base address. Used as module identifier in ARM resource URI.
     */
    @JsonProperty(value = "properties.base_address")
    private String baseAddress;

    /**
     * File name.
     */
    @JsonProperty(value = "properties.file_name")
    private String fileName;

    /**
     * HRef URI.
     */
    @JsonProperty(value = "properties.href")
    private String href;

    /**
     * File path.
     */
    @JsonProperty(value = "properties.file_path")
    private String filePath;

    /**
     * Module memory size.
     */
    @JsonProperty(value = "properties.module_memory_size")
    private Integer moduleMemorySize;

    /**
     * File version.
     */
    @JsonProperty(value = "properties.file_version")
    private String fileVersion;

    /**
     * File description.
     */
    @JsonProperty(value = "properties.file_description")
    private String fileDescription;

    /**
     * Product name.
     */
    @JsonProperty(value = "properties.product")
    private String product;

    /**
     * Product version.
     */
    @JsonProperty(value = "properties.product_version")
    private String productVersion;

    /**
     * Is debug?.
     */
    @JsonProperty(value = "properties.is_debug")
    private Boolean isDebug;

    /**
     * Module language (locale).
     */
    @JsonProperty(value = "properties.language")
    private String language;

    /**
     * Get base address. Used as module identifier in ARM resource URI.
     *
     * @return the baseAddress value
     */
    public String baseAddress() {
        return this.baseAddress;
    }

    /**
     * Set base address. Used as module identifier in ARM resource URI.
     *
     * @param baseAddress the baseAddress value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withBaseAddress(String baseAddress) {
        this.baseAddress = baseAddress;
        return this;
    }

    /**
     * Get file name.
     *
     * @return the fileName value
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set file name.
     *
     * @param fileName the fileName value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get hRef URI.
     *
     * @return the href value
     */
    public String href() {
        return this.href;
    }

    /**
     * Set hRef URI.
     *
     * @param href the href value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get file path.
     *
     * @return the filePath value
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Set file path.
     *
     * @param filePath the filePath value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Get module memory size.
     *
     * @return the moduleMemorySize value
     */
    public Integer moduleMemorySize() {
        return this.moduleMemorySize;
    }

    /**
     * Set module memory size.
     *
     * @param moduleMemorySize the moduleMemorySize value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withModuleMemorySize(Integer moduleMemorySize) {
        this.moduleMemorySize = moduleMemorySize;
        return this;
    }

    /**
     * Get file version.
     *
     * @return the fileVersion value
     */
    public String fileVersion() {
        return this.fileVersion;
    }

    /**
     * Set file version.
     *
     * @param fileVersion the fileVersion value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }

    /**
     * Get file description.
     *
     * @return the fileDescription value
     */
    public String fileDescription() {
        return this.fileDescription;
    }

    /**
     * Set file description.
     *
     * @param fileDescription the fileDescription value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
        return this;
    }

    /**
     * Get product name.
     *
     * @return the product value
     */
    public String product() {
        return this.product;
    }

    /**
     * Set product name.
     *
     * @param product the product value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get product version.
     *
     * @return the productVersion value
     */
    public String productVersion() {
        return this.productVersion;
    }

    /**
     * Set product version.
     *
     * @param productVersion the productVersion value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }

    /**
     * Get is debug?.
     *
     * @return the isDebug value
     */
    public Boolean isDebug() {
        return this.isDebug;
    }

    /**
     * Set is debug?.
     *
     * @param isDebug the isDebug value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withIsDebug(Boolean isDebug) {
        this.isDebug = isDebug;
        return this;
    }

    /**
     * Get module language (locale).
     *
     * @return the language value
     */
    public String language() {
        return this.language;
    }

    /**
     * Set module language (locale).
     *
     * @param language the language value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withLanguage(String language) {
        this.language = language;
        return this;
    }

}
