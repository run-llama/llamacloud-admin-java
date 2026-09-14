// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.quotamanagement

import ai.llamaindex.llamacloudadmin.core.AutoPagerAsync
import ai.llamaindex.llamacloudadmin.core.PageAsync
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.services.async.QuotaManagementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see QuotaManagementServiceAsync.list */
class QuotaManagementListPageAsync
private constructor(
    private val service: QuotaManagementServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: QuotaManagementListParams,
    private val response: QuotaManagementListPageResponse,
) : PageAsync<QuotaConfiguration> {

    /**
     * Delegates to [QuotaManagementListPageResponse], but gracefully handles missing data.
     *
     * @see QuotaManagementListPageResponse.items
     */
    override fun items(): List<QuotaConfiguration> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [QuotaManagementListPageResponse], but gracefully handles missing data.
     *
     * @see QuotaManagementListPageResponse.pages
     */
    fun pages(): Optional<Long> = response._pages().getOptional("pages")

    /**
     * Delegates to [QuotaManagementListPageResponse], but gracefully handles missing data.
     *
     * @see QuotaManagementListPageResponse.page
     */
    fun page(): Optional<Long> = response._page().getOptional("page")

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber = page().getOrDefault(1)
        val pageCount = pages().getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): QuotaManagementListParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<QuotaManagementListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<QuotaConfiguration> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): QuotaManagementListParams = params

    /** The response that this page was parsed from. */
    fun response(): QuotaManagementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [QuotaManagementListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QuotaManagementListPageAsync]. */
    class Builder internal constructor() {

        private var service: QuotaManagementServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: QuotaManagementListParams? = null
        private var response: QuotaManagementListPageResponse? = null

        @JvmSynthetic
        internal fun from(quotaManagementListPageAsync: QuotaManagementListPageAsync) = apply {
            service = quotaManagementListPageAsync.service
            streamHandlerExecutor = quotaManagementListPageAsync.streamHandlerExecutor
            params = quotaManagementListPageAsync.params
            response = quotaManagementListPageAsync.response
        }

        fun service(service: QuotaManagementServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: QuotaManagementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: QuotaManagementListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [QuotaManagementListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QuotaManagementListPageAsync =
            QuotaManagementListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuotaManagementListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "QuotaManagementListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
