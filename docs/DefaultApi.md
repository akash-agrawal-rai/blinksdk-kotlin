# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**itemsGet**](DefaultApi.md#itemsGet) | **GET** items | Retrieve all items |
| [**itemsPost**](DefaultApi.md#itemsPost) | **POST** items | Update or Insert new items |
| [**scanGet**](DefaultApi.md#scanGet) | **GET** scan | Retrieve scan data from SA device |
| [**transactionDelete**](DefaultApi.md#transactionDelete) | **DELETE** transaction | Delete a transaction |
| [**transactionGet**](DefaultApi.md#transactionGet) | **GET** transaction | Retrieve a transaction by ID or external ID |
| [**transactionPost**](DefaultApi.md#transactionPost) | **POST** transaction | Create a new transaction |



Retrieve all items

### Example
```kotlin
// Import classes:
//import ai.radius.blink.*
//import ai.radius.blink.infrastructure.*
//import ai.radius.blink.model.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DefaultApi::class.java)

val result : kotlin.collections.List<Item> = webService.itemsGet()
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


Update or Insert new items

### Example
```kotlin
// Import classes:
//import ai.radius.blink.*
//import ai.radius.blink.infrastructure.*
//import ai.radius.blink.model.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DefaultApi::class.java)
val upsertItem : kotlin.collections.List<UpsertItem> =  // kotlin.collections.List<UpsertItem> | 

val result : kotlin.collections.List<Item> = webService.itemsPost(upsertItem)
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


Retrieve scan data from SA device

### Example
```kotlin
// Import classes:
//import ai.radius.blink.*
//import ai.radius.blink.infrastructure.*
//import ai.radius.blink.model.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DefaultApi::class.java)

val result : ScanResponseData = webService.scanGet()
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


Delete a transaction

### Example
```kotlin
// Import classes:
//import ai.radius.blink.*
//import ai.radius.blink.infrastructure.*
//import ai.radius.blink.model.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DefaultApi::class.java)
val transactionDeleteRequest : TransactionDeleteRequest =  // TransactionDeleteRequest | 
val id : kotlin.String = id_example // kotlin.String | 
val externalId : kotlin.String = externalId_example // kotlin.String | 

webService.transactionDelete(transactionDeleteRequest, id, externalId)
```

### Parameters
| **transactionDeleteRequest** | [**TransactionDeleteRequest**](TransactionDeleteRequest.md)|  | |
| **id** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve a transaction by ID or external ID

### Example
```kotlin
// Import classes:
//import ai.radius.blink.*
//import ai.radius.blink.infrastructure.*
//import ai.radius.blink.model.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DefaultApi::class.java)
val id : kotlin.String = id_example // kotlin.String | Internal transaction ID
val externalId : kotlin.String = externalId_example // kotlin.String | External transaction ID

val result : Transaction = webService.transactionGet(id, externalId)
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


Create a new transaction

### Example
```kotlin
// Import classes:
//import ai.radius.blink.*
//import ai.radius.blink.infrastructure.*
//import ai.radius.blink.model.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DefaultApi::class.java)
val transactionCreateRequest : TransactionCreateRequest =  // TransactionCreateRequest | 

val result : Transaction = webService.transactionPost(transactionCreateRequest)
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

