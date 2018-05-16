/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Cluster update request.
 */
@JsonFlatten
public class ClusterUpdateParameters {
    /**
     * The list of add-on features to enable in the cluster.
     */
    @JsonProperty(value = "properties.addOnFeatures")
    private List<String> addOnFeatures;

    /**
     * The certificate to use for securing the cluster. The certificate
     * provided will be used for  node to node security within the cluster, SSL
     * certificate for cluster management endpoint and default  admin client.
     */
    @JsonProperty(value = "properties.certificate")
    private CertificateDescription certificate;

    /**
     * Describes a list of server certificates referenced by common name that
     * are used to secure the cluster.
     */
    @JsonProperty(value = "properties.certificateCommonNames")
    private ServerCertificateCommonNames certificateCommonNames;

    /**
     * The list of client certificates referenced by common name that are
     * allowed to manage the cluster. This will overwrite the existing list.
     */
    @JsonProperty(value = "properties.clientCertificateCommonNames")
    private List<ClientCertificateCommonName> clientCertificateCommonNames;

    /**
     * The list of client certificates referenced by thumbprint that are
     * allowed to manage the cluster. This will overwrite the existing list.
     */
    @JsonProperty(value = "properties.clientCertificateThumbprints")
    private List<ClientCertificateThumbprint> clientCertificateThumbprints;

    /**
     * The Service Fabric runtime version of the cluster. This property can
     * only by set the user when **upgradeMode** is set to 'Manual'. To get
     * list of available Service Fabric versions for new clusters use
     * [ClusterVersion API](./ClusterVersion.md). To get the list of available
     * version for existing clusters use **availableClusterVersions**.
     */
    @JsonProperty(value = "properties.clusterCodeVersion")
    private String clusterCodeVersion;

    /**
     * The list of custom fabric settings to configure the cluster. This will
     * overwrite the existing list.
     */
    @JsonProperty(value = "properties.fabricSettings")
    private List<SettingsSectionDescription> fabricSettings;

    /**
     * The list of node types in the cluster. This will overwrite the existing
     * list.
     */
    @JsonProperty(value = "properties.nodeTypes")
    private List<NodeTypeDescription> nodeTypes;

    /**
     * The reliability level sets the replica set size of system services.
     * Learn about
     * [ReliabilityLevel](https://docs.microsoft.com/en-us/azure/service-fabric/service-fabric-cluster-capacity).
     *
     * - None - Run the System services with a target replica set count of 1.
     * This should only be used for test clusters.
     * - Bronze - Run the System services with a target replica set count of 3.
     * This should only be used for test clusters.
     * - Silver - Run the System services with a target replica set count of 5.
     * - Gold - Run the System services with a target replica set count of 7.
     * - Platinum - Run the System services with a target replica set count of
     * 9.
     * . Possible values include: 'None', 'Bronze', 'Silver', 'Gold',
     * 'Platinum'.
     */
    @JsonProperty(value = "properties.reliabilityLevel")
    private String reliabilityLevel;

    /**
     * The server certificate used by reverse proxy.
     */
    @JsonProperty(value = "properties.reverseProxyCertificate")
    private CertificateDescription reverseProxyCertificate;

    /**
     * The policy to use when upgrading the cluster.
     */
    @JsonProperty(value = "properties.upgradeDescription")
    private ClusterUpgradePolicy upgradeDescription;

    /**
     * The upgrade mode of the cluster when new Service Fabric runtime version
     * is available.
     *
     * - Automatic - The cluster will be automatically upgraded to the latest
     * Service Fabric runtime version as soon as it is available.
     * - Manual - The cluster will not be automatically upgraded to the latest
     * Service Fabric runtime version. The cluster is upgraded by setting the
     * **clusterCodeVersion** property in the cluster resource.
     * . Possible values include: 'Automatic', 'Manual'.
     */
    @JsonProperty(value = "properties.upgradeMode")
    private String upgradeMode;

    /**
     * Cluster update parameters.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the addOnFeatures value.
     *
     * @return the addOnFeatures value
     */
    public List<String> addOnFeatures() {
        return this.addOnFeatures;
    }

    /**
     * Set the addOnFeatures value.
     *
     * @param addOnFeatures the addOnFeatures value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withAddOnFeatures(List<String> addOnFeatures) {
        this.addOnFeatures = addOnFeatures;
        return this;
    }

    /**
     * Get the certificate value.
     *
     * @return the certificate value
     */
    public CertificateDescription certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate value.
     *
     * @param certificate the certificate value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withCertificate(CertificateDescription certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get the certificateCommonNames value.
     *
     * @return the certificateCommonNames value
     */
    public ServerCertificateCommonNames certificateCommonNames() {
        return this.certificateCommonNames;
    }

    /**
     * Set the certificateCommonNames value.
     *
     * @param certificateCommonNames the certificateCommonNames value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withCertificateCommonNames(ServerCertificateCommonNames certificateCommonNames) {
        this.certificateCommonNames = certificateCommonNames;
        return this;
    }

    /**
     * Get the clientCertificateCommonNames value.
     *
     * @return the clientCertificateCommonNames value
     */
    public List<ClientCertificateCommonName> clientCertificateCommonNames() {
        return this.clientCertificateCommonNames;
    }

    /**
     * Set the clientCertificateCommonNames value.
     *
     * @param clientCertificateCommonNames the clientCertificateCommonNames value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withClientCertificateCommonNames(List<ClientCertificateCommonName> clientCertificateCommonNames) {
        this.clientCertificateCommonNames = clientCertificateCommonNames;
        return this;
    }

    /**
     * Get the clientCertificateThumbprints value.
     *
     * @return the clientCertificateThumbprints value
     */
    public List<ClientCertificateThumbprint> clientCertificateThumbprints() {
        return this.clientCertificateThumbprints;
    }

    /**
     * Set the clientCertificateThumbprints value.
     *
     * @param clientCertificateThumbprints the clientCertificateThumbprints value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withClientCertificateThumbprints(List<ClientCertificateThumbprint> clientCertificateThumbprints) {
        this.clientCertificateThumbprints = clientCertificateThumbprints;
        return this;
    }

    /**
     * Get the clusterCodeVersion value.
     *
     * @return the clusterCodeVersion value
     */
    public String clusterCodeVersion() {
        return this.clusterCodeVersion;
    }

    /**
     * Set the clusterCodeVersion value.
     *
     * @param clusterCodeVersion the clusterCodeVersion value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withClusterCodeVersion(String clusterCodeVersion) {
        this.clusterCodeVersion = clusterCodeVersion;
        return this;
    }

    /**
     * Get the fabricSettings value.
     *
     * @return the fabricSettings value
     */
    public List<SettingsSectionDescription> fabricSettings() {
        return this.fabricSettings;
    }

    /**
     * Set the fabricSettings value.
     *
     * @param fabricSettings the fabricSettings value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withFabricSettings(List<SettingsSectionDescription> fabricSettings) {
        this.fabricSettings = fabricSettings;
        return this;
    }

    /**
     * Get the nodeTypes value.
     *
     * @return the nodeTypes value
     */
    public List<NodeTypeDescription> nodeTypes() {
        return this.nodeTypes;
    }

    /**
     * Set the nodeTypes value.
     *
     * @param nodeTypes the nodeTypes value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withNodeTypes(List<NodeTypeDescription> nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }

    /**
     * Get the reliabilityLevel value.
     *
     * @return the reliabilityLevel value
     */
    public String reliabilityLevel() {
        return this.reliabilityLevel;
    }

    /**
     * Set the reliabilityLevel value.
     *
     * @param reliabilityLevel the reliabilityLevel value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withReliabilityLevel(String reliabilityLevel) {
        this.reliabilityLevel = reliabilityLevel;
        return this;
    }

    /**
     * Get the reverseProxyCertificate value.
     *
     * @return the reverseProxyCertificate value
     */
    public CertificateDescription reverseProxyCertificate() {
        return this.reverseProxyCertificate;
    }

    /**
     * Set the reverseProxyCertificate value.
     *
     * @param reverseProxyCertificate the reverseProxyCertificate value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withReverseProxyCertificate(CertificateDescription reverseProxyCertificate) {
        this.reverseProxyCertificate = reverseProxyCertificate;
        return this;
    }

    /**
     * Get the upgradeDescription value.
     *
     * @return the upgradeDescription value
     */
    public ClusterUpgradePolicy upgradeDescription() {
        return this.upgradeDescription;
    }

    /**
     * Set the upgradeDescription value.
     *
     * @param upgradeDescription the upgradeDescription value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withUpgradeDescription(ClusterUpgradePolicy upgradeDescription) {
        this.upgradeDescription = upgradeDescription;
        return this;
    }

    /**
     * Get the upgradeMode value.
     *
     * @return the upgradeMode value
     */
    public String upgradeMode() {
        return this.upgradeMode;
    }

    /**
     * Set the upgradeMode value.
     *
     * @param upgradeMode the upgradeMode value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
