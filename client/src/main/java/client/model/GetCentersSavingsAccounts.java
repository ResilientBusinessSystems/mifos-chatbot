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
import io.swagger.client.model.GetCentersAccountType;
import io.swagger.client.model.GetCentersCenterIdCurrency;
import io.swagger.client.model.GetCentersCenterIdStatus;
import io.swagger.client.model.GetCentersDepositType;
import io.swagger.client.model.GetCentersTimeline;
import java.io.IOException;

/**
 * GetCentersSavingsAccounts
 */

public class GetCentersSavingsAccounts {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountNo")
  private Long accountNo = null;

  @SerializedName("productId")
  private Integer productId = null;

  @SerializedName("productName")
  private String productName = null;

  @SerializedName("status")
  private GetCentersCenterIdStatus status = null;

  @SerializedName("currency")
  private GetCentersCenterIdCurrency currency = null;

  @SerializedName("accountType")
  private GetCentersAccountType accountType = null;

  @SerializedName("timeline")
  private GetCentersTimeline timeline = null;

  @SerializedName("depositType")
  private GetCentersDepositType depositType = null;

  public GetCentersSavingsAccounts id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "16", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetCentersSavingsAccounts accountNo(Long accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(example = "16", value = "")
  public Long getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }

  public GetCentersSavingsAccounts productId(Integer productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public GetCentersSavingsAccounts productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @ApiModelProperty(example = "Voluntary savings", value = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public GetCentersSavingsAccounts status(GetCentersCenterIdStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public GetCentersCenterIdStatus getStatus() {
    return status;
  }

  public void setStatus(GetCentersCenterIdStatus status) {
    this.status = status;
  }

  public GetCentersSavingsAccounts currency(GetCentersCenterIdCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetCentersCenterIdCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetCentersCenterIdCurrency currency) {
    this.currency = currency;
  }

  public GetCentersSavingsAccounts accountType(GetCentersAccountType accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")
  public GetCentersAccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(GetCentersAccountType accountType) {
    this.accountType = accountType;
  }

  public GetCentersSavingsAccounts timeline(GetCentersTimeline timeline) {
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @ApiModelProperty(value = "")
  public GetCentersTimeline getTimeline() {
    return timeline;
  }

  public void setTimeline(GetCentersTimeline timeline) {
    this.timeline = timeline;
  }

  public GetCentersSavingsAccounts depositType(GetCentersDepositType depositType) {
    this.depositType = depositType;
    return this;
  }

   /**
   * Get depositType
   * @return depositType
  **/
  @ApiModelProperty(value = "")
  public GetCentersDepositType getDepositType() {
    return depositType;
  }

  public void setDepositType(GetCentersDepositType depositType) {
    this.depositType = depositType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCentersSavingsAccounts getCentersSavingsAccounts = (GetCentersSavingsAccounts) o;
    return Objects.equals(this.id, getCentersSavingsAccounts.id) &&
        Objects.equals(this.accountNo, getCentersSavingsAccounts.accountNo) &&
        Objects.equals(this.productId, getCentersSavingsAccounts.productId) &&
        Objects.equals(this.productName, getCentersSavingsAccounts.productName) &&
        Objects.equals(this.status, getCentersSavingsAccounts.status) &&
        Objects.equals(this.currency, getCentersSavingsAccounts.currency) &&
        Objects.equals(this.accountType, getCentersSavingsAccounts.accountType) &&
        Objects.equals(this.timeline, getCentersSavingsAccounts.timeline) &&
        Objects.equals(this.depositType, getCentersSavingsAccounts.depositType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, productId, productName, status, currency, accountType, timeline, depositType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCentersSavingsAccounts {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    depositType: ").append(toIndentedString(depositType)).append("\n");
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

