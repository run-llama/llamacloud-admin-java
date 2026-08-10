@file:JvmName("StringHandler")

package ai.llamaindex.llamacloudadmin.core.handlers

import ai.llamaindex.llamacloudadmin.core.http.HttpResponse
import ai.llamaindex.llamacloudadmin.core.http.HttpResponse.Handler

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
