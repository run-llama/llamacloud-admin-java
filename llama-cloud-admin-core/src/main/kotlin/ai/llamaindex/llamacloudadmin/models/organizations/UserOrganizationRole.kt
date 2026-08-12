// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations

import ai.llamaindex.llamacloudadmin.core.ExcludeMissing
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.JsonMissing
import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.checkKnown
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.core.toImmutable
import ai.llamaindex.llamacloudadmin.errors.LlamaCloudAdminInvalidDataException
import ai.llamaindex.llamacloudadmin.models.organizations.Role
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Schema for a user's role in an organization. */
class UserOrganizationRole @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
    private val id: JsonField<String>,
    private val organizationId: JsonField<String>,
    private val role: JsonField<Role>,
    private val userId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val projectIds: JsonField<List<String>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization_id") @ExcludeMissing organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("project_ids") @ExcludeMissing projectIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
    ) : this(
      id,
      organizationId,
      role,
      userId,
      createdAt,
      projectIds,
      updatedAt,
      mutableMapOf(),
    )

    /**
     * Unique identifier
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The organization's ID.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationId(): String = organizationId.getRequired("organization_id")

    /**
     * The role.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun role(): Role = role.getRequired("role")

    /**
     * The user's ID.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * Creation datetime
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * The project ID scope.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun projectIds(): Optional<List<String>> = projectIds.getOptional("project_ids")

    /**
     * Update datetime
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [role].
     *
     * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("role")
    @ExcludeMissing
    fun _role(): JsonField<Role> = role

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id")
    @ExcludeMissing
    fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [projectIds].
     *
     * Unlike [projectIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_ids")
    @ExcludeMissing
    fun _projectIds(): JsonField<List<String>> = projectIds

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
    fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserOrganizationRole].
         *
         * The following fields are required:
         *
         * ```java
         * .id()
         * .organizationId()
         * .role()
         * .userId()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [UserOrganizationRole]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var organizationId: JsonField<String>? = null
        private var role: JsonField<Role>? = null
        private var userId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var projectIds: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userOrganizationRole: UserOrganizationRole) =
            apply {
                id = userOrganizationRole.id
                organizationId = userOrganizationRole.organizationId
                role = userOrganizationRole.role
                userId = userOrganizationRole.userId
                createdAt = userOrganizationRole.createdAt
                projectIds = userOrganizationRole.projectIds.map { it.toMutableList() }
                updatedAt = userOrganizationRole.updatedAt
                additionalProperties = userOrganizationRole.additionalProperties.toMutableMap()
            }

        /** Unique identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun id(id: JsonField<String>) =
            apply {
                this.id = id
            }

        /** The organization's ID. */
        fun organizationId(organizationId: String) = organizationId(JsonField.of(organizationId))

        /**
         * Sets [Builder.organizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationId(organizationId: JsonField<String>) =
            apply {
                this.organizationId = organizationId
            }

        /** The role. */
        fun role(role: Role) = role(JsonField.of(role))

        /**
         * Sets [Builder.role] to an arbitrary JSON value.
         *
         * You should usually call [Builder.role] with a well-typed [Role] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun role(role: JsonField<Role>) =
            apply {
                this.role = role
            }

        /** The user's ID. */
        fun userId(userId: String) = userId(JsonField.of(userId))

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

        /** Creation datetime */
        fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply {
                this.createdAt = createdAt
            }

        /** The project ID scope. */
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

        /** Update datetime */
        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) =
            apply {
                this.updatedAt = updatedAt
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
         * Returns an immutable instance of [UserOrganizationRole].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .id()
         * .organizationId()
         * .role()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserOrganizationRole =
            UserOrganizationRole(
              checkRequired(
                "id", id
              ),
              checkRequired(
                "organizationId", organizationId
              ),
              checkRequired(
                "role", role
              ),
              checkRequired(
                "userId", userId
              ),
              createdAt,
              (projectIds?: JsonMissing.of()).map { it.toImmutable() },
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
     * @throws LlamaCloudAdminInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): UserOrganizationRole =
        apply {
            if (validated) {
              return@apply
            }

            id()
            organizationId()
            role().validate()
            userId()
            createdAt()
            projectIds()
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
    internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0) + (if (organizationId.asKnown().isPresent) 1 else 0) + (role.asKnown().getOrNull()?.validity() ?: 0) + (if (userId.asKnown().isPresent) 1 else 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (projectIds.asKnown().getOrNull()?.size ?: 0) + (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is UserOrganizationRole && id == other.id && organizationId == other.organizationId && role == other.role && userId == other.userId && createdAt == other.createdAt && projectIds == other.projectIds && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, organizationId, role, userId, createdAt, projectIds, updatedAt, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "UserOrganizationRole{id=$id, organizationId=$organizationId, role=$role, userId=$userId, createdAt=$createdAt, projectIds=$projectIds, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
