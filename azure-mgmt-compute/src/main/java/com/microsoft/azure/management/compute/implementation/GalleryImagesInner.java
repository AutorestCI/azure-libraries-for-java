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
 * in GalleryImages.
 */
public class GalleryImagesInner {
    /** The Retrofit service to perform REST calls. */
    private GalleryImagesService service;
    /** The service client containing this operation class. */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of GalleryImagesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public GalleryImagesInner(Retrofit retrofit, ComputeManagementClientImpl client) {
        this.service = retrofit.create(GalleryImagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for GalleryImages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface GalleryImagesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.GalleryImages createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/images/{galleryImageName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("galleryName") String galleryName, @Path("galleryImageName") String galleryImageName, @Query("api-version") String apiVersion, @Body GalleryImageInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.GalleryImages beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/images/{galleryImageName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("galleryName") String galleryName, @Path("galleryImageName") String galleryImageName, @Query("api-version") String apiVersion, @Body GalleryImageInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.GalleryImages get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/images/{galleryImageName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("galleryName") String galleryName, @Path("galleryImageName") String galleryImageName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.GalleryImages delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/images/{galleryImageName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("galleryName") String galleryName, @Path("galleryImageName") String galleryImageName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.GalleryImages beginDelete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/images/{galleryImageName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> beginDelete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("galleryName") String galleryName, @Path("galleryImageName") String galleryImageName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.GalleryImages listGalleryImagesInGallery" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/images")
        Observable<Response<ResponseBody>> listGalleryImagesInGallery(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("galleryName") String galleryName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Create or update a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @param parameters Parameters supplied to the create or update gallery image operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GalleryImageInner object if successful.
     */
    public GalleryImageInner createOrUpdate(String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName, parameters).toBlocking().last().body();
    }

    /**
     * Create or update a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @param parameters Parameters supplied to the create or update gallery image operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GalleryImageInner> createOrUpdateAsync(String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner parameters, final ServiceCallback<GalleryImageInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName, parameters), serviceCallback);
    }

    /**
     * Create or update a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @param parameters Parameters supplied to the create or update gallery image operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<GalleryImageInner> createOrUpdateAsync(String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName, parameters).map(new Func1<ServiceResponse<GalleryImageInner>, GalleryImageInner>() {
            @Override
            public GalleryImageInner call(ServiceResponse<GalleryImageInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or update a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @param parameters Parameters supplied to the create or update gallery image operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<GalleryImageInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (galleryName == null) {
            throw new IllegalArgumentException("Parameter galleryName is required and cannot be null.");
        }
        if (galleryImageName == null) {
            throw new IllegalArgumentException("Parameter galleryImageName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2018-06-01";
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, galleryName, galleryImageName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<GalleryImageInner>() { }.getType());
    }

    /**
     * Create or update a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @param parameters Parameters supplied to the create or update gallery image operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GalleryImageInner object if successful.
     */
    public GalleryImageInner beginCreateOrUpdate(String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName, parameters).toBlocking().single().body();
    }

    /**
     * Create or update a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @param parameters Parameters supplied to the create or update gallery image operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GalleryImageInner> beginCreateOrUpdateAsync(String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner parameters, final ServiceCallback<GalleryImageInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName, parameters), serviceCallback);
    }

    /**
     * Create or update a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @param parameters Parameters supplied to the create or update gallery image operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GalleryImageInner object
     */
    public Observable<GalleryImageInner> beginCreateOrUpdateAsync(String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName, parameters).map(new Func1<ServiceResponse<GalleryImageInner>, GalleryImageInner>() {
            @Override
            public GalleryImageInner call(ServiceResponse<GalleryImageInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or update a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @param parameters Parameters supplied to the create or update gallery image operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GalleryImageInner object
     */
    public Observable<ServiceResponse<GalleryImageInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (galleryName == null) {
            throw new IllegalArgumentException("Parameter galleryName is required and cannot be null.");
        }
        if (galleryImageName == null) {
            throw new IllegalArgumentException("Parameter galleryImageName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2018-06-01";
        return service.beginCreateOrUpdate(this.client.subscriptionId(), resourceGroupName, galleryName, galleryImageName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GalleryImageInner>>>() {
                @Override
                public Observable<ServiceResponse<GalleryImageInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GalleryImageInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GalleryImageInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<GalleryImageInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<GalleryImageInner>() { }.getType())
                .register(202, new TypeToken<GalleryImageInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves information about a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GalleryImageInner object if successful.
     */
    public GalleryImageInner get(String resourceGroupName, String galleryName, String galleryImageName) {
        return getWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName).toBlocking().single().body();
    }

    /**
     * Retrieves information about a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GalleryImageInner> getAsync(String resourceGroupName, String galleryName, String galleryImageName, final ServiceCallback<GalleryImageInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName), serviceCallback);
    }

    /**
     * Retrieves information about a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GalleryImageInner object
     */
    public Observable<GalleryImageInner> getAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        return getWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName).map(new Func1<ServiceResponse<GalleryImageInner>, GalleryImageInner>() {
            @Override
            public GalleryImageInner call(ServiceResponse<GalleryImageInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves information about a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GalleryImageInner object
     */
    public Observable<ServiceResponse<GalleryImageInner>> getWithServiceResponseAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (galleryName == null) {
            throw new IllegalArgumentException("Parameter galleryName is required and cannot be null.");
        }
        if (galleryImageName == null) {
            throw new IllegalArgumentException("Parameter galleryImageName is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.get(this.client.subscriptionId(), resourceGroupName, galleryName, galleryImageName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GalleryImageInner>>>() {
                @Override
                public Observable<ServiceResponse<GalleryImageInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GalleryImageInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GalleryImageInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<GalleryImageInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<GalleryImageInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String galleryName, String galleryImageName) {
        deleteWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName).toBlocking().last().body();
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String galleryName, String galleryImageName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName), serviceCallback);
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        return deleteWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (galleryName == null) {
            throw new IllegalArgumentException("Parameter galleryName is required and cannot be null.");
        }
        if (galleryImageName == null) {
            throw new IllegalArgumentException("Parameter galleryImageName is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        Observable<Response<ResponseBody>> observable = service.delete(this.client.subscriptionId(), resourceGroupName, galleryName, galleryImageName, apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginDelete(String resourceGroupName, String galleryName, String galleryImageName) {
        beginDeleteWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName).toBlocking().single().body();
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginDeleteAsync(String resourceGroupName, String galleryName, String galleryImageName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginDeleteWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName), serviceCallback);
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginDeleteAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, galleryName, galleryImageName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param galleryImageName The name of the gallery image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginDeleteWithServiceResponseAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (galleryName == null) {
            throw new IllegalArgumentException("Parameter galleryName is required and cannot be null.");
        }
        if (galleryImageName == null) {
            throw new IllegalArgumentException("Parameter galleryImageName is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.beginDelete(this.client.subscriptionId(), resourceGroupName, galleryName, galleryImageName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginDeleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginDeleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List gallery images under a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GalleryImageListInner object if successful.
     */
    public GalleryImageListInner listGalleryImagesInGallery(String resourceGroupName, String galleryName) {
        return listGalleryImagesInGalleryWithServiceResponseAsync(resourceGroupName, galleryName).toBlocking().single().body();
    }

    /**
     * List gallery images under a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GalleryImageListInner> listGalleryImagesInGalleryAsync(String resourceGroupName, String galleryName, final ServiceCallback<GalleryImageListInner> serviceCallback) {
        return ServiceFuture.fromResponse(listGalleryImagesInGalleryWithServiceResponseAsync(resourceGroupName, galleryName), serviceCallback);
    }

    /**
     * List gallery images under a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GalleryImageListInner object
     */
    public Observable<GalleryImageListInner> listGalleryImagesInGalleryAsync(String resourceGroupName, String galleryName) {
        return listGalleryImagesInGalleryWithServiceResponseAsync(resourceGroupName, galleryName).map(new Func1<ServiceResponse<GalleryImageListInner>, GalleryImageListInner>() {
            @Override
            public GalleryImageListInner call(ServiceResponse<GalleryImageListInner> response) {
                return response.body();
            }
        });
    }

    /**
     * List gallery images under a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GalleryImageListInner object
     */
    public Observable<ServiceResponse<GalleryImageListInner>> listGalleryImagesInGalleryWithServiceResponseAsync(String resourceGroupName, String galleryName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (galleryName == null) {
            throw new IllegalArgumentException("Parameter galleryName is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.listGalleryImagesInGallery(this.client.subscriptionId(), resourceGroupName, galleryName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GalleryImageListInner>>>() {
                @Override
                public Observable<ServiceResponse<GalleryImageListInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GalleryImageListInner> clientResponse = listGalleryImagesInGalleryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GalleryImageListInner> listGalleryImagesInGalleryDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<GalleryImageListInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<GalleryImageListInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}