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
import com.iengage.client.model.UserPoints;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * VerveResponseUserPointsList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-24T14:38:21.881+05:30")
public class VerveResponseUserPointsList {
  @SerializedName("statusCode")
  private String statusCode = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("list")
  private List<UserPoints> list = new ArrayList<UserPoints>();

  @SerializedName("data")
  private UserPoints data = null;

  @SerializedName("records")
  private Long records = null;

  public VerveResponseUserPointsList statusCode(String statusCode) {
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

  public VerveResponseUserPointsList message(String message) {
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

  public VerveResponseUserPointsList list(List<UserPoints> list) {
    this.list = list;
    return this;
  }

  public VerveResponseUserPointsList addListItem(UserPoints listItem) {
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<UserPoints> getList() {
    return list;
  }

  public void setList(List<UserPoints> list) {
    this.list = list;
  }

  public VerveResponseUserPointsList data(UserPoints data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserPoints getData() {
    return data;
  }

  public void setData(UserPoints data) {
    this.data = data;
  }

  public VerveResponseUserPointsList records(Long records) {
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
    VerveResponseUserPointsList verveResponseUserPointsList = (VerveResponseUserPointsList) o;
    return Objects.equals(this.statusCode, verveResponseUserPointsList.statusCode) &&
        Objects.equals(this.message, verveResponseUserPointsList.message) &&
        Objects.equals(this.list, verveResponseUserPointsList.list) &&
        Objects.equals(this.data, verveResponseUserPointsList.data) &&
        Objects.equals(this.records, verveResponseUserPointsList.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, message, list, data, records);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerveResponseUserPointsList {\n");
    
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

