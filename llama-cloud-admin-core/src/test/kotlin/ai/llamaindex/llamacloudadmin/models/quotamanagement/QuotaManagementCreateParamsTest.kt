// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.quotamanagement

import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuotaManagementCreateParamsTest {

    @Test
    fun create() {
        QuotaManagementCreateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .setting(QuotaManagementCreateParams.Setting.ALLOW_PAY_AS_YOU_GO)
            .value(0L)
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            QuotaManagementCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .setting(QuotaManagementCreateParams.Setting.ALLOW_PAY_AS_YOU_GO)
                .value(0L)
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            QuotaManagementCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .setting(QuotaManagementCreateParams.Setting.ALLOW_PAY_AS_YOU_GO)
                .value(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun body() {
        val params =
            QuotaManagementCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .setting(QuotaManagementCreateParams.Setting.ALLOW_PAY_AS_YOU_GO)
                .value(0L)
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.setting())
            .isEqualTo(QuotaManagementCreateParams.Setting.ALLOW_PAY_AS_YOU_GO)
        assertThat(body.value()).isEqualTo(0L)
        assertThat(body.projectId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            QuotaManagementCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .setting(QuotaManagementCreateParams.Setting.ALLOW_PAY_AS_YOU_GO)
                .value(0L)
                .build()

        val body = params._body()

        assertThat(body.setting())
            .isEqualTo(QuotaManagementCreateParams.Setting.ALLOW_PAY_AS_YOU_GO)
        assertThat(body.value()).isEqualTo(0L)
    }
}
