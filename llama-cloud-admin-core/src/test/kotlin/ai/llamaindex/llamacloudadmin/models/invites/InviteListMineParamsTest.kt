// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.invites

import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMineParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InviteListMineParamsTest {

    @Test
    fun create() {
      InviteListMineParams.builder()
          .pageSize(0L)
          .pageToken("page_token")
          .build()
    }

    @Test
    fun queryParams() {
      val params = InviteListMineParams.builder()
          .pageSize(0L)
          .pageToken("page_token")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("page_size", "0")
          .put("page_token", "page_token")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = InviteListMineParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
