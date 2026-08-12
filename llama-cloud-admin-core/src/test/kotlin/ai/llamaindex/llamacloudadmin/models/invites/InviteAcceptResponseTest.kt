// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.invites

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import ai.llamaindex.llamacloudadmin.models.invites.InviteAcceptResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InviteAcceptResponseTest {

    @Test
    fun create() {
      val inviteAcceptResponse = InviteAcceptResponse.builder()
          .organizationId("organization_id")
          .build()

      assertThat(inviteAcceptResponse.organizationId()).isEqualTo("organization_id")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val inviteAcceptResponse = InviteAcceptResponse.builder()
          .organizationId("organization_id")
          .build()

      val roundtrippedInviteAcceptResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(inviteAcceptResponse), jacksonTypeRef<InviteAcceptResponse>())

      assertThat(roundtrippedInviteAcceptResponse).isEqualTo(inviteAcceptResponse)
    }
}
