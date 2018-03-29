/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.implementation.DatasetInner;

/**
 * An on-premises file system dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FileShare")
@JsonFlatten
public class FileShareDataset extends DatasetInner {
    /**
     * The path of the on-premises file system. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.folderPath")
    private Object folderPath;

    /**
     * The name of the on-premises file system. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.fileName")
    private Object fileName;

    /**
     * The format of the files.
     */
    @JsonProperty(value = "typeProperties.format")
    private DatasetStorageFormat format;

    /**
     * Specify a filter to be used to select a subset of files in the
     * folderPath rather than all files. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.fileFilter")
    private Object fileFilter;

    /**
     * The data compression method used for the file system.
     */
    @JsonProperty(value = "typeProperties.compression")
    private DatasetCompression compression;

    /**
     * Get the folderPath value.
     *
     * @return the folderPath value
     */
    public Object folderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath value.
     *
     * @param folderPath the folderPath value to set
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withFolderPath(Object folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the fileName value.
     *
     * @return the fileName value
     */
    public Object fileName() {
        return this.fileName;
    }

    /**
     * Set the fileName value.
     *
     * @param fileName the fileName value to set
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withFileName(Object fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the format value.
     *
     * @return the format value
     */
    public DatasetStorageFormat format() {
        return this.format;
    }

    /**
     * Set the format value.
     *
     * @param format the format value to set
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the fileFilter value.
     *
     * @return the fileFilter value
     */
    public Object fileFilter() {
        return this.fileFilter;
    }

    /**
     * Set the fileFilter value.
     *
     * @param fileFilter the fileFilter value to set
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withFileFilter(Object fileFilter) {
        this.fileFilter = fileFilter;
        return this;
    }

    /**
     * Get the compression value.
     *
     * @return the compression value
     */
    public DatasetCompression compression() {
        return this.compression;
    }

    /**
     * Set the compression value.
     *
     * @param compression the compression value to set
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

}
