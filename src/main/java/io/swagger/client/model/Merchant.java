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
import io.swagger.client.model.Wallet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Merchant
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-05T20:47:27.517449+02:00[Africa/Johannesburg]")

public class Merchant {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("merchantId")
  private String merchantId = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("webhookUrl")
  private String webhookUrl = null;

  @SerializedName("autoConvertInvalidPayments")
  private Boolean autoConvertInvalidPayments = true;

  @SerializedName("defaultExpiryMinutes")
  private Integer defaultExpiryMinutes = null;

  @SerializedName("webhookVersion")
  private Integer webhookVersion = null;

  @SerializedName("wallet")
  private Wallet wallet = null;

  @SerializedName("emailRecipients")
  private String emailRecipients = null;

  public Merchant id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "1432", description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Merchant merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  @Schema(example = "b312436e-e477-49d4-be7f-9d027f9b9e34", description = "")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public Merchant displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(example = "Test Merchant Name", description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Merchant secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @Schema(example = "MzI5OGUyZGMtN2FkOC00NzVkLThjNzEtMWVjMzk2ZjQ5OGMwYTBlZTBlOGYtMjBhNi00NjMxLWI1MTctMTI5MjlmMjdhYmM", description = "")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public Merchant webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Get webhookUrl
   * @return webhookUrl
  **/
  @Schema(example = "https://www.URL.com/to/send/webhooks/to", description = "")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public Merchant autoConvertInvalidPayments(Boolean autoConvertInvalidPayments) {
    this.autoConvertInvalidPayments = autoConvertInvalidPayments;
    return this;
  }

   /**
   * Get autoConvertInvalidPayments
   * @return autoConvertInvalidPayments
  **/
  @Schema(description = "")
  public Boolean isAutoConvertInvalidPayments() {
    return autoConvertInvalidPayments;
  }

  public void setAutoConvertInvalidPayments(Boolean autoConvertInvalidPayments) {
    this.autoConvertInvalidPayments = autoConvertInvalidPayments;
  }

  public Merchant defaultExpiryMinutes(Integer defaultExpiryMinutes) {
    this.defaultExpiryMinutes = defaultExpiryMinutes;
    return this;
  }

   /**
   * Get defaultExpiryMinutes
   * @return defaultExpiryMinutes
  **/
  @Schema(example = "1440", description = "")
  public Integer getDefaultExpiryMinutes() {
    return defaultExpiryMinutes;
  }

  public void setDefaultExpiryMinutes(Integer defaultExpiryMinutes) {
    this.defaultExpiryMinutes = defaultExpiryMinutes;
  }

  public Merchant webhookVersion(Integer webhookVersion) {
    this.webhookVersion = webhookVersion;
    return this;
  }

   /**
   * Get webhookVersion
   * @return webhookVersion
  **/
  @Schema(example = "1", description = "")
  public Integer getWebhookVersion() {
    return webhookVersion;
  }

  public void setWebhookVersion(Integer webhookVersion) {
    this.webhookVersion = webhookVersion;
  }

  public Merchant wallet(Wallet wallet) {
    this.wallet = wallet;
    return this;
  }

   /**
   * Get wallet
   * @return wallet
  **/
  @Schema(description = "")
  public Wallet getWallet() {
    return wallet;
  }

  public void setWallet(Wallet wallet) {
    this.wallet = wallet;
  }

  public Merchant emailRecipients(String emailRecipients) {
    this.emailRecipients = emailRecipients;
    return this;
  }

   /**
   * Get emailRecipients
   * @return emailRecipients
  **/
  @Schema(description = "")
  public String getEmailRecipients() {
    return emailRecipients;
  }

  public void setEmailRecipients(String emailRecipients) {
    this.emailRecipients = emailRecipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Merchant merchant = (Merchant) o;
    return Objects.equals(this.id, merchant.id) &&
        Objects.equals(this.merchantId, merchant.merchantId) &&
        Objects.equals(this.displayName, merchant.displayName) &&
        Objects.equals(this.secret, merchant.secret) &&
        Objects.equals(this.webhookUrl, merchant.webhookUrl) &&
        Objects.equals(this.autoConvertInvalidPayments, merchant.autoConvertInvalidPayments) &&
        Objects.equals(this.defaultExpiryMinutes, merchant.defaultExpiryMinutes) &&
        Objects.equals(this.webhookVersion, merchant.webhookVersion) &&
        Objects.equals(this.wallet, merchant.wallet) &&
        Objects.equals(this.emailRecipients, merchant.emailRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, merchantId, displayName, secret, webhookUrl, autoConvertInvalidPayments, defaultExpiryMinutes, webhookVersion, wallet, emailRecipients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Merchant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    autoConvertInvalidPayments: ").append(toIndentedString(autoConvertInvalidPayments)).append("\n");
    sb.append("    defaultExpiryMinutes: ").append(toIndentedString(defaultExpiryMinutes)).append("\n");
    sb.append("    webhookVersion: ").append(toIndentedString(webhookVersion)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    emailRecipients: ").append(toIndentedString(emailRecipients)).append("\n");
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
