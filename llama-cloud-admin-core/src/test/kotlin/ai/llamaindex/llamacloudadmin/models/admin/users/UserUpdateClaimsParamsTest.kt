// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin.users

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpdateClaimsParamsTest {

    @Test
    fun create() {
        UserUpdateClaimsParams.builder()
            .userId("user_id")
            .addRemoveClaim(UserUpdateClaimsParams.RemoveClaim.ALLOWED_ORG_CREATION)
            .setClaims(
                UserUpdateClaimsParams.SetClaims.builder()
                    .allowOrgDeletion(true)
                    .allowedOrgCreation(true)
                    .apiDatasourceAccess(true)
                    .maximumOrgCreation(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = UserUpdateClaimsParams.builder().userId("user_id").build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UserUpdateClaimsParams.builder()
                .userId("user_id")
                .addRemoveClaim(UserUpdateClaimsParams.RemoveClaim.ALLOWED_ORG_CREATION)
                .setClaims(
                    UserUpdateClaimsParams.SetClaims.builder()
                        .allowOrgDeletion(true)
                        .allowedOrgCreation(true)
                        .apiDatasourceAccess(true)
                        .maximumOrgCreation(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.removeClaims().getOrNull())
            .containsExactly(UserUpdateClaimsParams.RemoveClaim.ALLOWED_ORG_CREATION)
        assertThat(body.setClaims())
            .contains(
                UserUpdateClaimsParams.SetClaims.builder()
                    .allowOrgDeletion(true)
                    .allowedOrgCreation(true)
                    .apiDatasourceAccess(true)
                    .maximumOrgCreation(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserUpdateClaimsParams.builder().userId("user_id").build()

        val body = params._body()
    }
}
