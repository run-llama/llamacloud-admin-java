// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin

import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLicenseInfoParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdminGetLicenseInfoParamsTest {

    @Test
    fun create() {
      AdminGetLicenseInfoParams.builder()
          .includeScopes(true)
          .build()
    }

    @Test
    fun queryParams() {
      val params = AdminGetLicenseInfoParams.builder()
          .includeScopes(true)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("include_scopes", "true")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = AdminGetLicenseInfoParams.builder().build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
