// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.projects

import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectUpdateParamsTest {

    @Test
    fun create() {
        ProjectUpdateParams.builder()
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProjectUpdateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ProjectUpdateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ProjectUpdateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ProjectUpdateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProjectUpdateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }
}
