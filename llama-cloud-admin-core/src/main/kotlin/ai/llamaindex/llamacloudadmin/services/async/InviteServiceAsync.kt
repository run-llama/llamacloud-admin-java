// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.invites.InviteAcceptParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteAcceptResponse
import ai.llamaindex.llamacloudadmin.models.invites.InviteDeleteParams
import ai.llamaindex.llamacloudadmin.models.invites.InviteListPageAsync
import ai.llamaindex.llamacloudadmin.models.invites.InviteListParams
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

    /** List the current user's pending invitations, cursor-paginated. */
    fun list(): CompletableFuture<InviteListPageAsync> = list(InviteListParams.none())

    /** @see list */
    fun list(
        params: InviteListParams = InviteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InviteListPageAsync>

    /** @see list */
    fun list(
        params: InviteListParams = InviteListParams.none()
    ): CompletableFuture<InviteListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InviteListPageAsync> =
        list(InviteListParams.none(), requestOptions)

    /** Decline a pending invitation. */
    fun delete(inviteId: String): CompletableFuture<Void?> =
        delete(inviteId, InviteDeleteParams.none())

    /** @see delete */
    fun delete(
        inviteId: String,
        params: InviteDeleteParams = InviteDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().inviteId(inviteId).build(), requestOptions)

    /** @see delete */
    fun delete(
        inviteId: String,
        params: InviteDeleteParams = InviteDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(inviteId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InviteDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: InviteDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(inviteId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(inviteId, InviteDeleteParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /api/v2/invites`, but is otherwise the same as
         * [InviteServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InviteListPageAsync>> =
            list(InviteListParams.none())

        /** @see list */
        fun list(
            params: InviteListParams = InviteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InviteListPageAsync>>

        /** @see list */
        fun list(
            params: InviteListParams = InviteListParams.none()
        ): CompletableFuture<HttpResponseFor<InviteListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InviteListPageAsync>> =
            list(InviteListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/invites/{invite_id}`, but is otherwise
         * the same as [InviteServiceAsync.delete].
         */
        fun delete(inviteId: String): CompletableFuture<HttpResponse> =
            delete(inviteId, InviteDeleteParams.none())

        /** @see delete */
        fun delete(
            inviteId: String,
            params: InviteDeleteParams = InviteDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().inviteId(inviteId).build(), requestOptions)

        /** @see delete */
        fun delete(
            inviteId: String,
            params: InviteDeleteParams = InviteDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(inviteId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: InviteDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: InviteDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            inviteId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(inviteId, InviteDeleteParams.none(), requestOptions)

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
    }
}
