// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.projects

import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectCreateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectCreateParamsTest {

    @Test
    fun create() {
      ProjectCreateParams.builder()
          .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .name("x")
          .build()
    }

    @Test
    fun queryParams() {
      val params = ProjectCreateParams.builder()
          .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .name("x")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())
    }

    @Test
    fun body() {
      val params = ProjectCreateParams.builder()
          .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .name("x")
          .build()

      val body = params._body()

      assertThat(body.name()).isEqualTo("x")
    }
}
