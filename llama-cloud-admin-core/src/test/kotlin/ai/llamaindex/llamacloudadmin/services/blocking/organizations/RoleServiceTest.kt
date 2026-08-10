// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking.organizations

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RoleServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val roleService = client.organizations().roles()

        val roles = roleService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        roles.forEach { it.validate() }
    }
}
