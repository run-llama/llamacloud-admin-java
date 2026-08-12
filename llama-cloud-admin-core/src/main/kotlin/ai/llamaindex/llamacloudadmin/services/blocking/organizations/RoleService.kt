// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking.organizations

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.organizations.Role
import ai.llamaindex.llamacloudadmin.models.organizations.roles.RoleListParams
import ai.llamaindex.llamacloudadmin.services.blocking.organizations.RoleService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface RoleService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoleService

    /** List all roles in an organization. */
    fun list(organizationId: String): List<Role> =
        list(
          organizationId, RoleListParams.none()
        )

    /** @see list */
    fun list(organizationId: String, params: RoleListParams = RoleListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): List<Role> =
        list(
          params.toBuilder()
              .organizationId(organizationId)
              .build(), requestOptions
        )

    /** @see list */
    fun list(organizationId: String, params: RoleListParams = RoleListParams.none()): List<Role> =
        list(
          organizationId,
          params,
          RequestOptions.none(),
        )

    /** @see list */
    fun list(params: RoleListParams, requestOptions: RequestOptions = RequestOptions.none()): List<Role>

    /** @see list */
    fun list(params: RoleListParams): List<Role> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(organizationId: String, requestOptions: RequestOptions): List<Role> =
        list(
          organizationId,
          RoleListParams.none(),
          requestOptions,
        )

    /** A view of [RoleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoleService.WithRawResponse

        /** Returns a raw HTTP response for `get /api/v1/organizations/{organization_id}/roles`, but is otherwise the             same as [RoleService.list]. */
        @MustBeClosed
        fun list(organizationId: String): HttpResponseFor<List<Role>> =
            list(
              organizationId, RoleListParams.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(organizationId: String, params: RoleListParams = RoleListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<Role>> =
            list(
              params.toBuilder()
                  .organizationId(organizationId)
                  .build(), requestOptions
            )

        /** @see list */
        @MustBeClosed
        fun list(organizationId: String, params: RoleListParams = RoleListParams.none()): HttpResponseFor<List<Role>> =
            list(
              organizationId,
              params,
              RequestOptions.none(),
            )

        /** @see list */
        @MustBeClosed
        fun list(params: RoleListParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<Role>>

        /** @see list */
        @MustBeClosed
        fun list(params: RoleListParams): HttpResponseFor<List<Role>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(organizationId: String, requestOptions: RequestOptions): HttpResponseFor<List<Role>> =
            list(
              organizationId,
              RoleListParams.none(),
              requestOptions,
            )
    }
}
