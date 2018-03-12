/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.billing.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
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
 * in EnrollmentAccounts.
 */
public class EnrollmentAccountsInner {
    /** The Retrofit service to perform REST calls. */
    private EnrollmentAccountsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of EnrollmentAccountsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public EnrollmentAccountsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(EnrollmentAccountsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for EnrollmentAccounts to be
     * used by Retrofit to perform actually REST calls.
     */
    interface EnrollmentAccountsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.EnrollmentAccounts list" })
        @GET("providers/Microsoft.Billing/enrollmentAccounts")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.EnrollmentAccounts get" })
        @GET("providers/Microsoft.Billing/enrollmentAccounts/{name}")
        Observable<Response<ResponseBody>> get(@Path("name") String name, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the enrollment accounts the caller has access to.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EnrollmentAccountListResultInner object if successful.
     */
    public EnrollmentAccountListResultInner list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Lists the enrollment accounts the caller has access to.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EnrollmentAccountListResultInner> listAsync(final ServiceCallback<EnrollmentAccountListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Lists the enrollment accounts the caller has access to.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EnrollmentAccountListResultInner object
     */
    public Observable<EnrollmentAccountListResultInner> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<EnrollmentAccountListResultInner>, EnrollmentAccountListResultInner>() {
            @Override
            public EnrollmentAccountListResultInner call(ServiceResponse<EnrollmentAccountListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the enrollment accounts the caller has access to.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EnrollmentAccountListResultInner object
     */
    public Observable<ServiceResponse<EnrollmentAccountListResultInner>> listWithServiceResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EnrollmentAccountListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<EnrollmentAccountListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EnrollmentAccountListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EnrollmentAccountListResultInner> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<EnrollmentAccountListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EnrollmentAccountListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a enrollment account by name.
     *
     * @param name Enrollment Account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EnrollmentAccountResultInner object if successful.
     */
    public EnrollmentAccountResultInner get(String name) {
        return getWithServiceResponseAsync(name).toBlocking().single().body();
    }

    /**
     * Gets a enrollment account by name.
     *
     * @param name Enrollment Account name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EnrollmentAccountResultInner> getAsync(String name, final ServiceCallback<EnrollmentAccountResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(name), serviceCallback);
    }

    /**
     * Gets a enrollment account by name.
     *
     * @param name Enrollment Account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EnrollmentAccountResultInner object
     */
    public Observable<EnrollmentAccountResultInner> getAsync(String name) {
        return getWithServiceResponseAsync(name).map(new Func1<ServiceResponse<EnrollmentAccountResultInner>, EnrollmentAccountResultInner>() {
            @Override
            public EnrollmentAccountResultInner call(ServiceResponse<EnrollmentAccountResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a enrollment account by name.
     *
     * @param name Enrollment Account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EnrollmentAccountResultInner object
     */
    public Observable<ServiceResponse<EnrollmentAccountResultInner>> getWithServiceResponseAsync(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(name, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EnrollmentAccountResultInner>>>() {
                @Override
                public Observable<ServiceResponse<EnrollmentAccountResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EnrollmentAccountResultInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EnrollmentAccountResultInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<EnrollmentAccountResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EnrollmentAccountResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}