/*
 * Stakeholder engagement API
 * This API enables Intelligent Engagement for your Business. iEngage is a platform that combines process, augmented intelligence and rewards to help you intelligently engage customers.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.iengage.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.iengage.client.model.EntitySentiment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * VerveResponseEntitySentimentList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-24T14:38:21.881+05:30")
public class VerveResponseEntitySentimentList {
  @SerializedName("statusCode")
  private String statusCode = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("list")
  private List<EntitySentiment> list = new ArrayList<EntitySentiment>();

  @SerializedName("data")
  private EntitySentiment data = null;

  @SerializedName("records")
  private Long records = null;

  public VerveResponseEntitySentimentList statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public VerveResponseEntitySentimentList message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public VerveResponseEntitySentimentList list(List<EntitySentiment> list) {
    this.list = list;
    return this;
  }

  public VerveResponseEntitySentimentList addListItem(EntitySentiment listItem) {
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<EntitySentiment> getList() {
    return list;
  }

  public void setList(List<EntitySentiment> list) {
    this.list = list;
  }

  public VerveResponseEntitySentimentList data(EntitySentiment data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public EntitySentiment getData() {
    return data;
  }

  public void setData(EntitySentiment data) {
    this.data = data;
  }

  public VerveResponseEntitySentimentList records(Long records) {
    this.records = records;
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getRecords() {
    return records;
  }

  public void setRecords(Long records) {
    this.records = records;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerveResponseEntitySentimentList verveResponseEntitySentimentList = (VerveResponseEntitySentimentList) o;
    return Objects.equals(this.statusCode, verveResponseEntitySentimentList.statusCode) &&
        Objects.equals(this.message, verveResponseEntitySentimentList.message) &&
        Objects.equals(this.list, verveResponseEntitySentimentList.list) &&
        Objects.equals(this.data, verveResponseEntitySentimentList.data) &&
        Objects.equals(this.records, verveResponseEntitySentimentList.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, message, list, data, records);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerveResponseEntitySentimentList {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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

