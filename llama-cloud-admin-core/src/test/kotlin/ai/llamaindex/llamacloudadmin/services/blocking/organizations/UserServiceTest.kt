// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking.organizations

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClient
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAddParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAddToProjectParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAssignRoleParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserDeleteParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserListProjectsParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserListRolesParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserRemoveFromProjectParams
import kotlin.jvm.optionals.getOrNull
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.organizations().users()

        val organizationMembers = userService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        organizationMembers.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.organizations().users()

        userService.delete(
            UserDeleteParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .memberUserId("member_user_id")
                .addBody("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.organizations().users()

        val organizationMembers =
            userService.add(
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

        organizationMembers.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun addToProject() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.organizations().users()

        val response =
            userService.addToProject(
                UserAddToProjectParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("user_id")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun assignRole() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.organizations().users()

        val userOrganizationRole =
            userService.assignRole(
                UserAssignRoleParams.builder()
                    .pathOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .bodyOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("user_id")
                    .build()
            )

        userOrganizationRole.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listProjects() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.organizations().users()

        val response =
            userService.listProjects(
                UserListProjectsParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("user_id")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRoles() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.organizations().users()

        val userOrganizationRole =
            userService.listRoles(
                UserListRolesParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val unwrappedUserOrganizationRole = userOrganizationRole.getOrNull()
        unwrappedUserOrganizationRole?.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun removeFromProject() {
        val client = LlamaCloudAdminOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.organizations().users()

        val response =
            userService.removeFromProject(
                UserRemoveFromProjectParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("user_id")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
