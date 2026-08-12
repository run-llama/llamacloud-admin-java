// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async.admin

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.admin.users.UserClaims
import ai.llamaindex.llamacloudadmin.models.admin.users.UserGetClaimsParams
import ai.llamaindex.llamacloudadmin.models.admin.users.UserUpdateClaimsParams
import ai.llamaindex.llamacloudadmin.services.async.admin.UserServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UserServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync

    /**
     * Get a user's resolved custom claims.
     *
     * Claims that have not been explicitly set fall back to their system default. Returns 404 if the user does not exist.
     *
     * Global admin only.
     */
    fun getClaims(userId: String): CompletableFuture<UserClaims> =
        getClaims(
          userId, UserGetClaimsParams.none()
        )

    /** @see getClaims */
    fun getClaims(userId: String, params: UserGetClaimsParams = UserGetClaimsParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<UserClaims> =
        getClaims(
          params.toBuilder()
              .userId(userId)
              .build(), requestOptions
        )

    /** @see getClaims */
    fun getClaims(userId: String, params: UserGetClaimsParams = UserGetClaimsParams.none()): CompletableFuture<UserClaims> =
        getClaims(
          userId,
          params,
          RequestOptions.none(),
        )

    /** @see getClaims */
    fun getClaims(params: UserGetClaimsParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<UserClaims>

    /** @see getClaims */
    fun getClaims(params: UserGetClaimsParams): CompletableFuture<UserClaims> =
        getClaims(
          params, RequestOptions.none()
        )

    /** @see getClaims */
    fun getClaims(userId: String, requestOptions: RequestOptions): CompletableFuture<UserClaims> =
        getClaims(
          userId,
          UserGetClaimsParams.none(),
          requestOptions,
        )

    /**
     * Additively update a user's custom claims.
     *
     * Claims in `set_claims` are added or overwritten; claims named in `remove_claims` are reset to their system default. Claims not referenced by either field are left unchanged, so a single claim can be changed without resending the full set. Returns the user's resolved claims after the update.
     *
     * Returns 404 if the user does not exist.
     *
     * Global admin only.
     */
    fun updateClaims(userId: String): CompletableFuture<UserClaims> =
        updateClaims(
          userId, UserUpdateClaimsParams.none()
        )

    /** @see updateClaims */
    fun updateClaims(userId: String, params: UserUpdateClaimsParams = UserUpdateClaimsParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<UserClaims> =
        updateClaims(
          params.toBuilder()
              .userId(userId)
              .build(), requestOptions
        )

    /** @see updateClaims */
    fun updateClaims(userId: String, params: UserUpdateClaimsParams = UserUpdateClaimsParams.none()): CompletableFuture<UserClaims> =
        updateClaims(
          userId,
          params,
          RequestOptions.none(),
        )

    /** @see updateClaims */
    fun updateClaims(params: UserUpdateClaimsParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<UserClaims>

    /** @see updateClaims */
    fun updateClaims(params: UserUpdateClaimsParams): CompletableFuture<UserClaims> =
        updateClaims(
          params, RequestOptions.none()
        )

    /** @see updateClaims */
    fun updateClaims(userId: String, requestOptions: RequestOptions): CompletableFuture<UserClaims> =
        updateClaims(
          userId,
          UserUpdateClaimsParams.none(),
          requestOptions,
        )

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /api/v1/admin/users/{user_id}/claims`, but is otherwise the             same as [UserServiceAsync.getClaims]. */
        fun getClaims(userId: String): CompletableFuture<HttpResponseFor<UserClaims>> =
            getClaims(
              userId, UserGetClaimsParams.none()
            )

        /** @see getClaims */
        fun getClaims(userId: String, params: UserGetClaimsParams = UserGetClaimsParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<UserClaims>> =
            getClaims(
              params.toBuilder()
                  .userId(userId)
                  .build(), requestOptions
            )

        /** @see getClaims */
        fun getClaims(userId: String, params: UserGetClaimsParams = UserGetClaimsParams.none()): CompletableFuture<HttpResponseFor<UserClaims>> =
            getClaims(
              userId,
              params,
              RequestOptions.none(),
            )

        /** @see getClaims */
        fun getClaims(params: UserGetClaimsParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<UserClaims>>

        /** @see getClaims */
        fun getClaims(params: UserGetClaimsParams): CompletableFuture<HttpResponseFor<UserClaims>> =
            getClaims(
              params, RequestOptions.none()
            )

        /** @see getClaims */
        fun getClaims(userId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<UserClaims>> =
            getClaims(
              userId,
              UserGetClaimsParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `patch /api/v1/admin/users/{user_id}/claims`, but is otherwise the             same as [UserServiceAsync.updateClaims]. */
        fun updateClaims(userId: String): CompletableFuture<HttpResponseFor<UserClaims>> =
            updateClaims(
              userId, UserUpdateClaimsParams.none()
            )

        /** @see updateClaims */
        fun updateClaims(userId: String, params: UserUpdateClaimsParams = UserUpdateClaimsParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<UserClaims>> =
            updateClaims(
              params.toBuilder()
                  .userId(userId)
                  .build(), requestOptions
            )

        /** @see updateClaims */
        fun updateClaims(userId: String, params: UserUpdateClaimsParams = UserUpdateClaimsParams.none()): CompletableFuture<HttpResponseFor<UserClaims>> =
            updateClaims(
              userId,
              params,
              RequestOptions.none(),
            )

        /** @see updateClaims */
        fun updateClaims(params: UserUpdateClaimsParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<UserClaims>>

        /** @see updateClaims */
        fun updateClaims(params: UserUpdateClaimsParams): CompletableFuture<HttpResponseFor<UserClaims>> =
            updateClaims(
              params, RequestOptions.none()
            )

        /** @see updateClaims */
        fun updateClaims(userId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<UserClaims>> =
            updateClaims(
              userId,
              UserUpdateClaimsParams.none(),
              requestOptions,
            )
    }
}
