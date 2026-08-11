// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClient
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationCreateParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationGetUsageParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrganizationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val organizationService = client.organizations()

        val organization =
            organizationService.create(OrganizationCreateParams.builder().name("x").build())

        organization.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val organizationService = client.organizations()

        val organization =
            organizationService.update(
                OrganizationUpdateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("x")
                    .build()
            )

        organization.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val organizationService = client.organizations()

        val page = organizationService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val organizationService = client.organizations()

        organizationService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val organizationService = client.organizations()

        val organization = organizationService.get("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        organization.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getUsage() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val organizationService = client.organizations()

        val usageAndPlan =
            organizationService.getUsage(
                OrganizationGetUsageParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .getCurrentInvoiceTotal(true)
                    .build()
            )

        usageAndPlan.validate()
    }
}
