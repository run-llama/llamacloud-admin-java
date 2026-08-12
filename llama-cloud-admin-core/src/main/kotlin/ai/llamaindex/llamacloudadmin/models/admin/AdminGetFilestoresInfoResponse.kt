// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin

import ai.llamaindex.llamacloudadmin.core.Enum
import ai.llamaindex.llamacloudadmin.core.ExcludeMissing
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.JsonMissing
import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.core.toImmutable
import ai.llamaindex.llamacloudadmin.errors.LlamaCloudAdminInvalidDataException
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetFilestoresInfoResponse
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AdminGetFilestoresInfoResponse @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
    private val status: JsonField<Status>,
    private val availableBuckets: JsonField<AvailableBuckets>,
    private val unavailableBuckets: JsonField<UnavailableBuckets>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("available_buckets") @ExcludeMissing availableBuckets: JsonField<AvailableBuckets> = JsonMissing.of(),
        @JsonProperty("unavailable_buckets") @ExcludeMissing unavailableBuckets: JsonField<UnavailableBuckets> = JsonMissing.of()
    ) : this(
      status,
      availableBuckets,
      unavailableBuckets,
      mutableMapOf(),
    )

    /** @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun status(): Status = status.getRequired("status")

    /** @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
    fun availableBuckets(): Optional<AvailableBuckets> = availableBuckets.getOptional("available_buckets")

    /** @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
    fun unavailableBuckets(): Optional<UnavailableBuckets> = unavailableBuckets.getOptional("unavailable_buckets")

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [availableBuckets].
     *
     * Unlike [availableBuckets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("available_buckets")
    @ExcludeMissing
    fun _availableBuckets(): JsonField<AvailableBuckets> = availableBuckets

    /**
     * Returns the raw JSON value of [unavailableBuckets].
     *
     * Unlike [unavailableBuckets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unavailable_buckets")
    @ExcludeMissing
    fun _unavailableBuckets(): JsonField<UnavailableBuckets> = unavailableBuckets

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
         * Returns a mutable builder for constructing an instance of [AdminGetFilestoresInfoResponse].
         *
         * The following fields are required:
         *
         * ```java
         * .status()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [AdminGetFilestoresInfoResponse]. */
    class Builder internal constructor() {

        private var status: JsonField<Status>? = null
        private var availableBuckets: JsonField<AvailableBuckets> = JsonMissing.of()
        private var unavailableBuckets: JsonField<UnavailableBuckets> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(adminGetFilestoresInfoResponse: AdminGetFilestoresInfoResponse) =
            apply {
                status = adminGetFilestoresInfoResponse.status
                availableBuckets = adminGetFilestoresInfoResponse.availableBuckets
                unavailableBuckets = adminGetFilestoresInfoResponse.unavailableBuckets
                additionalProperties = adminGetFilestoresInfoResponse.additionalProperties.toMutableMap()
            }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<Status>) =
            apply {
                this.status = status
            }

        fun availableBuckets(availableBuckets: AvailableBuckets) = availableBuckets(JsonField.of(availableBuckets))

        /**
         * Sets [Builder.availableBuckets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableBuckets] with a well-typed [AvailableBuckets] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun availableBuckets(availableBuckets: JsonField<AvailableBuckets>) =
            apply {
                this.availableBuckets = availableBuckets
            }

        fun unavailableBuckets(unavailableBuckets: UnavailableBuckets) = unavailableBuckets(JsonField.of(unavailableBuckets))

        /**
         * Sets [Builder.unavailableBuckets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unavailableBuckets] with a well-typed [UnavailableBuckets] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unavailableBuckets(unavailableBuckets: JsonField<UnavailableBuckets>) =
            apply {
                this.unavailableBuckets = unavailableBuckets
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
         * Returns an immutable instance of [AdminGetFilestoresInfoResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AdminGetFilestoresInfoResponse =
            AdminGetFilestoresInfoResponse(
              checkRequired(
                "status", status
              ),
              availableBuckets,
              unavailableBuckets,
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
    fun validate(): AdminGetFilestoresInfoResponse =
        apply {
            if (validated) {
              return@apply
            }

            status().validate()
            availableBuckets().ifPresent { it.validate() }
            unavailableBuckets().ifPresent { it.validate() }
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
    internal fun validity(): Int = (status.asKnown().getOrNull()?.validity() ?: 0) + (availableBuckets.asKnown().getOrNull()?.validity() ?: 0) + (unavailableBuckets.asKnown().getOrNull()?.validity() ?: 0)

    class Status @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't match any known
         * member, and you want to know that value. For example, if the SDK is on an older version than the
         * API, then the API may respond with new members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            @JvmField val MISSING_BUCKETS = of("missing_buckets")

            @JvmField val MISSING_CREDENTIALS = of("missing_credentials")

            @JvmField val OK = of("ok")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            MISSING_BUCKETS,
            MISSING_CREDENTIALS,
            OK,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
         *   an older version than the API, then the API may respond with new members that the SDK is unaware
         *   of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MISSING_BUCKETS,
            MISSING_CREDENTIALS,
            OK,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
         * class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want to throw
         * for the unknown case.
         */
        fun value(): Value =
            when (this) {
                MISSING_BUCKETS -> Value.MISSING_BUCKETS
                MISSING_CREDENTIALS -> Value.MISSING_CREDENTIALS
                OK -> Value.OK
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
         * for the unknown case.
         *
         * @throws LlamaCloudAdminInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                MISSING_BUCKETS -> Known.MISSING_BUCKETS
                MISSING_CREDENTIALS -> Known.MISSING_CREDENTIALS
                OK -> Known.OK
                else -> throw LlamaCloudAdminInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging and generally
         * doesn't throw.
         *
         * @throws LlamaCloudAdminInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { LlamaCloudAdminInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudAdminInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Status =
            apply {
                if (validated) {
                  return@apply
                }

                known()
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
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class AvailableBuckets @JsonCreator private constructor(
        @com.fasterxml.jackson.annotation.JsonValue private val additionalProperties: Map<String, JsonValue>,

    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [AvailableBuckets]. */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [AvailableBuckets]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(availableBuckets: AvailableBuckets) =
                apply {
                    additionalProperties = availableBuckets.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [AvailableBuckets].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AvailableBuckets = AvailableBuckets(additionalProperties.toImmutable())
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
        fun validate(): AvailableBuckets =
            apply {
                if (validated) {
                  return@apply
                }

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
        internal fun validity(): Int = additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is AvailableBuckets && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "AvailableBuckets{additionalProperties=$additionalProperties}"
    }

    class UnavailableBuckets @JsonCreator private constructor(
        @com.fasterxml.jackson.annotation.JsonValue private val additionalProperties: Map<String, JsonValue>,

    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [UnavailableBuckets]. */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [UnavailableBuckets]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unavailableBuckets: UnavailableBuckets) =
                apply {
                    additionalProperties = unavailableBuckets.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [UnavailableBuckets].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnavailableBuckets = UnavailableBuckets(additionalProperties.toImmutable())
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
        fun validate(): UnavailableBuckets =
            apply {
                if (validated) {
                  return@apply
                }

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
        internal fun validity(): Int = additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is UnavailableBuckets && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "UnavailableBuckets{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is AdminGetFilestoresInfoResponse && status == other.status && availableBuckets == other.availableBuckets && unavailableBuckets == other.unavailableBuckets && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(status, availableBuckets, unavailableBuckets, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "AdminGetFilestoresInfoResponse{status=$status, availableBuckets=$availableBuckets, unavailableBuckets=$unavailableBuckets, additionalProperties=$additionalProperties}"
}
