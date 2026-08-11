// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations

import ai.llamaindex.llamacloudadmin.core.Params
import ai.llamaindex.llamacloudadmin.core.http.Headers
import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get usage for a specific organization. */
class OrganizationGetUsageParams
private constructor(
    private val organizationId: String?,
    private val getCurrentInvoiceTotal: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun getCurrentInvoiceTotal(): Optional<Boolean> = Optional.ofNullable(getCurrentInvoiceTotal)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OrganizationGetUsageParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [OrganizationGetUsageParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrganizationGetUsageParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var getCurrentInvoiceTotal: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(organizationGetUsageParams: OrganizationGetUsageParams) = apply {
            organizationId = organizationGetUsageParams.organizationId
            getCurrentInvoiceTotal = organizationGetUsageParams.getCurrentInvoiceTotal
            additionalHeaders = organizationGetUsageParams.additionalHeaders.toBuilder()
            additionalQueryParams = organizationGetUsageParams.additionalQueryParams.toBuilder()
        }

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun getCurrentInvoiceTotal(getCurrentInvoiceTotal: Boolean?) = apply {
            this.getCurrentInvoiceTotal = getCurrentInvoiceTotal
        }

        /**
         * Alias for [Builder.getCurrentInvoiceTotal].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun getCurrentInvoiceTotal(getCurrentInvoiceTotal: Boolean) =
            getCurrentInvoiceTotal(getCurrentInvoiceTotal as Boolean?)

        /**
         * Alias for calling [Builder.getCurrentInvoiceTotal] with
         * `getCurrentInvoiceTotal.orElse(null)`.
         */
        fun getCurrentInvoiceTotal(getCurrentInvoiceTotal: Optional<Boolean>) =
            getCurrentInvoiceTotal(getCurrentInvoiceTotal.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [OrganizationGetUsageParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OrganizationGetUsageParams =
            OrganizationGetUsageParams(
                organizationId,
                getCurrentInvoiceTotal,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> organizationId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                getCurrentInvoiceTotal?.let { put("get_current_invoice_total", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrganizationGetUsageParams &&
            organizationId == other.organizationId &&
            getCurrentInvoiceTotal == other.getCurrentInvoiceTotal &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            organizationId,
            getCurrentInvoiceTotal,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "OrganizationGetUsageParams{organizationId=$organizationId, getCurrentInvoiceTotal=$getCurrentInvoiceTotal, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
