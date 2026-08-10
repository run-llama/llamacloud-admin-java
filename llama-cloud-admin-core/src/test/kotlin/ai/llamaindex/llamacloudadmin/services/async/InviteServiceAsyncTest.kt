// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InviteServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val inviteServiceAsync = client.invites()

        val pageFuture = inviteServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val inviteServiceAsync = client.invites()

        val future = inviteServiceAsync.delete("invite_id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun accept() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val inviteServiceAsync = client.invites()

        val responseFuture = inviteServiceAsync.accept("invite_id")

        val response = responseFuture.get()
        response.validate()
    }
}
