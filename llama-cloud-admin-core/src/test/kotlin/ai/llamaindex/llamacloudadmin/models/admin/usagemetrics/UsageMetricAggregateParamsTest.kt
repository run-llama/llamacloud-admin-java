// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin.usagemetrics

import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricAggregateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageMetricAggregateParamsTest {

    @Test
    fun create() {
      UsageMetricAggregateParams.builder()
          .dayOnOrAfter("day_on_or_after")
          .dayOnOrBefore("day_on_or_before")
          .addGroupBy("string")
          .addEventType(UsageMetricAggregateParams.EventType.AUDIO_SECONDS_PARSED)
          .addEventType(UsageMetricAggregateParams.EventType.CHART_PARSING_AGENTIC)
          .organizationId("organization_id")
          .projectId("project_id")
          .userId("user_id")
          .build()
    }

    @Test
    fun queryParams() {
      val params = UsageMetricAggregateParams.builder()
          .dayOnOrAfter("day_on_or_after")
          .dayOnOrBefore("day_on_or_before")
          .addGroupBy("string")
          .addEventType(UsageMetricAggregateParams.EventType.AUDIO_SECONDS_PARSED)
          .addEventType(UsageMetricAggregateParams.EventType.CHART_PARSING_AGENTIC)
          .organizationId("organization_id")
          .projectId("project_id")
          .userId("user_id")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("day_on_or_after", "day_on_or_after")
          .put("day_on_or_before", "day_on_or_before")
          .put("group_by", "string")
          .put("event_types", "audio_seconds_parsed")
          .put("event_types", "chart_parsing_agentic")
          .put("organization_id", "organization_id")
          .put("project_id", "project_id")
          .put("user_id", "user_id")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = UsageMetricAggregateParams.builder()
          .dayOnOrAfter("day_on_or_after")
          .dayOnOrBefore("day_on_or_before")
          .addGroupBy("string")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("day_on_or_after", "day_on_or_after")
          .put("day_on_or_before", "day_on_or_before")
          .put("group_by", "string")
          .build())
    }
}
