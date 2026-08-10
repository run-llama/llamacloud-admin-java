// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.invites.InviteAcceptParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteAcceptResponse
import ai.llamaindex.llamacloudadmin.models.invites.InviteDeleteParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteListPage
import ai.llamaindex.llamacloudadmin.models.invites.InviteListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface InviteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InviteService

    /** List the current user's pending invitations, cursor-paginated. */
    fun list(): InviteListPage = list(InviteListParams.none())

    /** @see list */
    fun list(
        params: InviteListParams = InviteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InviteListPage

    /** @see list */
    fun list(params: InviteListParams = InviteListParams.none()): InviteListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InviteListPage =
        list(InviteListParams.none(), requestOptions)

    /** Decline a pending invitation. */
    fun delete(inviteId: String) = delete(inviteId, InviteDeleteParams.none())

    /** @see delete */
    fun delete(
        inviteId: String,
        params: InviteDeleteParams = InviteDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().inviteId(inviteId).build(), requestOptions)

    /** @see delete */
    fun delete(inviteId: String, params: InviteDeleteParams = InviteDeleteParams.none()) =
        delete(inviteId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: InviteDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: InviteDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(inviteId: String, requestOptions: RequestOptions) =
        delete(inviteId, InviteDeleteParams.none(), requestOptions)

    /** Accept a pending invitation. Returns the joined organization id. */
    fun accept(inviteId: String): InviteAcceptResponse = accept(inviteId, InviteAcceptParams.none())

    /** @see accept */
    fun accept(
        inviteId: String,
        params: InviteAcceptParams = InviteAcceptParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InviteAcceptResponse = accept(params.toBuilder().inviteId(inviteId).build(), requestOptions)

    /** @see accept */
    fun accept(
        inviteId: String,
        params: InviteAcceptParams = InviteAcceptParams.none(),
    ): InviteAcceptResponse = accept(inviteId, params, RequestOptions.none())

    /** @see accept */
    fun accept(
        params: InviteAcceptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InviteAcceptResponse

    /** @see accept */
    fun accept(params: InviteAcceptParams): InviteAcceptResponse =
        accept(params, RequestOptions.none())

    /** @see accept */
    fun accept(inviteId: String, requestOptions: RequestOptions): InviteAcceptResponse =
        accept(inviteId, InviteAcceptParams.none(), requestOptions)

    /** A view of [InviteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InviteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v2/invites`, but is otherwise the same as
         * [InviteService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<InviteListPage> = list(InviteListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InviteListParams = InviteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InviteListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InviteListParams = InviteListParams.none()
        ): HttpResponseFor<InviteListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InviteListPage> =
            list(InviteListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/invites/{invite_id}`, but is otherwise
         * the same as [InviteService.delete].
         */
        @MustBeClosed
        fun delete(inviteId: String): HttpResponse = delete(inviteId, InviteDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            inviteId: String,
            params: InviteDeleteParams = InviteDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().inviteId(inviteId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            inviteId: String,
            params: InviteDeleteParams = InviteDeleteParams.none(),
        ): HttpResponse = delete(inviteId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: InviteDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: InviteDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(inviteId: String, requestOptions: RequestOptions): HttpResponse =
            delete(inviteId, InviteDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/invites/{invite_id}/accept`, but is
         * otherwise the same as [InviteService.accept].
         */
        @MustBeClosed
        fun accept(inviteId: String): HttpResponseFor<InviteAcceptResponse> =
            accept(inviteId, InviteAcceptParams.none())

        /** @see accept */
        @MustBeClosed
        fun accept(
            inviteId: String,
            params: InviteAcceptParams = InviteAcceptParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InviteAcceptResponse> =
            accept(params.toBuilder().inviteId(inviteId).build(), requestOptions)

        /** @see accept */
        @MustBeClosed
        fun accept(
            inviteId: String,
            params: InviteAcceptParams = InviteAcceptParams.none(),
        ): HttpResponseFor<InviteAcceptResponse> = accept(inviteId, params, RequestOptions.none())

        /** @see accept */
        @MustBeClosed
        fun accept(
            params: InviteAcceptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InviteAcceptResponse>

        /** @see accept */
        @MustBeClosed
        fun accept(params: InviteAcceptParams): HttpResponseFor<InviteAcceptResponse> =
            accept(params, RequestOptions.none())

        /** @see accept */
        @MustBeClosed
        fun accept(
            inviteId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InviteAcceptResponse> =
            accept(inviteId, InviteAcceptParams.none(), requestOptions)
    }
}
