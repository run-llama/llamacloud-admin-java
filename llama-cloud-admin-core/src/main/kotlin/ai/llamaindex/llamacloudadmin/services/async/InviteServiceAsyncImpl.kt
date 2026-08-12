// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

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
import ai.llamaindex.llamacloudadmin.core.prepareAsync
import ai.llamaindex.llamacloudadmin.models.invites.InviteAcceptParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteAcceptResponse
import ai.llamaindex.llamacloudadmin.models.invites.InviteDeclineParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMinePage
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMinePageAsync
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMinePageResponse
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMineParams
import ai.llamaindex.llamacloudadmin.services.async.InviteServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.InviteServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InviteServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : InviteServiceAsync {

    private val withRawResponse: InviteServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): InviteServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InviteServiceAsync = InviteServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun accept(params: InviteAcceptParams, requestOptions: RequestOptions): CompletableFuture<InviteAcceptResponse> =
        // post /api/v2/invites/{invite_id}/accept
        withRawResponse().accept(params, requestOptions).thenApply { it.parse() }

    override fun decline(params: InviteDeclineParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /api/v2/invites/{invite_id}
        withRawResponse().decline(params, requestOptions).thenAccept {}

    override fun listMine(params: InviteListMineParams, requestOptions: RequestOptions): CompletableFuture<InviteListMinePageAsync> =
        // get /api/v2/invites
        withRawResponse().listMine(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : InviteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InviteServiceAsync.WithRawResponse = InviteServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val acceptHandler: Handler<InviteAcceptResponse> = jsonHandler<InviteAcceptResponse>(clientOptions.jsonMapper)

        override fun accept(params: InviteAcceptParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<InviteAcceptResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("inviteId", params.inviteId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v2", "invites", params._pathParam(0), "accept")
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
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
                  acceptHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val declineHandler: Handler<Void?> = emptyHandler()

        override fun decline(params: InviteDeclineParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("inviteId", params.inviteId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v2", "invites", params._pathParam(0))
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
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
                  declineHandler.handle(it)
              }
          } }
        }

        private val listMineHandler: Handler<InviteListMinePageResponse> = jsonHandler<InviteListMinePageResponse>(clientOptions.jsonMapper)

        override fun listMine(params: InviteListMineParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<InviteListMinePageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v2", "invites")
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
                  listMineHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  InviteListMinePageAsync.builder()
                      .service(InviteServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .response(it)
                      .build()
              }
          } }
        }
    }
}
