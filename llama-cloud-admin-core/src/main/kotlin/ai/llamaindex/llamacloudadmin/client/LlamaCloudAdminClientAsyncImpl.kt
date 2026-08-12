// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.client

import ai.llamaindex.llamacloudadmin.client.LlamaCloudAdminClient
import ai.llamaindex.llamacloudadmin.client.LlamaCloudAdminClientAsync
import ai.llamaindex.llamacloudadmin.client.LlamaCloudAdminClientAsyncImpl
import ai.llamaindex.llamacloudadmin.client.LlamaCloudAdminClientImpl
import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.getPackageVersion
import ai.llamaindex.llamacloudadmin.services.async.AdminServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.AdminServiceAsyncImpl
import ai.llamaindex.llamacloudadmin.services.async.InviteServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.InviteServiceAsyncImpl
import ai.llamaindex.llamacloudadmin.services.async.OrganizationServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.OrganizationServiceAsyncImpl
import ai.llamaindex.llamacloudadmin.services.async.ProjectServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.ProjectServiceAsyncImpl
import java.util.function.Consumer

class LlamaCloudAdminClientAsyncImpl(
    private val clientOptions: ClientOptions,

) : LlamaCloudAdminClientAsync {

    private val clientOptionsWithUserAgent =

      if (clientOptions.headers.names().contains("User-Agent")) clientOptions

      else clientOptions.toBuilder().putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}").build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: LlamaCloudAdminClient by lazy { LlamaCloudAdminClientImpl(clientOptions) }

    private val withRawResponse: LlamaCloudAdminClientAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val organizations: OrganizationServiceAsync by lazy { OrganizationServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val projects: ProjectServiceAsync by lazy { ProjectServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val invites: InviteServiceAsync by lazy { InviteServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val admin: AdminServiceAsync by lazy { AdminServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): LlamaCloudAdminClient = sync

    override fun withRawResponse(): LlamaCloudAdminClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlamaCloudAdminClientAsync = LlamaCloudAdminClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun organizations(): OrganizationServiceAsync = organizations

    override fun projects(): ProjectServiceAsync = projects

    override fun invites(): InviteServiceAsync = invites

    override fun admin(): AdminServiceAsync = admin

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : LlamaCloudAdminClientAsync.WithRawResponse {

        private val organizations: OrganizationServiceAsync.WithRawResponse by lazy { OrganizationServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        private val projects: ProjectServiceAsync.WithRawResponse by lazy { ProjectServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        private val invites: InviteServiceAsync.WithRawResponse by lazy { InviteServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        private val admin: AdminServiceAsync.WithRawResponse by lazy { AdminServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlamaCloudAdminClientAsync.WithRawResponse = LlamaCloudAdminClientAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun organizations(): OrganizationServiceAsync.WithRawResponse = organizations

        override fun projects(): ProjectServiceAsync.WithRawResponse = projects

        override fun invites(): InviteServiceAsync.WithRawResponse = invites

        override fun admin(): AdminServiceAsync.WithRawResponse = admin
    }
}
