/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.storagesync.ErrorException;
import com.microsoft.azure.management.storagesync.StorageSyncServiceGetListBySubscriptionHeaders;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponseWithHeaders;
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
 * in StorageSyncServiceGets.
 */
public class StorageSyncServiceGetsInner {
    /** The Retrofit service to perform REST calls. */
    private StorageSyncServiceGetsService service;
    /** The service client containing this operation class. */
    private MicrosoftStorageSyncImpl client;

    /**
     * Initializes an instance of StorageSyncServiceGetsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public StorageSyncServiceGetsInner(Retrofit retrofit, MicrosoftStorageSyncImpl client) {
        this.service = retrofit.create(StorageSyncServiceGetsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageSyncServiceGets to be
     * used by Retrofit to perform actually REST calls.
     */
    interface StorageSyncServiceGetsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storagesync.StorageSyncServiceGets list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.StorageSync/storageSyncServices")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get a StorageSyncService list by subscription.
     *
     * @return the PagedList<StorageSyncServiceInner> object if successful.
     */
    public PagedList<StorageSyncServiceInner> list() {
        PageImpl1<StorageSyncServiceInner> page = new PageImpl1<>();
        page.setItems(listWithServiceResponseAsync().toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<StorageSyncServiceInner>(page) {
            @Override
            public Page<StorageSyncServiceInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Get a StorageSyncService list by subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<StorageSyncServiceInner>> listAsync(final ServiceCallback<List<StorageSyncServiceInner>> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get a StorageSyncService list by subscription.
     *
     * @return the observable to the List&lt;StorageSyncServiceInner&gt; object
     */
    public Observable<Page<StorageSyncServiceInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponseWithHeaders<List<StorageSyncServiceInner>, StorageSyncServiceGetListBySubscriptionHeaders>, Page<StorageSyncServiceInner>>() {
            @Override
            public Page<StorageSyncServiceInner> call(ServiceResponseWithHeaders<List<StorageSyncServiceInner>, StorageSyncServiceGetListBySubscriptionHeaders> response) {
                PageImpl1<StorageSyncServiceInner> page = new PageImpl1<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Get a StorageSyncService list by subscription.
     *
     * @return the observable to the List&lt;StorageSyncServiceInner&gt; object
     */
    public Observable<ServiceResponseWithHeaders<List<StorageSyncServiceInner>, StorageSyncServiceGetListBySubscriptionHeaders>> listWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<List<StorageSyncServiceInner>, StorageSyncServiceGetListBySubscriptionHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<List<StorageSyncServiceInner>, StorageSyncServiceGetListBySubscriptionHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<StorageSyncServiceInner>> result = listDelegate(response);
                        List<StorageSyncServiceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<StorageSyncServiceInner>> clientResponse = new ServiceResponse<List<StorageSyncServiceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<PageImpl1<StorageSyncServiceInner>, StorageSyncServiceGetListBySubscriptionHeaders> listDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<StorageSyncServiceInner>, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<StorageSyncServiceInner>>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, StorageSyncServiceGetListBySubscriptionHeaders.class);
    }

}
