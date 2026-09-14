// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKey
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKeyCreateParams
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKeyDeleteParams
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
     * Create a new API key.
     *
     * If project_id is specified, validates the user can read that project.
     *
     * Args: api_key_create: API key creation data user: Current user db: Database session
     *
     * Returns: The created API key with the secret key visible in redacted_api_key field
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
     * If project_id is provided, validates user has access to that project. If project_id is not
     * provided, scopes results to the current user.
     *
     * Args: user: Current user page_size: Number of items per page page_token: Token for pagination
     * name: Filter by API key name project_id: Filter by project ID key_type: Filter by key type
     *
     * Returns: Paginated response with API keys
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
     * Delete an API key.
     *
     * If the API key belongs to a project, validates user has admin permissions for that project.
     * If the API key has no project, validates it belongs to the current user.
     *
     * Args: api_key_id: The ID of the API key to delete user: Current user
     */
    fun delete(apiKeyId: String): CompletableFuture<Void?> =
        delete(apiKeyId, ApiKeyDeleteParams.none())

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(apiKeyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ApiKeyDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(apiKeyId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
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
        fun delete(apiKeyId: String): CompletableFuture<HttpResponse> =
            delete(apiKeyId, ApiKeyDeleteParams.none())

        /** @see delete */
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see delete */
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(apiKeyId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ApiKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ApiKeyDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            apiKeyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(apiKeyId, ApiKeyDeleteParams.none(), requestOptions)
    }
}
