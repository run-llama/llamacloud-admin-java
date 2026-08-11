// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.handlers.errorBodyHandler
import ai.llamaindex.llamacloudadmin.core.handlers.errorHandler
import ai.llamaindex.llamacloudadmin.core.handlers.jsonHandler
import ai.llamaindex.llamacloudadmin.core.http.HttpMethod
import ai.llamaindex.llamacloudadmin.core.http.HttpRequest
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse.Handler
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.core.http.parseable
import ai.llamaindex.llamacloudadmin.core.prepareAsync
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetFilestoresInfoParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetFilestoresInfoResponse
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLicenseInfoParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLicenseInfoResponse
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLlamaextractFeaturesParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLlamaextractFeaturesResponse
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLlmsInfoParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLlmsInfoResponse
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetOcrStatusParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetOcrStatusResponse
import ai.llamaindex.llamacloudadmin.services.async.admin.UsageMetricServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.admin.UsageMetricServiceAsyncImpl
import ai.llamaindex.llamacloudadmin.services.async.admin.UserServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.admin.UserServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AdminServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AdminServiceAsync {

    private val withRawResponse: AdminServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    private val usageMetrics: UsageMetricServiceAsync by lazy {
        UsageMetricServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): AdminServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdminServiceAsync =
        AdminServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun users(): UserServiceAsync = users

    override fun usageMetrics(): UsageMetricServiceAsync = usageMetrics

    override fun getFilestoresInfo(
        params: AdminGetFilestoresInfoParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdminGetFilestoresInfoResponse> =
        // get /api/v1/admin/filestores/info
        withRawResponse().getFilestoresInfo(params, requestOptions).thenApply { it.parse() }

    override fun getLicenseInfo(
        params: AdminGetLicenseInfoParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdminGetLicenseInfoResponse> =
        // get /api/v1/admin/license/info
        withRawResponse().getLicenseInfo(params, requestOptions).thenApply { it.parse() }

    override fun getLlamaextractFeatures(
        params: AdminGetLlamaextractFeaturesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdminGetLlamaextractFeaturesResponse> =
        // get /api/v1/admin/llamaextract/features
        withRawResponse().getLlamaextractFeatures(params, requestOptions).thenApply { it.parse() }

    override fun getLlmsInfo(
        params: AdminGetLlmsInfoParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdminGetLlmsInfoResponse> =
        // get /api/v1/admin/llms/info
        withRawResponse().getLlmsInfo(params, requestOptions).thenApply { it.parse() }

    override fun getOcrStatus(
        params: AdminGetOcrStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdminGetOcrStatusResponse> =
        // get /api/v1/admin/ocr/statusz
        withRawResponse().getOcrStatus(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdminServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val usageMetrics: UsageMetricServiceAsync.WithRawResponse by lazy {
            UsageMetricServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdminServiceAsync.WithRawResponse =
            AdminServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun users(): UserServiceAsync.WithRawResponse = users

        override fun usageMetrics(): UsageMetricServiceAsync.WithRawResponse = usageMetrics

        private val getFilestoresInfoHandler: Handler<AdminGetFilestoresInfoResponse> =
            jsonHandler<AdminGetFilestoresInfoResponse>(clientOptions.jsonMapper)

        override fun getFilestoresInfo(
            params: AdminGetFilestoresInfoParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdminGetFilestoresInfoResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "filestores", "info")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getFilestoresInfoHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLicenseInfoHandler: Handler<AdminGetLicenseInfoResponse> =
            jsonHandler<AdminGetLicenseInfoResponse>(clientOptions.jsonMapper)

        override fun getLicenseInfo(
            params: AdminGetLicenseInfoParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdminGetLicenseInfoResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "license", "info")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLicenseInfoHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLlamaextractFeaturesHandler: Handler<AdminGetLlamaextractFeaturesResponse> =
            jsonHandler<AdminGetLlamaextractFeaturesResponse>(clientOptions.jsonMapper)

        override fun getLlamaextractFeatures(
            params: AdminGetLlamaextractFeaturesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdminGetLlamaextractFeaturesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "llamaextract", "features")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLlamaextractFeaturesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLlmsInfoHandler: Handler<AdminGetLlmsInfoResponse> =
            jsonHandler<AdminGetLlmsInfoResponse>(clientOptions.jsonMapper)

        override fun getLlmsInfo(
            params: AdminGetLlmsInfoParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdminGetLlmsInfoResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "llms", "info")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLlmsInfoHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getOcrStatusHandler: Handler<AdminGetOcrStatusResponse> =
            jsonHandler<AdminGetOcrStatusResponse>(clientOptions.jsonMapper)

        override fun getOcrStatus(
            params: AdminGetOcrStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdminGetOcrStatusResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "ocr", "statusz")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getOcrStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
