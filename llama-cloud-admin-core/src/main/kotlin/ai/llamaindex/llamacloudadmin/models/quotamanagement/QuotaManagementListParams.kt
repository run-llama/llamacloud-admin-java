// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.quotamanagement

import ai.llamaindex.llamacloudadmin.core.Enum
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.Params
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.core.http.Headers
import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import ai.llamaindex.llamacloudadmin.errors.LlamaCloudAdminInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a paginated list of quota configurations with optional filtering. When expand=true,
 * returns resolved quotas (effective values after fallback chain) and pagination parameters are
 * ignored.
 */
class QuotaManagementListParams
private constructor(
    private val sourceId: String,
    private val sourceType: SourceType,
    private val configurationType: ConfigurationType?,
    private val excludeSelfService: Boolean?,
    private val expand: Boolean?,
    private val page: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun sourceId(): String = sourceId

    fun sourceType(): SourceType = sourceType

    fun configurationType(): Optional<ConfigurationType> = Optional.ofNullable(configurationType)

    fun excludeSelfService(): Optional<Boolean> = Optional.ofNullable(excludeSelfService)

    fun expand(): Optional<Boolean> = Optional.ofNullable(expand)

    fun page(): Optional<Long> = Optional.ofNullable(page)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [QuotaManagementListParams].
         *
         * The following fields are required:
         * ```java
         * .sourceId()
         * .sourceType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QuotaManagementListParams]. */
    class Builder internal constructor() {

        private var sourceId: String? = null
        private var sourceType: SourceType? = null
        private var configurationType: ConfigurationType? = null
        private var excludeSelfService: Boolean? = null
        private var expand: Boolean? = null
        private var page: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(quotaManagementListParams: QuotaManagementListParams) = apply {
            sourceId = quotaManagementListParams.sourceId
            sourceType = quotaManagementListParams.sourceType
            configurationType = quotaManagementListParams.configurationType
            excludeSelfService = quotaManagementListParams.excludeSelfService
            expand = quotaManagementListParams.expand
            page = quotaManagementListParams.page
            pageSize = quotaManagementListParams.pageSize
            additionalHeaders = quotaManagementListParams.additionalHeaders.toBuilder()
            additionalQueryParams = quotaManagementListParams.additionalQueryParams.toBuilder()
        }

        fun sourceId(sourceId: String) = apply { this.sourceId = sourceId }

        fun sourceType(sourceType: SourceType) = apply { this.sourceType = sourceType }

        fun configurationType(configurationType: ConfigurationType?) = apply {
            this.configurationType = configurationType
        }

        /** Alias for calling [Builder.configurationType] with `configurationType.orElse(null)`. */
        fun configurationType(configurationType: Optional<ConfigurationType>) =
            configurationType(configurationType.getOrNull())

        fun excludeSelfService(excludeSelfService: Boolean?) = apply {
            this.excludeSelfService = excludeSelfService
        }

        /**
         * Alias for [Builder.excludeSelfService].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun excludeSelfService(excludeSelfService: Boolean) =
            excludeSelfService(excludeSelfService as Boolean?)

        /**
         * Alias for calling [Builder.excludeSelfService] with `excludeSelfService.orElse(null)`.
         */
        fun excludeSelfService(excludeSelfService: Optional<Boolean>) =
            excludeSelfService(excludeSelfService.getOrNull())

        fun expand(expand: Boolean?) = apply { this.expand = expand }

        /**
         * Alias for [Builder.expand].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun expand(expand: Boolean) = expand(expand as Boolean?)

        /** Alias for calling [Builder.expand] with `expand.orElse(null)`. */
        fun expand(expand: Optional<Boolean>) = expand(expand.getOrNull())

        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

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
         * Returns an immutable instance of [QuotaManagementListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sourceId()
         * .sourceType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QuotaManagementListParams =
            QuotaManagementListParams(
                checkRequired("sourceId", sourceId),
                checkRequired("sourceType", sourceType),
                configurationType,
                excludeSelfService,
                expand,
                page,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("source_id", sourceId)
                put("source_type", sourceType.toString())
                configurationType?.let { put("configuration_type", it.toString()) }
                excludeSelfService?.let { put("exclude_self_service", it.toString()) }
                expand?.let { put("expand", it.toString()) }
                page?.let { put("page", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class SourceType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GLOBAL = of("GLOBAL")

            @JvmField val ORGANIZATION = of("organization")

            @JvmField val PLAN_TIER = of("plan_tier")

            @JvmField val PROJECT = of("project")

            @JvmStatic fun of(value: String) = SourceType(JsonField.of(value))
        }

        /** An enum containing [SourceType]'s known values. */
        enum class Known {
            GLOBAL,
            ORGANIZATION,
            PLAN_TIER,
            PROJECT,
        }

        /**
         * An enum containing [SourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GLOBAL,
            ORGANIZATION,
            PLAN_TIER,
            PROJECT,
            /**
             * An enum member indicating that [SourceType] was instantiated with an unknown value.
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
                GLOBAL -> Value.GLOBAL
                ORGANIZATION -> Value.ORGANIZATION
                PLAN_TIER -> Value.PLAN_TIER
                PROJECT -> Value.PROJECT
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
                GLOBAL -> Known.GLOBAL
                ORGANIZATION -> Known.ORGANIZATION
                PLAN_TIER -> Known.PLAN_TIER
                PROJECT -> Known.PROJECT
                else -> throw LlamaCloudAdminInvalidDataException("Unknown SourceType: $value")
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
        fun validate(): SourceType = apply {
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

            return other is SourceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ConfigurationType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ALLOW_PAY_AS_YOU_GO = of("allow_pay_as_you_go")

            @JvmField
            val LIMIT_AGENT_CODER_DAILY_USAGE_USD = of("limit_agent_coder_daily_usage_usd")

            @JvmField val LIMIT_AGENT_DEPLOYMENTS = of("limit_agent_deployments")

            @JvmField val LIMIT_BATCH_FILES = of("limit_batch_files")

            @JvmField val LIMIT_CLASSIFY_INPUT_TOKENS = of("limit_classify_input_tokens")

            @JvmField val LIMIT_DAILY_USAGE_CREDITS = of("limit_daily_usage_credits")

            @JvmField val LIMIT_DIRECTORIES = of("limit_directories")

            @JvmField
            val LIMIT_DIRECTORY_FILES_PER_DIRECTORY = of("limit_directory_files_per_directory")

            @JvmField
            val LIMIT_DIRECTORY_INGEST_DOWNLOAD_SIZE_BYTES =
                of("limit_directory_ingest_download_size_bytes")

            @JvmField val LIMIT_DIRECTORY_INGEST_FILES = of("limit_directory_ingest_files")

            @JvmField
            val LIMIT_DIRECTORY_SYNC_PLAN_ACTIONS = of("limit_directory_sync_plan_actions")

            @JvmField val LIMIT_EMBEDDING_CHARACTER = of("limit_embedding_character")

            @JvmField val LIMIT_FILES_PER_INDEX = of("limit_files_per_index")

            @JvmField
            val LIMIT_MAX_MONTHLY_INVOICE_TOTAL_USD_CENTS =
                of("limit_max_monthly_invoice_total_usd_cents")

            @JvmField val LIMIT_MONTHLY_USAGE_CREDITS = of("limit_monthly_usage_credits")

            @JvmField val LIMIT_PROJECTS = of("limit_projects")

            @JvmField val LIMIT_SPLIT_CATEGORIES = of("limit_split_categories")

            @JvmField val LIMIT_TOTAL_FILE_COUNT = of("limit_total_file_count")

            @JvmField val LIMIT_TOTAL_FILE_STORAGE_BYTES = of("limit_total_file_storage_bytes")

            @JvmField val LIMIT_USERS = of("limit_users")

            @JvmField val RATE_LIMIT_BATCH_API_CREATION = of("rate_limit_batch_api_creation")

            @JvmField val RATE_LIMIT_CHAT_API_MESSAGE = of("rate_limit_chat_api_message")

            @JvmField val RATE_LIMIT_CLASSIFY_API_CREATION = of("rate_limit_classify_api_creation")

            @JvmField val RATE_LIMIT_CLASSIFY_API_LIST = of("rate_limit_classify_api_list")

            @JvmField val RATE_LIMIT_CLASSIFY_API_QUERY = of("rate_limit_classify_api_query")

            @JvmField
            val RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DEFAULT =
                of("rate_limit_concurrent_jobs_in_execution_default")

            @JvmField
            val RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DOC_INGEST =
                of("rate_limit_concurrent_jobs_in_execution_doc_ingest")

            @JvmField
            val RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_METADATA_UPDATE =
                of("rate_limit_concurrent_jobs_in_execution_metadata_update")

            @JvmField val RATE_LIMIT_DEFAULT_API_READ = of("rate_limit_default_api_read")

            @JvmField val RATE_LIMIT_DEFAULT_API_WRITE = of("rate_limit_default_api_write")

            @JvmField
            val RATE_LIMIT_DIRECTORY_FILE_API_READ = of("rate_limit_directory_file_api_read")

            @JvmField
            val RATE_LIMIT_DIRECTORY_FILE_API_WRITE = of("rate_limit_directory_file_api_write")

            @JvmField
            val RATE_LIMIT_DIRECTORY_INGEST_PROJECT_JOB_CREATION =
                of("rate_limit_directory_ingest_project_job_creation")

            @JvmField
            val RATE_LIMIT_EXTRACT_AGENT_CREATION = of("rate_limit_extract_agent_creation")

            @JvmField val RATE_LIMIT_EXTRACT_API_CREATION = of("rate_limit_extract_api_creation")

            @JvmField val RATE_LIMIT_EXTRACT_API_LIST = of("rate_limit_extract_api_list")

            @JvmField val RATE_LIMIT_EXTRACT_API_QUERY = of("rate_limit_extract_api_query")

            @JvmField
            val RATE_LIMIT_EXTRACT_CONCURRENT_DEFAULT = of("rate_limit_extract_concurrent_default")

            @JvmField val RATE_LIMIT_FILE_API_READ = of("rate_limit_file_api_read")

            @JvmField val RATE_LIMIT_FILE_API_WRITE = of("rate_limit_file_api_write")

            @JvmField
            val RATE_LIMIT_INDEX_V1_PIPELINE_CONCURRENT_JOBS =
                of("rate_limit_index_v1_pipeline_concurrent_jobs")

            @JvmField val RATE_LIMIT_PARSE_API_CREATION = of("rate_limit_parse_api_creation")

            @JvmField val RATE_LIMIT_PARSE_API_LIST = of("rate_limit_parse_api_list")

            @JvmField val RATE_LIMIT_PARSE_API_QUERY = of("rate_limit_parse_api_query")

            @JvmField
            val RATE_LIMIT_PARSE_CONCURRENT_DEFAULT = of("rate_limit_parse_concurrent_default")

            @JvmField
            val RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC =
                of("rate_limit_parse_concurrent_pages_agentic")

            @JvmField
            val RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC_PLUS =
                of("rate_limit_parse_concurrent_pages_agentic_plus")

            @JvmField
            val RATE_LIMIT_PARSE_CONCURRENT_PAGES_COST_EFFECTIVE =
                of("rate_limit_parse_concurrent_pages_cost_effective")

            @JvmField
            val RATE_LIMIT_PARSE_CONCURRENT_PREMIUM = of("rate_limit_parse_concurrent_premium")

            @JvmField
            val RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC = of("rate_limit_parse_token_bucket_agentic")

            @JvmField
            val RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC_PLUS =
                of("rate_limit_parse_token_bucket_agentic_plus")

            @JvmField
            val RATE_LIMIT_PARSE_TOKEN_BUCKET_COST_EFFECTIVE =
                of("rate_limit_parse_token_bucket_cost_effective")

            @JvmField
            val RATE_LIMIT_PARSE_TOKEN_BUCKET_UNKNOWN_TIER =
                of("rate_limit_parse_token_bucket_unknown_tier")

            @JvmField
            val RATE_LIMIT_PROJECT_CONCURRENT_JOBS = of("rate_limit_project_concurrent_jobs")

            @JvmField
            val RATE_LIMIT_PROJECT_CONCURRENT_TURBO_JOBS =
                of("rate_limit_project_concurrent_turbo_jobs")

            @JvmField val RATE_LIMIT_SPLIT_API_CREATION = of("rate_limit_split_api_creation")

            @JvmField val RATE_LIMIT_SPLIT_API_QUERY = of("rate_limit_split_api_query")

            @JvmField val RATE_LIMIT_SPREADSHEET_API_LIST = of("rate_limit_spreadsheet_api_list")

            @JvmField val RATE_LIMIT_SPREADSHEET_API_QUERY = of("rate_limit_spreadsheet_api_query")

            @JvmField val RATE_LIMIT_SPREADSHEET_CREATION = of("rate_limit_spreadsheet_creation")

            @JvmField val RATE_LIMIT_USAGE_API_QUERY = of("rate_limit_usage_api_query")

            @JvmField val RATE_LIMIT_VERIFY_API_CREATION = of("rate_limit_verify_api_creation")

            @JvmField val RATE_LIMIT_VERIFY_API_LIST = of("rate_limit_verify_api_list")

            @JvmField val RATE_LIMIT_VERIFY_API_QUERY = of("rate_limit_verify_api_query")

            @JvmStatic fun of(value: String) = ConfigurationType(JsonField.of(value))
        }

        /** An enum containing [ConfigurationType]'s known values. */
        enum class Known {
            ALLOW_PAY_AS_YOU_GO,
            LIMIT_AGENT_CODER_DAILY_USAGE_USD,
            LIMIT_AGENT_DEPLOYMENTS,
            LIMIT_BATCH_FILES,
            LIMIT_CLASSIFY_INPUT_TOKENS,
            LIMIT_DAILY_USAGE_CREDITS,
            LIMIT_DIRECTORIES,
            LIMIT_DIRECTORY_FILES_PER_DIRECTORY,
            LIMIT_DIRECTORY_INGEST_DOWNLOAD_SIZE_BYTES,
            LIMIT_DIRECTORY_INGEST_FILES,
            LIMIT_DIRECTORY_SYNC_PLAN_ACTIONS,
            LIMIT_EMBEDDING_CHARACTER,
            LIMIT_FILES_PER_INDEX,
            LIMIT_MAX_MONTHLY_INVOICE_TOTAL_USD_CENTS,
            LIMIT_MONTHLY_USAGE_CREDITS,
            LIMIT_PROJECTS,
            LIMIT_SPLIT_CATEGORIES,
            LIMIT_TOTAL_FILE_COUNT,
            LIMIT_TOTAL_FILE_STORAGE_BYTES,
            LIMIT_USERS,
            RATE_LIMIT_BATCH_API_CREATION,
            RATE_LIMIT_CHAT_API_MESSAGE,
            RATE_LIMIT_CLASSIFY_API_CREATION,
            RATE_LIMIT_CLASSIFY_API_LIST,
            RATE_LIMIT_CLASSIFY_API_QUERY,
            RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DEFAULT,
            RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DOC_INGEST,
            RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_METADATA_UPDATE,
            RATE_LIMIT_DEFAULT_API_READ,
            RATE_LIMIT_DEFAULT_API_WRITE,
            RATE_LIMIT_DIRECTORY_FILE_API_READ,
            RATE_LIMIT_DIRECTORY_FILE_API_WRITE,
            RATE_LIMIT_DIRECTORY_INGEST_PROJECT_JOB_CREATION,
            RATE_LIMIT_EXTRACT_AGENT_CREATION,
            RATE_LIMIT_EXTRACT_API_CREATION,
            RATE_LIMIT_EXTRACT_API_LIST,
            RATE_LIMIT_EXTRACT_API_QUERY,
            RATE_LIMIT_EXTRACT_CONCURRENT_DEFAULT,
            RATE_LIMIT_FILE_API_READ,
            RATE_LIMIT_FILE_API_WRITE,
            RATE_LIMIT_INDEX_V1_PIPELINE_CONCURRENT_JOBS,
            RATE_LIMIT_PARSE_API_CREATION,
            RATE_LIMIT_PARSE_API_LIST,
            RATE_LIMIT_PARSE_API_QUERY,
            RATE_LIMIT_PARSE_CONCURRENT_DEFAULT,
            RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC,
            RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC_PLUS,
            RATE_LIMIT_PARSE_CONCURRENT_PAGES_COST_EFFECTIVE,
            RATE_LIMIT_PARSE_CONCURRENT_PREMIUM,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC_PLUS,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_COST_EFFECTIVE,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_UNKNOWN_TIER,
            RATE_LIMIT_PROJECT_CONCURRENT_JOBS,
            RATE_LIMIT_PROJECT_CONCURRENT_TURBO_JOBS,
            RATE_LIMIT_SPLIT_API_CREATION,
            RATE_LIMIT_SPLIT_API_QUERY,
            RATE_LIMIT_SPREADSHEET_API_LIST,
            RATE_LIMIT_SPREADSHEET_API_QUERY,
            RATE_LIMIT_SPREADSHEET_CREATION,
            RATE_LIMIT_USAGE_API_QUERY,
            RATE_LIMIT_VERIFY_API_CREATION,
            RATE_LIMIT_VERIFY_API_LIST,
            RATE_LIMIT_VERIFY_API_QUERY,
        }

        /**
         * An enum containing [ConfigurationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ConfigurationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALLOW_PAY_AS_YOU_GO,
            LIMIT_AGENT_CODER_DAILY_USAGE_USD,
            LIMIT_AGENT_DEPLOYMENTS,
            LIMIT_BATCH_FILES,
            LIMIT_CLASSIFY_INPUT_TOKENS,
            LIMIT_DAILY_USAGE_CREDITS,
            LIMIT_DIRECTORIES,
            LIMIT_DIRECTORY_FILES_PER_DIRECTORY,
            LIMIT_DIRECTORY_INGEST_DOWNLOAD_SIZE_BYTES,
            LIMIT_DIRECTORY_INGEST_FILES,
            LIMIT_DIRECTORY_SYNC_PLAN_ACTIONS,
            LIMIT_EMBEDDING_CHARACTER,
            LIMIT_FILES_PER_INDEX,
            LIMIT_MAX_MONTHLY_INVOICE_TOTAL_USD_CENTS,
            LIMIT_MONTHLY_USAGE_CREDITS,
            LIMIT_PROJECTS,
            LIMIT_SPLIT_CATEGORIES,
            LIMIT_TOTAL_FILE_COUNT,
            LIMIT_TOTAL_FILE_STORAGE_BYTES,
            LIMIT_USERS,
            RATE_LIMIT_BATCH_API_CREATION,
            RATE_LIMIT_CHAT_API_MESSAGE,
            RATE_LIMIT_CLASSIFY_API_CREATION,
            RATE_LIMIT_CLASSIFY_API_LIST,
            RATE_LIMIT_CLASSIFY_API_QUERY,
            RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DEFAULT,
            RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DOC_INGEST,
            RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_METADATA_UPDATE,
            RATE_LIMIT_DEFAULT_API_READ,
            RATE_LIMIT_DEFAULT_API_WRITE,
            RATE_LIMIT_DIRECTORY_FILE_API_READ,
            RATE_LIMIT_DIRECTORY_FILE_API_WRITE,
            RATE_LIMIT_DIRECTORY_INGEST_PROJECT_JOB_CREATION,
            RATE_LIMIT_EXTRACT_AGENT_CREATION,
            RATE_LIMIT_EXTRACT_API_CREATION,
            RATE_LIMIT_EXTRACT_API_LIST,
            RATE_LIMIT_EXTRACT_API_QUERY,
            RATE_LIMIT_EXTRACT_CONCURRENT_DEFAULT,
            RATE_LIMIT_FILE_API_READ,
            RATE_LIMIT_FILE_API_WRITE,
            RATE_LIMIT_INDEX_V1_PIPELINE_CONCURRENT_JOBS,
            RATE_LIMIT_PARSE_API_CREATION,
            RATE_LIMIT_PARSE_API_LIST,
            RATE_LIMIT_PARSE_API_QUERY,
            RATE_LIMIT_PARSE_CONCURRENT_DEFAULT,
            RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC,
            RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC_PLUS,
            RATE_LIMIT_PARSE_CONCURRENT_PAGES_COST_EFFECTIVE,
            RATE_LIMIT_PARSE_CONCURRENT_PREMIUM,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC_PLUS,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_COST_EFFECTIVE,
            RATE_LIMIT_PARSE_TOKEN_BUCKET_UNKNOWN_TIER,
            RATE_LIMIT_PROJECT_CONCURRENT_JOBS,
            RATE_LIMIT_PROJECT_CONCURRENT_TURBO_JOBS,
            RATE_LIMIT_SPLIT_API_CREATION,
            RATE_LIMIT_SPLIT_API_QUERY,
            RATE_LIMIT_SPREADSHEET_API_LIST,
            RATE_LIMIT_SPREADSHEET_API_QUERY,
            RATE_LIMIT_SPREADSHEET_CREATION,
            RATE_LIMIT_USAGE_API_QUERY,
            RATE_LIMIT_VERIFY_API_CREATION,
            RATE_LIMIT_VERIFY_API_LIST,
            RATE_LIMIT_VERIFY_API_QUERY,
            /**
             * An enum member indicating that [ConfigurationType] was instantiated with an unknown
             * value.
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
                ALLOW_PAY_AS_YOU_GO -> Value.ALLOW_PAY_AS_YOU_GO
                LIMIT_AGENT_CODER_DAILY_USAGE_USD -> Value.LIMIT_AGENT_CODER_DAILY_USAGE_USD
                LIMIT_AGENT_DEPLOYMENTS -> Value.LIMIT_AGENT_DEPLOYMENTS
                LIMIT_BATCH_FILES -> Value.LIMIT_BATCH_FILES
                LIMIT_CLASSIFY_INPUT_TOKENS -> Value.LIMIT_CLASSIFY_INPUT_TOKENS
                LIMIT_DAILY_USAGE_CREDITS -> Value.LIMIT_DAILY_USAGE_CREDITS
                LIMIT_DIRECTORIES -> Value.LIMIT_DIRECTORIES
                LIMIT_DIRECTORY_FILES_PER_DIRECTORY -> Value.LIMIT_DIRECTORY_FILES_PER_DIRECTORY
                LIMIT_DIRECTORY_INGEST_DOWNLOAD_SIZE_BYTES ->
                    Value.LIMIT_DIRECTORY_INGEST_DOWNLOAD_SIZE_BYTES
                LIMIT_DIRECTORY_INGEST_FILES -> Value.LIMIT_DIRECTORY_INGEST_FILES
                LIMIT_DIRECTORY_SYNC_PLAN_ACTIONS -> Value.LIMIT_DIRECTORY_SYNC_PLAN_ACTIONS
                LIMIT_EMBEDDING_CHARACTER -> Value.LIMIT_EMBEDDING_CHARACTER
                LIMIT_FILES_PER_INDEX -> Value.LIMIT_FILES_PER_INDEX
                LIMIT_MAX_MONTHLY_INVOICE_TOTAL_USD_CENTS ->
                    Value.LIMIT_MAX_MONTHLY_INVOICE_TOTAL_USD_CENTS
                LIMIT_MONTHLY_USAGE_CREDITS -> Value.LIMIT_MONTHLY_USAGE_CREDITS
                LIMIT_PROJECTS -> Value.LIMIT_PROJECTS
                LIMIT_SPLIT_CATEGORIES -> Value.LIMIT_SPLIT_CATEGORIES
                LIMIT_TOTAL_FILE_COUNT -> Value.LIMIT_TOTAL_FILE_COUNT
                LIMIT_TOTAL_FILE_STORAGE_BYTES -> Value.LIMIT_TOTAL_FILE_STORAGE_BYTES
                LIMIT_USERS -> Value.LIMIT_USERS
                RATE_LIMIT_BATCH_API_CREATION -> Value.RATE_LIMIT_BATCH_API_CREATION
                RATE_LIMIT_CHAT_API_MESSAGE -> Value.RATE_LIMIT_CHAT_API_MESSAGE
                RATE_LIMIT_CLASSIFY_API_CREATION -> Value.RATE_LIMIT_CLASSIFY_API_CREATION
                RATE_LIMIT_CLASSIFY_API_LIST -> Value.RATE_LIMIT_CLASSIFY_API_LIST
                RATE_LIMIT_CLASSIFY_API_QUERY -> Value.RATE_LIMIT_CLASSIFY_API_QUERY
                RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DEFAULT ->
                    Value.RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DEFAULT
                RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DOC_INGEST ->
                    Value.RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DOC_INGEST
                RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_METADATA_UPDATE ->
                    Value.RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_METADATA_UPDATE
                RATE_LIMIT_DEFAULT_API_READ -> Value.RATE_LIMIT_DEFAULT_API_READ
                RATE_LIMIT_DEFAULT_API_WRITE -> Value.RATE_LIMIT_DEFAULT_API_WRITE
                RATE_LIMIT_DIRECTORY_FILE_API_READ -> Value.RATE_LIMIT_DIRECTORY_FILE_API_READ
                RATE_LIMIT_DIRECTORY_FILE_API_WRITE -> Value.RATE_LIMIT_DIRECTORY_FILE_API_WRITE
                RATE_LIMIT_DIRECTORY_INGEST_PROJECT_JOB_CREATION ->
                    Value.RATE_LIMIT_DIRECTORY_INGEST_PROJECT_JOB_CREATION
                RATE_LIMIT_EXTRACT_AGENT_CREATION -> Value.RATE_LIMIT_EXTRACT_AGENT_CREATION
                RATE_LIMIT_EXTRACT_API_CREATION -> Value.RATE_LIMIT_EXTRACT_API_CREATION
                RATE_LIMIT_EXTRACT_API_LIST -> Value.RATE_LIMIT_EXTRACT_API_LIST
                RATE_LIMIT_EXTRACT_API_QUERY -> Value.RATE_LIMIT_EXTRACT_API_QUERY
                RATE_LIMIT_EXTRACT_CONCURRENT_DEFAULT -> Value.RATE_LIMIT_EXTRACT_CONCURRENT_DEFAULT
                RATE_LIMIT_FILE_API_READ -> Value.RATE_LIMIT_FILE_API_READ
                RATE_LIMIT_FILE_API_WRITE -> Value.RATE_LIMIT_FILE_API_WRITE
                RATE_LIMIT_INDEX_V1_PIPELINE_CONCURRENT_JOBS ->
                    Value.RATE_LIMIT_INDEX_V1_PIPELINE_CONCURRENT_JOBS
                RATE_LIMIT_PARSE_API_CREATION -> Value.RATE_LIMIT_PARSE_API_CREATION
                RATE_LIMIT_PARSE_API_LIST -> Value.RATE_LIMIT_PARSE_API_LIST
                RATE_LIMIT_PARSE_API_QUERY -> Value.RATE_LIMIT_PARSE_API_QUERY
                RATE_LIMIT_PARSE_CONCURRENT_DEFAULT -> Value.RATE_LIMIT_PARSE_CONCURRENT_DEFAULT
                RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC ->
                    Value.RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC
                RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC_PLUS ->
                    Value.RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC_PLUS
                RATE_LIMIT_PARSE_CONCURRENT_PAGES_COST_EFFECTIVE ->
                    Value.RATE_LIMIT_PARSE_CONCURRENT_PAGES_COST_EFFECTIVE
                RATE_LIMIT_PARSE_CONCURRENT_PREMIUM -> Value.RATE_LIMIT_PARSE_CONCURRENT_PREMIUM
                RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC -> Value.RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC
                RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC_PLUS ->
                    Value.RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC_PLUS
                RATE_LIMIT_PARSE_TOKEN_BUCKET_COST_EFFECTIVE ->
                    Value.RATE_LIMIT_PARSE_TOKEN_BUCKET_COST_EFFECTIVE
                RATE_LIMIT_PARSE_TOKEN_BUCKET_UNKNOWN_TIER ->
                    Value.RATE_LIMIT_PARSE_TOKEN_BUCKET_UNKNOWN_TIER
                RATE_LIMIT_PROJECT_CONCURRENT_JOBS -> Value.RATE_LIMIT_PROJECT_CONCURRENT_JOBS
                RATE_LIMIT_PROJECT_CONCURRENT_TURBO_JOBS ->
                    Value.RATE_LIMIT_PROJECT_CONCURRENT_TURBO_JOBS
                RATE_LIMIT_SPLIT_API_CREATION -> Value.RATE_LIMIT_SPLIT_API_CREATION
                RATE_LIMIT_SPLIT_API_QUERY -> Value.RATE_LIMIT_SPLIT_API_QUERY
                RATE_LIMIT_SPREADSHEET_API_LIST -> Value.RATE_LIMIT_SPREADSHEET_API_LIST
                RATE_LIMIT_SPREADSHEET_API_QUERY -> Value.RATE_LIMIT_SPREADSHEET_API_QUERY
                RATE_LIMIT_SPREADSHEET_CREATION -> Value.RATE_LIMIT_SPREADSHEET_CREATION
                RATE_LIMIT_USAGE_API_QUERY -> Value.RATE_LIMIT_USAGE_API_QUERY
                RATE_LIMIT_VERIFY_API_CREATION -> Value.RATE_LIMIT_VERIFY_API_CREATION
                RATE_LIMIT_VERIFY_API_LIST -> Value.RATE_LIMIT_VERIFY_API_LIST
                RATE_LIMIT_VERIFY_API_QUERY -> Value.RATE_LIMIT_VERIFY_API_QUERY
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
                LIMIT_AGENT_CODER_DAILY_USAGE_USD -> Known.LIMIT_AGENT_CODER_DAILY_USAGE_USD
                LIMIT_AGENT_DEPLOYMENTS -> Known.LIMIT_AGENT_DEPLOYMENTS
                LIMIT_BATCH_FILES -> Known.LIMIT_BATCH_FILES
                LIMIT_CLASSIFY_INPUT_TOKENS -> Known.LIMIT_CLASSIFY_INPUT_TOKENS
                LIMIT_DAILY_USAGE_CREDITS -> Known.LIMIT_DAILY_USAGE_CREDITS
                LIMIT_DIRECTORIES -> Known.LIMIT_DIRECTORIES
                LIMIT_DIRECTORY_FILES_PER_DIRECTORY -> Known.LIMIT_DIRECTORY_FILES_PER_DIRECTORY
                LIMIT_DIRECTORY_INGEST_DOWNLOAD_SIZE_BYTES ->
                    Known.LIMIT_DIRECTORY_INGEST_DOWNLOAD_SIZE_BYTES
                LIMIT_DIRECTORY_INGEST_FILES -> Known.LIMIT_DIRECTORY_INGEST_FILES
                LIMIT_DIRECTORY_SYNC_PLAN_ACTIONS -> Known.LIMIT_DIRECTORY_SYNC_PLAN_ACTIONS
                LIMIT_EMBEDDING_CHARACTER -> Known.LIMIT_EMBEDDING_CHARACTER
                LIMIT_FILES_PER_INDEX -> Known.LIMIT_FILES_PER_INDEX
                LIMIT_MAX_MONTHLY_INVOICE_TOTAL_USD_CENTS ->
                    Known.LIMIT_MAX_MONTHLY_INVOICE_TOTAL_USD_CENTS
                LIMIT_MONTHLY_USAGE_CREDITS -> Known.LIMIT_MONTHLY_USAGE_CREDITS
                LIMIT_PROJECTS -> Known.LIMIT_PROJECTS
                LIMIT_SPLIT_CATEGORIES -> Known.LIMIT_SPLIT_CATEGORIES
                LIMIT_TOTAL_FILE_COUNT -> Known.LIMIT_TOTAL_FILE_COUNT
                LIMIT_TOTAL_FILE_STORAGE_BYTES -> Known.LIMIT_TOTAL_FILE_STORAGE_BYTES
                LIMIT_USERS -> Known.LIMIT_USERS
                RATE_LIMIT_BATCH_API_CREATION -> Known.RATE_LIMIT_BATCH_API_CREATION
                RATE_LIMIT_CHAT_API_MESSAGE -> Known.RATE_LIMIT_CHAT_API_MESSAGE
                RATE_LIMIT_CLASSIFY_API_CREATION -> Known.RATE_LIMIT_CLASSIFY_API_CREATION
                RATE_LIMIT_CLASSIFY_API_LIST -> Known.RATE_LIMIT_CLASSIFY_API_LIST
                RATE_LIMIT_CLASSIFY_API_QUERY -> Known.RATE_LIMIT_CLASSIFY_API_QUERY
                RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DEFAULT ->
                    Known.RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DEFAULT
                RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DOC_INGEST ->
                    Known.RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_DOC_INGEST
                RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_METADATA_UPDATE ->
                    Known.RATE_LIMIT_CONCURRENT_JOBS_IN_EXECUTION_METADATA_UPDATE
                RATE_LIMIT_DEFAULT_API_READ -> Known.RATE_LIMIT_DEFAULT_API_READ
                RATE_LIMIT_DEFAULT_API_WRITE -> Known.RATE_LIMIT_DEFAULT_API_WRITE
                RATE_LIMIT_DIRECTORY_FILE_API_READ -> Known.RATE_LIMIT_DIRECTORY_FILE_API_READ
                RATE_LIMIT_DIRECTORY_FILE_API_WRITE -> Known.RATE_LIMIT_DIRECTORY_FILE_API_WRITE
                RATE_LIMIT_DIRECTORY_INGEST_PROJECT_JOB_CREATION ->
                    Known.RATE_LIMIT_DIRECTORY_INGEST_PROJECT_JOB_CREATION
                RATE_LIMIT_EXTRACT_AGENT_CREATION -> Known.RATE_LIMIT_EXTRACT_AGENT_CREATION
                RATE_LIMIT_EXTRACT_API_CREATION -> Known.RATE_LIMIT_EXTRACT_API_CREATION
                RATE_LIMIT_EXTRACT_API_LIST -> Known.RATE_LIMIT_EXTRACT_API_LIST
                RATE_LIMIT_EXTRACT_API_QUERY -> Known.RATE_LIMIT_EXTRACT_API_QUERY
                RATE_LIMIT_EXTRACT_CONCURRENT_DEFAULT -> Known.RATE_LIMIT_EXTRACT_CONCURRENT_DEFAULT
                RATE_LIMIT_FILE_API_READ -> Known.RATE_LIMIT_FILE_API_READ
                RATE_LIMIT_FILE_API_WRITE -> Known.RATE_LIMIT_FILE_API_WRITE
                RATE_LIMIT_INDEX_V1_PIPELINE_CONCURRENT_JOBS ->
                    Known.RATE_LIMIT_INDEX_V1_PIPELINE_CONCURRENT_JOBS
                RATE_LIMIT_PARSE_API_CREATION -> Known.RATE_LIMIT_PARSE_API_CREATION
                RATE_LIMIT_PARSE_API_LIST -> Known.RATE_LIMIT_PARSE_API_LIST
                RATE_LIMIT_PARSE_API_QUERY -> Known.RATE_LIMIT_PARSE_API_QUERY
                RATE_LIMIT_PARSE_CONCURRENT_DEFAULT -> Known.RATE_LIMIT_PARSE_CONCURRENT_DEFAULT
                RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC ->
                    Known.RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC
                RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC_PLUS ->
                    Known.RATE_LIMIT_PARSE_CONCURRENT_PAGES_AGENTIC_PLUS
                RATE_LIMIT_PARSE_CONCURRENT_PAGES_COST_EFFECTIVE ->
                    Known.RATE_LIMIT_PARSE_CONCURRENT_PAGES_COST_EFFECTIVE
                RATE_LIMIT_PARSE_CONCURRENT_PREMIUM -> Known.RATE_LIMIT_PARSE_CONCURRENT_PREMIUM
                RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC -> Known.RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC
                RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC_PLUS ->
                    Known.RATE_LIMIT_PARSE_TOKEN_BUCKET_AGENTIC_PLUS
                RATE_LIMIT_PARSE_TOKEN_BUCKET_COST_EFFECTIVE ->
                    Known.RATE_LIMIT_PARSE_TOKEN_BUCKET_COST_EFFECTIVE
                RATE_LIMIT_PARSE_TOKEN_BUCKET_UNKNOWN_TIER ->
                    Known.RATE_LIMIT_PARSE_TOKEN_BUCKET_UNKNOWN_TIER
                RATE_LIMIT_PROJECT_CONCURRENT_JOBS -> Known.RATE_LIMIT_PROJECT_CONCURRENT_JOBS
                RATE_LIMIT_PROJECT_CONCURRENT_TURBO_JOBS ->
                    Known.RATE_LIMIT_PROJECT_CONCURRENT_TURBO_JOBS
                RATE_LIMIT_SPLIT_API_CREATION -> Known.RATE_LIMIT_SPLIT_API_CREATION
                RATE_LIMIT_SPLIT_API_QUERY -> Known.RATE_LIMIT_SPLIT_API_QUERY
                RATE_LIMIT_SPREADSHEET_API_LIST -> Known.RATE_LIMIT_SPREADSHEET_API_LIST
                RATE_LIMIT_SPREADSHEET_API_QUERY -> Known.RATE_LIMIT_SPREADSHEET_API_QUERY
                RATE_LIMIT_SPREADSHEET_CREATION -> Known.RATE_LIMIT_SPREADSHEET_CREATION
                RATE_LIMIT_USAGE_API_QUERY -> Known.RATE_LIMIT_USAGE_API_QUERY
                RATE_LIMIT_VERIFY_API_CREATION -> Known.RATE_LIMIT_VERIFY_API_CREATION
                RATE_LIMIT_VERIFY_API_LIST -> Known.RATE_LIMIT_VERIFY_API_LIST
                RATE_LIMIT_VERIFY_API_QUERY -> Known.RATE_LIMIT_VERIFY_API_QUERY
                else ->
                    throw LlamaCloudAdminInvalidDataException("Unknown ConfigurationType: $value")
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
        fun validate(): ConfigurationType = apply {
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

            return other is ConfigurationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuotaManagementListParams &&
            sourceId == other.sourceId &&
            sourceType == other.sourceType &&
            configurationType == other.configurationType &&
            excludeSelfService == other.excludeSelfService &&
            expand == other.expand &&
            page == other.page &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            sourceId,
            sourceType,
            configurationType,
            excludeSelfService,
            expand,
            page,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "QuotaManagementListParams{sourceId=$sourceId, sourceType=$sourceType, configurationType=$configurationType, excludeSelfService=$excludeSelfService, expand=$expand, page=$page, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
