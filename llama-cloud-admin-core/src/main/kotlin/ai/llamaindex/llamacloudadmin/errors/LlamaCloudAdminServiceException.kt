// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.errors

import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.http.Headers
import ai.llamaindex.llamacloudadmin.errors.LlamaCloudAdminException

abstract class LlamaCloudAdminServiceException protected constructor(
    message: String,
    cause: Throwable? = null,

) : LlamaCloudAdminException(
  message, cause
) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
