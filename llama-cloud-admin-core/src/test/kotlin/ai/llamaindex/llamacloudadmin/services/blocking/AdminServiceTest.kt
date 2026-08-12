// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClient
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetFilestoresInfoParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLicenseInfoParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLlamaextractFeaturesParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLlmsInfoParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetOcrStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AdminServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFilestoresInfo() {
      val client = LlamaCloudAdminOkHttpClient.builder()
          .apiKey("My API Key")
          .build()
      val adminService = client.admin()

      val response = adminService.getFilestoresInfo()

      response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLicenseInfo() {
      val client = LlamaCloudAdminOkHttpClient.builder()
          .apiKey("My API Key")
          .build()
      val adminService = client.admin()

      val response = adminService.getLicenseInfo(AdminGetLicenseInfoParams.builder()
          .includeScopes(true)
          .build())

      response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLlamaextractFeatures() {
      val client = LlamaCloudAdminOkHttpClient.builder()
          .apiKey("My API Key")
          .build()
      val adminService = client.admin()

      val response = adminService.getLlamaextractFeatures()

      response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLlmsInfo() {
      val client = LlamaCloudAdminOkHttpClient.builder()
          .apiKey("My API Key")
          .build()
      val adminService = client.admin()

      val response = adminService.getLlmsInfo()

      response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOcrStatus() {
      val client = LlamaCloudAdminOkHttpClient.builder()
          .apiKey("My API Key")
          .build()
      val adminService = client.admin()

      val response = adminService.getOcrStatus()

      response.validate()
    }
}
