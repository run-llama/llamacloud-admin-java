// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.client

import ai.llamaindex.llamacloudadmin.client.LlamaCloudAdminClient
import ai.llamaindex.llamacloudadmin.client.LlamaCloudAdminClientAsync
import ai.llamaindex.llamacloudadmin.client.LlamaCloudAdminClientAsyncImpl
import ai.llamaindex.llamacloudadmin.client.LlamaCloudAdminClientImpl
import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.getPackageVersion
import ai.llamaindex.llamacloudadmin.services.blocking.AdminService
import ai.llamaindex.llamacloudadmin.services.blocking.AdminServiceImpl
import ai.llamaindex.llamacloudadmin.services.blocking.InviteService
import ai.llamaindex.llamacloudadmin.services.blocking.InviteServiceImpl
import ai.llamaindex.llamacloudadmin.services.blocking.OrganizationService
import ai.llamaindex.llamacloudadmin.services.blocking.OrganizationServiceImpl
import ai.llamaindex.llamacloudadmin.services.blocking.ProjectService
import ai.llamaindex.llamacloudadmin.services.blocking.ProjectServiceImpl
import java.util.function.Consumer

class LlamaCloudAdminClientImpl(
    private val clientOptions: ClientOptions,

) : LlamaCloudAdminClient {

    private val clientOptionsWithUserAgent =

      if (clientOptions.headers.names().contains("User-Agent")) clientOptions

      else clientOptions.toBuilder().putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}").build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: LlamaCloudAdminClientAsync by lazy { LlamaCloudAdminClientAsyncImpl(clientOptions) }

    private val withRawResponse: LlamaCloudAdminClient.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val organizations: OrganizationService by lazy { OrganizationServiceImpl(clientOptionsWithUserAgent) }

    private val projects: ProjectService by lazy { ProjectServiceImpl(clientOptionsWithUserAgent) }

    private val invites: InviteService by lazy { InviteServiceImpl(clientOptionsWithUserAgent) }

    private val admin: AdminService by lazy { AdminServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): LlamaCloudAdminClientAsync = async

    override fun withRawResponse(): LlamaCloudAdminClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlamaCloudAdminClient = LlamaCloudAdminClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun organizations(): OrganizationService = organizations

    override fun projects(): ProjectService = projects

    override fun invites(): InviteService = invites

    override fun admin(): AdminService = admin

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : LlamaCloudAdminClient.WithRawResponse {

        private val organizations: OrganizationService.WithRawResponse by lazy { OrganizationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val projects: ProjectService.WithRawResponse by lazy { ProjectServiceImpl.WithRawResponseImpl(clientOptions) }

        private val invites: InviteService.WithRawResponse by lazy { InviteServiceImpl.WithRawResponseImpl(clientOptions) }

        private val admin: AdminService.WithRawResponse by lazy { AdminServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlamaCloudAdminClient.WithRawResponse = LlamaCloudAdminClientImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun organizations(): OrganizationService.WithRawResponse = organizations

        override fun projects(): ProjectService.WithRawResponse = projects

        override fun invites(): InviteService.WithRawResponse = invites

        override fun admin(): AdminService.WithRawResponse = admin
    }
}
