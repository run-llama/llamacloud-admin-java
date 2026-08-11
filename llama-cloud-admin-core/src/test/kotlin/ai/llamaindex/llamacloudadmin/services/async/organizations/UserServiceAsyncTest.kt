// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async.organizations

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClientAsync
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAddParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAddToProjectParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAssignRoleParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserDeleteParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserListProjectsParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserRemoveFromProjectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.organizations().users()

        val future =
            userServiceAsync.delete(
                UserDeleteParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memberUserId("member_user_id")
                    .addBody("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.organizations().users()

        val organizationMembersFuture =
            userServiceAsync.add(
                UserAddParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addBody(
                        UserAddParams.Body.builder()
                            .addProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .email("dev@stainless.com")
                            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .userId("user_id")
                            .build()
                    )
                    .build()
            )

        val organizationMembers = organizationMembersFuture.get()
        organizationMembers.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun addToProject() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.organizations().users()

        val responseFuture =
            userServiceAsync.addToProject(
                UserAddToProjectParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("user_id")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun assignRole() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.organizations().users()

        val userOrganizationRoleFuture =
            userServiceAsync.assignRole(
                UserAssignRoleParams.builder()
                    .pathOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .bodyOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("user_id")
                    .build()
            )

        val userOrganizationRole = userOrganizationRoleFuture.get()
        userOrganizationRole.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listMembers() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.organizations().users()

        val organizationMembersFuture =
            userServiceAsync.listMembers("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val organizationMembers = organizationMembersFuture.get()
        organizationMembers.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listProjects() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.organizations().users()

        val responseFuture =
            userServiceAsync.listProjects(
                UserListProjectsParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("user_id")
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun removeFromProject() {
        val client = LlamaCloudAdminOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.organizations().users()

        val responseFuture =
            userServiceAsync.removeFromProject(
                UserRemoveFromProjectParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("user_id")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
