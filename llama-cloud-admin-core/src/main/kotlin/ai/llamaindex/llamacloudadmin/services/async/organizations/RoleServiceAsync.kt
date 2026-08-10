// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async.organizations

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.organizations.Role
import ai.llamaindex.llamacloudadmin.models.organizations.roles.RoleListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RoleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoleServiceAsync

    /** List all roles in an organization. */
    fun list(organizationId: String): CompletableFuture<List<Role>> =
        list(organizationId, RoleListParams.none())

    /** @see list */
    fun list(
        organizationId: String,
        params: RoleListParams = RoleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Role>> =
        list(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see list */
    fun list(
        organizationId: String,
        params: RoleListParams = RoleListParams.none(),
    ): CompletableFuture<List<Role>> = list(organizationId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RoleListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Role>>

    /** @see list */
    fun list(params: RoleListParams): CompletableFuture<List<Role>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        organizationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Role>> = list(organizationId, RoleListParams.none(), requestOptions)

    /** A view of [RoleServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/organizations/{organization_id}/roles`, but
         * is otherwise the same as [RoleServiceAsync.list].
         */
        fun list(organizationId: String): CompletableFuture<HttpResponseFor<List<Role>>> =
            list(organizationId, RoleListParams.none())

        /** @see list */
        fun list(
            organizationId: String,
            params: RoleListParams = RoleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Role>>> =
            list(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see list */
        fun list(
            organizationId: String,
            params: RoleListParams = RoleListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<Role>>> =
            list(organizationId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RoleListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Role>>>

        /** @see list */
        fun list(params: RoleListParams): CompletableFuture<HttpResponseFor<List<Role>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            organizationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Role>>> =
            list(organizationId, RoleListParams.none(), requestOptions)
    }
}
