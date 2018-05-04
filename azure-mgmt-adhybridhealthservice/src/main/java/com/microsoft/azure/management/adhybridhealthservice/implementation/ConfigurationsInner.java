/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Configurations.
 */
public class ConfigurationsInner {
    /** The Retrofit service to perform REST calls. */
    private ConfigurationsService service;
    /** The service client containing this operation class. */
    private ADHybridHealthServiceImpl client;

    /**
     * Initializes an instance of ConfigurationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ConfigurationsInner(Retrofit retrofit, ADHybridHealthServiceImpl client) {
        this.service = retrofit.create(ConfigurationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Configurations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ConfigurationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.adhybridhealthservice.Configurations listAddsConfigurations" })
        @GET("providers/Microsoft.ADHybridHealthService/addsservices/{serviceName}/configuration")
        Observable<Response<ResponseBody>> listAddsConfigurations(@Path("serviceName") String serviceName, @Query("grouping") String grouping, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.adhybridhealthservice.Configurations add" })
        @POST("providers/Microsoft.ADHybridHealthService/configuration")
        Observable<Response<ResponseBody>> add(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.adhybridhealthservice.Configurations get" })
        @GET("providers/Microsoft.ADHybridHealthService/configuration")
        Observable<Response<ResponseBody>> get(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.adhybridhealthservice.Configurations update" })
        @PATCH("providers/Microsoft.ADHybridHealthService/configuration")
        Observable<Response<ResponseBody>> update(@Body TenantInner tenant, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.adhybridhealthservice.Configurations listAddsConfigurationsNext" })
        @GET
        Observable<Response<ResponseBody>> listAddsConfigurationsNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the service configurations.
     *
     * @param serviceName The name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ItemInner&gt; object if successful.
     */
    public PagedList<ItemInner> listAddsConfigurations(final String serviceName) {
        ServiceResponse<Page<ItemInner>> response = listAddsConfigurationsSinglePageAsync(serviceName).toBlocking().single();
        return new PagedList<ItemInner>(response.body()) {
            @Override
            public Page<ItemInner> nextPage(String nextPageLink) {
                return listAddsConfigurationsNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the service configurations.
     *
     * @param serviceName The name of the service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ItemInner>> listAddsConfigurationsAsync(final String serviceName, final ListOperationCallback<ItemInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listAddsConfigurationsSinglePageAsync(serviceName),
            new Func1<String, Observable<ServiceResponse<Page<ItemInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ItemInner>>> call(String nextPageLink) {
                    return listAddsConfigurationsNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the service configurations.
     *
     * @param serviceName The name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ItemInner&gt; object
     */
    public Observable<Page<ItemInner>> listAddsConfigurationsAsync(final String serviceName) {
        return listAddsConfigurationsWithServiceResponseAsync(serviceName)
            .map(new Func1<ServiceResponse<Page<ItemInner>>, Page<ItemInner>>() {
                @Override
                public Page<ItemInner> call(ServiceResponse<Page<ItemInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the service configurations.
     *
     * @param serviceName The name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ItemInner&gt; object
     */
    public Observable<ServiceResponse<Page<ItemInner>>> listAddsConfigurationsWithServiceResponseAsync(final String serviceName) {
        return listAddsConfigurationsSinglePageAsync(serviceName)
            .concatMap(new Func1<ServiceResponse<Page<ItemInner>>, Observable<ServiceResponse<Page<ItemInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ItemInner>>> call(ServiceResponse<Page<ItemInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listAddsConfigurationsNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the service configurations.
     *
     * @param serviceName The name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ItemInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ItemInner>>> listAddsConfigurationsSinglePageAsync(final String serviceName) {
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        final String grouping = null;
        return service.listAddsConfigurations(serviceName, grouping, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ItemInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ItemInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ItemInner>> result = listAddsConfigurationsDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ItemInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets the service configurations.
     *
     * @param serviceName The name of the service.
     * @param grouping The grouping for configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ItemInner&gt; object if successful.
     */
    public PagedList<ItemInner> listAddsConfigurations(final String serviceName, final String grouping) {
        ServiceResponse<Page<ItemInner>> response = listAddsConfigurationsSinglePageAsync(serviceName, grouping).toBlocking().single();
        return new PagedList<ItemInner>(response.body()) {
            @Override
            public Page<ItemInner> nextPage(String nextPageLink) {
                return listAddsConfigurationsNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the service configurations.
     *
     * @param serviceName The name of the service.
     * @param grouping The grouping for configurations.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ItemInner>> listAddsConfigurationsAsync(final String serviceName, final String grouping, final ListOperationCallback<ItemInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listAddsConfigurationsSinglePageAsync(serviceName, grouping),
            new Func1<String, Observable<ServiceResponse<Page<ItemInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ItemInner>>> call(String nextPageLink) {
                    return listAddsConfigurationsNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the service configurations.
     *
     * @param serviceName The name of the service.
     * @param grouping The grouping for configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ItemInner&gt; object
     */
    public Observable<Page<ItemInner>> listAddsConfigurationsAsync(final String serviceName, final String grouping) {
        return listAddsConfigurationsWithServiceResponseAsync(serviceName, grouping)
            .map(new Func1<ServiceResponse<Page<ItemInner>>, Page<ItemInner>>() {
                @Override
                public Page<ItemInner> call(ServiceResponse<Page<ItemInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the service configurations.
     *
     * @param serviceName The name of the service.
     * @param grouping The grouping for configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ItemInner&gt; object
     */
    public Observable<ServiceResponse<Page<ItemInner>>> listAddsConfigurationsWithServiceResponseAsync(final String serviceName, final String grouping) {
        return listAddsConfigurationsSinglePageAsync(serviceName, grouping)
            .concatMap(new Func1<ServiceResponse<Page<ItemInner>>, Observable<ServiceResponse<Page<ItemInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ItemInner>>> call(ServiceResponse<Page<ItemInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listAddsConfigurationsNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the service configurations.
     *
    ServiceResponse<PageImpl<ItemInner>> * @param serviceName The name of the service.
    ServiceResponse<PageImpl<ItemInner>> * @param grouping The grouping for configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ItemInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ItemInner>>> listAddsConfigurationsSinglePageAsync(final String serviceName, final String grouping) {
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        return service.listAddsConfigurations(serviceName, grouping, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ItemInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ItemInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ItemInner>> result = listAddsConfigurationsDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ItemInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ItemInner>> listAddsConfigurationsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ItemInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ItemInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Onboards a tenant in Azure Active Directory Connect Health.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TenantInner object if successful.
     */
    public TenantInner add() {
        return addWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Onboards a tenant in Azure Active Directory Connect Health.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TenantInner> addAsync(final ServiceCallback<TenantInner> serviceCallback) {
        return ServiceFuture.fromResponse(addWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Onboards a tenant in Azure Active Directory Connect Health.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TenantInner object
     */
    public Observable<TenantInner> addAsync() {
        return addWithServiceResponseAsync().map(new Func1<ServiceResponse<TenantInner>, TenantInner>() {
            @Override
            public TenantInner call(ServiceResponse<TenantInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Onboards a tenant in Azure Active Directory Connect Health.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TenantInner object
     */
    public Observable<ServiceResponse<TenantInner>> addWithServiceResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.add(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TenantInner>>>() {
                @Override
                public Observable<ServiceResponse<TenantInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TenantInner> clientResponse = addDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TenantInner> addDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TenantInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TenantInner>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the details of a tenant onboarded to Azure Active Directory Connect Health.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TenantInner object if successful.
     */
    public TenantInner get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the details of a tenant onboarded to Azure Active Directory Connect Health.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TenantInner> getAsync(final ServiceCallback<TenantInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the details of a tenant onboarded to Azure Active Directory Connect Health.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TenantInner object
     */
    public Observable<TenantInner> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<TenantInner>, TenantInner>() {
            @Override
            public TenantInner call(ServiceResponse<TenantInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the details of a tenant onboarded to Azure Active Directory Connect Health.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TenantInner object
     */
    public Observable<ServiceResponse<TenantInner>> getWithServiceResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TenantInner>>>() {
                @Override
                public Observable<ServiceResponse<TenantInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TenantInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TenantInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TenantInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TenantInner>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates tenant properties for tenants onboarded to Azure Active Directory Connect Health.
     *
     * @param tenant The tenant object with the properties set to the updated value.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TenantInner object if successful.
     */
    public TenantInner update(TenantInner tenant) {
        return updateWithServiceResponseAsync(tenant).toBlocking().single().body();
    }

    /**
     * Updates tenant properties for tenants onboarded to Azure Active Directory Connect Health.
     *
     * @param tenant The tenant object with the properties set to the updated value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TenantInner> updateAsync(TenantInner tenant, final ServiceCallback<TenantInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(tenant), serviceCallback);
    }

    /**
     * Updates tenant properties for tenants onboarded to Azure Active Directory Connect Health.
     *
     * @param tenant The tenant object with the properties set to the updated value.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TenantInner object
     */
    public Observable<TenantInner> updateAsync(TenantInner tenant) {
        return updateWithServiceResponseAsync(tenant).map(new Func1<ServiceResponse<TenantInner>, TenantInner>() {
            @Override
            public TenantInner call(ServiceResponse<TenantInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates tenant properties for tenants onboarded to Azure Active Directory Connect Health.
     *
     * @param tenant The tenant object with the properties set to the updated value.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TenantInner object
     */
    public Observable<ServiceResponse<TenantInner>> updateWithServiceResponseAsync(TenantInner tenant) {
        if (tenant == null) {
            throw new IllegalArgumentException("Parameter tenant is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(tenant);
        return service.update(tenant, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TenantInner>>>() {
                @Override
                public Observable<ServiceResponse<TenantInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TenantInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TenantInner> updateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TenantInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TenantInner>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the service configurations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ItemInner&gt; object if successful.
     */
    public PagedList<ItemInner> listAddsConfigurationsNext(final String nextPageLink) {
        ServiceResponse<Page<ItemInner>> response = listAddsConfigurationsNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ItemInner>(response.body()) {
            @Override
            public Page<ItemInner> nextPage(String nextPageLink) {
                return listAddsConfigurationsNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the service configurations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ItemInner>> listAddsConfigurationsNextAsync(final String nextPageLink, final ServiceFuture<List<ItemInner>> serviceFuture, final ListOperationCallback<ItemInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listAddsConfigurationsNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ItemInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ItemInner>>> call(String nextPageLink) {
                    return listAddsConfigurationsNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the service configurations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ItemInner&gt; object
     */
    public Observable<Page<ItemInner>> listAddsConfigurationsNextAsync(final String nextPageLink) {
        return listAddsConfigurationsNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ItemInner>>, Page<ItemInner>>() {
                @Override
                public Page<ItemInner> call(ServiceResponse<Page<ItemInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the service configurations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ItemInner&gt; object
     */
    public Observable<ServiceResponse<Page<ItemInner>>> listAddsConfigurationsNextWithServiceResponseAsync(final String nextPageLink) {
        return listAddsConfigurationsNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ItemInner>>, Observable<ServiceResponse<Page<ItemInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ItemInner>>> call(ServiceResponse<Page<ItemInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listAddsConfigurationsNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the service configurations.
     *
    ServiceResponse<PageImpl<ItemInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ItemInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ItemInner>>> listAddsConfigurationsNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listAddsConfigurationsNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ItemInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ItemInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ItemInner>> result = listAddsConfigurationsNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ItemInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ItemInner>> listAddsConfigurationsNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ItemInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ItemInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
