// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking

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
import ai.llamaindex.llamacloudadmin.core.prepare
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
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetS3ConfigParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetS3ConfigResponse
import ai.llamaindex.llamacloudadmin.services.blocking.admin.UsageMetricService
import ai.llamaindex.llamacloudadmin.services.blocking.admin.UsageMetricServiceImpl
import ai.llamaindex.llamacloudadmin.services.blocking.admin.UserService
import ai.llamaindex.llamacloudadmin.services.blocking.admin.UserServiceImpl
import java.util.function.Consumer

class AdminServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AdminService {

    private val withRawResponse: AdminService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val users: UserService by lazy { UserServiceImpl(clientOptions) }

    private val usageMetrics: UsageMetricService by lazy { UsageMetricServiceImpl(clientOptions) }

    override fun withRawResponse(): AdminService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdminService =
        AdminServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun users(): UserService = users

    override fun usageMetrics(): UsageMetricService = usageMetrics

    override fun getFilestoresInfo(
        params: AdminGetFilestoresInfoParams,
        requestOptions: RequestOptions,
    ): AdminGetFilestoresInfoResponse =
        // get /api/v1/admin/filestores/info
        withRawResponse().getFilestoresInfo(params, requestOptions).parse()

    override fun getLicenseInfo(
        params: AdminGetLicenseInfoParams,
        requestOptions: RequestOptions,
    ): AdminGetLicenseInfoResponse =
        // get /api/v1/admin/license/info
        withRawResponse().getLicenseInfo(params, requestOptions).parse()

    override fun getLlamaextractFeatures(
        params: AdminGetLlamaextractFeaturesParams,
        requestOptions: RequestOptions,
    ): AdminGetLlamaextractFeaturesResponse =
        // get /api/v1/admin/llamaextract/features
        withRawResponse().getLlamaextractFeatures(params, requestOptions).parse()

    override fun getLlmsInfo(
        params: AdminGetLlmsInfoParams,
        requestOptions: RequestOptions,
    ): AdminGetLlmsInfoResponse =
        // get /api/v1/admin/llms/info
        withRawResponse().getLlmsInfo(params, requestOptions).parse()

    override fun getOcrStatus(
        params: AdminGetOcrStatusParams,
        requestOptions: RequestOptions,
    ): AdminGetOcrStatusResponse =
        // get /api/v1/admin/ocr/statusz
        withRawResponse().getOcrStatus(params, requestOptions).parse()

    override fun getS3Config(
        params: AdminGetS3ConfigParams,
        requestOptions: RequestOptions,
    ): AdminGetS3ConfigResponse =
        // get /api/v1/admin/s3/config
        withRawResponse().getS3Config(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdminService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val usageMetrics: UsageMetricService.WithRawResponse by lazy {
            UsageMetricServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdminService.WithRawResponse =
            AdminServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun users(): UserService.WithRawResponse = users

        override fun usageMetrics(): UsageMetricService.WithRawResponse = usageMetrics

        private val getFilestoresInfoHandler: Handler<AdminGetFilestoresInfoResponse> =
            jsonHandler<AdminGetFilestoresInfoResponse>(clientOptions.jsonMapper)

        override fun getFilestoresInfo(
            params: AdminGetFilestoresInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdminGetFilestoresInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "filestores", "info")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getFilestoresInfoHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLicenseInfoHandler: Handler<AdminGetLicenseInfoResponse> =
            jsonHandler<AdminGetLicenseInfoResponse>(clientOptions.jsonMapper)

        override fun getLicenseInfo(
            params: AdminGetLicenseInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdminGetLicenseInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "license", "info")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLicenseInfoHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLlamaextractFeaturesHandler: Handler<AdminGetLlamaextractFeaturesResponse> =
            jsonHandler<AdminGetLlamaextractFeaturesResponse>(clientOptions.jsonMapper)

        override fun getLlamaextractFeatures(
            params: AdminGetLlamaextractFeaturesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdminGetLlamaextractFeaturesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "llamaextract", "features")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLlamaextractFeaturesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLlmsInfoHandler: Handler<AdminGetLlmsInfoResponse> =
            jsonHandler<AdminGetLlmsInfoResponse>(clientOptions.jsonMapper)

        override fun getLlmsInfo(
            params: AdminGetLlmsInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdminGetLlmsInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "llms", "info")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLlmsInfoHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getOcrStatusHandler: Handler<AdminGetOcrStatusResponse> =
            jsonHandler<AdminGetOcrStatusResponse>(clientOptions.jsonMapper)

        override fun getOcrStatus(
            params: AdminGetOcrStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdminGetOcrStatusResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "ocr", "statusz")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getOcrStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getS3ConfigHandler: Handler<AdminGetS3ConfigResponse> =
            jsonHandler<AdminGetS3ConfigResponse>(clientOptions.jsonMapper)

        override fun getS3Config(
            params: AdminGetS3ConfigParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdminGetS3ConfigResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "s3", "config")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getS3ConfigHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
