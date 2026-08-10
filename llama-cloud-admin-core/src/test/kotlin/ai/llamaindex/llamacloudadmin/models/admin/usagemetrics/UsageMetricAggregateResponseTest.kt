// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin.usagemetrics

import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageMetricAggregateResponseTest {

    @Test
    fun create() {
        val usageMetricAggregateResponse =
            UsageMetricAggregateResponse.builder()
                .addBucket(
                    UsageMetricAggregateResponse.Bucket.builder()
                        .dimensions(
                            UsageMetricAggregateResponse.Bucket.Dimensions.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .metricCount(0L)
                        .totalCredits(0.0)
                        .totalValue(0L)
                        .build()
                )
                .addGroupBy(UsageMetricAggregateResponse.GroupBy.DAY)
                .build()

        assertThat(usageMetricAggregateResponse.buckets())
            .containsExactly(
                UsageMetricAggregateResponse.Bucket.builder()
                    .dimensions(
                        UsageMetricAggregateResponse.Bucket.Dimensions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .metricCount(0L)
                    .totalCredits(0.0)
                    .totalValue(0L)
                    .build()
            )
        assertThat(usageMetricAggregateResponse.groupBy())
            .containsExactly(UsageMetricAggregateResponse.GroupBy.DAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageMetricAggregateResponse =
            UsageMetricAggregateResponse.builder()
                .addBucket(
                    UsageMetricAggregateResponse.Bucket.builder()
                        .dimensions(
                            UsageMetricAggregateResponse.Bucket.Dimensions.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .metricCount(0L)
                        .totalCredits(0.0)
                        .totalValue(0L)
                        .build()
                )
                .addGroupBy(UsageMetricAggregateResponse.GroupBy.DAY)
                .build()

        val roundtrippedUsageMetricAggregateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageMetricAggregateResponse),
                jacksonTypeRef<UsageMetricAggregateResponse>(),
            )

        assertThat(roundtrippedUsageMetricAggregateResponse).isEqualTo(usageMetricAggregateResponse)
    }
}
