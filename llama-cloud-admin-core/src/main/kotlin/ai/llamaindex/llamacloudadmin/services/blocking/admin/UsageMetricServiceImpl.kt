// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking.admin

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.handlers.emptyHandler
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
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricAggregateParams
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricAggregateResponse
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricExportParams
import java.util.function.Consumer

class UsageMetricServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageMetricService {

    private val withRawResponse: UsageMetricService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsageMetricService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageMetricService =
        UsageMetricServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun aggregate(
        params: UsageMetricAggregateParams,
        requestOptions: RequestOptions,
    ): UsageMetricAggregateResponse =
        // get /api/v1/admin/usage-metrics/aggregate
        withRawResponse().aggregate(params, requestOptions).parse()

    override fun export(params: UsageMetricExportParams, requestOptions: RequestOptions) {
        // get /api/v1/admin/usage-metrics/export
        withRawResponse().export(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageMetricService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageMetricService.WithRawResponse =
            UsageMetricServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val aggregateHandler: Handler<UsageMetricAggregateResponse> =
            jsonHandler<UsageMetricAggregateResponse>(clientOptions.jsonMapper)

        override fun aggregate(
            params: UsageMetricAggregateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageMetricAggregateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "usage-metrics", "aggregate")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { aggregateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val exportHandler: Handler<Void?> = emptyHandler()

        override fun export(
            params: UsageMetricExportParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "usage-metrics", "export")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { exportHandler.handle(it) }
            }
        }
    }
}
