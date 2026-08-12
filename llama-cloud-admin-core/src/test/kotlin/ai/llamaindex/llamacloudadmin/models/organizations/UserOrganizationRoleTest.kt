// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import ai.llamaindex.llamacloudadmin.models.organizations.Role
import ai.llamaindex.llamacloudadmin.models.organizations.UserOrganizationRole
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserOrganizationRoleTest {

    @Test
    fun create() {
      val userOrganizationRole = UserOrganizationRole.builder()
          .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .role(Role.builder()
              .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .name("x")
              .addPermission(Role.Permission.builder()
                  .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                  .access(true)
                  .description("description")
                  .name("x")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .build())
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .userId("user_id")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .addProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      assertThat(userOrganizationRole.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(userOrganizationRole.organizationId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(userOrganizationRole.role()).isEqualTo(Role.builder()
          .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .name("x")
          .addPermission(Role.Permission.builder()
              .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .access(true)
              .description("description")
              .name("x")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())
      assertThat(userOrganizationRole.userId()).isEqualTo("user_id")
      assertThat(userOrganizationRole.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(userOrganizationRole.projectIds().getOrNull()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(userOrganizationRole.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val userOrganizationRole = UserOrganizationRole.builder()
          .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .role(Role.builder()
              .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .name("x")
              .addPermission(Role.Permission.builder()
                  .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                  .access(true)
                  .description("description")
                  .name("x")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .build())
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .userId("user_id")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .addProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val roundtrippedUserOrganizationRole = jsonMapper.readValue(jsonMapper.writeValueAsString(userOrganizationRole), jacksonTypeRef<UserOrganizationRole>())

      assertThat(roundtrippedUserOrganizationRole).isEqualTo(userOrganizationRole)
    }
}
