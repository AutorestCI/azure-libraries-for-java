/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import java.util.List;
import com.microsoft.azure.management.appservice.v20180201.TriggeredJobRun;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v20180201.ProxyOnlyResource;

/**
 * Triggered Web Job History. List of Triggered Web Job Run Information
 * elements.
 */
@JsonFlatten
public class TriggeredJobHistoryInner extends ProxyOnlyResource {
    /**
     * List of triggered web job runs.
     */
    @JsonProperty(value = "properties.runs")
    private List<TriggeredJobRun> runs;

    /**
     * Get list of triggered web job runs.
     *
     * @return the runs value
     */
    public List<TriggeredJobRun> runs() {
        return this.runs;
    }

    /**
     * Set list of triggered web job runs.
     *
     * @param runs the runs value to set
     * @return the TriggeredJobHistoryInner object itself.
     */
    public TriggeredJobHistoryInner withRuns(List<TriggeredJobRun> runs) {
        this.runs = runs;
        return this;
    }

}
