// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.admin

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdminGetS3ConfigResponseTest {

    @Test
    fun create() {
        val adminGetS3ConfigResponse =
            AdminGetS3ConfigResponse.builder()
                .buckets(
                    AdminGetS3ConfigResponse.Buckets.builder()
                        .documentBucket("document_bucket")
                        .etlBucket("etl_bucket")
                        .externalComponentsBucket("external_components_bucket")
                        .fileParsingBucket("file_parsing_bucket")
                        .fileScreenshotBucket("file_screenshot_bucket")
                        .llamaCloudParseOutputBucket("llama_cloud_parse_output_bucket")
                        .llamaExtractOutputBucket("llama_extract_output_bucket")
                        .rawFileBucket("raw_file_bucket")
                        .build()
                )
                .byocModeEnabled(true)
                .endpointUrl("endpoint_url")
                .kmsKeyConfigured(true)
                .presignedUrlSignatureVersion(
                    AdminGetS3ConfigResponse.PresignedUrlSignatureVersion.DEFAULT
                )
                .s3ProxyActive(true)
                .s3ProxyEnabledOverride(true)
                .build()

        assertThat(adminGetS3ConfigResponse.buckets())
            .isEqualTo(
                AdminGetS3ConfigResponse.Buckets.builder()
                    .documentBucket("document_bucket")
                    .etlBucket("etl_bucket")
                    .externalComponentsBucket("external_components_bucket")
                    .fileParsingBucket("file_parsing_bucket")
                    .fileScreenshotBucket("file_screenshot_bucket")
                    .llamaCloudParseOutputBucket("llama_cloud_parse_output_bucket")
                    .llamaExtractOutputBucket("llama_extract_output_bucket")
                    .rawFileBucket("raw_file_bucket")
                    .build()
            )
        assertThat(adminGetS3ConfigResponse.byocModeEnabled()).isEqualTo(true)
        assertThat(adminGetS3ConfigResponse.endpointUrl()).contains("endpoint_url")
        assertThat(adminGetS3ConfigResponse.kmsKeyConfigured()).isEqualTo(true)
        assertThat(adminGetS3ConfigResponse.presignedUrlSignatureVersion())
            .isEqualTo(AdminGetS3ConfigResponse.PresignedUrlSignatureVersion.DEFAULT)
        assertThat(adminGetS3ConfigResponse.s3ProxyActive()).isEqualTo(true)
        assertThat(adminGetS3ConfigResponse.s3ProxyEnabledOverride()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val adminGetS3ConfigResponse =
            AdminGetS3ConfigResponse.builder()
                .buckets(
                    AdminGetS3ConfigResponse.Buckets.builder()
                        .documentBucket("document_bucket")
                        .etlBucket("etl_bucket")
                        .externalComponentsBucket("external_components_bucket")
                        .fileParsingBucket("file_parsing_bucket")
                        .fileScreenshotBucket("file_screenshot_bucket")
                        .llamaCloudParseOutputBucket("llama_cloud_parse_output_bucket")
                        .llamaExtractOutputBucket("llama_extract_output_bucket")
                        .rawFileBucket("raw_file_bucket")
                        .build()
                )
                .byocModeEnabled(true)
                .endpointUrl("endpoint_url")
                .kmsKeyConfigured(true)
                .presignedUrlSignatureVersion(
                    AdminGetS3ConfigResponse.PresignedUrlSignatureVersion.DEFAULT
                )
                .s3ProxyActive(true)
                .s3ProxyEnabledOverride(true)
                .build()

        val roundtrippedAdminGetS3ConfigResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adminGetS3ConfigResponse),
                jacksonTypeRef<AdminGetS3ConfigResponse>(),
            )

        assertThat(roundtrippedAdminGetS3ConfigResponse).isEqualTo(adminGetS3ConfigResponse)
    }
}
