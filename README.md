# openapi-java-client

BVNK API Endpoints
- API version: 1.0.1
  - Build date: 2023-07-05T21:04:47.186508+02:00[Africa/Johannesburg]

The BVNK API is designed to facilitate seamless and secure transactions including payments, channels, anddigital wallet transactions.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.0.1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    ChannelsApi apiInstance = new ChannelsApi(defaultClient);
    String merchantId = "c02153ae-8ac8-4222-80e8-b2b2af85bd78"; // String | The merchant ID that the channels belong to
    String offset = "0"; // String | Offset
    String max = "10"; // String | Maximum number of items in response
    PaymentStatusDto sort = PaymentStatusDto.fromValue("PENDING"); // PaymentStatusDto | The attribute used to sort the data
    String order = "asc"; // String | Ordering direction
    try {
      List<MerchantChannel> result = apiInstance.apiV2ChannelGet(merchantId, offset, max, sort, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsApi#apiV2ChannelGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.sandbox.bvnk.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ChannelsApi* | [**apiV2ChannelGet**](docs/ChannelsApi.md#apiV2ChannelGet) | **GET** /api/v2/channel | List Channels
*ChannelsApi* | [**apiV2ChannelPaymentGet**](docs/ChannelsApi.md#apiV2ChannelPaymentGet) | **GET** /api/v2/channel/payment | List Channel Payments
*ChannelsApi* | [**apiV2ChannelPaymentUuidGet**](docs/ChannelsApi.md#apiV2ChannelPaymentUuidGet) | **GET** /api/v2/channel/payment/{uuid} | Get Channel Payment
*ChannelsApi* | [**apiV2ChannelPost**](docs/ChannelsApi.md#apiV2ChannelPost) | **POST** /api/v2/channel | Create Channel
*ChannelsApi* | [**apiV2ChannelUuidGet**](docs/ChannelsApi.md#apiV2ChannelUuidGet) | **GET** /api/v2/channel/{uuid} | Get Channel
*CurrenciesApi* | [**listCurrenciesCrypto**](docs/CurrenciesApi.md#listCurrenciesCrypto) | **GET** /api/currency/crypto | List Crypto Currencies
*CurrenciesApi* | [**listCurrenciesDeposit**](docs/CurrenciesApi.md#listCurrenciesDeposit) | **GET** /api/currency/deposit | List Wallet Currencies
*CurrenciesApi* | [**listCurrenciesFiat**](docs/CurrenciesApi.md#listCurrenciesFiat) | **GET** /api/currency/fiat | List Fiat Currencies
*MerchantIdsApi* | [**merchantIdCreate**](docs/MerchantIdsApi.md#merchantIdCreate) | **POST** /api/v1/merchant | Create Merchant ID
*MerchantIdsApi* | [**merchantIdList**](docs/MerchantIdsApi.md#merchantIdList) | **GET** /api/v1/merchant | List Merchant IDs
*PaymentsApi* | [**apiV1PaySummaryGet**](docs/PaymentsApi.md#apiV1PaySummaryGet) | **GET** /api/v1/pay/summary | List Payments
*PaymentsApi* | [**apiV1PaySummaryPost**](docs/PaymentsApi.md#apiV1PaySummaryPost) | **POST** /api/v1/pay/summary | Create payment
*PaymentsApi* | [**apiV1PayUuidSummaryGet**](docs/PaymentsApi.md#apiV1PayUuidSummaryGet) | **GET** /api/v1/pay/{uuid}/summary | Get Payment
*PaymentsApi* | [**apiV1PayValidatePut**](docs/PaymentsApi.md#apiV1PayValidatePut) | **PUT** /api/v1/pay/validate | Validate Address
*TradingAndConversionsApi* | [**quoteAccept**](docs/TradingAndConversionsApi.md#quoteAccept) | **PUT** /api/v1/quote/accept/{uuid} | Accept Quote
*TradingAndConversionsApi* | [**quoteCreate**](docs/TradingAndConversionsApi.md#quoteCreate) | **POST** /api/v1/quote | Create Quote
*TradingAndConversionsApi* | [**quoteList**](docs/TradingAndConversionsApi.md#quoteList) | **GET** /api/v1/quote/{merchantId} | List Quotes
*TradingAndConversionsApi* | [**quoteRead**](docs/TradingAndConversionsApi.md#quoteRead) | **GET** /api/v1/quote/{uuid} | Read Quote
*WalletsApi* | [**transactionReport**](docs/WalletsApi.md#transactionReport) | **GET** /api/transaction/report | Transactions Report
*WalletsApi* | [**walletBalanceList**](docs/WalletsApi.md#walletBalanceList) | **GET** /api/wallet/balances | List Wallet Balances
*WalletsApi* | [**walletCreate**](docs/WalletsApi.md#walletCreate) | **POST** /api/wallet | Create Wallet
*WalletsApi* | [**walletList**](docs/WalletsApi.md#walletList) | **GET** /api/wallet | List Wallets
*WalletsApi* | [**walletRGet**](docs/WalletsApi.md#walletRGet) | **GET** /api/wallet/{id} | Get Wallet


## Documentation for Models

 - [AcceptedQuote](docs/AcceptedQuote.md)
 - [AccountMethod](docs/AccountMethod.md)
 - [AlternativeAddress](docs/AlternativeAddress.md)
 - [Balance](docs/Balance.md)
 - [ClientValidationErrorDto](docs/ClientValidationErrorDto.md)
 - [CryptoAddressDto](docs/CryptoAddressDto.md)
 - [Currency](docs/Currency.md)
 - [CurrencyFiat](docs/CurrencyFiat.md)
 - [CurrencyOptions](docs/CurrencyOptions.md)
 - [CurrencyProtocol](docs/CurrencyProtocol.md)
 - [DirectionDto](docs/DirectionDto.md)
 - [ExchangeRateDto](docs/ExchangeRateDto.md)
 - [ExternalCurrencyWithdrawalParameter](docs/ExternalCurrencyWithdrawalParameter.md)
 - [Fee](docs/Fee.md)
 - [Fees](docs/Fees.md)
 - [Form](docs/Form.md)
 - [GatewayTransactionDto](docs/GatewayTransactionDto.md)
 - [Merchant](docs/Merchant.md)
 - [MerchantChannel](docs/MerchantChannel.md)
 - [MerchantChannelPayment](docs/MerchantChannelPayment.md)
 - [MerchantChannelRequest](docs/MerchantChannelRequest.md)
 - [MerchantIdCreateRequest](docs/MerchantIdCreateRequest.md)
 - [MerchantIdCreateRequestWallet](docs/MerchantIdCreateRequestWallet.md)
 - [NetworkFee](docs/NetworkFee.md)
 - [PayAmountsDto](docs/PayAmountsDto.md)
 - [PayInDetailDto](docs/PayInDetailDto.md)
 - [PayInInstruction](docs/PayInInstruction.md)
 - [PayInMethod](docs/PayInMethod.md)
 - [PayOutDetailDto](docs/PayOutDetailDto.md)
 - [PayOutInstruction](docs/PayOutInstruction.md)
 - [PayOutMethod](docs/PayOutMethod.md)
 - [PayRequestDto](docs/PayRequestDto.md)
 - [PaymentLeg](docs/PaymentLeg.md)
 - [PaymentStatusDto](docs/PaymentStatusDto.md)
 - [Quote](docs/Quote.md)
 - [QuoteRequest](docs/QuoteRequest.md)
 - [ServerErrorDto](docs/ServerErrorDto.md)
 - [SummaryPaymentDto](docs/SummaryPaymentDto.md)
 - [TransactionReport](docs/TransactionReport.md)
 - [TransactionReportRequestData](docs/TransactionReportRequestData.md)
 - [ValidationErrorDto](docs/ValidationErrorDto.md)
 - [Wallet](docs/Wallet.md)
 - [WalletRequest](docs/WalletRequest.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Hawk"></a>
### Hawk

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



