// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations.users

import ai.llamaindex.llamacloudadmin.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserAddToProjectParamsTest {

    @Test
    fun create() {
        UserAddToProjectParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .userId("user_id")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UserAddToProjectParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("user_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            UserAddToProjectParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("user_id")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            UserAddToProjectParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("user_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
