/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the service name.
 */
public class ServiceNameInfoInner {
    /**
     * The identity of the service. This is an encoded representation of the
     * service name. This is used in the REST APIs to identify the service
     * resource.
     * Starting in version 6.0, hierarchical names are delimited with the "\~"
     * character. For example, if the service name is
     * "fabric:/myapp/app1/svc1",
     * the service identity would be "myapp~app1\~svc1" in 6.0+ and
     * "myapp/app1/svc1" in previous versions.
     */
    @JsonProperty(value = "Id")
    private String id;

    /**
     * The full name of the service with 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ServiceNameInfoInner object itself.
     */
    public ServiceNameInfoInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ServiceNameInfoInner object itself.
     */
    public ServiceNameInfoInner withName(String name) {
        this.name = name;
        return this;
    }

}
