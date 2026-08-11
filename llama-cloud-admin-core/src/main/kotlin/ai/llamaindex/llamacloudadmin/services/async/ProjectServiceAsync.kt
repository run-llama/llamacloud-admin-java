// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.projects.Project
import ai.llamaindex.llamacloudadmin.models.projects.ProjectCreateParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectDeleteParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectGetParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectGetUsageParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectGetUsageResponse
import ai.llamaindex.llamacloudadmin.models.projects.ProjectListPageAsync
import ai.llamaindex.llamacloudadmin.models.projects.ProjectListParams
import ai.llamaindex.llamacloudadmin.models.projects.ProjectUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ProjectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectServiceAsync

    /** Create a new project in the given organization. */
    fun create(params: ProjectCreateParams): CompletableFuture<Project> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Project>

    /** Update an existing project. */
    fun update(projectId: String, params: ProjectUpdateParams): CompletableFuture<Project> =
        update(projectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        projectId: String,
        params: ProjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Project> =
        update(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see update */
    fun update(params: ProjectUpdateParams): CompletableFuture<Project> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Project>

    /** List projects in an organization. Requires `organization_id` or a project-scoped API key. */
    fun list(): CompletableFuture<ProjectListPageAsync> = list(ProjectListParams.none())

    /** @see list */
    fun list(
        params: ProjectListParams = ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectListPageAsync>

    /** @see list */
    fun list(
        params: ProjectListParams = ProjectListParams.none()
    ): CompletableFuture<ProjectListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProjectListPageAsync> =
        list(ProjectListParams.none(), requestOptions)

    /** Delete a project by ID. */
    fun delete(projectId: String): CompletableFuture<Void?> =
        delete(projectId, ProjectDeleteParams.none())

    /** @see delete */
    fun delete(
        projectId: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        projectId: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(projectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ProjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ProjectDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(projectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(projectId, ProjectDeleteParams.none(), requestOptions)

    /** Get a project by ID. */
    fun get(projectId: String): CompletableFuture<Project> = get(projectId, ProjectGetParams.none())

    /** @see get */
    fun get(
        projectId: String,
        params: ProjectGetParams = ProjectGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Project> =
        get(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see get */
    fun get(
        projectId: String,
        params: ProjectGetParams = ProjectGetParams.none(),
    ): CompletableFuture<Project> = get(projectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ProjectGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Project>

    /** @see get */
    fun get(params: ProjectGetParams): CompletableFuture<Project> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(projectId: String, requestOptions: RequestOptions): CompletableFuture<Project> =
        get(projectId, ProjectGetParams.none(), requestOptions)

    /** Get usage for a project */
    fun getUsage(projectId: String): CompletableFuture<ProjectGetUsageResponse> =
        getUsage(projectId, ProjectGetUsageParams.none())

    /** @see getUsage */
    fun getUsage(
        projectId: String,
        params: ProjectGetUsageParams = ProjectGetUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectGetUsageResponse> =
        getUsage(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see getUsage */
    fun getUsage(
        projectId: String,
        params: ProjectGetUsageParams = ProjectGetUsageParams.none(),
    ): CompletableFuture<ProjectGetUsageResponse> =
        getUsage(projectId, params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(
        params: ProjectGetUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectGetUsageResponse>

    /** @see getUsage */
    fun getUsage(params: ProjectGetUsageParams): CompletableFuture<ProjectGetUsageResponse> =
        getUsage(params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(
        projectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectGetUsageResponse> =
        getUsage(projectId, ProjectGetUsageParams.none(), requestOptions)

    /**
     * A view of [ProjectServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProjectServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/projects`, but is otherwise the same as
         * [ProjectServiceAsync.create].
         */
        fun create(params: ProjectCreateParams): CompletableFuture<HttpResponseFor<Project>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Project>>

        /**
         * Returns a raw HTTP response for `put /api/v2/projects/{project_id}`, but is otherwise the
         * same as [ProjectServiceAsync.update].
         */
        fun update(
            projectId: String,
            params: ProjectUpdateParams,
        ): CompletableFuture<HttpResponseFor<Project>> =
            update(projectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            projectId: String,
            params: ProjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Project>> =
            update(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see update */
        fun update(params: ProjectUpdateParams): CompletableFuture<HttpResponseFor<Project>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ProjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Project>>

        /**
         * Returns a raw HTTP response for `get /api/v2/projects`, but is otherwise the same as
         * [ProjectServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ProjectListPageAsync>> =
            list(ProjectListParams.none())

        /** @see list */
        fun list(
            params: ProjectListParams = ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectListPageAsync>>

        /** @see list */
        fun list(
            params: ProjectListParams = ProjectListParams.none()
        ): CompletableFuture<HttpResponseFor<ProjectListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProjectListPageAsync>> =
            list(ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/projects/{project_id}`, but is otherwise
         * the same as [ProjectServiceAsync.delete].
         */
        fun delete(projectId: String): CompletableFuture<HttpResponse> =
            delete(projectId, ProjectDeleteParams.none())

        /** @see delete */
        fun delete(
            projectId: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            projectId: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(projectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ProjectDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(projectId, ProjectDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/projects/{project_id}`, but is otherwise the
         * same as [ProjectServiceAsync.get].
         */
        fun get(projectId: String): CompletableFuture<HttpResponseFor<Project>> =
            get(projectId, ProjectGetParams.none())

        /** @see get */
        fun get(
            projectId: String,
            params: ProjectGetParams = ProjectGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Project>> =
            get(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see get */
        fun get(
            projectId: String,
            params: ProjectGetParams = ProjectGetParams.none(),
        ): CompletableFuture<HttpResponseFor<Project>> =
            get(projectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ProjectGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Project>>

        /** @see get */
        fun get(params: ProjectGetParams): CompletableFuture<HttpResponseFor<Project>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Project>> =
            get(projectId, ProjectGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/projects/{project_id}/usage`, but is
         * otherwise the same as [ProjectServiceAsync.getUsage].
         */
        fun getUsage(
            projectId: String
        ): CompletableFuture<HttpResponseFor<ProjectGetUsageResponse>> =
            getUsage(projectId, ProjectGetUsageParams.none())

        /** @see getUsage */
        fun getUsage(
            projectId: String,
            params: ProjectGetUsageParams = ProjectGetUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectGetUsageResponse>> =
            getUsage(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see getUsage */
        fun getUsage(
            projectId: String,
            params: ProjectGetUsageParams = ProjectGetUsageParams.none(),
        ): CompletableFuture<HttpResponseFor<ProjectGetUsageResponse>> =
            getUsage(projectId, params, RequestOptions.none())

        /** @see getUsage */
        fun getUsage(
            params: ProjectGetUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectGetUsageResponse>>

        /** @see getUsage */
        fun getUsage(
            params: ProjectGetUsageParams
        ): CompletableFuture<HttpResponseFor<ProjectGetUsageResponse>> =
            getUsage(params, RequestOptions.none())

        /** @see getUsage */
        fun getUsage(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectGetUsageResponse>> =
            getUsage(projectId, ProjectGetUsageParams.none(), requestOptions)
    }
}
