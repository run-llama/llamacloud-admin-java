// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLicenseInfoResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdminGetLicenseInfoResponseTest {

    @Test
    fun create() {
      val adminGetLicenseInfoResponse = AdminGetLicenseInfoResponse.builder()
          .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .status("status")
          .message("message")
          .addScope("string")
          .build()

      assertThat(adminGetLicenseInfoResponse.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(adminGetLicenseInfoResponse.status()).isEqualTo("status")
      assertThat(adminGetLicenseInfoResponse.message()).contains("message")
      assertThat(adminGetLicenseInfoResponse.scopes().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val adminGetLicenseInfoResponse = AdminGetLicenseInfoResponse.builder()
          .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .status("status")
          .message("message")
          .addScope("string")
          .build()

      val roundtrippedAdminGetLicenseInfoResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(adminGetLicenseInfoResponse), jacksonTypeRef<AdminGetLicenseInfoResponse>())

      assertThat(roundtrippedAdminGetLicenseInfoResponse).isEqualTo(adminGetLicenseInfoResponse)
    }
}
