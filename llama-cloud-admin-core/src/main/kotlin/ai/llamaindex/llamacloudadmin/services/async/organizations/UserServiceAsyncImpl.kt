// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async.organizations

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
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationMember
import ai.llamaindex.llamacloudadmin.models.organizations.UserOrganizationRole
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAddParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAddToProjectParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAddToProjectResponse
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAssignRoleParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserDeleteParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserListMembersParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserListProjectsParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserListProjectsResponse
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserRemoveFromProjectParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserRemoveFromProjectResponse
import ai.llamaindex.llamacloudadmin.services.async.organizations.UserServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.organizations.UserServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UserServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : UserServiceAsync {

    private val withRawResponse: UserServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): UserServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync = UserServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun delete(params: UserDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /api/v1/organizations/{organization_id}/users/{member_user_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun add(params: UserAddParams, requestOptions: RequestOptions): CompletableFuture<List<OrganizationMember>> =
        // put /api/v1/organizations/{organization_id}/users
        withRawResponse().add(params, requestOptions).thenApply { it.parse() }

    override fun addToProject(params: UserAddToProjectParams, requestOptions: RequestOptions): CompletableFuture<UserAddToProjectResponse> =
        // put /api/v1/organizations/{organization_id}/users/{user_id}/projects
        withRawResponse().addToProject(params, requestOptions).thenApply { it.parse() }

    override fun assignRole(params: UserAssignRoleParams, requestOptions: RequestOptions): CompletableFuture<UserOrganizationRole> =
        // put /api/v1/organizations/{organization_id}/users/roles
        withRawResponse().assignRole(params, requestOptions).thenApply { it.parse() }

    override fun listMembers(params: UserListMembersParams, requestOptions: RequestOptions): CompletableFuture<List<OrganizationMember>> =
        // get /api/v1/organizations/{organization_id}/users
        withRawResponse().listMembers(params, requestOptions).thenApply { it.parse() }

    override fun listProjects(params: UserListProjectsParams, requestOptions: RequestOptions): CompletableFuture<List<UserListProjectsResponse>> =
        // get /api/v1/organizations/{organization_id}/users/{user_id}/projects
        withRawResponse().listProjects(params, requestOptions).thenApply { it.parse() }

    override fun removeFromProject(params: UserRemoveFromProjectParams, requestOptions: RequestOptions): CompletableFuture<UserRemoveFromProjectResponse> =
        // delete /api/v1/organizations/{organization_id}/users/{user_id}/projects/{project_id}
        withRawResponse().removeFromProject(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : UserServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse = UserServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: UserDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("memberUserId", params.memberUserId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v1", "organizations", params._pathParam(0), "users", params._pathParam(1))
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

        private val addHandler: Handler<List<OrganizationMember>> = jsonHandler<List<OrganizationMember>>(clientOptions.jsonMapper)

        override fun add(params: UserAddParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<OrganizationMember>>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("organizationId", params.organizationId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v1", "organizations", params._pathParam(0), "users")
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
                  addHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          } }
        }

        private val addToProjectHandler: Handler<UserAddToProjectResponse> = jsonHandler<UserAddToProjectResponse>(clientOptions.jsonMapper)

        override fun addToProject(params: UserAddToProjectParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<UserAddToProjectResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("userId", params.userId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v1", "organizations", params._pathParam(0), "users", params._pathParam(1), "projects")
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
                  addToProjectHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val assignRoleHandler: Handler<UserOrganizationRole> = jsonHandler<UserOrganizationRole>(clientOptions.jsonMapper)

        override fun assignRole(params: UserAssignRoleParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<UserOrganizationRole>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("pathOrganizationId", params.pathOrganizationId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v1", "organizations", params._pathParam(0), "users", "roles")
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
                  assignRoleHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val listMembersHandler: Handler<List<OrganizationMember>> = jsonHandler<List<OrganizationMember>>(clientOptions.jsonMapper)

        override fun listMembers(params: UserListMembersParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<OrganizationMember>>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("organizationId", params.organizationId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v1", "organizations", params._pathParam(0), "users")
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
                  listMembersHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          } }
        }

        private val listProjectsHandler: Handler<List<UserListProjectsResponse>> = jsonHandler<List<UserListProjectsResponse>>(clientOptions.jsonMapper)

        override fun listProjects(params: UserListProjectsParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<UserListProjectsResponse>>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("userId", params.userId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v1", "organizations", params._pathParam(0), "users", params._pathParam(1), "projects")
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
                  listProjectsHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
          } }
        }

        private val removeFromProjectHandler: Handler<UserRemoveFromProjectResponse> = jsonHandler<UserRemoveFromProjectResponse>(clientOptions.jsonMapper)

        override fun removeFromProject(params: UserRemoveFromProjectParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<UserRemoveFromProjectResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("projectId", params.projectId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v1", "organizations", params._pathParam(0), "users", params._pathParam(1), "projects", params._pathParam(2))
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
                  removeFromProjectHandler.handle(it)
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
