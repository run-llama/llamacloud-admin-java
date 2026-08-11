// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.invites.InviteAcceptParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteAcceptResponse
import ai.llamaindex.llamacloudadmin.models.invites.InviteDeclineParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMinePageAsync
import ai.llamaindex.llamacloudadmin.models.invites.InviteListMineParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InviteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InviteServiceAsync

    /** Accept a pending invitation. Returns the joined organization id. */
    fun accept(inviteId: String): CompletableFuture<InviteAcceptResponse> =
        accept(inviteId, InviteAcceptParams.none())

    /** @see accept */
    fun accept(
        inviteId: String,
        params: InviteAcceptParams = InviteAcceptParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InviteAcceptResponse> =
        accept(params.toBuilder().inviteId(inviteId).build(), requestOptions)

    /** @see accept */
    fun accept(
        inviteId: String,
        params: InviteAcceptParams = InviteAcceptParams.none(),
    ): CompletableFuture<InviteAcceptResponse> = accept(inviteId, params, RequestOptions.none())

    /** @see accept */
    fun accept(
        params: InviteAcceptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InviteAcceptResponse>

    /** @see accept */
    fun accept(params: InviteAcceptParams): CompletableFuture<InviteAcceptResponse> =
        accept(params, RequestOptions.none())

    /** @see accept */
    fun accept(
        inviteId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InviteAcceptResponse> =
        accept(inviteId, InviteAcceptParams.none(), requestOptions)

    /** Decline a pending invitation. */
    fun decline(inviteId: String): CompletableFuture<Void?> =
        decline(inviteId, InviteDeclineParams.none())

    /** @see decline */
    fun decline(
        inviteId: String,
        params: InviteDeclineParams = InviteDeclineParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        decline(params.toBuilder().inviteId(inviteId).build(), requestOptions)

    /** @see decline */
    fun decline(
        inviteId: String,
        params: InviteDeclineParams = InviteDeclineParams.none(),
    ): CompletableFuture<Void?> = decline(inviteId, params, RequestOptions.none())

    /** @see decline */
    fun decline(
        params: InviteDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see decline */
    fun decline(params: InviteDeclineParams): CompletableFuture<Void?> =
        decline(params, RequestOptions.none())

    /** @see decline */
    fun decline(inviteId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        decline(inviteId, InviteDeclineParams.none(), requestOptions)

    /** List the current user's pending invitations, cursor-paginated. */
    fun listMine(): CompletableFuture<InviteListMinePageAsync> =
        listMine(InviteListMineParams.none())

    /** @see listMine */
    fun listMine(
        params: InviteListMineParams = InviteListMineParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InviteListMinePageAsync>

    /** @see listMine */
    fun listMine(
        params: InviteListMineParams = InviteListMineParams.none()
    ): CompletableFuture<InviteListMinePageAsync> = listMine(params, RequestOptions.none())

    /** @see listMine */
    fun listMine(requestOptions: RequestOptions): CompletableFuture<InviteListMinePageAsync> =
        listMine(InviteListMineParams.none(), requestOptions)

    /**
     * A view of [InviteServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InviteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/invites/{invite_id}/accept`, but is
         * otherwise the same as [InviteServiceAsync.accept].
         */
        fun accept(inviteId: String): CompletableFuture<HttpResponseFor<InviteAcceptResponse>> =
            accept(inviteId, InviteAcceptParams.none())

        /** @see accept */
        fun accept(
            inviteId: String,
            params: InviteAcceptParams = InviteAcceptParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InviteAcceptResponse>> =
            accept(params.toBuilder().inviteId(inviteId).build(), requestOptions)

        /** @see accept */
        fun accept(
            inviteId: String,
            params: InviteAcceptParams = InviteAcceptParams.none(),
        ): CompletableFuture<HttpResponseFor<InviteAcceptResponse>> =
            accept(inviteId, params, RequestOptions.none())

        /** @see accept */
        fun accept(
            params: InviteAcceptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InviteAcceptResponse>>

        /** @see accept */
        fun accept(
            params: InviteAcceptParams
        ): CompletableFuture<HttpResponseFor<InviteAcceptResponse>> =
            accept(params, RequestOptions.none())

        /** @see accept */
        fun accept(
            inviteId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InviteAcceptResponse>> =
            accept(inviteId, InviteAcceptParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/invites/{invite_id}`, but is otherwise
         * the same as [InviteServiceAsync.decline].
         */
        fun decline(inviteId: String): CompletableFuture<HttpResponse> =
            decline(inviteId, InviteDeclineParams.none())

        /** @see decline */
        fun decline(
            inviteId: String,
            params: InviteDeclineParams = InviteDeclineParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            decline(params.toBuilder().inviteId(inviteId).build(), requestOptions)

        /** @see decline */
        fun decline(
            inviteId: String,
            params: InviteDeclineParams = InviteDeclineParams.none(),
        ): CompletableFuture<HttpResponse> = decline(inviteId, params, RequestOptions.none())

        /** @see decline */
        fun decline(
            params: InviteDeclineParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see decline */
        fun decline(params: InviteDeclineParams): CompletableFuture<HttpResponse> =
            decline(params, RequestOptions.none())

        /** @see decline */
        fun decline(
            inviteId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            decline(inviteId, InviteDeclineParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/invites`, but is otherwise the same as
         * [InviteServiceAsync.listMine].
         */
        fun listMine(): CompletableFuture<HttpResponseFor<InviteListMinePageAsync>> =
            listMine(InviteListMineParams.none())

        /** @see listMine */
        fun listMine(
            params: InviteListMineParams = InviteListMineParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InviteListMinePageAsync>>

        /** @see listMine */
        fun listMine(
            params: InviteListMineParams = InviteListMineParams.none()
        ): CompletableFuture<HttpResponseFor<InviteListMinePageAsync>> =
            listMine(params, RequestOptions.none())

        /** @see listMine */
        fun listMine(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InviteListMinePageAsync>> =
            listMine(InviteListMineParams.none(), requestOptions)
    }
}
