// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserGetClaimsParamsTest {

    @Test
    fun create() {
        UserGetClaimsParams.builder().userId("user_id").build()
    }

    @Test
    fun pathParams() {
        val params = UserGetClaimsParams.builder().userId("user_id").build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
