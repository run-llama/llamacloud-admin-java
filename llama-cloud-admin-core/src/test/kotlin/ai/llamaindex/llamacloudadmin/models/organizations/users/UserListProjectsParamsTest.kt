// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserListProjectsParamsTest {

    @Test
    fun create() {
        UserListProjectsParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .userId("user_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UserListProjectsParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("user_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
