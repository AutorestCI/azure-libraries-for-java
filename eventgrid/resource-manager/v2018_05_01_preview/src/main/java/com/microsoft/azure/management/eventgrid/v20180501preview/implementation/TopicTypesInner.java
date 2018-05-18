/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_05_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
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
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in TopicTypes.
 */
public class TopicTypesInner {
    /** The Retrofit service to perform REST calls. */
    private TopicTypesService service;
    /** The service client containing this operation class. */
    private EventGridManagementClientImpl client;

    /**
     * Initializes an instance of TopicTypesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public TopicTypesInner(Retrofit retrofit, EventGridManagementClientImpl client) {
        this.service = retrofit.create(TopicTypesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for TopicTypes to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TopicTypesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.eventgrid.v20180501preview.TopicTypes list" })
        @GET("providers/Microsoft.EventGrid/topicTypes")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.eventgrid.v20180501preview.TopicTypes get" })
        @GET("providers/Microsoft.EventGrid/topicTypes/{topicTypeName}")
        Observable<Response<ResponseBody>> get(@Path("topicTypeName") String topicTypeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.eventgrid.v20180501preview.TopicTypes listEventTypes" })
        @GET("providers/Microsoft.EventGrid/topicTypes/{topicTypeName}/eventTypes")
        Observable<Response<ResponseBody>> listEventTypes(@Path("topicTypeName") String topicTypeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List topic types.
     * List all registered topic types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;TopicTypeInfoInner&gt; object if successful.
     */
    public List<TopicTypeInfoInner> list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * List topic types.
     * List all registered topic types.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<TopicTypeInfoInner>> listAsync(final ServiceCallback<List<TopicTypeInfoInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List topic types.
     * List all registered topic types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;TopicTypeInfoInner&gt; object
     */
    public Observable<List<TopicTypeInfoInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<TopicTypeInfoInner>>, List<TopicTypeInfoInner>>() {
            @Override
            public List<TopicTypeInfoInner> call(ServiceResponse<List<TopicTypeInfoInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * List topic types.
     * List all registered topic types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;TopicTypeInfoInner&gt; object
     */
    public Observable<ServiceResponse<List<TopicTypeInfoInner>>> listWithServiceResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<TopicTypeInfoInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<TopicTypeInfoInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<TopicTypeInfoInner>> result = listDelegate(response);
                        List<TopicTypeInfoInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<TopicTypeInfoInner>> clientResponse = new ServiceResponse<List<TopicTypeInfoInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<TopicTypeInfoInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<TopicTypeInfoInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<TopicTypeInfoInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get a topic type.
     * Get information about a topic type.
     *
     * @param topicTypeName Name of the topic type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TopicTypeInfoInner object if successful.
     */
    public TopicTypeInfoInner get(String topicTypeName) {
        return getWithServiceResponseAsync(topicTypeName).toBlocking().single().body();
    }

    /**
     * Get a topic type.
     * Get information about a topic type.
     *
     * @param topicTypeName Name of the topic type
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TopicTypeInfoInner> getAsync(String topicTypeName, final ServiceCallback<TopicTypeInfoInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(topicTypeName), serviceCallback);
    }

    /**
     * Get a topic type.
     * Get information about a topic type.
     *
     * @param topicTypeName Name of the topic type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TopicTypeInfoInner object
     */
    public Observable<TopicTypeInfoInner> getAsync(String topicTypeName) {
        return getWithServiceResponseAsync(topicTypeName).map(new Func1<ServiceResponse<TopicTypeInfoInner>, TopicTypeInfoInner>() {
            @Override
            public TopicTypeInfoInner call(ServiceResponse<TopicTypeInfoInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a topic type.
     * Get information about a topic type.
     *
     * @param topicTypeName Name of the topic type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TopicTypeInfoInner object
     */
    public Observable<ServiceResponse<TopicTypeInfoInner>> getWithServiceResponseAsync(String topicTypeName) {
        if (topicTypeName == null) {
            throw new IllegalArgumentException("Parameter topicTypeName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(topicTypeName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TopicTypeInfoInner>>>() {
                @Override
                public Observable<ServiceResponse<TopicTypeInfoInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TopicTypeInfoInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TopicTypeInfoInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TopicTypeInfoInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TopicTypeInfoInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List event types.
     * List event types for a topic type.
     *
     * @param topicTypeName Name of the topic type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;EventTypeInner&gt; object if successful.
     */
    public List<EventTypeInner> listEventTypes(String topicTypeName) {
        return listEventTypesWithServiceResponseAsync(topicTypeName).toBlocking().single().body();
    }

    /**
     * List event types.
     * List event types for a topic type.
     *
     * @param topicTypeName Name of the topic type
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<EventTypeInner>> listEventTypesAsync(String topicTypeName, final ServiceCallback<List<EventTypeInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listEventTypesWithServiceResponseAsync(topicTypeName), serviceCallback);
    }

    /**
     * List event types.
     * List event types for a topic type.
     *
     * @param topicTypeName Name of the topic type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;EventTypeInner&gt; object
     */
    public Observable<List<EventTypeInner>> listEventTypesAsync(String topicTypeName) {
        return listEventTypesWithServiceResponseAsync(topicTypeName).map(new Func1<ServiceResponse<List<EventTypeInner>>, List<EventTypeInner>>() {
            @Override
            public List<EventTypeInner> call(ServiceResponse<List<EventTypeInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * List event types.
     * List event types for a topic type.
     *
     * @param topicTypeName Name of the topic type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;EventTypeInner&gt; object
     */
    public Observable<ServiceResponse<List<EventTypeInner>>> listEventTypesWithServiceResponseAsync(String topicTypeName) {
        if (topicTypeName == null) {
            throw new IllegalArgumentException("Parameter topicTypeName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listEventTypes(topicTypeName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<EventTypeInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<EventTypeInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<EventTypeInner>> result = listEventTypesDelegate(response);
                        List<EventTypeInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<EventTypeInner>> clientResponse = new ServiceResponse<List<EventTypeInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<EventTypeInner>> listEventTypesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<EventTypeInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<EventTypeInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
