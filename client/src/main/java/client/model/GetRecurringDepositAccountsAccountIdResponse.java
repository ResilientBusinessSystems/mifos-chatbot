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
import io.swagger.client.model.GetRecurringDepositAccountsAccountChart;
import io.swagger.client.model.GetRecurringDepositAccountsCurrency;
import io.swagger.client.model.GetRecurringDepositAccountsDepositPeriodFrequency;
import io.swagger.client.model.GetRecurringDepositAccountsInterestCalculationDaysInYearType;
import io.swagger.client.model.GetRecurringDepositAccountsInterestCalculationType;
import io.swagger.client.model.GetRecurringDepositAccountsInterestCompoundingPeriodType;
import io.swagger.client.model.GetRecurringDepositAccountsInterestPostingPeriodType;
import io.swagger.client.model.GetRecurringDepositAccountsMaxDepositTermType;
import io.swagger.client.model.GetRecurringDepositAccountsMinDepositTermType;
import io.swagger.client.model.GetRecurringDepositAccountsRecurringDepositFrequencyType;
import io.swagger.client.model.GetRecurringDepositAccountsStatus;
import io.swagger.client.model.GetRecurringDepositAccountsSummary;
import io.swagger.client.model.GetRecurringDepositAccountsTimeline;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * GetRecurringDepositAccountsAccountIdResponse
 */

public class GetRecurringDepositAccountsAccountIdResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountNo")
  private Long accountNo = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("clientName")
  private String clientName = null;

  @SerializedName("savingsProductId")
  private Integer savingsProductId = null;

  @SerializedName("savingsProductName")
  private String savingsProductName = null;

  @SerializedName("fieldOfficerId")
  private Integer fieldOfficerId = null;

  @SerializedName("status")
  private GetRecurringDepositAccountsStatus status = null;

  @SerializedName("timeline")
  private GetRecurringDepositAccountsTimeline timeline = null;

  @SerializedName("currency")
  private GetRecurringDepositAccountsCurrency currency = null;

  @SerializedName("interestCompoundingPeriodType")
  private GetRecurringDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType = null;

  @SerializedName("interestPostingPeriodType")
  private GetRecurringDepositAccountsInterestPostingPeriodType interestPostingPeriodType = null;

  @SerializedName("interestCalculationType")
  private GetRecurringDepositAccountsInterestCalculationType interestCalculationType = null;

  @SerializedName("interestCalculationDaysInYearType")
  private GetRecurringDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType = null;

  @SerializedName("preClosurePenalApplicable")
  private Boolean preClosurePenalApplicable = null;

  @SerializedName("minDepositTerm")
  private Integer minDepositTerm = null;

  @SerializedName("maxDepositTerm")
  private Integer maxDepositTerm = null;

  @SerializedName("minDepositTermType")
  private GetRecurringDepositAccountsMinDepositTermType minDepositTermType = null;

  @SerializedName("maxDepositTermType")
  private GetRecurringDepositAccountsMaxDepositTermType maxDepositTermType = null;

  @SerializedName("recurringDepositAmount")
  private Integer recurringDepositAmount = null;

  @SerializedName("recurringDepositFrequency")
  private Integer recurringDepositFrequency = null;

  @SerializedName("expectedFirstDepositOnDate")
  private LocalDate expectedFirstDepositOnDate = null;

  @SerializedName("recurringDepositFrequencyType")
  private GetRecurringDepositAccountsRecurringDepositFrequencyType recurringDepositFrequencyType = null;

  @SerializedName("depositPeriod")
  private Integer depositPeriod = null;

  @SerializedName("depositPeriodFrequency")
  private GetRecurringDepositAccountsDepositPeriodFrequency depositPeriodFrequency = null;

  @SerializedName("summary")
  private GetRecurringDepositAccountsSummary summary = null;

  @SerializedName("accountChart")
  private GetRecurringDepositAccountsAccountChart accountChart = null;

  public GetRecurringDepositAccountsAccountIdResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetRecurringDepositAccountsAccountIdResponse accountNo(Long accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(example = "RD000023", value = "")
  public Long getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }

  public GetRecurringDepositAccountsAccountIdResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(example = "RD-23", value = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public GetRecurringDepositAccountsAccountIdResponse clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public GetRecurringDepositAccountsAccountIdResponse clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @ApiModelProperty(example = "Sangamesh N", value = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public GetRecurringDepositAccountsAccountIdResponse savingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
    return this;
  }

   /**
   * Get savingsProductId
   * @return savingsProductId
  **/
  @ApiModelProperty(example = "3", value = "")
  public Integer getSavingsProductId() {
    return savingsProductId;
  }

  public void setSavingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
  }

  public GetRecurringDepositAccountsAccountIdResponse savingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
    return this;
  }

   /**
   * Get savingsProductName
   * @return savingsProductName
  **/
  @ApiModelProperty(example = "RD01", value = "")
  public String getSavingsProductName() {
    return savingsProductName;
  }

  public void setSavingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
  }

  public GetRecurringDepositAccountsAccountIdResponse fieldOfficerId(Integer fieldOfficerId) {
    this.fieldOfficerId = fieldOfficerId;
    return this;
  }

   /**
   * Get fieldOfficerId
   * @return fieldOfficerId
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getFieldOfficerId() {
    return fieldOfficerId;
  }

  public void setFieldOfficerId(Integer fieldOfficerId) {
    this.fieldOfficerId = fieldOfficerId;
  }

  public GetRecurringDepositAccountsAccountIdResponse status(GetRecurringDepositAccountsStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsStatus getStatus() {
    return status;
  }

  public void setStatus(GetRecurringDepositAccountsStatus status) {
    this.status = status;
  }

  public GetRecurringDepositAccountsAccountIdResponse timeline(GetRecurringDepositAccountsTimeline timeline) {
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsTimeline getTimeline() {
    return timeline;
  }

  public void setTimeline(GetRecurringDepositAccountsTimeline timeline) {
    this.timeline = timeline;
  }

  public GetRecurringDepositAccountsAccountIdResponse currency(GetRecurringDepositAccountsCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetRecurringDepositAccountsCurrency currency) {
    this.currency = currency;
  }

  public GetRecurringDepositAccountsAccountIdResponse interestCompoundingPeriodType(GetRecurringDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsInterestCompoundingPeriodType getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }

  public void setInterestCompoundingPeriodType(GetRecurringDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }

  public GetRecurringDepositAccountsAccountIdResponse interestPostingPeriodType(GetRecurringDepositAccountsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsInterestPostingPeriodType getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }

  public void setInterestPostingPeriodType(GetRecurringDepositAccountsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }

  public GetRecurringDepositAccountsAccountIdResponse interestCalculationType(GetRecurringDepositAccountsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsInterestCalculationType getInterestCalculationType() {
    return interestCalculationType;
  }

  public void setInterestCalculationType(GetRecurringDepositAccountsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }

  public GetRecurringDepositAccountsAccountIdResponse interestCalculationDaysInYearType(GetRecurringDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsInterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }

  public void setInterestCalculationDaysInYearType(GetRecurringDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }

  public GetRecurringDepositAccountsAccountIdResponse preClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    this.preClosurePenalApplicable = preClosurePenalApplicable;
    return this;
  }

   /**
   * Get preClosurePenalApplicable
   * @return preClosurePenalApplicable
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isPreClosurePenalApplicable() {
    return preClosurePenalApplicable;
  }

  public void setPreClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    this.preClosurePenalApplicable = preClosurePenalApplicable;
  }

  public GetRecurringDepositAccountsAccountIdResponse minDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
    return this;
  }

   /**
   * Get minDepositTerm
   * @return minDepositTerm
  **/
  @ApiModelProperty(example = "3", value = "")
  public Integer getMinDepositTerm() {
    return minDepositTerm;
  }

  public void setMinDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
  }

  public GetRecurringDepositAccountsAccountIdResponse maxDepositTerm(Integer maxDepositTerm) {
    this.maxDepositTerm = maxDepositTerm;
    return this;
  }

   /**
   * Get maxDepositTerm
   * @return maxDepositTerm
  **/
  @ApiModelProperty(example = "4", value = "")
  public Integer getMaxDepositTerm() {
    return maxDepositTerm;
  }

  public void setMaxDepositTerm(Integer maxDepositTerm) {
    this.maxDepositTerm = maxDepositTerm;
  }

  public GetRecurringDepositAccountsAccountIdResponse minDepositTermType(GetRecurringDepositAccountsMinDepositTermType minDepositTermType) {
    this.minDepositTermType = minDepositTermType;
    return this;
  }

   /**
   * Get minDepositTermType
   * @return minDepositTermType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsMinDepositTermType getMinDepositTermType() {
    return minDepositTermType;
  }

  public void setMinDepositTermType(GetRecurringDepositAccountsMinDepositTermType minDepositTermType) {
    this.minDepositTermType = minDepositTermType;
  }

  public GetRecurringDepositAccountsAccountIdResponse maxDepositTermType(GetRecurringDepositAccountsMaxDepositTermType maxDepositTermType) {
    this.maxDepositTermType = maxDepositTermType;
    return this;
  }

   /**
   * Get maxDepositTermType
   * @return maxDepositTermType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsMaxDepositTermType getMaxDepositTermType() {
    return maxDepositTermType;
  }

  public void setMaxDepositTermType(GetRecurringDepositAccountsMaxDepositTermType maxDepositTermType) {
    this.maxDepositTermType = maxDepositTermType;
  }

  public GetRecurringDepositAccountsAccountIdResponse recurringDepositAmount(Integer recurringDepositAmount) {
    this.recurringDepositAmount = recurringDepositAmount;
    return this;
  }

   /**
   * Get recurringDepositAmount
   * @return recurringDepositAmount
  **/
  @ApiModelProperty(example = "100", value = "")
  public Integer getRecurringDepositAmount() {
    return recurringDepositAmount;
  }

  public void setRecurringDepositAmount(Integer recurringDepositAmount) {
    this.recurringDepositAmount = recurringDepositAmount;
  }

  public GetRecurringDepositAccountsAccountIdResponse recurringDepositFrequency(Integer recurringDepositFrequency) {
    this.recurringDepositFrequency = recurringDepositFrequency;
    return this;
  }

   /**
   * Get recurringDepositFrequency
   * @return recurringDepositFrequency
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getRecurringDepositFrequency() {
    return recurringDepositFrequency;
  }

  public void setRecurringDepositFrequency(Integer recurringDepositFrequency) {
    this.recurringDepositFrequency = recurringDepositFrequency;
  }

  public GetRecurringDepositAccountsAccountIdResponse expectedFirstDepositOnDate(LocalDate expectedFirstDepositOnDate) {
    this.expectedFirstDepositOnDate = expectedFirstDepositOnDate;
    return this;
  }

   /**
   * Get expectedFirstDepositOnDate
   * @return expectedFirstDepositOnDate
  **/
  @ApiModelProperty(example = "[2014, 4, 2]", value = "")
  public LocalDate getExpectedFirstDepositOnDate() {
    return expectedFirstDepositOnDate;
  }

  public void setExpectedFirstDepositOnDate(LocalDate expectedFirstDepositOnDate) {
    this.expectedFirstDepositOnDate = expectedFirstDepositOnDate;
  }

  public GetRecurringDepositAccountsAccountIdResponse recurringDepositFrequencyType(GetRecurringDepositAccountsRecurringDepositFrequencyType recurringDepositFrequencyType) {
    this.recurringDepositFrequencyType = recurringDepositFrequencyType;
    return this;
  }

   /**
   * Get recurringDepositFrequencyType
   * @return recurringDepositFrequencyType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsRecurringDepositFrequencyType getRecurringDepositFrequencyType() {
    return recurringDepositFrequencyType;
  }

  public void setRecurringDepositFrequencyType(GetRecurringDepositAccountsRecurringDepositFrequencyType recurringDepositFrequencyType) {
    this.recurringDepositFrequencyType = recurringDepositFrequencyType;
  }

  public GetRecurringDepositAccountsAccountIdResponse depositPeriod(Integer depositPeriod) {
    this.depositPeriod = depositPeriod;
    return this;
  }

   /**
   * Get depositPeriod
   * @return depositPeriod
  **/
  @ApiModelProperty(example = "6", value = "")
  public Integer getDepositPeriod() {
    return depositPeriod;
  }

  public void setDepositPeriod(Integer depositPeriod) {
    this.depositPeriod = depositPeriod;
  }

  public GetRecurringDepositAccountsAccountIdResponse depositPeriodFrequency(GetRecurringDepositAccountsDepositPeriodFrequency depositPeriodFrequency) {
    this.depositPeriodFrequency = depositPeriodFrequency;
    return this;
  }

   /**
   * Get depositPeriodFrequency
   * @return depositPeriodFrequency
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsDepositPeriodFrequency getDepositPeriodFrequency() {
    return depositPeriodFrequency;
  }

  public void setDepositPeriodFrequency(GetRecurringDepositAccountsDepositPeriodFrequency depositPeriodFrequency) {
    this.depositPeriodFrequency = depositPeriodFrequency;
  }

  public GetRecurringDepositAccountsAccountIdResponse summary(GetRecurringDepositAccountsSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsSummary getSummary() {
    return summary;
  }

  public void setSummary(GetRecurringDepositAccountsSummary summary) {
    this.summary = summary;
  }

  public GetRecurringDepositAccountsAccountIdResponse accountChart(GetRecurringDepositAccountsAccountChart accountChart) {
    this.accountChart = accountChart;
    return this;
  }

   /**
   * Get accountChart
   * @return accountChart
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositAccountsAccountChart getAccountChart() {
    return accountChart;
  }

  public void setAccountChart(GetRecurringDepositAccountsAccountChart accountChart) {
    this.accountChart = accountChart;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringDepositAccountsAccountIdResponse getRecurringDepositAccountsAccountIdResponse = (GetRecurringDepositAccountsAccountIdResponse) o;
    return Objects.equals(this.id, getRecurringDepositAccountsAccountIdResponse.id) &&
        Objects.equals(this.accountNo, getRecurringDepositAccountsAccountIdResponse.accountNo) &&
        Objects.equals(this.externalId, getRecurringDepositAccountsAccountIdResponse.externalId) &&
        Objects.equals(this.clientId, getRecurringDepositAccountsAccountIdResponse.clientId) &&
        Objects.equals(this.clientName, getRecurringDepositAccountsAccountIdResponse.clientName) &&
        Objects.equals(this.savingsProductId, getRecurringDepositAccountsAccountIdResponse.savingsProductId) &&
        Objects.equals(this.savingsProductName, getRecurringDepositAccountsAccountIdResponse.savingsProductName) &&
        Objects.equals(this.fieldOfficerId, getRecurringDepositAccountsAccountIdResponse.fieldOfficerId) &&
        Objects.equals(this.status, getRecurringDepositAccountsAccountIdResponse.status) &&
        Objects.equals(this.timeline, getRecurringDepositAccountsAccountIdResponse.timeline) &&
        Objects.equals(this.currency, getRecurringDepositAccountsAccountIdResponse.currency) &&
        Objects.equals(this.interestCompoundingPeriodType, getRecurringDepositAccountsAccountIdResponse.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, getRecurringDepositAccountsAccountIdResponse.interestPostingPeriodType) &&
        Objects.equals(this.interestCalculationType, getRecurringDepositAccountsAccountIdResponse.interestCalculationType) &&
        Objects.equals(this.interestCalculationDaysInYearType, getRecurringDepositAccountsAccountIdResponse.interestCalculationDaysInYearType) &&
        Objects.equals(this.preClosurePenalApplicable, getRecurringDepositAccountsAccountIdResponse.preClosurePenalApplicable) &&
        Objects.equals(this.minDepositTerm, getRecurringDepositAccountsAccountIdResponse.minDepositTerm) &&
        Objects.equals(this.maxDepositTerm, getRecurringDepositAccountsAccountIdResponse.maxDepositTerm) &&
        Objects.equals(this.minDepositTermType, getRecurringDepositAccountsAccountIdResponse.minDepositTermType) &&
        Objects.equals(this.maxDepositTermType, getRecurringDepositAccountsAccountIdResponse.maxDepositTermType) &&
        Objects.equals(this.recurringDepositAmount, getRecurringDepositAccountsAccountIdResponse.recurringDepositAmount) &&
        Objects.equals(this.recurringDepositFrequency, getRecurringDepositAccountsAccountIdResponse.recurringDepositFrequency) &&
        Objects.equals(this.expectedFirstDepositOnDate, getRecurringDepositAccountsAccountIdResponse.expectedFirstDepositOnDate) &&
        Objects.equals(this.recurringDepositFrequencyType, getRecurringDepositAccountsAccountIdResponse.recurringDepositFrequencyType) &&
        Objects.equals(this.depositPeriod, getRecurringDepositAccountsAccountIdResponse.depositPeriod) &&
        Objects.equals(this.depositPeriodFrequency, getRecurringDepositAccountsAccountIdResponse.depositPeriodFrequency) &&
        Objects.equals(this.summary, getRecurringDepositAccountsAccountIdResponse.summary) &&
        Objects.equals(this.accountChart, getRecurringDepositAccountsAccountIdResponse.accountChart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, externalId, clientId, clientName, savingsProductId, savingsProductName, fieldOfficerId, status, timeline, currency, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, preClosurePenalApplicable, minDepositTerm, maxDepositTerm, minDepositTermType, maxDepositTermType, recurringDepositAmount, recurringDepositFrequency, expectedFirstDepositOnDate, recurringDepositFrequencyType, depositPeriod, depositPeriodFrequency, summary, accountChart);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositAccountsAccountIdResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    savingsProductId: ").append(toIndentedString(savingsProductId)).append("\n");
    sb.append("    savingsProductName: ").append(toIndentedString(savingsProductName)).append("\n");
    sb.append("    fieldOfficerId: ").append(toIndentedString(fieldOfficerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    preClosurePenalApplicable: ").append(toIndentedString(preClosurePenalApplicable)).append("\n");
    sb.append("    minDepositTerm: ").append(toIndentedString(minDepositTerm)).append("\n");
    sb.append("    maxDepositTerm: ").append(toIndentedString(maxDepositTerm)).append("\n");
    sb.append("    minDepositTermType: ").append(toIndentedString(minDepositTermType)).append("\n");
    sb.append("    maxDepositTermType: ").append(toIndentedString(maxDepositTermType)).append("\n");
    sb.append("    recurringDepositAmount: ").append(toIndentedString(recurringDepositAmount)).append("\n");
    sb.append("    recurringDepositFrequency: ").append(toIndentedString(recurringDepositFrequency)).append("\n");
    sb.append("    expectedFirstDepositOnDate: ").append(toIndentedString(expectedFirstDepositOnDate)).append("\n");
    sb.append("    recurringDepositFrequencyType: ").append(toIndentedString(recurringDepositFrequencyType)).append("\n");
    sb.append("    depositPeriod: ").append(toIndentedString(depositPeriod)).append("\n");
    sb.append("    depositPeriodFrequency: ").append(toIndentedString(depositPeriodFrequency)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    accountChart: ").append(toIndentedString(accountChart)).append("\n");
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

