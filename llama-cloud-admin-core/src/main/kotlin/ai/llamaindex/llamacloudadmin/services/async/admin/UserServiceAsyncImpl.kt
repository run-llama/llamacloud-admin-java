// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async.admin

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.checkRequired
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
import ai.llamaindex.llamacloudadmin.models.admin.users.UserClaims
import ai.llamaindex.llamacloudadmin.models.admin.users.UserGetClaimsParams
import ai.llamaindex.llamacloudadmin.models.admin.users.UserUpdateClaimsParams
import ai.llamaindex.llamacloudadmin.services.async.admin.UserServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.admin.UserServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UserServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : UserServiceAsync {

    private val withRawResponse: UserServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): UserServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync = UserServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getClaims(params: UserGetClaimsParams, requestOptions: RequestOptions): CompletableFuture<UserClaims> =
        // get /api/v1/admin/users/{user_id}/claims
        withRawResponse().getClaims(params, requestOptions).thenApply { it.parse() }

    override fun updateClaims(params: UserUpdateClaimsParams, requestOptions: RequestOptions): CompletableFuture<UserClaims> =
        // patch /api/v1/admin/users/{user_id}/claims
        withRawResponse().updateClaims(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : UserServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse = UserServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val getClaimsHandler: Handler<UserClaims> = jsonHandler<UserClaims>(clientOptions.jsonMapper)

        override fun getClaims(params: UserGetClaimsParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<UserClaims>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("userId", params.userId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v1", "admin", "users", params._pathParam(0), "claims")
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
                  getClaimsHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val updateClaimsHandler: Handler<UserClaims> = jsonHandler<UserClaims>(clientOptions.jsonMapper)

        override fun updateClaims(params: UserUpdateClaimsParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<UserClaims>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("userId", params.userId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PATCH)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v1", "admin", "users", params._pathParam(0), "claims")
            .body(json(clientOptions.jsonMapper, params._body()))
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
                  updateClaimsHandler.handle(it)
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
