// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.invites

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import ai.llamaindex.llamacloudadmin.models.invites.Invite
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InviteTest {

    @Test
    fun create() {
      val invite = Invite.builder()
          .id("id")
          .organizationId("organization_id")
          .organizationName("organization_name")
          .role("role")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      assertThat(invite.id()).isEqualTo("id")
      assertThat(invite.organizationId()).isEqualTo("organization_id")
      assertThat(invite.organizationName()).isEqualTo("organization_name")
      assertThat(invite.role()).isEqualTo("role")
      assertThat(invite.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(invite.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val invite = Invite.builder()
          .id("id")
          .organizationId("organization_id")
          .organizationName("organization_name")
          .role("role")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val roundtrippedInvite = jsonMapper.readValue(jsonMapper.writeValueAsString(invite), jacksonTypeRef<Invite>())

      assertThat(roundtrippedInvite).isEqualTo(invite)
    }
}
