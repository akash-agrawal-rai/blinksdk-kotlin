/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package rai.blink.api

import rai.blink.model.Item
import rai.blink.model.ScanResponseData
import rai.blink.model.Transaction
import rai.blink.model.TransactionCreateRequest
import rai.blink.model.UpsertItem

import rai.blink.infrastructure.*
import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.HttpClientEngine
import kotlinx.coroutines.delay
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.serialization.json.Json
import kotlinx.serialization.*
import kotlinx.serialization.encoding.*

public open class DefaultApi : ApiClient {

    public constructor(
        baseUrl: String = ApiClient.BASE_URL,
        httpClientEngine: HttpClientEngine? = null,
        httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
        jsonSerializer: Json = ApiClient.JSON_DEFAULT
    ) : super(baseUrl = baseUrl, httpClientEngine = httpClientEngine, httpClientConfig = httpClientConfig, jsonBlock = jsonSerializer)

    public constructor(
        baseUrl: String,
        httpClient: HttpClient
    ): super(baseUrl = baseUrl, httpClient = httpClient)

    /**
     * Retrieve all items
     * 
     * @return kotlin.collections.List<Item>
     */
    public open suspend fun itemsGet(): HttpResponse<kotlin.collections.List<Item>> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/items",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<ItemsGetResponse>().map { value }
    }

    @Serializable(ItemsGetResponse.Companion::class)
    private class ItemsGetResponse(val value: List<Item>) {
        companion object : KSerializer<ItemsGetResponse> {
            private val serializer: KSerializer<List<Item>> = serializer<List<Item>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, value: ItemsGetResponse) = serializer.serialize(encoder, value.value)
            override fun deserialize(decoder: Decoder) = ItemsGetResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Update or Insert new items
     * 
     * @param upsertItem 
     * @return kotlin.collections.List<Item>
     */
    public open suspend fun itemsPost(upsertItem: kotlin.collections.List<UpsertItem>): HttpResponse<kotlin.collections.List<Item>> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = ItemsPostRequest(upsertItem)

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/items",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<ItemsPostResponse>().map { value }
    }

    @Serializable(ItemsPostRequest.Companion::class)
    private class ItemsPostRequest(val value: List<UpsertItem>) {
        companion object : KSerializer<ItemsPostRequest> {
            private val serializer: KSerializer<List<UpsertItem>> = serializer<List<UpsertItem>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, value: ItemsPostRequest) = serializer.serialize(encoder, value.value)
            override fun deserialize(decoder: Decoder) = ItemsPostRequest(serializer.deserialize(decoder))
        }
    }
    @Serializable(ItemsPostResponse.Companion::class)
    private class ItemsPostResponse(val value: List<Item>) {
        companion object : KSerializer<ItemsPostResponse> {
            private val serializer: KSerializer<List<Item>> = serializer<List<Item>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, value: ItemsPostResponse) = serializer.serialize(encoder, value.value)
            override fun deserialize(decoder: Decoder) = ItemsPostResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Retrieve scan data from SA device
     * 
     * @return ScanResponseData
     */
    public open suspend fun scanGet(): HttpResponse<ScanResponseData> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/scan",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Retrieve scan data from SA device
     * 
     * @return ScanResponseData
     */
    public fun smartsense(): Flow<HttpResponse<ScanResponseData>> = flow {
        while (true) {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()
            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
                RequestMethod.GET,
                "/scan",
                query = localVariableQuery,
                headers = localVariableHeaders,
                requiresAuthentication = false,
            )
            val response: HttpResponse<ScanResponseData> = request(
                localVariableConfig,
                localVariableBody,
                localVariableAuthNames
            ).wrap()
            emit(response)
        }
    }.flowOn(Dispatchers.IO)


    /**
     * Delete a transaction
     * 
     * @param id  (optional)
     * @param externalId  (optional)
     * @return void
     */
    public open suspend fun transactionDelete(id: kotlin.String? = null, externalId: kotlin.String? = null): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        id?.apply { localVariableQuery["id"] = listOf("$id") }
        externalId?.apply { localVariableQuery["externalId"] = listOf("$externalId") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/transaction",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Retrieve a transaction by ID or external ID
     * 
     * @param id Internal transaction ID (optional)
     * @param externalId External transaction ID (optional)
     * @return Transaction
     */
    public open suspend fun transactionGet(id: kotlin.String? = null, externalId: kotlin.String? = null): HttpResponse<Transaction> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        id?.apply { localVariableQuery["id"] = listOf("$id") }
        externalId?.apply { localVariableQuery["externalId"] = listOf("$externalId") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/transaction",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Create a new transaction
     * 
     * @param transactionCreateRequest 
     * @return Transaction
     */
    public open suspend fun transactionPost(transactionCreateRequest: TransactionCreateRequest): HttpResponse<Transaction> {

        val localVariableAuthNames = listOf<String>()

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/transaction",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return jsonRequest(
            localVariableConfig,
            transactionCreateRequest,
            localVariableAuthNames
        ).wrap()
    }



}
