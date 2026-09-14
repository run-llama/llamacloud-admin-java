// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.quotamanagement

import ai.llamaindex.llamacloudadmin.core.Enum
import ai.llamaindex.llamacloudadmin.core.ExcludeMissing
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.JsonMissing
import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.Params
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.core.http.Headers
import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import ai.llamaindex.llamacloudadmin.errors.LlamaCloudAdminInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a quota configuration for your organization, or for a single project within it. */
class QuotaManagementCreateParams
private constructor(
    private val organizationId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun organizationId(): String = organizationId

    /**
     * The quota setting to update
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun setting(): Setting = body.setting()

    /**
     * The value for the setting. For boolean settings, use 1 (enabled) or 0 (disabled). For credit
     * limits, the number of credits allowed in the window; delete the setting to remove the limit.
     * For limits denominated in USD cents, a whole number of dollars (a multiple of 100).
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): Long = body.value()

    /**
     * Limit this project on its own. Omit to limit the organization as a whole. A project limit
     * does not inherit from the organization limit: both apply, and whichever is reached first
     * stops the work. Credit limits only.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun projectId(): Optional<String> = body.projectId()

    /**
     * Returns the raw JSON value of [setting].
     *
     * Unlike [setting], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _setting(): JsonField<Setting> = body._setting()

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _value(): JsonField<Long> = body._value()

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _projectId(): JsonField<String> = body._projectId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [QuotaManagementCreateParams].
         *
         * The following fields are required:
         * ```java
         * .organizationId()
         * .setting()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QuotaManagementCreateParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(quotaManagementCreateParams: QuotaManagementCreateParams) = apply {
            organizationId = quotaManagementCreateParams.organizationId
            body = quotaManagementCreateParams.body.toBuilder()
            additionalHeaders = quotaManagementCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = quotaManagementCreateParams.additionalQueryParams.toBuilder()
        }

        fun organizationId(organizationId: String) = apply { this.organizationId = organizationId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [setting]
         * - [value]
         * - [projectId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The quota setting to update */
        fun setting(setting: Setting) = apply { body.setting(setting) }

        /**
         * Sets [Builder.setting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.setting] with a well-typed [Setting] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun setting(setting: JsonField<Setting>) = apply { body.setting(setting) }

        /**
         * The value for the setting. For boolean settings, use 1 (enabled) or 0 (disabled). For
         * credit limits, the number of credits allowed in the window; delete the setting to remove
         * the limit. For limits denominated in USD cents, a whole number of dollars (a multiple of
         * 100).
         */
        fun value(value: Long) = apply { body.value(value) }

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Long>) = apply { body.value(value) }

        /**
         * Limit this project on its own. Omit to limit the organization as a whole. A project limit
         * does not inherit from the organization limit: both apply, and whichever is reached first
         * stops the work. Credit limits only.
         */
        fun projectId(projectId: String?) = apply { body.projectId(projectId) }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { body.projectId(projectId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [QuotaManagementCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .organizationId()
         * .setting()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QuotaManagementCreateParams =
            QuotaManagementCreateParams(
                checkRequired("organizationId", organizationId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("organization_id", organizationId)
                putAll(additionalQueryParams)
            }
            .build()

    /** Create or update a quota setting for your organization, or for one project in it. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val setting: JsonField<Setting>,
        private val value: JsonField<Long>,
        private val projectId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("setting") @ExcludeMissing setting: JsonField<Setting> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("project_id")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
        ) : this(setting, value, projectId, mutableMapOf())

        /**
         * The quota setting to update
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun setting(): Setting = setting.getRequired("setting")

        /**
         * The value for the setting. For boolean settings, use 1 (enabled) or 0 (disabled). For
         * credit limits, the number of credits allowed in the window; delete the setting to remove
         * the limit. For limits denominated in USD cents, a whole number of dollars (a multiple of
         * 100).
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun value(): Long = value.getRequired("value")

        /**
         * Limit this project on its own. Omit to limit the organization as a whole. A project limit
         * does not inherit from the organization limit: both apply, and whichever is reached first
         * stops the work. Credit limits only.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun projectId(): Optional<String> = projectId.getOptional("project_id")

        /**
         * Returns the raw JSON value of [setting].
         *
         * Unlike [setting], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("setting") @ExcludeMissing fun _setting(): JsonField<Setting> = setting

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .setting()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var setting: JsonField<Setting>? = null
            private var value: JsonField<Long>? = null
            private var projectId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                setting = body.setting
                value = body.value
                projectId = body.projectId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The quota setting to update */
            fun setting(setting: Setting) = setting(JsonField.of(setting))

            /**
             * Sets [Builder.setting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.setting] with a well-typed [Setting] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun setting(setting: JsonField<Setting>) = apply { this.setting = setting }

            /**
             * The value for the setting. For boolean settings, use 1 (enabled) or 0 (disabled). For
             * credit limits, the number of credits allowed in the window; delete the setting to
             * remove the limit. For limits denominated in USD cents, a whole number of dollars (a
             * multiple of 100).
             */
            fun value(value: Long) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun value(value: JsonField<Long>) = apply { this.value = value }

            /**
             * Limit this project on its own. Omit to limit the organization as a whole. A project
             * limit does not inherit from the organization limit: both apply, and whichever is
             * reached first stops the work. Credit limits only.
             */
            fun projectId(projectId: String?) = projectId(JsonField.ofNullable(projectId))

            /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
            fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .setting()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("setting", setting),
                    checkRequired("value", value),
                    projectId,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            setting().validate()
            value()
            projectId()
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
            (setting.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0) +
                (if (projectId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                setting == other.setting &&
                value == other.value &&
                projectId == other.projectId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(setting, value, projectId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{setting=$setting, value=$value, projectId=$projectId, additionalProperties=$additionalProperties}"
    }

    /** The quota setting to update */
    class Setting @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LIMIT_DAILY_USAGE_CREDITS = of("limit_daily_usage_credits")

            @JvmField val LIMIT_MONTHLY_USAGE_CREDITS = of("limit_monthly_usage_credits")

            @JvmStatic fun of(value: String) = Setting(JsonField.of(value))
        }

        /** An enum containing [Setting]'s known values. */
        enum class Known {
            ALLOW_PAY_AS_YOU_GO,
            LIMIT_DAILY_USAGE_CREDITS,
            LIMIT_MONTHLY_USAGE_CREDITS,
        }

        /**
         * An enum containing [Setting]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Setting] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALLOW_PAY_AS_YOU_GO,
            LIMIT_DAILY_USAGE_CREDITS,
            LIMIT_MONTHLY_USAGE_CREDITS,
            /** An enum member indicating that [Setting] was instantiated with an unknown value. */
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
                LIMIT_DAILY_USAGE_CREDITS -> Value.LIMIT_DAILY_USAGE_CREDITS
                LIMIT_MONTHLY_USAGE_CREDITS -> Value.LIMIT_MONTHLY_USAGE_CREDITS
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
                LIMIT_DAILY_USAGE_CREDITS -> Known.LIMIT_DAILY_USAGE_CREDITS
                LIMIT_MONTHLY_USAGE_CREDITS -> Known.LIMIT_MONTHLY_USAGE_CREDITS
                else -> throw LlamaCloudAdminInvalidDataException("Unknown Setting: $value")
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
        fun validate(): Setting = apply {
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

            return other is Setting && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuotaManagementCreateParams &&
            organizationId == other.organizationId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(organizationId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "QuotaManagementCreateParams{organizationId=$organizationId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
