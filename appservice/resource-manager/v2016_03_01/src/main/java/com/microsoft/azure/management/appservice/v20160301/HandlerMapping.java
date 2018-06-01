/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IIS handler mappings used to define which handler processes HTTP
 * requests with certain extension.
 * For example, it is used to configure php-cgi.exe process to handle all HTTP
 * requests with *.php extension.
 */
public class HandlerMapping {
    /**
     * Requests with this extension will be handled using the specified FastCGI
     * application.
     */
    @JsonProperty(value = "extension")
    private String extension;

    /**
     * The absolute path to the FastCGI application.
     */
    @JsonProperty(value = "scriptProcessor")
    private String scriptProcessor;

    /**
     * Command-line arguments to be passed to the script processor.
     */
    @JsonProperty(value = "arguments")
    private String arguments;

    /**
     * Get requests with this extension will be handled using the specified FastCGI application.
     *
     * @return the extension value
     */
    public String extension() {
        return this.extension;
    }

    /**
     * Set requests with this extension will be handled using the specified FastCGI application.
     *
     * @param extension the extension value to set
     * @return the HandlerMapping object itself.
     */
    public HandlerMapping withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Get the absolute path to the FastCGI application.
     *
     * @return the scriptProcessor value
     */
    public String scriptProcessor() {
        return this.scriptProcessor;
    }

    /**
     * Set the absolute path to the FastCGI application.
     *
     * @param scriptProcessor the scriptProcessor value to set
     * @return the HandlerMapping object itself.
     */
    public HandlerMapping withScriptProcessor(String scriptProcessor) {
        this.scriptProcessor = scriptProcessor;
        return this;
    }

    /**
     * Get command-line arguments to be passed to the script processor.
     *
     * @return the arguments value
     */
    public String arguments() {
        return this.arguments;
    }

    /**
     * Set command-line arguments to be passed to the script processor.
     *
     * @param arguments the arguments value to set
     * @return the HandlerMapping object itself.
     */
    public HandlerMapping withArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }

}
