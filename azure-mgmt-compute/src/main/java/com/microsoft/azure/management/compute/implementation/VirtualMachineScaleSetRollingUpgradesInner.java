/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineScaleSetRollingUpgrades.
 */
public class VirtualMachineScaleSetRollingUpgradesInner {
    /** The Retrofit service to perform REST calls. */
    private VirtualMachineScaleSetRollingUpgradesService service;
    /** The service client containing this operation class. */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineScaleSetRollingUpgradesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineScaleSetRollingUpgradesInner(Retrofit retrofit, ComputeManagementClientImpl client) {
        this.service = retrofit.create(VirtualMachineScaleSetRollingUpgradesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VirtualMachineScaleSetRollingUpgrades to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachineScaleSetRollingUpgradesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineScaleSetRollingUpgrades cancel" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/cancel")
        Observable<Response<ResponseBody>> cancel(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineScaleSetRollingUpgrades beginCancel" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/cancel")
        Observable<Response<ResponseBody>> beginCancel(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineScaleSetRollingUpgrades startOSUpgrade" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/osRollingUpgrade")
        Observable<Response<ResponseBody>> startOSUpgrade(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineScaleSetRollingUpgrades beginStartOSUpgrade" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/osRollingUpgrade")
        Observable<Response<ResponseBody>> beginStartOSUpgrade(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineScaleSetRollingUpgrades getLatest" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/latest")
        Observable<Response<ResponseBody>> getLatest(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatusResponseInner object if successful.
     */
    public OperationStatusResponseInner cancel(String resourceGroupName, String vmScaleSetName) {
        return cancelWithServiceResponseAsync(resourceGroupName, vmScaleSetName).toBlocking().last().body();
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatusResponseInner> cancelAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<OperationStatusResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(cancelWithServiceResponseAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<OperationStatusResponseInner> cancelAsync(String resourceGroupName, String vmScaleSetName) {
        return cancelWithServiceResponseAsync(resourceGroupName, vmScaleSetName).map(new Func1<ServiceResponse<OperationStatusResponseInner>, OperationStatusResponseInner>() {
            @Override
            public OperationStatusResponseInner call(ServiceResponse<OperationStatusResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<OperationStatusResponseInner>> cancelWithServiceResponseAsync(String resourceGroupName, String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2017-12-01-alphadummy";
        Observable<Response<ResponseBody>> observable = service.cancel(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<OperationStatusResponseInner>() { }.getType());
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatusResponseInner object if successful.
     */
    public OperationStatusResponseInner beginCancel(String resourceGroupName, String vmScaleSetName) {
        return beginCancelWithServiceResponseAsync(resourceGroupName, vmScaleSetName).toBlocking().single().body();
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatusResponseInner> beginCancelAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<OperationStatusResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCancelWithServiceResponseAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatusResponseInner object
     */
    public Observable<OperationStatusResponseInner> beginCancelAsync(String resourceGroupName, String vmScaleSetName) {
        return beginCancelWithServiceResponseAsync(resourceGroupName, vmScaleSetName).map(new Func1<ServiceResponse<OperationStatusResponseInner>, OperationStatusResponseInner>() {
            @Override
            public OperationStatusResponseInner call(ServiceResponse<OperationStatusResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatusResponseInner object
     */
    public Observable<ServiceResponse<OperationStatusResponseInner>> beginCancelWithServiceResponseAsync(String resourceGroupName, String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2017-12-01-alphadummy";
        return service.beginCancel(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationStatusResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<OperationStatusResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationStatusResponseInner> clientResponse = beginCancelDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationStatusResponseInner> beginCancelDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationStatusResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationStatusResponseInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatusResponseInner object if successful.
     */
    public OperationStatusResponseInner startOSUpgrade(String resourceGroupName, String vmScaleSetName) {
        return startOSUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName).toBlocking().last().body();
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatusResponseInner> startOSUpgradeAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<OperationStatusResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(startOSUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<OperationStatusResponseInner> startOSUpgradeAsync(String resourceGroupName, String vmScaleSetName) {
        return startOSUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName).map(new Func1<ServiceResponse<OperationStatusResponseInner>, OperationStatusResponseInner>() {
            @Override
            public OperationStatusResponseInner call(ServiceResponse<OperationStatusResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<OperationStatusResponseInner>> startOSUpgradeWithServiceResponseAsync(String resourceGroupName, String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2017-12-01-alphadummy";
        Observable<Response<ResponseBody>> observable = service.startOSUpgrade(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<OperationStatusResponseInner>() { }.getType());
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatusResponseInner object if successful.
     */
    public OperationStatusResponseInner beginStartOSUpgrade(String resourceGroupName, String vmScaleSetName) {
        return beginStartOSUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName).toBlocking().single().body();
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatusResponseInner> beginStartOSUpgradeAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<OperationStatusResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginStartOSUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatusResponseInner object
     */
    public Observable<OperationStatusResponseInner> beginStartOSUpgradeAsync(String resourceGroupName, String vmScaleSetName) {
        return beginStartOSUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName).map(new Func1<ServiceResponse<OperationStatusResponseInner>, OperationStatusResponseInner>() {
            @Override
            public OperationStatusResponseInner call(ServiceResponse<OperationStatusResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatusResponseInner object
     */
    public Observable<ServiceResponse<OperationStatusResponseInner>> beginStartOSUpgradeWithServiceResponseAsync(String resourceGroupName, String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2017-12-01-alphadummy";
        return service.beginStartOSUpgrade(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationStatusResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<OperationStatusResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationStatusResponseInner> clientResponse = beginStartOSUpgradeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationStatusResponseInner> beginStartOSUpgradeDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationStatusResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationStatusResponseInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RollingUpgradeStatusInfoInner object if successful.
     */
    public RollingUpgradeStatusInfoInner getLatest(String resourceGroupName, String vmScaleSetName) {
        return getLatestWithServiceResponseAsync(resourceGroupName, vmScaleSetName).toBlocking().single().body();
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RollingUpgradeStatusInfoInner> getLatestAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<RollingUpgradeStatusInfoInner> serviceCallback) {
        return ServiceFuture.fromResponse(getLatestWithServiceResponseAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RollingUpgradeStatusInfoInner object
     */
    public Observable<RollingUpgradeStatusInfoInner> getLatestAsync(String resourceGroupName, String vmScaleSetName) {
        return getLatestWithServiceResponseAsync(resourceGroupName, vmScaleSetName).map(new Func1<ServiceResponse<RollingUpgradeStatusInfoInner>, RollingUpgradeStatusInfoInner>() {
            @Override
            public RollingUpgradeStatusInfoInner call(ServiceResponse<RollingUpgradeStatusInfoInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RollingUpgradeStatusInfoInner object
     */
    public Observable<ServiceResponse<RollingUpgradeStatusInfoInner>> getLatestWithServiceResponseAsync(String resourceGroupName, String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2017-12-01-alphadummy";
        return service.getLatest(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RollingUpgradeStatusInfoInner>>>() {
                @Override
                public Observable<ServiceResponse<RollingUpgradeStatusInfoInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RollingUpgradeStatusInfoInner> clientResponse = getLatestDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RollingUpgradeStatusInfoInner> getLatestDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RollingUpgradeStatusInfoInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RollingUpgradeStatusInfoInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
