// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.invites

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InviteListMinePageResponseTest {

    @Test
    fun create() {
        val inviteListMinePageResponse =
            InviteListMinePageResponse.builder()
                .addItem(
                    Invite.builder()
                        .id("id")
                        .organizationId("organization_id")
                        .organizationName("organization_name")
                        .role("role")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(inviteListMinePageResponse.items())
            .containsExactly(
                Invite.builder()
                    .id("id")
                    .organizationId("organization_id")
                    .organizationName("organization_name")
                    .role("role")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(inviteListMinePageResponse.nextPageToken()).contains("next_page_token")
        assertThat(inviteListMinePageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inviteListMinePageResponse =
            InviteListMinePageResponse.builder()
                .addItem(
                    Invite.builder()
                        .id("id")
                        .organizationId("organization_id")
                        .organizationName("organization_name")
                        .role("role")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedInviteListMinePageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inviteListMinePageResponse),
                jacksonTypeRef<InviteListMinePageResponse>(),
            )

        assertThat(roundtrippedInviteListMinePageResponse).isEqualTo(inviteListMinePageResponse)
    }
}
