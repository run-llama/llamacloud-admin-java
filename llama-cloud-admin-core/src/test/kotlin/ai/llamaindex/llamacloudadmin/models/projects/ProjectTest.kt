// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.projects

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectTest {

    @Test
    fun create() {
        val project =
            Project.builder()
                .id("id")
                .name("name")
                .organizationId("organization_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isDefault(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(project.id()).isEqualTo("id")
        assertThat(project.name()).isEqualTo("name")
        assertThat(project.organizationId()).isEqualTo("organization_id")
        assertThat(project.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(project.isDefault()).contains(true)
        assertThat(project.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val project =
            Project.builder()
                .id("id")
                .name("name")
                .organizationId("organization_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isDefault(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedProject =
            jsonMapper.readValue(jsonMapper.writeValueAsString(project), jacksonTypeRef<Project>())

        assertThat(roundtrippedProject).isEqualTo(project)
    }
}
