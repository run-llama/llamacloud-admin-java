// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin

import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdminGetFilestoresInfoResponseTest {

    @Test
    fun create() {
        val adminGetFilestoresInfoResponse =
            AdminGetFilestoresInfoResponse.builder()
                .status(AdminGetFilestoresInfoResponse.Status.MISSING_BUCKETS)
                .availableBuckets(
                    AdminGetFilestoresInfoResponse.AvailableBuckets.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .unavailableBuckets(
                    AdminGetFilestoresInfoResponse.UnavailableBuckets.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(adminGetFilestoresInfoResponse.status())
            .isEqualTo(AdminGetFilestoresInfoResponse.Status.MISSING_BUCKETS)
        assertThat(adminGetFilestoresInfoResponse.availableBuckets())
            .contains(
                AdminGetFilestoresInfoResponse.AvailableBuckets.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(adminGetFilestoresInfoResponse.unavailableBuckets())
            .contains(
                AdminGetFilestoresInfoResponse.UnavailableBuckets.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val adminGetFilestoresInfoResponse =
            AdminGetFilestoresInfoResponse.builder()
                .status(AdminGetFilestoresInfoResponse.Status.MISSING_BUCKETS)
                .availableBuckets(
                    AdminGetFilestoresInfoResponse.AvailableBuckets.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .unavailableBuckets(
                    AdminGetFilestoresInfoResponse.UnavailableBuckets.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedAdminGetFilestoresInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adminGetFilestoresInfoResponse),
                jacksonTypeRef<AdminGetFilestoresInfoResponse>(),
            )

        assertThat(roundtrippedAdminGetFilestoresInfoResponse)
            .isEqualTo(adminGetFilestoresInfoResponse)
    }
}
