// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClientAsync
import ai.llamaindex.llamacloudadmin.models.invites.InviteAcceptParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteDeclineParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMineParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InviteServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun accept() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val inviteServiceAsync = client.invites()

      val responseFuture = inviteServiceAsync.accept("invite_id")

      val response = responseFuture.get()
      response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun decline() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val inviteServiceAsync = client.invites()

      val future = inviteServiceAsync.decline("invite_id")

      val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listMine() {
      val client = LlamaCloudAdminOkHttpClientAsync.builder()
          .apiKey("My API Key")
          .build()
      val inviteServiceAsync = client.invites()

      val pageFuture = inviteServiceAsync.listMine()

      val page = pageFuture.get()
      page.response().validate()
    }
}
