/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.implementation;

import com.microsoft.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.microsoft.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.hanaonazure.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in HanaInstances.
 */
public class HanaInstancesInner implements InnerSupportsGet<HanaInstanceInner>, InnerSupportsListing<HanaInstanceInner> {
    /** The Retrofit service to perform REST calls. */
    private HanaInstancesService service;
    /** The service client containing this operation class. */
    private HanaManagementClientImpl client;

    /**
     * Initializes an instance of HanaInstancesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HanaInstancesInner(Retrofit retrofit, HanaManagementClientImpl client) {
        this.service = retrofit.create(HanaInstancesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for HanaInstances to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HanaInstancesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.hanaonazure.HanaInstances list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.HanaOnAzure/hanaInstances")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.hanaonazure.HanaInstances listByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HanaOnAzure/hanaInstances")
        Observable<Response<ResponseBody>> listByResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.hanaonazure.HanaInstances getByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HanaOnAzure/hanaInstances/{hanaInstanceName}")
        Observable<Response<ResponseBody>> getByResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("hanaInstanceName") String hanaInstanceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.hanaonazure.HanaInstances listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.hanaonazure.HanaInstances listByResourceGroupNext" })
        @GET
        Observable<Response<ResponseBody>> listByResourceGroupNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription.
     * Gets a list of SAP HANA instances in the specified subscription. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;HanaInstanceInner&gt; object if successful.
     */
    public PagedList<HanaInstanceInner> list() {
        ServiceResponse<Page<HanaInstanceInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<HanaInstanceInner>(response.body()) {
            @Override
            public Page<HanaInstanceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription.
     * Gets a list of SAP HANA instances in the specified subscription. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<HanaInstanceInner>> listAsync(final ListOperationCallback<HanaInstanceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<HanaInstanceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HanaInstanceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription.
     * Gets a list of SAP HANA instances in the specified subscription. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HanaInstanceInner&gt; object
     */
    public Observable<Page<HanaInstanceInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<HanaInstanceInner>>, Page<HanaInstanceInner>>() {
                @Override
                public Page<HanaInstanceInner> call(ServiceResponse<Page<HanaInstanceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription.
     * Gets a list of SAP HANA instances in the specified subscription. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HanaInstanceInner&gt; object
     */
    public Observable<ServiceResponse<Page<HanaInstanceInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<HanaInstanceInner>>, Observable<ServiceResponse<Page<HanaInstanceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HanaInstanceInner>>> call(ServiceResponse<Page<HanaInstanceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription.
     * Gets a list of SAP HANA instances in the specified subscription. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;HanaInstanceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<HanaInstanceInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<HanaInstanceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HanaInstanceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<HanaInstanceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<HanaInstanceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<HanaInstanceInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<HanaInstanceInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<HanaInstanceInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription and the resource group.
     * Gets a list of SAP HANA instances in the specified subscription and the resource group. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;HanaInstanceInner&gt; object if successful.
     */
    public PagedList<HanaInstanceInner> listByResourceGroup(final String resourceGroupName) {
        ServiceResponse<Page<HanaInstanceInner>> response = listByResourceGroupSinglePageAsync(resourceGroupName).toBlocking().single();
        return new PagedList<HanaInstanceInner>(response.body()) {
            @Override
            public Page<HanaInstanceInner> nextPage(String nextPageLink) {
                return listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription and the resource group.
     * Gets a list of SAP HANA instances in the specified subscription and the resource group. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<HanaInstanceInner>> listByResourceGroupAsync(final String resourceGroupName, final ListOperationCallback<HanaInstanceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByResourceGroupSinglePageAsync(resourceGroupName),
            new Func1<String, Observable<ServiceResponse<Page<HanaInstanceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HanaInstanceInner>>> call(String nextPageLink) {
                    return listByResourceGroupNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription and the resource group.
     * Gets a list of SAP HANA instances in the specified subscription and the resource group. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HanaInstanceInner&gt; object
     */
    public Observable<Page<HanaInstanceInner>> listByResourceGroupAsync(final String resourceGroupName) {
        return listByResourceGroupWithServiceResponseAsync(resourceGroupName)
            .map(new Func1<ServiceResponse<Page<HanaInstanceInner>>, Page<HanaInstanceInner>>() {
                @Override
                public Page<HanaInstanceInner> call(ServiceResponse<Page<HanaInstanceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription and the resource group.
     * Gets a list of SAP HANA instances in the specified subscription and the resource group. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HanaInstanceInner&gt; object
     */
    public Observable<ServiceResponse<Page<HanaInstanceInner>>> listByResourceGroupWithServiceResponseAsync(final String resourceGroupName) {
        return listByResourceGroupSinglePageAsync(resourceGroupName)
            .concatMap(new Func1<ServiceResponse<Page<HanaInstanceInner>>, Observable<ServiceResponse<Page<HanaInstanceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HanaInstanceInner>>> call(ServiceResponse<Page<HanaInstanceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByResourceGroupNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription and the resource group.
     * Gets a list of SAP HANA instances in the specified subscription and the resource group. The operations returns various properties of each SAP HANA on Azure instance.
     *
    ServiceResponse<PageImpl1<HanaInstanceInner>> * @param resourceGroupName Name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;HanaInstanceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<HanaInstanceInner>>> listByResourceGroupSinglePageAsync(final String resourceGroupName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByResourceGroup(this.client.subscriptionId(), resourceGroupName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<HanaInstanceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HanaInstanceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<HanaInstanceInner>> result = listByResourceGroupDelegate(response);
                        return Observable.just(new ServiceResponse<Page<HanaInstanceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<HanaInstanceInner>> listByResourceGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<HanaInstanceInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<HanaInstanceInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets properties of a SAP HANA instance.
     * Gets properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the HanaInstanceInner object if successful.
     */
    public HanaInstanceInner getByResourceGroup(String resourceGroupName, String hanaInstanceName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, hanaInstanceName).toBlocking().single().body();
    }

    /**
     * Gets properties of a SAP HANA instance.
     * Gets properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<HanaInstanceInner> getByResourceGroupAsync(String resourceGroupName, String hanaInstanceName, final ServiceCallback<HanaInstanceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByResourceGroupWithServiceResponseAsync(resourceGroupName, hanaInstanceName), serviceCallback);
    }

    /**
     * Gets properties of a SAP HANA instance.
     * Gets properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HanaInstanceInner object
     */
    public Observable<HanaInstanceInner> getByResourceGroupAsync(String resourceGroupName, String hanaInstanceName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, hanaInstanceName).map(new Func1<ServiceResponse<HanaInstanceInner>, HanaInstanceInner>() {
            @Override
            public HanaInstanceInner call(ServiceResponse<HanaInstanceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets properties of a SAP HANA instance.
     * Gets properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HanaInstanceInner object
     */
    public Observable<ServiceResponse<HanaInstanceInner>> getByResourceGroupWithServiceResponseAsync(String resourceGroupName, String hanaInstanceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (hanaInstanceName == null) {
            throw new IllegalArgumentException("Parameter hanaInstanceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getByResourceGroup(this.client.subscriptionId(), resourceGroupName, hanaInstanceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<HanaInstanceInner>>>() {
                @Override
                public Observable<ServiceResponse<HanaInstanceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<HanaInstanceInner> clientResponse = getByResourceGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<HanaInstanceInner> getByResourceGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<HanaInstanceInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<HanaInstanceInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription.
     * Gets a list of SAP HANA instances in the specified subscription. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;HanaInstanceInner&gt; object if successful.
     */
    public PagedList<HanaInstanceInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<HanaInstanceInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<HanaInstanceInner>(response.body()) {
            @Override
            public Page<HanaInstanceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription.
     * Gets a list of SAP HANA instances in the specified subscription. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<HanaInstanceInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<HanaInstanceInner>> serviceFuture, final ListOperationCallback<HanaInstanceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<HanaInstanceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HanaInstanceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription.
     * Gets a list of SAP HANA instances in the specified subscription. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HanaInstanceInner&gt; object
     */
    public Observable<Page<HanaInstanceInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<HanaInstanceInner>>, Page<HanaInstanceInner>>() {
                @Override
                public Page<HanaInstanceInner> call(ServiceResponse<Page<HanaInstanceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription.
     * Gets a list of SAP HANA instances in the specified subscription. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HanaInstanceInner&gt; object
     */
    public Observable<ServiceResponse<Page<HanaInstanceInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<HanaInstanceInner>>, Observable<ServiceResponse<Page<HanaInstanceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HanaInstanceInner>>> call(ServiceResponse<Page<HanaInstanceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription.
     * Gets a list of SAP HANA instances in the specified subscription. The operations returns various properties of each SAP HANA on Azure instance.
     *
    ServiceResponse<PageImpl1<HanaInstanceInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;HanaInstanceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<HanaInstanceInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<HanaInstanceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HanaInstanceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<HanaInstanceInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<HanaInstanceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<HanaInstanceInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<HanaInstanceInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<HanaInstanceInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription and the resource group.
     * Gets a list of SAP HANA instances in the specified subscription and the resource group. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;HanaInstanceInner&gt; object if successful.
     */
    public PagedList<HanaInstanceInner> listByResourceGroupNext(final String nextPageLink) {
        ServiceResponse<Page<HanaInstanceInner>> response = listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<HanaInstanceInner>(response.body()) {
            @Override
            public Page<HanaInstanceInner> nextPage(String nextPageLink) {
                return listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription and the resource group.
     * Gets a list of SAP HANA instances in the specified subscription and the resource group. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<HanaInstanceInner>> listByResourceGroupNextAsync(final String nextPageLink, final ServiceFuture<List<HanaInstanceInner>> serviceFuture, final ListOperationCallback<HanaInstanceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByResourceGroupNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<HanaInstanceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HanaInstanceInner>>> call(String nextPageLink) {
                    return listByResourceGroupNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription and the resource group.
     * Gets a list of SAP HANA instances in the specified subscription and the resource group. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HanaInstanceInner&gt; object
     */
    public Observable<Page<HanaInstanceInner>> listByResourceGroupNextAsync(final String nextPageLink) {
        return listByResourceGroupNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<HanaInstanceInner>>, Page<HanaInstanceInner>>() {
                @Override
                public Page<HanaInstanceInner> call(ServiceResponse<Page<HanaInstanceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription and the resource group.
     * Gets a list of SAP HANA instances in the specified subscription and the resource group. The operations returns various properties of each SAP HANA on Azure instance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HanaInstanceInner&gt; object
     */
    public Observable<ServiceResponse<Page<HanaInstanceInner>>> listByResourceGroupNextWithServiceResponseAsync(final String nextPageLink) {
        return listByResourceGroupNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<HanaInstanceInner>>, Observable<ServiceResponse<Page<HanaInstanceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HanaInstanceInner>>> call(ServiceResponse<Page<HanaInstanceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByResourceGroupNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of SAP HANA instances in the specified subscription and the resource group.
     * Gets a list of SAP HANA instances in the specified subscription and the resource group. The operations returns various properties of each SAP HANA on Azure instance.
     *
    ServiceResponse<PageImpl1<HanaInstanceInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;HanaInstanceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<HanaInstanceInner>>> listByResourceGroupNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByResourceGroupNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<HanaInstanceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HanaInstanceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<HanaInstanceInner>> result = listByResourceGroupNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<HanaInstanceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<HanaInstanceInner>> listByResourceGroupNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<HanaInstanceInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<HanaInstanceInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
