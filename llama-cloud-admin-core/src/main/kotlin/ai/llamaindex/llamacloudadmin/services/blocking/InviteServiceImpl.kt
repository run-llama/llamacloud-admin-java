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
import ai.llamaindex.llamacloudadmin.models.invites.InviteAcceptParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteAcceptResponse
import ai.llamaindex.llamacloudadmin.models.invites.InviteDeclineParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMinePage
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMinePageResponse
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMineParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InviteServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InviteService {

    private val withRawResponse: InviteService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InviteService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InviteService =
        InviteServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun accept(
        params: InviteAcceptParams,
        requestOptions: RequestOptions,
    ): InviteAcceptResponse =
        // post /api/v2/invites/{invite_id}/accept
        withRawResponse().accept(params, requestOptions).parse()

    override fun decline(params: InviteDeclineParams, requestOptions: RequestOptions) {
        // delete /api/v2/invites/{invite_id}
        withRawResponse().decline(params, requestOptions)
    }

    override fun listMine(
        params: InviteListMineParams,
        requestOptions: RequestOptions,
    ): InviteListMinePage =
        // get /api/v2/invites
        withRawResponse().listMine(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InviteService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InviteService.WithRawResponse =
            InviteServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val acceptHandler: Handler<InviteAcceptResponse> =
            jsonHandler<InviteAcceptResponse>(clientOptions.jsonMapper)

        override fun accept(
            params: InviteAcceptParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InviteAcceptResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inviteId", params.inviteId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "invites", params._pathParam(0), "accept")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { acceptHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val declineHandler: Handler<Void?> = emptyHandler()

        override fun decline(
            params: InviteDeclineParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inviteId", params.inviteId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "invites", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { declineHandler.handle(it) }
            }
        }

        private val listMineHandler: Handler<InviteListMinePageResponse> =
            jsonHandler<InviteListMinePageResponse>(clientOptions.jsonMapper)

        override fun listMine(
            params: InviteListMineParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InviteListMinePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "invites")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listMineHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        InviteListMinePage.builder()
                            .service(InviteServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
