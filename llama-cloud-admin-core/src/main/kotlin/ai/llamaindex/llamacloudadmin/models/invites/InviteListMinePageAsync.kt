// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.invites

import ai.llamaindex.llamacloudadmin.core.AutoPagerAsync
import ai.llamaindex.llamacloudadmin.core.PageAsync
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.services.async.InviteServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see InviteServiceAsync.listMine */
class InviteListMinePageAsync
private constructor(
    private val service: InviteServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: InviteListMineParams,
    private val response: InviteListMinePageResponse,
) : PageAsync<Invite> {

    /**
     * Delegates to [InviteListMinePageResponse], but gracefully handles missing data.
     *
     * @see InviteListMinePageResponse.items
     */
    override fun items(): List<Invite> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [InviteListMinePageResponse], but gracefully handles missing data.
     *
     * @see InviteListMinePageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): InviteListMineParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<InviteListMinePageAsync> =
        service.listMine(nextPageParams())

    fun autoPager(): AutoPagerAsync<Invite> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): InviteListMineParams = params

    /** The response that this page was parsed from. */
    fun response(): InviteListMinePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InviteListMinePageAsync].
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

    /** A builder for [InviteListMinePageAsync]. */
    class Builder internal constructor() {

        private var service: InviteServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: InviteListMineParams? = null
        private var response: InviteListMinePageResponse? = null

        @JvmSynthetic
        internal fun from(inviteListMinePageAsync: InviteListMinePageAsync) = apply {
            service = inviteListMinePageAsync.service
            streamHandlerExecutor = inviteListMinePageAsync.streamHandlerExecutor
            params = inviteListMinePageAsync.params
            response = inviteListMinePageAsync.response
        }

        fun service(service: InviteServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: InviteListMineParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InviteListMinePageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InviteListMinePageAsync].
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
        fun build(): InviteListMinePageAsync =
            InviteListMinePageAsync(
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

        return other is InviteListMinePageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "InviteListMinePageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
