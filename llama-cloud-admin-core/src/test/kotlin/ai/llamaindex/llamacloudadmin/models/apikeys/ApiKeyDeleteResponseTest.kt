// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.apikeys

import ai.llamaindex.llamacloudadmin.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyDeleteResponseTest {

    @Test
    fun create() {
        val apiKeyDeleteResponse =
            ApiKeyDeleteResponse.builder().cacheTtlSeconds(0L).success(true).build()

        assertThat(apiKeyDeleteResponse.cacheTtlSeconds()).isEqualTo(0L)
        assertThat(apiKeyDeleteResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyDeleteResponse =
            ApiKeyDeleteResponse.builder().cacheTtlSeconds(0L).success(true).build()

        val roundtrippedApiKeyDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyDeleteResponse),
                jacksonTypeRef<ApiKeyDeleteResponse>(),
            )

        assertThat(roundtrippedApiKeyDeleteResponse).isEqualTo(apiKeyDeleteResponse)
    }
}
