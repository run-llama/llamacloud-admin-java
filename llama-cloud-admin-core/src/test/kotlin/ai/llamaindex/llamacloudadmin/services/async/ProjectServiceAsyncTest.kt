// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClientAsync
import ai.llamaindex.llamacloudadmin.models.projects.ProjectCreateParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectDeleteParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectGetParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectGetUsageParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProjectServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val projectServiceAsync = client.projects()

        val projectFuture =
            projectServiceAsync.create(
                ProjectCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("x")
                    .build()
            )

        val project = projectFuture.get()
        project.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val projectServiceAsync = client.projects()

        val projectFuture =
            projectServiceAsync.update(
                ProjectUpdateParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("x")
                    .build()
            )

        val project = projectFuture.get()
        project.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val projectServiceAsync = client.projects()

        val pageFuture = projectServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val projectServiceAsync = client.projects()

        val future =
            projectServiceAsync.delete(
                ProjectDeleteParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val projectServiceAsync = client.projects()

        val projectFuture =
            projectServiceAsync.get(
                ProjectGetParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val project = projectFuture.get()
        project.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getUsage() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val projectServiceAsync = client.projects()

        val responseFuture =
            projectServiceAsync.getUsage(
                ProjectGetUsageParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .getCurrentInvoiceTotal(true)
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
