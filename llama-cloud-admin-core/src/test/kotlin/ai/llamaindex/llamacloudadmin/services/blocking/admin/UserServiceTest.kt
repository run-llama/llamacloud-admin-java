// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking.admin

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClient
import ai.llamaindex.llamacloudadmin.models.admin.users.UserUpdateClaimsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getClaims() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.admin().users()

        val userClaims = userService.getClaims("user_id")

        userClaims.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateClaims() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.admin().users()

        val userClaims =
            userService.updateClaims(
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
            )

        userClaims.validate()
    }
}
