// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations

import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationListPageResponseTest {

    @Test
    fun create() {
        val organizationListPageResponse =
            OrganizationListPageResponse.builder()
                .addItem(
                    Organization.builder()
                        .id("id")
                        .name("name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            Organization.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(organizationListPageResponse.items())
            .containsExactly(
                Organization.builder()
                    .id("id")
                    .name("name")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        Organization.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(organizationListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(organizationListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationListPageResponse =
            OrganizationListPageResponse.builder()
                .addItem(
                    Organization.builder()
                        .id("id")
                        .name("name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            Organization.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedOrganizationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationListPageResponse),
                jacksonTypeRef<OrganizationListPageResponse>(),
            )

        assertThat(roundtrippedOrganizationListPageResponse).isEqualTo(organizationListPageResponse)
    }
}
