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
import io.swagger.client.model.GetEquityType;
import io.swagger.client.model.GetProductsLiabilityUsage;
import io.swagger.client.model.GetProductsTagId;
import java.io.IOException;

/**
 * GetProductsEquityAccountOptions
 */

public class GetProductsEquityAccountOptions {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("glCode")
  private String glCode = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("manualEntriesAllowed")
  private Boolean manualEntriesAllowed = null;

  @SerializedName("type")
  private GetEquityType type = null;

  @SerializedName("usage")
  private GetProductsLiabilityUsage usage = null;

  @SerializedName("nameDecorated")
  private String nameDecorated = null;

  @SerializedName("tagId")
  private GetProductsTagId tagId = null;

  public GetProductsEquityAccountOptions id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "66", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetProductsEquityAccountOptions name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Equity Account", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetProductsEquityAccountOptions glCode(String glCode) {
    this.glCode = glCode;
    return this;
  }

   /**
   * Get glCode
   * @return glCode
  **/
  @ApiModelProperty(example = "EQUITY1", value = "")
  public String getGlCode() {
    return glCode;
  }

  public void setGlCode(String glCode) {
    this.glCode = glCode;
  }

  public GetProductsEquityAccountOptions disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public GetProductsEquityAccountOptions manualEntriesAllowed(Boolean manualEntriesAllowed) {
    this.manualEntriesAllowed = manualEntriesAllowed;
    return this;
  }

   /**
   * Get manualEntriesAllowed
   * @return manualEntriesAllowed
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isManualEntriesAllowed() {
    return manualEntriesAllowed;
  }

  public void setManualEntriesAllowed(Boolean manualEntriesAllowed) {
    this.manualEntriesAllowed = manualEntriesAllowed;
  }

  public GetProductsEquityAccountOptions type(GetEquityType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public GetEquityType getType() {
    return type;
  }

  public void setType(GetEquityType type) {
    this.type = type;
  }

  public GetProductsEquityAccountOptions usage(GetProductsLiabilityUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @ApiModelProperty(value = "")
  public GetProductsLiabilityUsage getUsage() {
    return usage;
  }

  public void setUsage(GetProductsLiabilityUsage usage) {
    this.usage = usage;
  }

  public GetProductsEquityAccountOptions nameDecorated(String nameDecorated) {
    this.nameDecorated = nameDecorated;
    return this;
  }

   /**
   * Get nameDecorated
   * @return nameDecorated
  **/
  @ApiModelProperty(example = "Equity Account", value = "")
  public String getNameDecorated() {
    return nameDecorated;
  }

  public void setNameDecorated(String nameDecorated) {
    this.nameDecorated = nameDecorated;
  }

  public GetProductsEquityAccountOptions tagId(GetProductsTagId tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
  @ApiModelProperty(value = "")
  public GetProductsTagId getTagId() {
    return tagId;
  }

  public void setTagId(GetProductsTagId tagId) {
    this.tagId = tagId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProductsEquityAccountOptions getProductsEquityAccountOptions = (GetProductsEquityAccountOptions) o;
    return Objects.equals(this.id, getProductsEquityAccountOptions.id) &&
        Objects.equals(this.name, getProductsEquityAccountOptions.name) &&
        Objects.equals(this.glCode, getProductsEquityAccountOptions.glCode) &&
        Objects.equals(this.disabled, getProductsEquityAccountOptions.disabled) &&
        Objects.equals(this.manualEntriesAllowed, getProductsEquityAccountOptions.manualEntriesAllowed) &&
        Objects.equals(this.type, getProductsEquityAccountOptions.type) &&
        Objects.equals(this.usage, getProductsEquityAccountOptions.usage) &&
        Objects.equals(this.nameDecorated, getProductsEquityAccountOptions.nameDecorated) &&
        Objects.equals(this.tagId, getProductsEquityAccountOptions.tagId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, glCode, disabled, manualEntriesAllowed, type, usage, nameDecorated, tagId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProductsEquityAccountOptions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    manualEntriesAllowed: ").append(toIndentedString(manualEntriesAllowed)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    nameDecorated: ").append(toIndentedString(nameDecorated)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
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

