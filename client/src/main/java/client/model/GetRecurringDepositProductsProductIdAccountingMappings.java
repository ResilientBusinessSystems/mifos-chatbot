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
import io.swagger.client.model.GetRecurringDepositProductsProductIdIncomeFromFeeAccount;
import io.swagger.client.model.GetRecurringDepositProductsProductIdIncomeFromPenaltyAccount;
import io.swagger.client.model.GetRecurringDepositProductsProductIdInterestOnSavingsAccount;
import io.swagger.client.model.GetRecurringDepositProductsProductIdSavingsControlAccount;
import io.swagger.client.model.GetRecurringDepositProductsProductIdSavingsReferenceAccount;
import io.swagger.client.model.GetRecurringDepositProductsProductIdTransfersInSuspenseAccount;
import java.io.IOException;

/**
 * GetRecurringDepositProductsProductIdAccountingMappings
 */

public class GetRecurringDepositProductsProductIdAccountingMappings {
  @SerializedName("savingsReferenceAccount")
  private GetRecurringDepositProductsProductIdSavingsReferenceAccount savingsReferenceAccount = null;

  @SerializedName("incomeFromFeeAccount")
  private GetRecurringDepositProductsProductIdIncomeFromFeeAccount incomeFromFeeAccount = null;

  @SerializedName("incomeFromPenaltyAccount")
  private GetRecurringDepositProductsProductIdIncomeFromPenaltyAccount incomeFromPenaltyAccount = null;

  @SerializedName("interestOnSavingsAccount")
  private GetRecurringDepositProductsProductIdInterestOnSavingsAccount interestOnSavingsAccount = null;

  @SerializedName("savingsControlAccount")
  private GetRecurringDepositProductsProductIdSavingsControlAccount savingsControlAccount = null;

  @SerializedName("transfersInSuspenseAccount")
  private GetRecurringDepositProductsProductIdTransfersInSuspenseAccount transfersInSuspenseAccount = null;

  public GetRecurringDepositProductsProductIdAccountingMappings savingsReferenceAccount(GetRecurringDepositProductsProductIdSavingsReferenceAccount savingsReferenceAccount) {
    this.savingsReferenceAccount = savingsReferenceAccount;
    return this;
  }

   /**
   * Get savingsReferenceAccount
   * @return savingsReferenceAccount
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositProductsProductIdSavingsReferenceAccount getSavingsReferenceAccount() {
    return savingsReferenceAccount;
  }

  public void setSavingsReferenceAccount(GetRecurringDepositProductsProductIdSavingsReferenceAccount savingsReferenceAccount) {
    this.savingsReferenceAccount = savingsReferenceAccount;
  }

  public GetRecurringDepositProductsProductIdAccountingMappings incomeFromFeeAccount(GetRecurringDepositProductsProductIdIncomeFromFeeAccount incomeFromFeeAccount) {
    this.incomeFromFeeAccount = incomeFromFeeAccount;
    return this;
  }

   /**
   * Get incomeFromFeeAccount
   * @return incomeFromFeeAccount
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositProductsProductIdIncomeFromFeeAccount getIncomeFromFeeAccount() {
    return incomeFromFeeAccount;
  }

  public void setIncomeFromFeeAccount(GetRecurringDepositProductsProductIdIncomeFromFeeAccount incomeFromFeeAccount) {
    this.incomeFromFeeAccount = incomeFromFeeAccount;
  }

  public GetRecurringDepositProductsProductIdAccountingMappings incomeFromPenaltyAccount(GetRecurringDepositProductsProductIdIncomeFromPenaltyAccount incomeFromPenaltyAccount) {
    this.incomeFromPenaltyAccount = incomeFromPenaltyAccount;
    return this;
  }

   /**
   * Get incomeFromPenaltyAccount
   * @return incomeFromPenaltyAccount
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositProductsProductIdIncomeFromPenaltyAccount getIncomeFromPenaltyAccount() {
    return incomeFromPenaltyAccount;
  }

  public void setIncomeFromPenaltyAccount(GetRecurringDepositProductsProductIdIncomeFromPenaltyAccount incomeFromPenaltyAccount) {
    this.incomeFromPenaltyAccount = incomeFromPenaltyAccount;
  }

  public GetRecurringDepositProductsProductIdAccountingMappings interestOnSavingsAccount(GetRecurringDepositProductsProductIdInterestOnSavingsAccount interestOnSavingsAccount) {
    this.interestOnSavingsAccount = interestOnSavingsAccount;
    return this;
  }

   /**
   * Get interestOnSavingsAccount
   * @return interestOnSavingsAccount
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositProductsProductIdInterestOnSavingsAccount getInterestOnSavingsAccount() {
    return interestOnSavingsAccount;
  }

  public void setInterestOnSavingsAccount(GetRecurringDepositProductsProductIdInterestOnSavingsAccount interestOnSavingsAccount) {
    this.interestOnSavingsAccount = interestOnSavingsAccount;
  }

  public GetRecurringDepositProductsProductIdAccountingMappings savingsControlAccount(GetRecurringDepositProductsProductIdSavingsControlAccount savingsControlAccount) {
    this.savingsControlAccount = savingsControlAccount;
    return this;
  }

   /**
   * Get savingsControlAccount
   * @return savingsControlAccount
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositProductsProductIdSavingsControlAccount getSavingsControlAccount() {
    return savingsControlAccount;
  }

  public void setSavingsControlAccount(GetRecurringDepositProductsProductIdSavingsControlAccount savingsControlAccount) {
    this.savingsControlAccount = savingsControlAccount;
  }

  public GetRecurringDepositProductsProductIdAccountingMappings transfersInSuspenseAccount(GetRecurringDepositProductsProductIdTransfersInSuspenseAccount transfersInSuspenseAccount) {
    this.transfersInSuspenseAccount = transfersInSuspenseAccount;
    return this;
  }

   /**
   * Get transfersInSuspenseAccount
   * @return transfersInSuspenseAccount
  **/
  @ApiModelProperty(value = "")
  public GetRecurringDepositProductsProductIdTransfersInSuspenseAccount getTransfersInSuspenseAccount() {
    return transfersInSuspenseAccount;
  }

  public void setTransfersInSuspenseAccount(GetRecurringDepositProductsProductIdTransfersInSuspenseAccount transfersInSuspenseAccount) {
    this.transfersInSuspenseAccount = transfersInSuspenseAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringDepositProductsProductIdAccountingMappings getRecurringDepositProductsProductIdAccountingMappings = (GetRecurringDepositProductsProductIdAccountingMappings) o;
    return Objects.equals(this.savingsReferenceAccount, getRecurringDepositProductsProductIdAccountingMappings.savingsReferenceAccount) &&
        Objects.equals(this.incomeFromFeeAccount, getRecurringDepositProductsProductIdAccountingMappings.incomeFromFeeAccount) &&
        Objects.equals(this.incomeFromPenaltyAccount, getRecurringDepositProductsProductIdAccountingMappings.incomeFromPenaltyAccount) &&
        Objects.equals(this.interestOnSavingsAccount, getRecurringDepositProductsProductIdAccountingMappings.interestOnSavingsAccount) &&
        Objects.equals(this.savingsControlAccount, getRecurringDepositProductsProductIdAccountingMappings.savingsControlAccount) &&
        Objects.equals(this.transfersInSuspenseAccount, getRecurringDepositProductsProductIdAccountingMappings.transfersInSuspenseAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savingsReferenceAccount, incomeFromFeeAccount, incomeFromPenaltyAccount, interestOnSavingsAccount, savingsControlAccount, transfersInSuspenseAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositProductsProductIdAccountingMappings {\n");
    
    sb.append("    savingsReferenceAccount: ").append(toIndentedString(savingsReferenceAccount)).append("\n");
    sb.append("    incomeFromFeeAccount: ").append(toIndentedString(incomeFromFeeAccount)).append("\n");
    sb.append("    incomeFromPenaltyAccount: ").append(toIndentedString(incomeFromPenaltyAccount)).append("\n");
    sb.append("    interestOnSavingsAccount: ").append(toIndentedString(interestOnSavingsAccount)).append("\n");
    sb.append("    savingsControlAccount: ").append(toIndentedString(savingsControlAccount)).append("\n");
    sb.append("    transfersInSuspenseAccount: ").append(toIndentedString(transfersInSuspenseAccount)).append("\n");
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

