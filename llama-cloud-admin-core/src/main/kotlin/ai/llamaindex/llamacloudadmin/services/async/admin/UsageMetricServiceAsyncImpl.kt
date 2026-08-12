// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async.admin

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
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricAggregateParams
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricAggregateResponse
import ai.llamaindex.llamacloudadmin.services.async.admin.UsageMetricServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.admin.UsageMetricServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class UsageMetricServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : UsageMetricServiceAsync {

    private val withRawResponse: UsageMetricServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): UsageMetricServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageMetricServiceAsync = UsageMetricServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun aggregate(params: UsageMetricAggregateParams, requestOptions: RequestOptions): CompletableFuture<UsageMetricAggregateResponse> =
        // get /api/v1/admin/usage-metrics/aggregate
        withRawResponse().aggregate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : UsageMetricServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageMetricServiceAsync.WithRawResponse = UsageMetricServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val aggregateHandler: Handler<UsageMetricAggregateResponse> = jsonHandler<UsageMetricAggregateResponse>(clientOptions.jsonMapper)

        override fun aggregate(params: UsageMetricAggregateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<UsageMetricAggregateResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v1", "admin", "usage-metrics", "aggregate")
            .build()
            .prepareAsync(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  aggregateHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }
    }
}
