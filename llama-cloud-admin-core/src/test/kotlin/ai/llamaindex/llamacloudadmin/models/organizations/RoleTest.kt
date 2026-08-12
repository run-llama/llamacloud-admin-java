// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import ai.llamaindex.llamacloudadmin.models.organizations.Role
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoleTest {

    @Test
    fun create() {
      val role = Role.builder()
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
          .build()

      assertThat(role.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(role.name()).isEqualTo("x")
      assertThat(role.permissions()).containsExactly(Role.Permission.builder()
          .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .access(true)
          .description("description")
          .name("x")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())
      assertThat(role.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(role.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val role = Role.builder()
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
          .build()

      val roundtrippedRole = jsonMapper.readValue(jsonMapper.writeValueAsString(role), jacksonTypeRef<Role>())

      assertThat(roundtrippedRole).isEqualTo(role)
    }
}
