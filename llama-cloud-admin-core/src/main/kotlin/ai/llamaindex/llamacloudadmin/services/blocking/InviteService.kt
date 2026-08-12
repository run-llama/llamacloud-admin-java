// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.invites.InviteAcceptParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteAcceptResponse
import ai.llamaindex.llamacloudadmin.models.invites.InviteDeclineParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMinePage
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMineParams
import ai.llamaindex.llamacloudadmin.services.blocking.InviteService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface InviteService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InviteService

    /** Accept a pending invitation. Returns the joined organization id. */
    fun accept(inviteId: String): InviteAcceptResponse =
        accept(
          inviteId, InviteAcceptParams.none()
        )

    /** @see accept */
    fun accept(inviteId: String, params: InviteAcceptParams = InviteAcceptParams.none(), requestOptions: RequestOptions = RequestOptions.none()): InviteAcceptResponse =
        accept(
          params.toBuilder()
              .inviteId(inviteId)
              .build(), requestOptions
        )

    /** @see accept */
    fun accept(inviteId: String, params: InviteAcceptParams = InviteAcceptParams.none()): InviteAcceptResponse =
        accept(
          inviteId,
          params,
          RequestOptions.none(),
        )

    /** @see accept */
    fun accept(params: InviteAcceptParams, requestOptions: RequestOptions = RequestOptions.none()): InviteAcceptResponse

    /** @see accept */
    fun accept(params: InviteAcceptParams): InviteAcceptResponse =
        accept(
          params, RequestOptions.none()
        )

    /** @see accept */
    fun accept(inviteId: String, requestOptions: RequestOptions): InviteAcceptResponse =
        accept(
          inviteId,
          InviteAcceptParams.none(),
          requestOptions,
        )

    /** Decline a pending invitation. */
    fun decline(inviteId: String) =
        decline(
          inviteId, InviteDeclineParams.none()
        )

    /** @see decline */
    fun decline(inviteId: String, params: InviteDeclineParams = InviteDeclineParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        decline(
          params.toBuilder()
              .inviteId(inviteId)
              .build(), requestOptions
        )

    /** @see decline */
    fun decline(inviteId: String, params: InviteDeclineParams = InviteDeclineParams.none()) =
        decline(
          inviteId,
          params,
          RequestOptions.none(),
        )

    /** @see decline */
    fun decline(params: InviteDeclineParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see decline */
    fun decline(params: InviteDeclineParams) =
        decline(
          params, RequestOptions.none()
        )

    /** @see decline */
    fun decline(inviteId: String, requestOptions: RequestOptions) =
        decline(
          inviteId,
          InviteDeclineParams.none(),
          requestOptions,
        )

    /** List the current user's pending invitations, cursor-paginated. */
    fun listMine(): InviteListMinePage = listMine(InviteListMineParams.none())

    /** @see listMine */
    fun listMine(params: InviteListMineParams = InviteListMineParams.none(), requestOptions: RequestOptions = RequestOptions.none()): InviteListMinePage

    /** @see listMine */
    fun listMine(params: InviteListMineParams = InviteListMineParams.none()): InviteListMinePage =
        listMine(
          params, RequestOptions.none()
        )

    /** @see listMine */
    fun listMine(requestOptions: RequestOptions): InviteListMinePage =
        listMine(
          InviteListMineParams.none(), requestOptions
        )

    /** A view of [InviteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InviteService.WithRawResponse

        /** Returns a raw HTTP response for `post /api/v2/invites/{invite_id}/accept`, but is otherwise the             same as [InviteService.accept]. */
        @MustBeClosed
        fun accept(inviteId: String): HttpResponseFor<InviteAcceptResponse> =
            accept(
              inviteId, InviteAcceptParams.none()
            )

        /** @see accept */
        @MustBeClosed
        fun accept(inviteId: String, params: InviteAcceptParams = InviteAcceptParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InviteAcceptResponse> =
            accept(
              params.toBuilder()
                  .inviteId(inviteId)
                  .build(), requestOptions
            )

        /** @see accept */
        @MustBeClosed
        fun accept(inviteId: String, params: InviteAcceptParams = InviteAcceptParams.none()): HttpResponseFor<InviteAcceptResponse> =
            accept(
              inviteId,
              params,
              RequestOptions.none(),
            )

        /** @see accept */
        @MustBeClosed
        fun accept(params: InviteAcceptParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InviteAcceptResponse>

        /** @see accept */
        @MustBeClosed
        fun accept(params: InviteAcceptParams): HttpResponseFor<InviteAcceptResponse> =
            accept(
              params, RequestOptions.none()
            )

        /** @see accept */
        @MustBeClosed
        fun accept(inviteId: String, requestOptions: RequestOptions): HttpResponseFor<InviteAcceptResponse> =
            accept(
              inviteId,
              InviteAcceptParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `delete /api/v2/invites/{invite_id}`, but is otherwise the             same as [InviteService.decline]. */
        @MustBeClosed
        fun decline(inviteId: String): HttpResponse =
            decline(
              inviteId, InviteDeclineParams.none()
            )

        /** @see decline */
        @MustBeClosed
        fun decline(inviteId: String, params: InviteDeclineParams = InviteDeclineParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            decline(
              params.toBuilder()
                  .inviteId(inviteId)
                  .build(), requestOptions
            )

        /** @see decline */
        @MustBeClosed
        fun decline(inviteId: String, params: InviteDeclineParams = InviteDeclineParams.none()): HttpResponse =
            decline(
              inviteId,
              params,
              RequestOptions.none(),
            )

        /** @see decline */
        @MustBeClosed
        fun decline(params: InviteDeclineParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see decline */
        @MustBeClosed
        fun decline(params: InviteDeclineParams): HttpResponse =
            decline(
              params, RequestOptions.none()
            )

        /** @see decline */
        @MustBeClosed
        fun decline(inviteId: String, requestOptions: RequestOptions): HttpResponse =
            decline(
              inviteId,
              InviteDeclineParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /api/v2/invites`, but is otherwise the             same as [InviteService.listMine]. */
        @MustBeClosed
        fun listMine(): HttpResponseFor<InviteListMinePage> = listMine(InviteListMineParams.none())

        /** @see listMine */
        @MustBeClosed
        fun listMine(params: InviteListMineParams = InviteListMineParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InviteListMinePage>

        /** @see listMine */
        @MustBeClosed
        fun listMine(params: InviteListMineParams = InviteListMineParams.none()): HttpResponseFor<InviteListMinePage> =
            listMine(
              params, RequestOptions.none()
            )

        /** @see listMine */
        @MustBeClosed
        fun listMine(requestOptions: RequestOptions): HttpResponseFor<InviteListMinePage> =
            listMine(
              InviteListMineParams.none(), requestOptions
            )
    }
}
