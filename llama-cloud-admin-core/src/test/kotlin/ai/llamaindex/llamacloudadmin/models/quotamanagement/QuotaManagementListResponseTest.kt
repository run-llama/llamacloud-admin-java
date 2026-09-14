// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.quotamanagement

import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuotaManagementListResponseTest {

    @Test
    fun create() {
        val quotaManagementListResponse =
            QuotaManagementListResponse.builder()
                .addItem(
                    QuotaConfiguration.builder()
                        .configurationMetadata(
                            QuotaConfiguration.ConfigurationMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .configurationType(QuotaConfiguration.ConfigurationType.ALLOW_PAY_AS_YOU_GO)
                        .configurationValue(
                            QuotaConfiguration.ConfigurationValue.builder()
                                .numerator(0L)
                                .denominator(0L)
                                .denominatorUnits(
                                    QuotaConfiguration.ConfigurationValue.DenominatorUnits.DAY
                                )
                                .build()
                        )
                        .sourceId("source_id")
                        .sourceType(QuotaConfiguration.SourceType.GLOBAL)
                        .status(QuotaConfiguration.Status.ACTIVE)
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .idempotencyKey("idempotency_key")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .page(0L)
                .pages(0L)
                .size(0L)
                .total(0L)
                .build()

        assertThat(quotaManagementListResponse.items())
            .containsExactly(
                QuotaConfiguration.builder()
                    .configurationMetadata(
                        QuotaConfiguration.ConfigurationMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .configurationType(QuotaConfiguration.ConfigurationType.ALLOW_PAY_AS_YOU_GO)
                    .configurationValue(
                        QuotaConfiguration.ConfigurationValue.builder()
                            .numerator(0L)
                            .denominator(0L)
                            .denominatorUnits(
                                QuotaConfiguration.ConfigurationValue.DenominatorUnits.DAY
                            )
                            .build()
                    )
                    .sourceId("source_id")
                    .sourceType(QuotaConfiguration.SourceType.GLOBAL)
                    .status(QuotaConfiguration.Status.ACTIVE)
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .idempotencyKey("idempotency_key")
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(quotaManagementListResponse.page()).isEqualTo(0L)
        assertThat(quotaManagementListResponse.pages()).isEqualTo(0L)
        assertThat(quotaManagementListResponse.size()).isEqualTo(0L)
        assertThat(quotaManagementListResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val quotaManagementListResponse =
            QuotaManagementListResponse.builder()
                .addItem(
                    QuotaConfiguration.builder()
                        .configurationMetadata(
                            QuotaConfiguration.ConfigurationMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .configurationType(QuotaConfiguration.ConfigurationType.ALLOW_PAY_AS_YOU_GO)
                        .configurationValue(
                            QuotaConfiguration.ConfigurationValue.builder()
                                .numerator(0L)
                                .denominator(0L)
                                .denominatorUnits(
                                    QuotaConfiguration.ConfigurationValue.DenominatorUnits.DAY
                                )
                                .build()
                        )
                        .sourceId("source_id")
                        .sourceType(QuotaConfiguration.SourceType.GLOBAL)
                        .status(QuotaConfiguration.Status.ACTIVE)
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .idempotencyKey("idempotency_key")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .page(0L)
                .pages(0L)
                .size(0L)
                .total(0L)
                .build()

        val roundtrippedQuotaManagementListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(quotaManagementListResponse),
                jacksonTypeRef<QuotaManagementListResponse>(),
            )

        assertThat(roundtrippedQuotaManagementListResponse).isEqualTo(quotaManagementListResponse)
    }
}
