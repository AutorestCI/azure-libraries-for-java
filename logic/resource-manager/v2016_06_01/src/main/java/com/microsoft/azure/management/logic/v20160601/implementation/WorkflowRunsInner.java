/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

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
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in WorkflowRuns.
 */
public class WorkflowRunsInner {
    /** The Retrofit service to perform REST calls. */
    private WorkflowRunsService service;
    /** The service client containing this operation class. */
    private LogicManagementClientImpl client;

    /**
     * Initializes an instance of WorkflowRunsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public WorkflowRunsInner(Retrofit retrofit, LogicManagementClientImpl client) {
        this.service = retrofit.create(WorkflowRunsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for WorkflowRuns to be
     * used by Retrofit to perform actually REST calls.
     */
    interface WorkflowRunsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v20160601.WorkflowRuns list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName}/runs")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workflowName") String workflowName, @Query("api-version") String apiVersion, @Query("$top") Integer top, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v20160601.WorkflowRuns get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName}/runs/{runName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workflowName") String workflowName, @Path("runName") String runName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v20160601.WorkflowRuns cancel" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName}/runs/{runName}/cancel")
        Observable<Response<ResponseBody>> cancel(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workflowName") String workflowName, @Path("runName") String runName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v20160601.WorkflowRuns listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of workflow runs.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;WorkflowRunInner&gt; object if successful.
     */
    public PagedList<WorkflowRunInner> list(final String resourceGroupName, final String workflowName) {
        ServiceResponse<Page<WorkflowRunInner>> response = listSinglePageAsync(resourceGroupName, workflowName).toBlocking().single();
        return new PagedList<WorkflowRunInner>(response.body()) {
            @Override
            public Page<WorkflowRunInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of workflow runs.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkflowRunInner>> listAsync(final String resourceGroupName, final String workflowName, final ListOperationCallback<WorkflowRunInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, workflowName),
            new Func1<String, Observable<ServiceResponse<Page<WorkflowRunInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowRunInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of workflow runs.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkflowRunInner&gt; object
     */
    public Observable<Page<WorkflowRunInner>> listAsync(final String resourceGroupName, final String workflowName) {
        return listWithServiceResponseAsync(resourceGroupName, workflowName)
            .map(new Func1<ServiceResponse<Page<WorkflowRunInner>>, Page<WorkflowRunInner>>() {
                @Override
                public Page<WorkflowRunInner> call(ServiceResponse<Page<WorkflowRunInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of workflow runs.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkflowRunInner&gt; object
     */
    public Observable<ServiceResponse<Page<WorkflowRunInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String workflowName) {
        return listSinglePageAsync(resourceGroupName, workflowName)
            .concatMap(new Func1<ServiceResponse<Page<WorkflowRunInner>>, Observable<ServiceResponse<Page<WorkflowRunInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowRunInner>>> call(ServiceResponse<Page<WorkflowRunInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of workflow runs.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;WorkflowRunInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<WorkflowRunInner>>> listSinglePageAsync(final String resourceGroupName, final String workflowName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workflowName == null) {
            throw new IllegalArgumentException("Parameter workflowName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final Integer top = null;
        final String filter = null;
        return service.list(this.client.subscriptionId(), resourceGroupName, workflowName, this.client.apiVersion(), top, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<WorkflowRunInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowRunInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<WorkflowRunInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<WorkflowRunInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets a list of workflow runs.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;WorkflowRunInner&gt; object if successful.
     */
    public PagedList<WorkflowRunInner> list(final String resourceGroupName, final String workflowName, final Integer top, final String filter) {
        ServiceResponse<Page<WorkflowRunInner>> response = listSinglePageAsync(resourceGroupName, workflowName, top, filter).toBlocking().single();
        return new PagedList<WorkflowRunInner>(response.body()) {
            @Override
            public Page<WorkflowRunInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of workflow runs.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkflowRunInner>> listAsync(final String resourceGroupName, final String workflowName, final Integer top, final String filter, final ListOperationCallback<WorkflowRunInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, workflowName, top, filter),
            new Func1<String, Observable<ServiceResponse<Page<WorkflowRunInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowRunInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of workflow runs.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkflowRunInner&gt; object
     */
    public Observable<Page<WorkflowRunInner>> listAsync(final String resourceGroupName, final String workflowName, final Integer top, final String filter) {
        return listWithServiceResponseAsync(resourceGroupName, workflowName, top, filter)
            .map(new Func1<ServiceResponse<Page<WorkflowRunInner>>, Page<WorkflowRunInner>>() {
                @Override
                public Page<WorkflowRunInner> call(ServiceResponse<Page<WorkflowRunInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of workflow runs.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkflowRunInner&gt; object
     */
    public Observable<ServiceResponse<Page<WorkflowRunInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String workflowName, final Integer top, final String filter) {
        return listSinglePageAsync(resourceGroupName, workflowName, top, filter)
            .concatMap(new Func1<ServiceResponse<Page<WorkflowRunInner>>, Observable<ServiceResponse<Page<WorkflowRunInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowRunInner>>> call(ServiceResponse<Page<WorkflowRunInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of workflow runs.
     *
    ServiceResponse<PageImpl<WorkflowRunInner>> * @param resourceGroupName The resource group name.
    ServiceResponse<PageImpl<WorkflowRunInner>> * @param workflowName The workflow name.
    ServiceResponse<PageImpl<WorkflowRunInner>> * @param top The number of items to be included in the result.
    ServiceResponse<PageImpl<WorkflowRunInner>> * @param filter The filter to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;WorkflowRunInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<WorkflowRunInner>>> listSinglePageAsync(final String resourceGroupName, final String workflowName, final Integer top, final String filter) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workflowName == null) {
            throw new IllegalArgumentException("Parameter workflowName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, workflowName, this.client.apiVersion(), top, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<WorkflowRunInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowRunInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<WorkflowRunInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<WorkflowRunInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<WorkflowRunInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<WorkflowRunInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<WorkflowRunInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WorkflowRunInner object if successful.
     */
    public WorkflowRunInner get(String resourceGroupName, String workflowName, String runName) {
        return getWithServiceResponseAsync(resourceGroupName, workflowName, runName).toBlocking().single().body();
    }

    /**
     * Gets a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WorkflowRunInner> getAsync(String resourceGroupName, String workflowName, String runName, final ServiceCallback<WorkflowRunInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workflowName, runName), serviceCallback);
    }

    /**
     * Gets a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkflowRunInner object
     */
    public Observable<WorkflowRunInner> getAsync(String resourceGroupName, String workflowName, String runName) {
        return getWithServiceResponseAsync(resourceGroupName, workflowName, runName).map(new Func1<ServiceResponse<WorkflowRunInner>, WorkflowRunInner>() {
            @Override
            public WorkflowRunInner call(ServiceResponse<WorkflowRunInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkflowRunInner object
     */
    public Observable<ServiceResponse<WorkflowRunInner>> getWithServiceResponseAsync(String resourceGroupName, String workflowName, String runName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workflowName == null) {
            throw new IllegalArgumentException("Parameter workflowName is required and cannot be null.");
        }
        if (runName == null) {
            throw new IllegalArgumentException("Parameter runName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, workflowName, runName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WorkflowRunInner>>>() {
                @Override
                public Observable<ServiceResponse<WorkflowRunInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WorkflowRunInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WorkflowRunInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WorkflowRunInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WorkflowRunInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Cancels a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void cancel(String resourceGroupName, String workflowName, String runName) {
        cancelWithServiceResponseAsync(resourceGroupName, workflowName, runName).toBlocking().single().body();
    }

    /**
     * Cancels a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> cancelAsync(String resourceGroupName, String workflowName, String runName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(cancelWithServiceResponseAsync(resourceGroupName, workflowName, runName), serviceCallback);
    }

    /**
     * Cancels a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> cancelAsync(String resourceGroupName, String workflowName, String runName) {
        return cancelWithServiceResponseAsync(resourceGroupName, workflowName, runName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Cancels a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> cancelWithServiceResponseAsync(String resourceGroupName, String workflowName, String runName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workflowName == null) {
            throw new IllegalArgumentException("Parameter workflowName is required and cannot be null.");
        }
        if (runName == null) {
            throw new IllegalArgumentException("Parameter runName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.cancel(this.client.subscriptionId(), resourceGroupName, workflowName, runName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = cancelDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> cancelDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of workflow runs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;WorkflowRunInner&gt; object if successful.
     */
    public PagedList<WorkflowRunInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<WorkflowRunInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<WorkflowRunInner>(response.body()) {
            @Override
            public Page<WorkflowRunInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of workflow runs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkflowRunInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<WorkflowRunInner>> serviceFuture, final ListOperationCallback<WorkflowRunInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<WorkflowRunInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowRunInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of workflow runs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkflowRunInner&gt; object
     */
    public Observable<Page<WorkflowRunInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<WorkflowRunInner>>, Page<WorkflowRunInner>>() {
                @Override
                public Page<WorkflowRunInner> call(ServiceResponse<Page<WorkflowRunInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of workflow runs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkflowRunInner&gt; object
     */
    public Observable<ServiceResponse<Page<WorkflowRunInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<WorkflowRunInner>>, Observable<ServiceResponse<Page<WorkflowRunInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowRunInner>>> call(ServiceResponse<Page<WorkflowRunInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of workflow runs.
     *
    ServiceResponse<PageImpl<WorkflowRunInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;WorkflowRunInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<WorkflowRunInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<WorkflowRunInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowRunInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<WorkflowRunInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<WorkflowRunInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<WorkflowRunInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<WorkflowRunInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<WorkflowRunInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
