// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations.users

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAddToProjectResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserAddToProjectResponseTest {

    @Test
    fun create() {
      val userAddToProjectResponse = UserAddToProjectResponse.builder().build()
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val userAddToProjectResponse = UserAddToProjectResponse.builder().build()

      val roundtrippedUserAddToProjectResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(userAddToProjectResponse), jacksonTypeRef<UserAddToProjectResponse>())

      assertThat(roundtrippedUserAddToProjectResponse).isEqualTo(userAddToProjectResponse)
    }
}
