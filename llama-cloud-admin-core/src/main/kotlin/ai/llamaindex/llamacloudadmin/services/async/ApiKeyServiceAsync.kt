// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKey
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKeyCreateParams
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKeyDeleteParams
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKeyDeleteResponse
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKeyListPageAsync
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKeyListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ApiKeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyServiceAsync

    /**
     * Create an API key.
     *
     * Scope it to a project with `project_id`, which requires read access to that project; omit it
     * for a key that reaches every project you can read. A project-scoped or agent key cannot
     * create an API key. The response carries the secret in `redacted_api_key`, and only this once.
     */
    fun create(): CompletableFuture<ApiKey> = create(ApiKeyCreateParams.none())

    /** @see create */
    fun create(
        params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKey>

    /** @see create */
    fun create(params: ApiKeyCreateParams = ApiKeyCreateParams.none()): CompletableFuture<ApiKey> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<ApiKey> =
        create(ApiKeyCreateParams.none(), requestOptions)

    /**
     * List API keys.
     *
     * Name a `project_id` to list every key on that project, which its members share; naming one
     * you cannot read is a 404. Omit it to list your own. A project-scoped key sees only its own
     * project either way.
     */
    fun list(): CompletableFuture<ApiKeyListPageAsync> = list(ApiKeyListParams.none())

    /** @see list */
    fun list(
        params: ApiKeyListParams = ApiKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyListPageAsync>

    /** @see list */
    fun list(
        params: ApiKeyListParams = ApiKeyListParams.none()
    ): CompletableFuture<ApiKeyListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ApiKeyListPageAsync> =
        list(ApiKeyListParams.none(), requestOptions)

    /**
     * Revoke an API key.
     *
     * Revoking a project key takes access away from everyone using it, so it needs key-management
     * permission on that project. Your own unscoped keys need only that you own them. A
     * project-scoped key revokes only within its own project, unscoped keys included.
     */
    fun delete(apiKeyId: String): CompletableFuture<ApiKeyDeleteResponse> =
        delete(apiKeyId, ApiKeyDeleteParams.none())

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyDeleteResponse> =
        delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
    ): CompletableFuture<ApiKeyDeleteResponse> = delete(apiKeyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyDeleteResponse>

    /** @see delete */
    fun delete(params: ApiKeyDeleteParams): CompletableFuture<ApiKeyDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        apiKeyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiKeyDeleteResponse> =
        delete(apiKeyId, ApiKeyDeleteParams.none(), requestOptions)

    /**
     * A view of [ApiKeyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApiKeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/api-keys`, but is otherwise the same
         * as [ApiKeyServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<ApiKey>> = create(ApiKeyCreateParams.none())

        /** @see create */
        fun create(
            params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKey>>

        /** @see create */
        fun create(
            params: ApiKeyCreateParams = ApiKeyCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ApiKey>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ApiKey>> =
            create(ApiKeyCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/api-keys`, but is otherwise the same as
         * [ApiKeyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ApiKeyListPageAsync>> =
            list(ApiKeyListParams.none())

        /** @see list */
        fun list(
            params: ApiKeyListParams = ApiKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyListPageAsync>>

        /** @see list */
        fun list(
            params: ApiKeyListParams = ApiKeyListParams.none()
        ): CompletableFuture<HttpResponseFor<ApiKeyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ApiKeyListPageAsync>> =
            list(ApiKeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/api-keys/{api_key_id}`, but is
         * otherwise the same as [ApiKeyServiceAsync.delete].
         */
        fun delete(apiKeyId: String): CompletableFuture<HttpResponseFor<ApiKeyDeleteResponse>> =
            delete(apiKeyId, ApiKeyDeleteParams.none())

        /** @see delete */
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyDeleteResponse>> =
            delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see delete */
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyDeleteResponse>> =
            delete(apiKeyId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ApiKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ApiKeyDeleteParams
        ): CompletableFuture<HttpResponseFor<ApiKeyDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            apiKeyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKeyDeleteResponse>> =
            delete(apiKeyId, ApiKeyDeleteParams.none(), requestOptions)
    }
}
