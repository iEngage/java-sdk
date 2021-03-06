/**
 * iEngage 2.0 API
 * This API enables Intelligent Engagement for your Business. iEngage is a platform that combines process, augmented intelligence and rewards to help you intelligently engage customers.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.iengage.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.iengage.client.model.EntitiesClassified;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VerveResponseEntitiesClassifiedList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-18T06:00:03.235Z")
public class VerveResponseEntitiesClassifiedList   {
  @SerializedName("statusCode")
  private String statusCode = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("list")
  private List<EntitiesClassified> list = new ArrayList<EntitiesClassified>();

  @SerializedName("data")
  private EntitiesClassified data = null;

  @SerializedName("records")
  private Long records = null;

  public VerveResponseEntitiesClassifiedList statusCode(String statusCode) {
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

  public VerveResponseEntitiesClassifiedList message(String message) {
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

  public VerveResponseEntitiesClassifiedList list(List<EntitiesClassified> list) {
    this.list = list;
    return this;
  }

  public VerveResponseEntitiesClassifiedList addListItem(EntitiesClassified listItem) {
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<EntitiesClassified> getList() {
    return list;
  }

  public void setList(List<EntitiesClassified> list) {
    this.list = list;
  }

  public VerveResponseEntitiesClassifiedList data(EntitiesClassified data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public EntitiesClassified getData() {
    return data;
  }

  public void setData(EntitiesClassified data) {
    this.data = data;
  }

  public VerveResponseEntitiesClassifiedList records(Long records) {
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
    VerveResponseEntitiesClassifiedList verveResponseEntitiesClassifiedList = (VerveResponseEntitiesClassifiedList) o;
    return Objects.equals(this.statusCode, verveResponseEntitiesClassifiedList.statusCode) &&
        Objects.equals(this.message, verveResponseEntitiesClassifiedList.message) &&
        Objects.equals(this.list, verveResponseEntitiesClassifiedList.list) &&
        Objects.equals(this.data, verveResponseEntitiesClassifiedList.data) &&
        Objects.equals(this.records, verveResponseEntitiesClassifiedList.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, message, list, data, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerveResponseEntitiesClassifiedList {\n");
    
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

