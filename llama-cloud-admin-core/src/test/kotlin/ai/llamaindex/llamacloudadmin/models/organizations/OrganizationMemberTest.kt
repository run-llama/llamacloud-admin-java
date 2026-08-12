// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationMember
import ai.llamaindex.llamacloudadmin.models.organizations.Role
import ai.llamaindex.llamacloudadmin.models.organizations.UserOrganizationRole
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationMemberTest {

    @Test
    fun create() {
      val organizationMember = OrganizationMember.builder()
          .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .addRole(UserOrganizationRole.builder()
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
              .build())
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .email("dev@stainless.com")
          .invitedByUserEmail("dev@stainless.com")
          .invitedByUserId("invited_by_user_id")
          .pending(true)
          .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .userId("user_id")
          .build()

      assertThat(organizationMember.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(organizationMember.organizationId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(organizationMember.roles()).containsExactly(UserOrganizationRole.builder()
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
          .build())
      assertThat(organizationMember.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(organizationMember.email()).contains("dev@stainless.com")
      assertThat(organizationMember.invitedByUserEmail()).contains("dev@stainless.com")
      assertThat(organizationMember.invitedByUserId()).contains("invited_by_user_id")
      assertThat(organizationMember.pending()).contains(true)
      assertThat(organizationMember.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(organizationMember.userId()).contains("user_id")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val organizationMember = OrganizationMember.builder()
          .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .addRole(UserOrganizationRole.builder()
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
              .build())
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .email("dev@stainless.com")
          .invitedByUserEmail("dev@stainless.com")
          .invitedByUserId("invited_by_user_id")
          .pending(true)
          .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .userId("user_id")
          .build()

      val roundtrippedOrganizationMember = jsonMapper.readValue(jsonMapper.writeValueAsString(organizationMember), jacksonTypeRef<OrganizationMember>())

      assertThat(roundtrippedOrganizationMember).isEqualTo(organizationMember)
    }
}
