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
import io.swagger.client.model.Form;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PayInInstruction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-05T20:47:27.517449+02:00[Africa/Johannesburg]")

public class PayInInstruction {
  /**
   * Gets or Sets action
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    @SerializedName("REDIRECT")
    REDIRECT("REDIRECT"),
    @SerializedName("FORM")
    FORM("FORM"),
    @SerializedName("DISPLAY")
    DISPLAY("DISPLAY"),
    @SerializedName("NONE")
    NONE("NONE");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ActionEnum fromValue(String input) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ActionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("action")
  private ActionEnum action = null;

  @SerializedName("form")
  private Form form = null;

  @SerializedName("redirectUrl")
  private String redirectUrl = null;

  @SerializedName("displayParameters")
  private Object displayParameters = null;

  public PayInInstruction action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public PayInInstruction form(Form form) {
    this.form = form;
    return this;
  }

   /**
   * Get form
   * @return form
  **/
  @Schema(description = "")
  public Form getForm() {
    return form;
  }

  public void setForm(Form form) {
    this.form = form;
  }

  public PayInInstruction redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  @Schema(example = "https://gateway.com/complete/3A6FAFFA-F21D-416E-B17E-2529A9BC44A0", description = "")
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public PayInInstruction displayParameters(Object displayParameters) {
    this.displayParameters = displayParameters;
    return this;
  }

   /**
   * Get displayParameters
   * @return displayParameters
  **/
  @Schema(example = "{}", description = "")
  public Object getDisplayParameters() {
    return displayParameters;
  }

  public void setDisplayParameters(Object displayParameters) {
    this.displayParameters = displayParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayInInstruction payInInstruction = (PayInInstruction) o;
    return Objects.equals(this.action, payInInstruction.action) &&
        Objects.equals(this.form, payInInstruction.form) &&
        Objects.equals(this.redirectUrl, payInInstruction.redirectUrl) &&
        Objects.equals(this.displayParameters, payInInstruction.displayParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, form, redirectUrl, displayParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayInInstruction {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    displayParameters: ").append(toIndentedString(displayParameters)).append("\n");
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
