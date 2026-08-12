// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations

import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationListParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationListParamsTest {

    @Test
    fun create() {
      OrganizationListParams.builder()
          .name("name")
          .pageSize(0L)
          .pageToken("page_token")
          .build()
    }

    @Test
    fun queryParams() {
      val params = OrganizationListParams.builder()
          .name("name")
          .pageSize(0L)
          .pageToken("page_token")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("name", "name")
          .put("page_size", "0")
          .put("page_token", "page_token")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = OrganizationListParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
