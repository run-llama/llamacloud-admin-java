// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClientAsync
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationCreateParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationDeleteParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationGetParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationGetUsageParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationListParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrganizationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val organizationServiceAsync = client.organizations()

      val organizationFuture = organizationServiceAsync.create(OrganizationCreateParams.builder()
          .name("x")
          .build())

      val organization = organizationFuture.get()
      organization.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val organizationServiceAsync = client.organizations()

      val organizationFuture = organizationServiceAsync.update(OrganizationUpdateParams.builder()
          .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .name("x")
          .build())

      val organization = organizationFuture.get()
      organization.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val organizationServiceAsync = client.organizations()

      val pageFuture = organizationServiceAsync.list()

      val page = pageFuture.get()
      page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val organizationServiceAsync = client.organizations()

      val future = organizationServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

      val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val organizationServiceAsync = client.organizations()

      val organizationFuture = organizationServiceAsync.get("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

      val organization = organizationFuture.get()
      organization.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getUsage() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val organizationServiceAsync = client.organizations()

      val usageAndPlanFuture = organizationServiceAsync.getUsage(OrganizationGetUsageParams.builder()
          .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .getCurrentInvoiceTotal(true)
          .build())

      val usageAndPlan = usageAndPlanFuture.get()
      usageAndPlan.validate()
    }
}
