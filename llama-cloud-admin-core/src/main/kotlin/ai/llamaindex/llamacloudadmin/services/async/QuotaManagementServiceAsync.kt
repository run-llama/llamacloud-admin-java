// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaConfiguration
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementCreateParams
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementDeleteParams
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementListPageAsync
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface QuotaManagementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QuotaManagementServiceAsync

    /** Create a quota configuration for your organization, or for a single project within it. */
    fun create(params: QuotaManagementCreateParams): CompletableFuture<QuotaConfiguration> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: QuotaManagementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QuotaConfiguration>

    /**
     * Retrieve a paginated list of quota configurations with optional filtering. When expand=true,
     * returns resolved quotas (effective values after fallback chain) and pagination parameters are
     * ignored.
     */
    fun list(params: QuotaManagementListParams): CompletableFuture<QuotaManagementListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: QuotaManagementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QuotaManagementListPageAsync>

    /** Delete a quota configuration by removing the override. */
    fun delete(quotaId: String, params: QuotaManagementDeleteParams): CompletableFuture<Void?> =
        delete(quotaId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        quotaId: String,
        params: QuotaManagementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().quotaId(quotaId).build(), requestOptions)

    /** @see delete */
    fun delete(params: QuotaManagementDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: QuotaManagementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [QuotaManagementServiceAsync] that provides access to raw HTTP responses for each
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
        ): QuotaManagementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/quota-management`, but is otherwise
         * the same as [QuotaManagementServiceAsync.create].
         */
        fun create(
            params: QuotaManagementCreateParams
        ): CompletableFuture<HttpResponseFor<QuotaConfiguration>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: QuotaManagementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QuotaConfiguration>>

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/quota-management`, but is otherwise the
         * same as [QuotaManagementServiceAsync.list].
         */
        fun list(
            params: QuotaManagementListParams
        ): CompletableFuture<HttpResponseFor<QuotaManagementListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: QuotaManagementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QuotaManagementListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/quota-management/{quota_id}`, but is
         * otherwise the same as [QuotaManagementServiceAsync.delete].
         */
        fun delete(
            quotaId: String,
            params: QuotaManagementDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(quotaId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            quotaId: String,
            params: QuotaManagementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().quotaId(quotaId).build(), requestOptions)

        /** @see delete */
        fun delete(params: QuotaManagementDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: QuotaManagementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
