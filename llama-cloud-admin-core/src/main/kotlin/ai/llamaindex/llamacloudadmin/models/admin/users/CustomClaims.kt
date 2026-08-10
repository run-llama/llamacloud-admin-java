// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin.users

import ai.llamaindex.llamacloudadmin.core.ExcludeMissing
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.JsonMissing
import ai.llamaindex.llamacloudadmin.core.JsonValue
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
 * Custom claims that dictate various limits or allowed behaviors. Currently these claims reside at
 * a per user level. Claims may expand to a per organization level or project in the future.
 */
class CustomClaims
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
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowOrgDeletion(): Optional<Boolean> = allowOrgDeletion.getOptional("allow_org_deletion")

    /**
     * Whether the user is allowed to create organizations.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowedOrgCreation(): Optional<Boolean> =
        allowedOrgCreation.getOptional("allowed_org_creation")

    /**
     * Whether the user is allowed to access API data sources.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun apiDatasourceAccess(): Optional<Boolean> =
        apiDatasourceAccess.getOptional("api_datasource_access")

    /**
     * Cap on how many organizations this user may create. None means unlimited. Only enforced when
     * allowed_org_creation is True.
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
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
     * Unlike [allowedOrgCreation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allowed_org_creation")
    @ExcludeMissing
    fun _allowedOrgCreation(): JsonField<Boolean> = allowedOrgCreation

    /**
     * Returns the raw JSON value of [apiDatasourceAccess].
     *
     * Unlike [apiDatasourceAccess], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("api_datasource_access")
    @ExcludeMissing
    fun _apiDatasourceAccess(): JsonField<Boolean> = apiDatasourceAccess

    /**
     * Returns the raw JSON value of [maximumOrgCreation].
     *
     * Unlike [maximumOrgCreation], this method doesn't throw if the JSON field has an unexpected
     * type.
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

        /** Returns a mutable builder for constructing an instance of [CustomClaims]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomClaims]. */
    class Builder internal constructor() {

        private var allowOrgDeletion: JsonField<Boolean> = JsonMissing.of()
        private var allowedOrgCreation: JsonField<Boolean> = JsonMissing.of()
        private var apiDatasourceAccess: JsonField<Boolean> = JsonMissing.of()
        private var maximumOrgCreation: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customClaims: CustomClaims) = apply {
            allowOrgDeletion = customClaims.allowOrgDeletion
            allowedOrgCreation = customClaims.allowedOrgCreation
            apiDatasourceAccess = customClaims.apiDatasourceAccess
            maximumOrgCreation = customClaims.maximumOrgCreation
            additionalProperties = customClaims.additionalProperties.toMutableMap()
        }

        /** Whether the user is allowed to delete organizations. */
        fun allowOrgDeletion(allowOrgDeletion: Boolean) =
            allowOrgDeletion(JsonField.of(allowOrgDeletion))

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
        fun allowedOrgCreation(allowedOrgCreation: Boolean) =
            allowedOrgCreation(JsonField.of(allowedOrgCreation))

        /**
         * Sets [Builder.allowedOrgCreation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedOrgCreation] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowedOrgCreation(allowedOrgCreation: JsonField<Boolean>) = apply {
            this.allowedOrgCreation = allowedOrgCreation
        }

        /** Whether the user is allowed to access API data sources. */
        fun apiDatasourceAccess(apiDatasourceAccess: Boolean) =
            apiDatasourceAccess(JsonField.of(apiDatasourceAccess))

        /**
         * Sets [Builder.apiDatasourceAccess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiDatasourceAccess] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun apiDatasourceAccess(apiDatasourceAccess: JsonField<Boolean>) = apply {
            this.apiDatasourceAccess = apiDatasourceAccess
        }

        /**
         * Cap on how many organizations this user may create. None means unlimited. Only enforced
         * when allowed_org_creation is True.
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
         * Alias for calling [Builder.maximumOrgCreation] with `maximumOrgCreation.orElse(null)`.
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
         * Returns an immutable instance of [CustomClaims].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomClaims =
            CustomClaims(
                allowOrgDeletion,
                allowedOrgCreation,
                apiDatasourceAccess,
                maximumOrgCreation,
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
    fun validate(): CustomClaims = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

        return other is CustomClaims &&
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
        "CustomClaims{allowOrgDeletion=$allowOrgDeletion, allowedOrgCreation=$allowedOrgCreation, apiDatasourceAccess=$apiDatasourceAccess, maximumOrgCreation=$maximumOrgCreation, additionalProperties=$additionalProperties}"
}
