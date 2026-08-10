// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin.usagemetrics

import ai.llamaindex.llamacloudadmin.core.Enum
import ai.llamaindex.llamacloudadmin.core.JsonField
import ai.llamaindex.llamacloudadmin.core.Params
import ai.llamaindex.llamacloudadmin.core.checkRequired
import ai.llamaindex.llamacloudadmin.core.http.Headers
import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import ai.llamaindex.llamacloudadmin.core.toImmutable
import ai.llamaindex.llamacloudadmin.errors.LlamaCloudAdminInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Aggregate usage metrics by one or more dimensions, reporting total credits used. Global admin
 * only.
 *
 * A date range is required, which bounds the scan via the `day`-leading index. Supplying
 * `organization_id` narrows it further via the `(organization_id, day)` index.
 *
 * Supported `group_by` dimensions: `day`, `organization_id`, `project_id`, `event_type`, `user_id`.
 * Buckets are ordered by total credits descending.
 */
class UsageMetricAggregateParams
private constructor(
    private val dayOnOrAfter: String,
    private val dayOnOrBefore: String,
    private val groupBy: List<String>,
    private val eventTypes: List<EventType>?,
    private val organizationId: String?,
    private val projectId: String?,
    private val userId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Inclusive lower bound on the day (YYYY-MM-DD, UTC) */
    fun dayOnOrAfter(): String = dayOnOrAfter

    /** Inclusive upper bound on the day (YYYY-MM-DD, UTC) */
    fun dayOnOrBefore(): String = dayOnOrBefore

    /** Dimensions to group by: day, organization_id, project_id, event_type, user_id */
    fun groupBy(): List<String> = groupBy

    /** Filter by event types */
    fun eventTypes(): Optional<List<EventType>> = Optional.ofNullable(eventTypes)

    /** Filter by organization ID */
    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    /** Filter by project ID */
    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Filter by user ID */
    fun userId(): Optional<String> = Optional.ofNullable(userId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageMetricAggregateParams].
         *
         * The following fields are required:
         * ```java
         * .dayOnOrAfter()
         * .dayOnOrBefore()
         * .groupBy()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageMetricAggregateParams]. */
    class Builder internal constructor() {

        private var dayOnOrAfter: String? = null
        private var dayOnOrBefore: String? = null
        private var groupBy: MutableList<String>? = null
        private var eventTypes: MutableList<EventType>? = null
        private var organizationId: String? = null
        private var projectId: String? = null
        private var userId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(usageMetricAggregateParams: UsageMetricAggregateParams) = apply {
            dayOnOrAfter = usageMetricAggregateParams.dayOnOrAfter
            dayOnOrBefore = usageMetricAggregateParams.dayOnOrBefore
            groupBy = usageMetricAggregateParams.groupBy.toMutableList()
            eventTypes = usageMetricAggregateParams.eventTypes?.toMutableList()
            organizationId = usageMetricAggregateParams.organizationId
            projectId = usageMetricAggregateParams.projectId
            userId = usageMetricAggregateParams.userId
            additionalHeaders = usageMetricAggregateParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageMetricAggregateParams.additionalQueryParams.toBuilder()
        }

        /** Inclusive lower bound on the day (YYYY-MM-DD, UTC) */
        fun dayOnOrAfter(dayOnOrAfter: String) = apply { this.dayOnOrAfter = dayOnOrAfter }

        /** Inclusive upper bound on the day (YYYY-MM-DD, UTC) */
        fun dayOnOrBefore(dayOnOrBefore: String) = apply { this.dayOnOrBefore = dayOnOrBefore }

        /** Dimensions to group by: day, organization_id, project_id, event_type, user_id */
        fun groupBy(groupBy: List<String>) = apply { this.groupBy = groupBy.toMutableList() }

        /**
         * Adds a single [String] to [Builder.groupBy].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroupBy(groupBy: String) = apply {
            this.groupBy = (this.groupBy ?: mutableListOf()).apply { add(groupBy) }
        }

        /** Filter by event types */
        fun eventTypes(eventTypes: List<EventType>?) = apply {
            this.eventTypes = eventTypes?.toMutableList()
        }

        /** Alias for calling [Builder.eventTypes] with `eventTypes.orElse(null)`. */
        fun eventTypes(eventTypes: Optional<List<EventType>>) = eventTypes(eventTypes.getOrNull())

        /**
         * Adds a single [EventType] to [eventTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEventType(eventType: EventType) = apply {
            eventTypes = (eventTypes ?: mutableListOf()).apply { add(eventType) }
        }

        /** Filter by organization ID */
        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        /** Filter by project ID */
        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /** Filter by user ID */
        fun userId(userId: String?) = apply { this.userId = userId }

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

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
         * Returns an immutable instance of [UsageMetricAggregateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dayOnOrAfter()
         * .dayOnOrBefore()
         * .groupBy()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageMetricAggregateParams =
            UsageMetricAggregateParams(
                checkRequired("dayOnOrAfter", dayOnOrAfter),
                checkRequired("dayOnOrBefore", dayOnOrBefore),
                checkRequired("groupBy", groupBy).toImmutable(),
                eventTypes?.toImmutable(),
                organizationId,
                projectId,
                userId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("day_on_or_after", dayOnOrAfter)
                put("day_on_or_before", dayOnOrBefore)
                groupBy.forEach { put("group_by", it) }
                eventTypes?.forEach { put("event_types", it.toString()) }
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                userId?.let { put("user_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AUDIO_SECONDS_PARSED = of("audio_seconds_parsed")

            @JvmField val CHART_PARSING_AGENTIC = of("chart_parsing_agentic")

            @JvmField val CHART_PARSING_EFFICIENT = of("chart_parsing_efficient")

            @JvmField val CHART_PARSING_PLUS = of("chart_parsing_plus")

            @JvmField val CHAT_MESSAGE_SENT = of("chat_message_sent")

            @JvmField val CONFIDENCE_SCORE_HIGH = of("confidence_score_high")

            @JvmField val DIRECTORY_COUNT_SNAPSHOT = of("directory_count_snapshot")

            @JvmField val DIRECTORY_FILE_COUNT_SNAPSHOT = of("directory_file_count_snapshot")

            @JvmField val DIRECTORY_FILES_EXPORTED = of("directory_files_exported")

            @JvmField val DIRECTORY_FILES_INGESTED = of("directory_files_ingested")

            @JvmField val DIRECTORY_PAGES_EXPORTED = of("directory_pages_exported")

            @JvmField val EXTRACTION_NUM_PAGES = of("extraction_num_pages")

            @JvmField val EXTRACTION_NUM_PAGES_PARSED = of("extraction_num_pages_parsed")

            @JvmField val FORM_PARSING_PAGES = of("form_parsing_pages")

            @JvmField val IMAGE_CLASSIFIED = of("image_classified")

            @JvmField val INDEX_RETRIEVE_QUERY = of("index_retrieve_query")

            @JvmField val LAYOUT_AWARE_CHART_EXTRACTION = of("layout_aware_chart_extraction")

            @JvmField val LAYOUT_AWARE_PARSING = of("layout_aware_parsing")

            @JvmField val LAYOUT_EXTRACTED = of("layout_extracted")

            @JvmField val PAGES_CLASSIFIED = of("pages_classified")

            @JvmField val PAGES_EMBEDDED = of("pages_embedded")

            @JvmField val PAGES_INDEXED = of("pages_indexed")

            @JvmField val PAGES_PARSED = of("pages_parsed")

            @JvmField val PAGES_SPLIT = of("pages_split")

            @JvmField val PAGES_VERIFIED = of("pages_verified")

            @JvmField val PRECISE_BBOX_EXTRACTION = of("precise_bbox_extraction")

            @JvmField val SET_TOTAL_INDEXES = of("set_total_indexes")

            @JvmField val SET_TOTAL_PAGES_INDEXED = of("set_total_pages_indexed")

            @JvmField val SPREADSHEET_REGIONS_EXTRACTED = of("spreadsheet_regions_extracted")

            @JvmField val STORED_FILE_COUNT = of("stored_file_count")

            @JvmField val STORED_FILE_MB = of("stored_file_mb")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            AUDIO_SECONDS_PARSED,
            CHART_PARSING_AGENTIC,
            CHART_PARSING_EFFICIENT,
            CHART_PARSING_PLUS,
            CHAT_MESSAGE_SENT,
            CONFIDENCE_SCORE_HIGH,
            DIRECTORY_COUNT_SNAPSHOT,
            DIRECTORY_FILE_COUNT_SNAPSHOT,
            DIRECTORY_FILES_EXPORTED,
            DIRECTORY_FILES_INGESTED,
            DIRECTORY_PAGES_EXPORTED,
            EXTRACTION_NUM_PAGES,
            EXTRACTION_NUM_PAGES_PARSED,
            FORM_PARSING_PAGES,
            IMAGE_CLASSIFIED,
            INDEX_RETRIEVE_QUERY,
            LAYOUT_AWARE_CHART_EXTRACTION,
            LAYOUT_AWARE_PARSING,
            LAYOUT_EXTRACTED,
            PAGES_CLASSIFIED,
            PAGES_EMBEDDED,
            PAGES_INDEXED,
            PAGES_PARSED,
            PAGES_SPLIT,
            PAGES_VERIFIED,
            PRECISE_BBOX_EXTRACTION,
            SET_TOTAL_INDEXES,
            SET_TOTAL_PAGES_INDEXED,
            SPREADSHEET_REGIONS_EXTRACTED,
            STORED_FILE_COUNT,
            STORED_FILE_MB,
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUDIO_SECONDS_PARSED,
            CHART_PARSING_AGENTIC,
            CHART_PARSING_EFFICIENT,
            CHART_PARSING_PLUS,
            CHAT_MESSAGE_SENT,
            CONFIDENCE_SCORE_HIGH,
            DIRECTORY_COUNT_SNAPSHOT,
            DIRECTORY_FILE_COUNT_SNAPSHOT,
            DIRECTORY_FILES_EXPORTED,
            DIRECTORY_FILES_INGESTED,
            DIRECTORY_PAGES_EXPORTED,
            EXTRACTION_NUM_PAGES,
            EXTRACTION_NUM_PAGES_PARSED,
            FORM_PARSING_PAGES,
            IMAGE_CLASSIFIED,
            INDEX_RETRIEVE_QUERY,
            LAYOUT_AWARE_CHART_EXTRACTION,
            LAYOUT_AWARE_PARSING,
            LAYOUT_EXTRACTED,
            PAGES_CLASSIFIED,
            PAGES_EMBEDDED,
            PAGES_INDEXED,
            PAGES_PARSED,
            PAGES_SPLIT,
            PAGES_VERIFIED,
            PRECISE_BBOX_EXTRACTION,
            SET_TOTAL_INDEXES,
            SET_TOTAL_PAGES_INDEXED,
            SPREADSHEET_REGIONS_EXTRACTED,
            STORED_FILE_COUNT,
            STORED_FILE_MB,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                AUDIO_SECONDS_PARSED -> Value.AUDIO_SECONDS_PARSED
                CHART_PARSING_AGENTIC -> Value.CHART_PARSING_AGENTIC
                CHART_PARSING_EFFICIENT -> Value.CHART_PARSING_EFFICIENT
                CHART_PARSING_PLUS -> Value.CHART_PARSING_PLUS
                CHAT_MESSAGE_SENT -> Value.CHAT_MESSAGE_SENT
                CONFIDENCE_SCORE_HIGH -> Value.CONFIDENCE_SCORE_HIGH
                DIRECTORY_COUNT_SNAPSHOT -> Value.DIRECTORY_COUNT_SNAPSHOT
                DIRECTORY_FILE_COUNT_SNAPSHOT -> Value.DIRECTORY_FILE_COUNT_SNAPSHOT
                DIRECTORY_FILES_EXPORTED -> Value.DIRECTORY_FILES_EXPORTED
                DIRECTORY_FILES_INGESTED -> Value.DIRECTORY_FILES_INGESTED
                DIRECTORY_PAGES_EXPORTED -> Value.DIRECTORY_PAGES_EXPORTED
                EXTRACTION_NUM_PAGES -> Value.EXTRACTION_NUM_PAGES
                EXTRACTION_NUM_PAGES_PARSED -> Value.EXTRACTION_NUM_PAGES_PARSED
                FORM_PARSING_PAGES -> Value.FORM_PARSING_PAGES
                IMAGE_CLASSIFIED -> Value.IMAGE_CLASSIFIED
                INDEX_RETRIEVE_QUERY -> Value.INDEX_RETRIEVE_QUERY
                LAYOUT_AWARE_CHART_EXTRACTION -> Value.LAYOUT_AWARE_CHART_EXTRACTION
                LAYOUT_AWARE_PARSING -> Value.LAYOUT_AWARE_PARSING
                LAYOUT_EXTRACTED -> Value.LAYOUT_EXTRACTED
                PAGES_CLASSIFIED -> Value.PAGES_CLASSIFIED
                PAGES_EMBEDDED -> Value.PAGES_EMBEDDED
                PAGES_INDEXED -> Value.PAGES_INDEXED
                PAGES_PARSED -> Value.PAGES_PARSED
                PAGES_SPLIT -> Value.PAGES_SPLIT
                PAGES_VERIFIED -> Value.PAGES_VERIFIED
                PRECISE_BBOX_EXTRACTION -> Value.PRECISE_BBOX_EXTRACTION
                SET_TOTAL_INDEXES -> Value.SET_TOTAL_INDEXES
                SET_TOTAL_PAGES_INDEXED -> Value.SET_TOTAL_PAGES_INDEXED
                SPREADSHEET_REGIONS_EXTRACTED -> Value.SPREADSHEET_REGIONS_EXTRACTED
                STORED_FILE_COUNT -> Value.STORED_FILE_COUNT
                STORED_FILE_MB -> Value.STORED_FILE_MB
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
                AUDIO_SECONDS_PARSED -> Known.AUDIO_SECONDS_PARSED
                CHART_PARSING_AGENTIC -> Known.CHART_PARSING_AGENTIC
                CHART_PARSING_EFFICIENT -> Known.CHART_PARSING_EFFICIENT
                CHART_PARSING_PLUS -> Known.CHART_PARSING_PLUS
                CHAT_MESSAGE_SENT -> Known.CHAT_MESSAGE_SENT
                CONFIDENCE_SCORE_HIGH -> Known.CONFIDENCE_SCORE_HIGH
                DIRECTORY_COUNT_SNAPSHOT -> Known.DIRECTORY_COUNT_SNAPSHOT
                DIRECTORY_FILE_COUNT_SNAPSHOT -> Known.DIRECTORY_FILE_COUNT_SNAPSHOT
                DIRECTORY_FILES_EXPORTED -> Known.DIRECTORY_FILES_EXPORTED
                DIRECTORY_FILES_INGESTED -> Known.DIRECTORY_FILES_INGESTED
                DIRECTORY_PAGES_EXPORTED -> Known.DIRECTORY_PAGES_EXPORTED
                EXTRACTION_NUM_PAGES -> Known.EXTRACTION_NUM_PAGES
                EXTRACTION_NUM_PAGES_PARSED -> Known.EXTRACTION_NUM_PAGES_PARSED
                FORM_PARSING_PAGES -> Known.FORM_PARSING_PAGES
                IMAGE_CLASSIFIED -> Known.IMAGE_CLASSIFIED
                INDEX_RETRIEVE_QUERY -> Known.INDEX_RETRIEVE_QUERY
                LAYOUT_AWARE_CHART_EXTRACTION -> Known.LAYOUT_AWARE_CHART_EXTRACTION
                LAYOUT_AWARE_PARSING -> Known.LAYOUT_AWARE_PARSING
                LAYOUT_EXTRACTED -> Known.LAYOUT_EXTRACTED
                PAGES_CLASSIFIED -> Known.PAGES_CLASSIFIED
                PAGES_EMBEDDED -> Known.PAGES_EMBEDDED
                PAGES_INDEXED -> Known.PAGES_INDEXED
                PAGES_PARSED -> Known.PAGES_PARSED
                PAGES_SPLIT -> Known.PAGES_SPLIT
                PAGES_VERIFIED -> Known.PAGES_VERIFIED
                PRECISE_BBOX_EXTRACTION -> Known.PRECISE_BBOX_EXTRACTION
                SET_TOTAL_INDEXES -> Known.SET_TOTAL_INDEXES
                SET_TOTAL_PAGES_INDEXED -> Known.SET_TOTAL_PAGES_INDEXED
                SPREADSHEET_REGIONS_EXTRACTED -> Known.SPREADSHEET_REGIONS_EXTRACTED
                STORED_FILE_COUNT -> Known.STORED_FILE_COUNT
                STORED_FILE_MB -> Known.STORED_FILE_MB
                else -> throw LlamaCloudAdminInvalidDataException("Unknown EventType: $value")
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
        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageMetricAggregateParams &&
            dayOnOrAfter == other.dayOnOrAfter &&
            dayOnOrBefore == other.dayOnOrBefore &&
            groupBy == other.groupBy &&
            eventTypes == other.eventTypes &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            userId == other.userId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            dayOnOrAfter,
            dayOnOrBefore,
            groupBy,
            eventTypes,
            organizationId,
            projectId,
            userId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "UsageMetricAggregateParams{dayOnOrAfter=$dayOnOrAfter, dayOnOrBefore=$dayOnOrBefore, groupBy=$groupBy, eventTypes=$eventTypes, organizationId=$organizationId, projectId=$projectId, userId=$userId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
