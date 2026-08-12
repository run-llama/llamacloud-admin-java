// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations.users

import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAssignRoleParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserAssignRoleParamsTest {

    @Test
    fun create() {
      UserAssignRoleParams.builder()
          .pathOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .bodyOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .userId("user_id")
          .build()
    }

    @Test
    fun pathParams() {
      val params = UserAssignRoleParams.builder()
          .pathOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .bodyOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .userId("user_id")
          .build()

      assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
      val params = UserAssignRoleParams.builder()
          .pathOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .bodyOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .userId("user_id")
          .build()

      val body = params._body()

      assertThat(body.bodyOrganizationId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.roleId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.userId()).isEqualTo("user_id")
    }
}
