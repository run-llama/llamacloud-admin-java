// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserAddParamsTest {

    @Test
    fun create() {
        UserAddParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addBody(
                UserAddParams.Body.builder()
                    .addProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .email("dev@stainless.com")
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("user_id")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UserAddParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    UserAddParams.Body.builder()
                        .addProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UserAddParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    UserAddParams.Body.builder()
                        .addProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .email("dev@stainless.com")
                        .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("user_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                UserAddParams.Body.builder()
                    .addProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .email("dev@stainless.com")
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("user_id")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserAddParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    UserAddParams.Body.builder()
                        .addProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                UserAddParams.Body.builder()
                    .addProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
