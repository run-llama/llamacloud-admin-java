// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.organizations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationUpdateParamsTest {

    @Test
    fun create() {
        OrganizationUpdateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            OrganizationUpdateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            OrganizationUpdateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }
}
