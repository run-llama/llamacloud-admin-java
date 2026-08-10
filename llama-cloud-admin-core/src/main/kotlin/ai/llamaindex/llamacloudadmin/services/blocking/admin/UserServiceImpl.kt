// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking.admin

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
import ai.llamaindex.llamacloudadmin.core.prepare
import ai.llamaindex.llamacloudadmin.models.admin.users.UserClaims
import ai.llamaindex.llamacloudadmin.models.admin.users.UserGetClaimsParams
import ai.llamaindex.llamacloudadmin.models.admin.users.UserUpdateClaimsParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UserServiceImpl internal constructor(private val clientOptions: ClientOptions) : UserService {

    private val withRawResponse: UserService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService =
        UserServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getClaims(
        params: UserGetClaimsParams,
        requestOptions: RequestOptions,
    ): UserClaims =
        // get /api/v1/admin/users/{user_id}/claims
        withRawResponse().getClaims(params, requestOptions).parse()

    override fun updateClaims(
        params: UserUpdateClaimsParams,
        requestOptions: RequestOptions,
    ): UserClaims =
        // patch /api/v1/admin/users/{user_id}/claims
        withRawResponse().updateClaims(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserService.WithRawResponse =
            UserServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getClaimsHandler: Handler<UserClaims> =
            jsonHandler<UserClaims>(clientOptions.jsonMapper)

        override fun getClaims(
            params: UserGetClaimsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserClaims> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "users", params._pathParam(0), "claims")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getClaimsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateClaimsHandler: Handler<UserClaims> =
            jsonHandler<UserClaims>(clientOptions.jsonMapper)

        override fun updateClaims(
            params: UserUpdateClaimsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserClaims> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "admin", "users", params._pathParam(0), "claims")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateClaimsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
