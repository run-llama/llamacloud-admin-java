// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InviteServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun accept() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val inviteService = client.invites()

        val response = inviteService.accept("invite_id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun decline() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val inviteService = client.invites()

        inviteService.decline("invite_id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listMine() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val inviteService = client.invites()

        val page = inviteService.listMine()

        page.response().validate()
    }
}
