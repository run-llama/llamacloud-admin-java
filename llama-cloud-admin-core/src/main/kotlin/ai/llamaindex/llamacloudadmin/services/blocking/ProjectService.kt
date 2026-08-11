// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.projects.Project
import ai.llamaindex.llamacloudadmin.models.projects.ProjectCreateParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectDeleteParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectGetParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectListPage
import ai.llamaindex.llamacloudadmin.models.projects.ProjectListParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ProjectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService

    /** Create a new project in the given organization. */
    fun create(params: ProjectCreateParams): Project = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project

    /** Update an existing project. */
    fun update(projectId: String, params: ProjectUpdateParams): Project =
        update(projectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        projectId: String,
        params: ProjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project = update(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see update */
    fun update(params: ProjectUpdateParams): Project = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project

    /** List projects in an organization. Requires `organization_id` or a project-scoped API key. */
    fun list(): ProjectListPage = list(ProjectListParams.none())

    /** @see list */
    fun list(
        params: ProjectListParams = ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectListPage

    /** @see list */
    fun list(params: ProjectListParams = ProjectListParams.none()): ProjectListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ProjectListPage =
        list(ProjectListParams.none(), requestOptions)

    /** Delete a project by ID. */
    fun delete(projectId: String) = delete(projectId, ProjectDeleteParams.none())

    /** @see delete */
    fun delete(
        projectId: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see delete */
    fun delete(projectId: String, params: ProjectDeleteParams = ProjectDeleteParams.none()) =
        delete(projectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ProjectDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ProjectDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(projectId: String, requestOptions: RequestOptions) =
        delete(projectId, ProjectDeleteParams.none(), requestOptions)

    /** Get a project by ID. */
    fun get(projectId: String): Project = get(projectId, ProjectGetParams.none())

    /** @see get */
    fun get(
        projectId: String,
        params: ProjectGetParams = ProjectGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project = get(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see get */
    fun get(projectId: String, params: ProjectGetParams = ProjectGetParams.none()): Project =
        get(projectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ProjectGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project

    /** @see get */
    fun get(params: ProjectGetParams): Project = get(params, RequestOptions.none())

    /** @see get */
    fun get(projectId: String, requestOptions: RequestOptions): Project =
        get(projectId, ProjectGetParams.none(), requestOptions)

    /** A view of [ProjectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/projects`, but is otherwise the same as
         * [ProjectService.create].
         */
        @MustBeClosed
        fun create(params: ProjectCreateParams): HttpResponseFor<Project> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project>

        /**
         * Returns a raw HTTP response for `put /api/v2/projects/{project_id}`, but is otherwise the
         * same as [ProjectService.update].
         */
        @MustBeClosed
        fun update(projectId: String, params: ProjectUpdateParams): HttpResponseFor<Project> =
            update(projectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            projectId: String,
            params: ProjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project> =
            update(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ProjectUpdateParams): HttpResponseFor<Project> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ProjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project>

        /**
         * Returns a raw HTTP response for `get /api/v2/projects`, but is otherwise the same as
         * [ProjectService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ProjectListPage> = list(ProjectListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none()
        ): HttpResponseFor<ProjectListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProjectListPage> =
            list(ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/projects/{project_id}`, but is otherwise
         * the same as [ProjectService.delete].
         */
        @MustBeClosed
        fun delete(projectId: String): HttpResponse = delete(projectId, ProjectDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            projectId: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            projectId: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
        ): HttpResponse = delete(projectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ProjectDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(projectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(projectId, ProjectDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/projects/{project_id}`, but is otherwise the
         * same as [ProjectService.get].
         */
        @MustBeClosed
        fun get(projectId: String): HttpResponseFor<Project> =
            get(projectId, ProjectGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            projectId: String,
            params: ProjectGetParams = ProjectGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project> =
            get(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            projectId: String,
            params: ProjectGetParams = ProjectGetParams.none(),
        ): HttpResponseFor<Project> = get(projectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ProjectGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project>

        /** @see get */
        @MustBeClosed
        fun get(params: ProjectGetParams): HttpResponseFor<Project> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(projectId: String, requestOptions: RequestOptions): HttpResponseFor<Project> =
            get(projectId, ProjectGetParams.none(), requestOptions)
    }
}
