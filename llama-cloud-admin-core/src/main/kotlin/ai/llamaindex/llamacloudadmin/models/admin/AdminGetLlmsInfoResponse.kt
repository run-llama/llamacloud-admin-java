// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin

import ai.llamaindex.llamacloudadmin.core.ExcludeMissing
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.JsonMissing
import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.core.toImmutable
import ai.llamaindex.llamacloudadmin.errors.LlamaCloudAdminInvalidDataException
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLlmsInfoResponse
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class AdminGetLlmsInfoResponse @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
    private val llmInfo: JsonField<LlmInfo>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("llm_info") @ExcludeMissing llmInfo: JsonField<LlmInfo> = JsonMissing.of()
    ) : this(
      llmInfo, mutableMapOf()
    )

    /** @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun llmInfo(): LlmInfo = llmInfo.getRequired("llm_info")

    /**
     * Returns the raw JSON value of [llmInfo].
     *
     * Unlike [llmInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("llm_info")
    @ExcludeMissing
    fun _llmInfo(): JsonField<LlmInfo> = llmInfo

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
         * Returns a mutable builder for constructing an instance of [AdminGetLlmsInfoResponse].
         *
         * The following fields are required:
         *
         * ```java
         * .llmInfo()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [AdminGetLlmsInfoResponse]. */
    class Builder internal constructor() {

        private var llmInfo: JsonField<LlmInfo>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(adminGetLlmsInfoResponse: AdminGetLlmsInfoResponse) =
            apply {
                llmInfo = adminGetLlmsInfoResponse.llmInfo
                additionalProperties = adminGetLlmsInfoResponse.additionalProperties.toMutableMap()
            }

        fun llmInfo(llmInfo: LlmInfo) = llmInfo(JsonField.of(llmInfo))

        /**
         * Sets [Builder.llmInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmInfo] with a well-typed [LlmInfo] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun llmInfo(llmInfo: JsonField<LlmInfo>) =
            apply {
                this.llmInfo = llmInfo
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
         * Returns an immutable instance of [AdminGetLlmsInfoResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .llmInfo()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AdminGetLlmsInfoResponse =
            AdminGetLlmsInfoResponse(
              checkRequired(
                "llmInfo", llmInfo
              ), additionalProperties.toMutableMap()
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
    fun validate(): AdminGetLlmsInfoResponse =
        apply {
            if (validated) {
              return@apply
            }

            llmInfo().validate()
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
    internal fun validity(): Int = (llmInfo.asKnown().getOrNull()?.validity() ?: 0)

    class LlmInfo @JsonCreator private constructor(
        @com.fasterxml.jackson.annotation.JsonValue private val additionalProperties: Map<String, JsonValue>,

    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [LlmInfo]. */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [LlmInfo]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(llmInfo: LlmInfo) =
                apply {
                    additionalProperties = llmInfo.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [LlmInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LlmInfo = LlmInfo(additionalProperties.toImmutable())
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
        fun validate(): LlmInfo =
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

          return other is LlmInfo && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "LlmInfo{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is AdminGetLlmsInfoResponse && llmInfo == other.llmInfo && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(llmInfo, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "AdminGetLlmsInfoResponse{llmInfo=$llmInfo, additionalProperties=$additionalProperties}"
}
