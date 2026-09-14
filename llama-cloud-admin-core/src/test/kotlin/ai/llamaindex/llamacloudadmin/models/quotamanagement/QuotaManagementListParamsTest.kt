// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.quotamanagement

import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuotaManagementListParamsTest {

    @Test
    fun create() {
        QuotaManagementListParams.builder()
            .sourceId("source_id")
            .sourceType(QuotaManagementListParams.SourceType.GLOBAL)
            .configurationType(QuotaManagementListParams.ConfigurationType.ALLOW_PAY_AS_YOU_GO)
            .excludeSelfService(true)
            .expand(true)
            .page(0L)
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            QuotaManagementListParams.builder()
                .sourceId("source_id")
                .sourceType(QuotaManagementListParams.SourceType.GLOBAL)
                .configurationType(QuotaManagementListParams.ConfigurationType.ALLOW_PAY_AS_YOU_GO)
                .excludeSelfService(true)
                .expand(true)
                .page(0L)
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("source_id", "source_id")
                    .put("source_type", "GLOBAL")
                    .put("configuration_type", "allow_pay_as_you_go")
                    .put("exclude_self_service", "true")
                    .put("expand", "true")
                    .put("page", "0")
                    .put("page_size", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            QuotaManagementListParams.builder()
                .sourceId("source_id")
                .sourceType(QuotaManagementListParams.SourceType.GLOBAL)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("source_id", "source_id")
                    .put("source_type", "GLOBAL")
                    .build()
            )
    }
}
