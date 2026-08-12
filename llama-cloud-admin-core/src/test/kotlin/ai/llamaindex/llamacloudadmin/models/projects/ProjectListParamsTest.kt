// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.projects

import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectListParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectListParamsTest {

    @Test
    fun create() {
      ProjectListParams.builder()
          .name("name")
          .organizationId("organization_id")
          .pageSize(0L)
          .pageToken("page_token")
          .build()
    }

    @Test
    fun queryParams() {
      val params = ProjectListParams.builder()
          .name("name")
          .organizationId("organization_id")
          .pageSize(0L)
          .pageToken("page_token")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("name", "name")
          .put("organization_id", "organization_id")
          .put("page_size", "0")
          .put("page_token", "page_token")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = ProjectListParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
