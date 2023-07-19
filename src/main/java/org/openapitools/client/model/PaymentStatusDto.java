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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Payment status
 */
@JsonAdapter(PaymentStatusDto.Adapter.class)
public enum PaymentStatusDto {
  
  PENDING("PENDING"),
  
  PROCESSING("PROCESSING"),
  
  CANCELLED("CANCELLED"),
  
  COMPLETE("COMPLETE"),
  
  UNDERPAID("UNDERPAID"),
  
  OVERPAID("OVERPAID"),
  
  EXPIRED("EXPIRED");

  private String value;

  PaymentStatusDto(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentStatusDto fromValue(String value) {
    for (PaymentStatusDto b : PaymentStatusDto.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PaymentStatusDto> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentStatusDto enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentStatusDto read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentStatusDto.fromValue(value);
    }
  }
}

