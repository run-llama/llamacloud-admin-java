// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.quotamanagement

import ai.llamaindex.llamacloudadmin.core.AutoPager
import ai.llamaindex.llamacloudadmin.core.Page
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.services.blocking.QuotaManagementService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see QuotaManagementService.list */
class QuotaManagementListPage
private constructor(
    private val service: QuotaManagementService,
    private val params: QuotaManagementListParams,
    private val response: QuotaManagementListPageResponse,
) : Page<QuotaConfiguration> {

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

    override fun nextPage(): QuotaManagementListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<QuotaConfiguration> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): QuotaManagementListParams = params

    /** The response that this page was parsed from. */
    fun response(): QuotaManagementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [QuotaManagementListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QuotaManagementListPage]. */
    class Builder internal constructor() {

        private var service: QuotaManagementService? = null
        private var params: QuotaManagementListParams? = null
        private var response: QuotaManagementListPageResponse? = null

        @JvmSynthetic
        internal fun from(quotaManagementListPage: QuotaManagementListPage) = apply {
            service = quotaManagementListPage.service
            params = quotaManagementListPage.params
            response = quotaManagementListPage.response
        }

        fun service(service: QuotaManagementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: QuotaManagementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: QuotaManagementListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [QuotaManagementListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QuotaManagementListPage =
            QuotaManagementListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuotaManagementListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "QuotaManagementListPage{service=$service, params=$params, response=$response}"
}
