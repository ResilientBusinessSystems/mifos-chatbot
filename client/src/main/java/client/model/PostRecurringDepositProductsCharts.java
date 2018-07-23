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
import io.swagger.client.model.PostRecurringDepositProductsChartSlabs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PostRecurringDepositProductsCharts
 */

public class PostRecurringDepositProductsCharts {
  @SerializedName("fromDate")
  private String fromDate = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("chartSlabs")
  private List<PostRecurringDepositProductsChartSlabs> chartSlabs = null;

  public PostRecurringDepositProductsCharts fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @ApiModelProperty(example = "01 Jan 2014", value = "")
  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public PostRecurringDepositProductsCharts locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(example = "en", value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PostRecurringDepositProductsCharts dateFormat(String dateFormat) {
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

  public PostRecurringDepositProductsCharts chartSlabs(List<PostRecurringDepositProductsChartSlabs> chartSlabs) {
    this.chartSlabs = chartSlabs;
    return this;
  }

  public PostRecurringDepositProductsCharts addChartSlabsItem(PostRecurringDepositProductsChartSlabs chartSlabsItem) {
    if (this.chartSlabs == null) {
      this.chartSlabs = new ArrayList<PostRecurringDepositProductsChartSlabs>();
    }
    this.chartSlabs.add(chartSlabsItem);
    return this;
  }

   /**
   * Get chartSlabs
   * @return chartSlabs
  **/
  @ApiModelProperty(value = "")
  public List<PostRecurringDepositProductsChartSlabs> getChartSlabs() {
    return chartSlabs;
  }

  public void setChartSlabs(List<PostRecurringDepositProductsChartSlabs> chartSlabs) {
    this.chartSlabs = chartSlabs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostRecurringDepositProductsCharts postRecurringDepositProductsCharts = (PostRecurringDepositProductsCharts) o;
    return Objects.equals(this.fromDate, postRecurringDepositProductsCharts.fromDate) &&
        Objects.equals(this.locale, postRecurringDepositProductsCharts.locale) &&
        Objects.equals(this.dateFormat, postRecurringDepositProductsCharts.dateFormat) &&
        Objects.equals(this.chartSlabs, postRecurringDepositProductsCharts.chartSlabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDate, locale, dateFormat, chartSlabs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRecurringDepositProductsCharts {\n");
    
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    chartSlabs: ").append(toIndentedString(chartSlabs)).append("\n");
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

