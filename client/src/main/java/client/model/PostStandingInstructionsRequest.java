/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PostStandingInstructionsRequest
 */

public class PostStandingInstructionsRequest {
  @SerializedName("fromOfficeId")
  private Long fromOfficeId = null;

  @SerializedName("fromClientId")
  private Long fromClientId = null;

  @SerializedName("fromAccountType")
  private Integer fromAccountType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("transferType")
  private Integer transferType = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("fromAccountId")
  private Long fromAccountId = null;

  @SerializedName("toOfficeId")
  private Long toOfficeId = null;

  @SerializedName("toClientId")
  private Long toClientId = null;

  @SerializedName("toAccountType")
  private Integer toAccountType = null;

  @SerializedName("toAccountId")
  private Long toAccountId = null;

  @SerializedName("instructionType")
  private Integer instructionType = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("validFrom")
  private String validFrom = null;

  @SerializedName("recurrenceType")
  private Integer recurrenceType = null;

  @SerializedName("recurrenceInterval")
  private Integer recurrenceInterval = null;

  @SerializedName("recurrenceFrequency")
  private Integer recurrenceFrequency = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("recurrenceOnMonthDay")
  private String recurrenceOnMonthDay = null;

  @SerializedName("monthDayFormat")
  private String monthDayFormat = null;

  public PostStandingInstructionsRequest fromOfficeId(Long fromOfficeId) {
    this.fromOfficeId = fromOfficeId;
    return this;
  }

   /**
   * Get fromOfficeId
   * @return fromOfficeId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getFromOfficeId() {
    return fromOfficeId;
  }

  public void setFromOfficeId(Long fromOfficeId) {
    this.fromOfficeId = fromOfficeId;
  }

  public PostStandingInstructionsRequest fromClientId(Long fromClientId) {
    this.fromClientId = fromClientId;
    return this;
  }

   /**
   * Get fromClientId
   * @return fromClientId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getFromClientId() {
    return fromClientId;
  }

  public void setFromClientId(Long fromClientId) {
    this.fromClientId = fromClientId;
  }

  public PostStandingInstructionsRequest fromAccountType(Integer fromAccountType) {
    this.fromAccountType = fromAccountType;
    return this;
  }

   /**
   * Get fromAccountType
   * @return fromAccountType
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getFromAccountType() {
    return fromAccountType;
  }

  public void setFromAccountType(Integer fromAccountType) {
    this.fromAccountType = fromAccountType;
  }

  public PostStandingInstructionsRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "standing instruction", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostStandingInstructionsRequest transferType(Integer transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getTransferType() {
    return transferType;
  }

  public void setTransferType(Integer transferType) {
    this.transferType = transferType;
  }

  public PostStandingInstructionsRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public PostStandingInstructionsRequest status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public PostStandingInstructionsRequest fromAccountId(Long fromAccountId) {
    this.fromAccountId = fromAccountId;
    return this;
  }

   /**
   * Get fromAccountId
   * @return fromAccountId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getFromAccountId() {
    return fromAccountId;
  }

  public void setFromAccountId(Long fromAccountId) {
    this.fromAccountId = fromAccountId;
  }

  public PostStandingInstructionsRequest toOfficeId(Long toOfficeId) {
    this.toOfficeId = toOfficeId;
    return this;
  }

   /**
   * Get toOfficeId
   * @return toOfficeId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getToOfficeId() {
    return toOfficeId;
  }

  public void setToOfficeId(Long toOfficeId) {
    this.toOfficeId = toOfficeId;
  }

  public PostStandingInstructionsRequest toClientId(Long toClientId) {
    this.toClientId = toClientId;
    return this;
  }

   /**
   * Get toClientId
   * @return toClientId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getToClientId() {
    return toClientId;
  }

  public void setToClientId(Long toClientId) {
    this.toClientId = toClientId;
  }

  public PostStandingInstructionsRequest toAccountType(Integer toAccountType) {
    this.toAccountType = toAccountType;
    return this;
  }

   /**
   * Get toAccountType
   * @return toAccountType
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getToAccountType() {
    return toAccountType;
  }

  public void setToAccountType(Integer toAccountType) {
    this.toAccountType = toAccountType;
  }

  public PostStandingInstructionsRequest toAccountId(Long toAccountId) {
    this.toAccountId = toAccountId;
    return this;
  }

   /**
   * Get toAccountId
   * @return toAccountId
  **/
  @ApiModelProperty(example = "3", value = "")
  public Long getToAccountId() {
    return toAccountId;
  }

  public void setToAccountId(Long toAccountId) {
    this.toAccountId = toAccountId;
  }

  public PostStandingInstructionsRequest instructionType(Integer instructionType) {
    this.instructionType = instructionType;
    return this;
  }

   /**
   * Get instructionType
   * @return instructionType
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getInstructionType() {
    return instructionType;
  }

  public void setInstructionType(Integer instructionType) {
    this.instructionType = instructionType;
  }

  public PostStandingInstructionsRequest amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "221", value = "")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public PostStandingInstructionsRequest validFrom(String validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @ApiModelProperty(example = "08 April 2014", value = "")
  public String getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(String validFrom) {
    this.validFrom = validFrom;
  }

  public PostStandingInstructionsRequest recurrenceType(Integer recurrenceType) {
    this.recurrenceType = recurrenceType;
    return this;
  }

   /**
   * Get recurrenceType
   * @return recurrenceType
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getRecurrenceType() {
    return recurrenceType;
  }

  public void setRecurrenceType(Integer recurrenceType) {
    this.recurrenceType = recurrenceType;
  }

  public PostStandingInstructionsRequest recurrenceInterval(Integer recurrenceInterval) {
    this.recurrenceInterval = recurrenceInterval;
    return this;
  }

   /**
   * Get recurrenceInterval
   * @return recurrenceInterval
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getRecurrenceInterval() {
    return recurrenceInterval;
  }

  public void setRecurrenceInterval(Integer recurrenceInterval) {
    this.recurrenceInterval = recurrenceInterval;
  }

  public PostStandingInstructionsRequest recurrenceFrequency(Integer recurrenceFrequency) {
    this.recurrenceFrequency = recurrenceFrequency;
    return this;
  }

   /**
   * Get recurrenceFrequency
   * @return recurrenceFrequency
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getRecurrenceFrequency() {
    return recurrenceFrequency;
  }

  public void setRecurrenceFrequency(Integer recurrenceFrequency) {
    this.recurrenceFrequency = recurrenceFrequency;
  }

  public PostStandingInstructionsRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * en
   * @return locale
  **/
  @ApiModelProperty(value = "en")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PostStandingInstructionsRequest dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @ApiModelProperty(example = "dd MMMM yyyy", value = "")
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public PostStandingInstructionsRequest recurrenceOnMonthDay(String recurrenceOnMonthDay) {
    this.recurrenceOnMonthDay = recurrenceOnMonthDay;
    return this;
  }

   /**
   * Get recurrenceOnMonthDay
   * @return recurrenceOnMonthDay
  **/
  @ApiModelProperty(example = "02 April", value = "")
  public String getRecurrenceOnMonthDay() {
    return recurrenceOnMonthDay;
  }

  public void setRecurrenceOnMonthDay(String recurrenceOnMonthDay) {
    this.recurrenceOnMonthDay = recurrenceOnMonthDay;
  }

  public PostStandingInstructionsRequest monthDayFormat(String monthDayFormat) {
    this.monthDayFormat = monthDayFormat;
    return this;
  }

   /**
   * Get monthDayFormat
   * @return monthDayFormat
  **/
  @ApiModelProperty(example = "dd MMMM", value = "")
  public String getMonthDayFormat() {
    return monthDayFormat;
  }

  public void setMonthDayFormat(String monthDayFormat) {
    this.monthDayFormat = monthDayFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostStandingInstructionsRequest postStandingInstructionsRequest = (PostStandingInstructionsRequest) o;
    return Objects.equals(this.fromOfficeId, postStandingInstructionsRequest.fromOfficeId) &&
        Objects.equals(this.fromClientId, postStandingInstructionsRequest.fromClientId) &&
        Objects.equals(this.fromAccountType, postStandingInstructionsRequest.fromAccountType) &&
        Objects.equals(this.name, postStandingInstructionsRequest.name) &&
        Objects.equals(this.transferType, postStandingInstructionsRequest.transferType) &&
        Objects.equals(this.priority, postStandingInstructionsRequest.priority) &&
        Objects.equals(this.status, postStandingInstructionsRequest.status) &&
        Objects.equals(this.fromAccountId, postStandingInstructionsRequest.fromAccountId) &&
        Objects.equals(this.toOfficeId, postStandingInstructionsRequest.toOfficeId) &&
        Objects.equals(this.toClientId, postStandingInstructionsRequest.toClientId) &&
        Objects.equals(this.toAccountType, postStandingInstructionsRequest.toAccountType) &&
        Objects.equals(this.toAccountId, postStandingInstructionsRequest.toAccountId) &&
        Objects.equals(this.instructionType, postStandingInstructionsRequest.instructionType) &&
        Objects.equals(this.amount, postStandingInstructionsRequest.amount) &&
        Objects.equals(this.validFrom, postStandingInstructionsRequest.validFrom) &&
        Objects.equals(this.recurrenceType, postStandingInstructionsRequest.recurrenceType) &&
        Objects.equals(this.recurrenceInterval, postStandingInstructionsRequest.recurrenceInterval) &&
        Objects.equals(this.recurrenceFrequency, postStandingInstructionsRequest.recurrenceFrequency) &&
        Objects.equals(this.locale, postStandingInstructionsRequest.locale) &&
        Objects.equals(this.dateFormat, postStandingInstructionsRequest.dateFormat) &&
        Objects.equals(this.recurrenceOnMonthDay, postStandingInstructionsRequest.recurrenceOnMonthDay) &&
        Objects.equals(this.monthDayFormat, postStandingInstructionsRequest.monthDayFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromOfficeId, fromClientId, fromAccountType, name, transferType, priority, status, fromAccountId, toOfficeId, toClientId, toAccountType, toAccountId, instructionType, amount, validFrom, recurrenceType, recurrenceInterval, recurrenceFrequency, locale, dateFormat, recurrenceOnMonthDay, monthDayFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostStandingInstructionsRequest {\n");
    
    sb.append("    fromOfficeId: ").append(toIndentedString(fromOfficeId)).append("\n");
    sb.append("    fromClientId: ").append(toIndentedString(fromClientId)).append("\n");
    sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fromAccountId: ").append(toIndentedString(fromAccountId)).append("\n");
    sb.append("    toOfficeId: ").append(toIndentedString(toOfficeId)).append("\n");
    sb.append("    toClientId: ").append(toIndentedString(toClientId)).append("\n");
    sb.append("    toAccountType: ").append(toIndentedString(toAccountType)).append("\n");
    sb.append("    toAccountId: ").append(toIndentedString(toAccountId)).append("\n");
    sb.append("    instructionType: ").append(toIndentedString(instructionType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
    sb.append("    recurrenceInterval: ").append(toIndentedString(recurrenceInterval)).append("\n");
    sb.append("    recurrenceFrequency: ").append(toIndentedString(recurrenceFrequency)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    recurrenceOnMonthDay: ").append(toIndentedString(recurrenceOnMonthDay)).append("\n");
    sb.append("    monthDayFormat: ").append(toIndentedString(monthDayFormat)).append("\n");
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

}

