/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.implementation;

import com.microsoft.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.monitor.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DiagnosticSettings.
 */
public class DiagnosticSettingsInner implements InnerSupportsDelete<Void> {
    /** The Retrofit service to perform REST calls. */
    private DiagnosticSettingsService service;
    /** The service client containing this operation class. */
    private MonitorManagementClientImpl client;

    /**
     * Initializes an instance of DiagnosticSettingsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DiagnosticSettingsInner(Retrofit retrofit, MonitorManagementClientImpl client) {
        this.service = retrofit.create(DiagnosticSettingsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DiagnosticSettings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DiagnosticSettingsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.DiagnosticSettings get" })
        @GET("{resourceUri}/providers/microsoft.insights/diagnosticSettings/{name}")
        Observable<Response<ResponseBody>> get(@Path(value = "resourceUri", encoded = true) String resourceUri, @Path("name") String name, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.DiagnosticSettings createOrUpdate" })
        @PUT("{resourceUri}/providers/microsoft.insights/diagnosticSettings/{name}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path(value = "resourceUri", encoded = true) String resourceUri, @Path("name") String name, @Query("api-version") String apiVersion, @Body DiagnosticSettingsResourceInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.DiagnosticSettings delete" })
        @HTTP(path = "{resourceUri}/providers/microsoft.insights/diagnosticSettings/{name}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path(value = "resourceUri", encoded = true) String resourceUri, @Path("name") String name, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.DiagnosticSettings list" })
        @GET("{resourceUri}/providers/microsoft.insights/diagnosticSettings")
        Observable<Response<ResponseBody>> list(@Path(value = "resourceUri", encoded = true) String resourceUri, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the active diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DiagnosticSettingsResourceInner object if successful.
     */
    public DiagnosticSettingsResourceInner get(String resourceUri, String name) {
        return getWithServiceResponseAsync(resourceUri, name).toBlocking().single().body();
    }

    /**
     * Gets the active diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DiagnosticSettingsResourceInner> getAsync(String resourceUri, String name, final ServiceCallback<DiagnosticSettingsResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceUri, name), serviceCallback);
    }

    /**
     * Gets the active diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DiagnosticSettingsResourceInner object
     */
    public Observable<DiagnosticSettingsResourceInner> getAsync(String resourceUri, String name) {
        return getWithServiceResponseAsync(resourceUri, name).map(new Func1<ServiceResponse<DiagnosticSettingsResourceInner>, DiagnosticSettingsResourceInner>() {
            @Override
            public DiagnosticSettingsResourceInner call(ServiceResponse<DiagnosticSettingsResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the active diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DiagnosticSettingsResourceInner object
     */
    public Observable<ServiceResponse<DiagnosticSettingsResourceInner>> getWithServiceResponseAsync(String resourceUri, String name) {
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        final String apiVersion = "2017-05-01-preview";
        return service.get(resourceUri, name, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DiagnosticSettingsResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<DiagnosticSettingsResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DiagnosticSettingsResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DiagnosticSettingsResourceInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DiagnosticSettingsResourceInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DiagnosticSettingsResourceInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Creates or updates diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param parameters Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DiagnosticSettingsResourceInner object if successful.
     */
    public DiagnosticSettingsResourceInner createOrUpdate(String resourceUri, String name, DiagnosticSettingsResourceInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceUri, name, parameters).toBlocking().single().body();
    }

    /**
     * Creates or updates diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param parameters Parameters supplied to the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DiagnosticSettingsResourceInner> createOrUpdateAsync(String resourceUri, String name, DiagnosticSettingsResourceInner parameters, final ServiceCallback<DiagnosticSettingsResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceUri, name, parameters), serviceCallback);
    }

    /**
     * Creates or updates diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param parameters Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DiagnosticSettingsResourceInner object
     */
    public Observable<DiagnosticSettingsResourceInner> createOrUpdateAsync(String resourceUri, String name, DiagnosticSettingsResourceInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceUri, name, parameters).map(new Func1<ServiceResponse<DiagnosticSettingsResourceInner>, DiagnosticSettingsResourceInner>() {
            @Override
            public DiagnosticSettingsResourceInner call(ServiceResponse<DiagnosticSettingsResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param parameters Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DiagnosticSettingsResourceInner object
     */
    public Observable<ServiceResponse<DiagnosticSettingsResourceInner>> createOrUpdateWithServiceResponseAsync(String resourceUri, String name, DiagnosticSettingsResourceInner parameters) {
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2017-05-01-preview";
        return service.createOrUpdate(resourceUri, name, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DiagnosticSettingsResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<DiagnosticSettingsResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DiagnosticSettingsResourceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DiagnosticSettingsResourceInner> createOrUpdateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DiagnosticSettingsResourceInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DiagnosticSettingsResourceInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Deletes existing diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceUri, String name) {
        deleteWithServiceResponseAsync(resourceUri, name).toBlocking().single().body();
    }

    /**
     * Deletes existing diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceUri, String name, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceUri, name), serviceCallback);
    }

    /**
     * Deletes existing diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceUri, String name) {
        return deleteWithServiceResponseAsync(resourceUri, name).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes existing diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceUri, String name) {
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        final String apiVersion = "2017-05-01-preview";
        return service.delete(resourceUri, name, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets the active diagnostic settings list for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DiagnosticSettingsResourceCollectionInner object if successful.
     */
    public DiagnosticSettingsResourceCollectionInner list(String resourceUri) {
        return listWithServiceResponseAsync(resourceUri).toBlocking().single().body();
    }

    /**
     * Gets the active diagnostic settings list for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DiagnosticSettingsResourceCollectionInner> listAsync(String resourceUri, final ServiceCallback<DiagnosticSettingsResourceCollectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceUri), serviceCallback);
    }

    /**
     * Gets the active diagnostic settings list for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DiagnosticSettingsResourceCollectionInner object
     */
    public Observable<DiagnosticSettingsResourceCollectionInner> listAsync(String resourceUri) {
        return listWithServiceResponseAsync(resourceUri).map(new Func1<ServiceResponse<DiagnosticSettingsResourceCollectionInner>, DiagnosticSettingsResourceCollectionInner>() {
            @Override
            public DiagnosticSettingsResourceCollectionInner call(ServiceResponse<DiagnosticSettingsResourceCollectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the active diagnostic settings list for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DiagnosticSettingsResourceCollectionInner object
     */
    public Observable<ServiceResponse<DiagnosticSettingsResourceCollectionInner>> listWithServiceResponseAsync(String resourceUri) {
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        final String apiVersion = "2017-05-01-preview";
        return service.list(resourceUri, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DiagnosticSettingsResourceCollectionInner>>>() {
                @Override
                public Observable<ServiceResponse<DiagnosticSettingsResourceCollectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DiagnosticSettingsResourceCollectionInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DiagnosticSettingsResourceCollectionInner> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DiagnosticSettingsResourceCollectionInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DiagnosticSettingsResourceCollectionInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
