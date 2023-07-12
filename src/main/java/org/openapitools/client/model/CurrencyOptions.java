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
 * CurrencyOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T21:04:47.186508+02:00[Africa/Johannesburg]")
public class CurrencyOptions {
  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private String transaction;

  public static final String SERIALIZED_NAME_EXPLORER = "explorer";
  @SerializedName(SERIALIZED_NAME_EXPLORER)
  private String explorer;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CONFIRMATIONS = "confirmations";
  @SerializedName(SERIALIZED_NAME_CONFIRMATIONS)
  private Integer confirmations;

  public CurrencyOptions() {
  }

  public CurrencyOptions transaction(String transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nullable
  public String getTransaction() {
    return transaction;
  }


  public void setTransaction(String transaction) {
    this.transaction = transaction;
  }


  public CurrencyOptions explorer(String explorer) {
    
    this.explorer = explorer;
    return this;
  }

   /**
   * Get explorer
   * @return explorer
  **/
  @javax.annotation.Nullable
  public String getExplorer() {
    return explorer;
  }


  public void setExplorer(String explorer) {
    this.explorer = explorer;
  }


  public CurrencyOptions address(String address) {
    
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


  public CurrencyOptions confirmations(Integer confirmations) {
    
    this.confirmations = confirmations;
    return this;
  }

   /**
   * Get confirmations
   * @return confirmations
  **/
  @javax.annotation.Nullable
  public Integer getConfirmations() {
    return confirmations;
  }


  public void setConfirmations(Integer confirmations) {
    this.confirmations = confirmations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyOptions currencyOptions = (CurrencyOptions) o;
    return Objects.equals(this.transaction, currencyOptions.transaction) &&
        Objects.equals(this.explorer, currencyOptions.explorer) &&
        Objects.equals(this.address, currencyOptions.address) &&
        Objects.equals(this.confirmations, currencyOptions.confirmations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transaction, explorer, address, confirmations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyOptions {\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    explorer: ").append(toIndentedString(explorer)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    confirmations: ").append(toIndentedString(confirmations)).append("\n");
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
    openapiFields.add("transaction");
    openapiFields.add("explorer");
    openapiFields.add("address");
    openapiFields.add("confirmations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CurrencyOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CurrencyOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CurrencyOptions is not found in the empty JSON string", CurrencyOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CurrencyOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CurrencyOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("transaction") != null && !jsonObj.get("transaction").isJsonNull()) && !jsonObj.get("transaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction").toString()));
      }
      if ((jsonObj.get("explorer") != null && !jsonObj.get("explorer").isJsonNull()) && !jsonObj.get("explorer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `explorer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("explorer").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CurrencyOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CurrencyOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CurrencyOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CurrencyOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<CurrencyOptions>() {
           @Override
           public void write(JsonWriter out, CurrencyOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CurrencyOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CurrencyOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CurrencyOptions
  * @throws IOException if the JSON string is invalid with respect to CurrencyOptions
  */
  public static CurrencyOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CurrencyOptions.class);
  }

 /**
  * Convert an instance of CurrencyOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

