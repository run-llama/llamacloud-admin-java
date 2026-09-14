// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClientAsync
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementCreateParams
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementDeleteParams
import ai.llamaindex.llamacloudadmin.models.quotamanagement.QuotaManagementListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QuotaManagementServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val quotaManagementServiceAsync = client.quotaManagement()

        val quotaConfigurationFuture =
            quotaManagementServiceAsync.create(
                QuotaManagementCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .setting(QuotaManagementCreateParams.Setting.ALLOW_PAY_AS_YOU_GO)
                    .value(0L)
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val quotaConfiguration = quotaConfigurationFuture.get()
        quotaConfiguration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val quotaManagementServiceAsync = client.quotaManagement()

        val quotaManagementsFuture =
            quotaManagementServiceAsync.list(
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

        val quotaManagements = quotaManagementsFuture.get()
        quotaManagements.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val quotaManagementServiceAsync = client.quotaManagement()

        val future =
            quotaManagementServiceAsync.delete(
                QuotaManagementDeleteParams.builder()
                    .quotaId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }
}
