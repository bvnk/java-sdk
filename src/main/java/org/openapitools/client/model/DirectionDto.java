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
 * Payment in or payment out
 */
@JsonAdapter(DirectionDto.Adapter.class)
public enum DirectionDto {
  
  IN("IN"),
  
  OUT("OUT");

  private String value;

  DirectionDto(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DirectionDto fromValue(String value) {
    for (DirectionDto b : DirectionDto.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DirectionDto> {
    @Override
    public void write(final JsonWriter jsonWriter, final DirectionDto enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DirectionDto read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DirectionDto.fromValue(value);
    }
  }
}

