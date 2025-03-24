package ai.radius.blink

import ai.radius.blink.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.radius.blink.model.BulkError
import ai.radius.blink.model.Error
import ai.radius.blink.model.Item
import ai.radius.blink.model.ScanResponseData
import ai.radius.blink.model.Transaction
import ai.radius.blink.model.TransactionCreateRequest
import ai.radius.blink.model.UpsertItem

public interface DefaultApi {
    /**
     * GET items
     * Retrieve all items
     * 
     * Responses:
     *  - 200: Successfully retrieved items
     *
     * @return [kotlin.collections.List<Item>]
     */
    @GET("items")
    public suspend fun itemsGet(): Response<kotlin.collections.List<Item>>

    /**
     * POST items
     * Update or Insert new items
     * 
     * Responses:
     *  - 200: Successfully created items
     *  - 400: Bad request
     *
     * @param upsertItem 
     * @return [kotlin.collections.List<Item>]
     */
    @POST("items")
    public suspend fun itemsPost(@Body upsertItem: kotlin.collections.List<UpsertItem>): Response<kotlin.collections.List<Item>>

    /**
     * GET scan
     * Retrieve scan data from SA device
     * 
     * Responses:
     *  - 200: Successful response with scan data
     *  - 400: Bad request
     *
     * @return [ScanResponseData]
     */
    @GET("scan")
    public suspend fun scanGet(): Response<ScanResponseData>

    /**
     * DELETE transaction
     * Delete a transaction
     * 
     * Responses:
     *  - 204: Transaction successfully deleted
     *  - 400: Bad request
     *
     * @param id  (optional)
     * @param externalId  (optional)
     * @return [Unit]
     */
    @DELETE("transaction")
    public suspend fun transactionDelete(@Query("id") id: kotlin.String? = null, @Query("externalId") externalId: kotlin.String? = null): Response<Unit>

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
     * @return [Transaction]
     */
    @GET("transaction")
    public suspend fun transactionGet(@Query("id") id: kotlin.String? = null, @Query("externalId") externalId: kotlin.String? = null): Response<Transaction>

    /**
     * POST transaction
     * Create a new transaction
     * 
     * Responses:
     *  - 201: Successfully created transaction
     *  - 400: Bad request
     *
     * @param transactionCreateRequest 
     * @return [Transaction]
     */
    @POST("transaction")
    public suspend fun transactionPost(@Body transactionCreateRequest: TransactionCreateRequest): Response<Transaction>

}
