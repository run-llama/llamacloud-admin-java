// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.projects

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import ai.llamaindex.llamacloudadmin.models.projects.Project
import ai.llamaindex.llamacloudadmin.models.projects.ProjectListPageResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectListPageResponseTest {

    @Test
    fun create() {
      val projectListPageResponse = ProjectListPageResponse.builder()
          .addItem(Project.builder()
              .id("id")
              .name("name")
              .organizationId("organization_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .isDefault(true)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .nextPageToken("next_page_token")
          .totalSize(0L)
          .build()

      assertThat(projectListPageResponse.items()).containsExactly(Project.builder()
          .id("id")
          .name("name")
          .organizationId("organization_id")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .isDefault(true)
          .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())
      assertThat(projectListPageResponse.nextPageToken()).contains("next_page_token")
      assertThat(projectListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val projectListPageResponse = ProjectListPageResponse.builder()
          .addItem(Project.builder()
              .id("id")
              .name("name")
              .organizationId("organization_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .isDefault(true)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .nextPageToken("next_page_token")
          .totalSize(0L)
          .build()

      val roundtrippedProjectListPageResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(projectListPageResponse), jacksonTypeRef<ProjectListPageResponse>())

      assertThat(roundtrippedProjectListPageResponse).isEqualTo(projectListPageResponse)
    }
}
