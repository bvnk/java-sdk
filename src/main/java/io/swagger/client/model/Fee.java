/*
 * BVNK API Endpoints
 * The BVNK API is designed to facilitate seamless and secure transactions including payments, channels, anddigital wallet transactions.
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * Fee
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-05T20:47:27.517449+02:00[Africa/Johannesburg]")

public class Fee {
  @SerializedName("service")
  private BigDecimal service = null;

  @SerializedName("processing")
  private BigDecimal processing = null;

  public Fee service(BigDecimal service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @Schema(description = "")
  public BigDecimal getService() {
    return service;
  }

  public void setService(BigDecimal service) {
    this.service = service;
  }

  public Fee processing(BigDecimal processing) {
    this.processing = processing;
    return this;
  }

   /**
   * Get processing
   * @return processing
  **/
  @Schema(description = "")
  public BigDecimal getProcessing() {
    return processing;
  }

  public void setProcessing(BigDecimal processing) {
    this.processing = processing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fee fee = (Fee) o;
    return Objects.equals(this.service, fee.service) &&
        Objects.equals(this.processing, fee.processing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, processing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fee {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
