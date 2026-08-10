// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin

import ai.llamaindex.llamacloudadmin.core.Enum
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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AdminGetLlamaextractFeaturesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val availableModes: JsonField<List<AvailableMode>>,
    private val schemaGeneration: JsonField<SchemaGeneration>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("available_modes")
        @ExcludeMissing
        availableModes: JsonField<List<AvailableMode>> = JsonMissing.of(),
        @JsonProperty("schema_generation")
        @ExcludeMissing
        schemaGeneration: JsonField<SchemaGeneration> = JsonMissing.of(),
    ) : this(availableModes, schemaGeneration, mutableMapOf())

    /**
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun availableModes(): List<AvailableMode> = availableModes.getRequired("available_modes")

    /**
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun schemaGeneration(): SchemaGeneration = schemaGeneration.getRequired("schema_generation")

    /**
     * Returns the raw JSON value of [availableModes].
     *
     * Unlike [availableModes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("available_modes")
    @ExcludeMissing
    fun _availableModes(): JsonField<List<AvailableMode>> = availableModes

    /**
     * Returns the raw JSON value of [schemaGeneration].
     *
     * Unlike [schemaGeneration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("schema_generation")
    @ExcludeMissing
    fun _schemaGeneration(): JsonField<SchemaGeneration> = schemaGeneration

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
         * Returns a mutable builder for constructing an instance of
         * [AdminGetLlamaextractFeaturesResponse].
         *
         * The following fields are required:
         * ```java
         * .availableModes()
         * .schemaGeneration()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AdminGetLlamaextractFeaturesResponse]. */
    class Builder internal constructor() {

        private var availableModes: JsonField<MutableList<AvailableMode>>? = null
        private var schemaGeneration: JsonField<SchemaGeneration>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            adminGetLlamaextractFeaturesResponse: AdminGetLlamaextractFeaturesResponse
        ) = apply {
            availableModes =
                adminGetLlamaextractFeaturesResponse.availableModes.map { it.toMutableList() }
            schemaGeneration = adminGetLlamaextractFeaturesResponse.schemaGeneration
            additionalProperties =
                adminGetLlamaextractFeaturesResponse.additionalProperties.toMutableMap()
        }

        fun availableModes(availableModes: List<AvailableMode>) =
            availableModes(JsonField.of(availableModes))

        /**
         * Sets [Builder.availableModes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableModes] with a well-typed `List<AvailableMode>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun availableModes(availableModes: JsonField<List<AvailableMode>>) = apply {
            this.availableModes = availableModes.map { it.toMutableList() }
        }

        /**
         * Adds a single [AvailableMode] to [availableModes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAvailableMode(availableMode: AvailableMode) = apply {
            availableModes =
                (availableModes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("availableModes", it).add(availableMode)
                }
        }

        fun schemaGeneration(schemaGeneration: SchemaGeneration) =
            schemaGeneration(JsonField.of(schemaGeneration))

        /**
         * Sets [Builder.schemaGeneration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schemaGeneration] with a well-typed [SchemaGeneration]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun schemaGeneration(schemaGeneration: JsonField<SchemaGeneration>) = apply {
            this.schemaGeneration = schemaGeneration
        }

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
         * Returns an immutable instance of [AdminGetLlamaextractFeaturesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .availableModes()
         * .schemaGeneration()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AdminGetLlamaextractFeaturesResponse =
            AdminGetLlamaextractFeaturesResponse(
                checkRequired("availableModes", availableModes).map { it.toImmutable() },
                checkRequired("schemaGeneration", schemaGeneration),
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
    fun validate(): AdminGetLlamaextractFeaturesResponse = apply {
        if (validated) {
            return@apply
        }

        availableModes().forEach { it.validate() }
        schemaGeneration().validate()
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
        (availableModes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (schemaGeneration.asKnown().getOrNull()?.validity() ?: 0)

    class AvailableMode
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val mode: JsonField<String>,
        private val parseMode: JsonField<String>,
        private val status: JsonField<Status>,
        private val availableExtractModels: JsonField<List<String>>,
        private val availableParseModels: JsonField<List<String>>,
        private val missingExtractModels: JsonField<List<String>>,
        private val missingParseModels: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parse_mode")
            @ExcludeMissing
            parseMode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("available_extract_models")
            @ExcludeMissing
            availableExtractModels: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("available_parse_models")
            @ExcludeMissing
            availableParseModels: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("missing_extract_models")
            @ExcludeMissing
            missingExtractModels: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("missing_parse_models")
            @ExcludeMissing
            missingParseModels: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            mode,
            parseMode,
            status,
            availableExtractModels,
            availableParseModels,
            missingExtractModels,
            missingParseModels,
            mutableMapOf(),
        )

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun mode(): String = mode.getRequired("mode")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun parseMode(): String = parseMode.getRequired("parse_mode")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun availableExtractModels(): Optional<List<String>> =
            availableExtractModels.getOptional("available_extract_models")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun availableParseModels(): Optional<List<String>> =
            availableParseModels.getOptional("available_parse_models")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missingExtractModels(): Optional<List<String>> =
            missingExtractModels.getOptional("missing_extract_models")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missingParseModels(): Optional<List<String>> =
            missingParseModels.getOptional("missing_parse_models")

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<String> = mode

        /**
         * Returns the raw JSON value of [parseMode].
         *
         * Unlike [parseMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parse_mode") @ExcludeMissing fun _parseMode(): JsonField<String> = parseMode

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [availableExtractModels].
         *
         * Unlike [availableExtractModels], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("available_extract_models")
        @ExcludeMissing
        fun _availableExtractModels(): JsonField<List<String>> = availableExtractModels

        /**
         * Returns the raw JSON value of [availableParseModels].
         *
         * Unlike [availableParseModels], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("available_parse_models")
        @ExcludeMissing
        fun _availableParseModels(): JsonField<List<String>> = availableParseModels

        /**
         * Returns the raw JSON value of [missingExtractModels].
         *
         * Unlike [missingExtractModels], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("missing_extract_models")
        @ExcludeMissing
        fun _missingExtractModels(): JsonField<List<String>> = missingExtractModels

        /**
         * Returns the raw JSON value of [missingParseModels].
         *
         * Unlike [missingParseModels], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("missing_parse_models")
        @ExcludeMissing
        fun _missingParseModels(): JsonField<List<String>> = missingParseModels

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
             * Returns a mutable builder for constructing an instance of [AvailableMode].
             *
             * The following fields are required:
             * ```java
             * .mode()
             * .parseMode()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AvailableMode]. */
        class Builder internal constructor() {

            private var mode: JsonField<String>? = null
            private var parseMode: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var availableExtractModels: JsonField<MutableList<String>>? = null
            private var availableParseModels: JsonField<MutableList<String>>? = null
            private var missingExtractModels: JsonField<MutableList<String>>? = null
            private var missingParseModels: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(availableMode: AvailableMode) = apply {
                mode = availableMode.mode
                parseMode = availableMode.parseMode
                status = availableMode.status
                availableExtractModels =
                    availableMode.availableExtractModels.map { it.toMutableList() }
                availableParseModels = availableMode.availableParseModels.map { it.toMutableList() }
                missingExtractModels = availableMode.missingExtractModels.map { it.toMutableList() }
                missingParseModels = availableMode.missingParseModels.map { it.toMutableList() }
                additionalProperties = availableMode.additionalProperties.toMutableMap()
            }

            fun mode(mode: String) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<String>) = apply { this.mode = mode }

            fun parseMode(parseMode: String) = parseMode(JsonField.of(parseMode))

            /**
             * Sets [Builder.parseMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parseMode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parseMode(parseMode: JsonField<String>) = apply { this.parseMode = parseMode }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun availableExtractModels(availableExtractModels: List<String>) =
                availableExtractModels(JsonField.of(availableExtractModels))

            /**
             * Sets [Builder.availableExtractModels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.availableExtractModels] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun availableExtractModels(availableExtractModels: JsonField<List<String>>) = apply {
                this.availableExtractModels = availableExtractModels.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [availableExtractModels].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAvailableExtractModel(availableExtractModel: String) = apply {
                availableExtractModels =
                    (availableExtractModels ?: JsonField.of(mutableListOf())).also {
                        checkKnown("availableExtractModels", it).add(availableExtractModel)
                    }
            }

            fun availableParseModels(availableParseModels: List<String>) =
                availableParseModels(JsonField.of(availableParseModels))

            /**
             * Sets [Builder.availableParseModels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.availableParseModels] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun availableParseModels(availableParseModels: JsonField<List<String>>) = apply {
                this.availableParseModels = availableParseModels.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [availableParseModels].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAvailableParseModel(availableParseModel: String) = apply {
                availableParseModels =
                    (availableParseModels ?: JsonField.of(mutableListOf())).also {
                        checkKnown("availableParseModels", it).add(availableParseModel)
                    }
            }

            fun missingExtractModels(missingExtractModels: List<String>) =
                missingExtractModels(JsonField.of(missingExtractModels))

            /**
             * Sets [Builder.missingExtractModels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missingExtractModels] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun missingExtractModels(missingExtractModels: JsonField<List<String>>) = apply {
                this.missingExtractModels = missingExtractModels.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [missingExtractModels].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMissingExtractModel(missingExtractModel: String) = apply {
                missingExtractModels =
                    (missingExtractModels ?: JsonField.of(mutableListOf())).also {
                        checkKnown("missingExtractModels", it).add(missingExtractModel)
                    }
            }

            fun missingParseModels(missingParseModels: List<String>) =
                missingParseModels(JsonField.of(missingParseModels))

            /**
             * Sets [Builder.missingParseModels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missingParseModels] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun missingParseModels(missingParseModels: JsonField<List<String>>) = apply {
                this.missingParseModels = missingParseModels.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [missingParseModels].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMissingParseModel(missingParseModel: String) = apply {
                missingParseModels =
                    (missingParseModels ?: JsonField.of(mutableListOf())).also {
                        checkKnown("missingParseModels", it).add(missingParseModel)
                    }
            }

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
             * Returns an immutable instance of [AvailableMode].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .mode()
             * .parseMode()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AvailableMode =
                AvailableMode(
                    checkRequired("mode", mode),
                    checkRequired("parseMode", parseMode),
                    checkRequired("status", status),
                    (availableExtractModels ?: JsonMissing.of()).map { it.toImmutable() },
                    (availableParseModels ?: JsonMissing.of()).map { it.toImmutable() },
                    (missingExtractModels ?: JsonMissing.of()).map { it.toImmutable() },
                    (missingParseModels ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudAdminInvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
        fun validate(): AvailableMode = apply {
            if (validated) {
                return@apply
            }

            mode()
            parseMode()
            status().validate()
            availableExtractModels()
            availableParseModels()
            missingExtractModels()
            missingParseModels()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (mode.asKnown().isPresent) 1 else 0) +
                (if (parseMode.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (availableExtractModels.asKnown().getOrNull()?.size ?: 0) +
                (availableParseModels.asKnown().getOrNull()?.size ?: 0) +
                (missingExtractModels.asKnown().getOrNull()?.size ?: 0) +
                (missingParseModels.asKnown().getOrNull()?.size ?: 0)

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AVAILABLE = of("available")

                @JvmField val UNAVAILABLE = of("unavailable")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                AVAILABLE,
                UNAVAILABLE,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AVAILABLE,
                UNAVAILABLE,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AVAILABLE -> Value.AVAILABLE
                    UNAVAILABLE -> Value.UNAVAILABLE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudAdminInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    AVAILABLE -> Known.AVAILABLE
                    UNAVAILABLE -> Known.UNAVAILABLE
                    else -> throw LlamaCloudAdminInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudAdminInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LlamaCloudAdminInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudAdminInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Status = apply {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            return other is AvailableMode &&
                mode == other.mode &&
                parseMode == other.parseMode &&
                status == other.status &&
                availableExtractModels == other.availableExtractModels &&
                availableParseModels == other.availableParseModels &&
                missingExtractModels == other.missingExtractModels &&
                missingParseModels == other.missingParseModels &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                mode,
                parseMode,
                status,
                availableExtractModels,
                availableParseModels,
                missingExtractModels,
                missingParseModels,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AvailableMode{mode=$mode, parseMode=$parseMode, status=$status, availableExtractModels=$availableExtractModels, availableParseModels=$availableParseModels, missingExtractModels=$missingExtractModels, missingParseModels=$missingParseModels, additionalProperties=$additionalProperties}"
    }

    class SchemaGeneration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val model: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(model, status, mutableMapOf())

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
             * Returns a mutable builder for constructing an instance of [SchemaGeneration].
             *
             * The following fields are required:
             * ```java
             * .model()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SchemaGeneration]. */
        class Builder internal constructor() {

            private var model: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(schemaGeneration: SchemaGeneration) = apply {
                model = schemaGeneration.model
                status = schemaGeneration.status
                additionalProperties = schemaGeneration.additionalProperties.toMutableMap()
            }

            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [SchemaGeneration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .model()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SchemaGeneration =
                SchemaGeneration(
                    checkRequired("model", model),
                    checkRequired("status", status),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudAdminInvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
        fun validate(): SchemaGeneration = apply {
            if (validated) {
                return@apply
            }

            model()
            status().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (model.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AVAILABLE = of("available")

                @JvmField val UNAVAILABLE = of("unavailable")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                AVAILABLE,
                UNAVAILABLE,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AVAILABLE,
                UNAVAILABLE,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AVAILABLE -> Value.AVAILABLE
                    UNAVAILABLE -> Value.UNAVAILABLE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudAdminInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    AVAILABLE -> Known.AVAILABLE
                    UNAVAILABLE -> Known.UNAVAILABLE
                    else -> throw LlamaCloudAdminInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudAdminInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LlamaCloudAdminInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudAdminInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Status = apply {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            return other is SchemaGeneration &&
                model == other.model &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(model, status, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SchemaGeneration{model=$model, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AdminGetLlamaextractFeaturesResponse &&
            availableModes == other.availableModes &&
            schemaGeneration == other.schemaGeneration &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(availableModes, schemaGeneration, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AdminGetLlamaextractFeaturesResponse{availableModes=$availableModes, schemaGeneration=$schemaGeneration, additionalProperties=$additionalProperties}"
}
