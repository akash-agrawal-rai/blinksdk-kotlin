package rai.blink.api

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.HttpStatusCode
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import rai.blink.infrastructure.HttpResponse
import rai.blink.infrastructure.RequestConfig
import rai.blink.infrastructure.RequestMethod
import rai.blink.infrastructure.wrap
import rai.blink.model.ScanResponseData

public class BlinkApi(host: String, insecureApi: Boolean) {
    private var apiInstance: DefaultApi
    public constructor(host: String): this(host = host, insecureApi = false)

    init {
        val protocol = if (insecureApi) "http" else "https"
        val httpClient = HttpClient(OkHttp) {
            install(ContentNegotiation) {
                json()
            }
        }
        this.apiInstance = DefaultApi(baseUrl = "$protocol://$host", httpClient = httpClient)
    }

    public fun smartsense(): Flow<ScanResponseData> = flow {
        while (true) {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody =
                io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()
            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<Any?>(
                RequestMethod.GET,
                "/scan",
                query = localVariableQuery,
                headers = localVariableHeaders,
                requiresAuthentication = false,
            )
            val response: HttpResponse<ScanResponseData> = apiInstance.request(
                localVariableConfig,
                localVariableBody,
                localVariableAuthNames
            ).wrap()
            if (response.status == HttpStatusCode.OK.value) {
                emit(response.body())
            }
        }
    }.flowOn(Dispatchers.IO)
}