// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin.usagemetrics

import ai.llamaindex.llamacloudadmin.core.BaseDeserializer
import ai.llamaindex.llamacloudadmin.core.BaseSerializer
import ai.llamaindex.llamacloudadmin.core.Enum
import ai.llamaindex.llamacloudadmin.core.ExcludeMissing
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.JsonMissing
import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.allMaxBy
import ai.llamaindex.llamacloudadmin.core.checkKnown
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.core.getOrThrow
import ai.llamaindex.llamacloudadmin.core.toImmutable
import ai.llamaindex.llamacloudadmin.errors.LlamaCloudAdminInvalidDataException
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricAggregateResponse
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response containing usage metrics aggregated by one or more dimensions. */
class UsageMetricAggregateResponse @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
    private val buckets: JsonField<List<Bucket>>,
    private val groupBy: JsonField<List<GroupBy>>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("buckets") @ExcludeMissing buckets: JsonField<List<Bucket>> = JsonMissing.of(),
        @JsonProperty("group_by") @ExcludeMissing groupBy: JsonField<List<GroupBy>> = JsonMissing.of()
    ) : this(
      buckets,
      groupBy,
      mutableMapOf(),
    )

    /**
     * The aggregation buckets, ordered by total credits descending
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun buckets(): List<Bucket> = buckets.getRequired("buckets")

    /**
     * The dimensions the metrics were grouped by
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun groupBy(): List<GroupBy> = groupBy.getRequired("group_by")

    /**
     * Returns the raw JSON value of [buckets].
     *
     * Unlike [buckets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("buckets")
    @ExcludeMissing
    fun _buckets(): JsonField<List<Bucket>> = buckets

    /**
     * Returns the raw JSON value of [groupBy].
     *
     * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_by")
    @ExcludeMissing
    fun _groupBy(): JsonField<List<GroupBy>> = groupBy

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
         * Returns a mutable builder for constructing an instance of [UsageMetricAggregateResponse].
         *
         * The following fields are required:
         *
         * ```java
         * .buckets()
         * .groupBy()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [UsageMetricAggregateResponse]. */
    class Builder internal constructor() {

        private var buckets: JsonField<MutableList<Bucket>>? = null
        private var groupBy: JsonField<MutableList<GroupBy>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageMetricAggregateResponse: UsageMetricAggregateResponse) =
            apply {
                buckets = usageMetricAggregateResponse.buckets.map { it.toMutableList() }
                groupBy = usageMetricAggregateResponse.groupBy.map { it.toMutableList() }
                additionalProperties = usageMetricAggregateResponse.additionalProperties.toMutableMap()
            }

        /** The aggregation buckets, ordered by total credits descending */
        fun buckets(buckets: List<Bucket>) = buckets(JsonField.of(buckets))

        /**
         * Sets [Builder.buckets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buckets] with a well-typed `List<Bucket>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun buckets(buckets: JsonField<List<Bucket>>) =
            apply {
                this.buckets = buckets.map { it.toMutableList() }
            }

        /**
         * Adds a single [Bucket] to [buckets].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBucket(bucket: Bucket) =
            apply {
                buckets = (buckets ?: JsonField.of(mutableListOf())).also {
                    checkKnown("buckets", it).add(bucket)
                }
            }

        /** The dimensions the metrics were grouped by */
        fun groupBy(groupBy: List<GroupBy>) = groupBy(JsonField.of(groupBy))

        /**
         * Sets [Builder.groupBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupBy] with a well-typed `List<GroupBy>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun groupBy(groupBy: JsonField<List<GroupBy>>) =
            apply {
                this.groupBy = groupBy.map { it.toMutableList() }
            }

        /**
         * Adds a single [GroupBy] to [Builder.groupBy].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroupBy(groupBy: GroupBy) =
            apply {
                this.groupBy = (this.groupBy ?: JsonField.of(mutableListOf())).also {
                    checkKnown("groupBy", it).add(groupBy)
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
         * Returns an immutable instance of [UsageMetricAggregateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .buckets()
         * .groupBy()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageMetricAggregateResponse =
            UsageMetricAggregateResponse(
              checkRequired(
                "buckets", buckets
              ).map { it.toImmutable() },
              checkRequired(
                "groupBy", groupBy
              ).map { it.toImmutable() },
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
    fun validate(): UsageMetricAggregateResponse =
        apply {
            if (validated) {
              return@apply
            }

            buckets().forEach { it.validate() }
            groupBy().forEach { it.validate() }
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
    internal fun validity(): Int = (buckets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (groupBy.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** A single aggregation bucket grouped by the requested dimensions. */
    class Bucket @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
        private val dimensions: JsonField<Dimensions>,
        private val metricCount: JsonField<Long>,
        private val totalCredits: JsonField<TotalCredits>,
        private val totalValue: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,

    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dimensions") @ExcludeMissing dimensions: JsonField<Dimensions> = JsonMissing.of(),
            @JsonProperty("metric_count") @ExcludeMissing metricCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_credits") @ExcludeMissing totalCredits: JsonField<TotalCredits> = JsonMissing.of(),
            @JsonProperty("total_value") @ExcludeMissing totalValue: JsonField<Long> = JsonMissing.of()
        ) : this(
          dimensions,
          metricCount,
          totalCredits,
          totalValue,
          mutableMapOf(),
        )

        /**
         * The dimension values that define this bucket
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dimensions(): Dimensions = dimensions.getRequired("dimensions")

        /**
         * Number of metric rows in this bucket
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metricCount(): Long = metricCount.getRequired("metric_count")

        /**
         * Total credits consumed by metrics in this bucket
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalCredits(): TotalCredits = totalCredits.getRequired("total_credits")

        /**
         * Total of the metric `value` field in this bucket
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalValue(): Long = totalValue.getRequired("total_value")

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<Dimensions> = dimensions

        /**
         * Returns the raw JSON value of [metricCount].
         *
         * Unlike [metricCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metric_count")
        @ExcludeMissing
        fun _metricCount(): JsonField<Long> = metricCount

        /**
         * Returns the raw JSON value of [totalCredits].
         *
         * Unlike [totalCredits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_credits")
        @ExcludeMissing
        fun _totalCredits(): JsonField<TotalCredits> = totalCredits

        /**
         * Returns the raw JSON value of [totalValue].
         *
         * Unlike [totalValue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_value")
        @ExcludeMissing
        fun _totalValue(): JsonField<Long> = totalValue

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
             * Returns a mutable builder for constructing an instance of [Bucket].
             *
             * The following fields are required:
             *
             * ```java
             * .dimensions()
             * .metricCount()
             * .totalCredits()
             * .totalValue()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Bucket]. */
        class Builder internal constructor() {

            private var dimensions: JsonField<Dimensions>? = null
            private var metricCount: JsonField<Long>? = null
            private var totalCredits: JsonField<TotalCredits>? = null
            private var totalValue: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bucket: Bucket) =
                apply {
                    dimensions = bucket.dimensions
                    metricCount = bucket.metricCount
                    totalCredits = bucket.totalCredits
                    totalValue = bucket.totalValue
                    additionalProperties = bucket.additionalProperties.toMutableMap()
                }

            /** The dimension values that define this bucket */
            fun dimensions(dimensions: Dimensions) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed [Dimensions] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<Dimensions>) =
                apply {
                    this.dimensions = dimensions
                }

            /** Number of metric rows in this bucket */
            fun metricCount(metricCount: Long) = metricCount(JsonField.of(metricCount))

            /**
             * Sets [Builder.metricCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metricCount] with a well-typed [Long] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metricCount(metricCount: JsonField<Long>) =
                apply {
                    this.metricCount = metricCount
                }

            /** Total credits consumed by metrics in this bucket */
            fun totalCredits(totalCredits: TotalCredits) = totalCredits(JsonField.of(totalCredits))

            /**
             * Sets [Builder.totalCredits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCredits] with a well-typed [TotalCredits] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCredits(totalCredits: JsonField<TotalCredits>) =
                apply {
                    this.totalCredits = totalCredits
                }

            /** Alias for calling [totalCredits] with `TotalCredits.ofNumber(number)`. */
            fun totalCredits(number: Double) = totalCredits(TotalCredits.ofNumber(number))

            /** Alias for calling [totalCredits] with `TotalCredits.ofString(string)`. */
            fun totalCredits(string: String) = totalCredits(TotalCredits.ofString(string))

            /** Total of the metric `value` field in this bucket */
            fun totalValue(totalValue: Long) = totalValue(JsonField.of(totalValue))

            /**
             * Sets [Builder.totalValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalValue] with a well-typed [Long] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalValue(totalValue: JsonField<Long>) =
                apply {
                    this.totalValue = totalValue
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
             * Returns an immutable instance of [Bucket].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             *
             * ```java
             * .dimensions()
             * .metricCount()
             * .totalCredits()
             * .totalValue()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Bucket =
                Bucket(
                  checkRequired(
                    "dimensions", dimensions
                  ),
                  checkRequired(
                    "metricCount", metricCount
                  ),
                  checkRequired(
                    "totalCredits", totalCredits
                  ),
                  checkRequired(
                    "totalValue", totalValue
                  ),
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
        fun validate(): Bucket =
            apply {
                if (validated) {
                  return@apply
                }

                dimensions().validate()
                metricCount()
                totalCredits().validate()
                totalValue()
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
        internal fun validity(): Int = (dimensions.asKnown().getOrNull()?.validity() ?: 0) + (if (metricCount.asKnown().isPresent) 1 else 0) + (totalCredits.asKnown().getOrNull()?.validity() ?: 0) + (if (totalValue.asKnown().isPresent) 1 else 0)

        /** The dimension values that define this bucket */
        class Dimensions @JsonCreator private constructor(
            @com.fasterxml.jackson.annotation.JsonValue private val additionalProperties: Map<String, JsonValue>,

        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Dimensions]. */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [Dimensions]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dimensions: Dimensions) =
                    apply {
                        additionalProperties = dimensions.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Dimensions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Dimensions = Dimensions(additionalProperties.toImmutable())
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
            fun validate(): Dimensions =
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

              return other is Dimensions && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Dimensions{additionalProperties=$additionalProperties}"
        }

        /** Total credits consumed by metrics in this bucket */
        @JsonDeserialize(using = TotalCredits.Deserializer::class)
        @JsonSerialize(using = TotalCredits.Serializer::class)
        class TotalCredits private constructor(
            private val number: Double? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,

        ) {

            fun number(): Optional<Double> = Optional.ofNullable(number)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isNumber(): Boolean = number != null

            fun isString(): Boolean = string != null

            fun asNumber(): Double = number.getOrThrow("number")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API, unless
             * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the SDK
             * gracefully, consider overriding [Visitor.unknown]:
             *
             * ```java
             * import ai.llamaindex.llamacloudadmin.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = totalCredits.accept(new TotalCredits.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitNumber(Double number) {
             *         return Optional.of(number.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws LlamaCloudAdminInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    number != null -> visitor.visitNumber(number)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
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
            fun validate(): TotalCredits =
                apply {
                    if (validated) {
                      return@apply
                    }

                    accept(object : Visitor<Unit> {
                        override fun visitNumber(number: Double) {

                        }

                        override fun visitString(string: String) {

                        }
                    })
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
                accept(object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                })

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is TotalCredits && number == other.number && string == other.string
            }

            override fun hashCode(): Int = Objects.hash(number, string)

            override fun toString(): String =
                when {
                    number != null -> "TotalCredits{number=$number}"
                    string != null -> "TotalCredits{string=$string}"
                    _json != null -> "TotalCredits{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid TotalCredits")
                }

            companion object {

                @JvmStatic
                fun ofNumber(number: Double) = TotalCredits(number = number)

                @JvmStatic
                fun ofString(string: String) = TotalCredits(string = string)
            }

            /** An interface that defines how to map each variant of [TotalCredits] to a value of type [T]. */
            interface Visitor<out T> {

                fun visitNumber(number: Double): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [TotalCredits] to a value of type [T].
                 *
                 * An instance of [TotalCredits] can contain an unknown variant if it was deserialized from data
                 * that doesn't match any known variant. For example, if the SDK is on an older version than the
                 * API, then the API may respond with new variants that the SDK is unaware of.
                 *
                 * @throws LlamaCloudAdminInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                  throw LlamaCloudAdminInvalidDataException("Unknown TotalCredits: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<TotalCredits>(TotalCredits::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): TotalCredits {
                  val json = JsonValue.fromJsonNode(node)

                  val bestMatches = sequenceOf(
                          tryDeserialize(node, jacksonTypeRef<String>())
                              ?.let {
                                  TotalCredits(string = it, _json = json)
                              },
                          tryDeserialize(node, jacksonTypeRef<Double>())
                              ?.let {
                                  TotalCredits(number = it, _json = json)
                              }
                      )
                      .filterNotNull()
                      .allMaxBy { it.validity() }
                      .toList()
                  return when (bestMatches.size) {
                      // This can happen if what we're deserializing is completely incompatible with all the possible variants (e.g. deserializing from boolean).
                      0 -> TotalCredits(_json = json)
                      1 -> bestMatches.single()
                      // If there's more than one match with the highest validity, then use the first completely valid match, or simply the first match if none are completely valid.
                      else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                  }
                }
            }

            internal class Serializer : BaseSerializer<TotalCredits>(TotalCredits::class) {

                override fun serialize(value: TotalCredits, generator: JsonGenerator, provider: SerializerProvider) {
                  when {
                      value.number != null -> generator.writeObject(value.number)
                      value.string != null -> generator.writeObject(value.string)
                      value._json != null -> generator.writeObject(value._json)
                      else -> throw IllegalStateException("Invalid TotalCredits")
                  }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Bucket && dimensions == other.dimensions && metricCount == other.metricCount && totalCredits == other.totalCredits && totalValue == other.totalValue && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(dimensions, metricCount, totalCredits, totalValue, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Bucket{dimensions=$dimensions, metricCount=$metricCount, totalCredits=$totalCredits, totalValue=$totalValue, additionalProperties=$additionalProperties}"
    }

    class GroupBy @JsonCreator private constructor(
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

            @JvmField val DAY = of("day")

            @JvmField val EVENT_TYPE = of("event_type")

            @JvmField val ORGANIZATION_ID = of("organization_id")

            @JvmField val PROJECT_ID = of("project_id")

            @JvmField val USER_ID = of("user_id")

            @JvmStatic fun of(value: String) = GroupBy(JsonField.of(value))
        }

        /** An enum containing [GroupBy]'s known values. */
        enum class Known {
            DAY,
            EVENT_TYPE,
            ORGANIZATION_ID,
            PROJECT_ID,
            USER_ID,
        }

        /**
         * An enum containing [GroupBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [GroupBy] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
         *   an older version than the API, then the API may respond with new members that the SDK is unaware
         *   of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DAY,
            EVENT_TYPE,
            ORGANIZATION_ID,
            PROJECT_ID,
            USER_ID,
            /** An enum member indicating that [GroupBy] was instantiated with an unknown value. */
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
                DAY -> Value.DAY
                EVENT_TYPE -> Value.EVENT_TYPE
                ORGANIZATION_ID -> Value.ORGANIZATION_ID
                PROJECT_ID -> Value.PROJECT_ID
                USER_ID -> Value.USER_ID
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
                DAY -> Known.DAY
                EVENT_TYPE -> Known.EVENT_TYPE
                ORGANIZATION_ID -> Known.ORGANIZATION_ID
                PROJECT_ID -> Known.PROJECT_ID
                USER_ID -> Known.USER_ID
                else -> throw LlamaCloudAdminInvalidDataException("Unknown GroupBy: $value")
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
        fun validate(): GroupBy =
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

          return other is GroupBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is UsageMetricAggregateResponse && buckets == other.buckets && groupBy == other.groupBy && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(buckets, groupBy, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "UsageMetricAggregateResponse{buckets=$buckets, groupBy=$groupBy, additionalProperties=$additionalProperties}"
}
