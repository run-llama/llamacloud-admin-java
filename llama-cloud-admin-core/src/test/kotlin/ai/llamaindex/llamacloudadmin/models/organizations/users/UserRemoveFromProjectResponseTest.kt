// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations.users

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRemoveFromProjectResponseTest {

    @Test
    fun create() {
        val userRemoveFromProjectResponse = UserRemoveFromProjectResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userRemoveFromProjectResponse = UserRemoveFromProjectResponse.builder().build()

        val roundtrippedUserRemoveFromProjectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userRemoveFromProjectResponse),
                jacksonTypeRef<UserRemoveFromProjectResponse>(),
            )

        assertThat(roundtrippedUserRemoveFromProjectResponse)
            .isEqualTo(userRemoveFromProjectResponse)
    }
}
