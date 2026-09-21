// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.apikeys

import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyListPageResponseTest {

    @Test
    fun create() {
        val apiKeyListPageResponse =
            ApiKeyListPageResponse.builder()
                .addItem(
                    ApiKey.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .redactedApiKey("redacted_api_key")
                        .userId("user_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .keyType(ApiKey.KeyType.AGENT)
                        .metadata(
                            ApiKey.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .name("name")
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .role(ApiKey.Role.ADMIN)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(apiKeyListPageResponse.items())
            .containsExactly(
                ApiKey.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .redactedApiKey("redacted_api_key")
                    .userId("user_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .keyType(ApiKey.KeyType.AGENT)
                    .metadata(
                        ApiKey.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .role(ApiKey.Role.ADMIN)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(apiKeyListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(apiKeyListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyListPageResponse =
            ApiKeyListPageResponse.builder()
                .addItem(
                    ApiKey.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .redactedApiKey("redacted_api_key")
                        .userId("user_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .keyType(ApiKey.KeyType.AGENT)
                        .metadata(
                            ApiKey.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .name("name")
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .role(ApiKey.Role.ADMIN)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedApiKeyListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyListPageResponse),
                jacksonTypeRef<ApiKeyListPageResponse>(),
            )

        assertThat(roundtrippedApiKeyListPageResponse).isEqualTo(apiKeyListPageResponse)
    }
}
