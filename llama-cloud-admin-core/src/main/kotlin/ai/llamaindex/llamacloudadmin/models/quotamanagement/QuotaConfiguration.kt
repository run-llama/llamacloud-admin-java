// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.quotamanagement

import ai.llamaindex.llamacloudadmin.core.Enum
import ai.llamaindex.llamacloudadmin.core.ExcludeMissing
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.JsonMissing
import ai.llamaindex.llamacloudadmin.core.JsonValue
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

/** Full quota configuration model. */
class QuotaConfiguration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val configurationMetadata: JsonField<ConfigurationMetadata>,
    private val configurationType: JsonField<ConfigurationType>,
    private val configurationValue: JsonField<ConfigurationValue>,
    private val sourceId: JsonField<String>,
    private val sourceType: JsonField<SourceType>,
    private val status: JsonField<Status>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val endedAt: JsonField<OffsetDateTime>,
    private val idempotencyKey: JsonField<String>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("configuration_metadata")
        @ExcludeMissing
        configurationMetadata: JsonField<ConfigurationMetadata> = JsonMissing.of(),
        @JsonProperty("configuration_type")
        @ExcludeMissing
        configurationType: JsonField<ConfigurationType> = JsonMissing.of(),
        @JsonProperty("configuration_value")
        @ExcludeMissing
        configurationValue: JsonField<ConfigurationValue> = JsonMissing.of(),
        @JsonProperty("source_id") @ExcludeMissing sourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_type")
        @ExcludeMissing
        sourceType: JsonField<SourceType> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ended_at")
        @ExcludeMissing
        endedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("started_at")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        configurationMetadata,
        configurationType,
        configurationValue,
        sourceId,
        sourceType,
        status,
        id,
        createdAt,
        endedAt,
        idempotencyKey,
        startedAt,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * The configuration metadata
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun configurationMetadata(): Optional<ConfigurationMetadata> =
        configurationMetadata.getOptional("configuration_metadata")

    /**
     * The quota configuration type
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun configurationType(): ConfigurationType = configurationType.getRequired("configuration_type")

    /**
     * The quota configuration value
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun configurationValue(): ConfigurationValue =
        configurationValue.getRequired("configuration_value")

    /**
     * The source ID, e.g. the organization ID
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceId(): String = sourceId.getRequired("source_id")

    /**
     * The source type, e.g. 'organization'
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceType(): SourceType = sourceType.getRequired("source_type")

    /**
     * The status of the quota, i.e. 'ACTIVE' or 'INACTIVE'
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The system-generated UUID for the quota
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The creation date of the quota configuration in the database
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * The end date of the quota
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun endedAt(): Optional<OffsetDateTime> = endedAt.getOptional("ended_at")

    /**
     * The idempotency key
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

    /**
     * The start date of the quota
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("started_at")

    /**
     * The last updated date of the quota configuration in the database
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [configurationMetadata].
     *
     * Unlike [configurationMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("configuration_metadata")
    @ExcludeMissing
    fun _configurationMetadata(): JsonField<ConfigurationMetadata> = configurationMetadata

    /**
     * Returns the raw JSON value of [configurationType].
     *
     * Unlike [configurationType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("configuration_type")
    @ExcludeMissing
    fun _configurationType(): JsonField<ConfigurationType> = configurationType

    /**
     * Returns the raw JSON value of [configurationValue].
     *
     * Unlike [configurationValue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("configuration_value")
    @ExcludeMissing
    fun _configurationValue(): JsonField<ConfigurationValue> = configurationValue

    /**
     * Returns the raw JSON value of [sourceId].
     *
     * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

    /**
     * Returns the raw JSON value of [sourceType].
     *
     * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_type")
    @ExcludeMissing
    fun _sourceType(): JsonField<SourceType> = sourceType

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [endedAt].
     *
     * Unlike [endedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ended_at") @ExcludeMissing fun _endedAt(): JsonField<OffsetDateTime> = endedAt

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [QuotaConfiguration].
         *
         * The following fields are required:
         * ```java
         * .configurationMetadata()
         * .configurationType()
         * .configurationValue()
         * .sourceId()
         * .sourceType()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QuotaConfiguration]. */
    class Builder internal constructor() {

        private var configurationMetadata: JsonField<ConfigurationMetadata>? = null
        private var configurationType: JsonField<ConfigurationType>? = null
        private var configurationValue: JsonField<ConfigurationValue>? = null
        private var sourceId: JsonField<String>? = null
        private var sourceType: JsonField<SourceType>? = null
        private var status: JsonField<Status>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(quotaConfiguration: QuotaConfiguration) = apply {
            configurationMetadata = quotaConfiguration.configurationMetadata
            configurationType = quotaConfiguration.configurationType
            configurationValue = quotaConfiguration.configurationValue
            sourceId = quotaConfiguration.sourceId
            sourceType = quotaConfiguration.sourceType
            status = quotaConfiguration.status
            id = quotaConfiguration.id
            createdAt = quotaConfiguration.createdAt
            endedAt = quotaConfiguration.endedAt
            idempotencyKey = quotaConfiguration.idempotencyKey
            startedAt = quotaConfiguration.startedAt
            updatedAt = quotaConfiguration.updatedAt
            additionalProperties = quotaConfiguration.additionalProperties.toMutableMap()
        }

        /** The configuration metadata */
        fun configurationMetadata(configurationMetadata: ConfigurationMetadata?) =
            configurationMetadata(JsonField.ofNullable(configurationMetadata))

        /**
         * Alias for calling [Builder.configurationMetadata] with
         * `configurationMetadata.orElse(null)`.
         */
        fun configurationMetadata(configurationMetadata: Optional<ConfigurationMetadata>) =
            configurationMetadata(configurationMetadata.getOrNull())

        /**
         * Sets [Builder.configurationMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configurationMetadata] with a well-typed
         * [ConfigurationMetadata] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun configurationMetadata(configurationMetadata: JsonField<ConfigurationMetadata>) = apply {
            this.configurationMetadata = configurationMetadata
        }

        /** The quota configuration type */
        fun configurationType(configurationType: ConfigurationType) =
            configurationType(JsonField.of(configurationType))

        /**
         * Sets [Builder.configurationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configurationType] with a well-typed [ConfigurationType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun configurationType(configurationType: JsonField<ConfigurationType>) = apply {
            this.configurationType = configurationType
        }

        /** The quota configuration value */
        fun configurationValue(configurationValue: ConfigurationValue) =
            configurationValue(JsonField.of(configurationValue))

        /**
         * Sets [Builder.configurationValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configurationValue] with a well-typed
         * [ConfigurationValue] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun configurationValue(configurationValue: JsonField<ConfigurationValue>) = apply {
            this.configurationValue = configurationValue
        }

        /** The source ID, e.g. the organization ID */
        fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

        /** The source type, e.g. 'organization' */
        fun sourceType(sourceType: SourceType) = sourceType(JsonField.of(sourceType))

        /**
         * Sets [Builder.sourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceType] with a well-typed [SourceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceType(sourceType: JsonField<SourceType>) = apply { this.sourceType = sourceType }

        /** The status of the quota, i.e. 'ACTIVE' or 'INACTIVE' */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The system-generated UUID for the quota */
        fun id(id: String?) = id(JsonField.ofNullable(id))

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The creation date of the quota configuration in the database */
        fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The end date of the quota */
        fun endedAt(endedAt: OffsetDateTime?) = endedAt(JsonField.ofNullable(endedAt))

        /** Alias for calling [Builder.endedAt] with `endedAt.orElse(null)`. */
        fun endedAt(endedAt: Optional<OffsetDateTime>) = endedAt(endedAt.getOrNull())

        /**
         * Sets [Builder.endedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endedAt(endedAt: JsonField<OffsetDateTime>) = apply { this.endedAt = endedAt }

        /** The idempotency key */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** The start date of the quota */
        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        /** The last updated date of the quota configuration in the database */
        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [QuotaConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .configurationMetadata()
         * .configurationType()
         * .configurationValue()
         * .sourceId()
         * .sourceType()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QuotaConfiguration =
            QuotaConfiguration(
                checkRequired("configurationMetadata", configurationMetadata),
                checkRequired("configurationType", configurationType),
                checkRequired("configurationValue", configurationValue),
                checkRequired("sourceId", sourceId),
                checkRequired("sourceType", sourceType),
                checkRequired("status", status),
                id,
                createdAt,
                endedAt,
                idempotencyKey,
                startedAt,
                updatedAt,
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
    fun validate(): QuotaConfiguration = apply {
        if (validated) {
            return@apply
        }

        configurationMetadata().ifPresent { it.validate() }
        configurationType().validate()
        configurationValue().validate()
        sourceId()
        sourceType().validate()
        status().validate()
        id()
        createdAt()
        endedAt()
        idempotencyKey()
        startedAt()
        updatedAt()
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
        (configurationMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (configurationType.asKnown().getOrNull()?.validity() ?: 0) +
            (configurationValue.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sourceId.asKnown().isPresent) 1 else 0) +
            (sourceType.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (endedAt.asKnown().isPresent) 1 else 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** The configuration metadata */
    class ConfigurationMetadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ConfigurationMetadata].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConfigurationMetadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(configurationMetadata: ConfigurationMetadata) = apply {
                additionalProperties = configurationMetadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ConfigurationMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ConfigurationMetadata =
                ConfigurationMetadata(additionalProperties.toImmutable())
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
        fun validate(): ConfigurationMetadata = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConfigurationMetadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConfigurationMetadata{additionalProperties=$additionalProperties}"
    }

    /** The quota configuration type */
    class ConfigurationType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ALLOW_PAY_AS_YOU_GO = of("allow_pay_as_you_go")

            @JvmField
            val LIMIT_AGENT_CODER_DAILY_USAGE_USD = of("limit_agent_coder_daily_usage_usd")

            @JvmField val LIMIT_AGENT_DEPLOYMENTS = of("limit_agent_deployments")

            @JvmField val LIMIT_BATCH_FILES = of("limit_batch_files")

            @JvmField val LIMIT_CLASSIFY_INPUT_TOKENS = of("limit_classify_input_tokens")

            @JvmField val LIMIT_DAILY_USAGE_CREDITS = of("limit_daily_usage_credits")

            @JvmField val LIMIT_DIRECTORIES = of("limit_directories")

            @JvmField
            val LIMIT_DIRECTORY_FILES_PER_DIRECTORY = of("limit_directory_files_per_directory")

            @JvmField
            val LIMIT_DIRECTORY_INGEST_DOWNLOAD_SIZE_BYTES =
                of("limit_directory_ingest_download_size_bytes")

            @JvmField val LIMIT_DIRECTORY_INGEST_FILES = of("limit_directory_ingest_files")

            @JvmField
            val LIMIT_DIRECTORY_SYNC_PLAN_ACTIONS = of("limit_directory_sync_plan_actions")

            @JvmField val LIMIT_EMBEDDING_CHARACTER = of("limit_embedding_character")

            @JvmField val LIMIT_FILES_PER_INDEX = of("limit_files_per_index")

            @JvmField
            val LIMIT_MAX_MONTHLY_INVOICE_TOTAL_USD_CENTS =
                of("limit_max_monthly_invoice_total_usd_cents")

            @JvmField val LIMIT_MONTHLY_USAGE_CREDITS = of("limit_monthly_usage_credits")

            @JvmField val LIMIT_PROJECTS = of("limit_projects")

            @JvmField val LIMIT_SPLIT_CATEGORIES = of("limit_split_categories")

            @JvmField val LIMIT_TOTAL_FILE_COUNT = of("limit_total_file_count")

            @JvmField val LIMIT_TOTAL_FILE_STORAGE_BYTES = of("limit_total_file_storage_bytes")

            @JvmField val LIMIT_USERS = of("limit_users")

            @JvmField val RATE_LIMIT_BATCH_API_CREATION = of("rate_limit_batch_api_creation")

            @JvmField val RATE_LIMIT_CHAT_API_MESSAGE = of("rate_limit_chat_api_message")

            @JvmField val RATE_LIMIT_CLASSIFY_API_CREATION = of("rate_limit_classify_api_creation")

            @JvmField val RATE_LIMIT_CLASSIFY_API_LIST = of("rate_limit_classify_api_list")

            @JvmField val RATE_LIMIT_CLASSIFY_API_QUERY = of("rate_limit_classify_api_query")

            @JvmField
            val RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DEFAULT =
                of("rate_limit_concurrent_jobs_in_execution_default")

            @JvmField
            val RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DOC_INGEST =
                of("rate_limit_concurrent_jobs_in_execution_doc_ingest")

            @JvmField
            val RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_METADATA_UPDATE =
                of("rate_limit_concurrent_jobs_in_execution_metadata_update")

            @JvmField val RATE_LIMIT_DEFAULT_API_READ = of("rate_limit_default_api_read")

            @JvmField val RATE_LIMIT_DEFAULT_API_WRITE = of("rate_limit_default_api_write")

            @JvmField
            val RATE_LIMIT_DIRECTORY_FILE_API_READ = of("rate_limit_directory_file_api_read")

            @JvmField
            val RATE_LIMIT_DIRECTORY_FILE_API_WRITE = of("rate_limit_directory_file_api_write")

            @JvmField
            val RATE_LIMIT_DIRECTORY_INGEST_PROJECT_JOB_CREATION =
                of("rate_limit_directory_ingest_project_job_creation")

            @JvmField
            val RATE_LIMIT_EXTRACT_AGENT_CREATION = of("rate_limit_extract_agent_creation")

            @JvmField val RATE_LIMIT_EXTRACT_API_CREATION = of("rate_limit_extract_api_creation")

            @JvmField val RATE_LIMIT_EXTRACT_API_LIST = of("rate_limit_extract_api_list")

            @JvmField val RATE_LIMIT_EXTRACT_API_QUERY = of("rate_limit_extract_api_query")

            @JvmField
            val RATE_LIMIT_EXTRACT_CONCURRENT_DEFAULT = of("rate_limit_extract_concurrent_default")

            @JvmField val RATE_LIMIT_FILE_API_READ = of("rate_limit_file_api_read")

            @JvmField val RATE_LIMIT_FILE_API_WRITE = of("rate_limit_file_api_write")

            @JvmField
            val RATE_LIMIT_INDEX_V1_PIPELINE_CONCURRENT_JOBS =
                of("rate_limit_index_v1_pipeline_concurrent_jobs")

            @JvmField val RATE_LIMIT_PARSE_API_CREATION = of("rate_limit_parse_api_creation")

            @JvmField val RATE_LIMIT_PARSE_API_LIST = of("rate_limit_parse_api_list")

            @JvmField val RATE_LIMIT_PARSE_API_QUERY = of("rate_limit_parse_api_query")

            @JvmField
            val RATE_LIMIT_PARSE_CONCURRENT_DEFAULT = of("rate_limit_parse_concurrent_default")

            @JvmField
            val RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC =
                of("rate_limit_parse_concurrent_pages_agentic")

            @JvmField
            val RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC_PLUS =
                of("rate_limit_parse_concurrent_pages_agentic_plus")

            @JvmField
            val RATE_LIMIT_PARSE_CONCURRENT_PAGES_COST_EFFECTIVE =
                of("rate_limit_parse_concurrent_pages_cost_effective")

            @JvmField
            val RATE_LIMIT_PARSE_CONCURRENT_PREMIUM = of("rate_limit_parse_concurrent_premium")

            @JvmField
            val RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC = of("rate_limit_parse_token_bucket_agentic")

            @JvmField
            val RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC_PLUS =
                of("rate_limit_parse_token_bucket_agentic_plus")

            @JvmField
            val RATE_LIMIT_PARSE_TOKEN_BUCKET_COST_EFFECTIVE =
                of("rate_limit_parse_token_bucket_cost_effective")

            @JvmField
            val RATE_LIMIT_PARSE_TOKEN_BUCKET_UNKNOWN_TIER =
                of("rate_limit_parse_token_bucket_unknown_tier")

            @JvmField
            val RATE_LIMIT_PROJECT_CONCURRENT_JOBS = of("rate_limit_project_concurrent_jobs")

            @JvmField
            val RATE_LIMIT_PROJECT_CONCURRENT_TURBO_JOBS =
                of("rate_limit_project_concurrent_turbo_jobs")

            @JvmField val RATE_LIMIT_SPLIT_API_CREATION = of("rate_limit_split_api_creation")

            @JvmField val RATE_LIMIT_SPLIT_API_QUERY = of("rate_limit_split_api_query")

            @JvmField val RATE_LIMIT_SPREADSHEET_API_LIST = of("rate_limit_spreadsheet_api_list")

            @JvmField val RATE_LIMIT_SPREADSHEET_API_QUERY = of("rate_limit_spreadsheet_api_query")

            @JvmField val RATE_LIMIT_SPREADSHEET_CREATION = of("rate_limit_spreadsheet_creation")

            @JvmField val RATE_LIMIT_USAGE_API_QUERY = of("rate_limit_usage_api_query")

            @JvmField val RATE_LIMIT_VERIFY_API_CREATION = of("rate_limit_verify_api_creation")

            @JvmField val RATE_LIMIT_VERIFY_API_LIST = of("rate_limit_verify_api_list")

            @JvmField val RATE_LIMIT_VERIFY_API_QUERY = of("rate_limit_verify_api_query")

            @JvmStatic fun of(value: String) = ConfigurationType(JsonField.of(value))
        }

        /** An enum containing [ConfigurationType]'s known values. */
        enum class Known {
            ALLOW_PAY_AS_YOU_GO,
            LIMIT_AGENT_CODER_DAILY_USAGE_USD,
            LIMIT_AGENT_DEPLOYMENTS,
            LIMIT_BATCH_FILES,
            LIMIT_CLASSIFY_INPUT_TOKENS,
            LIMIT_DAILY_USAGE_CREDITS,
            LIMIT_DIRECTORIES,
            LIMIT_DIRECTORY_FILES_PER_DIRECTORY,
            LIMIT_DIRECTORY_INGEST_DOWNLOAD_SIZE_BYTES,
            LIMIT_DIRECTORY_INGEST_FILES,
            LIMIT_DIRECTORY_SYNC_PLAN_ACTIONS,
            LIMIT_EMBEDDING_CHARACTER,
            LIMIT_FILES_PER_INDEX,
            LIMIT_MAX_MONTHLY_INVOICE_TOTAL_USD_CENTS,
            LIMIT_MONTHLY_USAGE_CREDITS,
            LIMIT_PROJECTS,
            LIMIT_SPLIT_CATEGORIES,
            LIMIT_TOTAL_FILE_COUNT,
            LIMIT_TOTAL_FILE_STORAGE_BYTES,
            LIMIT_USERS,
            RATE_LIMIT_BATCH_API_CREATION,
            RATE_LIMIT_CHAT_API_MESSAGE,
            RATE_LIMIT_CLASSIFY_API_CREATION,
            RATE_LIMIT_CLASSIFY_API_LIST,
            RATE_LIMIT_CLASSIFY_API_QUERY,
            RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DEFAULT,
            RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DOC_INGEST,
            RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_METADATA_UPDATE,
            RATE_LIMIT_DEFAULT_API_READ,
            RATE_LIMIT_DEFAULT_API_WRITE,
            RATE_LIMIT_DIRECTORY_FILE_API_READ,
            RATE_LIMIT_DIRECTORY_FILE_API_WRITE,
            RATE_LIMIT_DIRECTORY_INGEST_PROJECT_JOB_CREATION,
            RATE_LIMIT_EXTRACT_AGENT_CREATION,
            RATE_LIMIT_EXTRACT_API_CREATION,
            RATE_LIMIT_EXTRACT_API_LIST,
            RATE_LIMIT_EXTRACT_API_QUERY,
            RATE_LIMIT_EXTRACT_CONCURRENT_DEFAULT,
            RATE_LIMIT_FILE_API_READ,
            RATE_LIMIT_FILE_API_WRITE,
            RATE_LIMIT_INDEX_V1_PIPELINE_CONCURRENT_JOBS,
            RATE_LIMIT_PARSE_API_CREATION,
            RATE_LIMIT_PARSE_API_LIST,
            RATE_LIMIT_PARSE_API_QUERY,
            RATE_LIMIT_PARSE_CONCURRENT_DEFAULT,
            RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC,
            RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC_PLUS,
            RATE_LIMIT_PARSE_CONCURRENT_PAGES_COST_EFFECTIVE,
            RATE_LIMIT_PARSE_CONCURRENT_PREMIUM,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC_PLUS,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_COST_EFFECTIVE,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_UNKNOWN_TIER,
            RATE_LIMIT_PROJECT_CONCURRENT_JOBS,
            RATE_LIMIT_PROJECT_CONCURRENT_TURBO_JOBS,
            RATE_LIMIT_SPLIT_API_CREATION,
            RATE_LIMIT_SPLIT_API_QUERY,
            RATE_LIMIT_SPREADSHEET_API_LIST,
            RATE_LIMIT_SPREADSHEET_API_QUERY,
            RATE_LIMIT_SPREADSHEET_CREATION,
            RATE_LIMIT_USAGE_API_QUERY,
            RATE_LIMIT_VERIFY_API_CREATION,
            RATE_LIMIT_VERIFY_API_LIST,
            RATE_LIMIT_VERIFY_API_QUERY,
        }

        /**
         * An enum containing [ConfigurationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ConfigurationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALLOW_PAY_AS_YOU_GO,
            LIMIT_AGENT_CODER_DAILY_USAGE_USD,
            LIMIT_AGENT_DEPLOYMENTS,
            LIMIT_BATCH_FILES,
            LIMIT_CLASSIFY_INPUT_TOKENS,
            LIMIT_DAILY_USAGE_CREDITS,
            LIMIT_DIRECTORIES,
            LIMIT_DIRECTORY_FILES_PER_DIRECTORY,
            LIMIT_DIRECTORY_INGEST_DOWNLOAD_SIZE_BYTES,
            LIMIT_DIRECTORY_INGEST_FILES,
            LIMIT_DIRECTORY_SYNC_PLAN_ACTIONS,
            LIMIT_EMBEDDING_CHARACTER,
            LIMIT_FILES_PER_INDEX,
            LIMIT_MAX_MONTHLY_INVOICE_TOTAL_USD_CENTS,
            LIMIT_MONTHLY_USAGE_CREDITS,
            LIMIT_PROJECTS,
            LIMIT_SPLIT_CATEGORIES,
            LIMIT_TOTAL_FILE_COUNT,
            LIMIT_TOTAL_FILE_STORAGE_BYTES,
            LIMIT_USERS,
            RATE_LIMIT_BATCH_API_CREATION,
            RATE_LIMIT_CHAT_API_MESSAGE,
            RATE_LIMIT_CLASSIFY_API_CREATION,
            RATE_LIMIT_CLASSIFY_API_LIST,
            RATE_LIMIT_CLASSIFY_API_QUERY,
            RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DEFAULT,
            RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DOC_INGEST,
            RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_METADATA_UPDATE,
            RATE_LIMIT_DEFAULT_API_READ,
            RATE_LIMIT_DEFAULT_API_WRITE,
            RATE_LIMIT_DIRECTORY_FILE_API_READ,
            RATE_LIMIT_DIRECTORY_FILE_API_WRITE,
            RATE_LIMIT_DIRECTORY_INGEST_PROJECT_JOB_CREATION,
            RATE_LIMIT_EXTRACT_AGENT_CREATION,
            RATE_LIMIT_EXTRACT_API_CREATION,
            RATE_LIMIT_EXTRACT_API_LIST,
            RATE_LIMIT_EXTRACT_API_QUERY,
            RATE_LIMIT_EXTRACT_CONCURRENT_DEFAULT,
            RATE_LIMIT_FILE_API_READ,
            RATE_LIMIT_FILE_API_WRITE,
            RATE_LIMIT_INDEX_V1_PIPELINE_CONCURRENT_JOBS,
            RATE_LIMIT_PARSE_API_CREATION,
            RATE_LIMIT_PARSE_API_LIST,
            RATE_LIMIT_PARSE_API_QUERY,
            RATE_LIMIT_PARSE_CONCURRENT_DEFAULT,
            RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC,
            RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC_PLUS,
            RATE_LIMIT_PARSE_CONCURRENT_PAGES_COST_EFFECTIVE,
            RATE_LIMIT_PARSE_CONCURRENT_PREMIUM,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC_PLUS,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_COST_EFFECTIVE,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_UNKNOWN_TIER,
            RATE_LIMIT_PROJECT_CONCURRENT_JOBS,
            RATE_LIMIT_PROJECT_CONCURRENT_TURBO_JOBS,
            RATE_LIMIT_SPLIT_API_CREATION,
            RATE_LIMIT_SPLIT_API_QUERY,
            RATE_LIMIT_SPREADSHEET_API_LIST,
            RATE_LIMIT_SPREADSHEET_API_QUERY,
            RATE_LIMIT_SPREADSHEET_CREATION,
            RATE_LIMIT_USAGE_API_QUERY,
            RATE_LIMIT_VERIFY_API_CREATION,
            RATE_LIMIT_VERIFY_API_LIST,
            RATE_LIMIT_VERIFY_API_QUERY,
            /**
             * An enum member indicating that [ConfigurationType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ALLOW_PAY_AS_YOU_GO -> Value.ALLOW_PAY_AS_YOU_GO
                LIMIT_AGENT_CODER_DAILY_USAGE_USD -> Value.LIMIT_AGENT_CODER_DAILY_USAGE_USD
                LIMIT_AGENT_DEPLOYMENTS -> Value.LIMIT_AGENT_DEPLOYMENTS
                LIMIT_BATCH_FILES -> Value.LIMIT_BATCH_FILES
                LIMIT_CLASSIFY_INPUT_TOKENS -> Value.LIMIT_CLASSIFY_INPUT_TOKENS
                LIMIT_DAILY_USAGE_CREDITS -> Value.LIMIT_DAILY_USAGE_CREDITS
                LIMIT_DIRECTORIES -> Value.LIMIT_DIRECTORIES
                LIMIT_DIRECTORY_FILES_PER_DIRECTORY -> Value.LIMIT_DIRECTORY_FILES_PER_DIRECTORY
                LIMIT_DIRECTORY_INGEST_DOWNLOAD_SIZE_BYTES ->
                    Value.LIMIT_DIRECTORY_INGEST_DOWNLOAD_SIZE_BYTES
                LIMIT_DIRECTORY_INGEST_FILES -> Value.LIMIT_DIRECTORY_INGEST_FILES
                LIMIT_DIRECTORY_SYNC_PLAN_ACTIONS -> Value.LIMIT_DIRECTORY_SYNC_PLAN_ACTIONS
                LIMIT_EMBEDDING_CHARACTER -> Value.LIMIT_EMBEDDING_CHARACTER
                LIMIT_FILES_PER_INDEX -> Value.LIMIT_FILES_PER_INDEX
                LIMIT_MAX_MONTHLY_INVOICE_TOTAL_USD_CENTS ->
                    Value.LIMIT_MAX_MONTHLY_INVOICE_TOTAL_USD_CENTS
                LIMIT_MONTHLY_USAGE_CREDITS -> Value.LIMIT_MONTHLY_USAGE_CREDITS
                LIMIT_PROJECTS -> Value.LIMIT_PROJECTS
                LIMIT_SPLIT_CATEGORIES -> Value.LIMIT_SPLIT_CATEGORIES
                LIMIT_TOTAL_FILE_COUNT -> Value.LIMIT_TOTAL_FILE_COUNT
                LIMIT_TOTAL_FILE_STORAGE_BYTES -> Value.LIMIT_TOTAL_FILE_STORAGE_BYTES
                LIMIT_USERS -> Value.LIMIT_USERS
                RATE_LIMIT_BATCH_API_CREATION -> Value.RATE_LIMIT_BATCH_API_CREATION
                RATE_LIMIT_CHAT_API_MESSAGE -> Value.RATE_LIMIT_CHAT_API_MESSAGE
                RATE_LIMIT_CLASSIFY_API_CREATION -> Value.RATE_LIMIT_CLASSIFY_API_CREATION
                RATE_LIMIT_CLASSIFY_API_LIST -> Value.RATE_LIMIT_CLASSIFY_API_LIST
                RATE_LIMIT_CLASSIFY_API_QUERY -> Value.RATE_LIMIT_CLASSIFY_API_QUERY
                RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DEFAULT ->
                    Value.RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DEFAULT
                RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DOC_INGEST ->
                    Value.RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DOC_INGEST
                RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_METADATA_UPDATE ->
                    Value.RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_METADATA_UPDATE
                RATE_LIMIT_DEFAULT_API_READ -> Value.RATE_LIMIT_DEFAULT_API_READ
                RATE_LIMIT_DEFAULT_API_WRITE -> Value.RATE_LIMIT_DEFAULT_API_WRITE
                RATE_LIMIT_DIRECTORY_FILE_API_READ -> Value.RATE_LIMIT_DIRECTORY_FILE_API_READ
                RATE_LIMIT_DIRECTORY_FILE_API_WRITE -> Value.RATE_LIMIT_DIRECTORY_FILE_API_WRITE
                RATE_LIMIT_DIRECTORY_INGEST_PROJECT_JOB_CREATION ->
                    Value.RATE_LIMIT_DIRECTORY_INGEST_PROJECT_JOB_CREATION
                RATE_LIMIT_EXTRACT_AGENT_CREATION -> Value.RATE_LIMIT_EXTRACT_AGENT_CREATION
                RATE_LIMIT_EXTRACT_API_CREATION -> Value.RATE_LIMIT_EXTRACT_API_CREATION
                RATE_LIMIT_EXTRACT_API_LIST -> Value.RATE_LIMIT_EXTRACT_API_LIST
                RATE_LIMIT_EXTRACT_API_QUERY -> Value.RATE_LIMIT_EXTRACT_API_QUERY
                RATE_LIMIT_EXTRACT_CONCURRENT_DEFAULT -> Value.RATE_LIMIT_EXTRACT_CONCURRENT_DEFAULT
                RATE_LIMIT_FILE_API_READ -> Value.RATE_LIMIT_FILE_API_READ
                RATE_LIMIT_FILE_API_WRITE -> Value.RATE_LIMIT_FILE_API_WRITE
                RATE_LIMIT_INDEX_V1_PIPELINE_CONCURRENT_JOBS ->
                    Value.RATE_LIMIT_INDEX_V1_PIPELINE_CONCURRENT_JOBS
                RATE_LIMIT_PARSE_API_CREATION -> Value.RATE_LIMIT_PARSE_API_CREATION
                RATE_LIMIT_PARSE_API_LIST -> Value.RATE_LIMIT_PARSE_API_LIST
                RATE_LIMIT_PARSE_API_QUERY -> Value.RATE_LIMIT_PARSE_API_QUERY
                RATE_LIMIT_PARSE_CONCURRENT_DEFAULT -> Value.RATE_LIMIT_PARSE_CONCURRENT_DEFAULT
                RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC ->
                    Value.RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC
                RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC_PLUS ->
                    Value.RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC_PLUS
                RATE_LIMIT_PARSE_CONCURRENT_PAGES_COST_EFFECTIVE ->
                    Value.RATE_LIMIT_PARSE_CONCURRENT_PAGES_COST_EFFECTIVE
                RATE_LIMIT_PARSE_CONCURRENT_PREMIUM -> Value.RATE_LIMIT_PARSE_CONCURRENT_PREMIUM
                RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC -> Value.RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC
                RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC_PLUS ->
                    Value.RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC_PLUS
                RATE_LIMIT_PARSE_TOKEN_BUCKET_COST_EFFECTIVE ->
                    Value.RATE_LIMIT_PARSE_TOKEN_BUCKET_COST_EFFECTIVE
                RATE_LIMIT_PARSE_TOKEN_BUCKET_UNKNOWN_TIER ->
                    Value.RATE_LIMIT_PARSE_TOKEN_BUCKET_UNKNOWN_TIER
                RATE_LIMIT_PROJECT_CONCURRENT_JOBS -> Value.RATE_LIMIT_PROJECT_CONCURRENT_JOBS
                RATE_LIMIT_PROJECT_CONCURRENT_TURBO_JOBS ->
                    Value.RATE_LIMIT_PROJECT_CONCURRENT_TURBO_JOBS
                RATE_LIMIT_SPLIT_API_CREATION -> Value.RATE_LIMIT_SPLIT_API_CREATION
                RATE_LIMIT_SPLIT_API_QUERY -> Value.RATE_LIMIT_SPLIT_API_QUERY
                RATE_LIMIT_SPREADSHEET_API_LIST -> Value.RATE_LIMIT_SPREADSHEET_API_LIST
                RATE_LIMIT_SPREADSHEET_API_QUERY -> Value.RATE_LIMIT_SPREADSHEET_API_QUERY
                RATE_LIMIT_SPREADSHEET_CREATION -> Value.RATE_LIMIT_SPREADSHEET_CREATION
                RATE_LIMIT_USAGE_API_QUERY -> Value.RATE_LIMIT_USAGE_API_QUERY
                RATE_LIMIT_VERIFY_API_CREATION -> Value.RATE_LIMIT_VERIFY_API_CREATION
                RATE_LIMIT_VERIFY_API_LIST -> Value.RATE_LIMIT_VERIFY_API_LIST
                RATE_LIMIT_VERIFY_API_QUERY -> Value.RATE_LIMIT_VERIFY_API_QUERY
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaCloudAdminInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                ALLOW_PAY_AS_YOU_GO -> Known.ALLOW_PAY_AS_YOU_GO
                LIMIT_AGENT_CODER_DAILY_USAGE_USD -> Known.LIMIT_AGENT_CODER_DAILY_USAGE_USD
                LIMIT_AGENT_DEPLOYMENTS -> Known.LIMIT_AGENT_DEPLOYMENTS
                LIMIT_BATCH_FILES -> Known.LIMIT_BATCH_FILES
                LIMIT_CLASSIFY_INPUT_TOKENS -> Known.LIMIT_CLASSIFY_INPUT_TOKENS
                LIMIT_DAILY_USAGE_CREDITS -> Known.LIMIT_DAILY_USAGE_CREDITS
                LIMIT_DIRECTORIES -> Known.LIMIT_DIRECTORIES
                LIMIT_DIRECTORY_FILES_PER_DIRECTORY -> Known.LIMIT_DIRECTORY_FILES_PER_DIRECTORY
                LIMIT_DIRECTORY_INGEST_DOWNLOAD_SIZE_BYTES ->
                    Known.LIMIT_DIRECTORY_INGEST_DOWNLOAD_SIZE_BYTES
                LIMIT_DIRECTORY_INGEST_FILES -> Known.LIMIT_DIRECTORY_INGEST_FILES
                LIMIT_DIRECTORY_SYNC_PLAN_ACTIONS -> Known.LIMIT_DIRECTORY_SYNC_PLAN_ACTIONS
                LIMIT_EMBEDDING_CHARACTER -> Known.LIMIT_EMBEDDING_CHARACTER
                LIMIT_FILES_PER_INDEX -> Known.LIMIT_FILES_PER_INDEX
                LIMIT_MAX_MONTHLY_INVOICE_TOTAL_USD_CENTS ->
                    Known.LIMIT_MAX_MONTHLY_INVOICE_TOTAL_USD_CENTS
                LIMIT_MONTHLY_USAGE_CREDITS -> Known.LIMIT_MONTHLY_USAGE_CREDITS
                LIMIT_PROJECTS -> Known.LIMIT_PROJECTS
                LIMIT_SPLIT_CATEGORIES -> Known.LIMIT_SPLIT_CATEGORIES
                LIMIT_TOTAL_FILE_COUNT -> Known.LIMIT_TOTAL_FILE_COUNT
                LIMIT_TOTAL_FILE_STORAGE_BYTES -> Known.LIMIT_TOTAL_FILE_STORAGE_BYTES
                LIMIT_USERS -> Known.LIMIT_USERS
                RATE_LIMIT_BATCH_API_CREATION -> Known.RATE_LIMIT_BATCH_API_CREATION
                RATE_LIMIT_CHAT_API_MESSAGE -> Known.RATE_LIMIT_CHAT_API_MESSAGE
                RATE_LIMIT_CLASSIFY_API_CREATION -> Known.RATE_LIMIT_CLASSIFY_API_CREATION
                RATE_LIMIT_CLASSIFY_API_LIST -> Known.RATE_LIMIT_CLASSIFY_API_LIST
                RATE_LIMIT_CLASSIFY_API_QUERY -> Known.RATE_LIMIT_CLASSIFY_API_QUERY
                RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DEFAULT ->
                    Known.RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DEFAULT
                RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DOC_INGEST ->
                    Known.RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DOC_INGEST
                RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_METADATA_UPDATE ->
                    Known.RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_METADATA_UPDATE
                RATE_LIMIT_DEFAULT_API_READ -> Known.RATE_LIMIT_DEFAULT_API_READ
                RATE_LIMIT_DEFAULT_API_WRITE -> Known.RATE_LIMIT_DEFAULT_API_WRITE
                RATE_LIMIT_DIRECTORY_FILE_API_READ -> Known.RATE_LIMIT_DIRECTORY_FILE_API_READ
                RATE_LIMIT_DIRECTORY_FILE_API_WRITE -> Known.RATE_LIMIT_DIRECTORY_FILE_API_WRITE
                RATE_LIMIT_DIRECTORY_INGEST_PROJECT_JOB_CREATION ->
                    Known.RATE_LIMIT_DIRECTORY_INGEST_PROJECT_JOB_CREATION
                RATE_LIMIT_EXTRACT_AGENT_CREATION -> Known.RATE_LIMIT_EXTRACT_AGENT_CREATION
                RATE_LIMIT_EXTRACT_API_CREATION -> Known.RATE_LIMIT_EXTRACT_API_CREATION
                RATE_LIMIT_EXTRACT_API_LIST -> Known.RATE_LIMIT_EXTRACT_API_LIST
                RATE_LIMIT_EXTRACT_API_QUERY -> Known.RATE_LIMIT_EXTRACT_API_QUERY
                RATE_LIMIT_EXTRACT_CONCURRENT_DEFAULT -> Known.RATE_LIMIT_EXTRACT_CONCURRENT_DEFAULT
                RATE_LIMIT_FILE_API_READ -> Known.RATE_LIMIT_FILE_API_READ
                RATE_LIMIT_FILE_API_WRITE -> Known.RATE_LIMIT_FILE_API_WRITE
                RATE_LIMIT_INDEX_V1_PIPELINE_CONCURRENT_JOBS ->
                    Known.RATE_LIMIT_INDEX_V1_PIPELINE_CONCURRENT_JOBS
                RATE_LIMIT_PARSE_API_CREATION -> Known.RATE_LIMIT_PARSE_API_CREATION
                RATE_LIMIT_PARSE_API_LIST -> Known.RATE_LIMIT_PARSE_API_LIST
                RATE_LIMIT_PARSE_API_QUERY -> Known.RATE_LIMIT_PARSE_API_QUERY
                RATE_LIMIT_PARSE_CONCURRENT_DEFAULT -> Known.RATE_LIMIT_PARSE_CONCURRENT_DEFAULT
                RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC ->
                    Known.RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC
                RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC_PLUS ->
                    Known.RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC_PLUS
                RATE_LIMIT_PARSE_CONCURRENT_PAGES_COST_EFFECTIVE ->
                    Known.RATE_LIMIT_PARSE_CONCURRENT_PAGES_COST_EFFECTIVE
                RATE_LIMIT_PARSE_CONCURRENT_PREMIUM -> Known.RATE_LIMIT_PARSE_CONCURRENT_PREMIUM
                RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC -> Known.RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC
                RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC_PLUS ->
                    Known.RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC_PLUS
                RATE_LIMIT_PARSE_TOKEN_BUCKET_COST_EFFECTIVE ->
                    Known.RATE_LIMIT_PARSE_TOKEN_BUCKET_COST_EFFECTIVE
                RATE_LIMIT_PARSE_TOKEN_BUCKET_UNKNOWN_TIER ->
                    Known.RATE_LIMIT_PARSE_TOKEN_BUCKET_UNKNOWN_TIER
                RATE_LIMIT_PROJECT_CONCURRENT_JOBS -> Known.RATE_LIMIT_PROJECT_CONCURRENT_JOBS
                RATE_LIMIT_PROJECT_CONCURRENT_TURBO_JOBS ->
                    Known.RATE_LIMIT_PROJECT_CONCURRENT_TURBO_JOBS
                RATE_LIMIT_SPLIT_API_CREATION -> Known.RATE_LIMIT_SPLIT_API_CREATION
                RATE_LIMIT_SPLIT_API_QUERY -> Known.RATE_LIMIT_SPLIT_API_QUERY
                RATE_LIMIT_SPREADSHEET_API_LIST -> Known.RATE_LIMIT_SPREADSHEET_API_LIST
                RATE_LIMIT_SPREADSHEET_API_QUERY -> Known.RATE_LIMIT_SPREADSHEET_API_QUERY
                RATE_LIMIT_SPREADSHEET_CREATION -> Known.RATE_LIMIT_SPREADSHEET_CREATION
                RATE_LIMIT_USAGE_API_QUERY -> Known.RATE_LIMIT_USAGE_API_QUERY
                RATE_LIMIT_VERIFY_API_CREATION -> Known.RATE_LIMIT_VERIFY_API_CREATION
                RATE_LIMIT_VERIFY_API_LIST -> Known.RATE_LIMIT_VERIFY_API_LIST
                RATE_LIMIT_VERIFY_API_QUERY -> Known.RATE_LIMIT_VERIFY_API_QUERY
                else ->
                    throw LlamaCloudAdminInvalidDataException("Unknown ConfigurationType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaCloudAdminInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudAdminInvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
        fun validate(): ConfigurationType = apply {
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

            return other is ConfigurationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The quota configuration value */
    class ConfigurationValue
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val numerator: JsonField<Long>,
        private val denominator: JsonField<Long>,
        private val denominatorUnits: JsonField<DenominatorUnits>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("numerator")
            @ExcludeMissing
            numerator: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("denominator")
            @ExcludeMissing
            denominator: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("denominator_units")
            @ExcludeMissing
            denominatorUnits: JsonField<DenominatorUnits> = JsonMissing.of(),
        ) : this(numerator, denominator, denominatorUnits, mutableMapOf())

        /**
         * The rate numerator
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun numerator(): Long = numerator.getRequired("numerator")

        /**
         * The rate limit denominator
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun denominator(): Optional<Long> = denominator.getOptional("denominator")

        /**
         * The default rate limit denominator units
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun denominatorUnits(): Optional<DenominatorUnits> =
            denominatorUnits.getOptional("denominator_units")

        /**
         * Returns the raw JSON value of [numerator].
         *
         * Unlike [numerator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numerator") @ExcludeMissing fun _numerator(): JsonField<Long> = numerator

        /**
         * Returns the raw JSON value of [denominator].
         *
         * Unlike [denominator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("denominator")
        @ExcludeMissing
        fun _denominator(): JsonField<Long> = denominator

        /**
         * Returns the raw JSON value of [denominatorUnits].
         *
         * Unlike [denominatorUnits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("denominator_units")
        @ExcludeMissing
        fun _denominatorUnits(): JsonField<DenominatorUnits> = denominatorUnits

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
             * Returns a mutable builder for constructing an instance of [ConfigurationValue].
             *
             * The following fields are required:
             * ```java
             * .numerator()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConfigurationValue]. */
        class Builder internal constructor() {

            private var numerator: JsonField<Long>? = null
            private var denominator: JsonField<Long> = JsonMissing.of()
            private var denominatorUnits: JsonField<DenominatorUnits> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(configurationValue: ConfigurationValue) = apply {
                numerator = configurationValue.numerator
                denominator = configurationValue.denominator
                denominatorUnits = configurationValue.denominatorUnits
                additionalProperties = configurationValue.additionalProperties.toMutableMap()
            }

            /** The rate numerator */
            fun numerator(numerator: Long) = numerator(JsonField.of(numerator))

            /**
             * Sets [Builder.numerator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numerator] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numerator(numerator: JsonField<Long>) = apply { this.numerator = numerator }

            /** The rate limit denominator */
            fun denominator(denominator: Long?) = denominator(JsonField.ofNullable(denominator))

            /**
             * Alias for [Builder.denominator].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun denominator(denominator: Long) = denominator(denominator as Long?)

            /** Alias for calling [Builder.denominator] with `denominator.orElse(null)`. */
            fun denominator(denominator: Optional<Long>) = denominator(denominator.getOrNull())

            /**
             * Sets [Builder.denominator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.denominator] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun denominator(denominator: JsonField<Long>) = apply { this.denominator = denominator }

            /** The default rate limit denominator units */
            fun denominatorUnits(denominatorUnits: DenominatorUnits?) =
                denominatorUnits(JsonField.ofNullable(denominatorUnits))

            /**
             * Alias for calling [Builder.denominatorUnits] with `denominatorUnits.orElse(null)`.
             */
            fun denominatorUnits(denominatorUnits: Optional<DenominatorUnits>) =
                denominatorUnits(denominatorUnits.getOrNull())

            /**
             * Sets [Builder.denominatorUnits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.denominatorUnits] with a well-typed
             * [DenominatorUnits] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun denominatorUnits(denominatorUnits: JsonField<DenominatorUnits>) = apply {
                this.denominatorUnits = denominatorUnits
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
             * Returns an immutable instance of [ConfigurationValue].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .numerator()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ConfigurationValue =
                ConfigurationValue(
                    checkRequired("numerator", numerator),
                    denominator,
                    denominatorUnits,
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
        fun validate(): ConfigurationValue = apply {
            if (validated) {
                return@apply
            }

            numerator()
            denominator()
            denominatorUnits().ifPresent { it.validate() }
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
            (if (numerator.asKnown().isPresent) 1 else 0) +
                (if (denominator.asKnown().isPresent) 1 else 0) +
                (denominatorUnits.asKnown().getOrNull()?.validity() ?: 0)

        /** The default rate limit denominator units */
        class DenominatorUnits
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DAY = of("day")

                @JvmField val HOUR = of("hour")

                @JvmField val MINUTE = of("minute")

                @JvmField val SECOND = of("second")

                @JvmStatic fun of(value: String) = DenominatorUnits(JsonField.of(value))
            }

            /** An enum containing [DenominatorUnits]'s known values. */
            enum class Known {
                DAY,
                HOUR,
                MINUTE,
                SECOND,
            }

            /**
             * An enum containing [DenominatorUnits]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [DenominatorUnits] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DAY,
                HOUR,
                MINUTE,
                SECOND,
                /**
                 * An enum member indicating that [DenominatorUnits] was instantiated with an
                 * unknown value.
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
                    DAY -> Value.DAY
                    HOUR -> Value.HOUR
                    MINUTE -> Value.MINUTE
                    SECOND -> Value.SECOND
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
                    DAY -> Known.DAY
                    HOUR -> Known.HOUR
                    MINUTE -> Known.MINUTE
                    SECOND -> Known.SECOND
                    else ->
                        throw LlamaCloudAdminInvalidDataException(
                            "Unknown DenominatorUnits: $value"
                        )
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
            fun validate(): DenominatorUnits = apply {
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

                return other is DenominatorUnits && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConfigurationValue &&
                numerator == other.numerator &&
                denominator == other.denominator &&
                denominatorUnits == other.denominatorUnits &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(numerator, denominator, denominatorUnits, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConfigurationValue{numerator=$numerator, denominator=$denominator, denominatorUnits=$denominatorUnits, additionalProperties=$additionalProperties}"
    }

    /** The source type, e.g. 'organization' */
    class SourceType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val GLOBAL = of("GLOBAL")

            @JvmField val ORGANIZATION = of("organization")

            @JvmField val PLAN_TIER = of("plan_tier")

            @JvmField val PROJECT = of("project")

            @JvmStatic fun of(value: String) = SourceType(JsonField.of(value))
        }

        /** An enum containing [SourceType]'s known values. */
        enum class Known {
            GLOBAL,
            ORGANIZATION,
            PLAN_TIER,
            PROJECT,
        }

        /**
         * An enum containing [SourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GLOBAL,
            ORGANIZATION,
            PLAN_TIER,
            PROJECT,
            /**
             * An enum member indicating that [SourceType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                GLOBAL -> Value.GLOBAL
                ORGANIZATION -> Value.ORGANIZATION
                PLAN_TIER -> Value.PLAN_TIER
                PROJECT -> Value.PROJECT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaCloudAdminInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                GLOBAL -> Known.GLOBAL
                ORGANIZATION -> Known.ORGANIZATION
                PLAN_TIER -> Known.PLAN_TIER
                PROJECT -> Known.PROJECT
                else -> throw LlamaCloudAdminInvalidDataException("Unknown SourceType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaCloudAdminInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudAdminInvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
        fun validate(): SourceType = apply {
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

            return other is SourceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The status of the quota, i.e. 'ACTIVE' or 'INACTIVE' */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("ACTIVE")

            @JvmField val INACTIVE = of("INACTIVE")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            INACTIVE,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaCloudAdminInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                INACTIVE -> Known.INACTIVE
                else -> throw LlamaCloudAdminInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaCloudAdminInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
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

        return other is QuotaConfiguration &&
            configurationMetadata == other.configurationMetadata &&
            configurationType == other.configurationType &&
            configurationValue == other.configurationValue &&
            sourceId == other.sourceId &&
            sourceType == other.sourceType &&
            status == other.status &&
            id == other.id &&
            createdAt == other.createdAt &&
            endedAt == other.endedAt &&
            idempotencyKey == other.idempotencyKey &&
            startedAt == other.startedAt &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            configurationMetadata,
            configurationType,
            configurationValue,
            sourceId,
            sourceType,
            status,
            id,
            createdAt,
            endedAt,
            idempotencyKey,
            startedAt,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QuotaConfiguration{configurationMetadata=$configurationMetadata, configurationType=$configurationType, configurationValue=$configurationValue, sourceId=$sourceId, sourceType=$sourceType, status=$status, id=$id, createdAt=$createdAt, endedAt=$endedAt, idempotencyKey=$idempotencyKey, startedAt=$startedAt, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
