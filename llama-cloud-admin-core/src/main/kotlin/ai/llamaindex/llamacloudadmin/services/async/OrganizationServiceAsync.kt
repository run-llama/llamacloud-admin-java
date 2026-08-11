// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.organizations.Organization
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationCreateParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationDeleteParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationGetParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationGetUsageParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationGetUsageResponse
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationListPageAsync
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationListParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationUpdateParams
import ai.llamaindex.llamacloudadmin.services.async.organizations.RoleServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.organizations.UserServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OrganizationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationServiceAsync

    fun users(): UserServiceAsync

    fun roles(): RoleServiceAsync

    /** Create a new organization. */
    fun create(params: OrganizationCreateParams): CompletableFuture<Organization> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OrganizationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Organization>

    /** Update an existing organization. */
    fun update(
        organizationId: String,
        params: OrganizationUpdateParams,
    ): CompletableFuture<Organization> = update(organizationId, params, RequestOptions.none())

    /** @see update */
    fun update(
        organizationId: String,
        params: OrganizationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Organization> =
        update(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see update */
    fun update(params: OrganizationUpdateParams): CompletableFuture<Organization> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OrganizationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Organization>

    /** List organizations the current user can access. */
    fun list(): CompletableFuture<OrganizationListPageAsync> = list(OrganizationListParams.none())

    /** @see list */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationListPageAsync>

    /** @see list */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none()
    ): CompletableFuture<OrganizationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OrganizationListPageAsync> =
        list(OrganizationListParams.none(), requestOptions)

    /** Delete an organization by ID. */
    fun delete(organizationId: String): CompletableFuture<Void?> =
        delete(organizationId, OrganizationDeleteParams.none())

    /** @see delete */
    fun delete(
        organizationId: String,
        params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see delete */
    fun delete(
        organizationId: String,
        params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(organizationId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OrganizationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OrganizationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(organizationId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(organizationId, OrganizationDeleteParams.none(), requestOptions)

    /** Get an organization by ID. */
    fun get(organizationId: String): CompletableFuture<Organization> =
        get(organizationId, OrganizationGetParams.none())

    /** @see get */
    fun get(
        organizationId: String,
        params: OrganizationGetParams = OrganizationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Organization> =
        get(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see get */
    fun get(
        organizationId: String,
        params: OrganizationGetParams = OrganizationGetParams.none(),
    ): CompletableFuture<Organization> = get(organizationId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OrganizationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Organization>

    /** @see get */
    fun get(params: OrganizationGetParams): CompletableFuture<Organization> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        organizationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Organization> =
        get(organizationId, OrganizationGetParams.none(), requestOptions)

    /** Get usage for a specific organization. */
    fun getUsage(organizationId: String): CompletableFuture<OrganizationGetUsageResponse> =
        getUsage(organizationId, OrganizationGetUsageParams.none())

    /** @see getUsage */
    fun getUsage(
        organizationId: String,
        params: OrganizationGetUsageParams = OrganizationGetUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationGetUsageResponse> =
        getUsage(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see getUsage */
    fun getUsage(
        organizationId: String,
        params: OrganizationGetUsageParams = OrganizationGetUsageParams.none(),
    ): CompletableFuture<OrganizationGetUsageResponse> =
        getUsage(organizationId, params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(
        params: OrganizationGetUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationGetUsageResponse>

    /** @see getUsage */
    fun getUsage(
        params: OrganizationGetUsageParams
    ): CompletableFuture<OrganizationGetUsageResponse> = getUsage(params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(
        organizationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrganizationGetUsageResponse> =
        getUsage(organizationId, OrganizationGetUsageParams.none(), requestOptions)

    /**
     * A view of [OrganizationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrganizationServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse

        fun roles(): RoleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/organizations`, but is otherwise the same
         * as [OrganizationServiceAsync.create].
         */
        fun create(
            params: OrganizationCreateParams
        ): CompletableFuture<HttpResponseFor<Organization>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OrganizationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Organization>>

        /**
         * Returns a raw HTTP response for `put /api/v2/organizations/{organization_id}`, but is
         * otherwise the same as [OrganizationServiceAsync.update].
         */
        fun update(
            organizationId: String,
            params: OrganizationUpdateParams,
        ): CompletableFuture<HttpResponseFor<Organization>> =
            update(organizationId, params, RequestOptions.none())

        /** @see update */
        fun update(
            organizationId: String,
            params: OrganizationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Organization>> =
            update(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see update */
        fun update(
            params: OrganizationUpdateParams
        ): CompletableFuture<HttpResponseFor<Organization>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: OrganizationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Organization>>

        /**
         * Returns a raw HTTP response for `get /api/v2/organizations`, but is otherwise the same as
         * [OrganizationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>> =
            list(OrganizationListParams.none())

        /** @see list */
        fun list(
            params: OrganizationListParams = OrganizationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>>

        /** @see list */
        fun list(
            params: OrganizationListParams = OrganizationListParams.none()
        ): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>> =
            list(OrganizationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/organizations/{organization_id}`, but is
         * otherwise the same as [OrganizationServiceAsync.delete].
         */
        fun delete(organizationId: String): CompletableFuture<HttpResponse> =
            delete(organizationId, OrganizationDeleteParams.none())

        /** @see delete */
        fun delete(
            organizationId: String,
            params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see delete */
        fun delete(
            organizationId: String,
            params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(organizationId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: OrganizationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OrganizationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            organizationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(organizationId, OrganizationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/organizations/{organization_id}`, but is
         * otherwise the same as [OrganizationServiceAsync.get].
         */
        fun get(organizationId: String): CompletableFuture<HttpResponseFor<Organization>> =
            get(organizationId, OrganizationGetParams.none())

        /** @see get */
        fun get(
            organizationId: String,
            params: OrganizationGetParams = OrganizationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Organization>> =
            get(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see get */
        fun get(
            organizationId: String,
            params: OrganizationGetParams = OrganizationGetParams.none(),
        ): CompletableFuture<HttpResponseFor<Organization>> =
            get(organizationId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: OrganizationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Organization>>

        /** @see get */
        fun get(params: OrganizationGetParams): CompletableFuture<HttpResponseFor<Organization>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            organizationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Organization>> =
            get(organizationId, OrganizationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/organizations/{organization_id}/usage`, but
         * is otherwise the same as [OrganizationServiceAsync.getUsage].
         */
        fun getUsage(
            organizationId: String
        ): CompletableFuture<HttpResponseFor<OrganizationGetUsageResponse>> =
            getUsage(organizationId, OrganizationGetUsageParams.none())

        /** @see getUsage */
        fun getUsage(
            organizationId: String,
            params: OrganizationGetUsageParams = OrganizationGetUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationGetUsageResponse>> =
            getUsage(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see getUsage */
        fun getUsage(
            organizationId: String,
            params: OrganizationGetUsageParams = OrganizationGetUsageParams.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationGetUsageResponse>> =
            getUsage(organizationId, params, RequestOptions.none())

        /** @see getUsage */
        fun getUsage(
            params: OrganizationGetUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationGetUsageResponse>>

        /** @see getUsage */
        fun getUsage(
            params: OrganizationGetUsageParams
        ): CompletableFuture<HttpResponseFor<OrganizationGetUsageResponse>> =
            getUsage(params, RequestOptions.none())

        /** @see getUsage */
        fun getUsage(
            organizationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationGetUsageResponse>> =
            getUsage(organizationId, OrganizationGetUsageParams.none(), requestOptions)
    }
}
