package ai.radius.blink

import ai.radius.blink.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.radius.blink.model.BulkError
import ai.radius.blink.model.Error
import ai.radius.blink.model.Item
import ai.radius.blink.model.ScanResponseData
import ai.radius.blink.model.Transaction
import ai.radius.blink.model.TransactionCreateRequest
import ai.radius.blink.model.TransactionDeleteRequest
import ai.radius.blink.model.UpsertItem

interface DefaultApi {
    /**
     * GET items
     * Retrieve all items
     * 
     * Responses:
     *  - 200: Successfully retrieved items
     *
     * @return [Call]<[kotlin.collections.List<Item>]>
     */
    @GET("items")
    fun itemsGet(): Call<kotlin.collections.List<Item>>

    /**
     * POST items
     * Update or Insert new items
     * 
     * Responses:
     *  - 200: Successfully created items
     *  - 400: Bad request
     *
     * @param upsertItem 
     * @return [Call]<[kotlin.collections.List<Item>]>
     */
    @POST("items")
    fun itemsPost(@Body upsertItem: kotlin.collections.List<UpsertItem>): Call<kotlin.collections.List<Item>>

    /**
     * GET scan
     * Retrieve scan data from SA device
     * 
     * Responses:
     *  - 200: Successful response with scan data
     *  - 400: Bad request
     *
     * @return [Call]<[ScanResponseData]>
     */
    @GET("scan")
    fun scanGet(): Call<ScanResponseData>

    /**
     * DELETE transaction
     * Delete a transaction
     * 
     * Responses:
     *  - 204: Transaction successfully deleted
     *  - 400: Bad request
     *
     * @param transactionDeleteRequest 
     * @param id  (optional)
     * @param externalId  (optional)
     * @return [Call]<[Unit]>
     */
    @DELETE("transaction")
    fun transactionDelete(@Body transactionDeleteRequest: TransactionDeleteRequest, @Query("id") id: kotlin.String? = null, @Query("externalId") externalId: kotlin.String? = null): Call<Unit>

    /**
     * GET transaction
     * Retrieve a transaction by ID or external ID
     * 
     * Responses:
     *  - 200: Successfully retrieved transaction
     *  - 400: Bad request
     *
     * @param id Internal transaction ID (optional)
     * @param externalId External transaction ID (optional)
     * @return [Call]<[Transaction]>
     */
    @GET("transaction")
    fun transactionGet(@Query("id") id: kotlin.String? = null, @Query("externalId") externalId: kotlin.String? = null): Call<Transaction>

    /**
     * POST transaction
     * Create a new transaction
     * 
     * Responses:
     *  - 201: Successfully created transaction
     *  - 400: Bad request
     *
     * @param transactionCreateRequest 
     * @return [Call]<[Transaction]>
     */
    @POST("transaction")
    fun transactionPost(@Body transactionCreateRequest: TransactionCreateRequest): Call<Transaction>

}
