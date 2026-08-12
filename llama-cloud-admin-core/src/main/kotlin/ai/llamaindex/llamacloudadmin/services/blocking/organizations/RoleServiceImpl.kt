// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking.organizations

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
import ai.llamaindex.llamacloudadmin.core.http.parseable
import ai.llamaindex.llamacloudadmin.core.prepare
import ai.llamaindex.llamacloudadmin.models.organizations.Role
import ai.llamaindex.llamacloudadmin.models.organizations.roles.RoleListParams
import ai.llamaindex.llamacloudadmin.services.blocking.organizations.RoleService
import ai.llamaindex.llamacloudadmin.services.blocking.organizations.RoleServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RoleServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : RoleService {

    private val withRawResponse: RoleService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): RoleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoleService = RoleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: RoleListParams, requestOptions: RequestOptions): List<Role> =
        // get /api/v1/organizations/{organization_id}/roles
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : RoleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoleService.WithRawResponse = RoleServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val listHandler: Handler<List<Role>> = jsonHandler<List<Role>>(clientOptions.jsonMapper)

        override fun list(params: RoleListParams, requestOptions: RequestOptions): HttpResponseFor<List<Role>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("organizationId", params.organizationId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v1", "organizations", params._pathParam(0), "roles")
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
                    it.forEach { it.validate() }
                  }
              }
          }
        }
    }
}
