// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin.users

import ai.llamaindex.llamacloudadmin.core.Enum
import ai.llamaindex.llamacloudadmin.core.ExcludeMissing
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.JsonMissing
import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.Params
import ai.llamaindex.llamacloudadmin.core.checkKnown
import ai.llamaindex.llamacloudadmin.core.http.Headers
import ai.llamaindex.llamacloudadmin.core.http.QueryParams
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

/**
 * Additively update a user's custom claims.
 *
 * Claims in `set_claims` are added or overwritten; claims named in `remove_claims` are reset to
 * their system default. Claims not referenced by either field are left unchanged, so a single claim
 * can be changed without resending the full set. Returns the user's resolved claims after the
 * update.
 *
 * Returns 404 if the user does not exist.
 *
 * Global admin only.
 */
class UserUpdateClaimsParams
private constructor(
    private val userId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun userId(): Optional<String> = Optional.ofNullable(userId)

    /**
     * Names of claims to reset to their system default.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun removeClaims(): Optional<List<RemoveClaim>> = body.removeClaims()

    /**
     * A partial set of custom claims for additive updates.
     *
     * Every field is optional. Only the claims explicitly provided in a request are added or
     * overwritten; claims left unset are not touched, so callers can change a single claim without
     * resending the full claim set.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun setClaims(): Optional<SetClaims> = body.setClaims()

    /**
     * Returns the raw JSON value of [removeClaims].
     *
     * Unlike [removeClaims], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _removeClaims(): JsonField<List<RemoveClaim>> = body._removeClaims()

    /**
     * Returns the raw JSON value of [setClaims].
     *
     * Unlike [setClaims], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _setClaims(): JsonField<SetClaims> = body._setClaims()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): UserUpdateClaimsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [UserUpdateClaimsParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserUpdateClaimsParams]. */
    class Builder internal constructor() {

        private var userId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(userUpdateClaimsParams: UserUpdateClaimsParams) = apply {
            userId = userUpdateClaimsParams.userId
            body = userUpdateClaimsParams.body.toBuilder()
            additionalHeaders = userUpdateClaimsParams.additionalHeaders.toBuilder()
            additionalQueryParams = userUpdateClaimsParams.additionalQueryParams.toBuilder()
        }

        fun userId(userId: String?) = apply { this.userId = userId }

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [removeClaims]
         * - [setClaims]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Names of claims to reset to their system default. */
        fun removeClaims(removeClaims: List<RemoveClaim>?) = apply {
            body.removeClaims(removeClaims)
        }

        /** Alias for calling [Builder.removeClaims] with `removeClaims.orElse(null)`. */
        fun removeClaims(removeClaims: Optional<List<RemoveClaim>>) =
            removeClaims(removeClaims.getOrNull())

        /**
         * Sets [Builder.removeClaims] to an arbitrary JSON value.
         *
         * You should usually call [Builder.removeClaims] with a well-typed `List<RemoveClaim>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun removeClaims(removeClaims: JsonField<List<RemoveClaim>>) = apply {
            body.removeClaims(removeClaims)
        }

        /**
         * Adds a single [RemoveClaim] to [removeClaims].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemoveClaim(removeClaim: RemoveClaim) = apply { body.addRemoveClaim(removeClaim) }

        /**
         * A partial set of custom claims for additive updates.
         *
         * Every field is optional. Only the claims explicitly provided in a request are added or
         * overwritten; claims left unset are not touched, so callers can change a single claim
         * without resending the full claim set.
         */
        fun setClaims(setClaims: SetClaims?) = apply { body.setClaims(setClaims) }

        /** Alias for calling [Builder.setClaims] with `setClaims.orElse(null)`. */
        fun setClaims(setClaims: Optional<SetClaims>) = setClaims(setClaims.getOrNull())

        /**
         * Sets [Builder.setClaims] to an arbitrary JSON value.
         *
         * You should usually call [Builder.setClaims] with a well-typed [SetClaims] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun setClaims(setClaims: JsonField<SetClaims>) = apply { body.setClaims(setClaims) }

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
         * Returns an immutable instance of [UserUpdateClaimsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserUpdateClaimsParams =
            UserUpdateClaimsParams(
                userId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> userId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request body for additively updating a user's custom claims.
     *
     * Claims in `set_claims` are added or overwritten; claims named in `remove_claims` are reset to
     * their system default. Claims not referenced by either field are left unchanged. At least one
     * of the two fields must be provided, and a claim may not appear in both.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val removeClaims: JsonField<List<RemoveClaim>>,
        private val setClaims: JsonField<SetClaims>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("remove_claims")
            @ExcludeMissing
            removeClaims: JsonField<List<RemoveClaim>> = JsonMissing.of(),
            @JsonProperty("set_claims")
            @ExcludeMissing
            setClaims: JsonField<SetClaims> = JsonMissing.of(),
        ) : this(removeClaims, setClaims, mutableMapOf())

        /**
         * Names of claims to reset to their system default.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun removeClaims(): Optional<List<RemoveClaim>> = removeClaims.getOptional("remove_claims")

        /**
         * A partial set of custom claims for additive updates.
         *
         * Every field is optional. Only the claims explicitly provided in a request are added or
         * overwritten; claims left unset are not touched, so callers can change a single claim
         * without resending the full claim set.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun setClaims(): Optional<SetClaims> = setClaims.getOptional("set_claims")

        /**
         * Returns the raw JSON value of [removeClaims].
         *
         * Unlike [removeClaims], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("remove_claims")
        @ExcludeMissing
        fun _removeClaims(): JsonField<List<RemoveClaim>> = removeClaims

        /**
         * Returns the raw JSON value of [setClaims].
         *
         * Unlike [setClaims], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("set_claims")
        @ExcludeMissing
        fun _setClaims(): JsonField<SetClaims> = setClaims

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var removeClaims: JsonField<MutableList<RemoveClaim>>? = null
            private var setClaims: JsonField<SetClaims> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                removeClaims = body.removeClaims.map { it.toMutableList() }
                setClaims = body.setClaims
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Names of claims to reset to their system default. */
            fun removeClaims(removeClaims: List<RemoveClaim>?) =
                removeClaims(JsonField.ofNullable(removeClaims))

            /** Alias for calling [Builder.removeClaims] with `removeClaims.orElse(null)`. */
            fun removeClaims(removeClaims: Optional<List<RemoveClaim>>) =
                removeClaims(removeClaims.getOrNull())

            /**
             * Sets [Builder.removeClaims] to an arbitrary JSON value.
             *
             * You should usually call [Builder.removeClaims] with a well-typed `List<RemoveClaim>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun removeClaims(removeClaims: JsonField<List<RemoveClaim>>) = apply {
                this.removeClaims = removeClaims.map { it.toMutableList() }
            }

            /**
             * Adds a single [RemoveClaim] to [removeClaims].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemoveClaim(removeClaim: RemoveClaim) = apply {
                removeClaims =
                    (removeClaims ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removeClaims", it).add(removeClaim)
                    }
            }

            /**
             * A partial set of custom claims for additive updates.
             *
             * Every field is optional. Only the claims explicitly provided in a request are added
             * or overwritten; claims left unset are not touched, so callers can change a single
             * claim without resending the full claim set.
             */
            fun setClaims(setClaims: SetClaims?) = setClaims(JsonField.ofNullable(setClaims))

            /** Alias for calling [Builder.setClaims] with `setClaims.orElse(null)`. */
            fun setClaims(setClaims: Optional<SetClaims>) = setClaims(setClaims.getOrNull())

            /**
             * Sets [Builder.setClaims] to an arbitrary JSON value.
             *
             * You should usually call [Builder.setClaims] with a well-typed [SetClaims] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun setClaims(setClaims: JsonField<SetClaims>) = apply { this.setClaims = setClaims }

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
             */
            fun build(): Body =
                Body(
                    (removeClaims ?: JsonMissing.of()).map { it.toImmutable() },
                    setClaims,
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

            removeClaims().ifPresent { it.forEach { it.validate() } }
            setClaims().ifPresent { it.validate() }
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
            (removeClaims.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (setClaims.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                removeClaims == other.removeClaims &&
                setClaims == other.setClaims &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(removeClaims, setClaims, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{removeClaims=$removeClaims, setClaims=$setClaims, additionalProperties=$additionalProperties}"
    }

    class RemoveClaim @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ALLOW_ORG_DELETION = of("allow_org_deletion")

            @JvmField val ALLOWED_ORG_CREATION = of("allowed_org_creation")

            @JvmField val API_DATASOURCE_ACCESS = of("api_datasource_access")

            @JvmField val MAXIMUM_ORG_CREATION = of("maximum_org_creation")

            @JvmStatic fun of(value: String) = RemoveClaim(JsonField.of(value))
        }

        /** An enum containing [RemoveClaim]'s known values. */
        enum class Known {
            ALLOW_ORG_DELETION,
            ALLOWED_ORG_CREATION,
            API_DATASOURCE_ACCESS,
            MAXIMUM_ORG_CREATION,
        }

        /**
         * An enum containing [RemoveClaim]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RemoveClaim] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALLOW_ORG_DELETION,
            ALLOWED_ORG_CREATION,
            API_DATASOURCE_ACCESS,
            MAXIMUM_ORG_CREATION,
            /**
             * An enum member indicating that [RemoveClaim] was instantiated with an unknown value.
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
                ALLOW_ORG_DELETION -> Value.ALLOW_ORG_DELETION
                ALLOWED_ORG_CREATION -> Value.ALLOWED_ORG_CREATION
                API_DATASOURCE_ACCESS -> Value.API_DATASOURCE_ACCESS
                MAXIMUM_ORG_CREATION -> Value.MAXIMUM_ORG_CREATION
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
                ALLOW_ORG_DELETION -> Known.ALLOW_ORG_DELETION
                ALLOWED_ORG_CREATION -> Known.ALLOWED_ORG_CREATION
                API_DATASOURCE_ACCESS -> Known.API_DATASOURCE_ACCESS
                MAXIMUM_ORG_CREATION -> Known.MAXIMUM_ORG_CREATION
                else -> throw LlamaCloudAdminInvalidDataException("Unknown RemoveClaim: $value")
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
        fun validate(): RemoveClaim = apply {
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

            return other is RemoveClaim && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A partial set of custom claims for additive updates.
     *
     * Every field is optional. Only the claims explicitly provided in a request are added or
     * overwritten; claims left unset are not touched, so callers can change a single claim without
     * resending the full claim set.
     */
    class SetClaims
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowOrgDeletion: JsonField<Boolean>,
        private val allowedOrgCreation: JsonField<Boolean>,
        private val apiDatasourceAccess: JsonField<Boolean>,
        private val maximumOrgCreation: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allow_org_deletion")
            @ExcludeMissing
            allowOrgDeletion: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allowed_org_creation")
            @ExcludeMissing
            allowedOrgCreation: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("api_datasource_access")
            @ExcludeMissing
            apiDatasourceAccess: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("maximum_org_creation")
            @ExcludeMissing
            maximumOrgCreation: JsonField<Long> = JsonMissing.of(),
        ) : this(
            allowOrgDeletion,
            allowedOrgCreation,
            apiDatasourceAccess,
            maximumOrgCreation,
            mutableMapOf(),
        )

        /**
         * Whether the user is allowed to delete organizations.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun allowOrgDeletion(): Optional<Boolean> =
            allowOrgDeletion.getOptional("allow_org_deletion")

        /**
         * Whether the user is allowed to create organizations.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun allowedOrgCreation(): Optional<Boolean> =
            allowedOrgCreation.getOptional("allowed_org_creation")

        /**
         * Whether the user is allowed to access API data sources.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun apiDatasourceAccess(): Optional<Boolean> =
            apiDatasourceAccess.getOptional("api_datasource_access")

        /**
         * Cap on how many organizations this user may create. None means unlimited. Only enforced
         * when allowed_org_creation is True.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maximumOrgCreation(): Optional<Long> =
            maximumOrgCreation.getOptional("maximum_org_creation")

        /**
         * Returns the raw JSON value of [allowOrgDeletion].
         *
         * Unlike [allowOrgDeletion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allow_org_deletion")
        @ExcludeMissing
        fun _allowOrgDeletion(): JsonField<Boolean> = allowOrgDeletion

        /**
         * Returns the raw JSON value of [allowedOrgCreation].
         *
         * Unlike [allowedOrgCreation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowed_org_creation")
        @ExcludeMissing
        fun _allowedOrgCreation(): JsonField<Boolean> = allowedOrgCreation

        /**
         * Returns the raw JSON value of [apiDatasourceAccess].
         *
         * Unlike [apiDatasourceAccess], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("api_datasource_access")
        @ExcludeMissing
        fun _apiDatasourceAccess(): JsonField<Boolean> = apiDatasourceAccess

        /**
         * Returns the raw JSON value of [maximumOrgCreation].
         *
         * Unlike [maximumOrgCreation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("maximum_org_creation")
        @ExcludeMissing
        fun _maximumOrgCreation(): JsonField<Long> = maximumOrgCreation

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

            /** Returns a mutable builder for constructing an instance of [SetClaims]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SetClaims]. */
        class Builder internal constructor() {

            private var allowOrgDeletion: JsonField<Boolean> = JsonMissing.of()
            private var allowedOrgCreation: JsonField<Boolean> = JsonMissing.of()
            private var apiDatasourceAccess: JsonField<Boolean> = JsonMissing.of()
            private var maximumOrgCreation: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(setClaims: SetClaims) = apply {
                allowOrgDeletion = setClaims.allowOrgDeletion
                allowedOrgCreation = setClaims.allowedOrgCreation
                apiDatasourceAccess = setClaims.apiDatasourceAccess
                maximumOrgCreation = setClaims.maximumOrgCreation
                additionalProperties = setClaims.additionalProperties.toMutableMap()
            }

            /** Whether the user is allowed to delete organizations. */
            fun allowOrgDeletion(allowOrgDeletion: Boolean?) =
                allowOrgDeletion(JsonField.ofNullable(allowOrgDeletion))

            /**
             * Alias for [Builder.allowOrgDeletion].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun allowOrgDeletion(allowOrgDeletion: Boolean) =
                allowOrgDeletion(allowOrgDeletion as Boolean?)

            /**
             * Alias for calling [Builder.allowOrgDeletion] with `allowOrgDeletion.orElse(null)`.
             */
            fun allowOrgDeletion(allowOrgDeletion: Optional<Boolean>) =
                allowOrgDeletion(allowOrgDeletion.getOrNull())

            /**
             * Sets [Builder.allowOrgDeletion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowOrgDeletion] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allowOrgDeletion(allowOrgDeletion: JsonField<Boolean>) = apply {
                this.allowOrgDeletion = allowOrgDeletion
            }

            /** Whether the user is allowed to create organizations. */
            fun allowedOrgCreation(allowedOrgCreation: Boolean?) =
                allowedOrgCreation(JsonField.ofNullable(allowedOrgCreation))

            /**
             * Alias for [Builder.allowedOrgCreation].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun allowedOrgCreation(allowedOrgCreation: Boolean) =
                allowedOrgCreation(allowedOrgCreation as Boolean?)

            /**
             * Alias for calling [Builder.allowedOrgCreation] with
             * `allowedOrgCreation.orElse(null)`.
             */
            fun allowedOrgCreation(allowedOrgCreation: Optional<Boolean>) =
                allowedOrgCreation(allowedOrgCreation.getOrNull())

            /**
             * Sets [Builder.allowedOrgCreation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedOrgCreation] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowedOrgCreation(allowedOrgCreation: JsonField<Boolean>) = apply {
                this.allowedOrgCreation = allowedOrgCreation
            }

            /** Whether the user is allowed to access API data sources. */
            fun apiDatasourceAccess(apiDatasourceAccess: Boolean?) =
                apiDatasourceAccess(JsonField.ofNullable(apiDatasourceAccess))

            /**
             * Alias for [Builder.apiDatasourceAccess].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun apiDatasourceAccess(apiDatasourceAccess: Boolean) =
                apiDatasourceAccess(apiDatasourceAccess as Boolean?)

            /**
             * Alias for calling [Builder.apiDatasourceAccess] with
             * `apiDatasourceAccess.orElse(null)`.
             */
            fun apiDatasourceAccess(apiDatasourceAccess: Optional<Boolean>) =
                apiDatasourceAccess(apiDatasourceAccess.getOrNull())

            /**
             * Sets [Builder.apiDatasourceAccess] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiDatasourceAccess] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun apiDatasourceAccess(apiDatasourceAccess: JsonField<Boolean>) = apply {
                this.apiDatasourceAccess = apiDatasourceAccess
            }

            /**
             * Cap on how many organizations this user may create. None means unlimited. Only
             * enforced when allowed_org_creation is True.
             */
            fun maximumOrgCreation(maximumOrgCreation: Long?) =
                maximumOrgCreation(JsonField.ofNullable(maximumOrgCreation))

            /**
             * Alias for [Builder.maximumOrgCreation].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maximumOrgCreation(maximumOrgCreation: Long) =
                maximumOrgCreation(maximumOrgCreation as Long?)

            /**
             * Alias for calling [Builder.maximumOrgCreation] with
             * `maximumOrgCreation.orElse(null)`.
             */
            fun maximumOrgCreation(maximumOrgCreation: Optional<Long>) =
                maximumOrgCreation(maximumOrgCreation.getOrNull())

            /**
             * Sets [Builder.maximumOrgCreation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumOrgCreation] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumOrgCreation(maximumOrgCreation: JsonField<Long>) = apply {
                this.maximumOrgCreation = maximumOrgCreation
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
             * Returns an immutable instance of [SetClaims].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SetClaims =
                SetClaims(
                    allowOrgDeletion,
                    allowedOrgCreation,
                    apiDatasourceAccess,
                    maximumOrgCreation,
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
        fun validate(): SetClaims = apply {
            if (validated) {
                return@apply
            }

            allowOrgDeletion()
            allowedOrgCreation()
            apiDatasourceAccess()
            maximumOrgCreation()
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
            (if (allowOrgDeletion.asKnown().isPresent) 1 else 0) +
                (if (allowedOrgCreation.asKnown().isPresent) 1 else 0) +
                (if (apiDatasourceAccess.asKnown().isPresent) 1 else 0) +
                (if (maximumOrgCreation.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SetClaims &&
                allowOrgDeletion == other.allowOrgDeletion &&
                allowedOrgCreation == other.allowedOrgCreation &&
                apiDatasourceAccess == other.apiDatasourceAccess &&
                maximumOrgCreation == other.maximumOrgCreation &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allowOrgDeletion,
                allowedOrgCreation,
                apiDatasourceAccess,
                maximumOrgCreation,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SetClaims{allowOrgDeletion=$allowOrgDeletion, allowedOrgCreation=$allowedOrgCreation, apiDatasourceAccess=$apiDatasourceAccess, maximumOrgCreation=$maximumOrgCreation, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserUpdateClaimsParams &&
            userId == other.userId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(userId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserUpdateClaimsParams{userId=$userId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
