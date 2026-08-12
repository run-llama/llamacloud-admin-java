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

/** Schema for a role. */
class Role @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val permissions: JsonField<List<Permission>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("permissions") @ExcludeMissing permissions: JsonField<List<Permission>> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
    ) : this(
      id,
      name,
      permissions,
      createdAt,
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
     * A name for the role.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The actual permissions of the role.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun permissions(): List<Permission> = permissions.getRequired("permissions")

    /**
     * Creation datetime
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name")
    @ExcludeMissing
    fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [permissions].
     *
     * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("permissions")
    @ExcludeMissing
    fun _permissions(): JsonField<List<Permission>> = permissions

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
         * Returns a mutable builder for constructing an instance of [Role].
         *
         * The following fields are required:
         *
         * ```java
         * .id()
         * .name()
         * .permissions()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [Role]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var permissions: JsonField<MutableList<Permission>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(role: Role) =
            apply {
                id = role.id
                name = role.name
                permissions = role.permissions.map { it.toMutableList() }
                createdAt = role.createdAt
                updatedAt = role.updatedAt
                additionalProperties = role.additionalProperties.toMutableMap()
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

        /** A name for the role. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun name(name: JsonField<String>) =
            apply {
                this.name = name
            }

        /** The actual permissions of the role. */
        fun permissions(permissions: List<Permission>) = permissions(JsonField.of(permissions))

        /**
         * Sets [Builder.permissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permissions] with a well-typed `List<Permission>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun permissions(permissions: JsonField<List<Permission>>) =
            apply {
                this.permissions = permissions.map { it.toMutableList() }
            }

        /**
         * Adds a single [Permission] to [permissions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPermission(permission: Permission) =
            apply {
                permissions = (permissions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("permissions", it).add(permission)
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
         * Returns an immutable instance of [Role].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .id()
         * .name()
         * .permissions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Role =
            Role(
              checkRequired(
                "id", id
              ),
              checkRequired(
                "name", name
              ),
              checkRequired(
                "permissions", permissions
              ).map { it.toImmutable() },
              createdAt,
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
    fun validate(): Role =
        apply {
            if (validated) {
              return@apply
            }

            id()
            name()
            permissions().forEach { it.validate() }
            createdAt()
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
    internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0) + (permissions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Schema for a permission. */
    class Permission @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
        private val id: JsonField<String>,
        private val access: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val name: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,

    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("access") @ExcludeMissing access: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("description") @ExcludeMissing description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        ) : this(
          id,
          access,
          description,
          name,
          createdAt,
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
         * Whether the permission is granted or not.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun access(): Boolean = access.getRequired("access")

        /**
         * A description for the permission.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * A name for the permission.
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Creation datetime
         *
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

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
         * Returns the raw JSON value of [access].
         *
         * Unlike [access], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("access")
        @ExcludeMissing
        fun _access(): JsonField<Boolean> = access

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name")
        @ExcludeMissing
        fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
             * Returns a mutable builder for constructing an instance of [Permission].
             *
             * The following fields are required:
             *
             * ```java
             * .id()
             * .access()
             * .description()
             * .name()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Permission]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var access: JsonField<Boolean>? = null
            private var description: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(permission: Permission) =
                apply {
                    id = permission.id
                    access = permission.access
                    description = permission.description
                    name = permission.name
                    createdAt = permission.createdAt
                    updatedAt = permission.updatedAt
                    additionalProperties = permission.additionalProperties.toMutableMap()
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

            /** Whether the permission is granted or not. */
            fun access(access: Boolean) = access(JsonField.of(access))

            /**
             * Sets [Builder.access] to an arbitrary JSON value.
             *
             * You should usually call [Builder.access] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun access(access: JsonField<Boolean>) =
                apply {
                    this.access = access
                }

            /** A description for the permission. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) =
                apply {
                    this.description = description
                }

            /** A name for the permission. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun name(name: JsonField<String>) =
                apply {
                    this.name = name
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
             * Returns an immutable instance of [Permission].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             *
             * ```java
             * .id()
             * .access()
             * .description()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Permission =
                Permission(
                  checkRequired(
                    "id", id
                  ),
                  checkRequired(
                    "access", access
                  ),
                  checkRequired(
                    "description", description
                  ),
                  checkRequired(
                    "name", name
                  ),
                  createdAt,
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
        fun validate(): Permission =
            apply {
                if (validated) {
                  return@apply
                }

                id()
                access()
                description()
                name()
                createdAt()
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
        internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0) + (if (access.asKnown().isPresent) 1 else 0) + (if (description.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (updatedAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Permission && id == other.id && access == other.access && description == other.description && name == other.name && createdAt == other.createdAt && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, access, description, name, createdAt, updatedAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Permission{id=$id, access=$access, description=$description, name=$name, createdAt=$createdAt, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is Role && id == other.id && name == other.name && permissions == other.permissions && createdAt == other.createdAt && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, name, permissions, createdAt, updatedAt, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "Role{id=$id, name=$name, permissions=$permissions, createdAt=$createdAt, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
