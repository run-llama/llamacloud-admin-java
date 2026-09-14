// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.apikeys

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyCreateParamsTest {

    @Test
    fun create() {
        ApiKeyCreateParams.builder()
            .expiresAt(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
            .keyType(ApiKeyCreateParams.KeyType.AGENT)
            .name("name")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            ApiKeyCreateParams.builder()
                .expiresAt(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                .keyType(ApiKeyCreateParams.KeyType.AGENT)
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
        assertThat(body.keyType()).contains(ApiKeyCreateParams.KeyType.AGENT)
        assertThat(body.name()).contains("name")
        assertThat(body.projectId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ApiKeyCreateParams.builder().build()

        val body = params._body()
    }
}
