// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.invites

import ai.llamaindex.llamacloudadmin.core.AutoPager
import ai.llamaindex.llamacloudadmin.core.Page
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.models.invites.Invite
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMinePageResponse
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMineParams
import ai.llamaindex.llamacloudadmin.services.blocking.InviteService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see InviteService.listMine */
class InviteListMinePage private constructor(
    private val service: InviteService,
    private val params: InviteListMineParams,
    private val response: InviteListMinePageResponse,

) : Page<Invite> {

    /**
     * Delegates to [InviteListMinePageResponse], but gracefully handles missing data.
     *
     * @see InviteListMinePageResponse.items
     */
    override fun items(): List<Invite> = response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [InviteListMinePageResponse], but gracefully handles missing data.
     *
     * @see InviteListMinePageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): InviteListMineParams {
      val nextCursor = nextPageToken().getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
      return params.toBuilder()
          .pageToken(nextCursor)
          .build()
    }

    override fun nextPage(): InviteListMinePage = service.listMine(nextPageParams())

    fun autoPager(): AutoPager<Invite> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InviteListMineParams = params

    /** The response that this page was parsed from. */
    fun response(): InviteListMinePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InviteListMinePage].
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [InviteListMinePage]. */
    class Builder internal constructor() {

        private var service: InviteService? = null
        private var params: InviteListMineParams? = null
        private var response: InviteListMinePageResponse? = null

        @JvmSynthetic
        internal fun from(inviteListMinePage: InviteListMinePage) =
            apply {
                service = inviteListMinePage.service
                params = inviteListMinePage.params
                response = inviteListMinePage.response
            }

        fun service(service: InviteService) =
            apply {
                this.service = service
            }

        /** The parameters that were used to request this page. */
        fun params(params: InviteListMineParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun response(response: InviteListMinePageResponse) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [InviteListMinePage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InviteListMinePage =
            InviteListMinePage(
              checkRequired(
                "service", service
              ),
              checkRequired(
                "params", params
              ),
              checkRequired(
                "response", response
              ),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is InviteListMinePage && service == other.service && params == other.params && response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "InviteListMinePage{service=$service, params=$params, response=$response}"
}
