// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.models.invites

import ai.llamaindex.llamacloudadmin.models.invites.InviteDeclineParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InviteDeclineParamsTest {

    @Test
    fun create() {
      InviteDeclineParams.builder()
          .inviteId("invite_id")
          .build()
    }

    @Test
    fun pathParams() {
      val params = InviteDeclineParams.builder()
          .inviteId("invite_id")
          .build()

      assertThat(params._pathParam(0)).isEqualTo("invite_id")
      // out-of-bound path param
      assertThat(params._pathParam(1)).isEqualTo("")
    }
}
