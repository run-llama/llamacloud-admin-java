// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.core.handlers.emptyHandler
import ai.llamaindex.llamacloudadmin.core.handlers.errorBodyHandler
import ai.llamaindex.llamacloudadmin.core.handlers.errorHandler
import ai.llamaindex.llamacloudadmin.core.handlers.jsonHandler
import ai.llamaindex.llamacloudadmin.core.http.HttpMethod
import ai.llamaindex.llamacloudadmin.core.http.HttpRequest
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse.Handler
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.core.http.json
import ai.llamaindex.llamacloudadmin.core.http.parseable
import ai.llamaindex.llamacloudadmin.core.prepare
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaConfiguration
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementCreateParams
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementDeleteParams
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementListPage
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementListPageResponse
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class QuotaManagementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    QuotaManagementService {

    private val withRawResponse: QuotaManagementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): QuotaManagementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): QuotaManagementService =
        QuotaManagementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: QuotaManagementCreateParams,
        requestOptions: RequestOptions,
    ): QuotaConfiguration =
        // post /api/v1/beta/quota-management
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: QuotaManagementListParams,
        requestOptions: RequestOptions,
    ): QuotaManagementListPage =
        // get /api/v1/beta/quota-management
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: QuotaManagementDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v1/beta/quota-management/{quota_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QuotaManagementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QuotaManagementService.WithRawResponse =
            QuotaManagementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<QuotaConfiguration> =
            jsonHandler<QuotaConfiguration>(clientOptions.jsonMapper)

        override fun create(
            params: QuotaManagementCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QuotaConfiguration> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "quota-management")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<QuotaManagementListPageResponse> =
            jsonHandler<QuotaManagementListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: QuotaManagementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QuotaManagementListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "quota-management")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        QuotaManagementListPage.builder()
                            .service(QuotaManagementServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: QuotaManagementDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("quotaId", params.quotaId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "quota-management", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
