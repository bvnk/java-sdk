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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.AlternativeAddress;

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
 * MerchantChannel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T21:04:47.186508+02:00[Africa/Johannesburg]")
public class MerchantChannel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = 0;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private Integer dateCreated = 0;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private Integer lastUpdated = 0;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchantId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_WALLET_CURRENCY = "walletCurrency";
  @SerializedName(SERIALIZED_NAME_WALLET_CURRENCY)
  private String walletCurrency;

  public static final String SERIALIZED_NAME_DISPLAY_CURRENCY = "displayCurrency";
  @SerializedName(SERIALIZED_NAME_DISPLAY_CURRENCY)
  private String displayCurrency;

  public static final String SERIALIZED_NAME_PAY_CURRENCY = "payCurrency";
  @SerializedName(SERIALIZED_NAME_PAY_CURRENCY)
  private String payCurrency;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    OPEN("OPEN"),
    
    CLOSED("CLOSED");

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

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirectUrl";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_ALTERNATIVES = "alternatives";
  @SerializedName(SERIALIZED_NAME_ALTERNATIVES)
  private List<AlternativeAddress> alternatives;

  public MerchantChannel() {
  }

  public MerchantChannel id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public MerchantChannel dateCreated(Integer dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  public Integer getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(Integer dateCreated) {
    this.dateCreated = dateCreated;
  }


  public MerchantChannel lastUpdated(Integer lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  public Integer getLastUpdated() {
    return lastUpdated;
  }


  public void setLastUpdated(Integer lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public MerchantChannel merchantId(String merchantId) {
    
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


  public MerchantChannel walletCurrency(String walletCurrency) {
    
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


  public MerchantChannel displayCurrency(String displayCurrency) {
    
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


  public MerchantChannel payCurrency(String payCurrency) {
    
    this.payCurrency = payCurrency;
    return this;
  }

   /**
   * Get payCurrency
   * @return payCurrency
  **/
  @javax.annotation.Nullable
  public String getPayCurrency() {
    return payCurrency;
  }


  public void setPayCurrency(String payCurrency) {
    this.payCurrency = payCurrency;
  }


  public MerchantChannel address(String address) {
    
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


  public MerchantChannel tag(String tag) {
    
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


  public MerchantChannel protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public MerchantChannel reference(String reference) {
    
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


  public MerchantChannel status(StatusEnum status) {
    
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


  public MerchantChannel uuid(String uuid) {
    
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


  public MerchantChannel redirectUrl(String redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  public MerchantChannel uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public MerchantChannel alternatives(List<AlternativeAddress> alternatives) {
    
    this.alternatives = alternatives;
    return this;
  }

  public MerchantChannel addAlternativesItem(AlternativeAddress alternativesItem) {
    if (this.alternatives == null) {
      this.alternatives = new ArrayList<>();
    }
    this.alternatives.add(alternativesItem);
    return this;
  }

   /**
   * Get alternatives
   * @return alternatives
  **/
  @javax.annotation.Nullable
  public List<AlternativeAddress> getAlternatives() {
    return alternatives;
  }


  public void setAlternatives(List<AlternativeAddress> alternatives) {
    this.alternatives = alternatives;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantChannel merchantChannel = (MerchantChannel) o;
    return Objects.equals(this.id, merchantChannel.id) &&
        Objects.equals(this.dateCreated, merchantChannel.dateCreated) &&
        Objects.equals(this.lastUpdated, merchantChannel.lastUpdated) &&
        Objects.equals(this.merchantId, merchantChannel.merchantId) &&
        Objects.equals(this.walletCurrency, merchantChannel.walletCurrency) &&
        Objects.equals(this.displayCurrency, merchantChannel.displayCurrency) &&
        Objects.equals(this.payCurrency, merchantChannel.payCurrency) &&
        Objects.equals(this.address, merchantChannel.address) &&
        Objects.equals(this.tag, merchantChannel.tag) &&
        Objects.equals(this.protocol, merchantChannel.protocol) &&
        Objects.equals(this.reference, merchantChannel.reference) &&
        Objects.equals(this.status, merchantChannel.status) &&
        Objects.equals(this.uuid, merchantChannel.uuid) &&
        Objects.equals(this.redirectUrl, merchantChannel.redirectUrl) &&
        Objects.equals(this.uri, merchantChannel.uri) &&
        Objects.equals(this.alternatives, merchantChannel.alternatives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, lastUpdated, merchantId, walletCurrency, displayCurrency, payCurrency, address, tag, protocol, reference, status, uuid, redirectUrl, uri, alternatives);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantChannel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    walletCurrency: ").append(toIndentedString(walletCurrency)).append("\n");
    sb.append("    displayCurrency: ").append(toIndentedString(displayCurrency)).append("\n");
    sb.append("    payCurrency: ").append(toIndentedString(payCurrency)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    alternatives: ").append(toIndentedString(alternatives)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("dateCreated");
    openapiFields.add("lastUpdated");
    openapiFields.add("merchantId");
    openapiFields.add("walletCurrency");
    openapiFields.add("displayCurrency");
    openapiFields.add("payCurrency");
    openapiFields.add("address");
    openapiFields.add("tag");
    openapiFields.add("protocol");
    openapiFields.add("reference");
    openapiFields.add("status");
    openapiFields.add("uuid");
    openapiFields.add("redirectUrl");
    openapiFields.add("uri");
    openapiFields.add("alternatives");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantChannel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MerchantChannel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantChannel is not found in the empty JSON string", MerchantChannel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantChannel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantChannel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("merchantId") != null && !jsonObj.get("merchantId").isJsonNull()) && !jsonObj.get("merchantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantId").toString()));
      }
      if ((jsonObj.get("walletCurrency") != null && !jsonObj.get("walletCurrency").isJsonNull()) && !jsonObj.get("walletCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("walletCurrency").toString()));
      }
      if ((jsonObj.get("displayCurrency") != null && !jsonObj.get("displayCurrency").isJsonNull()) && !jsonObj.get("displayCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayCurrency").toString()));
      }
      if ((jsonObj.get("payCurrency") != null && !jsonObj.get("payCurrency").isJsonNull()) && !jsonObj.get("payCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payCurrency").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) && !jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
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
      if ((jsonObj.get("redirectUrl") != null && !jsonObj.get("redirectUrl").isJsonNull()) && !jsonObj.get("redirectUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirectUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirectUrl").toString()));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if (jsonObj.get("alternatives") != null && !jsonObj.get("alternatives").isJsonNull()) {
        JsonArray jsonArrayalternatives = jsonObj.getAsJsonArray("alternatives");
        if (jsonArrayalternatives != null) {
          // ensure the json data is an array
          if (!jsonObj.get("alternatives").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `alternatives` to be an array in the JSON string but got `%s`", jsonObj.get("alternatives").toString()));
          }

          // validate the optional field `alternatives` (array)
          for (int i = 0; i < jsonArrayalternatives.size(); i++) {
            AlternativeAddress.validateJsonObject(jsonArrayalternatives.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantChannel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantChannel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantChannel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantChannel.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantChannel>() {
           @Override
           public void write(JsonWriter out, MerchantChannel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantChannel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantChannel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantChannel
  * @throws IOException if the JSON string is invalid with respect to MerchantChannel
  */
  public static MerchantChannel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantChannel.class);
  }

 /**
  * Convert an instance of MerchantChannel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

