// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin

import ai.llamaindex.llamacloudadmin.core.ExcludeMissing
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.JsonMissing
import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.checkKnown
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.core.toImmutable
import ai.llamaindex.llamacloudadmin.errors.LlamaCloudAdminInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AdminGetLicenseInfoResponse @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
    private val expiresAt: JsonField<OffsetDateTime>,
    private val status: JsonField<String>,
    private val message: JsonField<String>,
    private val scopes: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("expires_at") @ExcludeMissing expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scopes") @ExcludeMissing scopes: JsonField<List<String>> = JsonMissing.of()
    ) : this(
      expiresAt,
      status,
      message,
      scopes,
      mutableMapOf(),
    )

    /**
     * License expiration date
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /**
     * License validation status
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * License message
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * License scopes
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun scopes(): Optional<List<String>> = scopes.getOptional("scopes")

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message")
    @ExcludeMissing
    fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [scopes].
     *
     * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopes")
    @ExcludeMissing
    fun _scopes(): JsonField<List<String>> = scopes

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
      additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AdminGetLicenseInfoResponse].
         *
         * The following fields are required:
         *
         * ```java
         * .expiresAt()
         * .status()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [AdminGetLicenseInfoResponse]. */
    class Builder internal constructor() {

        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<String>? = null
        private var message: JsonField<String> = JsonMissing.of()
        private var scopes: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(adminGetLicenseInfoResponse: AdminGetLicenseInfoResponse) =
            apply {
                expiresAt = adminGetLicenseInfoResponse.expiresAt
                status = adminGetLicenseInfoResponse.status
                message = adminGetLicenseInfoResponse.message
                scopes = adminGetLicenseInfoResponse.scopes.map { it.toMutableList() }
                additionalProperties = adminGetLicenseInfoResponse.additionalProperties.toMutableMap()
            }

        /** License expiration date */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) =
            apply {
                this.expiresAt = expiresAt
            }

        /** License validation status */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<String>) =
            apply {
                this.status = status
            }

        /** License message */
        fun message(message: String?) = message(JsonField.ofNullable(message))

        /** Alias for calling [Builder.message] with `message.orElse(null)`. */
        fun message(message: Optional<String>) = message(message.getOrNull())

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun message(message: JsonField<String>) =
            apply {
                this.message = message
            }

        /** License scopes */
        fun scopes(scopes: List<String>?) = scopes(JsonField.ofNullable(scopes))

        /** Alias for calling [Builder.scopes] with `scopes.orElse(null)`. */
        fun scopes(scopes: Optional<List<String>>) = scopes(scopes.getOrNull())

        /**
         * Sets [Builder.scopes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopes] with a well-typed `List<String>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scopes(scopes: JsonField<List<String>>) =
            apply {
                this.scopes = scopes.map { it.toMutableList() }
            }

        /**
         * Adds a single [String] to [scopes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScope(scope: String) =
            apply {
                scopes = (scopes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scopes", it).add(scope)
                }
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        /**
         * Returns an immutable instance of [AdminGetLicenseInfoResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .expiresAt()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AdminGetLicenseInfoResponse =
            AdminGetLicenseInfoResponse(
              checkRequired(
                "expiresAt", expiresAt
              ),
              checkRequired(
                "status", status
              ),
              message,
              (scopes?: JsonMissing.of()).map { it.toImmutable() },
              additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LlamaCloudAdminInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AdminGetLicenseInfoResponse =
        apply {
            if (validated) {
              return@apply
            }

            expiresAt()
            status()
            message()
            scopes()
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
    internal fun validity(): Int = (if (expiresAt.asKnown().isPresent) 1 else 0) + (if (status.asKnown().isPresent) 1 else 0) + (if (message.asKnown().isPresent) 1 else 0) + (scopes.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is AdminGetLicenseInfoResponse && expiresAt == other.expiresAt && status == other.status && message == other.message && scopes == other.scopes && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(expiresAt, status, message, scopes, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "AdminGetLicenseInfoResponse{expiresAt=$expiresAt, status=$status, message=$message, scopes=$scopes, additionalProperties=$additionalProperties}"
}
