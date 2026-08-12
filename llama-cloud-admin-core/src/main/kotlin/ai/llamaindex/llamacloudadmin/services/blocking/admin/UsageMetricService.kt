// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking.admin

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricAggregateParams
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricAggregateResponse
import ai.llamaindex.llamacloudadmin.services.blocking.admin.UsageMetricService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface UsageMetricService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageMetricService

    /**
     * Aggregate usage metrics by one or more dimensions, reporting total credits used. Global admin only.
     *
     * A date range is required, which bounds the scan via the `day`-leading index. Supplying `organization_id` narrows it further via the `(organization_id, day)` index.
     *
     * Supported `group_by` dimensions: `day`, `organization_id`, `project_id`, `event_type`, `user_id`. Buckets are ordered by total credits descending.
     */
    fun aggregate(params: UsageMetricAggregateParams): UsageMetricAggregateResponse =
        aggregate(
          params, RequestOptions.none()
        )

    /** @see aggregate */
    fun aggregate(params: UsageMetricAggregateParams, requestOptions: RequestOptions = RequestOptions.none()): UsageMetricAggregateResponse

    /** A view of [UsageMetricService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageMetricService.WithRawResponse

        /** Returns a raw HTTP response for `get /api/v1/admin/usage-metrics/aggregate`, but is otherwise the             same as [UsageMetricService.aggregate]. */
        @MustBeClosed
        fun aggregate(params: UsageMetricAggregateParams): HttpResponseFor<UsageMetricAggregateResponse> =
            aggregate(
              params, RequestOptions.none()
            )

        /** @see aggregate */
        @MustBeClosed
        fun aggregate(params: UsageMetricAggregateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<UsageMetricAggregateResponse>
    }
}
