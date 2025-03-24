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

package ai.radius.blink.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param externalId 
 * @param sku 
 * @param upc 
 * @param name 
 * @param description 
 * @param upcEncoding 
 * @param icon 
 */


data class Item (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "externalId")
    val externalId: kotlin.String,

    @Json(name = "sku")
    val sku: kotlin.String,

    @Json(name = "upc")
    val upc: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "description")
    val description: kotlin.String,

    @Json(name = "upc_encoding")
    val upcEncoding: kotlin.String? = null,

    @Json(name = "icon")
    val icon: kotlin.String? = null

) {


}

