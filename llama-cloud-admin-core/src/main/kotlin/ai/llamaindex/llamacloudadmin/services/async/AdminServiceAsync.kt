// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.async

import ai.llamaindex.llamacloudadmin.core.ClientOptions
import ai.llamaindex.llamacloudadmin.core.RequestOptions
import ai.llamaindex.llamacloudadmin.core.http.HttpResponseFor
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetFilestoresInfoParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetFilestoresInfoResponse
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLicenseInfoParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLicenseInfoResponse
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLlamaextractFeaturesParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLlamaextractFeaturesResponse
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLlmsInfoParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetLlmsInfoResponse
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetOcrStatusParams
import ai.llamaindex.llamacloudadmin.models.admin.AdminGetOcrStatusResponse
import ai.llamaindex.llamacloudadmin.services.async.AdminServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.admin.UsageMetricServiceAsync
import ai.llamaindex.llamacloudadmin.services.async.admin.UserServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AdminServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdminServiceAsync

    fun users(): UserServiceAsync

    fun usageMetrics(): UsageMetricServiceAsync

    /** Get File Store Info */
    fun getFilestoresInfo(): CompletableFuture<AdminGetFilestoresInfoResponse> = getFilestoresInfo(AdminGetFilestoresInfoParams.none())

    /** @see getFilestoresInfo */
    fun getFilestoresInfo(params: AdminGetFilestoresInfoParams = AdminGetFilestoresInfoParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AdminGetFilestoresInfoResponse>

    /** @see getFilestoresInfo */
    fun getFilestoresInfo(params: AdminGetFilestoresInfoParams = AdminGetFilestoresInfoParams.none()): CompletableFuture<AdminGetFilestoresInfoResponse> =
        getFilestoresInfo(
          params, RequestOptions.none()
        )

    /** @see getFilestoresInfo */
    fun getFilestoresInfo(requestOptions: RequestOptions): CompletableFuture<AdminGetFilestoresInfoResponse> =
        getFilestoresInfo(
          AdminGetFilestoresInfoParams.none(), requestOptions
        )

    /** Get License Info */
    fun getLicenseInfo(): CompletableFuture<AdminGetLicenseInfoResponse> = getLicenseInfo(AdminGetLicenseInfoParams.none())

    /** @see getLicenseInfo */
    fun getLicenseInfo(params: AdminGetLicenseInfoParams = AdminGetLicenseInfoParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AdminGetLicenseInfoResponse>

    /** @see getLicenseInfo */
    fun getLicenseInfo(params: AdminGetLicenseInfoParams = AdminGetLicenseInfoParams.none()): CompletableFuture<AdminGetLicenseInfoResponse> =
        getLicenseInfo(
          params, RequestOptions.none()
        )

    /** @see getLicenseInfo */
    fun getLicenseInfo(requestOptions: RequestOptions): CompletableFuture<AdminGetLicenseInfoResponse> =
        getLicenseInfo(
          AdminGetLicenseInfoParams.none(), requestOptions
        )

    /** Get LlamaExtract feature availability based on available models. */
    fun getLlamaextractFeatures(): CompletableFuture<AdminGetLlamaextractFeaturesResponse> = getLlamaextractFeatures(AdminGetLlamaextractFeaturesParams.none())

    /** @see getLlamaextractFeatures */
    fun getLlamaextractFeatures(params: AdminGetLlamaextractFeaturesParams = AdminGetLlamaextractFeaturesParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AdminGetLlamaextractFeaturesResponse>

    /** @see getLlamaextractFeatures */
    fun getLlamaextractFeatures(params: AdminGetLlamaextractFeaturesParams = AdminGetLlamaextractFeaturesParams.none()): CompletableFuture<AdminGetLlamaextractFeaturesResponse> =
        getLlamaextractFeatures(
          params, RequestOptions.none()
        )

    /** @see getLlamaextractFeatures */
    fun getLlamaextractFeatures(requestOptions: RequestOptions): CompletableFuture<AdminGetLlamaextractFeaturesResponse> =
        getLlamaextractFeatures(
          AdminGetLlamaextractFeaturesParams.none(), requestOptions
        )

    /** Get Llm Info */
    fun getLlmsInfo(): CompletableFuture<AdminGetLlmsInfoResponse> = getLlmsInfo(AdminGetLlmsInfoParams.none())

    /** @see getLlmsInfo */
    fun getLlmsInfo(params: AdminGetLlmsInfoParams = AdminGetLlmsInfoParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AdminGetLlmsInfoResponse>

    /** @see getLlmsInfo */
    fun getLlmsInfo(params: AdminGetLlmsInfoParams = AdminGetLlmsInfoParams.none()): CompletableFuture<AdminGetLlmsInfoResponse> =
        getLlmsInfo(
          params, RequestOptions.none()
        )

    /** @see getLlmsInfo */
    fun getLlmsInfo(requestOptions: RequestOptions): CompletableFuture<AdminGetLlmsInfoResponse> =
        getLlmsInfo(
          AdminGetLlmsInfoParams.none(), requestOptions
        )

    /** Get OCR service health status including GPU availability. */
    fun getOcrStatus(): CompletableFuture<AdminGetOcrStatusResponse> = getOcrStatus(AdminGetOcrStatusParams.none())

    /** @see getOcrStatus */
    fun getOcrStatus(params: AdminGetOcrStatusParams = AdminGetOcrStatusParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AdminGetOcrStatusResponse>

    /** @see getOcrStatus */
    fun getOcrStatus(params: AdminGetOcrStatusParams = AdminGetOcrStatusParams.none()): CompletableFuture<AdminGetOcrStatusResponse> =
        getOcrStatus(
          params, RequestOptions.none()
        )

    /** @see getOcrStatus */
    fun getOcrStatus(requestOptions: RequestOptions): CompletableFuture<AdminGetOcrStatusResponse> =
        getOcrStatus(
          AdminGetOcrStatusParams.none(), requestOptions
        )

    /** A view of [AdminServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdminServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse

        fun usageMetrics(): UsageMetricServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /api/v1/admin/filestores/info`, but is otherwise the             same as [AdminServiceAsync.getFilestoresInfo]. */
        fun getFilestoresInfo(): CompletableFuture<HttpResponseFor<AdminGetFilestoresInfoResponse>> = getFilestoresInfo(AdminGetFilestoresInfoParams.none())

        /** @see getFilestoresInfo */
        fun getFilestoresInfo(params: AdminGetFilestoresInfoParams = AdminGetFilestoresInfoParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AdminGetFilestoresInfoResponse>>

        /** @see getFilestoresInfo */
        fun getFilestoresInfo(params: AdminGetFilestoresInfoParams = AdminGetFilestoresInfoParams.none()): CompletableFuture<HttpResponseFor<AdminGetFilestoresInfoResponse>> =
            getFilestoresInfo(
              params, RequestOptions.none()
            )

        /** @see getFilestoresInfo */
        fun getFilestoresInfo(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AdminGetFilestoresInfoResponse>> =
            getFilestoresInfo(
              AdminGetFilestoresInfoParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /api/v1/admin/license/info`, but is otherwise the             same as [AdminServiceAsync.getLicenseInfo]. */
        fun getLicenseInfo(): CompletableFuture<HttpResponseFor<AdminGetLicenseInfoResponse>> = getLicenseInfo(AdminGetLicenseInfoParams.none())

        /** @see getLicenseInfo */
        fun getLicenseInfo(params: AdminGetLicenseInfoParams = AdminGetLicenseInfoParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AdminGetLicenseInfoResponse>>

        /** @see getLicenseInfo */
        fun getLicenseInfo(params: AdminGetLicenseInfoParams = AdminGetLicenseInfoParams.none()): CompletableFuture<HttpResponseFor<AdminGetLicenseInfoResponse>> =
            getLicenseInfo(
              params, RequestOptions.none()
            )

        /** @see getLicenseInfo */
        fun getLicenseInfo(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AdminGetLicenseInfoResponse>> =
            getLicenseInfo(
              AdminGetLicenseInfoParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /api/v1/admin/llamaextract/features`, but is otherwise the             same as [AdminServiceAsync.getLlamaextractFeatures]. */
        fun getLlamaextractFeatures(): CompletableFuture<HttpResponseFor<AdminGetLlamaextractFeaturesResponse>> = getLlamaextractFeatures(AdminGetLlamaextractFeaturesParams.none())

        /** @see getLlamaextractFeatures */
        fun getLlamaextractFeatures(params: AdminGetLlamaextractFeaturesParams = AdminGetLlamaextractFeaturesParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AdminGetLlamaextractFeaturesResponse>>

        /** @see getLlamaextractFeatures */
        fun getLlamaextractFeatures(params: AdminGetLlamaextractFeaturesParams = AdminGetLlamaextractFeaturesParams.none()): CompletableFuture<HttpResponseFor<AdminGetLlamaextractFeaturesResponse>> =
            getLlamaextractFeatures(
              params, RequestOptions.none()
            )

        /** @see getLlamaextractFeatures */
        fun getLlamaextractFeatures(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AdminGetLlamaextractFeaturesResponse>> =
            getLlamaextractFeatures(
              AdminGetLlamaextractFeaturesParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /api/v1/admin/llms/info`, but is otherwise the             same as [AdminServiceAsync.getLlmsInfo]. */
        fun getLlmsInfo(): CompletableFuture<HttpResponseFor<AdminGetLlmsInfoResponse>> = getLlmsInfo(AdminGetLlmsInfoParams.none())

        /** @see getLlmsInfo */
        fun getLlmsInfo(params: AdminGetLlmsInfoParams = AdminGetLlmsInfoParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AdminGetLlmsInfoResponse>>

        /** @see getLlmsInfo */
        fun getLlmsInfo(params: AdminGetLlmsInfoParams = AdminGetLlmsInfoParams.none()): CompletableFuture<HttpResponseFor<AdminGetLlmsInfoResponse>> =
            getLlmsInfo(
              params, RequestOptions.none()
            )

        /** @see getLlmsInfo */
        fun getLlmsInfo(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AdminGetLlmsInfoResponse>> =
            getLlmsInfo(
              AdminGetLlmsInfoParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /api/v1/admin/ocr/statusz`, but is otherwise the             same as [AdminServiceAsync.getOcrStatus]. */
        fun getOcrStatus(): CompletableFuture<HttpResponseFor<AdminGetOcrStatusResponse>> = getOcrStatus(AdminGetOcrStatusParams.none())

        /** @see getOcrStatus */
        fun getOcrStatus(params: AdminGetOcrStatusParams = AdminGetOcrStatusParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AdminGetOcrStatusResponse>>

        /** @see getOcrStatus */
        fun getOcrStatus(params: AdminGetOcrStatusParams = AdminGetOcrStatusParams.none()): CompletableFuture<HttpResponseFor<AdminGetOcrStatusResponse>> =
            getOcrStatus(
              params, RequestOptions.none()
            )

        /** @see getOcrStatus */
        fun getOcrStatus(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AdminGetOcrStatusResponse>> =
            getOcrStatus(
              AdminGetOcrStatusParams.none(), requestOptions
            )
    }
}
