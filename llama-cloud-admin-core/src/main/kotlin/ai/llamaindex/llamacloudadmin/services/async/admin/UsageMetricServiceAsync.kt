// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async.admin

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricAggregateParams
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricAggregateResponse
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricExportParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UsageMetricServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageMetricServiceAsync

    /**
     * Aggregate usage metrics by one or more dimensions, reporting total credits used. Global admin
     * only.
     *
     * A date range is required, which bounds the scan via the `day`-leading index. Supplying
     * `organization_id` narrows it further via the `(organization_id, day)` index.
     *
     * Supported `group_by` dimensions: `day`, `organization_id`, `project_id`, `event_type`,
     * `user_id`. Buckets are ordered by total credits descending.
     */
    fun aggregate(
        params: UsageMetricAggregateParams
    ): CompletableFuture<UsageMetricAggregateResponse> = aggregate(params, RequestOptions.none())

    /** @see aggregate */
    fun aggregate(
        params: UsageMetricAggregateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageMetricAggregateResponse>

    /**
     * Export usage metrics line by line as CSV over a date range. Global admin only.
     *
     * Each row is a single usage metric. Use the optional filters to scope the export to an
     * organization, project, user, or set of event types.
     */
    fun export(params: UsageMetricExportParams): CompletableFuture<Void?> =
        export(params, RequestOptions.none())

    /** @see export */
    fun export(
        params: UsageMetricExportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [UsageMetricServiceAsync] that provides access to raw HTTP responses for each
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
        ): UsageMetricServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/admin/usage-metrics/aggregate`, but is
         * otherwise the same as [UsageMetricServiceAsync.aggregate].
         */
        fun aggregate(
            params: UsageMetricAggregateParams
        ): CompletableFuture<HttpResponseFor<UsageMetricAggregateResponse>> =
            aggregate(params, RequestOptions.none())

        /** @see aggregate */
        fun aggregate(
            params: UsageMetricAggregateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageMetricAggregateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/admin/usage-metrics/export`, but is
         * otherwise the same as [UsageMetricServiceAsync.export].
         */
        fun export(params: UsageMetricExportParams): CompletableFuture<HttpResponse> =
            export(params, RequestOptions.none())

        /** @see export */
        fun export(
            params: UsageMetricExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
