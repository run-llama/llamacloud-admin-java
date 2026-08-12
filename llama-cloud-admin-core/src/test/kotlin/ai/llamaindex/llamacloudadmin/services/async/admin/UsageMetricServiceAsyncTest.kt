// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async.admin

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClientAsync
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricAggregateParams
import ai.llamaindex.llamacloudadmin.models.admin.usagemetrics.UsageMetricExportParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UsageMetricServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun aggregate() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val usageMetricServiceAsync = client.admin().usageMetrics()

        val responseFuture =
            usageMetricServiceAsync.aggregate(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun export() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val usageMetricServiceAsync = client.admin().usageMetrics()

        val future =
            usageMetricServiceAsync.export(
                UsageMetricExportParams.builder()
                    .dayOnOrAfter("day_on_or_after")
                    .dayOnOrBefore("day_on_or_before")
                    .addEventType(UsageMetricExportParams.EventType.AUDIO_SECONDS_PARSED)
                    .addEventType(UsageMetricExportParams.EventType.CHART_PARSING_AGENTIC)
                    .organizationId("organization_id")
                    .projectId("project_id")
                    .userId("user_id")
                    .build()
            )

        val response = future.get()
    }
}
