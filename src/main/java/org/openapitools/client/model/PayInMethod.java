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
import org.openapitools.client.model.AccountMethod;

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
 * PayInMethod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T21:04:47.186508+02:00[Africa/Johannesburg]")
public class PayInMethod {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_SETTLEMENT_CURRENCY = "settlementCurrency";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_CURRENCY)
  private String settlementCurrency;

  public static final String SERIALIZED_NAME_REQUESTED_CURRENCY = "requestedCurrency";
  @SerializedName(SERIALIZED_NAME_REQUESTED_CURRENCY)
  private String requestedCurrency;

  public static final String SERIALIZED_NAME_ESTIMATED_EXCHANGE_RATE = "estimatedExchangeRate";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_EXCHANGE_RATE)
  private BigDecimal estimatedExchangeRate;

  public static final String SERIALIZED_NAME_ACCOUNT_METHODS = "accountMethods";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_METHODS)
  private List<AccountMethod> accountMethods;

  public PayInMethod() {
  }

  public PayInMethod id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public PayInMethod code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public PayInMethod settlementCurrency(String settlementCurrency) {
    
    this.settlementCurrency = settlementCurrency;
    return this;
  }

   /**
   * Get settlementCurrency
   * @return settlementCurrency
  **/
  @javax.annotation.Nullable
  public String getSettlementCurrency() {
    return settlementCurrency;
  }


  public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }


  public PayInMethod requestedCurrency(String requestedCurrency) {
    
    this.requestedCurrency = requestedCurrency;
    return this;
  }

   /**
   * Get requestedCurrency
   * @return requestedCurrency
  **/
  @javax.annotation.Nullable
  public String getRequestedCurrency() {
    return requestedCurrency;
  }


  public void setRequestedCurrency(String requestedCurrency) {
    this.requestedCurrency = requestedCurrency;
  }


  public PayInMethod estimatedExchangeRate(BigDecimal estimatedExchangeRate) {
    
    this.estimatedExchangeRate = estimatedExchangeRate;
    return this;
  }

   /**
   * Get estimatedExchangeRate
   * @return estimatedExchangeRate
  **/
  @javax.annotation.Nullable
  public BigDecimal getEstimatedExchangeRate() {
    return estimatedExchangeRate;
  }


  public void setEstimatedExchangeRate(BigDecimal estimatedExchangeRate) {
    this.estimatedExchangeRate = estimatedExchangeRate;
  }


  public PayInMethod accountMethods(List<AccountMethod> accountMethods) {
    
    this.accountMethods = accountMethods;
    return this;
  }

  public PayInMethod addAccountMethodsItem(AccountMethod accountMethodsItem) {
    if (this.accountMethods == null) {
      this.accountMethods = new ArrayList<>();
    }
    this.accountMethods.add(accountMethodsItem);
    return this;
  }

   /**
   * Get accountMethods
   * @return accountMethods
  **/
  @javax.annotation.Nullable
  public List<AccountMethod> getAccountMethods() {
    return accountMethods;
  }


  public void setAccountMethods(List<AccountMethod> accountMethods) {
    this.accountMethods = accountMethods;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayInMethod payInMethod = (PayInMethod) o;
    return Objects.equals(this.id, payInMethod.id) &&
        Objects.equals(this.code, payInMethod.code) &&
        Objects.equals(this.settlementCurrency, payInMethod.settlementCurrency) &&
        Objects.equals(this.requestedCurrency, payInMethod.requestedCurrency) &&
        Objects.equals(this.estimatedExchangeRate, payInMethod.estimatedExchangeRate) &&
        Objects.equals(this.accountMethods, payInMethod.accountMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, settlementCurrency, requestedCurrency, estimatedExchangeRate, accountMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayInMethod {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    settlementCurrency: ").append(toIndentedString(settlementCurrency)).append("\n");
    sb.append("    requestedCurrency: ").append(toIndentedString(requestedCurrency)).append("\n");
    sb.append("    estimatedExchangeRate: ").append(toIndentedString(estimatedExchangeRate)).append("\n");
    sb.append("    accountMethods: ").append(toIndentedString(accountMethods)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("settlementCurrency");
    openapiFields.add("requestedCurrency");
    openapiFields.add("estimatedExchangeRate");
    openapiFields.add("accountMethods");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayInMethod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayInMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayInMethod is not found in the empty JSON string", PayInMethod.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PayInMethod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PayInMethod` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("settlementCurrency") != null && !jsonObj.get("settlementCurrency").isJsonNull()) && !jsonObj.get("settlementCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlementCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlementCurrency").toString()));
      }
      if ((jsonObj.get("requestedCurrency") != null && !jsonObj.get("requestedCurrency").isJsonNull()) && !jsonObj.get("requestedCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestedCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestedCurrency").toString()));
      }
      if (jsonObj.get("accountMethods") != null && !jsonObj.get("accountMethods").isJsonNull()) {
        JsonArray jsonArrayaccountMethods = jsonObj.getAsJsonArray("accountMethods");
        if (jsonArrayaccountMethods != null) {
          // ensure the json data is an array
          if (!jsonObj.get("accountMethods").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `accountMethods` to be an array in the JSON string but got `%s`", jsonObj.get("accountMethods").toString()));
          }

          // validate the optional field `accountMethods` (array)
          for (int i = 0; i < jsonArrayaccountMethods.size(); i++) {
            AccountMethod.validateJsonObject(jsonArrayaccountMethods.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayInMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayInMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayInMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayInMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<PayInMethod>() {
           @Override
           public void write(JsonWriter out, PayInMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PayInMethod read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PayInMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayInMethod
  * @throws IOException if the JSON string is invalid with respect to PayInMethod
  */
  public static PayInMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayInMethod.class);
  }

 /**
  * Convert an instance of PayInMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

