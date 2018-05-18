/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the settings for Caffe2 job.
 */
public class Caffe2Settings {
    /**
     * The path and file name of the python script to execute the job.
     */
    @JsonProperty(value = "pythonScriptFilePath", required = true)
    private String pythonScriptFilePath;

    /**
     * The path to python interpreter.
     */
    @JsonProperty(value = "pythonInterpreterPath")
    private String pythonInterpreterPath;

    /**
     * Command line arguments that needs to be passed to the python script.
     */
    @JsonProperty(value = "commandLineArgs")
    private String commandLineArgs;

    /**
     * Get the pythonScriptFilePath value.
     *
     * @return the pythonScriptFilePath value
     */
    public String pythonScriptFilePath() {
        return this.pythonScriptFilePath;
    }

    /**
     * Set the pythonScriptFilePath value.
     *
     * @param pythonScriptFilePath the pythonScriptFilePath value to set
     * @return the Caffe2Settings object itself.
     */
    public Caffe2Settings withPythonScriptFilePath(String pythonScriptFilePath) {
        this.pythonScriptFilePath = pythonScriptFilePath;
        return this;
    }

    /**
     * Get the pythonInterpreterPath value.
     *
     * @return the pythonInterpreterPath value
     */
    public String pythonInterpreterPath() {
        return this.pythonInterpreterPath;
    }

    /**
     * Set the pythonInterpreterPath value.
     *
     * @param pythonInterpreterPath the pythonInterpreterPath value to set
     * @return the Caffe2Settings object itself.
     */
    public Caffe2Settings withPythonInterpreterPath(String pythonInterpreterPath) {
        this.pythonInterpreterPath = pythonInterpreterPath;
        return this;
    }

    /**
     * Get the commandLineArgs value.
     *
     * @return the commandLineArgs value
     */
    public String commandLineArgs() {
        return this.commandLineArgs;
    }

    /**
     * Set the commandLineArgs value.
     *
     * @param commandLineArgs the commandLineArgs value to set
     * @return the Caffe2Settings object itself.
     */
    public Caffe2Settings withCommandLineArgs(String commandLineArgs) {
        this.commandLineArgs = commandLineArgs;
        return this;
    }

}
