// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.apikeys

import ai.llamaindex.llamacloudadmin.core.ExcludeMissing
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.JsonMissing
import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.errors.LlamaCloudAdminInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Confirmation that a resource was deleted. */
class ApiKeyDeleteResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cacheTtlSeconds: JsonField<Long>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cache_ttl_seconds")
        @ExcludeMissing
        cacheTtlSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(cacheTtlSeconds, success, mutableMapOf())

    /**
     * Maximum seconds until cached information expires
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cacheTtlSeconds(): Long = cacheTtlSeconds.getRequired("cache_ttl_seconds")

    /**
     * Whether the resource was deleted
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * Returns the raw JSON value of [cacheTtlSeconds].
     *
     * Unlike [cacheTtlSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cache_ttl_seconds")
    @ExcludeMissing
    fun _cacheTtlSeconds(): JsonField<Long> = cacheTtlSeconds

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ApiKeyDeleteResponse].
         *
         * The following fields are required:
         * ```java
         * .cacheTtlSeconds()
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiKeyDeleteResponse]. */
    class Builder internal constructor() {

        private var cacheTtlSeconds: JsonField<Long>? = null
        private var success: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiKeyDeleteResponse: ApiKeyDeleteResponse) = apply {
            cacheTtlSeconds = apiKeyDeleteResponse.cacheTtlSeconds
            success = apiKeyDeleteResponse.success
            additionalProperties = apiKeyDeleteResponse.additionalProperties.toMutableMap()
        }

        /** Maximum seconds until cached information expires */
        fun cacheTtlSeconds(cacheTtlSeconds: Long) = cacheTtlSeconds(JsonField.of(cacheTtlSeconds))

        /**
         * Sets [Builder.cacheTtlSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cacheTtlSeconds] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cacheTtlSeconds(cacheTtlSeconds: JsonField<Long>) = apply {
            this.cacheTtlSeconds = cacheTtlSeconds
        }

        /** Whether the resource was deleted */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [ApiKeyDeleteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cacheTtlSeconds()
         * .success()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiKeyDeleteResponse =
            ApiKeyDeleteResponse(
                checkRequired("cacheTtlSeconds", cacheTtlSeconds),
                checkRequired("success", success),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LlamaCloudAdminInvalidDataException if any value type in this object doesn't match
     *   its expected type.
     */
    fun validate(): ApiKeyDeleteResponse = apply {
        if (validated) {
            return@apply
        }

        cacheTtlSeconds()
        success()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LlamaCloudAdminInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (cacheTtlSeconds.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiKeyDeleteResponse &&
            cacheTtlSeconds == other.cacheTtlSeconds &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(cacheTtlSeconds, success, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiKeyDeleteResponse{cacheTtlSeconds=$cacheTtlSeconds, success=$success, additionalProperties=$additionalProperties}"
}
