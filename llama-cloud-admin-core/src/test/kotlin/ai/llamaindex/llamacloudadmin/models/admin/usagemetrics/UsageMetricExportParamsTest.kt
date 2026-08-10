// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin.usagemetrics

import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageMetricExportParamsTest {

    @Test
    fun create() {
        UsageMetricExportParams.builder()
            .dayOnOrAfter("day_on_or_after")
            .dayOnOrBefore("day_on_or_before")
            .addEventType(UsageMetricExportParams.EventType.AUDIO_SECONDS_PARSED)
            .addEventType(UsageMetricExportParams.EventType.CHART_PARSING_AGENTIC)
            .organizationId("organization_id")
            .projectId("project_id")
            .userId("user_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            UsageMetricExportParams.builder()
                .dayOnOrAfter("day_on_or_after")
                .dayOnOrBefore("day_on_or_before")
                .addEventType(UsageMetricExportParams.EventType.AUDIO_SECONDS_PARSED)
                .addEventType(UsageMetricExportParams.EventType.CHART_PARSING_AGENTIC)
                .organizationId("organization_id")
                .projectId("project_id")
                .userId("user_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("day_on_or_after", "day_on_or_after")
                    .put("day_on_or_before", "day_on_or_before")
                    .put("event_types", "audio_seconds_parsed")
                    .put("event_types", "chart_parsing_agentic")
                    .put("organization_id", "organization_id")
                    .put("project_id", "project_id")
                    .put("user_id", "user_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            UsageMetricExportParams.builder()
                .dayOnOrAfter("day_on_or_after")
                .dayOnOrBefore("day_on_or_before")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("day_on_or_after", "day_on_or_after")
                    .put("day_on_or_before", "day_on_or_before")
                    .build()
            )
    }
}
