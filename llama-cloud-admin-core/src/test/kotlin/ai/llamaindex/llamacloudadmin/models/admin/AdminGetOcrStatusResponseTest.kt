// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetOcrStatusResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdminGetOcrStatusResponseTest {

    @Test
    fun create() {
      val adminGetOcrStatusResponse = AdminGetOcrStatusResponse.builder()
          .status(AdminGetOcrStatusResponse.Status.DEGRADED)
          .device("device")
          .errorMessage("error_message")
          .gpuAvailable(true)
          .gpuDeviceCount(0L)
          .gpuDeviceName("gpu_device_name")
          .build()

      assertThat(adminGetOcrStatusResponse.status()).isEqualTo(AdminGetOcrStatusResponse.Status.DEGRADED)
      assertThat(adminGetOcrStatusResponse.device()).contains("device")
      assertThat(adminGetOcrStatusResponse.errorMessage()).contains("error_message")
      assertThat(adminGetOcrStatusResponse.gpuAvailable()).contains(true)
      assertThat(adminGetOcrStatusResponse.gpuDeviceCount()).contains(0L)
      assertThat(adminGetOcrStatusResponse.gpuDeviceName()).contains("gpu_device_name")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val adminGetOcrStatusResponse = AdminGetOcrStatusResponse.builder()
          .status(AdminGetOcrStatusResponse.Status.DEGRADED)
          .device("device")
          .errorMessage("error_message")
          .gpuAvailable(true)
          .gpuDeviceCount(0L)
          .gpuDeviceName("gpu_device_name")
          .build()

      val roundtrippedAdminGetOcrStatusResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(adminGetOcrStatusResponse), jacksonTypeRef<AdminGetOcrStatusResponse>())

      assertThat(roundtrippedAdminGetOcrStatusResponse).isEqualTo(adminGetOcrStatusResponse)
    }
}
