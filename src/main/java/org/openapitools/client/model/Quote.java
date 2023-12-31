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
import org.openapitools.client.model.Fees;
import org.openapitools.client.model.PayInInstruction;
import org.openapitools.client.model.PayInMethod;
import org.openapitools.client.model.PayOutInstruction;
import org.openapitools.client.model.PayOutMethod;
import org.openapitools.client.model.PaymentLeg;

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
 * Quote
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T21:04:47.186508+02:00[Africa/Johannesburg]")
public class Quote {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_AMOUNT_IN = "amountIn";
  @SerializedName(SERIALIZED_NAME_AMOUNT_IN)
  private BigDecimal amountIn;

  public static final String SERIALIZED_NAME_AMOUNT_DUE = "amountDue";
  @SerializedName(SERIALIZED_NAME_AMOUNT_DUE)
  private BigDecimal amountDue;

  public static final String SERIALIZED_NAME_AMOUNT_OUT = "amountOut";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OUT)
  private BigDecimal amountOut;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  /**
   * Gets or Sets quoteStatus
   */
  @JsonAdapter(QuoteStatusEnum.Adapter.class)
  public enum QuoteStatusEnum {
    ESTIMATE("ESTIMATE"),
    
    TEMPLATE("TEMPLATE"),
    
    PENDING("PENDING"),
    
    ACCEPTED("ACCEPTED"),
    
    PAYMENT_IN_RECEIVED("PAYMENT_IN_RECEIVED"),
    
    PAYMENT_IN_SEEN("PAYMENT_IN_SEEN"),
    
    PAYMENT_IN_FAILED("PAYMENT_IN_FAILED"),
    
    FRAUD_CHECK_PENDING("FRAUD_CHECK_PENDING"),
    
    FRAUD_CHECK_FAILED("FRAUD_CHECK_FAILED"),
    
    PAYMENT_OUT_PENDING("PAYMENT_OUT_PENDING"),
    
    PAYMENT_OUT_PROCESSED("PAYMENT_OUT_PROCESSED"),
    
    PAYMENT_OUT_USED("PAYMENT_OUT_USED"),
    
    COMPLETED("COMPLETED"),
    
    CONVERSION_FAILED("CONVERSION_FAILED"),
    
    PAYMENT_OUT_FAILED("PAYMENT_OUT_FAILED"),
    
    LOCKED("LOCKED"),
    
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

    public static QuoteStatusEnum fromValue(String value) {
      for (QuoteStatusEnum b : QuoteStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QuoteStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QuoteStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QuoteStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QuoteStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QUOTE_STATUS = "quoteStatus";
  @SerializedName(SERIALIZED_NAME_QUOTE_STATUS)
  private QuoteStatusEnum quoteStatus;

  /**
   * Gets or Sets paymentStatus
   */
  @JsonAdapter(PaymentStatusEnum.Adapter.class)
  public enum PaymentStatusEnum {
    PENDING("PENDING"),
    
    SEEN("SEEN"),
    
    SUCCESS("SUCCESS"),
    
    CANCELLED("CANCELLED"),
    
    FAILED("FAILED"),
    
    FRAUD_PENDING("FRAUD_PENDING"),
    
    FRAUD_PENDING_MANUAL_REVIEW("FRAUD_PENDING_MANUAL_REVIEW"),
    
    FRAUD_FAILED("FRAUD_FAILED"),
    
    REFUND_PENDING("REFUND_PENDING"),
    
    REFUNDED("REFUNDED"),
    
    MANUAL_SUCCESS("MANUAL_SUCCESS"),
    
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

    public static PaymentStatusEnum fromValue(String value) {
      for (PaymentStatusEnum b : PaymentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_STATUS = "paymentStatus";
  @SerializedName(SERIALIZED_NAME_PAYMENT_STATUS)
  private PaymentStatusEnum paymentStatus;

  public static final String SERIALIZED_NAME_ACCEPTANCE_EXPIRY_DATE = "acceptanceExpiryDate";
  @SerializedName(SERIALIZED_NAME_ACCEPTANCE_EXPIRY_DATE)
  private Long acceptanceExpiryDate;

  public static final String SERIALIZED_NAME_ACCEPTANCE_DATE = "acceptanceDate";
  @SerializedName(SERIALIZED_NAME_ACCEPTANCE_DATE)
  private Long acceptanceDate;

  public static final String SERIALIZED_NAME_PAYMENT_EXPIRY_DATE = "paymentExpiryDate";
  @SerializedName(SERIALIZED_NAME_PAYMENT_EXPIRY_DATE)
  private Long paymentExpiryDate;

  public static final String SERIALIZED_NAME_PAYMENT_RECEIPT_DATE = "paymentReceiptDate";
  @SerializedName(SERIALIZED_NAME_PAYMENT_RECEIPT_DATE)
  private Long paymentReceiptDate;

  public static final String SERIALIZED_NAME_PAY_IN_LEGS = "payInLegs";
  @SerializedName(SERIALIZED_NAME_PAY_IN_LEGS)
  private List<PaymentLeg> payInLegs;

  public static final String SERIALIZED_NAME_PAY_IN_METHOD = "payInMethod";
  @SerializedName(SERIALIZED_NAME_PAY_IN_METHOD)
  private PayInMethod payInMethod;

  public static final String SERIALIZED_NAME_PAY_OUT_METHOD = "payOutMethod";
  @SerializedName(SERIALIZED_NAME_PAY_OUT_METHOD)
  private PayOutMethod payOutMethod;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_PAY_OUT_INSTRUCTION = "payOutInstruction";
  @SerializedName(SERIALIZED_NAME_PAY_OUT_INSTRUCTION)
  private PayOutInstruction payOutInstruction;

  public static final String SERIALIZED_NAME_PAY_IN_INSTRUCTION = "payInInstruction";
  @SerializedName(SERIALIZED_NAME_PAY_IN_INSTRUCTION)
  private PayInInstruction payInInstruction;

  public static final String SERIALIZED_NAME_USE_PAY_IN_METHOD = "usePayInMethod";
  @SerializedName(SERIALIZED_NAME_USE_PAY_IN_METHOD)
  private AccountMethod usePayInMethod;

  public static final String SERIALIZED_NAME_USE_PAY_OUT_METHOD = "usePayOutMethod";
  @SerializedName(SERIALIZED_NAME_USE_PAY_OUT_METHOD)
  private AccountMethod usePayOutMethod;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private BigDecimal fee;

  public static final String SERIALIZED_NAME_PROCESSING_FEE = "processingFee";
  @SerializedName(SERIALIZED_NAME_PROCESSING_FEE)
  private BigDecimal processingFee;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FIXED("FIXED"),
    
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

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_NET_PRICE = "netPrice";
  @SerializedName(SERIALIZED_NAME_NET_PRICE)
  private BigDecimal netPrice;

  public static final String SERIALIZED_NAME_GROSS_PRICE = "grossPrice";
  @SerializedName(SERIALIZED_NAME_GROSS_PRICE)
  private BigDecimal grossPrice;

  public static final String SERIALIZED_NAME_AMOUNT_IN_GROSS = "amountInGross";
  @SerializedName(SERIALIZED_NAME_AMOUNT_IN_GROSS)
  private BigDecimal amountInGross;

  public static final String SERIALIZED_NAME_AMOUNT_IN_NET = "amountInNet";
  @SerializedName(SERIALIZED_NAME_AMOUNT_IN_NET)
  private BigDecimal amountInNet;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private Fees fees;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private Long dateCreated;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private Long lastUpdated;

  public Quote() {
  }

  public Quote id(Long id) {
    
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


  public Quote from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
      this.payInLegs = new ArrayList<>();
    }
    this.payInLegs.add(payInLegsItem);
    return this;
  }

   /**
   * Get payInLegs
   * @return payInLegs
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  public Long getLastUpdated() {
    return lastUpdated;
  }


  public void setLastUpdated(Long lastUpdated) {
    this.lastUpdated = lastUpdated;
  }



  @Override
  public boolean equals(Object o) {
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
    openapiFields.add("from");
    openapiFields.add("to");
    openapiFields.add("amountIn");
    openapiFields.add("amountDue");
    openapiFields.add("amountOut");
    openapiFields.add("price");
    openapiFields.add("quoteStatus");
    openapiFields.add("paymentStatus");
    openapiFields.add("acceptanceExpiryDate");
    openapiFields.add("acceptanceDate");
    openapiFields.add("paymentExpiryDate");
    openapiFields.add("paymentReceiptDate");
    openapiFields.add("payInLegs");
    openapiFields.add("payInMethod");
    openapiFields.add("payOutMethod");
    openapiFields.add("uuid");
    openapiFields.add("payOutInstruction");
    openapiFields.add("payInInstruction");
    openapiFields.add("usePayInMethod");
    openapiFields.add("usePayOutMethod");
    openapiFields.add("fee");
    openapiFields.add("processingFee");
    openapiFields.add("type");
    openapiFields.add("netPrice");
    openapiFields.add("grossPrice");
    openapiFields.add("amountInGross");
    openapiFields.add("amountInNet");
    openapiFields.add("fees");
    openapiFields.add("dateCreated");
    openapiFields.add("lastUpdated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Quote
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Quote.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Quote is not found in the empty JSON string", Quote.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Quote.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Quote` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("from") != null && !jsonObj.get("from").isJsonNull()) && !jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if ((jsonObj.get("to") != null && !jsonObj.get("to").isJsonNull()) && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if ((jsonObj.get("quoteStatus") != null && !jsonObj.get("quoteStatus").isJsonNull()) && !jsonObj.get("quoteStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteStatus").toString()));
      }
      if ((jsonObj.get("paymentStatus") != null && !jsonObj.get("paymentStatus").isJsonNull()) && !jsonObj.get("paymentStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentStatus").toString()));
      }
      if (jsonObj.get("payInLegs") != null && !jsonObj.get("payInLegs").isJsonNull()) {
        JsonArray jsonArraypayInLegs = jsonObj.getAsJsonArray("payInLegs");
        if (jsonArraypayInLegs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("payInLegs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `payInLegs` to be an array in the JSON string but got `%s`", jsonObj.get("payInLegs").toString()));
          }

          // validate the optional field `payInLegs` (array)
          for (int i = 0; i < jsonArraypayInLegs.size(); i++) {
            PaymentLeg.validateJsonObject(jsonArraypayInLegs.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `payInMethod`
      if (jsonObj.get("payInMethod") != null && !jsonObj.get("payInMethod").isJsonNull()) {
        PayInMethod.validateJsonObject(jsonObj.getAsJsonObject("payInMethod"));
      }
      // validate the optional field `payOutMethod`
      if (jsonObj.get("payOutMethod") != null && !jsonObj.get("payOutMethod").isJsonNull()) {
        PayOutMethod.validateJsonObject(jsonObj.getAsJsonObject("payOutMethod"));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // validate the optional field `payOutInstruction`
      if (jsonObj.get("payOutInstruction") != null && !jsonObj.get("payOutInstruction").isJsonNull()) {
        PayOutInstruction.validateJsonObject(jsonObj.getAsJsonObject("payOutInstruction"));
      }
      // validate the optional field `payInInstruction`
      if (jsonObj.get("payInInstruction") != null && !jsonObj.get("payInInstruction").isJsonNull()) {
        PayInInstruction.validateJsonObject(jsonObj.getAsJsonObject("payInInstruction"));
      }
      // validate the optional field `usePayInMethod`
      if (jsonObj.get("usePayInMethod") != null && !jsonObj.get("usePayInMethod").isJsonNull()) {
        AccountMethod.validateJsonObject(jsonObj.getAsJsonObject("usePayInMethod"));
      }
      // validate the optional field `usePayOutMethod`
      if (jsonObj.get("usePayOutMethod") != null && !jsonObj.get("usePayOutMethod").isJsonNull()) {
        AccountMethod.validateJsonObject(jsonObj.getAsJsonObject("usePayOutMethod"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `fees`
      if (jsonObj.get("fees") != null && !jsonObj.get("fees").isJsonNull()) {
        Fees.validateJsonObject(jsonObj.getAsJsonObject("fees"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Quote.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Quote' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Quote> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Quote.class));

       return (TypeAdapter<T>) new TypeAdapter<Quote>() {
           @Override
           public void write(JsonWriter out, Quote value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Quote read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Quote given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Quote
  * @throws IOException if the JSON string is invalid with respect to Quote
  */
  public static Quote fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Quote.class);
  }

 /**
  * Convert an instance of Quote to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

