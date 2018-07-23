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
import io.swagger.client.model.GetRecurringPaymentDetailData;
import io.swagger.client.model.GetRecurringTransactionsCurrency;
import io.swagger.client.model.GetRecurringTransactionsTransactionType;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse
 */

public class GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("transactionType")
  private GetRecurringTransactionsTransactionType transactionType = null;

  @SerializedName("accountId")
  private Integer accountId = null;

  @SerializedName("accountNo")
  private String accountNo = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("currency")
  private GetRecurringTransactionsCurrency currency = null;

  @SerializedName("paymentDetailData")
  private GetRecurringPaymentDetailData paymentDetailData = null;

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("runningBalance")
  private Integer runningBalance = null;

  @SerializedName("reversed")
  private Boolean reversed = null;

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse id(Integer id) {
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

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse transactionType(GetRecurringTransactionsTransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringTransactionsTransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(GetRecurringTransactionsTransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(example = "000000001", value = "")
  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "[2013, 8, 7]", value = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse currency(GetRecurringTransactionsCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetRecurringTransactionsCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetRecurringTransactionsCurrency currency) {
    this.currency = currency;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse paymentDetailData(GetRecurringPaymentDetailData paymentDetailData) {
    this.paymentDetailData = paymentDetailData;
    return this;
  }

   /**
   * Get paymentDetailData
   * @return paymentDetailData
  **/
  @ApiModelProperty(value = "")
  public GetRecurringPaymentDetailData getPaymentDetailData() {
    return paymentDetailData;
  }

  public void setPaymentDetailData(GetRecurringPaymentDetailData paymentDetailData) {
    this.paymentDetailData = paymentDetailData;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "5000.0", value = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse runningBalance(Integer runningBalance) {
    this.runningBalance = runningBalance;
    return this;
  }

   /**
   * Get runningBalance
   * @return runningBalance
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getRunningBalance() {
    return runningBalance;
  }

  public void setRunningBalance(Integer runningBalance) {
    this.runningBalance = runningBalance;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse reversed(Boolean reversed) {
    this.reversed = reversed;
    return this;
  }

   /**
   * Get reversed
   * @return reversed
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isReversed() {
    return reversed;
  }

  public void setReversed(Boolean reversed) {
    this.reversed = reversed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse = (GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse) o;
    return Objects.equals(this.id, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.id) &&
        Objects.equals(this.transactionType, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.transactionType) &&
        Objects.equals(this.accountId, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.accountId) &&
        Objects.equals(this.accountNo, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.accountNo) &&
        Objects.equals(this.date, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.date) &&
        Objects.equals(this.currency, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.currency) &&
        Objects.equals(this.paymentDetailData, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.paymentDetailData) &&
        Objects.equals(this.amount, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.amount) &&
        Objects.equals(this.runningBalance, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.runningBalance) &&
        Objects.equals(this.reversed, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.reversed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionType, accountId, accountNo, date, currency, paymentDetailData, amount, runningBalance, reversed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentDetailData: ").append(toIndentedString(paymentDetailData)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    runningBalance: ").append(toIndentedString(runningBalance)).append("\n");
    sb.append("    reversed: ").append(toIndentedString(reversed)).append("\n");
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

