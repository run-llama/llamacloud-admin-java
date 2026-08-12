// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClientAsync
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetFilestoresInfoParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLicenseInfoParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLlamaextractFeaturesParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLlmsInfoParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetOcrStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AdminServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFilestoresInfo() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val adminServiceAsync = client.admin()

      val responseFuture = adminServiceAsync.getFilestoresInfo()

      val response = responseFuture.get()
      response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLicenseInfo() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val adminServiceAsync = client.admin()

      val responseFuture = adminServiceAsync.getLicenseInfo(AdminGetLicenseInfoParams.builder()
          .includeScopes(true)
          .build())

      val response = responseFuture.get()
      response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLlamaextractFeatures() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val adminServiceAsync = client.admin()

      val responseFuture = adminServiceAsync.getLlamaextractFeatures()

      val response = responseFuture.get()
      response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLlmsInfo() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val adminServiceAsync = client.admin()

      val responseFuture = adminServiceAsync.getLlmsInfo()

      val response = responseFuture.get()
      response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOcrStatus() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val adminServiceAsync = client.admin()

      val responseFuture = adminServiceAsync.getOcrStatus()

      val response = responseFuture.get()
      response.validate()
    }
}
