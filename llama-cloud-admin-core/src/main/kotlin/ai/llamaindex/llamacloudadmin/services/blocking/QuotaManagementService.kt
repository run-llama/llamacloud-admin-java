// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaConfiguration
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementCreateParams
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementDeleteParams
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementListPage
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface QuotaManagementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QuotaManagementService

    /** Create a quota configuration for your organization, or for a single project within it. */
    fun create(params: QuotaManagementCreateParams): QuotaConfiguration =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: QuotaManagementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QuotaConfiguration

    /**
     * Retrieve a paginated list of quota configurations with optional filtering. When expand=true,
     * returns resolved quotas (effective values after fallback chain) and pagination parameters are
     * ignored.
     */
    fun list(params: QuotaManagementListParams): QuotaManagementListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: QuotaManagementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QuotaManagementListPage

    /** Delete a quota configuration by removing the override. */
    fun delete(quotaId: String, params: QuotaManagementDeleteParams) =
        delete(quotaId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        quotaId: String,
        params: QuotaManagementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().quotaId(quotaId).build(), requestOptions)

    /** @see delete */
    fun delete(params: QuotaManagementDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: QuotaManagementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [QuotaManagementService] that provides access to raw HTTP responses for each
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
        ): QuotaManagementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/quota-management`, but is otherwise
         * the same as [QuotaManagementService.create].
         */
        @MustBeClosed
        fun create(params: QuotaManagementCreateParams): HttpResponseFor<QuotaConfiguration> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: QuotaManagementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QuotaConfiguration>

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/quota-management`, but is otherwise the
         * same as [QuotaManagementService.list].
         */
        @MustBeClosed
        fun list(params: QuotaManagementListParams): HttpResponseFor<QuotaManagementListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: QuotaManagementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QuotaManagementListPage>

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/quota-management/{quota_id}`, but is
         * otherwise the same as [QuotaManagementService.delete].
         */
        @MustBeClosed
        fun delete(quotaId: String, params: QuotaManagementDeleteParams): HttpResponse =
            delete(quotaId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            quotaId: String,
            params: QuotaManagementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().quotaId(quotaId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: QuotaManagementDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: QuotaManagementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
