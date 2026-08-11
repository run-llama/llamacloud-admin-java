// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.organizations.Organization
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationCreateParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationDeleteParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationGetParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationGetUsageParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationListPage
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationListParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationUpdateParams
import ai.llamaindex.llamacloudadmin.models.organizations.UsageAndPlan
import ai.llamaindex.llamacloudadmin.services.blocking.organizations.RoleService
import ai.llamaindex.llamacloudadmin.services.blocking.organizations.UserService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface OrganizationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationService

    fun users(): UserService

    fun roles(): RoleService

    /** Create a new organization. */
    fun create(params: OrganizationCreateParams): Organization =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OrganizationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Organization

    /** Update an existing organization. */
    fun update(organizationId: String, params: OrganizationUpdateParams): Organization =
        update(organizationId, params, RequestOptions.none())

    /** @see update */
    fun update(
        organizationId: String,
        params: OrganizationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Organization =
        update(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see update */
    fun update(params: OrganizationUpdateParams): Organization =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OrganizationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Organization

    /** List organizations the current user can access. */
    fun list(): OrganizationListPage = list(OrganizationListParams.none())

    /** @see list */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationListPage

    /** @see list */
    fun list(params: OrganizationListParams = OrganizationListParams.none()): OrganizationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OrganizationListPage =
        list(OrganizationListParams.none(), requestOptions)

    /** Delete an organization by ID. */
    fun delete(organizationId: String) = delete(organizationId, OrganizationDeleteParams.none())

    /** @see delete */
    fun delete(
        organizationId: String,
        params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see delete */
    fun delete(
        organizationId: String,
        params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
    ) = delete(organizationId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OrganizationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: OrganizationDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(organizationId: String, requestOptions: RequestOptions) =
        delete(organizationId, OrganizationDeleteParams.none(), requestOptions)

    /** Get an organization by ID. */
    fun get(organizationId: String): Organization =
        get(organizationId, OrganizationGetParams.none())

    /** @see get */
    fun get(
        organizationId: String,
        params: OrganizationGetParams = OrganizationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Organization = get(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see get */
    fun get(
        organizationId: String,
        params: OrganizationGetParams = OrganizationGetParams.none(),
    ): Organization = get(organizationId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OrganizationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Organization

    /** @see get */
    fun get(params: OrganizationGetParams): Organization = get(params, RequestOptions.none())

    /** @see get */
    fun get(organizationId: String, requestOptions: RequestOptions): Organization =
        get(organizationId, OrganizationGetParams.none(), requestOptions)

    /** Get usage for a specific organization. */
    fun getUsage(organizationId: String): UsageAndPlan =
        getUsage(organizationId, OrganizationGetUsageParams.none())

    /** @see getUsage */
    fun getUsage(
        organizationId: String,
        params: OrganizationGetUsageParams = OrganizationGetUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageAndPlan =
        getUsage(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see getUsage */
    fun getUsage(
        organizationId: String,
        params: OrganizationGetUsageParams = OrganizationGetUsageParams.none(),
    ): UsageAndPlan = getUsage(organizationId, params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(
        params: OrganizationGetUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageAndPlan

    /** @see getUsage */
    fun getUsage(params: OrganizationGetUsageParams): UsageAndPlan =
        getUsage(params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(organizationId: String, requestOptions: RequestOptions): UsageAndPlan =
        getUsage(organizationId, OrganizationGetUsageParams.none(), requestOptions)

    /**
     * A view of [OrganizationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrganizationService.WithRawResponse

        fun users(): UserService.WithRawResponse

        fun roles(): RoleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/organizations`, but is otherwise the same
         * as [OrganizationService.create].
         */
        @MustBeClosed
        fun create(params: OrganizationCreateParams): HttpResponseFor<Organization> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OrganizationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Organization>

        /**
         * Returns a raw HTTP response for `put /api/v2/organizations/{organization_id}`, but is
         * otherwise the same as [OrganizationService.update].
         */
        @MustBeClosed
        fun update(
            organizationId: String,
            params: OrganizationUpdateParams,
        ): HttpResponseFor<Organization> = update(organizationId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            organizationId: String,
            params: OrganizationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Organization> =
            update(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: OrganizationUpdateParams): HttpResponseFor<Organization> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OrganizationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Organization>

        /**
         * Returns a raw HTTP response for `get /api/v2/organizations`, but is otherwise the same as
         * [OrganizationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OrganizationListPage> = list(OrganizationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OrganizationListParams = OrganizationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OrganizationListParams = OrganizationListParams.none()
        ): HttpResponseFor<OrganizationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OrganizationListPage> =
            list(OrganizationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/organizations/{organization_id}`, but is
         * otherwise the same as [OrganizationService.delete].
         */
        @MustBeClosed
        fun delete(organizationId: String): HttpResponse =
            delete(organizationId, OrganizationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            organizationId: String,
            params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            organizationId: String,
            params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
        ): HttpResponse = delete(organizationId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OrganizationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OrganizationDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(organizationId: String, requestOptions: RequestOptions): HttpResponse =
            delete(organizationId, OrganizationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/organizations/{organization_id}`, but is
         * otherwise the same as [OrganizationService.get].
         */
        @MustBeClosed
        fun get(organizationId: String): HttpResponseFor<Organization> =
            get(organizationId, OrganizationGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            organizationId: String,
            params: OrganizationGetParams = OrganizationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Organization> =
            get(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            organizationId: String,
            params: OrganizationGetParams = OrganizationGetParams.none(),
        ): HttpResponseFor<Organization> = get(organizationId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: OrganizationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Organization>

        /** @see get */
        @MustBeClosed
        fun get(params: OrganizationGetParams): HttpResponseFor<Organization> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            organizationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Organization> =
            get(organizationId, OrganizationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/organizations/{organization_id}/usage`, but
         * is otherwise the same as [OrganizationService.getUsage].
         */
        @MustBeClosed
        fun getUsage(organizationId: String): HttpResponseFor<UsageAndPlan> =
            getUsage(organizationId, OrganizationGetUsageParams.none())

        /** @see getUsage */
        @MustBeClosed
        fun getUsage(
            organizationId: String,
            params: OrganizationGetUsageParams = OrganizationGetUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageAndPlan> =
            getUsage(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see getUsage */
        @MustBeClosed
        fun getUsage(
            organizationId: String,
            params: OrganizationGetUsageParams = OrganizationGetUsageParams.none(),
        ): HttpResponseFor<UsageAndPlan> = getUsage(organizationId, params, RequestOptions.none())

        /** @see getUsage */
        @MustBeClosed
        fun getUsage(
            params: OrganizationGetUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageAndPlan>

        /** @see getUsage */
        @MustBeClosed
        fun getUsage(params: OrganizationGetUsageParams): HttpResponseFor<UsageAndPlan> =
            getUsage(params, RequestOptions.none())

        /** @see getUsage */
        @MustBeClosed
        fun getUsage(
            organizationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageAndPlan> =
            getUsage(organizationId, OrganizationGetUsageParams.none(), requestOptions)
    }
}
