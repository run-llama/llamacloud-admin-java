// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClient
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementCreateParams
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementDeleteParams
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QuotaManagementServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val quotaManagementService = client.quotaManagement()

        val quotaConfiguration =
            quotaManagementService.create(
                QuotaManagementCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .setting(QuotaManagementCreateParams.Setting.ALLOW_PAY_AS_YOU_GO)
                    .value(0L)
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        quotaConfiguration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val quotaManagementService = client.quotaManagement()

        val quotaManagements =
            quotaManagementService.list(
                QuotaManagementListParams.builder()
                    .sourceId("source_id")
                    .sourceType(QuotaManagementListParams.SourceType.GLOBAL)
                    .configurationType(
                        QuotaManagementListParams.ConfigurationType.ALLOW_PAY_AS_YOU_GO
                    )
                    .excludeSelfService(true)
                    .expand(true)
                    .page(0L)
                    .pageSize(1L)
                    .build()
            )

        quotaManagements.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val quotaManagementService = client.quotaManagement()

        quotaManagementService.delete(
            QuotaManagementDeleteParams.builder()
                .quotaId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
