// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking.admin

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.admin.users.UserClaims
import ai.llamaindex.llamacloudadmin.models.admin.users.UserGetClaimsParams
import ai.llamaindex.llamacloudadmin.models.admin.users.UserUpdateClaimsParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService

    /**
     * Get a user's resolved custom claims.
     *
     * Claims that have not been explicitly set fall back to their system default. Returns 404 if
     * the user does not exist.
     *
     * Global admin only.
     */
    fun getClaims(userId: String): UserClaims = getClaims(userId, UserGetClaimsParams.none())

    /** @see getClaims */
    fun getClaims(
        userId: String,
        params: UserGetClaimsParams = UserGetClaimsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserClaims = getClaims(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see getClaims */
    fun getClaims(
        userId: String,
        params: UserGetClaimsParams = UserGetClaimsParams.none(),
    ): UserClaims = getClaims(userId, params, RequestOptions.none())

    /** @see getClaims */
    fun getClaims(
        params: UserGetClaimsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserClaims

    /** @see getClaims */
    fun getClaims(params: UserGetClaimsParams): UserClaims =
        getClaims(params, RequestOptions.none())

    /** @see getClaims */
    fun getClaims(userId: String, requestOptions: RequestOptions): UserClaims =
        getClaims(userId, UserGetClaimsParams.none(), requestOptions)

    /**
     * Additively update a user's custom claims.
     *
     * Claims in `set_claims` are added or overwritten; claims named in `remove_claims` are reset to
     * their system default. Claims not referenced by either field are left unchanged, so a single
     * claim can be changed without resending the full set. Returns the user's resolved claims after
     * the update.
     *
     * Returns 404 if the user does not exist.
     *
     * Global admin only.
     */
    fun updateClaims(userId: String): UserClaims =
        updateClaims(userId, UserUpdateClaimsParams.none())

    /** @see updateClaims */
    fun updateClaims(
        userId: String,
        params: UserUpdateClaimsParams = UserUpdateClaimsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserClaims = updateClaims(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see updateClaims */
    fun updateClaims(
        userId: String,
        params: UserUpdateClaimsParams = UserUpdateClaimsParams.none(),
    ): UserClaims = updateClaims(userId, params, RequestOptions.none())

    /** @see updateClaims */
    fun updateClaims(
        params: UserUpdateClaimsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserClaims

    /** @see updateClaims */
    fun updateClaims(params: UserUpdateClaimsParams): UserClaims =
        updateClaims(params, RequestOptions.none())

    /** @see updateClaims */
    fun updateClaims(userId: String, requestOptions: RequestOptions): UserClaims =
        updateClaims(userId, UserUpdateClaimsParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/admin/users/{user_id}/claims`, but is
         * otherwise the same as [UserService.getClaims].
         */
        @MustBeClosed
        fun getClaims(userId: String): HttpResponseFor<UserClaims> =
            getClaims(userId, UserGetClaimsParams.none())

        /** @see getClaims */
        @MustBeClosed
        fun getClaims(
            userId: String,
            params: UserGetClaimsParams = UserGetClaimsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserClaims> =
            getClaims(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see getClaims */
        @MustBeClosed
        fun getClaims(
            userId: String,
            params: UserGetClaimsParams = UserGetClaimsParams.none(),
        ): HttpResponseFor<UserClaims> = getClaims(userId, params, RequestOptions.none())

        /** @see getClaims */
        @MustBeClosed
        fun getClaims(
            params: UserGetClaimsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserClaims>

        /** @see getClaims */
        @MustBeClosed
        fun getClaims(params: UserGetClaimsParams): HttpResponseFor<UserClaims> =
            getClaims(params, RequestOptions.none())

        /** @see getClaims */
        @MustBeClosed
        fun getClaims(userId: String, requestOptions: RequestOptions): HttpResponseFor<UserClaims> =
            getClaims(userId, UserGetClaimsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/admin/users/{user_id}/claims`, but is
         * otherwise the same as [UserService.updateClaims].
         */
        @MustBeClosed
        fun updateClaims(userId: String): HttpResponseFor<UserClaims> =
            updateClaims(userId, UserUpdateClaimsParams.none())

        /** @see updateClaims */
        @MustBeClosed
        fun updateClaims(
            userId: String,
            params: UserUpdateClaimsParams = UserUpdateClaimsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserClaims> =
            updateClaims(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see updateClaims */
        @MustBeClosed
        fun updateClaims(
            userId: String,
            params: UserUpdateClaimsParams = UserUpdateClaimsParams.none(),
        ): HttpResponseFor<UserClaims> = updateClaims(userId, params, RequestOptions.none())

        /** @see updateClaims */
        @MustBeClosed
        fun updateClaims(
            params: UserUpdateClaimsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserClaims>

        /** @see updateClaims */
        @MustBeClosed
        fun updateClaims(params: UserUpdateClaimsParams): HttpResponseFor<UserClaims> =
            updateClaims(params, RequestOptions.none())

        /** @see updateClaims */
        @MustBeClosed
        fun updateClaims(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserClaims> =
            updateClaims(userId, UserUpdateClaimsParams.none(), requestOptions)
    }
}
