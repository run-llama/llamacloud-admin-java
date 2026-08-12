// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations

import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationCreateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationCreateParamsTest {

    @Test
    fun create() {
      OrganizationCreateParams.builder()
          .name("x")
          .build()
    }

    @Test
    fun body() {
      val params = OrganizationCreateParams.builder()
          .name("x")
          .build()

      val body = params._body()

      assertThat(body.name()).isEqualTo("x")
    }
}
