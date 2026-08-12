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
import ai.llamaindex.llamacloudadmin.models.organizations.Organization
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationCreateParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationDeleteParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationGetParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationGetUsageParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationListPage
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationListPageAsync
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationListPageResponse
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationListParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationUpdateParams
import ai.llamaindex.llamacloudadmin.models.organizations.UsageAndPlan
import ai.llamaindex.llamacloudadmin.services.async.OrganizationServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.OrganizationServiceAsyncImpl
import ai.llamaindex.llamacloudadmin.services.async.organizations.RoleServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.organizations.RoleServiceAsyncImpl
import ai.llamaindex.llamacloudadmin.services.async.organizations.UserServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.organizations.UserServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OrganizationServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OrganizationServiceAsync {

    private val withRawResponse: OrganizationServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    private val roles: RoleServiceAsync by lazy { RoleServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OrganizationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationServiceAsync = OrganizationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun users(): UserServiceAsync = users

    override fun roles(): RoleServiceAsync = roles

    override fun create(params: OrganizationCreateParams, requestOptions: RequestOptions): CompletableFuture<Organization> =
        // post /api/v2/organizations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(params: OrganizationUpdateParams, requestOptions: RequestOptions): CompletableFuture<Organization> =
        // put /api/v2/organizations/{organization_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(params: OrganizationListParams, requestOptions: RequestOptions): CompletableFuture<OrganizationListPageAsync> =
        // get /api/v2/organizations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: OrganizationDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /api/v2/organizations/{organization_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(params: OrganizationGetParams, requestOptions: RequestOptions): CompletableFuture<Organization> =
        // get /api/v2/organizations/{organization_id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getUsage(params: OrganizationGetUsageParams, requestOptions: RequestOptions): CompletableFuture<UsageAndPlan> =
        // get /api/v1/organizations/{organization_id}/usage
        withRawResponse().getUsage(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OrganizationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val users: UserServiceAsync.WithRawResponse by lazy { UserServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        private val roles: RoleServiceAsync.WithRawResponse by lazy { RoleServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationServiceAsync.WithRawResponse = OrganizationServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun users(): UserServiceAsync.WithRawResponse = users

        override fun roles(): RoleServiceAsync.WithRawResponse = roles

        private val createHandler: Handler<Organization> = jsonHandler<Organization>(clientOptions.jsonMapper)

        override fun create(params: OrganizationCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Organization>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v2", "organizations")
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
                  createHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val updateHandler: Handler<Organization> = jsonHandler<Organization>(clientOptions.jsonMapper)

        override fun update(params: OrganizationUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Organization>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("organizationId", params.organizationId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v2", "organizations", params._pathParam(0))
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
                  updateHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val listHandler: Handler<OrganizationListPageResponse> = jsonHandler<OrganizationListPageResponse>(clientOptions.jsonMapper)

        override fun list(params: OrganizationListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v2", "organizations")
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
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  OrganizationListPageAsync.builder()
                      .service(OrganizationServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .response(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: OrganizationDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("organizationId", params.organizationId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v2", "organizations", params._pathParam(0))
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
                  deleteHandler.handle(it)
              }
          } }
        }

        private val getHandler: Handler<Organization> = jsonHandler<Organization>(clientOptions.jsonMapper)

        override fun get(params: OrganizationGetParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Organization>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("organizationId", params.organizationId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v2", "organizations", params._pathParam(0))
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
                  getHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val getUsageHandler: Handler<UsageAndPlan> = jsonHandler<UsageAndPlan>(clientOptions.jsonMapper)

        override fun getUsage(params: OrganizationGetUsageParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<UsageAndPlan>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("organizationId", params.organizationId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v1", "organizations", params._pathParam(0), "usage")
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
                  getUsageHandler.handle(it)
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
