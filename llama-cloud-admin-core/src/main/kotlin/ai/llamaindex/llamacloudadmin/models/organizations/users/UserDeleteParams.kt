// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations.users

import ai.llamaindex.llamacloudadmin.core.Params
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.core.http.Headers
import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import ai.llamaindex.llamacloudadmin.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Remove users from an organization. */
class UserDeleteParams private constructor(
    private val organizationId: String,
    private val memberUserId: String?,
    private val body: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    fun organizationId(): String = organizationId

    fun memberUserId(): Optional<String> = Optional.ofNullable(memberUserId)

    fun body(): Optional<List<String>> = Optional.ofNullable(body)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserDeleteParams].
         *
         * The following fields are required:
         *
         * ```java
         * .organizationId()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [UserDeleteParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var memberUserId: String? = null
        private var body: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(userDeleteParams: UserDeleteParams) =
            apply {
                organizationId = userDeleteParams.organizationId
                memberUserId = userDeleteParams.memberUserId
                body = userDeleteParams.body?.toMutableList()
                additionalHeaders = userDeleteParams.additionalHeaders.toBuilder()
                additionalQueryParams = userDeleteParams.additionalQueryParams.toBuilder()
            }

        fun organizationId(organizationId: String) =
            apply {
                this.organizationId = organizationId
            }

        fun memberUserId(memberUserId: String?) =
            apply {
                this.memberUserId = memberUserId
            }

        /** Alias for calling [Builder.memberUserId] with `memberUserId.orElse(null)`. */
        fun memberUserId(memberUserId: Optional<String>) = memberUserId(memberUserId.getOrNull())

        fun body(body: List<String>?) =
            apply {
                this.body = body?.toMutableList()
            }

        /** Alias for calling [Builder.body] with `body.orElse(null)`. */
        fun body(body: Optional<List<String>>) = body(body.getOrNull())

        /**
         * Adds a single [String] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBody(body: String) =
            apply {
                this.body = (this.body ?: mutableListOf()).apply { add(body) }
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        /**
         * Returns an immutable instance of [UserDeleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .organizationId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserDeleteParams =
            UserDeleteParams(
              checkRequired(
                "organizationId", organizationId
              ),
              memberUserId,
              body?.toImmutable(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    fun _body(): Optional<List<String>> = Optional.ofNullable(body)

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> organizationId
            1 -> memberUserId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is UserDeleteParams && organizationId == other.organizationId && memberUserId == other.memberUserId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(organizationId, memberUserId, body, additionalHeaders, additionalQueryParams)

    override fun toString() = "UserDeleteParams{organizationId=$organizationId, memberUserId=$memberUserId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
