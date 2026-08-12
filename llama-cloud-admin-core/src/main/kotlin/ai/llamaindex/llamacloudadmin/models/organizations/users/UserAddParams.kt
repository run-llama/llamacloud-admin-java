// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations.users

import ai.llamaindex.llamacloudadmin.core.ExcludeMissing
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.JsonMissing
import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.Params
import ai.llamaindex.llamacloudadmin.core.checkKnown
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.core.http.Headers
import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import ai.llamaindex.llamacloudadmin.core.toImmutable
import ai.llamaindex.llamacloudadmin.errors.LlamaCloudAdminInvalidDataException
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAddParams
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Add a user to an organization. */
class UserAddParams private constructor(
    private val organizationId: String?,
    private val body: List<Body>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun body(): List<Body> = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserAddParams].
         *
         * The following fields are required:
         *
         * ```java
         * .body()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [UserAddParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(userAddParams: UserAddParams) =
            apply {
                organizationId = userAddParams.organizationId
                body = userAddParams.body.toMutableList()
                additionalHeaders = userAddParams.additionalHeaders.toBuilder()
                additionalQueryParams = userAddParams.additionalQueryParams.toBuilder()
            }

        fun organizationId(organizationId: String?) =
            apply {
                this.organizationId = organizationId
            }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) = organizationId(organizationId.getOrNull())

        fun body(body: List<Body>) =
            apply {
                this.body = body.toMutableList()
            }

        /**
         * Adds a single [Body] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBody(body: Body) =
            apply {
                this.body = (this.body ?: mutableListOf()).apply { add(body) }
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        /**
         * Returns an immutable instance of [UserAddParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserAddParams =
            UserAddParams(
              organizationId,
              checkRequired(
                "body", body
              ).toImmutable(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> organizationId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request to add a user to an organization. */
    class Body @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
        private val projectIds: JsonField<List<String>>,
        private val email: JsonField<String>,
        private val roleId: JsonField<String>,
        private val userId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,

    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("project_ids") @ExcludeMissing projectIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("role_id") @ExcludeMissing roleId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of()
        ) : this(
          projectIds,
          email,
          roleId,
          userId,
          mutableMapOf(),
        )

        /**
         * The project IDs to add the user to.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun projectIds(): Optional<List<String>> = projectIds.getOptional("project_ids")

        /**
         * The user's email address.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * The role ID to assign to the user.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun roleId(): Optional<String> = roleId.getOptional("role_id")

        /**
         * The user's ID.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun userId(): Optional<String> = userId.getOptional("user_id")

        /**
         * Returns the raw JSON value of [projectIds].
         *
         * Unlike [projectIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_ids")
        @ExcludeMissing
        fun _projectIds(): JsonField<List<String>> = projectIds

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email")
        @ExcludeMissing
        fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [roleId].
         *
         * Unlike [roleId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role_id")
        @ExcludeMissing
        fun _roleId(): JsonField<String> = roleId

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id")
        @ExcludeMissing
        fun _userId(): JsonField<String> = userId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             *
             * ```java
             * .projectIds()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var projectIds: JsonField<MutableList<String>>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var roleId: JsonField<String> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) =
                apply {
                    projectIds = body.projectIds.map { it.toMutableList() }
                    email = body.email
                    roleId = body.roleId
                    userId = body.userId
                    additionalProperties = body.additionalProperties.toMutableMap()
                }

            /** The project IDs to add the user to. */
            fun projectIds(projectIds: List<String>?) = projectIds(JsonField.ofNullable(projectIds))

            /** Alias for calling [Builder.projectIds] with `projectIds.orElse(null)`. */
            fun projectIds(projectIds: Optional<List<String>>) = projectIds(projectIds.getOrNull())

            /**
             * Sets [Builder.projectIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectIds] with a well-typed `List<String>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectIds(projectIds: JsonField<List<String>>) =
                apply {
                    this.projectIds = projectIds.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [projectIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProjectId(projectId: String) =
                apply {
                    projectIds = (projectIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("projectIds", it).add(projectId)
                    }
                }

            /** The user's email address. */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** Alias for calling [Builder.email] with `email.orElse(null)`. */
            fun email(email: Optional<String>) = email(email.getOrNull())

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) =
                apply {
                    this.email = email
                }

            /** The role ID to assign to the user. */
            fun roleId(roleId: String?) = roleId(JsonField.ofNullable(roleId))

            /** Alias for calling [Builder.roleId] with `roleId.orElse(null)`. */
            fun roleId(roleId: Optional<String>) = roleId(roleId.getOrNull())

            /**
             * Sets [Builder.roleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roleId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roleId(roleId: JsonField<String>) =
                apply {
                    this.roleId = roleId
                }

            /** The user's ID. */
            fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

            /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
            fun userId(userId: Optional<String>) = userId(userId.getOrNull())

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) =
                apply {
                    this.userId = userId
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             *
             * ```java
             * .projectIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                  checkRequired(
                    "projectIds", projectIds
                  ).map { it.toImmutable() },
                  email,
                  roleId,
                  userId,
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
        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                projectIds()
                email()
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
         * Returns a score indicating how many valid values are contained in this object recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int = (projectIds.asKnown().getOrNull()?.size ?: 0) + (if (email.asKnown().isPresent) 1 else 0) + (if (roleId.asKnown().isPresent) 1 else 0) + (if (userId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Body && projectIds == other.projectIds && email == other.email && roleId == other.roleId && userId == other.userId && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(projectIds, email, roleId, userId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{projectIds=$projectIds, email=$email, roleId=$roleId, userId=$userId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is UserAddParams && organizationId == other.organizationId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(organizationId, body, additionalHeaders, additionalQueryParams)

    override fun toString() = "UserAddParams{organizationId=$organizationId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
