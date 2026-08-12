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
import ai.llamaindex.llamacloudadmin.models.projects.Project
import ai.llamaindex.llamacloudadmin.models.projects.ProjectCreateParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectDeleteParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectGetParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectListPage
import ai.llamaindex.llamacloudadmin.models.projects.ProjectListPageResponse
import ai.llamaindex.llamacloudadmin.models.projects.ProjectListParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectUpdateParams
import ai.llamaindex.llamacloudadmin.services.blocking.ProjectService
import ai.llamaindex.llamacloudadmin.services.blocking.ProjectServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ProjectServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ProjectService {

    private val withRawResponse: ProjectService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): ProjectService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService = ProjectServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: ProjectCreateParams, requestOptions: RequestOptions): Project =
        // post /api/v2/projects
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: ProjectUpdateParams, requestOptions: RequestOptions): Project =
        // put /api/v2/projects/{project_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: ProjectListParams, requestOptions: RequestOptions): ProjectListPage =
        // get /api/v2/projects
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ProjectDeleteParams, requestOptions: RequestOptions) {
      // delete /api/v2/projects/{project_id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: ProjectGetParams, requestOptions: RequestOptions): Project =
        // get /api/v2/projects/{project_id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ProjectService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService.WithRawResponse = ProjectServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val createHandler: Handler<Project> = jsonHandler<Project>(clientOptions.jsonMapper)

        override fun create(params: ProjectCreateParams, requestOptions: RequestOptions): HttpResponseFor<Project> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v2", "projects")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  createHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val updateHandler: Handler<Project> = jsonHandler<Project>(clientOptions.jsonMapper)

        override fun update(params: ProjectUpdateParams, requestOptions: RequestOptions): HttpResponseFor<Project> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("projectId", params.projectId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v2", "projects", params._pathParam(0))
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  updateHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val listHandler: Handler<ProjectListPageResponse> = jsonHandler<ProjectListPageResponse>(clientOptions.jsonMapper)

        override fun list(params: ProjectListParams, requestOptions: RequestOptions): HttpResponseFor<ProjectListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v2", "projects")
            .build()
            .prepare(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  ProjectListPage.builder()
                      .service(ProjectServiceImpl(clientOptions))
                      .params(params)
                      .response(it)
                      .build()
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: ProjectDeleteParams, requestOptions: RequestOptions): HttpResponse {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("projectId", params.projectId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v2", "projects", params._pathParam(0))
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepare(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  deleteHandler.handle(it)
              }
          }
        }

        private val getHandler: Handler<Project> = jsonHandler<Project>(clientOptions.jsonMapper)

        override fun get(params: ProjectGetParams, requestOptions: RequestOptions): HttpResponseFor<Project> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("projectId", params.projectId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v2", "projects", params._pathParam(0))
            .build()
            .prepare(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return errorHandler.handle(response).parseable {
              response.use {
                  getHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }
    }
}
