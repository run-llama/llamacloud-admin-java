// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdminGetLlamaextractFeaturesResponseTest {

    @Test
    fun create() {
        val adminGetLlamaextractFeaturesResponse =
            AdminGetLlamaextractFeaturesResponse.builder()
                .addAvailableMode(
                    AdminGetLlamaextractFeaturesResponse.AvailableMode.builder()
                        .mode("mode")
                        .parseMode("parse_mode")
                        .status(AdminGetLlamaextractFeaturesResponse.AvailableMode.Status.AVAILABLE)
                        .addAvailableExtractModel("string")
                        .addAvailableParseModel("string")
                        .addMissingExtractModel("string")
                        .addMissingParseModel("string")
                        .build()
                )
                .schemaGeneration(
                    AdminGetLlamaextractFeaturesResponse.SchemaGeneration.builder()
                        .model("model")
                        .status(
                            AdminGetLlamaextractFeaturesResponse.SchemaGeneration.Status.AVAILABLE
                        )
                        .build()
                )
                .build()

        assertThat(adminGetLlamaextractFeaturesResponse.availableModes())
            .containsExactly(
                AdminGetLlamaextractFeaturesResponse.AvailableMode.builder()
                    .mode("mode")
                    .parseMode("parse_mode")
                    .status(AdminGetLlamaextractFeaturesResponse.AvailableMode.Status.AVAILABLE)
                    .addAvailableExtractModel("string")
                    .addAvailableParseModel("string")
                    .addMissingExtractModel("string")
                    .addMissingParseModel("string")
                    .build()
            )
        assertThat(adminGetLlamaextractFeaturesResponse.schemaGeneration())
            .isEqualTo(
                AdminGetLlamaextractFeaturesResponse.SchemaGeneration.builder()
                    .model("model")
                    .status(AdminGetLlamaextractFeaturesResponse.SchemaGeneration.Status.AVAILABLE)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val adminGetLlamaextractFeaturesResponse =
            AdminGetLlamaextractFeaturesResponse.builder()
                .addAvailableMode(
                    AdminGetLlamaextractFeaturesResponse.AvailableMode.builder()
                        .mode("mode")
                        .parseMode("parse_mode")
                        .status(AdminGetLlamaextractFeaturesResponse.AvailableMode.Status.AVAILABLE)
                        .addAvailableExtractModel("string")
                        .addAvailableParseModel("string")
                        .addMissingExtractModel("string")
                        .addMissingParseModel("string")
                        .build()
                )
                .schemaGeneration(
                    AdminGetLlamaextractFeaturesResponse.SchemaGeneration.builder()
                        .model("model")
                        .status(
                            AdminGetLlamaextractFeaturesResponse.SchemaGeneration.Status.AVAILABLE
                        )
                        .build()
                )
                .build()

        val roundtrippedAdminGetLlamaextractFeaturesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adminGetLlamaextractFeaturesResponse),
                jacksonTypeRef<AdminGetLlamaextractFeaturesResponse>(),
            )

        assertThat(roundtrippedAdminGetLlamaextractFeaturesResponse)
            .isEqualTo(adminGetLlamaextractFeaturesResponse)
    }
}
