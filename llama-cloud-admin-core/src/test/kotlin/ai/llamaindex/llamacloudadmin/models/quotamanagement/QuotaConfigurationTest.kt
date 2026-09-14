// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.quotamanagement

import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuotaConfigurationTest {

    @Test
    fun create() {
        val quotaConfiguration =
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

        assertThat(quotaConfiguration.configurationMetadata())
            .contains(
                QuotaConfiguration.ConfigurationMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(quotaConfiguration.configurationType())
            .isEqualTo(QuotaConfiguration.ConfigurationType.ALLOW_PAY_AS_YOU_GO)
        assertThat(quotaConfiguration.configurationValue())
            .isEqualTo(
                QuotaConfiguration.ConfigurationValue.builder()
                    .numerator(0L)
                    .denominator(0L)
                    .denominatorUnits(QuotaConfiguration.ConfigurationValue.DenominatorUnits.DAY)
                    .build()
            )
        assertThat(quotaConfiguration.sourceId()).isEqualTo("source_id")
        assertThat(quotaConfiguration.sourceType()).isEqualTo(QuotaConfiguration.SourceType.GLOBAL)
        assertThat(quotaConfiguration.status()).isEqualTo(QuotaConfiguration.Status.ACTIVE)
        assertThat(quotaConfiguration.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(quotaConfiguration.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(quotaConfiguration.endedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(quotaConfiguration.idempotencyKey()).contains("idempotency_key")
        assertThat(quotaConfiguration.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(quotaConfiguration.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val quotaConfiguration =
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

        val roundtrippedQuotaConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(quotaConfiguration),
                jacksonTypeRef<QuotaConfiguration>(),
            )

        assertThat(roundtrippedQuotaConfiguration).isEqualTo(quotaConfiguration)
    }
}
