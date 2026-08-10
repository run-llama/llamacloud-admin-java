// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async.organizations

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.organizations.OrganizationMember
import ai.llamaindex.llamacloudadmin.models.organizations.UserOrganizationRole
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAddParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAddToProjectParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAddToProjectResponse
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserAssignRoleParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserDeleteParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserListMembersParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserListProjectsParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserListProjectsResponse
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserListRolesParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserRemoveFromProjectParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserRemoveFromProjectResponse
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync

    /** Remove users from an organization. */
    fun delete(memberUserId: String, params: UserDeleteParams): CompletableFuture<Void?> =
        delete(memberUserId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        memberUserId: String,
        params: UserDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().memberUserId(memberUserId).build(), requestOptions)

    /** @see delete */
    fun delete(params: UserDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Add a user to an organization. */
    fun add(
        organizationId: String,
        params: UserAddParams,
    ): CompletableFuture<List<OrganizationMember>> =
        add(organizationId, params, RequestOptions.none())

    /** @see add */
    fun add(
        organizationId: String,
        params: UserAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OrganizationMember>> =
        add(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see add */
    fun add(params: UserAddParams): CompletableFuture<List<OrganizationMember>> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: UserAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OrganizationMember>>

    /** Add a user to a project. */
    fun addToProject(
        userId: String,
        params: UserAddToProjectParams,
    ): CompletableFuture<UserAddToProjectResponse> =
        addToProject(userId, params, RequestOptions.none())

    /** @see addToProject */
    fun addToProject(
        userId: String,
        params: UserAddToProjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserAddToProjectResponse> =
        addToProject(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see addToProject */
    fun addToProject(params: UserAddToProjectParams): CompletableFuture<UserAddToProjectResponse> =
        addToProject(params, RequestOptions.none())

    /** @see addToProject */
    fun addToProject(
        params: UserAddToProjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserAddToProjectResponse>

    /** Assign a role to a user in an organization. */
    fun assignRole(
        pathOrganizationId: String,
        params: UserAssignRoleParams,
    ): CompletableFuture<UserOrganizationRole> =
        assignRole(pathOrganizationId, params, RequestOptions.none())

    /** @see assignRole */
    fun assignRole(
        pathOrganizationId: String,
        params: UserAssignRoleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserOrganizationRole> =
        assignRole(
            params.toBuilder().pathOrganizationId(pathOrganizationId).build(),
            requestOptions,
        )

    /** @see assignRole */
    fun assignRole(params: UserAssignRoleParams): CompletableFuture<UserOrganizationRole> =
        assignRole(params, RequestOptions.none())

    /** @see assignRole */
    fun assignRole(
        params: UserAssignRoleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserOrganizationRole>

    /** Get all users in an organization. */
    fun listMembers(organizationId: String): CompletableFuture<List<OrganizationMember>> =
        listMembers(organizationId, UserListMembersParams.none())

    /** @see listMembers */
    fun listMembers(
        organizationId: String,
        params: UserListMembersParams = UserListMembersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OrganizationMember>> =
        listMembers(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see listMembers */
    fun listMembers(
        organizationId: String,
        params: UserListMembersParams = UserListMembersParams.none(),
    ): CompletableFuture<List<OrganizationMember>> =
        listMembers(organizationId, params, RequestOptions.none())

    /** @see listMembers */
    fun listMembers(
        params: UserListMembersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OrganizationMember>>

    /** @see listMembers */
    fun listMembers(params: UserListMembersParams): CompletableFuture<List<OrganizationMember>> =
        listMembers(params, RequestOptions.none())

    /** @see listMembers */
    fun listMembers(
        organizationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<OrganizationMember>> =
        listMembers(organizationId, UserListMembersParams.none(), requestOptions)

    /** List all projects for a user in an organization. */
    fun listProjects(
        userId: String,
        params: UserListProjectsParams,
    ): CompletableFuture<List<UserListProjectsResponse>> =
        listProjects(userId, params, RequestOptions.none())

    /** @see listProjects */
    fun listProjects(
        userId: String,
        params: UserListProjectsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<UserListProjectsResponse>> =
        listProjects(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see listProjects */
    fun listProjects(
        params: UserListProjectsParams
    ): CompletableFuture<List<UserListProjectsResponse>> =
        listProjects(params, RequestOptions.none())

    /** @see listProjects */
    fun listProjects(
        params: UserListProjectsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<UserListProjectsResponse>>

    /** Get the role of a user in an organization. */
    fun listRoles(organizationId: String): CompletableFuture<Optional<UserOrganizationRole>> =
        listRoles(organizationId, UserListRolesParams.none())

    /** @see listRoles */
    fun listRoles(
        organizationId: String,
        params: UserListRolesParams = UserListRolesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Optional<UserOrganizationRole>> =
        listRoles(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see listRoles */
    fun listRoles(
        organizationId: String,
        params: UserListRolesParams = UserListRolesParams.none(),
    ): CompletableFuture<Optional<UserOrganizationRole>> =
        listRoles(organizationId, params, RequestOptions.none())

    /** @see listRoles */
    fun listRoles(
        params: UserListRolesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Optional<UserOrganizationRole>>

    /** @see listRoles */
    fun listRoles(params: UserListRolesParams): CompletableFuture<Optional<UserOrganizationRole>> =
        listRoles(params, RequestOptions.none())

    /** @see listRoles */
    fun listRoles(
        organizationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Optional<UserOrganizationRole>> =
        listRoles(organizationId, UserListRolesParams.none(), requestOptions)

    /** Remove a user from a project. */
    fun removeFromProject(
        projectId: String,
        params: UserRemoveFromProjectParams,
    ): CompletableFuture<UserRemoveFromProjectResponse> =
        removeFromProject(projectId, params, RequestOptions.none())

    /** @see removeFromProject */
    fun removeFromProject(
        projectId: String,
        params: UserRemoveFromProjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserRemoveFromProjectResponse> =
        removeFromProject(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see removeFromProject */
    fun removeFromProject(
        params: UserRemoveFromProjectParams
    ): CompletableFuture<UserRemoveFromProjectResponse> =
        removeFromProject(params, RequestOptions.none())

    /** @see removeFromProject */
    fun removeFromProject(
        params: UserRemoveFromProjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserRemoveFromProjectResponse>

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/organizations/{organization_id}/users/{member_user_id}`, but is otherwise the
         * same as [UserServiceAsync.delete].
         */
        fun delete(
            memberUserId: String,
            params: UserDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(memberUserId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            memberUserId: String,
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().memberUserId(memberUserId).build(), requestOptions)

        /** @see delete */
        fun delete(params: UserDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /api/v1/organizations/{organization_id}/users`, but
         * is otherwise the same as [UserServiceAsync.add].
         */
        fun add(
            organizationId: String,
            params: UserAddParams,
        ): CompletableFuture<HttpResponseFor<List<OrganizationMember>>> =
            add(organizationId, params, RequestOptions.none())

        /** @see add */
        fun add(
            organizationId: String,
            params: UserAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OrganizationMember>>> =
            add(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see add */
        fun add(
            params: UserAddParams
        ): CompletableFuture<HttpResponseFor<List<OrganizationMember>>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: UserAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OrganizationMember>>>

        /**
         * Returns a raw HTTP response for `put
         * /api/v1/organizations/{organization_id}/users/{user_id}/projects`, but is otherwise the
         * same as [UserServiceAsync.addToProject].
         */
        fun addToProject(
            userId: String,
            params: UserAddToProjectParams,
        ): CompletableFuture<HttpResponseFor<UserAddToProjectResponse>> =
            addToProject(userId, params, RequestOptions.none())

        /** @see addToProject */
        fun addToProject(
            userId: String,
            params: UserAddToProjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserAddToProjectResponse>> =
            addToProject(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see addToProject */
        fun addToProject(
            params: UserAddToProjectParams
        ): CompletableFuture<HttpResponseFor<UserAddToProjectResponse>> =
            addToProject(params, RequestOptions.none())

        /** @see addToProject */
        fun addToProject(
            params: UserAddToProjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserAddToProjectResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /api/v1/organizations/{organization_id}/users/roles`, but is otherwise the same as
         * [UserServiceAsync.assignRole].
         */
        fun assignRole(
            pathOrganizationId: String,
            params: UserAssignRoleParams,
        ): CompletableFuture<HttpResponseFor<UserOrganizationRole>> =
            assignRole(pathOrganizationId, params, RequestOptions.none())

        /** @see assignRole */
        fun assignRole(
            pathOrganizationId: String,
            params: UserAssignRoleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserOrganizationRole>> =
            assignRole(
                params.toBuilder().pathOrganizationId(pathOrganizationId).build(),
                requestOptions,
            )

        /** @see assignRole */
        fun assignRole(
            params: UserAssignRoleParams
        ): CompletableFuture<HttpResponseFor<UserOrganizationRole>> =
            assignRole(params, RequestOptions.none())

        /** @see assignRole */
        fun assignRole(
            params: UserAssignRoleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserOrganizationRole>>

        /**
         * Returns a raw HTTP response for `get /api/v1/organizations/{organization_id}/users`, but
         * is otherwise the same as [UserServiceAsync.listMembers].
         */
        fun listMembers(
            organizationId: String
        ): CompletableFuture<HttpResponseFor<List<OrganizationMember>>> =
            listMembers(organizationId, UserListMembersParams.none())

        /** @see listMembers */
        fun listMembers(
            organizationId: String,
            params: UserListMembersParams = UserListMembersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OrganizationMember>>> =
            listMembers(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see listMembers */
        fun listMembers(
            organizationId: String,
            params: UserListMembersParams = UserListMembersParams.none(),
        ): CompletableFuture<HttpResponseFor<List<OrganizationMember>>> =
            listMembers(organizationId, params, RequestOptions.none())

        /** @see listMembers */
        fun listMembers(
            params: UserListMembersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OrganizationMember>>>

        /** @see listMembers */
        fun listMembers(
            params: UserListMembersParams
        ): CompletableFuture<HttpResponseFor<List<OrganizationMember>>> =
            listMembers(params, RequestOptions.none())

        /** @see listMembers */
        fun listMembers(
            organizationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<OrganizationMember>>> =
            listMembers(organizationId, UserListMembersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/organizations/{organization_id}/users/{user_id}/projects`, but is otherwise the
         * same as [UserServiceAsync.listProjects].
         */
        fun listProjects(
            userId: String,
            params: UserListProjectsParams,
        ): CompletableFuture<HttpResponseFor<List<UserListProjectsResponse>>> =
            listProjects(userId, params, RequestOptions.none())

        /** @see listProjects */
        fun listProjects(
            userId: String,
            params: UserListProjectsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<UserListProjectsResponse>>> =
            listProjects(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see listProjects */
        fun listProjects(
            params: UserListProjectsParams
        ): CompletableFuture<HttpResponseFor<List<UserListProjectsResponse>>> =
            listProjects(params, RequestOptions.none())

        /** @see listProjects */
        fun listProjects(
            params: UserListProjectsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<UserListProjectsResponse>>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/organizations/{organization_id}/users/roles`, but is otherwise the same as
         * [UserServiceAsync.listRoles].
         */
        fun listRoles(
            organizationId: String
        ): CompletableFuture<HttpResponseFor<Optional<UserOrganizationRole>>> =
            listRoles(organizationId, UserListRolesParams.none())

        /** @see listRoles */
        fun listRoles(
            organizationId: String,
            params: UserListRolesParams = UserListRolesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Optional<UserOrganizationRole>>> =
            listRoles(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see listRoles */
        fun listRoles(
            organizationId: String,
            params: UserListRolesParams = UserListRolesParams.none(),
        ): CompletableFuture<HttpResponseFor<Optional<UserOrganizationRole>>> =
            listRoles(organizationId, params, RequestOptions.none())

        /** @see listRoles */
        fun listRoles(
            params: UserListRolesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Optional<UserOrganizationRole>>>

        /** @see listRoles */
        fun listRoles(
            params: UserListRolesParams
        ): CompletableFuture<HttpResponseFor<Optional<UserOrganizationRole>>> =
            listRoles(params, RequestOptions.none())

        /** @see listRoles */
        fun listRoles(
            organizationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Optional<UserOrganizationRole>>> =
            listRoles(organizationId, UserListRolesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/organizations/{organization_id}/users/{user_id}/projects/{project_id}`, but is
         * otherwise the same as [UserServiceAsync.removeFromProject].
         */
        fun removeFromProject(
            projectId: String,
            params: UserRemoveFromProjectParams,
        ): CompletableFuture<HttpResponseFor<UserRemoveFromProjectResponse>> =
            removeFromProject(projectId, params, RequestOptions.none())

        /** @see removeFromProject */
        fun removeFromProject(
            projectId: String,
            params: UserRemoveFromProjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserRemoveFromProjectResponse>> =
            removeFromProject(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see removeFromProject */
        fun removeFromProject(
            params: UserRemoveFromProjectParams
        ): CompletableFuture<HttpResponseFor<UserRemoveFromProjectResponse>> =
            removeFromProject(params, RequestOptions.none())

        /** @see removeFromProject */
        fun removeFromProject(
            params: UserRemoveFromProjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserRemoveFromProjectResponse>>
    }
}
