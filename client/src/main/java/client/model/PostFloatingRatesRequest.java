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
import io.swagger.client.model.PostFloatingRatesRatePeriods;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PostFloatingRatesRequest
 */

public class PostFloatingRatesRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("isBaseLendingRate")
  private Boolean isBaseLendingRate = null;

  @SerializedName("isActive")
  private Boolean isActive = null;

  @SerializedName("ratePeriods")
  private List<PostFloatingRatesRatePeriods> ratePeriods = null;

  public PostFloatingRatesRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Floating Rate 1", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostFloatingRatesRequest isBaseLendingRate(Boolean isBaseLendingRate) {
    this.isBaseLendingRate = isBaseLendingRate;
    return this;
  }

   /**
   * Get isBaseLendingRate
   * @return isBaseLendingRate
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isIsBaseLendingRate() {
    return isBaseLendingRate;
  }

  public void setIsBaseLendingRate(Boolean isBaseLendingRate) {
    this.isBaseLendingRate = isBaseLendingRate;
  }

  public PostFloatingRatesRequest isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public PostFloatingRatesRequest ratePeriods(List<PostFloatingRatesRatePeriods> ratePeriods) {
    this.ratePeriods = ratePeriods;
    return this;
  }

  public PostFloatingRatesRequest addRatePeriodsItem(PostFloatingRatesRatePeriods ratePeriodsItem) {
    if (this.ratePeriods == null) {
      this.ratePeriods = new ArrayList<PostFloatingRatesRatePeriods>();
    }
    this.ratePeriods.add(ratePeriodsItem);
    return this;
  }

   /**
   * Get ratePeriods
   * @return ratePeriods
  **/
  @ApiModelProperty(value = "")
  public List<PostFloatingRatesRatePeriods> getRatePeriods() {
    return ratePeriods;
  }

  public void setRatePeriods(List<PostFloatingRatesRatePeriods> ratePeriods) {
    this.ratePeriods = ratePeriods;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostFloatingRatesRequest postFloatingRatesRequest = (PostFloatingRatesRequest) o;
    return Objects.equals(this.name, postFloatingRatesRequest.name) &&
        Objects.equals(this.isBaseLendingRate, postFloatingRatesRequest.isBaseLendingRate) &&
        Objects.equals(this.isActive, postFloatingRatesRequest.isActive) &&
        Objects.equals(this.ratePeriods, postFloatingRatesRequest.ratePeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isBaseLendingRate, isActive, ratePeriods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFloatingRatesRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isBaseLendingRate: ").append(toIndentedString(isBaseLendingRate)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    ratePeriods: ").append(toIndentedString(ratePeriods)).append("\n");
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

