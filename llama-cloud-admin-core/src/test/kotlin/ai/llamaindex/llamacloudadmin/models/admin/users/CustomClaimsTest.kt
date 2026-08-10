// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin.users

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomClaimsTest {

    @Test
    fun create() {
        val customClaims =
            CustomClaims.builder()
                .allowOrgDeletion(true)
                .allowedOrgCreation(true)
                .apiDatasourceAccess(true)
                .maximumOrgCreation(0L)
                .build()

        assertThat(customClaims.allowOrgDeletion()).contains(true)
        assertThat(customClaims.allowedOrgCreation()).contains(true)
        assertThat(customClaims.apiDatasourceAccess()).contains(true)
        assertThat(customClaims.maximumOrgCreation()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customClaims =
            CustomClaims.builder()
                .allowOrgDeletion(true)
                .allowedOrgCreation(true)
                .apiDatasourceAccess(true)
                .maximumOrgCreation(0L)
                .build()

        val roundtrippedCustomClaims =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customClaims),
                jacksonTypeRef<CustomClaims>(),
            )

        assertThat(roundtrippedCustomClaims).isEqualTo(customClaims)
    }
}
