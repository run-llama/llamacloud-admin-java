// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations

import ai.llamaindex.llamacloudadmin.core.AutoPager
import ai.llamaindex.llamacloudadmin.core.Page
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.services.blocking.OrganizationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see OrganizationService.list */
class OrganizationListPage
private constructor(
    private val service: OrganizationService,
    private val params: OrganizationListParams,
    private val response: OrganizationListPageResponse,
) : Page<Organization> {

    /**
     * Delegates to [OrganizationListPageResponse], but gracefully handles missing data.
     *
     * @see OrganizationListPageResponse.items
     */
    override fun items(): List<Organization> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [OrganizationListPageResponse], but gracefully handles missing data.
     *
     * @see OrganizationListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): OrganizationListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): OrganizationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Organization> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OrganizationListParams = params

    /** The response that this page was parsed from. */
    fun response(): OrganizationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrganizationListPage].
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

    /** A builder for [OrganizationListPage]. */
    class Builder internal constructor() {

        private var service: OrganizationService? = null
        private var params: OrganizationListParams? = null
        private var response: OrganizationListPageResponse? = null

        @JvmSynthetic
        internal fun from(organizationListPage: OrganizationListPage) = apply {
            service = organizationListPage.service
            params = organizationListPage.params
            response = organizationListPage.response
        }

        fun service(service: OrganizationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OrganizationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OrganizationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OrganizationListPage].
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
        fun build(): OrganizationListPage =
            OrganizationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrganizationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "OrganizationListPage{service=$service, params=$params, response=$response}"
}
