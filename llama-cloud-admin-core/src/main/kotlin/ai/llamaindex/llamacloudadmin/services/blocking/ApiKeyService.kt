// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKey
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKeyCreateParams
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKeyDeleteParams
import ai.llamaindex.llamacloudadmin.models.apikeys.ApiKeyDeleteResponse
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
     * Create an API key.
     *
     * Scope it to a project with `project_id`, which requires read access to that project; omit it
     * for a key that reaches every project you can read. A project-scoped key cannot escape its own
     * project: it confines an omitted `project_id` to that project and refuses any other. The
     * response carries the secret in `redacted_api_key`, and only this once.
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
     * Name a `project_id` to list every key on that project, which its members share; naming one
     * you cannot read is a 404. Omit it to list your own. A project-scoped key sees only its own
     * project either way.
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
     * Revoke an API key.
     *
     * Revoking a project key takes access away from everyone using it, so it needs key-management
     * permission on that project. Your own unscoped keys need only that you own them. A
     * project-scoped key revokes only within its own project, unscoped keys included.
     */
    fun delete(apiKeyId: String): ApiKeyDeleteResponse = delete(apiKeyId, ApiKeyDeleteParams.none())

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyDeleteResponse = delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
    ): ApiKeyDeleteResponse = delete(apiKeyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyDeleteResponse

    /** @see delete */
    fun delete(params: ApiKeyDeleteParams): ApiKeyDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(apiKeyId: String, requestOptions: RequestOptions): ApiKeyDeleteResponse =
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
        fun delete(apiKeyId: String): HttpResponseFor<ApiKeyDeleteResponse> =
            delete(apiKeyId, ApiKeyDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyDeleteResponse> =
            delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
        ): HttpResponseFor<ApiKeyDeleteResponse> = delete(apiKeyId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ApiKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ApiKeyDeleteParams): HttpResponseFor<ApiKeyDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyDeleteResponse> =
            delete(apiKeyId, ApiKeyDeleteParams.none(), requestOptions)
    }
}
