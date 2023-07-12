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
import io.swagger.client.model.AccountMethod;
import io.swagger.client.model.Fees;
import io.swagger.client.model.PayInInstruction;
import io.swagger.client.model.PayInMethod;
import io.swagger.client.model.PayOutInstruction;
import io.swagger.client.model.PayOutMethod;
import io.swagger.client.model.PaymentLeg;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Quote
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-05T20:47:27.517449+02:00[Africa/Johannesburg]")

public class Quote {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("amountIn")
  private BigDecimal amountIn = null;

  @SerializedName("amountDue")
  private BigDecimal amountDue = null;

  @SerializedName("amountOut")
  private BigDecimal amountOut = null;

  @SerializedName("price")
  private BigDecimal price = null;

  /**
   * Gets or Sets quoteStatus
   */
  @JsonAdapter(QuoteStatusEnum.Adapter.class)
  public enum QuoteStatusEnum {
    @SerializedName("ESTIMATE")
    ESTIMATE("ESTIMATE"),
    @SerializedName("TEMPLATE")
    TEMPLATE("TEMPLATE"),
    @SerializedName("PENDING")
    PENDING("PENDING"),
    @SerializedName("ACCEPTED")
    ACCEPTED("ACCEPTED"),
    @SerializedName("PAYMENT_IN_RECEIVED")
    PAYMENT_IN_RECEIVED("PAYMENT_IN_RECEIVED"),
    @SerializedName("PAYMENT_IN_SEEN")
    PAYMENT_IN_SEEN("PAYMENT_IN_SEEN"),
    @SerializedName("PAYMENT_IN_FAILED")
    PAYMENT_IN_FAILED("PAYMENT_IN_FAILED"),
    @SerializedName("FRAUD_CHECK_PENDING")
    FRAUD_CHECK_PENDING("FRAUD_CHECK_PENDING"),
    @SerializedName("FRAUD_CHECK_FAILED")
    FRAUD_CHECK_FAILED("FRAUD_CHECK_FAILED"),
    @SerializedName("PAYMENT_OUT_PENDING")
    PAYMENT_OUT_PENDING("PAYMENT_OUT_PENDING"),
    @SerializedName("PAYMENT_OUT_PROCESSED")
    PAYMENT_OUT_PROCESSED("PAYMENT_OUT_PROCESSED"),
    @SerializedName("PAYMENT_OUT_USED")
    PAYMENT_OUT_USED("PAYMENT_OUT_USED"),
    @SerializedName("COMPLETED")
    COMPLETED("COMPLETED"),
    @SerializedName("CONVERSION_FAILED")
    CONVERSION_FAILED("CONVERSION_FAILED"),
    @SerializedName("PAYMENT_OUT_FAILED")
    PAYMENT_OUT_FAILED("PAYMENT_OUT_FAILED"),
    @SerializedName("LOCKED")
    LOCKED("LOCKED"),
    @SerializedName("REFUNDED")
    REFUNDED("REFUNDED");

    private String value;

    QuoteStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static QuoteStatusEnum fromValue(String input) {
      for (QuoteStatusEnum b : QuoteStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<QuoteStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QuoteStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public QuoteStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return QuoteStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("quoteStatus")
  private QuoteStatusEnum quoteStatus = null;

  /**
   * Gets or Sets paymentStatus
   */
  @JsonAdapter(PaymentStatusEnum.Adapter.class)
  public enum PaymentStatusEnum {
    @SerializedName("PENDING")
    PENDING("PENDING"),
    @SerializedName("SEEN")
    SEEN("SEEN"),
    @SerializedName("SUCCESS")
    SUCCESS("SUCCESS"),
    @SerializedName("CANCELLED")
    CANCELLED("CANCELLED"),
    @SerializedName("FAILED")
    FAILED("FAILED"),
    @SerializedName("FRAUD_PENDING")
    FRAUD_PENDING("FRAUD_PENDING"),
    @SerializedName("FRAUD_PENDING_MANUAL_REVIEW")
    FRAUD_PENDING_MANUAL_REVIEW("FRAUD_PENDING_MANUAL_REVIEW"),
    @SerializedName("FRAUD_FAILED")
    FRAUD_FAILED("FRAUD_FAILED"),
    @SerializedName("REFUND_PENDING")
    REFUND_PENDING("REFUND_PENDING"),
    @SerializedName("REFUNDED")
    REFUNDED("REFUNDED"),
    @SerializedName("MANUAL_SUCCESS")
    MANUAL_SUCCESS("MANUAL_SUCCESS"),
    @SerializedName("REFUND_FAILED")
    REFUND_FAILED("REFUND_FAILED");

    private String value;

    PaymentStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PaymentStatusEnum fromValue(String input) {
      for (PaymentStatusEnum b : PaymentStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PaymentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PaymentStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PaymentStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("paymentStatus")
  private PaymentStatusEnum paymentStatus = null;

  @SerializedName("acceptanceExpiryDate")
  private Long acceptanceExpiryDate = null;

  @SerializedName("acceptanceDate")
  private Long acceptanceDate = null;

  @SerializedName("paymentExpiryDate")
  private Long paymentExpiryDate = null;

  @SerializedName("paymentReceiptDate")
  private Long paymentReceiptDate = null;

  @SerializedName("payInLegs")
  private List<PaymentLeg> payInLegs = null;

  @SerializedName("payInMethod")
  private PayInMethod payInMethod = null;

  @SerializedName("payOutMethod")
  private PayOutMethod payOutMethod = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("payOutInstruction")
  private PayOutInstruction payOutInstruction = null;

  @SerializedName("payInInstruction")
  private PayInInstruction payInInstruction = null;

  @SerializedName("usePayInMethod")
  private AccountMethod usePayInMethod = null;

  @SerializedName("usePayOutMethod")
  private AccountMethod usePayOutMethod = null;

  @SerializedName("fee")
  private BigDecimal fee = null;

  @SerializedName("processingFee")
  private BigDecimal processingFee = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("FIXED")
    FIXED("FIXED"),
    @SerializedName("MARKET")
    MARKET("MARKET");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("netPrice")
  private BigDecimal netPrice = null;

  @SerializedName("grossPrice")
  private BigDecimal grossPrice = null;

  @SerializedName("amountInGross")
  private BigDecimal amountInGross = null;

  @SerializedName("amountInNet")
  private BigDecimal amountInNet = null;

  @SerializedName("fees")
  private Fees fees = null;

  @SerializedName("dateCreated")
  private Long dateCreated = null;

  @SerializedName("lastUpdated")
  private Long lastUpdated = null;

  public Quote id(Long id) {
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

  public Quote from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @Schema(example = "EUR", description = "")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Quote to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @Schema(example = "ETH", description = "")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Quote amountIn(BigDecimal amountIn) {
    this.amountIn = amountIn;
    return this;
  }

   /**
   * Get amountIn
   * @return amountIn
  **/
  @Schema(example = "500.0", description = "")
  public BigDecimal getAmountIn() {
    return amountIn;
  }

  public void setAmountIn(BigDecimal amountIn) {
    this.amountIn = amountIn;
  }

  public Quote amountDue(BigDecimal amountDue) {
    this.amountDue = amountDue;
    return this;
  }

   /**
   * Get amountDue
   * @return amountDue
  **/
  @Schema(example = "500.0", description = "")
  public BigDecimal getAmountDue() {
    return amountDue;
  }

  public void setAmountDue(BigDecimal amountDue) {
    this.amountDue = amountDue;
  }

  public Quote amountOut(BigDecimal amountOut) {
    this.amountOut = amountOut;
    return this;
  }

   /**
   * Get amountOut
   * @return amountOut
  **/
  @Schema(example = "1.12", description = "")
  public BigDecimal getAmountOut() {
    return amountOut;
  }

  public void setAmountOut(BigDecimal amountOut) {
    this.amountOut = amountOut;
  }

  public Quote price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(example = "446.43", description = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Quote quoteStatus(QuoteStatusEnum quoteStatus) {
    this.quoteStatus = quoteStatus;
    return this;
  }

   /**
   * Get quoteStatus
   * @return quoteStatus
  **/
  @Schema(description = "")
  public QuoteStatusEnum getQuoteStatus() {
    return quoteStatus;
  }

  public void setQuoteStatus(QuoteStatusEnum quoteStatus) {
    this.quoteStatus = quoteStatus;
  }

  public Quote paymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Get paymentStatus
   * @return paymentStatus
  **/
  @Schema(description = "")
  public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public Quote acceptanceExpiryDate(Long acceptanceExpiryDate) {
    this.acceptanceExpiryDate = acceptanceExpiryDate;
    return this;
  }

   /**
   * Get acceptanceExpiryDate
   * @return acceptanceExpiryDate
  **/
  @Schema(example = "1566198657000", description = "")
  public Long getAcceptanceExpiryDate() {
    return acceptanceExpiryDate;
  }

  public void setAcceptanceExpiryDate(Long acceptanceExpiryDate) {
    this.acceptanceExpiryDate = acceptanceExpiryDate;
  }

  public Quote acceptanceDate(Long acceptanceDate) {
    this.acceptanceDate = acceptanceDate;
    return this;
  }

   /**
   * Get acceptanceDate
   * @return acceptanceDate
  **/
  @Schema(example = "1566198657000", description = "")
  public Long getAcceptanceDate() {
    return acceptanceDate;
  }

  public void setAcceptanceDate(Long acceptanceDate) {
    this.acceptanceDate = acceptanceDate;
  }

  public Quote paymentExpiryDate(Long paymentExpiryDate) {
    this.paymentExpiryDate = paymentExpiryDate;
    return this;
  }

   /**
   * Get paymentExpiryDate
   * @return paymentExpiryDate
  **/
  @Schema(example = "1566198657000", description = "")
  public Long getPaymentExpiryDate() {
    return paymentExpiryDate;
  }

  public void setPaymentExpiryDate(Long paymentExpiryDate) {
    this.paymentExpiryDate = paymentExpiryDate;
  }

  public Quote paymentReceiptDate(Long paymentReceiptDate) {
    this.paymentReceiptDate = paymentReceiptDate;
    return this;
  }

   /**
   * Get paymentReceiptDate
   * @return paymentReceiptDate
  **/
  @Schema(example = "1566198657000", description = "")
  public Long getPaymentReceiptDate() {
    return paymentReceiptDate;
  }

  public void setPaymentReceiptDate(Long paymentReceiptDate) {
    this.paymentReceiptDate = paymentReceiptDate;
  }

  public Quote payInLegs(List<PaymentLeg> payInLegs) {
    this.payInLegs = payInLegs;
    return this;
  }

  public Quote addPayInLegsItem(PaymentLeg payInLegsItem) {
    if (this.payInLegs == null) {
      this.payInLegs = new ArrayList<PaymentLeg>();
    }
    this.payInLegs.add(payInLegsItem);
    return this;
  }

   /**
   * Get payInLegs
   * @return payInLegs
  **/
  @Schema(description = "")
  public List<PaymentLeg> getPayInLegs() {
    return payInLegs;
  }

  public void setPayInLegs(List<PaymentLeg> payInLegs) {
    this.payInLegs = payInLegs;
  }

  public Quote payInMethod(PayInMethod payInMethod) {
    this.payInMethod = payInMethod;
    return this;
  }

   /**
   * Get payInMethod
   * @return payInMethod
  **/
  @Schema(description = "")
  public PayInMethod getPayInMethod() {
    return payInMethod;
  }

  public void setPayInMethod(PayInMethod payInMethod) {
    this.payInMethod = payInMethod;
  }

  public Quote payOutMethod(PayOutMethod payOutMethod) {
    this.payOutMethod = payOutMethod;
    return this;
  }

   /**
   * Get payOutMethod
   * @return payOutMethod
  **/
  @Schema(description = "")
  public PayOutMethod getPayOutMethod() {
    return payOutMethod;
  }

  public void setPayOutMethod(PayOutMethod payOutMethod) {
    this.payOutMethod = payOutMethod;
  }

  public Quote uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(example = "B6670497-D139-47E8-9F4A-F97A5D977057", description = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Quote payOutInstruction(PayOutInstruction payOutInstruction) {
    this.payOutInstruction = payOutInstruction;
    return this;
  }

   /**
   * Get payOutInstruction
   * @return payOutInstruction
  **/
  @Schema(description = "")
  public PayOutInstruction getPayOutInstruction() {
    return payOutInstruction;
  }

  public void setPayOutInstruction(PayOutInstruction payOutInstruction) {
    this.payOutInstruction = payOutInstruction;
  }

  public Quote payInInstruction(PayInInstruction payInInstruction) {
    this.payInInstruction = payInInstruction;
    return this;
  }

   /**
   * Get payInInstruction
   * @return payInInstruction
  **/
  @Schema(description = "")
  public PayInInstruction getPayInInstruction() {
    return payInInstruction;
  }

  public void setPayInInstruction(PayInInstruction payInInstruction) {
    this.payInInstruction = payInInstruction;
  }

  public Quote usePayInMethod(AccountMethod usePayInMethod) {
    this.usePayInMethod = usePayInMethod;
    return this;
  }

   /**
   * Get usePayInMethod
   * @return usePayInMethod
  **/
  @Schema(description = "")
  public AccountMethod getUsePayInMethod() {
    return usePayInMethod;
  }

  public void setUsePayInMethod(AccountMethod usePayInMethod) {
    this.usePayInMethod = usePayInMethod;
  }

  public Quote usePayOutMethod(AccountMethod usePayOutMethod) {
    this.usePayOutMethod = usePayOutMethod;
    return this;
  }

   /**
   * Get usePayOutMethod
   * @return usePayOutMethod
  **/
  @Schema(description = "")
  public AccountMethod getUsePayOutMethod() {
    return usePayOutMethod;
  }

  public void setUsePayOutMethod(AccountMethod usePayOutMethod) {
    this.usePayOutMethod = usePayOutMethod;
  }

  public Quote fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @Schema(example = "1.02", description = "")
  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public Quote processingFee(BigDecimal processingFee) {
    this.processingFee = processingFee;
    return this;
  }

   /**
   * Get processingFee
   * @return processingFee
  **/
  @Schema(example = "1.02", description = "")
  public BigDecimal getProcessingFee() {
    return processingFee;
  }

  public void setProcessingFee(BigDecimal processingFee) {
    this.processingFee = processingFee;
  }

  public Quote type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Quote netPrice(BigDecimal netPrice) {
    this.netPrice = netPrice;
    return this;
  }

   /**
   * Get netPrice
   * @return netPrice
  **/
  @Schema(example = "1234.02", description = "")
  public BigDecimal getNetPrice() {
    return netPrice;
  }

  public void setNetPrice(BigDecimal netPrice) {
    this.netPrice = netPrice;
  }

  public Quote grossPrice(BigDecimal grossPrice) {
    this.grossPrice = grossPrice;
    return this;
  }

   /**
   * Get grossPrice
   * @return grossPrice
  **/
  @Schema(example = "1134.02", description = "")
  public BigDecimal getGrossPrice() {
    return grossPrice;
  }

  public void setGrossPrice(BigDecimal grossPrice) {
    this.grossPrice = grossPrice;
  }

  public Quote amountInGross(BigDecimal amountInGross) {
    this.amountInGross = amountInGross;
    return this;
  }

   /**
   * Get amountInGross
   * @return amountInGross
  **/
  @Schema(example = "102.0", description = "")
  public BigDecimal getAmountInGross() {
    return amountInGross;
  }

  public void setAmountInGross(BigDecimal amountInGross) {
    this.amountInGross = amountInGross;
  }

  public Quote amountInNet(BigDecimal amountInNet) {
    this.amountInNet = amountInNet;
    return this;
  }

   /**
   * Get amountInNet
   * @return amountInNet
  **/
  @Schema(example = "104.0", description = "")
  public BigDecimal getAmountInNet() {
    return amountInNet;
  }

  public void setAmountInNet(BigDecimal amountInNet) {
    this.amountInNet = amountInNet;
  }

  public Quote fees(Fees fees) {
    this.fees = fees;
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @Schema(description = "")
  public Fees getFees() {
    return fees;
  }

  public void setFees(Fees fees) {
    this.fees = fees;
  }

  public Quote dateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @Schema(example = "1566198657000", description = "")
  public Long getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Quote lastUpdated(Long lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @Schema(example = "1566198657000", description = "")
  public Long getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Long lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Quote quote = (Quote) o;
    return Objects.equals(this.id, quote.id) &&
        Objects.equals(this.from, quote.from) &&
        Objects.equals(this.to, quote.to) &&
        Objects.equals(this.amountIn, quote.amountIn) &&
        Objects.equals(this.amountDue, quote.amountDue) &&
        Objects.equals(this.amountOut, quote.amountOut) &&
        Objects.equals(this.price, quote.price) &&
        Objects.equals(this.quoteStatus, quote.quoteStatus) &&
        Objects.equals(this.paymentStatus, quote.paymentStatus) &&
        Objects.equals(this.acceptanceExpiryDate, quote.acceptanceExpiryDate) &&
        Objects.equals(this.acceptanceDate, quote.acceptanceDate) &&
        Objects.equals(this.paymentExpiryDate, quote.paymentExpiryDate) &&
        Objects.equals(this.paymentReceiptDate, quote.paymentReceiptDate) &&
        Objects.equals(this.payInLegs, quote.payInLegs) &&
        Objects.equals(this.payInMethod, quote.payInMethod) &&
        Objects.equals(this.payOutMethod, quote.payOutMethod) &&
        Objects.equals(this.uuid, quote.uuid) &&
        Objects.equals(this.payOutInstruction, quote.payOutInstruction) &&
        Objects.equals(this.payInInstruction, quote.payInInstruction) &&
        Objects.equals(this.usePayInMethod, quote.usePayInMethod) &&
        Objects.equals(this.usePayOutMethod, quote.usePayOutMethod) &&
        Objects.equals(this.fee, quote.fee) &&
        Objects.equals(this.processingFee, quote.processingFee) &&
        Objects.equals(this.type, quote.type) &&
        Objects.equals(this.netPrice, quote.netPrice) &&
        Objects.equals(this.grossPrice, quote.grossPrice) &&
        Objects.equals(this.amountInGross, quote.amountInGross) &&
        Objects.equals(this.amountInNet, quote.amountInNet) &&
        Objects.equals(this.fees, quote.fees) &&
        Objects.equals(this.dateCreated, quote.dateCreated) &&
        Objects.equals(this.lastUpdated, quote.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, from, to, amountIn, amountDue, amountOut, price, quoteStatus, paymentStatus, acceptanceExpiryDate, acceptanceDate, paymentExpiryDate, paymentReceiptDate, payInLegs, payInMethod, payOutMethod, uuid, payOutInstruction, payInInstruction, usePayInMethod, usePayOutMethod, fee, processingFee, type, netPrice, grossPrice, amountInGross, amountInNet, fees, dateCreated, lastUpdated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quote {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    amountIn: ").append(toIndentedString(amountIn)).append("\n");
    sb.append("    amountDue: ").append(toIndentedString(amountDue)).append("\n");
    sb.append("    amountOut: ").append(toIndentedString(amountOut)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quoteStatus: ").append(toIndentedString(quoteStatus)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    acceptanceExpiryDate: ").append(toIndentedString(acceptanceExpiryDate)).append("\n");
    sb.append("    acceptanceDate: ").append(toIndentedString(acceptanceDate)).append("\n");
    sb.append("    paymentExpiryDate: ").append(toIndentedString(paymentExpiryDate)).append("\n");
    sb.append("    paymentReceiptDate: ").append(toIndentedString(paymentReceiptDate)).append("\n");
    sb.append("    payInLegs: ").append(toIndentedString(payInLegs)).append("\n");
    sb.append("    payInMethod: ").append(toIndentedString(payInMethod)).append("\n");
    sb.append("    payOutMethod: ").append(toIndentedString(payOutMethod)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    payOutInstruction: ").append(toIndentedString(payOutInstruction)).append("\n");
    sb.append("    payInInstruction: ").append(toIndentedString(payInInstruction)).append("\n");
    sb.append("    usePayInMethod: ").append(toIndentedString(usePayInMethod)).append("\n");
    sb.append("    usePayOutMethod: ").append(toIndentedString(usePayOutMethod)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    processingFee: ").append(toIndentedString(processingFee)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    netPrice: ").append(toIndentedString(netPrice)).append("\n");
    sb.append("    grossPrice: ").append(toIndentedString(grossPrice)).append("\n");
    sb.append("    amountInGross: ").append(toIndentedString(amountInGross)).append("\n");
    sb.append("    amountInNet: ").append(toIndentedString(amountInNet)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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