// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UsageAndPlan
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val plan: JsonField<Plan>,
    private val usage: JsonField<Usage>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("plan") @ExcludeMissing plan: JsonField<Plan> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
    ) : this(plan, usage, mutableMapOf())

    /**
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun plan(): Plan = plan.getRequired("plan")

    /**
     * Account usage totals shown alongside the plan.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usage(): Usage = usage.getRequired("usage")

    /**
     * Returns the raw JSON value of [plan].
     *
     * Unlike [plan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

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
         * Returns a mutable builder for constructing an instance of [UsageAndPlan].
         *
         * The following fields are required:
         * ```java
         * .plan()
         * .usage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageAndPlan]. */
    class Builder internal constructor() {

        private var plan: JsonField<Plan>? = null
        private var usage: JsonField<Usage>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageAndPlan: UsageAndPlan) = apply {
            plan = usageAndPlan.plan
            usage = usageAndPlan.usage
            additionalProperties = usageAndPlan.additionalProperties.toMutableMap()
        }

        fun plan(plan: Plan) = plan(JsonField.of(plan))

        /**
         * Sets [Builder.plan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plan] with a well-typed [Plan] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** Account usage totals shown alongside the plan. */
        fun usage(usage: Usage) = usage(JsonField.of(usage))

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

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
         * Returns an immutable instance of [UsageAndPlan].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .plan()
         * .usage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageAndPlan =
            UsageAndPlan(
                checkRequired("plan", plan),
                checkRequired("usage", usage),
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
    fun validate(): UsageAndPlan = apply {
        if (validated) {
            return@apply
        }

        plan().validate()
        usage().validate()
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
        (plan.asKnown().getOrNull()?.validity() ?: 0) +
            (usage.asKnown().getOrNull()?.validity() ?: 0)

    class Plan
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val limits: JsonField<Limits>,
        private val name: JsonField<Name>,
        private val planFrequency: JsonField<PlanFrequency>,
        private val id: JsonField<String>,
        private val currentBillingPeriod: JsonField<CurrentBillingPeriod>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val failureCount: JsonField<Long>,
        private val isPaymentFailed: JsonField<Boolean>,
        private val recurringCredits: JsonField<List<RecurringCredit>>,
        private val startingOn: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("limits") @ExcludeMissing limits: JsonField<Limits> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<Name> = JsonMissing.of(),
            @JsonProperty("plan_frequency")
            @ExcludeMissing
            planFrequency: JsonField<PlanFrequency> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("current_billing_period")
            @ExcludeMissing
            currentBillingPeriod: JsonField<CurrentBillingPeriod> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("failure_count")
            @ExcludeMissing
            failureCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("is_payment_failed")
            @ExcludeMissing
            isPaymentFailed: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("recurring_credits")
            @ExcludeMissing
            recurringCredits: JsonField<List<RecurringCredit>> = JsonMissing.of(),
            @JsonProperty("starting_on")
            @ExcludeMissing
            startingOn: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            limits,
            name,
            planFrequency,
            id,
            currentBillingPeriod,
            endingBefore,
            failureCount,
            isPaymentFailed,
            recurringCredits,
            startingOn,
            mutableMapOf(),
        )

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun limits(): Limits = limits.getRequired("limits")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun name(): Name = name.getRequired("name")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun planFrequency(): PlanFrequency = planFrequency.getRequired("plan_frequency")

        /**
         * The ID of the plan in Metronome
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The current billing period
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currentBillingPeriod(): Optional<CurrentBillingPeriod> =
            currentBillingPeriod.getOptional("current_billing_period")

        /**
         * The date the plan ends on
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * The number of payment failures for this organization
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun failureCount(): Optional<Long> = failureCount.getOptional("failure_count")

        /**
         * Whether the organization has a failed payment that requires support contact
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun isPaymentFailed(): Optional<Boolean> = isPaymentFailed.getOptional("is_payment_failed")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun recurringCredits(): Optional<List<RecurringCredit>> =
            recurringCredits.getOptional("recurring_credits")

        /**
         * The date the plan starts on
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun startingOn(): Optional<OffsetDateTime> = startingOn.getOptional("starting_on")

        /**
         * Returns the raw JSON value of [limits].
         *
         * Unlike [limits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limits") @ExcludeMissing fun _limits(): JsonField<Limits> = limits

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Name> = name

        /**
         * Returns the raw JSON value of [planFrequency].
         *
         * Unlike [planFrequency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plan_frequency")
        @ExcludeMissing
        fun _planFrequency(): JsonField<PlanFrequency> = planFrequency

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [currentBillingPeriod].
         *
         * Unlike [currentBillingPeriod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("current_billing_period")
        @ExcludeMissing
        fun _currentBillingPeriod(): JsonField<CurrentBillingPeriod> = currentBillingPeriod

        /**
         * Returns the raw JSON value of [endingBefore].
         *
         * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /**
         * Returns the raw JSON value of [failureCount].
         *
         * Unlike [failureCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("failure_count")
        @ExcludeMissing
        fun _failureCount(): JsonField<Long> = failureCount

        /**
         * Returns the raw JSON value of [isPaymentFailed].
         *
         * Unlike [isPaymentFailed], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_payment_failed")
        @ExcludeMissing
        fun _isPaymentFailed(): JsonField<Boolean> = isPaymentFailed

        /**
         * Returns the raw JSON value of [recurringCredits].
         *
         * Unlike [recurringCredits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recurring_credits")
        @ExcludeMissing
        fun _recurringCredits(): JsonField<List<RecurringCredit>> = recurringCredits

        /**
         * Returns the raw JSON value of [startingOn].
         *
         * Unlike [startingOn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_on")
        @ExcludeMissing
        fun _startingOn(): JsonField<OffsetDateTime> = startingOn

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
             * Returns a mutable builder for constructing an instance of [Plan].
             *
             * The following fields are required:
             * ```java
             * .limits()
             * .name()
             * .planFrequency()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Plan]. */
        class Builder internal constructor() {

            private var limits: JsonField<Limits>? = null
            private var name: JsonField<Name>? = null
            private var planFrequency: JsonField<PlanFrequency>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var currentBillingPeriod: JsonField<CurrentBillingPeriod> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var failureCount: JsonField<Long> = JsonMissing.of()
            private var isPaymentFailed: JsonField<Boolean> = JsonMissing.of()
            private var recurringCredits: JsonField<MutableList<RecurringCredit>>? = null
            private var startingOn: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(plan: Plan) = apply {
                limits = plan.limits
                name = plan.name
                planFrequency = plan.planFrequency
                id = plan.id
                currentBillingPeriod = plan.currentBillingPeriod
                endingBefore = plan.endingBefore
                failureCount = plan.failureCount
                isPaymentFailed = plan.isPaymentFailed
                recurringCredits = plan.recurringCredits.map { it.toMutableList() }
                startingOn = plan.startingOn
                additionalProperties = plan.additionalProperties.toMutableMap()
            }

            fun limits(limits: Limits) = limits(JsonField.of(limits))

            /**
             * Sets [Builder.limits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limits] with a well-typed [Limits] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun limits(limits: JsonField<Limits>) = apply { this.limits = limits }

            fun name(name: Name) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [Name] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<Name>) = apply { this.name = name }

            fun planFrequency(planFrequency: PlanFrequency) =
                planFrequency(JsonField.of(planFrequency))

            /**
             * Sets [Builder.planFrequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planFrequency] with a well-typed [PlanFrequency]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun planFrequency(planFrequency: JsonField<PlanFrequency>) = apply {
                this.planFrequency = planFrequency
            }

            /** The ID of the plan in Metronome */
            fun id(id: String?) = id(JsonField.ofNullable(id))

            /** Alias for calling [Builder.id] with `id.orElse(null)`. */
            fun id(id: Optional<String>) = id(id.getOrNull())

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The current billing period */
            fun currentBillingPeriod(currentBillingPeriod: CurrentBillingPeriod?) =
                currentBillingPeriod(JsonField.ofNullable(currentBillingPeriod))

            /**
             * Alias for calling [Builder.currentBillingPeriod] with
             * `currentBillingPeriod.orElse(null)`.
             */
            fun currentBillingPeriod(currentBillingPeriod: Optional<CurrentBillingPeriod>) =
                currentBillingPeriod(currentBillingPeriod.getOrNull())

            /**
             * Sets [Builder.currentBillingPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentBillingPeriod] with a well-typed
             * [CurrentBillingPeriod] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun currentBillingPeriod(currentBillingPeriod: JsonField<CurrentBillingPeriod>) =
                apply {
                    this.currentBillingPeriod = currentBillingPeriod
                }

            /** The date the plan ends on */
            fun endingBefore(endingBefore: OffsetDateTime?) =
                endingBefore(JsonField.ofNullable(endingBefore))

            /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
            fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
                endingBefore(endingBefore.getOrNull())

            /**
             * Sets [Builder.endingBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            /** The number of payment failures for this organization */
            fun failureCount(failureCount: Long) = failureCount(JsonField.of(failureCount))

            /**
             * Sets [Builder.failureCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failureCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun failureCount(failureCount: JsonField<Long>) = apply {
                this.failureCount = failureCount
            }

            /** Whether the organization has a failed payment that requires support contact */
            fun isPaymentFailed(isPaymentFailed: Boolean) =
                isPaymentFailed(JsonField.of(isPaymentFailed))

            /**
             * Sets [Builder.isPaymentFailed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isPaymentFailed] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isPaymentFailed(isPaymentFailed: JsonField<Boolean>) = apply {
                this.isPaymentFailed = isPaymentFailed
            }

            fun recurringCredits(recurringCredits: List<RecurringCredit>?) =
                recurringCredits(JsonField.ofNullable(recurringCredits))

            /**
             * Alias for calling [Builder.recurringCredits] with `recurringCredits.orElse(null)`.
             */
            fun recurringCredits(recurringCredits: Optional<List<RecurringCredit>>) =
                recurringCredits(recurringCredits.getOrNull())

            /**
             * Sets [Builder.recurringCredits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recurringCredits] with a well-typed
             * `List<RecurringCredit>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun recurringCredits(recurringCredits: JsonField<List<RecurringCredit>>) = apply {
                this.recurringCredits = recurringCredits.map { it.toMutableList() }
            }

            /**
             * Adds a single [RecurringCredit] to [recurringCredits].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRecurringCredit(recurringCredit: RecurringCredit) = apply {
                recurringCredits =
                    (recurringCredits ?: JsonField.of(mutableListOf())).also {
                        checkKnown("recurringCredits", it).add(recurringCredit)
                    }
            }

            /** The date the plan starts on */
            fun startingOn(startingOn: OffsetDateTime?) =
                startingOn(JsonField.ofNullable(startingOn))

            /** Alias for calling [Builder.startingOn] with `startingOn.orElse(null)`. */
            fun startingOn(startingOn: Optional<OffsetDateTime>) =
                startingOn(startingOn.getOrNull())

            /**
             * Sets [Builder.startingOn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingOn] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingOn(startingOn: JsonField<OffsetDateTime>) = apply {
                this.startingOn = startingOn
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
             * Returns an immutable instance of [Plan].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .limits()
             * .name()
             * .planFrequency()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Plan =
                Plan(
                    checkRequired("limits", limits),
                    checkRequired("name", name),
                    checkRequired("planFrequency", planFrequency),
                    id,
                    currentBillingPeriod,
                    endingBefore,
                    failureCount,
                    isPaymentFailed,
                    (recurringCredits ?: JsonMissing.of()).map { it.toImmutable() },
                    startingOn,
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
        fun validate(): Plan = apply {
            if (validated) {
                return@apply
            }

            limits().validate()
            name().validate()
            planFrequency().validate()
            id()
            currentBillingPeriod().ifPresent { it.validate() }
            endingBefore()
            failureCount()
            isPaymentFailed()
            recurringCredits().ifPresent { it.forEach { it.validate() } }
            startingOn()
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
            (limits.asKnown().getOrNull()?.validity() ?: 0) +
                (name.asKnown().getOrNull()?.validity() ?: 0) +
                (planFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (currentBillingPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (if (failureCount.asKnown().isPresent) 1 else 0) +
                (if (isPaymentFailed.asKnown().isPresent) 1 else 0) +
                (recurringCredits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (startingOn.asKnown().isPresent) 1 else 0)

        class Limits
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val allowPayAsYouGo: JsonField<Boolean>,
            private val maxConcurrentIndexJobs: JsonField<Long>,
            private val maxConcurrentParseJobsOther: JsonField<Long>,
            private val maxConcurrentParseJobsPremium: JsonField<Long>,
            private val maxDataSinks: JsonField<Long>,
            private val maxDataSources: JsonField<Long>,
            private val maxEmbeddingModels: JsonField<Long>,
            private val maxExtractionAgents: JsonField<Long>,
            private val maxExtractionJobs: JsonField<Long>,
            private val maxExtractionRuns: JsonField<Long>,
            private val maxFilesPerIndex: JsonField<Long>,
            private val maxIndexes: JsonField<Long>,
            private val maxMonthlyInvoiceTotalUsd: JsonField<Long>,
            private val maxOrganizations: JsonField<Long>,
            private val maxPagesPerIndex: JsonField<Long>,
            private val maxProjects: JsonField<Long>,
            private val maxPublishedAgents: JsonField<Long>,
            private val maxReportAgentSessions: JsonField<Long>,
            private val maxUsers: JsonField<Long>,
            private val mfaEnabled: JsonField<Boolean>,
            private val ssoEnabled: JsonField<Boolean>,
            private val subscriptionCostUsd: JsonField<Long>,
            private val maxDirectories: JsonField<Long>,
            private val maxDirectoryFilesPerDirectory: JsonField<Long>,
            private val maxDirectoryIngestFiles: JsonField<Long>,
            private val maxDirectorySyncPlanActions: JsonField<Long>,
            private val spendingSoftAlertsUsdCents: JsonField<List<Long>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("allow_pay_as_you_go")
                @ExcludeMissing
                allowPayAsYouGo: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("max_concurrent_index_jobs")
                @ExcludeMissing
                maxConcurrentIndexJobs: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_concurrent_parse_jobs_other")
                @ExcludeMissing
                maxConcurrentParseJobsOther: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_concurrent_parse_jobs_premium")
                @ExcludeMissing
                maxConcurrentParseJobsPremium: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_data_sinks")
                @ExcludeMissing
                maxDataSinks: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_data_sources")
                @ExcludeMissing
                maxDataSources: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_embedding_models")
                @ExcludeMissing
                maxEmbeddingModels: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_extraction_agents")
                @ExcludeMissing
                maxExtractionAgents: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_extraction_jobs")
                @ExcludeMissing
                maxExtractionJobs: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_extraction_runs")
                @ExcludeMissing
                maxExtractionRuns: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_files_per_index")
                @ExcludeMissing
                maxFilesPerIndex: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_indexes")
                @ExcludeMissing
                maxIndexes: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_monthly_invoice_total_usd")
                @ExcludeMissing
                maxMonthlyInvoiceTotalUsd: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_organizations")
                @ExcludeMissing
                maxOrganizations: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_pages_per_index")
                @ExcludeMissing
                maxPagesPerIndex: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_projects")
                @ExcludeMissing
                maxProjects: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_published_agents")
                @ExcludeMissing
                maxPublishedAgents: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_report_agent_sessions")
                @ExcludeMissing
                maxReportAgentSessions: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_users")
                @ExcludeMissing
                maxUsers: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("mfa_enabled")
                @ExcludeMissing
                mfaEnabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("sso_enabled")
                @ExcludeMissing
                ssoEnabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("subscription_cost_usd")
                @ExcludeMissing
                subscriptionCostUsd: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_directories")
                @ExcludeMissing
                maxDirectories: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_directory_files_per_directory")
                @ExcludeMissing
                maxDirectoryFilesPerDirectory: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_directory_ingest_files")
                @ExcludeMissing
                maxDirectoryIngestFiles: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_directory_sync_plan_actions")
                @ExcludeMissing
                maxDirectorySyncPlanActions: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("spending_soft_alerts_usd_cents")
                @ExcludeMissing
                spendingSoftAlertsUsdCents: JsonField<List<Long>> = JsonMissing.of(),
            ) : this(
                allowPayAsYouGo,
                maxConcurrentIndexJobs,
                maxConcurrentParseJobsOther,
                maxConcurrentParseJobsPremium,
                maxDataSinks,
                maxDataSources,
                maxEmbeddingModels,
                maxExtractionAgents,
                maxExtractionJobs,
                maxExtractionRuns,
                maxFilesPerIndex,
                maxIndexes,
                maxMonthlyInvoiceTotalUsd,
                maxOrganizations,
                maxPagesPerIndex,
                maxProjects,
                maxPublishedAgents,
                maxReportAgentSessions,
                maxUsers,
                mfaEnabled,
                ssoEnabled,
                subscriptionCostUsd,
                maxDirectories,
                maxDirectoryFilesPerDirectory,
                maxDirectoryIngestFiles,
                maxDirectorySyncPlanActions,
                spendingSoftAlertsUsdCents,
                mutableMapOf(),
            )

            /**
             * Whether usage is allowed after credit grants are exhausted
             *
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun allowPayAsYouGo(): Boolean = allowPayAsYouGo.getRequired("allow_pay_as_you_go")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxConcurrentIndexJobs(): Optional<Long> =
                maxConcurrentIndexJobs.getOptional("max_concurrent_index_jobs")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxConcurrentParseJobsOther(): Optional<Long> =
                maxConcurrentParseJobsOther.getOptional("max_concurrent_parse_jobs_other")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxConcurrentParseJobsPremium(): Optional<Long> =
                maxConcurrentParseJobsPremium.getOptional("max_concurrent_parse_jobs_premium")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxDataSinks(): Optional<Long> = maxDataSinks.getOptional("max_data_sinks")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxDataSources(): Optional<Long> = maxDataSources.getOptional("max_data_sources")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxEmbeddingModels(): Optional<Long> =
                maxEmbeddingModels.getOptional("max_embedding_models")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxExtractionAgents(): Optional<Long> =
                maxExtractionAgents.getOptional("max_extraction_agents")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxExtractionJobs(): Optional<Long> =
                maxExtractionJobs.getOptional("max_extraction_jobs")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxExtractionRuns(): Optional<Long> =
                maxExtractionRuns.getOptional("max_extraction_runs")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxFilesPerIndex(): Optional<Long> =
                maxFilesPerIndex.getOptional("max_files_per_index")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxIndexes(): Optional<Long> = maxIndexes.getOptional("max_indexes")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxMonthlyInvoiceTotalUsd(): Optional<Long> =
                maxMonthlyInvoiceTotalUsd.getOptional("max_monthly_invoice_total_usd")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxOrganizations(): Optional<Long> =
                maxOrganizations.getOptional("max_organizations")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxPagesPerIndex(): Optional<Long> =
                maxPagesPerIndex.getOptional("max_pages_per_index")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxProjects(): Optional<Long> = maxProjects.getOptional("max_projects")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxPublishedAgents(): Optional<Long> =
                maxPublishedAgents.getOptional("max_published_agents")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxReportAgentSessions(): Optional<Long> =
                maxReportAgentSessions.getOptional("max_report_agent_sessions")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxUsers(): Optional<Long> = maxUsers.getOptional("max_users")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun mfaEnabled(): Boolean = mfaEnabled.getRequired("mfa_enabled")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ssoEnabled(): Boolean = ssoEnabled.getRequired("sso_enabled")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subscriptionCostUsd(): Long =
                subscriptionCostUsd.getRequired("subscription_cost_usd")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxDirectories(): Optional<Long> = maxDirectories.getOptional("max_directories")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxDirectoryFilesPerDirectory(): Optional<Long> =
                maxDirectoryFilesPerDirectory.getOptional("max_directory_files_per_directory")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxDirectoryIngestFiles(): Optional<Long> =
                maxDirectoryIngestFiles.getOptional("max_directory_ingest_files")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxDirectorySyncPlanActions(): Optional<Long> =
                maxDirectorySyncPlanActions.getOptional("max_directory_sync_plan_actions")

            /**
             * The amount of USD cents at which a soft alert should be triggered
             *
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun spendingSoftAlertsUsdCents(): Optional<List<Long>> =
                spendingSoftAlertsUsdCents.getOptional("spending_soft_alerts_usd_cents")

            /**
             * Returns the raw JSON value of [allowPayAsYouGo].
             *
             * Unlike [allowPayAsYouGo], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("allow_pay_as_you_go")
            @ExcludeMissing
            fun _allowPayAsYouGo(): JsonField<Boolean> = allowPayAsYouGo

            /**
             * Returns the raw JSON value of [maxConcurrentIndexJobs].
             *
             * Unlike [maxConcurrentIndexJobs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_concurrent_index_jobs")
            @ExcludeMissing
            fun _maxConcurrentIndexJobs(): JsonField<Long> = maxConcurrentIndexJobs

            /**
             * Returns the raw JSON value of [maxConcurrentParseJobsOther].
             *
             * Unlike [maxConcurrentParseJobsOther], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("max_concurrent_parse_jobs_other")
            @ExcludeMissing
            fun _maxConcurrentParseJobsOther(): JsonField<Long> = maxConcurrentParseJobsOther

            /**
             * Returns the raw JSON value of [maxConcurrentParseJobsPremium].
             *
             * Unlike [maxConcurrentParseJobsPremium], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("max_concurrent_parse_jobs_premium")
            @ExcludeMissing
            fun _maxConcurrentParseJobsPremium(): JsonField<Long> = maxConcurrentParseJobsPremium

            /**
             * Returns the raw JSON value of [maxDataSinks].
             *
             * Unlike [maxDataSinks], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_data_sinks")
            @ExcludeMissing
            fun _maxDataSinks(): JsonField<Long> = maxDataSinks

            /**
             * Returns the raw JSON value of [maxDataSources].
             *
             * Unlike [maxDataSources], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_data_sources")
            @ExcludeMissing
            fun _maxDataSources(): JsonField<Long> = maxDataSources

            /**
             * Returns the raw JSON value of [maxEmbeddingModels].
             *
             * Unlike [maxEmbeddingModels], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_embedding_models")
            @ExcludeMissing
            fun _maxEmbeddingModels(): JsonField<Long> = maxEmbeddingModels

            /**
             * Returns the raw JSON value of [maxExtractionAgents].
             *
             * Unlike [maxExtractionAgents], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_extraction_agents")
            @ExcludeMissing
            fun _maxExtractionAgents(): JsonField<Long> = maxExtractionAgents

            /**
             * Returns the raw JSON value of [maxExtractionJobs].
             *
             * Unlike [maxExtractionJobs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_extraction_jobs")
            @ExcludeMissing
            fun _maxExtractionJobs(): JsonField<Long> = maxExtractionJobs

            /**
             * Returns the raw JSON value of [maxExtractionRuns].
             *
             * Unlike [maxExtractionRuns], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_extraction_runs")
            @ExcludeMissing
            fun _maxExtractionRuns(): JsonField<Long> = maxExtractionRuns

            /**
             * Returns the raw JSON value of [maxFilesPerIndex].
             *
             * Unlike [maxFilesPerIndex], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_files_per_index")
            @ExcludeMissing
            fun _maxFilesPerIndex(): JsonField<Long> = maxFilesPerIndex

            /**
             * Returns the raw JSON value of [maxIndexes].
             *
             * Unlike [maxIndexes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_indexes")
            @ExcludeMissing
            fun _maxIndexes(): JsonField<Long> = maxIndexes

            /**
             * Returns the raw JSON value of [maxMonthlyInvoiceTotalUsd].
             *
             * Unlike [maxMonthlyInvoiceTotalUsd], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("max_monthly_invoice_total_usd")
            @ExcludeMissing
            fun _maxMonthlyInvoiceTotalUsd(): JsonField<Long> = maxMonthlyInvoiceTotalUsd

            /**
             * Returns the raw JSON value of [maxOrganizations].
             *
             * Unlike [maxOrganizations], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_organizations")
            @ExcludeMissing
            fun _maxOrganizations(): JsonField<Long> = maxOrganizations

            /**
             * Returns the raw JSON value of [maxPagesPerIndex].
             *
             * Unlike [maxPagesPerIndex], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_pages_per_index")
            @ExcludeMissing
            fun _maxPagesPerIndex(): JsonField<Long> = maxPagesPerIndex

            /**
             * Returns the raw JSON value of [maxProjects].
             *
             * Unlike [maxProjects], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_projects")
            @ExcludeMissing
            fun _maxProjects(): JsonField<Long> = maxProjects

            /**
             * Returns the raw JSON value of [maxPublishedAgents].
             *
             * Unlike [maxPublishedAgents], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_published_agents")
            @ExcludeMissing
            fun _maxPublishedAgents(): JsonField<Long> = maxPublishedAgents

            /**
             * Returns the raw JSON value of [maxReportAgentSessions].
             *
             * Unlike [maxReportAgentSessions], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_report_agent_sessions")
            @ExcludeMissing
            fun _maxReportAgentSessions(): JsonField<Long> = maxReportAgentSessions

            /**
             * Returns the raw JSON value of [maxUsers].
             *
             * Unlike [maxUsers], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_users") @ExcludeMissing fun _maxUsers(): JsonField<Long> = maxUsers

            /**
             * Returns the raw JSON value of [mfaEnabled].
             *
             * Unlike [mfaEnabled], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("mfa_enabled")
            @ExcludeMissing
            fun _mfaEnabled(): JsonField<Boolean> = mfaEnabled

            /**
             * Returns the raw JSON value of [ssoEnabled].
             *
             * Unlike [ssoEnabled], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sso_enabled")
            @ExcludeMissing
            fun _ssoEnabled(): JsonField<Boolean> = ssoEnabled

            /**
             * Returns the raw JSON value of [subscriptionCostUsd].
             *
             * Unlike [subscriptionCostUsd], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_cost_usd")
            @ExcludeMissing
            fun _subscriptionCostUsd(): JsonField<Long> = subscriptionCostUsd

            /**
             * Returns the raw JSON value of [maxDirectories].
             *
             * Unlike [maxDirectories], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_directories")
            @ExcludeMissing
            fun _maxDirectories(): JsonField<Long> = maxDirectories

            /**
             * Returns the raw JSON value of [maxDirectoryFilesPerDirectory].
             *
             * Unlike [maxDirectoryFilesPerDirectory], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("max_directory_files_per_directory")
            @ExcludeMissing
            fun _maxDirectoryFilesPerDirectory(): JsonField<Long> = maxDirectoryFilesPerDirectory

            /**
             * Returns the raw JSON value of [maxDirectoryIngestFiles].
             *
             * Unlike [maxDirectoryIngestFiles], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_directory_ingest_files")
            @ExcludeMissing
            fun _maxDirectoryIngestFiles(): JsonField<Long> = maxDirectoryIngestFiles

            /**
             * Returns the raw JSON value of [maxDirectorySyncPlanActions].
             *
             * Unlike [maxDirectorySyncPlanActions], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("max_directory_sync_plan_actions")
            @ExcludeMissing
            fun _maxDirectorySyncPlanActions(): JsonField<Long> = maxDirectorySyncPlanActions

            /**
             * Returns the raw JSON value of [spendingSoftAlertsUsdCents].
             *
             * Unlike [spendingSoftAlertsUsdCents], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("spending_soft_alerts_usd_cents")
            @ExcludeMissing
            fun _spendingSoftAlertsUsdCents(): JsonField<List<Long>> = spendingSoftAlertsUsdCents

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
                 * Returns a mutable builder for constructing an instance of [Limits].
                 *
                 * The following fields are required:
                 * ```java
                 * .allowPayAsYouGo()
                 * .maxConcurrentIndexJobs()
                 * .maxConcurrentParseJobsOther()
                 * .maxConcurrentParseJobsPremium()
                 * .maxDataSinks()
                 * .maxDataSources()
                 * .maxEmbeddingModels()
                 * .maxExtractionAgents()
                 * .maxExtractionJobs()
                 * .maxExtractionRuns()
                 * .maxFilesPerIndex()
                 * .maxIndexes()
                 * .maxMonthlyInvoiceTotalUsd()
                 * .maxOrganizations()
                 * .maxPagesPerIndex()
                 * .maxProjects()
                 * .maxPublishedAgents()
                 * .maxReportAgentSessions()
                 * .maxUsers()
                 * .mfaEnabled()
                 * .ssoEnabled()
                 * .subscriptionCostUsd()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Limits]. */
            class Builder internal constructor() {

                private var allowPayAsYouGo: JsonField<Boolean>? = null
                private var maxConcurrentIndexJobs: JsonField<Long>? = null
                private var maxConcurrentParseJobsOther: JsonField<Long>? = null
                private var maxConcurrentParseJobsPremium: JsonField<Long>? = null
                private var maxDataSinks: JsonField<Long>? = null
                private var maxDataSources: JsonField<Long>? = null
                private var maxEmbeddingModels: JsonField<Long>? = null
                private var maxExtractionAgents: JsonField<Long>? = null
                private var maxExtractionJobs: JsonField<Long>? = null
                private var maxExtractionRuns: JsonField<Long>? = null
                private var maxFilesPerIndex: JsonField<Long>? = null
                private var maxIndexes: JsonField<Long>? = null
                private var maxMonthlyInvoiceTotalUsd: JsonField<Long>? = null
                private var maxOrganizations: JsonField<Long>? = null
                private var maxPagesPerIndex: JsonField<Long>? = null
                private var maxProjects: JsonField<Long>? = null
                private var maxPublishedAgents: JsonField<Long>? = null
                private var maxReportAgentSessions: JsonField<Long>? = null
                private var maxUsers: JsonField<Long>? = null
                private var mfaEnabled: JsonField<Boolean>? = null
                private var ssoEnabled: JsonField<Boolean>? = null
                private var subscriptionCostUsd: JsonField<Long>? = null
                private var maxDirectories: JsonField<Long> = JsonMissing.of()
                private var maxDirectoryFilesPerDirectory: JsonField<Long> = JsonMissing.of()
                private var maxDirectoryIngestFiles: JsonField<Long> = JsonMissing.of()
                private var maxDirectorySyncPlanActions: JsonField<Long> = JsonMissing.of()
                private var spendingSoftAlertsUsdCents: JsonField<MutableList<Long>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(limits: Limits) = apply {
                    allowPayAsYouGo = limits.allowPayAsYouGo
                    maxConcurrentIndexJobs = limits.maxConcurrentIndexJobs
                    maxConcurrentParseJobsOther = limits.maxConcurrentParseJobsOther
                    maxConcurrentParseJobsPremium = limits.maxConcurrentParseJobsPremium
                    maxDataSinks = limits.maxDataSinks
                    maxDataSources = limits.maxDataSources
                    maxEmbeddingModels = limits.maxEmbeddingModels
                    maxExtractionAgents = limits.maxExtractionAgents
                    maxExtractionJobs = limits.maxExtractionJobs
                    maxExtractionRuns = limits.maxExtractionRuns
                    maxFilesPerIndex = limits.maxFilesPerIndex
                    maxIndexes = limits.maxIndexes
                    maxMonthlyInvoiceTotalUsd = limits.maxMonthlyInvoiceTotalUsd
                    maxOrganizations = limits.maxOrganizations
                    maxPagesPerIndex = limits.maxPagesPerIndex
                    maxProjects = limits.maxProjects
                    maxPublishedAgents = limits.maxPublishedAgents
                    maxReportAgentSessions = limits.maxReportAgentSessions
                    maxUsers = limits.maxUsers
                    mfaEnabled = limits.mfaEnabled
                    ssoEnabled = limits.ssoEnabled
                    subscriptionCostUsd = limits.subscriptionCostUsd
                    maxDirectories = limits.maxDirectories
                    maxDirectoryFilesPerDirectory = limits.maxDirectoryFilesPerDirectory
                    maxDirectoryIngestFiles = limits.maxDirectoryIngestFiles
                    maxDirectorySyncPlanActions = limits.maxDirectorySyncPlanActions
                    spendingSoftAlertsUsdCents =
                        limits.spendingSoftAlertsUsdCents.map { it.toMutableList() }
                    additionalProperties = limits.additionalProperties.toMutableMap()
                }

                /** Whether usage is allowed after credit grants are exhausted */
                fun allowPayAsYouGo(allowPayAsYouGo: Boolean) =
                    allowPayAsYouGo(JsonField.of(allowPayAsYouGo))

                /**
                 * Sets [Builder.allowPayAsYouGo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowPayAsYouGo] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun allowPayAsYouGo(allowPayAsYouGo: JsonField<Boolean>) = apply {
                    this.allowPayAsYouGo = allowPayAsYouGo
                }

                fun maxConcurrentIndexJobs(maxConcurrentIndexJobs: Long?) =
                    maxConcurrentIndexJobs(JsonField.ofNullable(maxConcurrentIndexJobs))

                /**
                 * Alias for [Builder.maxConcurrentIndexJobs].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxConcurrentIndexJobs(maxConcurrentIndexJobs: Long) =
                    maxConcurrentIndexJobs(maxConcurrentIndexJobs as Long?)

                /**
                 * Alias for calling [Builder.maxConcurrentIndexJobs] with
                 * `maxConcurrentIndexJobs.orElse(null)`.
                 */
                fun maxConcurrentIndexJobs(maxConcurrentIndexJobs: Optional<Long>) =
                    maxConcurrentIndexJobs(maxConcurrentIndexJobs.getOrNull())

                /**
                 * Sets [Builder.maxConcurrentIndexJobs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxConcurrentIndexJobs] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxConcurrentIndexJobs(maxConcurrentIndexJobs: JsonField<Long>) = apply {
                    this.maxConcurrentIndexJobs = maxConcurrentIndexJobs
                }

                fun maxConcurrentParseJobsOther(maxConcurrentParseJobsOther: Long?) =
                    maxConcurrentParseJobsOther(JsonField.ofNullable(maxConcurrentParseJobsOther))

                /**
                 * Alias for [Builder.maxConcurrentParseJobsOther].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxConcurrentParseJobsOther(maxConcurrentParseJobsOther: Long) =
                    maxConcurrentParseJobsOther(maxConcurrentParseJobsOther as Long?)

                /**
                 * Alias for calling [Builder.maxConcurrentParseJobsOther] with
                 * `maxConcurrentParseJobsOther.orElse(null)`.
                 */
                fun maxConcurrentParseJobsOther(maxConcurrentParseJobsOther: Optional<Long>) =
                    maxConcurrentParseJobsOther(maxConcurrentParseJobsOther.getOrNull())

                /**
                 * Sets [Builder.maxConcurrentParseJobsOther] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxConcurrentParseJobsOther] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun maxConcurrentParseJobsOther(maxConcurrentParseJobsOther: JsonField<Long>) =
                    apply {
                        this.maxConcurrentParseJobsOther = maxConcurrentParseJobsOther
                    }

                fun maxConcurrentParseJobsPremium(maxConcurrentParseJobsPremium: Long?) =
                    maxConcurrentParseJobsPremium(
                        JsonField.ofNullable(maxConcurrentParseJobsPremium)
                    )

                /**
                 * Alias for [Builder.maxConcurrentParseJobsPremium].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxConcurrentParseJobsPremium(maxConcurrentParseJobsPremium: Long) =
                    maxConcurrentParseJobsPremium(maxConcurrentParseJobsPremium as Long?)

                /**
                 * Alias for calling [Builder.maxConcurrentParseJobsPremium] with
                 * `maxConcurrentParseJobsPremium.orElse(null)`.
                 */
                fun maxConcurrentParseJobsPremium(maxConcurrentParseJobsPremium: Optional<Long>) =
                    maxConcurrentParseJobsPremium(maxConcurrentParseJobsPremium.getOrNull())

                /**
                 * Sets [Builder.maxConcurrentParseJobsPremium] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxConcurrentParseJobsPremium] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun maxConcurrentParseJobsPremium(maxConcurrentParseJobsPremium: JsonField<Long>) =
                    apply {
                        this.maxConcurrentParseJobsPremium = maxConcurrentParseJobsPremium
                    }

                fun maxDataSinks(maxDataSinks: Long?) =
                    maxDataSinks(JsonField.ofNullable(maxDataSinks))

                /**
                 * Alias for [Builder.maxDataSinks].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxDataSinks(maxDataSinks: Long) = maxDataSinks(maxDataSinks as Long?)

                /** Alias for calling [Builder.maxDataSinks] with `maxDataSinks.orElse(null)`. */
                fun maxDataSinks(maxDataSinks: Optional<Long>) =
                    maxDataSinks(maxDataSinks.getOrNull())

                /**
                 * Sets [Builder.maxDataSinks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxDataSinks] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxDataSinks(maxDataSinks: JsonField<Long>) = apply {
                    this.maxDataSinks = maxDataSinks
                }

                fun maxDataSources(maxDataSources: Long?) =
                    maxDataSources(JsonField.ofNullable(maxDataSources))

                /**
                 * Alias for [Builder.maxDataSources].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxDataSources(maxDataSources: Long) = maxDataSources(maxDataSources as Long?)

                /**
                 * Alias for calling [Builder.maxDataSources] with `maxDataSources.orElse(null)`.
                 */
                fun maxDataSources(maxDataSources: Optional<Long>) =
                    maxDataSources(maxDataSources.getOrNull())

                /**
                 * Sets [Builder.maxDataSources] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxDataSources] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxDataSources(maxDataSources: JsonField<Long>) = apply {
                    this.maxDataSources = maxDataSources
                }

                fun maxEmbeddingModels(maxEmbeddingModels: Long?) =
                    maxEmbeddingModels(JsonField.ofNullable(maxEmbeddingModels))

                /**
                 * Alias for [Builder.maxEmbeddingModels].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxEmbeddingModels(maxEmbeddingModels: Long) =
                    maxEmbeddingModels(maxEmbeddingModels as Long?)

                /**
                 * Alias for calling [Builder.maxEmbeddingModels] with
                 * `maxEmbeddingModels.orElse(null)`.
                 */
                fun maxEmbeddingModels(maxEmbeddingModels: Optional<Long>) =
                    maxEmbeddingModels(maxEmbeddingModels.getOrNull())

                /**
                 * Sets [Builder.maxEmbeddingModels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxEmbeddingModels] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxEmbeddingModels(maxEmbeddingModels: JsonField<Long>) = apply {
                    this.maxEmbeddingModels = maxEmbeddingModels
                }

                fun maxExtractionAgents(maxExtractionAgents: Long?) =
                    maxExtractionAgents(JsonField.ofNullable(maxExtractionAgents))

                /**
                 * Alias for [Builder.maxExtractionAgents].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxExtractionAgents(maxExtractionAgents: Long) =
                    maxExtractionAgents(maxExtractionAgents as Long?)

                /**
                 * Alias for calling [Builder.maxExtractionAgents] with
                 * `maxExtractionAgents.orElse(null)`.
                 */
                fun maxExtractionAgents(maxExtractionAgents: Optional<Long>) =
                    maxExtractionAgents(maxExtractionAgents.getOrNull())

                /**
                 * Sets [Builder.maxExtractionAgents] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxExtractionAgents] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxExtractionAgents(maxExtractionAgents: JsonField<Long>) = apply {
                    this.maxExtractionAgents = maxExtractionAgents
                }

                fun maxExtractionJobs(maxExtractionJobs: Long?) =
                    maxExtractionJobs(JsonField.ofNullable(maxExtractionJobs))

                /**
                 * Alias for [Builder.maxExtractionJobs].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxExtractionJobs(maxExtractionJobs: Long) =
                    maxExtractionJobs(maxExtractionJobs as Long?)

                /**
                 * Alias for calling [Builder.maxExtractionJobs] with
                 * `maxExtractionJobs.orElse(null)`.
                 */
                fun maxExtractionJobs(maxExtractionJobs: Optional<Long>) =
                    maxExtractionJobs(maxExtractionJobs.getOrNull())

                /**
                 * Sets [Builder.maxExtractionJobs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxExtractionJobs] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxExtractionJobs(maxExtractionJobs: JsonField<Long>) = apply {
                    this.maxExtractionJobs = maxExtractionJobs
                }

                fun maxExtractionRuns(maxExtractionRuns: Long?) =
                    maxExtractionRuns(JsonField.ofNullable(maxExtractionRuns))

                /**
                 * Alias for [Builder.maxExtractionRuns].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxExtractionRuns(maxExtractionRuns: Long) =
                    maxExtractionRuns(maxExtractionRuns as Long?)

                /**
                 * Alias for calling [Builder.maxExtractionRuns] with
                 * `maxExtractionRuns.orElse(null)`.
                 */
                fun maxExtractionRuns(maxExtractionRuns: Optional<Long>) =
                    maxExtractionRuns(maxExtractionRuns.getOrNull())

                /**
                 * Sets [Builder.maxExtractionRuns] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxExtractionRuns] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxExtractionRuns(maxExtractionRuns: JsonField<Long>) = apply {
                    this.maxExtractionRuns = maxExtractionRuns
                }

                fun maxFilesPerIndex(maxFilesPerIndex: Long?) =
                    maxFilesPerIndex(JsonField.ofNullable(maxFilesPerIndex))

                /**
                 * Alias for [Builder.maxFilesPerIndex].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxFilesPerIndex(maxFilesPerIndex: Long) =
                    maxFilesPerIndex(maxFilesPerIndex as Long?)

                /**
                 * Alias for calling [Builder.maxFilesPerIndex] with
                 * `maxFilesPerIndex.orElse(null)`.
                 */
                fun maxFilesPerIndex(maxFilesPerIndex: Optional<Long>) =
                    maxFilesPerIndex(maxFilesPerIndex.getOrNull())

                /**
                 * Sets [Builder.maxFilesPerIndex] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxFilesPerIndex] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxFilesPerIndex(maxFilesPerIndex: JsonField<Long>) = apply {
                    this.maxFilesPerIndex = maxFilesPerIndex
                }

                fun maxIndexes(maxIndexes: Long?) = maxIndexes(JsonField.ofNullable(maxIndexes))

                /**
                 * Alias for [Builder.maxIndexes].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxIndexes(maxIndexes: Long) = maxIndexes(maxIndexes as Long?)

                /** Alias for calling [Builder.maxIndexes] with `maxIndexes.orElse(null)`. */
                fun maxIndexes(maxIndexes: Optional<Long>) = maxIndexes(maxIndexes.getOrNull())

                /**
                 * Sets [Builder.maxIndexes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxIndexes] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxIndexes(maxIndexes: JsonField<Long>) = apply { this.maxIndexes = maxIndexes }

                fun maxMonthlyInvoiceTotalUsd(maxMonthlyInvoiceTotalUsd: Long?) =
                    maxMonthlyInvoiceTotalUsd(JsonField.ofNullable(maxMonthlyInvoiceTotalUsd))

                /**
                 * Alias for [Builder.maxMonthlyInvoiceTotalUsd].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxMonthlyInvoiceTotalUsd(maxMonthlyInvoiceTotalUsd: Long) =
                    maxMonthlyInvoiceTotalUsd(maxMonthlyInvoiceTotalUsd as Long?)

                /**
                 * Alias for calling [Builder.maxMonthlyInvoiceTotalUsd] with
                 * `maxMonthlyInvoiceTotalUsd.orElse(null)`.
                 */
                fun maxMonthlyInvoiceTotalUsd(maxMonthlyInvoiceTotalUsd: Optional<Long>) =
                    maxMonthlyInvoiceTotalUsd(maxMonthlyInvoiceTotalUsd.getOrNull())

                /**
                 * Sets [Builder.maxMonthlyInvoiceTotalUsd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxMonthlyInvoiceTotalUsd] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun maxMonthlyInvoiceTotalUsd(maxMonthlyInvoiceTotalUsd: JsonField<Long>) = apply {
                    this.maxMonthlyInvoiceTotalUsd = maxMonthlyInvoiceTotalUsd
                }

                fun maxOrganizations(maxOrganizations: Long?) =
                    maxOrganizations(JsonField.ofNullable(maxOrganizations))

                /**
                 * Alias for [Builder.maxOrganizations].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxOrganizations(maxOrganizations: Long) =
                    maxOrganizations(maxOrganizations as Long?)

                /**
                 * Alias for calling [Builder.maxOrganizations] with
                 * `maxOrganizations.orElse(null)`.
                 */
                fun maxOrganizations(maxOrganizations: Optional<Long>) =
                    maxOrganizations(maxOrganizations.getOrNull())

                /**
                 * Sets [Builder.maxOrganizations] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxOrganizations] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxOrganizations(maxOrganizations: JsonField<Long>) = apply {
                    this.maxOrganizations = maxOrganizations
                }

                fun maxPagesPerIndex(maxPagesPerIndex: Long?) =
                    maxPagesPerIndex(JsonField.ofNullable(maxPagesPerIndex))

                /**
                 * Alias for [Builder.maxPagesPerIndex].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxPagesPerIndex(maxPagesPerIndex: Long) =
                    maxPagesPerIndex(maxPagesPerIndex as Long?)

                /**
                 * Alias for calling [Builder.maxPagesPerIndex] with
                 * `maxPagesPerIndex.orElse(null)`.
                 */
                fun maxPagesPerIndex(maxPagesPerIndex: Optional<Long>) =
                    maxPagesPerIndex(maxPagesPerIndex.getOrNull())

                /**
                 * Sets [Builder.maxPagesPerIndex] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxPagesPerIndex] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxPagesPerIndex(maxPagesPerIndex: JsonField<Long>) = apply {
                    this.maxPagesPerIndex = maxPagesPerIndex
                }

                fun maxProjects(maxProjects: Long?) = maxProjects(JsonField.ofNullable(maxProjects))

                /**
                 * Alias for [Builder.maxProjects].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxProjects(maxProjects: Long) = maxProjects(maxProjects as Long?)

                /** Alias for calling [Builder.maxProjects] with `maxProjects.orElse(null)`. */
                fun maxProjects(maxProjects: Optional<Long>) = maxProjects(maxProjects.getOrNull())

                /**
                 * Sets [Builder.maxProjects] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxProjects] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxProjects(maxProjects: JsonField<Long>) = apply {
                    this.maxProjects = maxProjects
                }

                fun maxPublishedAgents(maxPublishedAgents: Long?) =
                    maxPublishedAgents(JsonField.ofNullable(maxPublishedAgents))

                /**
                 * Alias for [Builder.maxPublishedAgents].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxPublishedAgents(maxPublishedAgents: Long) =
                    maxPublishedAgents(maxPublishedAgents as Long?)

                /**
                 * Alias for calling [Builder.maxPublishedAgents] with
                 * `maxPublishedAgents.orElse(null)`.
                 */
                fun maxPublishedAgents(maxPublishedAgents: Optional<Long>) =
                    maxPublishedAgents(maxPublishedAgents.getOrNull())

                /**
                 * Sets [Builder.maxPublishedAgents] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxPublishedAgents] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxPublishedAgents(maxPublishedAgents: JsonField<Long>) = apply {
                    this.maxPublishedAgents = maxPublishedAgents
                }

                fun maxReportAgentSessions(maxReportAgentSessions: Long?) =
                    maxReportAgentSessions(JsonField.ofNullable(maxReportAgentSessions))

                /**
                 * Alias for [Builder.maxReportAgentSessions].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxReportAgentSessions(maxReportAgentSessions: Long) =
                    maxReportAgentSessions(maxReportAgentSessions as Long?)

                /**
                 * Alias for calling [Builder.maxReportAgentSessions] with
                 * `maxReportAgentSessions.orElse(null)`.
                 */
                fun maxReportAgentSessions(maxReportAgentSessions: Optional<Long>) =
                    maxReportAgentSessions(maxReportAgentSessions.getOrNull())

                /**
                 * Sets [Builder.maxReportAgentSessions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxReportAgentSessions] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxReportAgentSessions(maxReportAgentSessions: JsonField<Long>) = apply {
                    this.maxReportAgentSessions = maxReportAgentSessions
                }

                fun maxUsers(maxUsers: Long?) = maxUsers(JsonField.ofNullable(maxUsers))

                /**
                 * Alias for [Builder.maxUsers].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxUsers(maxUsers: Long) = maxUsers(maxUsers as Long?)

                /** Alias for calling [Builder.maxUsers] with `maxUsers.orElse(null)`. */
                fun maxUsers(maxUsers: Optional<Long>) = maxUsers(maxUsers.getOrNull())

                /**
                 * Sets [Builder.maxUsers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxUsers] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxUsers(maxUsers: JsonField<Long>) = apply { this.maxUsers = maxUsers }

                fun mfaEnabled(mfaEnabled: Boolean) = mfaEnabled(JsonField.of(mfaEnabled))

                /**
                 * Sets [Builder.mfaEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mfaEnabled] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun mfaEnabled(mfaEnabled: JsonField<Boolean>) = apply {
                    this.mfaEnabled = mfaEnabled
                }

                fun ssoEnabled(ssoEnabled: Boolean) = ssoEnabled(JsonField.of(ssoEnabled))

                /**
                 * Sets [Builder.ssoEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ssoEnabled] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ssoEnabled(ssoEnabled: JsonField<Boolean>) = apply {
                    this.ssoEnabled = ssoEnabled
                }

                fun subscriptionCostUsd(subscriptionCostUsd: Long) =
                    subscriptionCostUsd(JsonField.of(subscriptionCostUsd))

                /**
                 * Sets [Builder.subscriptionCostUsd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionCostUsd] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun subscriptionCostUsd(subscriptionCostUsd: JsonField<Long>) = apply {
                    this.subscriptionCostUsd = subscriptionCostUsd
                }

                fun maxDirectories(maxDirectories: Long?) =
                    maxDirectories(JsonField.ofNullable(maxDirectories))

                /**
                 * Alias for [Builder.maxDirectories].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxDirectories(maxDirectories: Long) = maxDirectories(maxDirectories as Long?)

                /**
                 * Alias for calling [Builder.maxDirectories] with `maxDirectories.orElse(null)`.
                 */
                fun maxDirectories(maxDirectories: Optional<Long>) =
                    maxDirectories(maxDirectories.getOrNull())

                /**
                 * Sets [Builder.maxDirectories] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxDirectories] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxDirectories(maxDirectories: JsonField<Long>) = apply {
                    this.maxDirectories = maxDirectories
                }

                fun maxDirectoryFilesPerDirectory(maxDirectoryFilesPerDirectory: Long?) =
                    maxDirectoryFilesPerDirectory(
                        JsonField.ofNullable(maxDirectoryFilesPerDirectory)
                    )

                /**
                 * Alias for [Builder.maxDirectoryFilesPerDirectory].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxDirectoryFilesPerDirectory(maxDirectoryFilesPerDirectory: Long) =
                    maxDirectoryFilesPerDirectory(maxDirectoryFilesPerDirectory as Long?)

                /**
                 * Alias for calling [Builder.maxDirectoryFilesPerDirectory] with
                 * `maxDirectoryFilesPerDirectory.orElse(null)`.
                 */
                fun maxDirectoryFilesPerDirectory(maxDirectoryFilesPerDirectory: Optional<Long>) =
                    maxDirectoryFilesPerDirectory(maxDirectoryFilesPerDirectory.getOrNull())

                /**
                 * Sets [Builder.maxDirectoryFilesPerDirectory] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxDirectoryFilesPerDirectory] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun maxDirectoryFilesPerDirectory(maxDirectoryFilesPerDirectory: JsonField<Long>) =
                    apply {
                        this.maxDirectoryFilesPerDirectory = maxDirectoryFilesPerDirectory
                    }

                fun maxDirectoryIngestFiles(maxDirectoryIngestFiles: Long?) =
                    maxDirectoryIngestFiles(JsonField.ofNullable(maxDirectoryIngestFiles))

                /**
                 * Alias for [Builder.maxDirectoryIngestFiles].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxDirectoryIngestFiles(maxDirectoryIngestFiles: Long) =
                    maxDirectoryIngestFiles(maxDirectoryIngestFiles as Long?)

                /**
                 * Alias for calling [Builder.maxDirectoryIngestFiles] with
                 * `maxDirectoryIngestFiles.orElse(null)`.
                 */
                fun maxDirectoryIngestFiles(maxDirectoryIngestFiles: Optional<Long>) =
                    maxDirectoryIngestFiles(maxDirectoryIngestFiles.getOrNull())

                /**
                 * Sets [Builder.maxDirectoryIngestFiles] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxDirectoryIngestFiles] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun maxDirectoryIngestFiles(maxDirectoryIngestFiles: JsonField<Long>) = apply {
                    this.maxDirectoryIngestFiles = maxDirectoryIngestFiles
                }

                fun maxDirectorySyncPlanActions(maxDirectorySyncPlanActions: Long?) =
                    maxDirectorySyncPlanActions(JsonField.ofNullable(maxDirectorySyncPlanActions))

                /**
                 * Alias for [Builder.maxDirectorySyncPlanActions].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxDirectorySyncPlanActions(maxDirectorySyncPlanActions: Long) =
                    maxDirectorySyncPlanActions(maxDirectorySyncPlanActions as Long?)

                /**
                 * Alias for calling [Builder.maxDirectorySyncPlanActions] with
                 * `maxDirectorySyncPlanActions.orElse(null)`.
                 */
                fun maxDirectorySyncPlanActions(maxDirectorySyncPlanActions: Optional<Long>) =
                    maxDirectorySyncPlanActions(maxDirectorySyncPlanActions.getOrNull())

                /**
                 * Sets [Builder.maxDirectorySyncPlanActions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxDirectorySyncPlanActions] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun maxDirectorySyncPlanActions(maxDirectorySyncPlanActions: JsonField<Long>) =
                    apply {
                        this.maxDirectorySyncPlanActions = maxDirectorySyncPlanActions
                    }

                /** The amount of USD cents at which a soft alert should be triggered */
                fun spendingSoftAlertsUsdCents(spendingSoftAlertsUsdCents: List<Long>?) =
                    spendingSoftAlertsUsdCents(JsonField.ofNullable(spendingSoftAlertsUsdCents))

                /**
                 * Alias for calling [Builder.spendingSoftAlertsUsdCents] with
                 * `spendingSoftAlertsUsdCents.orElse(null)`.
                 */
                fun spendingSoftAlertsUsdCents(spendingSoftAlertsUsdCents: Optional<List<Long>>) =
                    spendingSoftAlertsUsdCents(spendingSoftAlertsUsdCents.getOrNull())

                /**
                 * Sets [Builder.spendingSoftAlertsUsdCents] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spendingSoftAlertsUsdCents] with a well-typed
                 * `List<Long>` value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun spendingSoftAlertsUsdCents(spendingSoftAlertsUsdCents: JsonField<List<Long>>) =
                    apply {
                        this.spendingSoftAlertsUsdCents =
                            spendingSoftAlertsUsdCents.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [Long] to [spendingSoftAlertsUsdCents].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSpendingSoftAlertsUsdCent(spendingSoftAlertsUsdCent: Long) = apply {
                    spendingSoftAlertsUsdCents =
                        (spendingSoftAlertsUsdCents ?: JsonField.of(mutableListOf())).also {
                            checkKnown("spendingSoftAlertsUsdCents", it)
                                .add(spendingSoftAlertsUsdCent)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Limits].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .allowPayAsYouGo()
                 * .maxConcurrentIndexJobs()
                 * .maxConcurrentParseJobsOther()
                 * .maxConcurrentParseJobsPremium()
                 * .maxDataSinks()
                 * .maxDataSources()
                 * .maxEmbeddingModels()
                 * .maxExtractionAgents()
                 * .maxExtractionJobs()
                 * .maxExtractionRuns()
                 * .maxFilesPerIndex()
                 * .maxIndexes()
                 * .maxMonthlyInvoiceTotalUsd()
                 * .maxOrganizations()
                 * .maxPagesPerIndex()
                 * .maxProjects()
                 * .maxPublishedAgents()
                 * .maxReportAgentSessions()
                 * .maxUsers()
                 * .mfaEnabled()
                 * .ssoEnabled()
                 * .subscriptionCostUsd()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Limits =
                    Limits(
                        checkRequired("allowPayAsYouGo", allowPayAsYouGo),
                        checkRequired("maxConcurrentIndexJobs", maxConcurrentIndexJobs),
                        checkRequired("maxConcurrentParseJobsOther", maxConcurrentParseJobsOther),
                        checkRequired(
                            "maxConcurrentParseJobsPremium",
                            maxConcurrentParseJobsPremium,
                        ),
                        checkRequired("maxDataSinks", maxDataSinks),
                        checkRequired("maxDataSources", maxDataSources),
                        checkRequired("maxEmbeddingModels", maxEmbeddingModels),
                        checkRequired("maxExtractionAgents", maxExtractionAgents),
                        checkRequired("maxExtractionJobs", maxExtractionJobs),
                        checkRequired("maxExtractionRuns", maxExtractionRuns),
                        checkRequired("maxFilesPerIndex", maxFilesPerIndex),
                        checkRequired("maxIndexes", maxIndexes),
                        checkRequired("maxMonthlyInvoiceTotalUsd", maxMonthlyInvoiceTotalUsd),
                        checkRequired("maxOrganizations", maxOrganizations),
                        checkRequired("maxPagesPerIndex", maxPagesPerIndex),
                        checkRequired("maxProjects", maxProjects),
                        checkRequired("maxPublishedAgents", maxPublishedAgents),
                        checkRequired("maxReportAgentSessions", maxReportAgentSessions),
                        checkRequired("maxUsers", maxUsers),
                        checkRequired("mfaEnabled", mfaEnabled),
                        checkRequired("ssoEnabled", ssoEnabled),
                        checkRequired("subscriptionCostUsd", subscriptionCostUsd),
                        maxDirectories,
                        maxDirectoryFilesPerDirectory,
                        maxDirectoryIngestFiles,
                        maxDirectorySyncPlanActions,
                        (spendingSoftAlertsUsdCents ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Limits = apply {
                if (validated) {
                    return@apply
                }

                allowPayAsYouGo()
                maxConcurrentIndexJobs()
                maxConcurrentParseJobsOther()
                maxConcurrentParseJobsPremium()
                maxDataSinks()
                maxDataSources()
                maxEmbeddingModels()
                maxExtractionAgents()
                maxExtractionJobs()
                maxExtractionRuns()
                maxFilesPerIndex()
                maxIndexes()
                maxMonthlyInvoiceTotalUsd()
                maxOrganizations()
                maxPagesPerIndex()
                maxProjects()
                maxPublishedAgents()
                maxReportAgentSessions()
                maxUsers()
                mfaEnabled()
                ssoEnabled()
                subscriptionCostUsd()
                maxDirectories()
                maxDirectoryFilesPerDirectory()
                maxDirectoryIngestFiles()
                maxDirectorySyncPlanActions()
                spendingSoftAlertsUsdCents()
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
                (if (allowPayAsYouGo.asKnown().isPresent) 1 else 0) +
                    (if (maxConcurrentIndexJobs.asKnown().isPresent) 1 else 0) +
                    (if (maxConcurrentParseJobsOther.asKnown().isPresent) 1 else 0) +
                    (if (maxConcurrentParseJobsPremium.asKnown().isPresent) 1 else 0) +
                    (if (maxDataSinks.asKnown().isPresent) 1 else 0) +
                    (if (maxDataSources.asKnown().isPresent) 1 else 0) +
                    (if (maxEmbeddingModels.asKnown().isPresent) 1 else 0) +
                    (if (maxExtractionAgents.asKnown().isPresent) 1 else 0) +
                    (if (maxExtractionJobs.asKnown().isPresent) 1 else 0) +
                    (if (maxExtractionRuns.asKnown().isPresent) 1 else 0) +
                    (if (maxFilesPerIndex.asKnown().isPresent) 1 else 0) +
                    (if (maxIndexes.asKnown().isPresent) 1 else 0) +
                    (if (maxMonthlyInvoiceTotalUsd.asKnown().isPresent) 1 else 0) +
                    (if (maxOrganizations.asKnown().isPresent) 1 else 0) +
                    (if (maxPagesPerIndex.asKnown().isPresent) 1 else 0) +
                    (if (maxProjects.asKnown().isPresent) 1 else 0) +
                    (if (maxPublishedAgents.asKnown().isPresent) 1 else 0) +
                    (if (maxReportAgentSessions.asKnown().isPresent) 1 else 0) +
                    (if (maxUsers.asKnown().isPresent) 1 else 0) +
                    (if (mfaEnabled.asKnown().isPresent) 1 else 0) +
                    (if (ssoEnabled.asKnown().isPresent) 1 else 0) +
                    (if (subscriptionCostUsd.asKnown().isPresent) 1 else 0) +
                    (if (maxDirectories.asKnown().isPresent) 1 else 0) +
                    (if (maxDirectoryFilesPerDirectory.asKnown().isPresent) 1 else 0) +
                    (if (maxDirectoryIngestFiles.asKnown().isPresent) 1 else 0) +
                    (if (maxDirectorySyncPlanActions.asKnown().isPresent) 1 else 0) +
                    (spendingSoftAlertsUsdCents.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Limits &&
                    allowPayAsYouGo == other.allowPayAsYouGo &&
                    maxConcurrentIndexJobs == other.maxConcurrentIndexJobs &&
                    maxConcurrentParseJobsOther == other.maxConcurrentParseJobsOther &&
                    maxConcurrentParseJobsPremium == other.maxConcurrentParseJobsPremium &&
                    maxDataSinks == other.maxDataSinks &&
                    maxDataSources == other.maxDataSources &&
                    maxEmbeddingModels == other.maxEmbeddingModels &&
                    maxExtractionAgents == other.maxExtractionAgents &&
                    maxExtractionJobs == other.maxExtractionJobs &&
                    maxExtractionRuns == other.maxExtractionRuns &&
                    maxFilesPerIndex == other.maxFilesPerIndex &&
                    maxIndexes == other.maxIndexes &&
                    maxMonthlyInvoiceTotalUsd == other.maxMonthlyInvoiceTotalUsd &&
                    maxOrganizations == other.maxOrganizations &&
                    maxPagesPerIndex == other.maxPagesPerIndex &&
                    maxProjects == other.maxProjects &&
                    maxPublishedAgents == other.maxPublishedAgents &&
                    maxReportAgentSessions == other.maxReportAgentSessions &&
                    maxUsers == other.maxUsers &&
                    mfaEnabled == other.mfaEnabled &&
                    ssoEnabled == other.ssoEnabled &&
                    subscriptionCostUsd == other.subscriptionCostUsd &&
                    maxDirectories == other.maxDirectories &&
                    maxDirectoryFilesPerDirectory == other.maxDirectoryFilesPerDirectory &&
                    maxDirectoryIngestFiles == other.maxDirectoryIngestFiles &&
                    maxDirectorySyncPlanActions == other.maxDirectorySyncPlanActions &&
                    spendingSoftAlertsUsdCents == other.spendingSoftAlertsUsdCents &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    allowPayAsYouGo,
                    maxConcurrentIndexJobs,
                    maxConcurrentParseJobsOther,
                    maxConcurrentParseJobsPremium,
                    maxDataSinks,
                    maxDataSources,
                    maxEmbeddingModels,
                    maxExtractionAgents,
                    maxExtractionJobs,
                    maxExtractionRuns,
                    maxFilesPerIndex,
                    maxIndexes,
                    maxMonthlyInvoiceTotalUsd,
                    maxOrganizations,
                    maxPagesPerIndex,
                    maxProjects,
                    maxPublishedAgents,
                    maxReportAgentSessions,
                    maxUsers,
                    mfaEnabled,
                    ssoEnabled,
                    subscriptionCostUsd,
                    maxDirectories,
                    maxDirectoryFilesPerDirectory,
                    maxDirectoryIngestFiles,
                    maxDirectorySyncPlanActions,
                    spendingSoftAlertsUsdCents,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Limits{allowPayAsYouGo=$allowPayAsYouGo, maxConcurrentIndexJobs=$maxConcurrentIndexJobs, maxConcurrentParseJobsOther=$maxConcurrentParseJobsOther, maxConcurrentParseJobsPremium=$maxConcurrentParseJobsPremium, maxDataSinks=$maxDataSinks, maxDataSources=$maxDataSources, maxEmbeddingModels=$maxEmbeddingModels, maxExtractionAgents=$maxExtractionAgents, maxExtractionJobs=$maxExtractionJobs, maxExtractionRuns=$maxExtractionRuns, maxFilesPerIndex=$maxFilesPerIndex, maxIndexes=$maxIndexes, maxMonthlyInvoiceTotalUsd=$maxMonthlyInvoiceTotalUsd, maxOrganizations=$maxOrganizations, maxPagesPerIndex=$maxPagesPerIndex, maxProjects=$maxProjects, maxPublishedAgents=$maxPublishedAgents, maxReportAgentSessions=$maxReportAgentSessions, maxUsers=$maxUsers, mfaEnabled=$mfaEnabled, ssoEnabled=$ssoEnabled, subscriptionCostUsd=$subscriptionCostUsd, maxDirectories=$maxDirectories, maxDirectoryFilesPerDirectory=$maxDirectoryFilesPerDirectory, maxDirectoryIngestFiles=$maxDirectoryIngestFiles, maxDirectorySyncPlanActions=$maxDirectorySyncPlanActions, spendingSoftAlertsUsdCents=$spendingSoftAlertsUsdCents, additionalProperties=$additionalProperties}"
        }

        class Name @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ENTERPRISE = of("enterprise")

                @JvmField val ENTERPRISE_CONTRACT = of("enterprise_contract")

                @JvmField val ENTERPRISE_POC = of("enterprise_poc")

                @JvmField val FREE = of("free")

                @JvmField val FREE_CONTRACT = of("free_contract")

                @JvmField val FREE_V1 = of("free_v1")

                @JvmField val FREE_V2 = of("free_v2")

                @JvmField val LLAMA_PARSE = of("llama_parse")

                @JvmField val PRO = of("pro")

                @JvmField val PRO_V1 = of("pro_v1")

                @JvmField val PRO_V2 = of("pro_v2")

                @JvmField val STARTER_V1 = of("starter_v1")

                @JvmField val STARTER_V2 = of("starter_v2")

                @JvmField val UNKNOWN = of("unknown")

                @JvmField val YC_DEAL_V1 = of("yc_deal_v1")

                @JvmStatic fun of(value: String) = Name(JsonField.of(value))
            }

            /** An enum containing [Name]'s known values. */
            enum class Known {
                ENTERPRISE,
                ENTERPRISE_CONTRACT,
                ENTERPRISE_POC,
                FREE,
                FREE_CONTRACT,
                FREE_V1,
                FREE_V2,
                LLAMA_PARSE,
                PRO,
                PRO_V1,
                PRO_V2,
                STARTER_V1,
                STARTER_V2,
                UNKNOWN,
                YC_DEAL_V1,
            }

            /**
             * An enum containing [Name]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Name] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ENTERPRISE,
                ENTERPRISE_CONTRACT,
                ENTERPRISE_POC,
                FREE,
                FREE_CONTRACT,
                FREE_V1,
                FREE_V2,
                LLAMA_PARSE,
                PRO,
                PRO_V1,
                PRO_V2,
                STARTER_V1,
                STARTER_V2,
                UNKNOWN,
                YC_DEAL_V1,
                /** An enum member indicating that [Name] was instantiated with an unknown value. */
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
                    ENTERPRISE -> Value.ENTERPRISE
                    ENTERPRISE_CONTRACT -> Value.ENTERPRISE_CONTRACT
                    ENTERPRISE_POC -> Value.ENTERPRISE_POC
                    FREE -> Value.FREE
                    FREE_CONTRACT -> Value.FREE_CONTRACT
                    FREE_V1 -> Value.FREE_V1
                    FREE_V2 -> Value.FREE_V2
                    LLAMA_PARSE -> Value.LLAMA_PARSE
                    PRO -> Value.PRO
                    PRO_V1 -> Value.PRO_V1
                    PRO_V2 -> Value.PRO_V2
                    STARTER_V1 -> Value.STARTER_V1
                    STARTER_V2 -> Value.STARTER_V2
                    UNKNOWN -> Value.UNKNOWN
                    YC_DEAL_V1 -> Value.YC_DEAL_V1
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
                    ENTERPRISE -> Known.ENTERPRISE
                    ENTERPRISE_CONTRACT -> Known.ENTERPRISE_CONTRACT
                    ENTERPRISE_POC -> Known.ENTERPRISE_POC
                    FREE -> Known.FREE
                    FREE_CONTRACT -> Known.FREE_CONTRACT
                    FREE_V1 -> Known.FREE_V1
                    FREE_V2 -> Known.FREE_V2
                    LLAMA_PARSE -> Known.LLAMA_PARSE
                    PRO -> Known.PRO
                    PRO_V1 -> Known.PRO_V1
                    PRO_V2 -> Known.PRO_V2
                    STARTER_V1 -> Known.STARTER_V1
                    STARTER_V2 -> Known.STARTER_V2
                    UNKNOWN -> Known.UNKNOWN
                    YC_DEAL_V1 -> Known.YC_DEAL_V1
                    else -> throw LlamaCloudAdminInvalidDataException("Unknown Name: $value")
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
            fun validate(): Name = apply {
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

                return other is Name && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class PlanFrequency @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val ANNUAL = of("ANNUAL")

                @JvmField val MONTHLY = of("MONTHLY")

                @JvmField val QUARTERLY = of("QUARTERLY")

                @JvmStatic fun of(value: String) = PlanFrequency(JsonField.of(value))
            }

            /** An enum containing [PlanFrequency]'s known values. */
            enum class Known {
                ANNUAL,
                MONTHLY,
                QUARTERLY,
            }

            /**
             * An enum containing [PlanFrequency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PlanFrequency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ANNUAL,
                MONTHLY,
                QUARTERLY,
                /**
                 * An enum member indicating that [PlanFrequency] was instantiated with an unknown
                 * value.
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
                    ANNUAL -> Value.ANNUAL
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
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
                    ANNUAL -> Known.ANNUAL
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    else ->
                        throw LlamaCloudAdminInvalidDataException("Unknown PlanFrequency: $value")
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
            fun validate(): PlanFrequency = apply {
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

                return other is PlanFrequency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The current billing period */
        class CurrentBillingPeriod
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val endDate: JsonField<OffsetDateTime>,
            private val startDate: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("end_date")
                @ExcludeMissing
                endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("start_date")
                @ExcludeMissing
                startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(endDate, startDate, mutableMapOf())

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun endDate(): OffsetDateTime = endDate.getRequired("end_date")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /**
             * Returns the raw JSON value of [endDate].
             *
             * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /**
             * Returns the raw JSON value of [startDate].
             *
             * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

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
                 * Returns a mutable builder for constructing an instance of [CurrentBillingPeriod].
                 *
                 * The following fields are required:
                 * ```java
                 * .endDate()
                 * .startDate()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CurrentBillingPeriod]. */
            class Builder internal constructor() {

                private var endDate: JsonField<OffsetDateTime>? = null
                private var startDate: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(currentBillingPeriod: CurrentBillingPeriod) = apply {
                    endDate = currentBillingPeriod.endDate
                    startDate = currentBillingPeriod.startDate
                    additionalProperties = currentBillingPeriod.additionalProperties.toMutableMap()
                }

                fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

                /**
                 * Sets [Builder.endDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /**
                 * Sets [Builder.startDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CurrentBillingPeriod].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .endDate()
                 * .startDate()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CurrentBillingPeriod =
                    CurrentBillingPeriod(
                        checkRequired("endDate", endDate),
                        checkRequired("startDate", startDate),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): CurrentBillingPeriod = apply {
                if (validated) {
                    return@apply
                }

                endDate()
                startDate()
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
                (if (endDate.asKnown().isPresent) 1 else 0) +
                    (if (startDate.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CurrentBillingPeriod &&
                    endDate == other.endDate &&
                    startDate == other.startDate &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(endDate, startDate, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CurrentBillingPeriod{endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
        }

        class RecurringCredit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val creditAmount: JsonField<Long>,
            private val creditType: JsonField<CreditType>,
            private val name: JsonField<String>,
            private val priority: JsonField<Double>,
            private val productId: JsonField<String>,
            private val rolloverFraction: JsonField<Double>,
            private val periodsDuration: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("credit_amount")
                @ExcludeMissing
                creditAmount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("credit_type")
                @ExcludeMissing
                creditType: JsonField<CreditType> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("priority")
                @ExcludeMissing
                priority: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("product_id")
                @ExcludeMissing
                productId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("rollover_fraction")
                @ExcludeMissing
                rolloverFraction: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("periods_duration")
                @ExcludeMissing
                periodsDuration: JsonField<Double> = JsonMissing.of(),
            ) : this(
                creditAmount,
                creditType,
                name,
                priority,
                productId,
                rolloverFraction,
                periodsDuration,
                mutableMapOf(),
            )

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditAmount(): Long = creditAmount.getRequired("credit_amount")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditType(): CreditType = creditType.getRequired("credit_type")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun priority(): Double = priority.getRequired("priority")

            /**
             * The ID of the product in Metronome used to represent the credit grant
             *
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun productId(): String = productId.getRequired("product_id")

            /**
             * The fraction of the credit that will roll over to the next period, between 0 and 1
             *
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun rolloverFraction(): Double = rolloverFraction.getRequired("rollover_fraction")

            /**
             * How many billing periods the credit grant will last for
             *
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun periodsDuration(): Optional<Double> =
                periodsDuration.getOptional("periods_duration")

            /**
             * Returns the raw JSON value of [creditAmount].
             *
             * Unlike [creditAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_amount")
            @ExcludeMissing
            fun _creditAmount(): JsonField<Long> = creditAmount

            /**
             * Returns the raw JSON value of [creditType].
             *
             * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type")
            @ExcludeMissing
            fun _creditType(): JsonField<CreditType> = creditType

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [priority].
             *
             * Unlike [priority], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

            /**
             * Returns the raw JSON value of [productId].
             *
             * Unlike [productId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("product_id")
            @ExcludeMissing
            fun _productId(): JsonField<String> = productId

            /**
             * Returns the raw JSON value of [rolloverFraction].
             *
             * Unlike [rolloverFraction], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            fun _rolloverFraction(): JsonField<Double> = rolloverFraction

            /**
             * Returns the raw JSON value of [periodsDuration].
             *
             * Unlike [periodsDuration], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("periods_duration")
            @ExcludeMissing
            fun _periodsDuration(): JsonField<Double> = periodsDuration

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
                 * Returns a mutable builder for constructing an instance of [RecurringCredit].
                 *
                 * The following fields are required:
                 * ```java
                 * .creditAmount()
                 * .creditType()
                 * .name()
                 * .priority()
                 * .productId()
                 * .rolloverFraction()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RecurringCredit]. */
            class Builder internal constructor() {

                private var creditAmount: JsonField<Long>? = null
                private var creditType: JsonField<CreditType>? = null
                private var name: JsonField<String>? = null
                private var priority: JsonField<Double>? = null
                private var productId: JsonField<String>? = null
                private var rolloverFraction: JsonField<Double>? = null
                private var periodsDuration: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(recurringCredit: RecurringCredit) = apply {
                    creditAmount = recurringCredit.creditAmount
                    creditType = recurringCredit.creditType
                    name = recurringCredit.name
                    priority = recurringCredit.priority
                    productId = recurringCredit.productId
                    rolloverFraction = recurringCredit.rolloverFraction
                    periodsDuration = recurringCredit.periodsDuration
                    additionalProperties = recurringCredit.additionalProperties.toMutableMap()
                }

                fun creditAmount(creditAmount: Long) = creditAmount(JsonField.of(creditAmount))

                /**
                 * Sets [Builder.creditAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditAmount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditAmount(creditAmount: JsonField<Long>) = apply {
                    this.creditAmount = creditAmount
                }

                fun creditType(creditType: CreditType) = creditType(JsonField.of(creditType))

                /**
                 * Sets [Builder.creditType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditType] with a well-typed [CreditType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditType(creditType: JsonField<CreditType>) = apply {
                    this.creditType = creditType
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun priority(priority: Double) = priority(JsonField.of(priority))

                /**
                 * Sets [Builder.priority] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.priority] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

                /** The ID of the product in Metronome used to represent the credit grant */
                fun productId(productId: String) = productId(JsonField.of(productId))

                /**
                 * Sets [Builder.productId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun productId(productId: JsonField<String>) = apply { this.productId = productId }

                /**
                 * The fraction of the credit that will roll over to the next period, between 0 and
                 * 1
                 */
                fun rolloverFraction(rolloverFraction: Double) =
                    rolloverFraction(JsonField.of(rolloverFraction))

                /**
                 * Sets [Builder.rolloverFraction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rolloverFraction] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
                    this.rolloverFraction = rolloverFraction
                }

                /** How many billing periods the credit grant will last for */
                fun periodsDuration(periodsDuration: Double) =
                    periodsDuration(JsonField.of(periodsDuration))

                /**
                 * Sets [Builder.periodsDuration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.periodsDuration] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun periodsDuration(periodsDuration: JsonField<Double>) = apply {
                    this.periodsDuration = periodsDuration
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [RecurringCredit].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .creditAmount()
                 * .creditType()
                 * .name()
                 * .priority()
                 * .productId()
                 * .rolloverFraction()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RecurringCredit =
                    RecurringCredit(
                        checkRequired("creditAmount", creditAmount),
                        checkRequired("creditType", creditType),
                        checkRequired("name", name),
                        checkRequired("priority", priority),
                        checkRequired("productId", productId),
                        checkRequired("rolloverFraction", rolloverFraction),
                        periodsDuration,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): RecurringCredit = apply {
                if (validated) {
                    return@apply
                }

                creditAmount()
                creditType().validate()
                name()
                priority()
                productId()
                rolloverFraction()
                periodsDuration()
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
                (if (creditAmount.asKnown().isPresent) 1 else 0) +
                    (creditType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (priority.asKnown().isPresent) 1 else 0) +
                    (if (productId.asKnown().isPresent) 1 else 0) +
                    (if (rolloverFraction.asKnown().isPresent) 1 else 0) +
                    (if (periodsDuration.asKnown().isPresent) 1 else 0)

            class CreditType
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                ) : this(id, name, mutableMapOf())

                /**
                 * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                     * Returns a mutable builder for constructing an instance of [CreditType].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .name()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CreditType]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(creditType: CreditType) = apply {
                        id = creditType.id
                        name = creditType.name
                        additionalProperties = creditType.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [CreditType].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CreditType =
                        CreditType(
                            checkRequired("id", id),
                            checkRequired("name", name),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudAdminInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): CreditType = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    name()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CreditType &&
                        id == other.id &&
                        name == other.name &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CreditType{id=$id, name=$name, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RecurringCredit &&
                    creditAmount == other.creditAmount &&
                    creditType == other.creditType &&
                    name == other.name &&
                    priority == other.priority &&
                    productId == other.productId &&
                    rolloverFraction == other.rolloverFraction &&
                    periodsDuration == other.periodsDuration &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    creditAmount,
                    creditType,
                    name,
                    priority,
                    productId,
                    rolloverFraction,
                    periodsDuration,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RecurringCredit{creditAmount=$creditAmount, creditType=$creditType, name=$name, priority=$priority, productId=$productId, rolloverFraction=$rolloverFraction, periodsDuration=$periodsDuration, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Plan &&
                limits == other.limits &&
                name == other.name &&
                planFrequency == other.planFrequency &&
                id == other.id &&
                currentBillingPeriod == other.currentBillingPeriod &&
                endingBefore == other.endingBefore &&
                failureCount == other.failureCount &&
                isPaymentFailed == other.isPaymentFailed &&
                recurringCredits == other.recurringCredits &&
                startingOn == other.startingOn &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                limits,
                name,
                planFrequency,
                id,
                currentBillingPeriod,
                endingBefore,
                failureCount,
                isPaymentFailed,
                recurringCredits,
                startingOn,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Plan{limits=$limits, name=$name, planFrequency=$planFrequency, id=$id, currentBillingPeriod=$currentBillingPeriod, endingBefore=$endingBefore, failureCount=$failureCount, isPaymentFailed=$isPaymentFailed, recurringCredits=$recurringCredits, startingOn=$startingOn, additionalProperties=$additionalProperties}"
    }

    /** Account usage totals shown alongside the plan. */
    class Usage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val activeAlerts: JsonField<List<ActiveAlert>>,
        private val activeFreeCreditsUsage: JsonField<List<ActiveFreeCreditsUsage>>,
        private val currentInvoiceTotalUsdCents: JsonField<Long>,
        private val totalExtractionAgents: JsonField<Long>,
        private val totalIndexedPages: JsonField<Long>,
        private val totalIndexes: JsonField<Long>,
        private val totalUsers: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("active_alerts")
            @ExcludeMissing
            activeAlerts: JsonField<List<ActiveAlert>> = JsonMissing.of(),
            @JsonProperty("active_free_credits_usage")
            @ExcludeMissing
            activeFreeCreditsUsage: JsonField<List<ActiveFreeCreditsUsage>> = JsonMissing.of(),
            @JsonProperty("current_invoice_total_usd_cents")
            @ExcludeMissing
            currentInvoiceTotalUsdCents: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_extraction_agents")
            @ExcludeMissing
            totalExtractionAgents: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_indexed_pages")
            @ExcludeMissing
            totalIndexedPages: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_indexes")
            @ExcludeMissing
            totalIndexes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_users")
            @ExcludeMissing
            totalUsers: JsonField<Long> = JsonMissing.of(),
        ) : this(
            activeAlerts,
            activeFreeCreditsUsage,
            currentInvoiceTotalUsdCents,
            totalExtractionAgents,
            totalIndexedPages,
            totalIndexes,
            totalUsers,
            mutableMapOf(),
        )

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun activeAlerts(): Optional<List<ActiveAlert>> = activeAlerts.getOptional("active_alerts")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun activeFreeCreditsUsage(): Optional<List<ActiveFreeCreditsUsage>> =
            activeFreeCreditsUsage.getOptional("active_free_credits_usage")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currentInvoiceTotalUsdCents(): Optional<Long> =
            currentInvoiceTotalUsdCents.getOptional("current_invoice_total_usd_cents")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalExtractionAgents(): Optional<Long> =
            totalExtractionAgents.getOptional("total_extraction_agents")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalIndexedPages(): Optional<Long> =
            totalIndexedPages.getOptional("total_indexed_pages")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalIndexes(): Optional<Long> = totalIndexes.getOptional("total_indexes")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalUsers(): Optional<Long> = totalUsers.getOptional("total_users")

        /**
         * Returns the raw JSON value of [activeAlerts].
         *
         * Unlike [activeAlerts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("active_alerts")
        @ExcludeMissing
        fun _activeAlerts(): JsonField<List<ActiveAlert>> = activeAlerts

        /**
         * Returns the raw JSON value of [activeFreeCreditsUsage].
         *
         * Unlike [activeFreeCreditsUsage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("active_free_credits_usage")
        @ExcludeMissing
        fun _activeFreeCreditsUsage(): JsonField<List<ActiveFreeCreditsUsage>> =
            activeFreeCreditsUsage

        /**
         * Returns the raw JSON value of [currentInvoiceTotalUsdCents].
         *
         * Unlike [currentInvoiceTotalUsdCents], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("current_invoice_total_usd_cents")
        @ExcludeMissing
        fun _currentInvoiceTotalUsdCents(): JsonField<Long> = currentInvoiceTotalUsdCents

        /**
         * Returns the raw JSON value of [totalExtractionAgents].
         *
         * Unlike [totalExtractionAgents], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("total_extraction_agents")
        @ExcludeMissing
        fun _totalExtractionAgents(): JsonField<Long> = totalExtractionAgents

        /**
         * Returns the raw JSON value of [totalIndexedPages].
         *
         * Unlike [totalIndexedPages], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_indexed_pages")
        @ExcludeMissing
        fun _totalIndexedPages(): JsonField<Long> = totalIndexedPages

        /**
         * Returns the raw JSON value of [totalIndexes].
         *
         * Unlike [totalIndexes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_indexes")
        @ExcludeMissing
        fun _totalIndexes(): JsonField<Long> = totalIndexes

        /**
         * Returns the raw JSON value of [totalUsers].
         *
         * Unlike [totalUsers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_users") @ExcludeMissing fun _totalUsers(): JsonField<Long> = totalUsers

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

            /** Returns a mutable builder for constructing an instance of [Usage]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Usage]. */
        class Builder internal constructor() {

            private var activeAlerts: JsonField<MutableList<ActiveAlert>>? = null
            private var activeFreeCreditsUsage: JsonField<MutableList<ActiveFreeCreditsUsage>>? =
                null
            private var currentInvoiceTotalUsdCents: JsonField<Long> = JsonMissing.of()
            private var totalExtractionAgents: JsonField<Long> = JsonMissing.of()
            private var totalIndexedPages: JsonField<Long> = JsonMissing.of()
            private var totalIndexes: JsonField<Long> = JsonMissing.of()
            private var totalUsers: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usage: Usage) = apply {
                activeAlerts = usage.activeAlerts.map { it.toMutableList() }
                activeFreeCreditsUsage = usage.activeFreeCreditsUsage.map { it.toMutableList() }
                currentInvoiceTotalUsdCents = usage.currentInvoiceTotalUsdCents
                totalExtractionAgents = usage.totalExtractionAgents
                totalIndexedPages = usage.totalIndexedPages
                totalIndexes = usage.totalIndexes
                totalUsers = usage.totalUsers
                additionalProperties = usage.additionalProperties.toMutableMap()
            }

            fun activeAlerts(activeAlerts: List<ActiveAlert>) =
                activeAlerts(JsonField.of(activeAlerts))

            /**
             * Sets [Builder.activeAlerts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activeAlerts] with a well-typed `List<ActiveAlert>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun activeAlerts(activeAlerts: JsonField<List<ActiveAlert>>) = apply {
                this.activeAlerts = activeAlerts.map { it.toMutableList() }
            }

            /**
             * Adds a single [ActiveAlert] to [activeAlerts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addActiveAlert(activeAlert: ActiveAlert) = apply {
                activeAlerts =
                    (activeAlerts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("activeAlerts", it).add(activeAlert)
                    }
            }

            fun activeFreeCreditsUsage(activeFreeCreditsUsage: List<ActiveFreeCreditsUsage>) =
                activeFreeCreditsUsage(JsonField.of(activeFreeCreditsUsage))

            /**
             * Sets [Builder.activeFreeCreditsUsage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activeFreeCreditsUsage] with a well-typed
             * `List<ActiveFreeCreditsUsage>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun activeFreeCreditsUsage(
                activeFreeCreditsUsage: JsonField<List<ActiveFreeCreditsUsage>>
            ) = apply {
                this.activeFreeCreditsUsage = activeFreeCreditsUsage.map { it.toMutableList() }
            }

            /**
             * Adds a single [ActiveFreeCreditsUsage] to [Builder.activeFreeCreditsUsage].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addActiveFreeCreditsUsage(activeFreeCreditsUsage: ActiveFreeCreditsUsage) = apply {
                this.activeFreeCreditsUsage =
                    (this.activeFreeCreditsUsage ?: JsonField.of(mutableListOf())).also {
                        checkKnown("activeFreeCreditsUsage", it).add(activeFreeCreditsUsage)
                    }
            }

            fun currentInvoiceTotalUsdCents(currentInvoiceTotalUsdCents: Long?) =
                currentInvoiceTotalUsdCents(JsonField.ofNullable(currentInvoiceTotalUsdCents))

            /**
             * Alias for [Builder.currentInvoiceTotalUsdCents].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun currentInvoiceTotalUsdCents(currentInvoiceTotalUsdCents: Long) =
                currentInvoiceTotalUsdCents(currentInvoiceTotalUsdCents as Long?)

            /**
             * Alias for calling [Builder.currentInvoiceTotalUsdCents] with
             * `currentInvoiceTotalUsdCents.orElse(null)`.
             */
            fun currentInvoiceTotalUsdCents(currentInvoiceTotalUsdCents: Optional<Long>) =
                currentInvoiceTotalUsdCents(currentInvoiceTotalUsdCents.getOrNull())

            /**
             * Sets [Builder.currentInvoiceTotalUsdCents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentInvoiceTotalUsdCents] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun currentInvoiceTotalUsdCents(currentInvoiceTotalUsdCents: JsonField<Long>) = apply {
                this.currentInvoiceTotalUsdCents = currentInvoiceTotalUsdCents
            }

            fun totalExtractionAgents(totalExtractionAgents: Long) =
                totalExtractionAgents(JsonField.of(totalExtractionAgents))

            /**
             * Sets [Builder.totalExtractionAgents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalExtractionAgents] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun totalExtractionAgents(totalExtractionAgents: JsonField<Long>) = apply {
                this.totalExtractionAgents = totalExtractionAgents
            }

            fun totalIndexedPages(totalIndexedPages: Long) =
                totalIndexedPages(JsonField.of(totalIndexedPages))

            /**
             * Sets [Builder.totalIndexedPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalIndexedPages] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalIndexedPages(totalIndexedPages: JsonField<Long>) = apply {
                this.totalIndexedPages = totalIndexedPages
            }

            fun totalIndexes(totalIndexes: Long) = totalIndexes(JsonField.of(totalIndexes))

            /**
             * Sets [Builder.totalIndexes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalIndexes] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalIndexes(totalIndexes: JsonField<Long>) = apply {
                this.totalIndexes = totalIndexes
            }

            fun totalUsers(totalUsers: Long) = totalUsers(JsonField.of(totalUsers))

            /**
             * Sets [Builder.totalUsers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalUsers] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalUsers(totalUsers: JsonField<Long>) = apply { this.totalUsers = totalUsers }

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
             * Returns an immutable instance of [Usage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Usage =
                Usage(
                    (activeAlerts ?: JsonMissing.of()).map { it.toImmutable() },
                    (activeFreeCreditsUsage ?: JsonMissing.of()).map { it.toImmutable() },
                    currentInvoiceTotalUsdCents,
                    totalExtractionAgents,
                    totalIndexedPages,
                    totalIndexes,
                    totalUsers,
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
        fun validate(): Usage = apply {
            if (validated) {
                return@apply
            }

            activeAlerts().ifPresent { it.forEach { it.validate() } }
            activeFreeCreditsUsage().ifPresent { it.forEach { it.validate() } }
            currentInvoiceTotalUsdCents()
            totalExtractionAgents()
            totalIndexedPages()
            totalIndexes()
            totalUsers()
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
            (activeAlerts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (activeFreeCreditsUsage.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (currentInvoiceTotalUsdCents.asKnown().isPresent) 1 else 0) +
                (if (totalExtractionAgents.asKnown().isPresent) 1 else 0) +
                (if (totalIndexedPages.asKnown().isPresent) 1 else 0) +
                (if (totalIndexes.asKnown().isPresent) 1 else 0) +
                (if (totalUsers.asKnown().isPresent) 1 else 0)

        class ActiveAlert @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField
                val CONFIGURED_SPEND_LIMIT_EXCEEDED = of("configured_spend_limit_exceeded")

                @JvmField val FREE_CREDITS_EXHAUSTED = of("free_credits_exhausted")

                @JvmField val HAS_SPENDING_ALERT = of("has_spending_alert")

                @JvmField val INTERNAL_SPENDING_ALERT = of("internal_spending_alert")

                @JvmField val PLAN_SPEND_LIMIT_EXCEEDED = of("plan_spend_limit_exceeded")

                @JvmField val PLAN_SPEND_LIMIT_SOFT_ALERT = of("plan_spend_limit_soft_alert")

                @JvmStatic fun of(value: String) = ActiveAlert(JsonField.of(value))
            }

            /** An enum containing [ActiveAlert]'s known values. */
            enum class Known {
                CONFIGURED_SPEND_LIMIT_EXCEEDED,
                FREE_CREDITS_EXHAUSTED,
                HAS_SPENDING_ALERT,
                INTERNAL_SPENDING_ALERT,
                PLAN_SPEND_LIMIT_EXCEEDED,
                PLAN_SPEND_LIMIT_SOFT_ALERT,
            }

            /**
             * An enum containing [ActiveAlert]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ActiveAlert] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CONFIGURED_SPEND_LIMIT_EXCEEDED,
                FREE_CREDITS_EXHAUSTED,
                HAS_SPENDING_ALERT,
                INTERNAL_SPENDING_ALERT,
                PLAN_SPEND_LIMIT_EXCEEDED,
                PLAN_SPEND_LIMIT_SOFT_ALERT,
                /**
                 * An enum member indicating that [ActiveAlert] was instantiated with an unknown
                 * value.
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
                    CONFIGURED_SPEND_LIMIT_EXCEEDED -> Value.CONFIGURED_SPEND_LIMIT_EXCEEDED
                    FREE_CREDITS_EXHAUSTED -> Value.FREE_CREDITS_EXHAUSTED
                    HAS_SPENDING_ALERT -> Value.HAS_SPENDING_ALERT
                    INTERNAL_SPENDING_ALERT -> Value.INTERNAL_SPENDING_ALERT
                    PLAN_SPEND_LIMIT_EXCEEDED -> Value.PLAN_SPEND_LIMIT_EXCEEDED
                    PLAN_SPEND_LIMIT_SOFT_ALERT -> Value.PLAN_SPEND_LIMIT_SOFT_ALERT
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
                    CONFIGURED_SPEND_LIMIT_EXCEEDED -> Known.CONFIGURED_SPEND_LIMIT_EXCEEDED
                    FREE_CREDITS_EXHAUSTED -> Known.FREE_CREDITS_EXHAUSTED
                    HAS_SPENDING_ALERT -> Known.HAS_SPENDING_ALERT
                    INTERNAL_SPENDING_ALERT -> Known.INTERNAL_SPENDING_ALERT
                    PLAN_SPEND_LIMIT_EXCEEDED -> Known.PLAN_SPEND_LIMIT_EXCEEDED
                    PLAN_SPEND_LIMIT_SOFT_ALERT -> Known.PLAN_SPEND_LIMIT_SOFT_ALERT
                    else -> throw LlamaCloudAdminInvalidDataException("Unknown ActiveAlert: $value")
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
            fun validate(): ActiveAlert = apply {
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

                return other is ActiveAlert && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ActiveFreeCreditsUsage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val expiresAt: JsonField<OffsetDateTime>,
            private val grantName: JsonField<String>,
            private val remainingBalance: JsonField<Long>,
            private val startingBalance: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("expires_at")
                @ExcludeMissing
                expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("grant_name")
                @ExcludeMissing
                grantName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("remaining_balance")
                @ExcludeMissing
                remainingBalance: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("starting_balance")
                @ExcludeMissing
                startingBalance: JsonField<Long> = JsonMissing.of(),
            ) : this(expiresAt, grantName, remainingBalance, startingBalance, mutableMapOf())

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun grantName(): String = grantName.getRequired("grant_name")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun remainingBalance(): Long = remainingBalance.getRequired("remaining_balance")

            /**
             * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startingBalance(): Long = startingBalance.getRequired("starting_balance")

            /**
             * Returns the raw JSON value of [expiresAt].
             *
             * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expires_at")
            @ExcludeMissing
            fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

            /**
             * Returns the raw JSON value of [grantName].
             *
             * Unlike [grantName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("grant_name")
            @ExcludeMissing
            fun _grantName(): JsonField<String> = grantName

            /**
             * Returns the raw JSON value of [remainingBalance].
             *
             * Unlike [remainingBalance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("remaining_balance")
            @ExcludeMissing
            fun _remainingBalance(): JsonField<Long> = remainingBalance

            /**
             * Returns the raw JSON value of [startingBalance].
             *
             * Unlike [startingBalance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("starting_balance")
            @ExcludeMissing
            fun _startingBalance(): JsonField<Long> = startingBalance

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
                 * [ActiveFreeCreditsUsage].
                 *
                 * The following fields are required:
                 * ```java
                 * .expiresAt()
                 * .grantName()
                 * .remainingBalance()
                 * .startingBalance()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ActiveFreeCreditsUsage]. */
            class Builder internal constructor() {

                private var expiresAt: JsonField<OffsetDateTime>? = null
                private var grantName: JsonField<String>? = null
                private var remainingBalance: JsonField<Long>? = null
                private var startingBalance: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(activeFreeCreditsUsage: ActiveFreeCreditsUsage) = apply {
                    expiresAt = activeFreeCreditsUsage.expiresAt
                    grantName = activeFreeCreditsUsage.grantName
                    remainingBalance = activeFreeCreditsUsage.remainingBalance
                    startingBalance = activeFreeCreditsUsage.startingBalance
                    additionalProperties =
                        activeFreeCreditsUsage.additionalProperties.toMutableMap()
                }

                fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

                /**
                 * Sets [Builder.expiresAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

                fun grantName(grantName: String) = grantName(JsonField.of(grantName))

                /**
                 * Sets [Builder.grantName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.grantName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun grantName(grantName: JsonField<String>) = apply { this.grantName = grantName }

                fun remainingBalance(remainingBalance: Long) =
                    remainingBalance(JsonField.of(remainingBalance))

                /**
                 * Sets [Builder.remainingBalance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.remainingBalance] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun remainingBalance(remainingBalance: JsonField<Long>) = apply {
                    this.remainingBalance = remainingBalance
                }

                fun startingBalance(startingBalance: Long) =
                    startingBalance(JsonField.of(startingBalance))

                /**
                 * Sets [Builder.startingBalance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startingBalance] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun startingBalance(startingBalance: JsonField<Long>) = apply {
                    this.startingBalance = startingBalance
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ActiveFreeCreditsUsage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .expiresAt()
                 * .grantName()
                 * .remainingBalance()
                 * .startingBalance()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ActiveFreeCreditsUsage =
                    ActiveFreeCreditsUsage(
                        checkRequired("expiresAt", expiresAt),
                        checkRequired("grantName", grantName),
                        checkRequired("remainingBalance", remainingBalance),
                        checkRequired("startingBalance", startingBalance),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): ActiveFreeCreditsUsage = apply {
                if (validated) {
                    return@apply
                }

                expiresAt()
                grantName()
                remainingBalance()
                startingBalance()
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
                (if (expiresAt.asKnown().isPresent) 1 else 0) +
                    (if (grantName.asKnown().isPresent) 1 else 0) +
                    (if (remainingBalance.asKnown().isPresent) 1 else 0) +
                    (if (startingBalance.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ActiveFreeCreditsUsage &&
                    expiresAt == other.expiresAt &&
                    grantName == other.grantName &&
                    remainingBalance == other.remainingBalance &&
                    startingBalance == other.startingBalance &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    expiresAt,
                    grantName,
                    remainingBalance,
                    startingBalance,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ActiveFreeCreditsUsage{expiresAt=$expiresAt, grantName=$grantName, remainingBalance=$remainingBalance, startingBalance=$startingBalance, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Usage &&
                activeAlerts == other.activeAlerts &&
                activeFreeCreditsUsage == other.activeFreeCreditsUsage &&
                currentInvoiceTotalUsdCents == other.currentInvoiceTotalUsdCents &&
                totalExtractionAgents == other.totalExtractionAgents &&
                totalIndexedPages == other.totalIndexedPages &&
                totalIndexes == other.totalIndexes &&
                totalUsers == other.totalUsers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                activeAlerts,
                activeFreeCreditsUsage,
                currentInvoiceTotalUsdCents,
                totalExtractionAgents,
                totalIndexedPages,
                totalIndexes,
                totalUsers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Usage{activeAlerts=$activeAlerts, activeFreeCreditsUsage=$activeFreeCreditsUsage, currentInvoiceTotalUsdCents=$currentInvoiceTotalUsdCents, totalExtractionAgents=$totalExtractionAgents, totalIndexedPages=$totalIndexedPages, totalIndexes=$totalIndexes, totalUsers=$totalUsers, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageAndPlan &&
            plan == other.plan &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(plan, usage, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageAndPlan{plan=$plan, usage=$usage, additionalProperties=$additionalProperties}"
}
