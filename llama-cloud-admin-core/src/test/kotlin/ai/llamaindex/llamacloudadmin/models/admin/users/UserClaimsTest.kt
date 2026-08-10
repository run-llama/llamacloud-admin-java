// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin.users

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserClaimsTest {

    @Test
    fun create() {
        val userClaims =
            UserClaims.builder()
                .claims(
                    CustomClaims.builder()
                        .allowOrgDeletion(true)
                        .allowedOrgCreation(true)
                        .apiDatasourceAccess(true)
                        .maximumOrgCreation(0L)
                        .build()
                )
                .userId("user_id")
                .build()

        assertThat(userClaims.claims())
            .isEqualTo(
                CustomClaims.builder()
                    .allowOrgDeletion(true)
                    .allowedOrgCreation(true)
                    .apiDatasourceAccess(true)
                    .maximumOrgCreation(0L)
                    .build()
            )
        assertThat(userClaims.userId()).isEqualTo("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userClaims =
            UserClaims.builder()
                .claims(
                    CustomClaims.builder()
                        .allowOrgDeletion(true)
                        .allowedOrgCreation(true)
                        .apiDatasourceAccess(true)
                        .maximumOrgCreation(0L)
                        .build()
                )
                .userId("user_id")
                .build()

        val roundtrippedUserClaims =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userClaims),
                jacksonTypeRef<UserClaims>(),
            )

        assertThat(roundtrippedUserClaims).isEqualTo(userClaims)
    }
}
