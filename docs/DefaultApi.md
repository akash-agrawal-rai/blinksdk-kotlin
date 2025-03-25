# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**itemsGet**](DefaultApi.md#itemsGet) | **GET** /items | Retrieve all items |
| [**itemsPost**](DefaultApi.md#itemsPost) | **POST** /items | Update or Insert new items |
| [**scanGet**](DefaultApi.md#scanGet) | **GET** /scan | Retrieve scan data from SA device |
| [**transactionDelete**](DefaultApi.md#transactionDelete) | **DELETE** /transaction | Delete a transaction |
| [**transactionGet**](DefaultApi.md#transactionGet) | **GET** /transaction | Retrieve a transaction by ID or external ID |
| [**transactionPost**](DefaultApi.md#transactionPost) | **POST** /transaction | Create a new transaction |


<a id="itemsGet"></a>
# **itemsGet**
> kotlin.collections.List&lt;Item&gt; itemsGet()

Retrieve all items

### Example
```kotlin
// Import classes:
//import rai.blink.infrastructure.*
//import rai.blink.model.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.collections.List<Item> = apiInstance.itemsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#itemsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#itemsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Item&gt;**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="itemsPost"></a>
# **itemsPost**
> kotlin.collections.List&lt;Item&gt; itemsPost(upsertItem)

Update or Insert new items

### Example
```kotlin
// Import classes:
//import rai.blink.infrastructure.*
//import rai.blink.model.*

val apiInstance = DefaultApi()
val upsertItem : kotlin.collections.List<UpsertItem> =  // kotlin.collections.List<UpsertItem> | 
try {
    val result : kotlin.collections.List<Item> = apiInstance.itemsPost(upsertItem)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#itemsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#itemsPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **upsertItem** | [**kotlin.collections.List&lt;UpsertItem&gt;**](UpsertItem.md)|  | |

### Return type

[**kotlin.collections.List&lt;Item&gt;**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="scanGet"></a>
# **scanGet**
> ScanResponseData scanGet()

Retrieve scan data from SA device

### Example
```kotlin
// Import classes:
//import rai.blink.infrastructure.*
//import rai.blink.model.*

val apiInstance = DefaultApi()
try {
    val result : ScanResponseData = apiInstance.scanGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#scanGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#scanGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ScanResponseData**](ScanResponseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="transactionDelete"></a>
# **transactionDelete**
> transactionDelete(id, externalId)

Delete a transaction

### Example
```kotlin
// Import classes:
//import rai.blink.infrastructure.*
//import rai.blink.model.*

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | 
val externalId : kotlin.String = externalId_example // kotlin.String | 
try {
    apiInstance.transactionDelete(id, externalId)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#transactionDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#transactionDelete")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="transactionGet"></a>
# **transactionGet**
> Transaction transactionGet(id, externalId)

Retrieve a transaction by ID or external ID

### Example
```kotlin
// Import classes:
//import rai.blink.infrastructure.*
//import rai.blink.model.*

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | Internal transaction ID
val externalId : kotlin.String = externalId_example // kotlin.String | External transaction ID
try {
    val result : Transaction = apiInstance.transactionGet(id, externalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#transactionGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#transactionGet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Internal transaction ID | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String**| External transaction ID | [optional] |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="transactionPost"></a>
# **transactionPost**
> Transaction transactionPost(transactionCreateRequest)

Create a new transaction

### Example
```kotlin
// Import classes:
//import rai.blink.infrastructure.*
//import rai.blink.model.*

val apiInstance = DefaultApi()
val transactionCreateRequest : TransactionCreateRequest =  // TransactionCreateRequest | 
try {
    val result : Transaction = apiInstance.transactionPost(transactionCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#transactionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#transactionPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionCreateRequest** | [**TransactionCreateRequest**](TransactionCreateRequest.md)|  | |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

