// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services

import ai.llamaindex.llamacloudadmin.client.LlamaCloudAdminClient
import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClient
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationListParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserListParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: LlamaCloudAdminClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LlamaCloudAdminOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val organizationService = client.organizations()
        stubFor(get(anyUrl()).willReturn(ok("{}")))

        organizationService.list(
            OrganizationListParams.builder()
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            getRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val userService = client.organizations().users()
        stubFor(get(anyUrl()).willReturn(ok("[]")))

        userService.list(
            UserListParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            getRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
