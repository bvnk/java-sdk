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
/**
 * Specify payment details
 */
@Schema(description = "Specify payment details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-05T20:47:27.517449+02:00[Africa/Johannesburg]")

public class PayOutDetailDto {
  @SerializedName("code")
  private String code = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("protocol")
  private String protocol = null;

  public PayOutDetailDto code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Gateway to be used (crypto or wallet)
   * @return code
  **/
  @Schema(example = "crypto", required = true, description = "Gateway to be used (crypto or wallet)")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PayOutDetailDto currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency acronym payout needs to be made in
   * @return currency
  **/
  @Schema(example = "ETH", required = true, description = "Currency acronym payout needs to be made in")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PayOutDetailDto address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address to withdrawal funds to
   * @return address
  **/
  @Schema(example = "0xb794f5ea0ba39494ce839613fffba74279579268", required = true, description = "Address to withdrawal funds to")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public PayOutDetailDto tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * This is a payment destination tag. This fields isn&#x27;t null when the paidCurrency currency value is XRP
   * @return tag
  **/
  @Schema(description = "This is a payment destination tag. This fields isn't null when the paidCurrency currency value is XRP")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public PayOutDetailDto protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Protocol behind a currency (ERC20 or TRC20)
   * @return protocol
  **/
  @Schema(example = "ERC20", description = "Protocol behind a currency (ERC20 or TRC20)")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayOutDetailDto payOutDetailDto = (PayOutDetailDto) o;
    return Objects.equals(this.code, payOutDetailDto.code) &&
        Objects.equals(this.currency, payOutDetailDto.currency) &&
        Objects.equals(this.address, payOutDetailDto.address) &&
        Objects.equals(this.tag, payOutDetailDto.tag) &&
        Objects.equals(this.protocol, payOutDetailDto.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, currency, address, tag, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayOutDetailDto {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
