// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin

import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.jsonMapper
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLlmsInfoResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdminGetLlmsInfoResponseTest {

    @Test
    fun create() {
      val adminGetLlmsInfoResponse = AdminGetLlmsInfoResponse.builder()
          .llmInfo(AdminGetLlmsInfoResponse.LlmInfo.builder()
              .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to mapOf(
                "internal_model_name" to "internal_model_name",
                "valid" to true,
                "error_message" to "error_message",
                "last_validated" to "2019-12-27T18:11:19.117Z",
              ))))
              .build())
          .build()

      assertThat(adminGetLlmsInfoResponse.llmInfo()).isEqualTo(AdminGetLlmsInfoResponse.LlmInfo.builder()
          .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to mapOf(
            "internal_model_name" to "internal_model_name",
            "valid" to true,
            "error_message" to "error_message",
            "last_validated" to "2019-12-27T18:11:19.117Z",
          ))))
          .build())
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val adminGetLlmsInfoResponse = AdminGetLlmsInfoResponse.builder()
          .llmInfo(AdminGetLlmsInfoResponse.LlmInfo.builder()
              .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to mapOf(
                "internal_model_name" to "internal_model_name",
                "valid" to true,
                "error_message" to "error_message",
                "last_validated" to "2019-12-27T18:11:19.117Z",
              ))))
              .build())
          .build()

      val roundtrippedAdminGetLlmsInfoResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(adminGetLlmsInfoResponse), jacksonTypeRef<AdminGetLlmsInfoResponse>())

      assertThat(roundtrippedAdminGetLlmsInfoResponse).isEqualTo(adminGetLlmsInfoResponse)
    }
}
