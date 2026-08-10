// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.client

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.services.blocking.AdminService
import ai.llamaindex.llamacloudadmin.services.blocking.InviteService
import ai.llamaindex.llamacloudadmin.services.blocking.OrganizationService
import ai.llamaindex.llamacloudadmin.services.blocking.ProjectService
import java.util.function.Consumer

/**
 * A client for interacting with the Llama Cloud Admin REST API synchronously. You can also switch
 * to asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface LlamaCloudAdminClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): LlamaCloudAdminClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlamaCloudAdminClient

    fun organizations(): OrganizationService

    fun projects(): ProjectService

    fun invites(): InviteService

    fun admin(): AdminService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [LlamaCloudAdminClient] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LlamaCloudAdminClient.WithRawResponse

        fun organizations(): OrganizationService.WithRawResponse

        fun projects(): ProjectService.WithRawResponse

        fun invites(): InviteService.WithRawResponse

        fun admin(): AdminService.WithRawResponse
    }
}
