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
import ai.llamaindex.llamacloudadmin.models.organizations.UserOrganizationRole
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A user's membership in an organization, including roles. */
class OrganizationMember @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
    private val id: JsonField<String>,
    private val organizationId: JsonField<String>,
    private val roles: JsonField<List<UserOrganizationRole>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val email: JsonField<String>,
    private val invitedByUserEmail: JsonField<String>,
    private val invitedByUserId: JsonField<String>,
    private val pending: JsonField<Boolean>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization_id") @ExcludeMissing organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("roles") @ExcludeMissing roles: JsonField<List<UserOrganizationRole>> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invited_by_user_email") @ExcludeMissing invitedByUserEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invited_by_user_id") @ExcludeMissing invitedByUserId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pending") @ExcludeMissing pending: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of()
    ) : this(
      id,
      organizationId,
      roles,
      createdAt,
      email,
      invitedByUserEmail,
      invitedByUserId,
      pending,
      updatedAt,
      userId,
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
     * The roles of the user in the organization.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun roles(): List<UserOrganizationRole> = roles.getRequired("roles")

    /**
     * Creation datetime
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * The user's email address.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * The email address of the user who added the user to the organization.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun invitedByUserEmail(): Optional<String> = invitedByUserEmail.getOptional("invited_by_user_email")

    /**
     * The user ID of the user who added the user to the organization.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun invitedByUserId(): Optional<String> = invitedByUserId.getOptional("invited_by_user_id")

    /**
     * Whether the user's membership is pending account signup.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun pending(): Optional<Boolean> = pending.getOptional("pending")

    /**
     * Update datetime
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * The user's ID.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

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
     * Returns the raw JSON value of [roles].
     *
     * Unlike [roles], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("roles")
    @ExcludeMissing
    fun _roles(): JsonField<List<UserOrganizationRole>> = roles

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email")
    @ExcludeMissing
    fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [invitedByUserEmail].
     *
     * Unlike [invitedByUserEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("invited_by_user_email")
    @ExcludeMissing
    fun _invitedByUserEmail(): JsonField<String> = invitedByUserEmail

    /**
     * Returns the raw JSON value of [invitedByUserId].
     *
     * Unlike [invitedByUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invited_by_user_id")
    @ExcludeMissing
    fun _invitedByUserId(): JsonField<String> = invitedByUserId

    /**
     * Returns the raw JSON value of [pending].
     *
     * Unlike [pending], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pending")
    @ExcludeMissing
    fun _pending(): JsonField<Boolean> = pending

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [OrganizationMember].
         *
         * The following fields are required:
         *
         * ```java
         * .id()
         * .organizationId()
         * .roles()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [OrganizationMember]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var organizationId: JsonField<String>? = null
        private var roles: JsonField<MutableList<UserOrganizationRole>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var invitedByUserEmail: JsonField<String> = JsonMissing.of()
        private var invitedByUserId: JsonField<String> = JsonMissing.of()
        private var pending: JsonField<Boolean> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organizationMember: OrganizationMember) =
            apply {
                id = organizationMember.id
                organizationId = organizationMember.organizationId
                roles = organizationMember.roles.map { it.toMutableList() }
                createdAt = organizationMember.createdAt
                email = organizationMember.email
                invitedByUserEmail = organizationMember.invitedByUserEmail
                invitedByUserId = organizationMember.invitedByUserId
                pending = organizationMember.pending
                updatedAt = organizationMember.updatedAt
                userId = organizationMember.userId
                additionalProperties = organizationMember.additionalProperties.toMutableMap()
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

        /** The roles of the user in the organization. */
        fun roles(roles: List<UserOrganizationRole>) = roles(JsonField.of(roles))

        /**
         * Sets [Builder.roles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roles] with a well-typed `List<UserOrganizationRole>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun roles(roles: JsonField<List<UserOrganizationRole>>) =
            apply {
                this.roles = roles.map { it.toMutableList() }
            }

        /**
         * Adds a single [UserOrganizationRole] to [roles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRole(role: UserOrganizationRole) =
            apply {
                roles = (roles ?: JsonField.of(mutableListOf())).also {
                    checkKnown("roles", it).add(role)
                }
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

        /** The email address of the user who added the user to the organization. */
        @Deprecated("deprecated")
        fun invitedByUserEmail(invitedByUserEmail: String?) = invitedByUserEmail(JsonField.ofNullable(invitedByUserEmail))

        /** Alias for calling [Builder.invitedByUserEmail] with `invitedByUserEmail.orElse(null)`. */
        @Deprecated("deprecated")
        fun invitedByUserEmail(invitedByUserEmail: Optional<String>) = invitedByUserEmail(invitedByUserEmail.getOrNull())

        /**
         * Sets [Builder.invitedByUserEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invitedByUserEmail] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun invitedByUserEmail(invitedByUserEmail: JsonField<String>) =
            apply {
                this.invitedByUserEmail = invitedByUserEmail
            }

        /** The user ID of the user who added the user to the organization. */
        fun invitedByUserId(invitedByUserId: String?) = invitedByUserId(JsonField.ofNullable(invitedByUserId))

        /** Alias for calling [Builder.invitedByUserId] with `invitedByUserId.orElse(null)`. */
        fun invitedByUserId(invitedByUserId: Optional<String>) = invitedByUserId(invitedByUserId.getOrNull())

        /**
         * Sets [Builder.invitedByUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invitedByUserId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invitedByUserId(invitedByUserId: JsonField<String>) =
            apply {
                this.invitedByUserId = invitedByUserId
            }

        /** Whether the user's membership is pending account signup. */
        fun pending(pending: Boolean) = pending(JsonField.of(pending))

        /**
         * Sets [Builder.pending] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pending] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pending(pending: JsonField<Boolean>) =
            apply {
                this.pending = pending
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
         * Returns an immutable instance of [OrganizationMember].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .id()
         * .organizationId()
         * .roles()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrganizationMember =
            OrganizationMember(
              checkRequired(
                "id", id
              ),
              checkRequired(
                "organizationId", organizationId
              ),
              checkRequired(
                "roles", roles
              ).map { it.toImmutable() },
              createdAt,
              email,
              invitedByUserEmail,
              invitedByUserId,
              pending,
              updatedAt,
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
    fun validate(): OrganizationMember =
        apply {
            if (validated) {
              return@apply
            }

            id()
            organizationId()
            roles().forEach { it.validate() }
            createdAt()
            email()
            invitedByUserEmail()
            invitedByUserId()
            pending()
            updatedAt()
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
    internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0) + (if (organizationId.asKnown().isPresent) 1 else 0) + (roles.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (email.asKnown().isPresent) 1 else 0) + (if (invitedByUserEmail.asKnown().isPresent) 1 else 0) + (if (invitedByUserId.asKnown().isPresent) 1 else 0) + (if (pending.asKnown().isPresent) 1 else 0) + (if (updatedAt.asKnown().isPresent) 1 else 0) + (if (userId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is OrganizationMember && id == other.id && organizationId == other.organizationId && roles == other.roles && createdAt == other.createdAt && email == other.email && invitedByUserEmail == other.invitedByUserEmail && invitedByUserId == other.invitedByUserId && pending == other.pending && updatedAt == other.updatedAt && userId == other.userId && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, organizationId, roles, createdAt, email, invitedByUserEmail, invitedByUserId, pending, updatedAt, userId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "OrganizationMember{id=$id, organizationId=$organizationId, roles=$roles, createdAt=$createdAt, email=$email, invitedByUserEmail=$invitedByUserEmail, invitedByUserId=$invitedByUserId, pending=$pending, updatedAt=$updatedAt, userId=$userId, additionalProperties=$additionalProperties}"
}
