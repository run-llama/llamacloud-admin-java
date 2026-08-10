// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin

import ai.llamaindex.llamacloudadmin.core.Enum
import ai.llamaindex.llamacloudadmin.core.ExcludeMissing
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.JsonMissing
import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.errors.LlamaCloudAdminInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AdminGetS3ConfigResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val buckets: JsonField<Buckets>,
    private val byocModeEnabled: JsonField<Boolean>,
    private val endpointUrl: JsonField<String>,
    private val kmsKeyConfigured: JsonField<Boolean>,
    private val presignedUrlSignatureVersion: JsonField<PresignedUrlSignatureVersion>,
    private val s3ProxyActive: JsonField<Boolean>,
    private val s3ProxyEnabledOverride: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("buckets") @ExcludeMissing buckets: JsonField<Buckets> = JsonMissing.of(),
        @JsonProperty("byoc_mode_enabled")
        @ExcludeMissing
        byocModeEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("endpoint_url")
        @ExcludeMissing
        endpointUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("kms_key_configured")
        @ExcludeMissing
        kmsKeyConfigured: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("presigned_url_signature_version")
        @ExcludeMissing
        presignedUrlSignatureVersion: JsonField<PresignedUrlSignatureVersion> = JsonMissing.of(),
        @JsonProperty("s3_proxy_active")
        @ExcludeMissing
        s3ProxyActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("s3_proxy_enabled_override")
        @ExcludeMissing
        s3ProxyEnabledOverride: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        buckets,
        byocModeEnabled,
        endpointUrl,
        kmsKeyConfigured,
        presignedUrlSignatureVersion,
        s3ProxyActive,
        s3ProxyEnabledOverride,
        mutableMapOf(),
    )

    /**
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun buckets(): Buckets = buckets.getRequired("buckets")

    /**
     * Whether BYOC mode is enabled
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun byocModeEnabled(): Boolean = byocModeEnabled.getRequired("byoc_mode_enabled")

    /**
     * Custom S3 endpoint URL (None = standard AWS)
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun endpointUrl(): Optional<String> = endpointUrl.getOptional("endpoint_url")

    /**
     * Whether a KMS key ID is configured for server-side encryption
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun kmsKeyConfigured(): Boolean = kmsKeyConfigured.getRequired("kms_key_configured")

    /**
     * Signature version used when generating presigned URLs. 'unsigned' = s3proxy path (proxy
     * handles auth), 's3v4' = explicit SigV4, 'default' = no override set (botocore default, may
     * produce SigV2 without a region)
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun presignedUrlSignatureVersion(): PresignedUrlSignatureVersion =
        presignedUrlSignatureVersion.getRequired("presigned_url_signature_version")

    /**
     * Resolved value: whether requests are routed through s3proxy
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun s3ProxyActive(): Boolean = s3ProxyActive.getRequired("s3_proxy_active")

    /**
     * Explicit S3_PROXY_ENABLED override; None means auto-detect
     *
     * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun s3ProxyEnabledOverride(): Optional<Boolean> =
        s3ProxyEnabledOverride.getOptional("s3_proxy_enabled_override")

    /**
     * Returns the raw JSON value of [buckets].
     *
     * Unlike [buckets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("buckets") @ExcludeMissing fun _buckets(): JsonField<Buckets> = buckets

    /**
     * Returns the raw JSON value of [byocModeEnabled].
     *
     * Unlike [byocModeEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("byoc_mode_enabled")
    @ExcludeMissing
    fun _byocModeEnabled(): JsonField<Boolean> = byocModeEnabled

    /**
     * Returns the raw JSON value of [endpointUrl].
     *
     * Unlike [endpointUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endpoint_url")
    @ExcludeMissing
    fun _endpointUrl(): JsonField<String> = endpointUrl

    /**
     * Returns the raw JSON value of [kmsKeyConfigured].
     *
     * Unlike [kmsKeyConfigured], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("kms_key_configured")
    @ExcludeMissing
    fun _kmsKeyConfigured(): JsonField<Boolean> = kmsKeyConfigured

    /**
     * Returns the raw JSON value of [presignedUrlSignatureVersion].
     *
     * Unlike [presignedUrlSignatureVersion], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("presigned_url_signature_version")
    @ExcludeMissing
    fun _presignedUrlSignatureVersion(): JsonField<PresignedUrlSignatureVersion> =
        presignedUrlSignatureVersion

    /**
     * Returns the raw JSON value of [s3ProxyActive].
     *
     * Unlike [s3ProxyActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("s3_proxy_active")
    @ExcludeMissing
    fun _s3ProxyActive(): JsonField<Boolean> = s3ProxyActive

    /**
     * Returns the raw JSON value of [s3ProxyEnabledOverride].
     *
     * Unlike [s3ProxyEnabledOverride], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("s3_proxy_enabled_override")
    @ExcludeMissing
    fun _s3ProxyEnabledOverride(): JsonField<Boolean> = s3ProxyEnabledOverride

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
         * Returns a mutable builder for constructing an instance of [AdminGetS3ConfigResponse].
         *
         * The following fields are required:
         * ```java
         * .buckets()
         * .byocModeEnabled()
         * .endpointUrl()
         * .kmsKeyConfigured()
         * .presignedUrlSignatureVersion()
         * .s3ProxyActive()
         * .s3ProxyEnabledOverride()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AdminGetS3ConfigResponse]. */
    class Builder internal constructor() {

        private var buckets: JsonField<Buckets>? = null
        private var byocModeEnabled: JsonField<Boolean>? = null
        private var endpointUrl: JsonField<String>? = null
        private var kmsKeyConfigured: JsonField<Boolean>? = null
        private var presignedUrlSignatureVersion: JsonField<PresignedUrlSignatureVersion>? = null
        private var s3ProxyActive: JsonField<Boolean>? = null
        private var s3ProxyEnabledOverride: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(adminGetS3ConfigResponse: AdminGetS3ConfigResponse) = apply {
            buckets = adminGetS3ConfigResponse.buckets
            byocModeEnabled = adminGetS3ConfigResponse.byocModeEnabled
            endpointUrl = adminGetS3ConfigResponse.endpointUrl
            kmsKeyConfigured = adminGetS3ConfigResponse.kmsKeyConfigured
            presignedUrlSignatureVersion = adminGetS3ConfigResponse.presignedUrlSignatureVersion
            s3ProxyActive = adminGetS3ConfigResponse.s3ProxyActive
            s3ProxyEnabledOverride = adminGetS3ConfigResponse.s3ProxyEnabledOverride
            additionalProperties = adminGetS3ConfigResponse.additionalProperties.toMutableMap()
        }

        fun buckets(buckets: Buckets) = buckets(JsonField.of(buckets))

        /**
         * Sets [Builder.buckets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buckets] with a well-typed [Buckets] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun buckets(buckets: JsonField<Buckets>) = apply { this.buckets = buckets }

        /** Whether BYOC mode is enabled */
        fun byocModeEnabled(byocModeEnabled: Boolean) =
            byocModeEnabled(JsonField.of(byocModeEnabled))

        /**
         * Sets [Builder.byocModeEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.byocModeEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun byocModeEnabled(byocModeEnabled: JsonField<Boolean>) = apply {
            this.byocModeEnabled = byocModeEnabled
        }

        /** Custom S3 endpoint URL (None = standard AWS) */
        fun endpointUrl(endpointUrl: String?) = endpointUrl(JsonField.ofNullable(endpointUrl))

        /** Alias for calling [Builder.endpointUrl] with `endpointUrl.orElse(null)`. */
        fun endpointUrl(endpointUrl: Optional<String>) = endpointUrl(endpointUrl.getOrNull())

        /**
         * Sets [Builder.endpointUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endpointUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endpointUrl(endpointUrl: JsonField<String>) = apply { this.endpointUrl = endpointUrl }

        /** Whether a KMS key ID is configured for server-side encryption */
        fun kmsKeyConfigured(kmsKeyConfigured: Boolean) =
            kmsKeyConfigured(JsonField.of(kmsKeyConfigured))

        /**
         * Sets [Builder.kmsKeyConfigured] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kmsKeyConfigured] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun kmsKeyConfigured(kmsKeyConfigured: JsonField<Boolean>) = apply {
            this.kmsKeyConfigured = kmsKeyConfigured
        }

        /**
         * Signature version used when generating presigned URLs. 'unsigned' = s3proxy path (proxy
         * handles auth), 's3v4' = explicit SigV4, 'default' = no override set (botocore default,
         * may produce SigV2 without a region)
         */
        fun presignedUrlSignatureVersion(
            presignedUrlSignatureVersion: PresignedUrlSignatureVersion
        ) = presignedUrlSignatureVersion(JsonField.of(presignedUrlSignatureVersion))

        /**
         * Sets [Builder.presignedUrlSignatureVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presignedUrlSignatureVersion] with a well-typed
         * [PresignedUrlSignatureVersion] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun presignedUrlSignatureVersion(
            presignedUrlSignatureVersion: JsonField<PresignedUrlSignatureVersion>
        ) = apply { this.presignedUrlSignatureVersion = presignedUrlSignatureVersion }

        /** Resolved value: whether requests are routed through s3proxy */
        fun s3ProxyActive(s3ProxyActive: Boolean) = s3ProxyActive(JsonField.of(s3ProxyActive))

        /**
         * Sets [Builder.s3ProxyActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s3ProxyActive] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun s3ProxyActive(s3ProxyActive: JsonField<Boolean>) = apply {
            this.s3ProxyActive = s3ProxyActive
        }

        /** Explicit S3_PROXY_ENABLED override; None means auto-detect */
        fun s3ProxyEnabledOverride(s3ProxyEnabledOverride: Boolean?) =
            s3ProxyEnabledOverride(JsonField.ofNullable(s3ProxyEnabledOverride))

        /**
         * Alias for [Builder.s3ProxyEnabledOverride].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun s3ProxyEnabledOverride(s3ProxyEnabledOverride: Boolean) =
            s3ProxyEnabledOverride(s3ProxyEnabledOverride as Boolean?)

        /**
         * Alias for calling [Builder.s3ProxyEnabledOverride] with
         * `s3ProxyEnabledOverride.orElse(null)`.
         */
        fun s3ProxyEnabledOverride(s3ProxyEnabledOverride: Optional<Boolean>) =
            s3ProxyEnabledOverride(s3ProxyEnabledOverride.getOrNull())

        /**
         * Sets [Builder.s3ProxyEnabledOverride] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s3ProxyEnabledOverride] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun s3ProxyEnabledOverride(s3ProxyEnabledOverride: JsonField<Boolean>) = apply {
            this.s3ProxyEnabledOverride = s3ProxyEnabledOverride
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
         * Returns an immutable instance of [AdminGetS3ConfigResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .buckets()
         * .byocModeEnabled()
         * .endpointUrl()
         * .kmsKeyConfigured()
         * .presignedUrlSignatureVersion()
         * .s3ProxyActive()
         * .s3ProxyEnabledOverride()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AdminGetS3ConfigResponse =
            AdminGetS3ConfigResponse(
                checkRequired("buckets", buckets),
                checkRequired("byocModeEnabled", byocModeEnabled),
                checkRequired("endpointUrl", endpointUrl),
                checkRequired("kmsKeyConfigured", kmsKeyConfigured),
                checkRequired("presignedUrlSignatureVersion", presignedUrlSignatureVersion),
                checkRequired("s3ProxyActive", s3ProxyActive),
                checkRequired("s3ProxyEnabledOverride", s3ProxyEnabledOverride),
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
    fun validate(): AdminGetS3ConfigResponse = apply {
        if (validated) {
            return@apply
        }

        buckets().validate()
        byocModeEnabled()
        endpointUrl()
        kmsKeyConfigured()
        presignedUrlSignatureVersion().validate()
        s3ProxyActive()
        s3ProxyEnabledOverride()
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
        (buckets.asKnown().getOrNull()?.validity() ?: 0) +
            (if (byocModeEnabled.asKnown().isPresent) 1 else 0) +
            (if (endpointUrl.asKnown().isPresent) 1 else 0) +
            (if (kmsKeyConfigured.asKnown().isPresent) 1 else 0) +
            (presignedUrlSignatureVersion.asKnown().getOrNull()?.validity() ?: 0) +
            (if (s3ProxyActive.asKnown().isPresent) 1 else 0) +
            (if (s3ProxyEnabledOverride.asKnown().isPresent) 1 else 0)

    class Buckets
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val documentBucket: JsonField<String>,
        private val etlBucket: JsonField<String>,
        private val externalComponentsBucket: JsonField<String>,
        private val fileParsingBucket: JsonField<String>,
        private val fileScreenshotBucket: JsonField<String>,
        private val llamaCloudParseOutputBucket: JsonField<String>,
        private val llamaExtractOutputBucket: JsonField<String>,
        private val rawFileBucket: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("document_bucket")
            @ExcludeMissing
            documentBucket: JsonField<String> = JsonMissing.of(),
            @JsonProperty("etl_bucket")
            @ExcludeMissing
            etlBucket: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_components_bucket")
            @ExcludeMissing
            externalComponentsBucket: JsonField<String> = JsonMissing.of(),
            @JsonProperty("file_parsing_bucket")
            @ExcludeMissing
            fileParsingBucket: JsonField<String> = JsonMissing.of(),
            @JsonProperty("file_screenshot_bucket")
            @ExcludeMissing
            fileScreenshotBucket: JsonField<String> = JsonMissing.of(),
            @JsonProperty("llama_cloud_parse_output_bucket")
            @ExcludeMissing
            llamaCloudParseOutputBucket: JsonField<String> = JsonMissing.of(),
            @JsonProperty("llama_extract_output_bucket")
            @ExcludeMissing
            llamaExtractOutputBucket: JsonField<String> = JsonMissing.of(),
            @JsonProperty("raw_file_bucket")
            @ExcludeMissing
            rawFileBucket: JsonField<String> = JsonMissing.of(),
        ) : this(
            documentBucket,
            etlBucket,
            externalComponentsBucket,
            fileParsingBucket,
            fileScreenshotBucket,
            llamaCloudParseOutputBucket,
            llamaExtractOutputBucket,
            rawFileBucket,
            mutableMapOf(),
        )

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun documentBucket(): String = documentBucket.getRequired("document_bucket")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun etlBucket(): String = etlBucket.getRequired("etl_bucket")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun externalComponentsBucket(): String =
            externalComponentsBucket.getRequired("external_components_bucket")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun fileParsingBucket(): String = fileParsingBucket.getRequired("file_parsing_bucket")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun fileScreenshotBucket(): String =
            fileScreenshotBucket.getRequired("file_screenshot_bucket")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun llamaCloudParseOutputBucket(): String =
            llamaCloudParseOutputBucket.getRequired("llama_cloud_parse_output_bucket")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun llamaExtractOutputBucket(): String =
            llamaExtractOutputBucket.getRequired("llama_extract_output_bucket")

        /**
         * @throws LlamaCloudAdminInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun rawFileBucket(): String = rawFileBucket.getRequired("raw_file_bucket")

        /**
         * Returns the raw JSON value of [documentBucket].
         *
         * Unlike [documentBucket], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("document_bucket")
        @ExcludeMissing
        fun _documentBucket(): JsonField<String> = documentBucket

        /**
         * Returns the raw JSON value of [etlBucket].
         *
         * Unlike [etlBucket], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("etl_bucket") @ExcludeMissing fun _etlBucket(): JsonField<String> = etlBucket

        /**
         * Returns the raw JSON value of [externalComponentsBucket].
         *
         * Unlike [externalComponentsBucket], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_components_bucket")
        @ExcludeMissing
        fun _externalComponentsBucket(): JsonField<String> = externalComponentsBucket

        /**
         * Returns the raw JSON value of [fileParsingBucket].
         *
         * Unlike [fileParsingBucket], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("file_parsing_bucket")
        @ExcludeMissing
        fun _fileParsingBucket(): JsonField<String> = fileParsingBucket

        /**
         * Returns the raw JSON value of [fileScreenshotBucket].
         *
         * Unlike [fileScreenshotBucket], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("file_screenshot_bucket")
        @ExcludeMissing
        fun _fileScreenshotBucket(): JsonField<String> = fileScreenshotBucket

        /**
         * Returns the raw JSON value of [llamaCloudParseOutputBucket].
         *
         * Unlike [llamaCloudParseOutputBucket], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("llama_cloud_parse_output_bucket")
        @ExcludeMissing
        fun _llamaCloudParseOutputBucket(): JsonField<String> = llamaCloudParseOutputBucket

        /**
         * Returns the raw JSON value of [llamaExtractOutputBucket].
         *
         * Unlike [llamaExtractOutputBucket], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("llama_extract_output_bucket")
        @ExcludeMissing
        fun _llamaExtractOutputBucket(): JsonField<String> = llamaExtractOutputBucket

        /**
         * Returns the raw JSON value of [rawFileBucket].
         *
         * Unlike [rawFileBucket], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("raw_file_bucket")
        @ExcludeMissing
        fun _rawFileBucket(): JsonField<String> = rawFileBucket

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
             * Returns a mutable builder for constructing an instance of [Buckets].
             *
             * The following fields are required:
             * ```java
             * .documentBucket()
             * .etlBucket()
             * .externalComponentsBucket()
             * .fileParsingBucket()
             * .fileScreenshotBucket()
             * .llamaCloudParseOutputBucket()
             * .llamaExtractOutputBucket()
             * .rawFileBucket()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Buckets]. */
        class Builder internal constructor() {

            private var documentBucket: JsonField<String>? = null
            private var etlBucket: JsonField<String>? = null
            private var externalComponentsBucket: JsonField<String>? = null
            private var fileParsingBucket: JsonField<String>? = null
            private var fileScreenshotBucket: JsonField<String>? = null
            private var llamaCloudParseOutputBucket: JsonField<String>? = null
            private var llamaExtractOutputBucket: JsonField<String>? = null
            private var rawFileBucket: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(buckets: Buckets) = apply {
                documentBucket = buckets.documentBucket
                etlBucket = buckets.etlBucket
                externalComponentsBucket = buckets.externalComponentsBucket
                fileParsingBucket = buckets.fileParsingBucket
                fileScreenshotBucket = buckets.fileScreenshotBucket
                llamaCloudParseOutputBucket = buckets.llamaCloudParseOutputBucket
                llamaExtractOutputBucket = buckets.llamaExtractOutputBucket
                rawFileBucket = buckets.rawFileBucket
                additionalProperties = buckets.additionalProperties.toMutableMap()
            }

            fun documentBucket(documentBucket: String) =
                documentBucket(JsonField.of(documentBucket))

            /**
             * Sets [Builder.documentBucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentBucket] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentBucket(documentBucket: JsonField<String>) = apply {
                this.documentBucket = documentBucket
            }

            fun etlBucket(etlBucket: String) = etlBucket(JsonField.of(etlBucket))

            /**
             * Sets [Builder.etlBucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.etlBucket] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun etlBucket(etlBucket: JsonField<String>) = apply { this.etlBucket = etlBucket }

            fun externalComponentsBucket(externalComponentsBucket: String) =
                externalComponentsBucket(JsonField.of(externalComponentsBucket))

            /**
             * Sets [Builder.externalComponentsBucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalComponentsBucket] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun externalComponentsBucket(externalComponentsBucket: JsonField<String>) = apply {
                this.externalComponentsBucket = externalComponentsBucket
            }

            fun fileParsingBucket(fileParsingBucket: String) =
                fileParsingBucket(JsonField.of(fileParsingBucket))

            /**
             * Sets [Builder.fileParsingBucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileParsingBucket] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileParsingBucket(fileParsingBucket: JsonField<String>) = apply {
                this.fileParsingBucket = fileParsingBucket
            }

            fun fileScreenshotBucket(fileScreenshotBucket: String) =
                fileScreenshotBucket(JsonField.of(fileScreenshotBucket))

            /**
             * Sets [Builder.fileScreenshotBucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileScreenshotBucket] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fileScreenshotBucket(fileScreenshotBucket: JsonField<String>) = apply {
                this.fileScreenshotBucket = fileScreenshotBucket
            }

            fun llamaCloudParseOutputBucket(llamaCloudParseOutputBucket: String) =
                llamaCloudParseOutputBucket(JsonField.of(llamaCloudParseOutputBucket))

            /**
             * Sets [Builder.llamaCloudParseOutputBucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llamaCloudParseOutputBucket] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun llamaCloudParseOutputBucket(llamaCloudParseOutputBucket: JsonField<String>) =
                apply {
                    this.llamaCloudParseOutputBucket = llamaCloudParseOutputBucket
                }

            fun llamaExtractOutputBucket(llamaExtractOutputBucket: String) =
                llamaExtractOutputBucket(JsonField.of(llamaExtractOutputBucket))

            /**
             * Sets [Builder.llamaExtractOutputBucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llamaExtractOutputBucket] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun llamaExtractOutputBucket(llamaExtractOutputBucket: JsonField<String>) = apply {
                this.llamaExtractOutputBucket = llamaExtractOutputBucket
            }

            fun rawFileBucket(rawFileBucket: String) = rawFileBucket(JsonField.of(rawFileBucket))

            /**
             * Sets [Builder.rawFileBucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rawFileBucket] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rawFileBucket(rawFileBucket: JsonField<String>) = apply {
                this.rawFileBucket = rawFileBucket
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
             * Returns an immutable instance of [Buckets].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .documentBucket()
             * .etlBucket()
             * .externalComponentsBucket()
             * .fileParsingBucket()
             * .fileScreenshotBucket()
             * .llamaCloudParseOutputBucket()
             * .llamaExtractOutputBucket()
             * .rawFileBucket()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Buckets =
                Buckets(
                    checkRequired("documentBucket", documentBucket),
                    checkRequired("etlBucket", etlBucket),
                    checkRequired("externalComponentsBucket", externalComponentsBucket),
                    checkRequired("fileParsingBucket", fileParsingBucket),
                    checkRequired("fileScreenshotBucket", fileScreenshotBucket),
                    checkRequired("llamaCloudParseOutputBucket", llamaCloudParseOutputBucket),
                    checkRequired("llamaExtractOutputBucket", llamaExtractOutputBucket),
                    checkRequired("rawFileBucket", rawFileBucket),
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
        fun validate(): Buckets = apply {
            if (validated) {
                return@apply
            }

            documentBucket()
            etlBucket()
            externalComponentsBucket()
            fileParsingBucket()
            fileScreenshotBucket()
            llamaCloudParseOutputBucket()
            llamaExtractOutputBucket()
            rawFileBucket()
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
            (if (documentBucket.asKnown().isPresent) 1 else 0) +
                (if (etlBucket.asKnown().isPresent) 1 else 0) +
                (if (externalComponentsBucket.asKnown().isPresent) 1 else 0) +
                (if (fileParsingBucket.asKnown().isPresent) 1 else 0) +
                (if (fileScreenshotBucket.asKnown().isPresent) 1 else 0) +
                (if (llamaCloudParseOutputBucket.asKnown().isPresent) 1 else 0) +
                (if (llamaExtractOutputBucket.asKnown().isPresent) 1 else 0) +
                (if (rawFileBucket.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Buckets &&
                documentBucket == other.documentBucket &&
                etlBucket == other.etlBucket &&
                externalComponentsBucket == other.externalComponentsBucket &&
                fileParsingBucket == other.fileParsingBucket &&
                fileScreenshotBucket == other.fileScreenshotBucket &&
                llamaCloudParseOutputBucket == other.llamaCloudParseOutputBucket &&
                llamaExtractOutputBucket == other.llamaExtractOutputBucket &&
                rawFileBucket == other.rawFileBucket &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                documentBucket,
                etlBucket,
                externalComponentsBucket,
                fileParsingBucket,
                fileScreenshotBucket,
                llamaCloudParseOutputBucket,
                llamaExtractOutputBucket,
                rawFileBucket,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Buckets{documentBucket=$documentBucket, etlBucket=$etlBucket, externalComponentsBucket=$externalComponentsBucket, fileParsingBucket=$fileParsingBucket, fileScreenshotBucket=$fileScreenshotBucket, llamaCloudParseOutputBucket=$llamaCloudParseOutputBucket, llamaExtractOutputBucket=$llamaExtractOutputBucket, rawFileBucket=$rawFileBucket, additionalProperties=$additionalProperties}"
    }

    /**
     * Signature version used when generating presigned URLs. 'unsigned' = s3proxy path (proxy
     * handles auth), 's3v4' = explicit SigV4, 'default' = no override set (botocore default, may
     * produce SigV2 without a region)
     */
    class PresignedUrlSignatureVersion
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DEFAULT = of("default")

            @JvmField val S3V4 = of("s3v4")

            @JvmField val UNSIGNED = of("unsigned")

            @JvmStatic fun of(value: String) = PresignedUrlSignatureVersion(JsonField.of(value))
        }

        /** An enum containing [PresignedUrlSignatureVersion]'s known values. */
        enum class Known {
            DEFAULT,
            S3V4,
            UNSIGNED,
        }

        /**
         * An enum containing [PresignedUrlSignatureVersion]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [PresignedUrlSignatureVersion] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEFAULT,
            S3V4,
            UNSIGNED,
            /**
             * An enum member indicating that [PresignedUrlSignatureVersion] was instantiated with
             * an unknown value.
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
                DEFAULT -> Value.DEFAULT
                S3V4 -> Value.S3V4
                UNSIGNED -> Value.UNSIGNED
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
                DEFAULT -> Known.DEFAULT
                S3V4 -> Known.S3V4
                UNSIGNED -> Known.UNSIGNED
                else ->
                    throw LlamaCloudAdminInvalidDataException(
                        "Unknown PresignedUrlSignatureVersion: $value"
                    )
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
        fun validate(): PresignedUrlSignatureVersion = apply {
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

            return other is PresignedUrlSignatureVersion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AdminGetS3ConfigResponse &&
            buckets == other.buckets &&
            byocModeEnabled == other.byocModeEnabled &&
            endpointUrl == other.endpointUrl &&
            kmsKeyConfigured == other.kmsKeyConfigured &&
            presignedUrlSignatureVersion == other.presignedUrlSignatureVersion &&
            s3ProxyActive == other.s3ProxyActive &&
            s3ProxyEnabledOverride == other.s3ProxyEnabledOverride &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            buckets,
            byocModeEnabled,
            endpointUrl,
            kmsKeyConfigured,
            presignedUrlSignatureVersion,
            s3ProxyActive,
            s3ProxyEnabledOverride,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AdminGetS3ConfigResponse{buckets=$buckets, byocModeEnabled=$byocModeEnabled, endpointUrl=$endpointUrl, kmsKeyConfigured=$kmsKeyConfigured, presignedUrlSignatureVersion=$presignedUrlSignatureVersion, s3ProxyActive=$s3ProxyActive, s3ProxyEnabledOverride=$s3ProxyEnabledOverride, additionalProperties=$additionalProperties}"
}
