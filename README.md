# rai.blink - Kotlin client library for SA Scanner API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.

- API version: 1.0.0
- Package version: 
- Generator version: 7.12.0
- Build package: org.openapitools.codegen.languages.KotlinClientCodegen

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

| Class | Method | HTTP request | Description |
| ------------ | ------------- | ------------- | ------------- |
| *DefaultApi* | [**itemsGet**](docs/DefaultApi.md#itemsget) | **GET** /items | Retrieve all items |
| *DefaultApi* | [**itemsPost**](docs/DefaultApi.md#itemspost) | **POST** /items | Update or Insert new items |
| *DefaultApi* | [**scanGet**](docs/DefaultApi.md#scanget) | **GET** /scan | Retrieve scan data from SA device |
| *DefaultApi* | [**transactionDelete**](docs/DefaultApi.md#transactiondelete) | **DELETE** /transaction | Delete a transaction |
| *DefaultApi* | [**transactionGet**](docs/DefaultApi.md#transactionget) | **GET** /transaction | Retrieve a transaction by ID or external ID |
| *DefaultApi* | [**transactionPost**](docs/DefaultApi.md#transactionpost) | **POST** /transaction | Create a new transaction |


<a id="documentation-for-models"></a>
## Documentation for Models

 - [rai.blink.model.BulkError](docs/BulkError.md)
 - [rai.blink.model.BulkErrorErrorsInner](docs/BulkErrorErrorsInner.md)
 - [rai.blink.model.Error](docs/Error.md)
 - [rai.blink.model.Item](docs/Item.md)
 - [rai.blink.model.ScanResponseData](docs/ScanResponseData.md)
 - [rai.blink.model.ScannedItem](docs/ScannedItem.md)
 - [rai.blink.model.ScannedItemExtras](docs/ScannedItemExtras.md)
 - [rai.blink.model.Transaction](docs/Transaction.md)
 - [rai.blink.model.TransactionCreateRequest](docs/TransactionCreateRequest.md)
 - [rai.blink.model.TransactionCreateRequestItemsInner](docs/TransactionCreateRequestItemsInner.md)
 - [rai.blink.model.UpsertItem](docs/UpsertItem.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.

