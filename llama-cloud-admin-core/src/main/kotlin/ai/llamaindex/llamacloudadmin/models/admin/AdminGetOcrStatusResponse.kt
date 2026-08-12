// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin

import ai.llamaindex.llamacloudadmin.core.Enum
import ai.llamaindex.llamacloudadmin.core.ExcludeMissing
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.JsonMissing
import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.errors.LlamaCloudAdminInvalidDataException
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetOcrStatusResponse
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response model for OCR service health/GPU status. */
class AdminGetOcrStatusResponse @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
    private val status: JsonField<Status>,
    private val device: JsonField<String>,
    private val errorMessage: JsonField<String>,
    private val gpuAvailable: JsonField<Boolean>,
    private val gpuDeviceCount: JsonField<Long>,
    private val gpuDeviceName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("device") @ExcludeMissing device: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_message") @ExcludeMissing errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("gpu_available") @ExcludeMissing gpuAvailable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("gpu_device_count") @ExcludeMissing gpuDeviceCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("gpu_device_name") @ExcludeMissing gpuDeviceName: JsonField<String> = JsonMissing.of()
    ) : this(
      status,
      device,
      errorMessage,
      gpuAvailable,
      gpuDeviceCount,
      gpuDeviceName,
      mutableMapOf(),
    )

    /** @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun status(): Status = status.getRequired("status")

    /** @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
    fun device(): Optional<String> = device.getOptional("device")

    /** @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

    /** @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
    fun gpuAvailable(): Optional<Boolean> = gpuAvailable.getOptional("gpu_available")

    /** @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
    fun gpuDeviceCount(): Optional<Long> = gpuDeviceCount.getOptional("gpu_device_count")

    /** @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value). */
    fun gpuDeviceName(): Optional<String> = gpuDeviceName.getOptional("gpu_device_name")

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [device].
     *
     * Unlike [device], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device")
    @ExcludeMissing
    fun _device(): JsonField<String> = device

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [gpuAvailable].
     *
     * Unlike [gpuAvailable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gpu_available")
    @ExcludeMissing
    fun _gpuAvailable(): JsonField<Boolean> = gpuAvailable

    /**
     * Returns the raw JSON value of [gpuDeviceCount].
     *
     * Unlike [gpuDeviceCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gpu_device_count")
    @ExcludeMissing
    fun _gpuDeviceCount(): JsonField<Long> = gpuDeviceCount

    /**
     * Returns the raw JSON value of [gpuDeviceName].
     *
     * Unlike [gpuDeviceName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gpu_device_name")
    @ExcludeMissing
    fun _gpuDeviceName(): JsonField<String> = gpuDeviceName

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
         * Returns a mutable builder for constructing an instance of [AdminGetOcrStatusResponse].
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

    /** A builder for [AdminGetOcrStatusResponse]. */
    class Builder internal constructor() {

        private var status: JsonField<Status>? = null
        private var device: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var gpuAvailable: JsonField<Boolean> = JsonMissing.of()
        private var gpuDeviceCount: JsonField<Long> = JsonMissing.of()
        private var gpuDeviceName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(adminGetOcrStatusResponse: AdminGetOcrStatusResponse) =
            apply {
                status = adminGetOcrStatusResponse.status
                device = adminGetOcrStatusResponse.device
                errorMessage = adminGetOcrStatusResponse.errorMessage
                gpuAvailable = adminGetOcrStatusResponse.gpuAvailable
                gpuDeviceCount = adminGetOcrStatusResponse.gpuDeviceCount
                gpuDeviceName = adminGetOcrStatusResponse.gpuDeviceName
                additionalProperties = adminGetOcrStatusResponse.additionalProperties.toMutableMap()
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

        fun device(device: String) = device(JsonField.of(device))

        /**
         * Sets [Builder.device] to an arbitrary JSON value.
         *
         * You should usually call [Builder.device] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun device(device: JsonField<String>) =
            apply {
                this.device = device
            }

        fun errorMessage(errorMessage: String?) = errorMessage(JsonField.ofNullable(errorMessage))

        /** Alias for calling [Builder.errorMessage] with `errorMessage.orElse(null)`. */
        fun errorMessage(errorMessage: Optional<String>) = errorMessage(errorMessage.getOrNull())

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun errorMessage(errorMessage: JsonField<String>) =
            apply {
                this.errorMessage = errorMessage
            }

        fun gpuAvailable(gpuAvailable: Boolean) = gpuAvailable(JsonField.of(gpuAvailable))

        /**
         * Sets [Builder.gpuAvailable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gpuAvailable] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gpuAvailable(gpuAvailable: JsonField<Boolean>) =
            apply {
                this.gpuAvailable = gpuAvailable
            }

        fun gpuDeviceCount(gpuDeviceCount: Long?) = gpuDeviceCount(JsonField.ofNullable(gpuDeviceCount))

        /**
         * Alias for [Builder.gpuDeviceCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun gpuDeviceCount(gpuDeviceCount: Long) = gpuDeviceCount(gpuDeviceCount as Long?)

        /** Alias for calling [Builder.gpuDeviceCount] with `gpuDeviceCount.orElse(null)`. */
        fun gpuDeviceCount(gpuDeviceCount: Optional<Long>) = gpuDeviceCount(gpuDeviceCount.getOrNull())

        /**
         * Sets [Builder.gpuDeviceCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gpuDeviceCount] with a well-typed [Long] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gpuDeviceCount(gpuDeviceCount: JsonField<Long>) =
            apply {
                this.gpuDeviceCount = gpuDeviceCount
            }

        fun gpuDeviceName(gpuDeviceName: String?) = gpuDeviceName(JsonField.ofNullable(gpuDeviceName))

        /** Alias for calling [Builder.gpuDeviceName] with `gpuDeviceName.orElse(null)`. */
        fun gpuDeviceName(gpuDeviceName: Optional<String>) = gpuDeviceName(gpuDeviceName.getOrNull())

        /**
         * Sets [Builder.gpuDeviceName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gpuDeviceName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gpuDeviceName(gpuDeviceName: JsonField<String>) =
            apply {
                this.gpuDeviceName = gpuDeviceName
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
         * Returns an immutable instance of [AdminGetOcrStatusResponse].
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
        fun build(): AdminGetOcrStatusResponse =
            AdminGetOcrStatusResponse(
              checkRequired(
                "status", status
              ),
              device,
              errorMessage,
              gpuAvailable,
              gpuDeviceCount,
              gpuDeviceName,
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
    fun validate(): AdminGetOcrStatusResponse =
        apply {
            if (validated) {
              return@apply
            }

            status().validate()
            device()
            errorMessage()
            gpuAvailable()
            gpuDeviceCount()
            gpuDeviceName()
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
    internal fun validity(): Int = (status.asKnown().getOrNull()?.validity() ?: 0) + (if (device.asKnown().isPresent) 1 else 0) + (if (errorMessage.asKnown().isPresent) 1 else 0) + (if (gpuAvailable.asKnown().isPresent) 1 else 0) + (if (gpuDeviceCount.asKnown().isPresent) 1 else 0) + (if (gpuDeviceName.asKnown().isPresent) 1 else 0)

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

            @JvmField val DEGRADED = of("degraded")

            @JvmField val OK = of("ok")

            @JvmField val UNAVAILABLE = of("unavailable")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DEGRADED,
            OK,
            UNAVAILABLE,
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
            DEGRADED,
            OK,
            UNAVAILABLE,
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
                DEGRADED -> Value.DEGRADED
                OK -> Value.OK
                UNAVAILABLE -> Value.UNAVAILABLE
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
                DEGRADED -> Known.DEGRADED
                OK -> Known.OK
                UNAVAILABLE -> Known.UNAVAILABLE
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

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is AdminGetOcrStatusResponse && status == other.status && device == other.device && errorMessage == other.errorMessage && gpuAvailable == other.gpuAvailable && gpuDeviceCount == other.gpuDeviceCount && gpuDeviceName == other.gpuDeviceName && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(status, device, errorMessage, gpuAvailable, gpuDeviceCount, gpuDeviceName, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "AdminGetOcrStatusResponse{status=$status, device=$device, errorMessage=$errorMessage, gpuAvailable=$gpuAvailable, gpuDeviceCount=$gpuDeviceCount, gpuDeviceName=$gpuDeviceName, additionalProperties=$additionalProperties}"
}
