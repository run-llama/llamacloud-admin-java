// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations.users

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

/** Assign a role to a user in an organization. */
class UserAssignRoleParams
private constructor(
    private val pathOrganizationId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathOrganizationId(): Optional<String> = Optional.ofNullable(pathOrganizationId)

    /**
     * The organization's ID.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bodyOrganizationId(): String = body.bodyOrganizationId()

    /**
     * The role's ID.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun roleId(): String = body.roleId()

    /**
     * The user's ID.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = body.userId()

    /**
     * Returns the raw JSON value of [bodyOrganizationId].
     *
     * Unlike [bodyOrganizationId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _bodyOrganizationId(): JsonField<String> = body._bodyOrganizationId()

    /**
     * Returns the raw JSON value of [roleId].
     *
     * Unlike [roleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _roleId(): JsonField<String> = body._roleId()

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userId(): JsonField<String> = body._userId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserAssignRoleParams].
         *
         * The following fields are required:
         * ```java
         * .bodyOrganizationId()
         * .roleId()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserAssignRoleParams]. */
    class Builder internal constructor() {

        private var pathOrganizationId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(userAssignRoleParams: UserAssignRoleParams) = apply {
            pathOrganizationId = userAssignRoleParams.pathOrganizationId
            body = userAssignRoleParams.body.toBuilder()
            additionalHeaders = userAssignRoleParams.additionalHeaders.toBuilder()
            additionalQueryParams = userAssignRoleParams.additionalQueryParams.toBuilder()
        }

        fun pathOrganizationId(pathOrganizationId: String?) = apply {
            this.pathOrganizationId = pathOrganizationId
        }

        /**
         * Alias for calling [Builder.pathOrganizationId] with `pathOrganizationId.orElse(null)`.
         */
        fun pathOrganizationId(pathOrganizationId: Optional<String>) =
            pathOrganizationId(pathOrganizationId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bodyOrganizationId]
         * - [roleId]
         * - [userId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The organization's ID. */
        fun bodyOrganizationId(bodyOrganizationId: String) = apply {
            body.bodyOrganizationId(bodyOrganizationId)
        }

        /**
         * Sets [Builder.bodyOrganizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyOrganizationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bodyOrganizationId(bodyOrganizationId: JsonField<String>) = apply {
            body.bodyOrganizationId(bodyOrganizationId)
        }

        /** The role's ID. */
        fun roleId(roleId: String) = apply { body.roleId(roleId) }

        /**
         * Sets [Builder.roleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roleId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun roleId(roleId: JsonField<String>) = apply { body.roleId(roleId) }

        /** The user's ID. */
        fun userId(userId: String) = apply { body.userId(userId) }

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { body.userId(userId) }

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
         * Returns an immutable instance of [UserAssignRoleParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bodyOrganizationId()
         * .roleId()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserAssignRoleParams =
            UserAssignRoleParams(
                pathOrganizationId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathOrganizationId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Schema for creating a user's role in an organization. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bodyOrganizationId: JsonField<String>,
        private val roleId: JsonField<String>,
        private val userId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("organization_id")
            @ExcludeMissing
            bodyOrganizationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("role_id") @ExcludeMissing roleId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        ) : this(bodyOrganizationId, roleId, userId, mutableMapOf())

        /**
         * The organization's ID.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun bodyOrganizationId(): String = bodyOrganizationId.getRequired("organization_id")

        /**
         * The role's ID.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun roleId(): String = roleId.getRequired("role_id")

        /**
         * The user's ID.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun userId(): String = userId.getRequired("user_id")

        /**
         * Returns the raw JSON value of [bodyOrganizationId].
         *
         * Unlike [bodyOrganizationId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("organization_id")
        @ExcludeMissing
        fun _bodyOrganizationId(): JsonField<String> = bodyOrganizationId

        /**
         * Returns the raw JSON value of [roleId].
         *
         * Unlike [roleId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role_id") @ExcludeMissing fun _roleId(): JsonField<String> = roleId

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
             * .bodyOrganizationId()
             * .roleId()
             * .userId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var bodyOrganizationId: JsonField<String>? = null
            private var roleId: JsonField<String>? = null
            private var userId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                bodyOrganizationId = body.bodyOrganizationId
                roleId = body.roleId
                userId = body.userId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The organization's ID. */
            fun bodyOrganizationId(bodyOrganizationId: String) =
                bodyOrganizationId(JsonField.of(bodyOrganizationId))

            /**
             * Sets [Builder.bodyOrganizationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyOrganizationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyOrganizationId(bodyOrganizationId: JsonField<String>) = apply {
                this.bodyOrganizationId = bodyOrganizationId
            }

            /** The role's ID. */
            fun roleId(roleId: String) = roleId(JsonField.of(roleId))

            /**
             * Sets [Builder.roleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roleId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roleId(roleId: JsonField<String>) = apply { this.roleId = roleId }

            /** The user's ID. */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
             * .bodyOrganizationId()
             * .roleId()
             * .userId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("bodyOrganizationId", bodyOrganizationId),
                    checkRequired("roleId", roleId),
                    checkRequired("userId", userId),
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

            bodyOrganizationId()
            roleId()
            userId()
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
            (if (bodyOrganizationId.asKnown().isPresent) 1 else 0) +
                (if (roleId.asKnown().isPresent) 1 else 0) +
                (if (userId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bodyOrganizationId == other.bodyOrganizationId &&
                roleId == other.roleId &&
                userId == other.userId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(bodyOrganizationId, roleId, userId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bodyOrganizationId=$bodyOrganizationId, roleId=$roleId, userId=$userId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserAssignRoleParams &&
            pathOrganizationId == other.pathOrganizationId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pathOrganizationId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserAssignRoleParams{pathOrganizationId=$pathOrganizationId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
