// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking.admin

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClient
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricAggregateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UsageMetricServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun aggregate() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val usageMetricService = client.admin().usageMetrics()

        val response =
            usageMetricService.aggregate(
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
            )

        response.validate()
    }
}
