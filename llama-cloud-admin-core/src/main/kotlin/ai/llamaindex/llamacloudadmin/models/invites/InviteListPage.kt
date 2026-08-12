// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.invites

import ai.llamaindex.llamacloudadmin.core.AutoPager
import ai.llamaindex.llamacloudadmin.core.Page
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.services.blocking.InviteService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see InviteService.list */
class InviteListPage
private constructor(
    private val service: InviteService,
    private val params: InviteListParams,
    private val response: InviteListPageResponse,
) : Page<Invite> {

    /**
     * Delegates to [InviteListPageResponse], but gracefully handles missing data.
     *
     * @see InviteListPageResponse.items
     */
    override fun items(): List<Invite> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [InviteListPageResponse], but gracefully handles missing data.
     *
     * @see InviteListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): InviteListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): InviteListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Invite> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InviteListParams = params

    /** The response that this page was parsed from. */
    fun response(): InviteListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InviteListPage].
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

    /** A builder for [InviteListPage]. */
    class Builder internal constructor() {

        private var service: InviteService? = null
        private var params: InviteListParams? = null
        private var response: InviteListPageResponse? = null

        @JvmSynthetic
        internal fun from(inviteListPage: InviteListPage) = apply {
            service = inviteListPage.service
            params = inviteListPage.params
            response = inviteListPage.response
        }

        fun service(service: InviteService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InviteListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InviteListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InviteListPage].
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
        fun build(): InviteListPage =
            InviteListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InviteListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "InviteListPage{service=$service, params=$params, response=$response}"
}
