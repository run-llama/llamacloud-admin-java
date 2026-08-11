// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking.organizations

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
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserRemoveFromProjectParams
import ai.llamaindex.llamacloudadmin.models.organizations.users.UserRemoveFromProjectResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService

    /** Remove users from an organization. */
    fun delete(memberUserId: String, params: UserDeleteParams) =
        delete(memberUserId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        memberUserId: String,
        params: UserDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().memberUserId(memberUserId).build(), requestOptions)

    /** @see delete */
    fun delete(params: UserDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: UserDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Add a user to an organization. */
    fun add(organizationId: String, params: UserAddParams): List<OrganizationMember> =
        add(organizationId, params, RequestOptions.none())

    /** @see add */
    fun add(
        organizationId: String,
        params: UserAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OrganizationMember> =
        add(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see add */
    fun add(params: UserAddParams): List<OrganizationMember> = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: UserAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OrganizationMember>

    /** Add a user to a project. */
    fun addToProject(userId: String, params: UserAddToProjectParams): UserAddToProjectResponse =
        addToProject(userId, params, RequestOptions.none())

    /** @see addToProject */
    fun addToProject(
        userId: String,
        params: UserAddToProjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserAddToProjectResponse =
        addToProject(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see addToProject */
    fun addToProject(params: UserAddToProjectParams): UserAddToProjectResponse =
        addToProject(params, RequestOptions.none())

    /** @see addToProject */
    fun addToProject(
        params: UserAddToProjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserAddToProjectResponse

    /** Assign a role to a user in an organization. */
    fun assignRole(pathOrganizationId: String, params: UserAssignRoleParams): UserOrganizationRole =
        assignRole(pathOrganizationId, params, RequestOptions.none())

    /** @see assignRole */
    fun assignRole(
        pathOrganizationId: String,
        params: UserAssignRoleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserOrganizationRole =
        assignRole(
            params.toBuilder().pathOrganizationId(pathOrganizationId).build(),
            requestOptions,
        )

    /** @see assignRole */
    fun assignRole(params: UserAssignRoleParams): UserOrganizationRole =
        assignRole(params, RequestOptions.none())

    /** @see assignRole */
    fun assignRole(
        params: UserAssignRoleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserOrganizationRole

    /** Get all users in an organization. */
    fun listMembers(organizationId: String): List<OrganizationMember> =
        listMembers(organizationId, UserListMembersParams.none())

    /** @see listMembers */
    fun listMembers(
        organizationId: String,
        params: UserListMembersParams = UserListMembersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OrganizationMember> =
        listMembers(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see listMembers */
    fun listMembers(
        organizationId: String,
        params: UserListMembersParams = UserListMembersParams.none(),
    ): List<OrganizationMember> = listMembers(organizationId, params, RequestOptions.none())

    /** @see listMembers */
    fun listMembers(
        params: UserListMembersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OrganizationMember>

    /** @see listMembers */
    fun listMembers(params: UserListMembersParams): List<OrganizationMember> =
        listMembers(params, RequestOptions.none())

    /** @see listMembers */
    fun listMembers(
        organizationId: String,
        requestOptions: RequestOptions,
    ): List<OrganizationMember> =
        listMembers(organizationId, UserListMembersParams.none(), requestOptions)

    /** List all projects for a user in an organization. */
    fun listProjects(
        userId: String,
        params: UserListProjectsParams,
    ): List<UserListProjectsResponse> = listProjects(userId, params, RequestOptions.none())

    /** @see listProjects */
    fun listProjects(
        userId: String,
        params: UserListProjectsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<UserListProjectsResponse> =
        listProjects(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see listProjects */
    fun listProjects(params: UserListProjectsParams): List<UserListProjectsResponse> =
        listProjects(params, RequestOptions.none())

    /** @see listProjects */
    fun listProjects(
        params: UserListProjectsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<UserListProjectsResponse>

    /** Remove a user from a project. */
    fun removeFromProject(
        projectId: String,
        params: UserRemoveFromProjectParams,
    ): UserRemoveFromProjectResponse = removeFromProject(projectId, params, RequestOptions.none())

    /** @see removeFromProject */
    fun removeFromProject(
        projectId: String,
        params: UserRemoveFromProjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRemoveFromProjectResponse =
        removeFromProject(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see removeFromProject */
    fun removeFromProject(params: UserRemoveFromProjectParams): UserRemoveFromProjectResponse =
        removeFromProject(params, RequestOptions.none())

    /** @see removeFromProject */
    fun removeFromProject(
        params: UserRemoveFromProjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRemoveFromProjectResponse

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/organizations/{organization_id}/users/{member_user_id}`, but is otherwise the
         * same as [UserService.delete].
         */
        @MustBeClosed
        fun delete(memberUserId: String, params: UserDeleteParams): HttpResponse =
            delete(memberUserId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            memberUserId: String,
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().memberUserId(memberUserId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: UserDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /api/v1/organizations/{organization_id}/users`, but
         * is otherwise the same as [UserService.add].
         */
        @MustBeClosed
        fun add(
            organizationId: String,
            params: UserAddParams,
        ): HttpResponseFor<List<OrganizationMember>> =
            add(organizationId, params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            organizationId: String,
            params: UserAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OrganizationMember>> =
            add(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        fun add(params: UserAddParams): HttpResponseFor<List<OrganizationMember>> =
            add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: UserAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OrganizationMember>>

        /**
         * Returns a raw HTTP response for `put
         * /api/v1/organizations/{organization_id}/users/{user_id}/projects`, but is otherwise the
         * same as [UserService.addToProject].
         */
        @MustBeClosed
        fun addToProject(
            userId: String,
            params: UserAddToProjectParams,
        ): HttpResponseFor<UserAddToProjectResponse> =
            addToProject(userId, params, RequestOptions.none())

        /** @see addToProject */
        @MustBeClosed
        fun addToProject(
            userId: String,
            params: UserAddToProjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserAddToProjectResponse> =
            addToProject(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see addToProject */
        @MustBeClosed
        fun addToProject(
            params: UserAddToProjectParams
        ): HttpResponseFor<UserAddToProjectResponse> = addToProject(params, RequestOptions.none())

        /** @see addToProject */
        @MustBeClosed
        fun addToProject(
            params: UserAddToProjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserAddToProjectResponse>

        /**
         * Returns a raw HTTP response for `put
         * /api/v1/organizations/{organization_id}/users/roles`, but is otherwise the same as
         * [UserService.assignRole].
         */
        @MustBeClosed
        fun assignRole(
            pathOrganizationId: String,
            params: UserAssignRoleParams,
        ): HttpResponseFor<UserOrganizationRole> =
            assignRole(pathOrganizationId, params, RequestOptions.none())

        /** @see assignRole */
        @MustBeClosed
        fun assignRole(
            pathOrganizationId: String,
            params: UserAssignRoleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserOrganizationRole> =
            assignRole(
                params.toBuilder().pathOrganizationId(pathOrganizationId).build(),
                requestOptions,
            )

        /** @see assignRole */
        @MustBeClosed
        fun assignRole(params: UserAssignRoleParams): HttpResponseFor<UserOrganizationRole> =
            assignRole(params, RequestOptions.none())

        /** @see assignRole */
        @MustBeClosed
        fun assignRole(
            params: UserAssignRoleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserOrganizationRole>

        /**
         * Returns a raw HTTP response for `get /api/v1/organizations/{organization_id}/users`, but
         * is otherwise the same as [UserService.listMembers].
         */
        @MustBeClosed
        fun listMembers(organizationId: String): HttpResponseFor<List<OrganizationMember>> =
            listMembers(organizationId, UserListMembersParams.none())

        /** @see listMembers */
        @MustBeClosed
        fun listMembers(
            organizationId: String,
            params: UserListMembersParams = UserListMembersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OrganizationMember>> =
            listMembers(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see listMembers */
        @MustBeClosed
        fun listMembers(
            organizationId: String,
            params: UserListMembersParams = UserListMembersParams.none(),
        ): HttpResponseFor<List<OrganizationMember>> =
            listMembers(organizationId, params, RequestOptions.none())

        /** @see listMembers */
        @MustBeClosed
        fun listMembers(
            params: UserListMembersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OrganizationMember>>

        /** @see listMembers */
        @MustBeClosed
        fun listMembers(params: UserListMembersParams): HttpResponseFor<List<OrganizationMember>> =
            listMembers(params, RequestOptions.none())

        /** @see listMembers */
        @MustBeClosed
        fun listMembers(
            organizationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<OrganizationMember>> =
            listMembers(organizationId, UserListMembersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/organizations/{organization_id}/users/{user_id}/projects`, but is otherwise the
         * same as [UserService.listProjects].
         */
        @MustBeClosed
        fun listProjects(
            userId: String,
            params: UserListProjectsParams,
        ): HttpResponseFor<List<UserListProjectsResponse>> =
            listProjects(userId, params, RequestOptions.none())

        /** @see listProjects */
        @MustBeClosed
        fun listProjects(
            userId: String,
            params: UserListProjectsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<UserListProjectsResponse>> =
            listProjects(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see listProjects */
        @MustBeClosed
        fun listProjects(
            params: UserListProjectsParams
        ): HttpResponseFor<List<UserListProjectsResponse>> =
            listProjects(params, RequestOptions.none())

        /** @see listProjects */
        @MustBeClosed
        fun listProjects(
            params: UserListProjectsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<UserListProjectsResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/organizations/{organization_id}/users/{user_id}/projects/{project_id}`, but is
         * otherwise the same as [UserService.removeFromProject].
         */
        @MustBeClosed
        fun removeFromProject(
            projectId: String,
            params: UserRemoveFromProjectParams,
        ): HttpResponseFor<UserRemoveFromProjectResponse> =
            removeFromProject(projectId, params, RequestOptions.none())

        /** @see removeFromProject */
        @MustBeClosed
        fun removeFromProject(
            projectId: String,
            params: UserRemoveFromProjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRemoveFromProjectResponse> =
            removeFromProject(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see removeFromProject */
        @MustBeClosed
        fun removeFromProject(
            params: UserRemoveFromProjectParams
        ): HttpResponseFor<UserRemoveFromProjectResponse> =
            removeFromProject(params, RequestOptions.none())

        /** @see removeFromProject */
        @MustBeClosed
        fun removeFromProject(
            params: UserRemoveFromProjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRemoveFromProjectResponse>
    }
}
