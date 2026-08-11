// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.services.blocking

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
import ai.llamaindex.llamacloudadmin.services.blocking.admin.UsageMetricService
import ai.llamaindex.llamacloudadmin.services.blocking.admin.UserService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface AdminService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdminService

    fun users(): UserService

    fun usageMetrics(): UsageMetricService

    /** Get File Store Info */
    fun getFilestoresInfo(): AdminGetFilestoresInfoResponse =
        getFilestoresInfo(AdminGetFilestoresInfoParams.none())

    /** @see getFilestoresInfo */
    fun getFilestoresInfo(
        params: AdminGetFilestoresInfoParams = AdminGetFilestoresInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdminGetFilestoresInfoResponse

    /** @see getFilestoresInfo */
    fun getFilestoresInfo(
        params: AdminGetFilestoresInfoParams = AdminGetFilestoresInfoParams.none()
    ): AdminGetFilestoresInfoResponse = getFilestoresInfo(params, RequestOptions.none())

    /** @see getFilestoresInfo */
    fun getFilestoresInfo(requestOptions: RequestOptions): AdminGetFilestoresInfoResponse =
        getFilestoresInfo(AdminGetFilestoresInfoParams.none(), requestOptions)

    /** Get License Info */
    fun getLicenseInfo(): AdminGetLicenseInfoResponse =
        getLicenseInfo(AdminGetLicenseInfoParams.none())

    /** @see getLicenseInfo */
    fun getLicenseInfo(
        params: AdminGetLicenseInfoParams = AdminGetLicenseInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdminGetLicenseInfoResponse

    /** @see getLicenseInfo */
    fun getLicenseInfo(
        params: AdminGetLicenseInfoParams = AdminGetLicenseInfoParams.none()
    ): AdminGetLicenseInfoResponse = getLicenseInfo(params, RequestOptions.none())

    /** @see getLicenseInfo */
    fun getLicenseInfo(requestOptions: RequestOptions): AdminGetLicenseInfoResponse =
        getLicenseInfo(AdminGetLicenseInfoParams.none(), requestOptions)

    /** Get LlamaExtract feature availability based on available models. */
    fun getLlamaextractFeatures(): AdminGetLlamaextractFeaturesResponse =
        getLlamaextractFeatures(AdminGetLlamaextractFeaturesParams.none())

    /** @see getLlamaextractFeatures */
    fun getLlamaextractFeatures(
        params: AdminGetLlamaextractFeaturesParams = AdminGetLlamaextractFeaturesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdminGetLlamaextractFeaturesResponse

    /** @see getLlamaextractFeatures */
    fun getLlamaextractFeatures(
        params: AdminGetLlamaextractFeaturesParams = AdminGetLlamaextractFeaturesParams.none()
    ): AdminGetLlamaextractFeaturesResponse = getLlamaextractFeatures(params, RequestOptions.none())

    /** @see getLlamaextractFeatures */
    fun getLlamaextractFeatures(
        requestOptions: RequestOptions
    ): AdminGetLlamaextractFeaturesResponse =
        getLlamaextractFeatures(AdminGetLlamaextractFeaturesParams.none(), requestOptions)

    /** Get Llm Info */
    fun getLlmsInfo(): AdminGetLlmsInfoResponse = getLlmsInfo(AdminGetLlmsInfoParams.none())

    /** @see getLlmsInfo */
    fun getLlmsInfo(
        params: AdminGetLlmsInfoParams = AdminGetLlmsInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdminGetLlmsInfoResponse

    /** @see getLlmsInfo */
    fun getLlmsInfo(
        params: AdminGetLlmsInfoParams = AdminGetLlmsInfoParams.none()
    ): AdminGetLlmsInfoResponse = getLlmsInfo(params, RequestOptions.none())

    /** @see getLlmsInfo */
    fun getLlmsInfo(requestOptions: RequestOptions): AdminGetLlmsInfoResponse =
        getLlmsInfo(AdminGetLlmsInfoParams.none(), requestOptions)

    /** Get OCR service health status including GPU availability. */
    fun getOcrStatus(): AdminGetOcrStatusResponse = getOcrStatus(AdminGetOcrStatusParams.none())

    /** @see getOcrStatus */
    fun getOcrStatus(
        params: AdminGetOcrStatusParams = AdminGetOcrStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdminGetOcrStatusResponse

    /** @see getOcrStatus */
    fun getOcrStatus(
        params: AdminGetOcrStatusParams = AdminGetOcrStatusParams.none()
    ): AdminGetOcrStatusResponse = getOcrStatus(params, RequestOptions.none())

    /** @see getOcrStatus */
    fun getOcrStatus(requestOptions: RequestOptions): AdminGetOcrStatusResponse =
        getOcrStatus(AdminGetOcrStatusParams.none(), requestOptions)

    /** A view of [AdminService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdminService.WithRawResponse

        fun users(): UserService.WithRawResponse

        fun usageMetrics(): UsageMetricService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/admin/filestores/info`, but is otherwise the
         * same as [AdminService.getFilestoresInfo].
         */
        @MustBeClosed
        fun getFilestoresInfo(): HttpResponseFor<AdminGetFilestoresInfoResponse> =
            getFilestoresInfo(AdminGetFilestoresInfoParams.none())

        /** @see getFilestoresInfo */
        @MustBeClosed
        fun getFilestoresInfo(
            params: AdminGetFilestoresInfoParams = AdminGetFilestoresInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdminGetFilestoresInfoResponse>

        /** @see getFilestoresInfo */
        @MustBeClosed
        fun getFilestoresInfo(
            params: AdminGetFilestoresInfoParams = AdminGetFilestoresInfoParams.none()
        ): HttpResponseFor<AdminGetFilestoresInfoResponse> =
            getFilestoresInfo(params, RequestOptions.none())

        /** @see getFilestoresInfo */
        @MustBeClosed
        fun getFilestoresInfo(
            requestOptions: RequestOptions
        ): HttpResponseFor<AdminGetFilestoresInfoResponse> =
            getFilestoresInfo(AdminGetFilestoresInfoParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/admin/license/info`, but is otherwise the
         * same as [AdminService.getLicenseInfo].
         */
        @MustBeClosed
        fun getLicenseInfo(): HttpResponseFor<AdminGetLicenseInfoResponse> =
            getLicenseInfo(AdminGetLicenseInfoParams.none())

        /** @see getLicenseInfo */
        @MustBeClosed
        fun getLicenseInfo(
            params: AdminGetLicenseInfoParams = AdminGetLicenseInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdminGetLicenseInfoResponse>

        /** @see getLicenseInfo */
        @MustBeClosed
        fun getLicenseInfo(
            params: AdminGetLicenseInfoParams = AdminGetLicenseInfoParams.none()
        ): HttpResponseFor<AdminGetLicenseInfoResponse> =
            getLicenseInfo(params, RequestOptions.none())

        /** @see getLicenseInfo */
        @MustBeClosed
        fun getLicenseInfo(
            requestOptions: RequestOptions
        ): HttpResponseFor<AdminGetLicenseInfoResponse> =
            getLicenseInfo(AdminGetLicenseInfoParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/admin/llamaextract/features`, but is
         * otherwise the same as [AdminService.getLlamaextractFeatures].
         */
        @MustBeClosed
        fun getLlamaextractFeatures(): HttpResponseFor<AdminGetLlamaextractFeaturesResponse> =
            getLlamaextractFeatures(AdminGetLlamaextractFeaturesParams.none())

        /** @see getLlamaextractFeatures */
        @MustBeClosed
        fun getLlamaextractFeatures(
            params: AdminGetLlamaextractFeaturesParams = AdminGetLlamaextractFeaturesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdminGetLlamaextractFeaturesResponse>

        /** @see getLlamaextractFeatures */
        @MustBeClosed
        fun getLlamaextractFeatures(
            params: AdminGetLlamaextractFeaturesParams = AdminGetLlamaextractFeaturesParams.none()
        ): HttpResponseFor<AdminGetLlamaextractFeaturesResponse> =
            getLlamaextractFeatures(params, RequestOptions.none())

        /** @see getLlamaextractFeatures */
        @MustBeClosed
        fun getLlamaextractFeatures(
            requestOptions: RequestOptions
        ): HttpResponseFor<AdminGetLlamaextractFeaturesResponse> =
            getLlamaextractFeatures(AdminGetLlamaextractFeaturesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/admin/llms/info`, but is otherwise the same
         * as [AdminService.getLlmsInfo].
         */
        @MustBeClosed
        fun getLlmsInfo(): HttpResponseFor<AdminGetLlmsInfoResponse> =
            getLlmsInfo(AdminGetLlmsInfoParams.none())

        /** @see getLlmsInfo */
        @MustBeClosed
        fun getLlmsInfo(
            params: AdminGetLlmsInfoParams = AdminGetLlmsInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdminGetLlmsInfoResponse>

        /** @see getLlmsInfo */
        @MustBeClosed
        fun getLlmsInfo(
            params: AdminGetLlmsInfoParams = AdminGetLlmsInfoParams.none()
        ): HttpResponseFor<AdminGetLlmsInfoResponse> = getLlmsInfo(params, RequestOptions.none())

        /** @see getLlmsInfo */
        @MustBeClosed
        fun getLlmsInfo(requestOptions: RequestOptions): HttpResponseFor<AdminGetLlmsInfoResponse> =
            getLlmsInfo(AdminGetLlmsInfoParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/admin/ocr/statusz`, but is otherwise the
         * same as [AdminService.getOcrStatus].
         */
        @MustBeClosed
        fun getOcrStatus(): HttpResponseFor<AdminGetOcrStatusResponse> =
            getOcrStatus(AdminGetOcrStatusParams.none())

        /** @see getOcrStatus */
        @MustBeClosed
        fun getOcrStatus(
            params: AdminGetOcrStatusParams = AdminGetOcrStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdminGetOcrStatusResponse>

        /** @see getOcrStatus */
        @MustBeClosed
        fun getOcrStatus(
            params: AdminGetOcrStatusParams = AdminGetOcrStatusParams.none()
        ): HttpResponseFor<AdminGetOcrStatusResponse> = getOcrStatus(params, RequestOptions.none())

        /** @see getOcrStatus */
        @MustBeClosed
        fun getOcrStatus(
            requestOptions: RequestOptions
        ): HttpResponseFor<AdminGetOcrStatusResponse> =
            getOcrStatus(AdminGetOcrStatusParams.none(), requestOptions)
    }
}
