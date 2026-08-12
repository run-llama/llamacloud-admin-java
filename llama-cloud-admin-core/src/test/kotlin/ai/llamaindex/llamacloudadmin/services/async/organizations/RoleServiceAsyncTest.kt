// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async.organizations

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClientAsync
import ai.llamaindex.llamacloudadmin.models.organizations.roles.RoleListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RoleServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val roleServiceAsync = client.organizations().roles()

      val rolesFuture = roleServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

      val roles = rolesFuture.get()
      roles.forEach { it.validate() }
    }
}
