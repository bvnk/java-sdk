/*
 * BVNK API Endpoints
 * The BVNK API is designed to facilitate seamless and secure transactions including payments, channels, anddigital wallet transactions.
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ExchangeRateDto;
import org.openapitools.client.model.NetworkFee;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * MerchantChannelPayment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T21:04:47.186508+02:00[Africa/Johannesburg]")
public class MerchantChannelPayment {
  public static final String SERIALIZED_NAME_CHANNEL_ID = "channelId";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private String channelId;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchantId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_MERCHANT_DISPLAY_NAME = "merchantDisplayName";
  @SerializedName(SERIALIZED_NAME_MERCHANT_DISPLAY_NAME)
  private String merchantDisplayName;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private Long dateCreated = 0l;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private Long lastUpdated = 0l;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DETECTED("DETECTED"),
    
    COMPLETE("COMPLETE"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_PAID_CURRENCY = "paidCurrency";
  @SerializedName(SERIALIZED_NAME_PAID_CURRENCY)
  private String paidCurrency;

  public static final String SERIALIZED_NAME_DISPLAY_CURRENCY = "displayCurrency";
  @SerializedName(SERIALIZED_NAME_DISPLAY_CURRENCY)
  private String displayCurrency;

  public static final String SERIALIZED_NAME_WALLET_CURRENCY = "walletCurrency";
  @SerializedName(SERIALIZED_NAME_WALLET_CURRENCY)
  private String walletCurrency;

  public static final String SERIALIZED_NAME_FEE_CURRENCY = "feeCurrency";
  @SerializedName(SERIALIZED_NAME_FEE_CURRENCY)
  private String feeCurrency;

  public static final String SERIALIZED_NAME_PAID_AMOUNT = "paidAmount";
  @SerializedName(SERIALIZED_NAME_PAID_AMOUNT)
  private BigDecimal paidAmount = new BigDecimal("0");

  public static final String SERIALIZED_NAME_DISPLAY_AMOUNT = "displayAmount";
  @SerializedName(SERIALIZED_NAME_DISPLAY_AMOUNT)
  private BigDecimal displayAmount = new BigDecimal("0");

  public static final String SERIALIZED_NAME_WALLET_AMOUNT = "walletAmount";
  @SerializedName(SERIALIZED_NAME_WALLET_AMOUNT)
  private BigDecimal walletAmount = new BigDecimal("0");

  public static final String SERIALIZED_NAME_FEE_AMOUNT = "feeAmount";
  @SerializedName(SERIALIZED_NAME_FEE_AMOUNT)
  private BigDecimal feeAmount = new BigDecimal("0");

  public static final String SERIALIZED_NAME_EXCHANGE_RATE = "exchangeRate";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE)
  private ExchangeRateDto exchangeRate;

  public static final String SERIALIZED_NAME_DISPLAY_RATE = "displayRate";
  @SerializedName(SERIALIZED_NAME_DISPLAY_RATE)
  private ExchangeRateDto displayRate;

  public static final String SERIALIZED_NAME_RISK = "risk";
  @SerializedName(SERIALIZED_NAME_RISK)
  private ExchangeRateDto risk;

  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<String> sources;

  public static final String SERIALIZED_NAME_NETWORK_FEE = "networkFee";
  @SerializedName(SERIALIZED_NAME_NETWORK_FEE)
  private NetworkFee networkFee;

  public MerchantChannelPayment() {
  }

  public MerchantChannelPayment channelId(String channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @javax.annotation.Nullable
  public String getChannelId() {
    return channelId;
  }


  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public MerchantChannelPayment merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  @javax.annotation.Nullable
  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public MerchantChannelPayment merchantDisplayName(String merchantDisplayName) {
    
    this.merchantDisplayName = merchantDisplayName;
    return this;
  }

   /**
   * Get merchantDisplayName
   * @return merchantDisplayName
  **/
  @javax.annotation.Nullable
  public String getMerchantDisplayName() {
    return merchantDisplayName;
  }


  public void setMerchantDisplayName(String merchantDisplayName) {
    this.merchantDisplayName = merchantDisplayName;
  }


  public MerchantChannelPayment reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public MerchantChannelPayment dateCreated(Long dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  public Long getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
  }


  public MerchantChannelPayment lastUpdated(Long lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  public Long getLastUpdated() {
    return lastUpdated;
  }


  public void setLastUpdated(Long lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public MerchantChannelPayment status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public MerchantChannelPayment uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public MerchantChannelPayment hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @javax.annotation.Nullable
  public String getHash() {
    return hash;
  }


  public void setHash(String hash) {
    this.hash = hash;
  }


  public MerchantChannelPayment address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public MerchantChannelPayment tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public MerchantChannelPayment paidCurrency(String paidCurrency) {
    
    this.paidCurrency = paidCurrency;
    return this;
  }

   /**
   * Get paidCurrency
   * @return paidCurrency
  **/
  @javax.annotation.Nullable
  public String getPaidCurrency() {
    return paidCurrency;
  }


  public void setPaidCurrency(String paidCurrency) {
    this.paidCurrency = paidCurrency;
  }


  public MerchantChannelPayment displayCurrency(String displayCurrency) {
    
    this.displayCurrency = displayCurrency;
    return this;
  }

   /**
   * Get displayCurrency
   * @return displayCurrency
  **/
  @javax.annotation.Nullable
  public String getDisplayCurrency() {
    return displayCurrency;
  }


  public void setDisplayCurrency(String displayCurrency) {
    this.displayCurrency = displayCurrency;
  }


  public MerchantChannelPayment walletCurrency(String walletCurrency) {
    
    this.walletCurrency = walletCurrency;
    return this;
  }

   /**
   * Get walletCurrency
   * @return walletCurrency
  **/
  @javax.annotation.Nullable
  public String getWalletCurrency() {
    return walletCurrency;
  }


  public void setWalletCurrency(String walletCurrency) {
    this.walletCurrency = walletCurrency;
  }


  public MerchantChannelPayment feeCurrency(String feeCurrency) {
    
    this.feeCurrency = feeCurrency;
    return this;
  }

   /**
   * Get feeCurrency
   * @return feeCurrency
  **/
  @javax.annotation.Nullable
  public String getFeeCurrency() {
    return feeCurrency;
  }


  public void setFeeCurrency(String feeCurrency) {
    this.feeCurrency = feeCurrency;
  }


  public MerchantChannelPayment paidAmount(BigDecimal paidAmount) {
    
    this.paidAmount = paidAmount;
    return this;
  }

   /**
   * Get paidAmount
   * @return paidAmount
  **/
  @javax.annotation.Nullable
  public BigDecimal getPaidAmount() {
    return paidAmount;
  }


  public void setPaidAmount(BigDecimal paidAmount) {
    this.paidAmount = paidAmount;
  }


  public MerchantChannelPayment displayAmount(BigDecimal displayAmount) {
    
    this.displayAmount = displayAmount;
    return this;
  }

   /**
   * Get displayAmount
   * @return displayAmount
  **/
  @javax.annotation.Nullable
  public BigDecimal getDisplayAmount() {
    return displayAmount;
  }


  public void setDisplayAmount(BigDecimal displayAmount) {
    this.displayAmount = displayAmount;
  }


  public MerchantChannelPayment walletAmount(BigDecimal walletAmount) {
    
    this.walletAmount = walletAmount;
    return this;
  }

   /**
   * Get walletAmount
   * @return walletAmount
  **/
  @javax.annotation.Nullable
  public BigDecimal getWalletAmount() {
    return walletAmount;
  }


  public void setWalletAmount(BigDecimal walletAmount) {
    this.walletAmount = walletAmount;
  }


  public MerchantChannelPayment feeAmount(BigDecimal feeAmount) {
    
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * Get feeAmount
   * @return feeAmount
  **/
  @javax.annotation.Nullable
  public BigDecimal getFeeAmount() {
    return feeAmount;
  }


  public void setFeeAmount(BigDecimal feeAmount) {
    this.feeAmount = feeAmount;
  }


  public MerchantChannelPayment exchangeRate(ExchangeRateDto exchangeRate) {
    
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * Get exchangeRate
   * @return exchangeRate
  **/
  @javax.annotation.Nullable
  public ExchangeRateDto getExchangeRate() {
    return exchangeRate;
  }


  public void setExchangeRate(ExchangeRateDto exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  public MerchantChannelPayment displayRate(ExchangeRateDto displayRate) {
    
    this.displayRate = displayRate;
    return this;
  }

   /**
   * Get displayRate
   * @return displayRate
  **/
  @javax.annotation.Nullable
  public ExchangeRateDto getDisplayRate() {
    return displayRate;
  }


  public void setDisplayRate(ExchangeRateDto displayRate) {
    this.displayRate = displayRate;
  }


  public MerchantChannelPayment risk(ExchangeRateDto risk) {
    
    this.risk = risk;
    return this;
  }

   /**
   * Get risk
   * @return risk
  **/
  @javax.annotation.Nullable
  public ExchangeRateDto getRisk() {
    return risk;
  }


  public void setRisk(ExchangeRateDto risk) {
    this.risk = risk;
  }


  public MerchantChannelPayment sources(List<String> sources) {
    
    this.sources = sources;
    return this;
  }

  public MerchantChannelPayment addSourcesItem(String sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Get sources
   * @return sources
  **/
  @javax.annotation.Nullable
  public List<String> getSources() {
    return sources;
  }


  public void setSources(List<String> sources) {
    this.sources = sources;
  }


  public MerchantChannelPayment networkFee(NetworkFee networkFee) {
    
    this.networkFee = networkFee;
    return this;
  }

   /**
   * Get networkFee
   * @return networkFee
  **/
  @javax.annotation.Nullable
  public NetworkFee getNetworkFee() {
    return networkFee;
  }


  public void setNetworkFee(NetworkFee networkFee) {
    this.networkFee = networkFee;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantChannelPayment merchantChannelPayment = (MerchantChannelPayment) o;
    return Objects.equals(this.channelId, merchantChannelPayment.channelId) &&
        Objects.equals(this.merchantId, merchantChannelPayment.merchantId) &&
        Objects.equals(this.merchantDisplayName, merchantChannelPayment.merchantDisplayName) &&
        Objects.equals(this.reference, merchantChannelPayment.reference) &&
        Objects.equals(this.dateCreated, merchantChannelPayment.dateCreated) &&
        Objects.equals(this.lastUpdated, merchantChannelPayment.lastUpdated) &&
        Objects.equals(this.status, merchantChannelPayment.status) &&
        Objects.equals(this.uuid, merchantChannelPayment.uuid) &&
        Objects.equals(this.hash, merchantChannelPayment.hash) &&
        Objects.equals(this.address, merchantChannelPayment.address) &&
        Objects.equals(this.tag, merchantChannelPayment.tag) &&
        Objects.equals(this.paidCurrency, merchantChannelPayment.paidCurrency) &&
        Objects.equals(this.displayCurrency, merchantChannelPayment.displayCurrency) &&
        Objects.equals(this.walletCurrency, merchantChannelPayment.walletCurrency) &&
        Objects.equals(this.feeCurrency, merchantChannelPayment.feeCurrency) &&
        Objects.equals(this.paidAmount, merchantChannelPayment.paidAmount) &&
        Objects.equals(this.displayAmount, merchantChannelPayment.displayAmount) &&
        Objects.equals(this.walletAmount, merchantChannelPayment.walletAmount) &&
        Objects.equals(this.feeAmount, merchantChannelPayment.feeAmount) &&
        Objects.equals(this.exchangeRate, merchantChannelPayment.exchangeRate) &&
        Objects.equals(this.displayRate, merchantChannelPayment.displayRate) &&
        Objects.equals(this.risk, merchantChannelPayment.risk) &&
        Objects.equals(this.sources, merchantChannelPayment.sources) &&
        Objects.equals(this.networkFee, merchantChannelPayment.networkFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, merchantId, merchantDisplayName, reference, dateCreated, lastUpdated, status, uuid, hash, address, tag, paidCurrency, displayCurrency, walletCurrency, feeCurrency, paidAmount, displayAmount, walletAmount, feeAmount, exchangeRate, displayRate, risk, sources, networkFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantChannelPayment {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantDisplayName: ").append(toIndentedString(merchantDisplayName)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    paidCurrency: ").append(toIndentedString(paidCurrency)).append("\n");
    sb.append("    displayCurrency: ").append(toIndentedString(displayCurrency)).append("\n");
    sb.append("    walletCurrency: ").append(toIndentedString(walletCurrency)).append("\n");
    sb.append("    feeCurrency: ").append(toIndentedString(feeCurrency)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    displayAmount: ").append(toIndentedString(displayAmount)).append("\n");
    sb.append("    walletAmount: ").append(toIndentedString(walletAmount)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    displayRate: ").append(toIndentedString(displayRate)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    networkFee: ").append(toIndentedString(networkFee)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("channelId");
    openapiFields.add("merchantId");
    openapiFields.add("merchantDisplayName");
    openapiFields.add("reference");
    openapiFields.add("dateCreated");
    openapiFields.add("lastUpdated");
    openapiFields.add("status");
    openapiFields.add("uuid");
    openapiFields.add("hash");
    openapiFields.add("address");
    openapiFields.add("tag");
    openapiFields.add("paidCurrency");
    openapiFields.add("displayCurrency");
    openapiFields.add("walletCurrency");
    openapiFields.add("feeCurrency");
    openapiFields.add("paidAmount");
    openapiFields.add("displayAmount");
    openapiFields.add("walletAmount");
    openapiFields.add("feeAmount");
    openapiFields.add("exchangeRate");
    openapiFields.add("displayRate");
    openapiFields.add("risk");
    openapiFields.add("sources");
    openapiFields.add("networkFee");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantChannelPayment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MerchantChannelPayment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantChannelPayment is not found in the empty JSON string", MerchantChannelPayment.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantChannelPayment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantChannelPayment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("channelId") != null && !jsonObj.get("channelId").isJsonNull()) && !jsonObj.get("channelId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channelId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channelId").toString()));
      }
      if ((jsonObj.get("merchantId") != null && !jsonObj.get("merchantId").isJsonNull()) && !jsonObj.get("merchantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantId").toString()));
      }
      if ((jsonObj.get("merchantDisplayName") != null && !jsonObj.get("merchantDisplayName").isJsonNull()) && !jsonObj.get("merchantDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantDisplayName").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("hash") != null && !jsonObj.get("hash").isJsonNull()) && !jsonObj.get("hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hash").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("paidCurrency") != null && !jsonObj.get("paidCurrency").isJsonNull()) && !jsonObj.get("paidCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paidCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paidCurrency").toString()));
      }
      if ((jsonObj.get("displayCurrency") != null && !jsonObj.get("displayCurrency").isJsonNull()) && !jsonObj.get("displayCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayCurrency").toString()));
      }
      if ((jsonObj.get("walletCurrency") != null && !jsonObj.get("walletCurrency").isJsonNull()) && !jsonObj.get("walletCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("walletCurrency").toString()));
      }
      if ((jsonObj.get("feeCurrency") != null && !jsonObj.get("feeCurrency").isJsonNull()) && !jsonObj.get("feeCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feeCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feeCurrency").toString()));
      }
      // validate the optional field `exchangeRate`
      if (jsonObj.get("exchangeRate") != null && !jsonObj.get("exchangeRate").isJsonNull()) {
        ExchangeRateDto.validateJsonObject(jsonObj.getAsJsonObject("exchangeRate"));
      }
      // validate the optional field `displayRate`
      if (jsonObj.get("displayRate") != null && !jsonObj.get("displayRate").isJsonNull()) {
        ExchangeRateDto.validateJsonObject(jsonObj.getAsJsonObject("displayRate"));
      }
      // validate the optional field `risk`
      if (jsonObj.get("risk") != null && !jsonObj.get("risk").isJsonNull()) {
        ExchangeRateDto.validateJsonObject(jsonObj.getAsJsonObject("risk"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sources") != null && !jsonObj.get("sources").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sources` to be an array in the JSON string but got `%s`", jsonObj.get("sources").toString()));
      }
      // validate the optional field `networkFee`
      if (jsonObj.get("networkFee") != null && !jsonObj.get("networkFee").isJsonNull()) {
        NetworkFee.validateJsonObject(jsonObj.getAsJsonObject("networkFee"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantChannelPayment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantChannelPayment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantChannelPayment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantChannelPayment.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantChannelPayment>() {
           @Override
           public void write(JsonWriter out, MerchantChannelPayment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantChannelPayment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantChannelPayment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantChannelPayment
  * @throws IOException if the JSON string is invalid with respect to MerchantChannelPayment
  */
  public static MerchantChannelPayment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantChannelPayment.class);
  }

 /**
  * Convert an instance of MerchantChannelPayment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
