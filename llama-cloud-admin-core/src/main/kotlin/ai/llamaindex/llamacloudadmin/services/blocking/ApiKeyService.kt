// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKey
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKeyCreateParams
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKeyDeleteParams
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKeyListPage
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKeyListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ApiKeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyService

    /**
     * Create a new API key.
     *
     * If project_id is specified, validates the user can read that project.
     *
     * Args: api_key_create: API key creation data user: Current user db: Database session
     *
     * Returns: The created API key with the secret key visible in redacted_api_key field
     */
    fun create(): ApiKey = create(ApiKeyCreateParams.none())

    /** @see create */
    fun create(
        params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKey

    /** @see create */
    fun create(params: ApiKeyCreateParams = ApiKeyCreateParams.none()): ApiKey =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): ApiKey =
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
    fun list(): ApiKeyListPage = list(ApiKeyListParams.none())

    /** @see list */
    fun list(
        params: ApiKeyListParams = ApiKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyListPage

    /** @see list */
    fun list(params: ApiKeyListParams = ApiKeyListParams.none()): ApiKeyListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ApiKeyListPage =
        list(ApiKeyListParams.none(), requestOptions)

    /**
     * Delete an API key.
     *
     * If the API key belongs to a project, validates user has admin permissions for that project.
     * If the API key has no project, validates it belongs to the current user.
     *
     * Args: api_key_id: The ID of the API key to delete user: Current user
     */
    fun delete(apiKeyId: String) = delete(apiKeyId, ApiKeyDeleteParams.none())

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see delete */
    fun delete(apiKeyId: String, params: ApiKeyDeleteParams = ApiKeyDeleteParams.none()) =
        delete(apiKeyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ApiKeyDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ApiKeyDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(apiKeyId: String, requestOptions: RequestOptions) =
        delete(apiKeyId, ApiKeyDeleteParams.none(), requestOptions)

    /** A view of [ApiKeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/api-keys`, but is otherwise the same
         * as [ApiKeyService.create].
         */
        @MustBeClosed fun create(): HttpResponseFor<ApiKey> = create(ApiKeyCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKey>

        /** @see create */
        @MustBeClosed
        fun create(
            params: ApiKeyCreateParams = ApiKeyCreateParams.none()
        ): HttpResponseFor<ApiKey> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ApiKey> =
            create(ApiKeyCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/api-keys`, but is otherwise the same as
         * [ApiKeyService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ApiKeyListPage> = list(ApiKeyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ApiKeyListParams = ApiKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ApiKeyListParams = ApiKeyListParams.none()
        ): HttpResponseFor<ApiKeyListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ApiKeyListPage> =
            list(ApiKeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/api-keys/{api_key_id}`, but is
         * otherwise the same as [ApiKeyService.delete].
         */
        @MustBeClosed
        fun delete(apiKeyId: String): HttpResponse = delete(apiKeyId, ApiKeyDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
        ): HttpResponse = delete(apiKeyId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ApiKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ApiKeyDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(apiKeyId: String, requestOptions: RequestOptions): HttpResponse =
            delete(apiKeyId, ApiKeyDeleteParams.none(), requestOptions)
    }
}
