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
import com.iengage.client.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * InteractionCategory
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-18T06:00:03.235Z")
public class InteractionCategory   {
  @SerializedName("categoryId")
  private Long categoryId = null;

  @SerializedName("categoryName")
  private String categoryName = null;

  @SerializedName("categoryDescription")
  private String categoryDescription = null;

  @SerializedName("interactionType")
  private String interactionType = null;

  @SerializedName("createdDate")
  private DateTime createdDate = null;

  @SerializedName("modifiedDate")
  private DateTime modifiedDate = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("isSubscribed")
  private Boolean isSubscribed = false;

  @SerializedName("associationId")
  private String associationId = null;

  @SerializedName("user")
  private User user = null;

  public InteractionCategory categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public InteractionCategory categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public InteractionCategory categoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
    return this;
  }

   /**
   * Get categoryDescription
   * @return categoryDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategoryDescription() {
    return categoryDescription;
  }

  public void setCategoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
  }

  public InteractionCategory interactionType(String interactionType) {
    this.interactionType = interactionType;
    return this;
  }

   /**
   * Get interactionType
   * @return interactionType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInteractionType() {
    return interactionType;
  }

  public void setInteractionType(String interactionType) {
    this.interactionType = interactionType;
  }

  public InteractionCategory createdDate(DateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(DateTime createdDate) {
    this.createdDate = createdDate;
  }

  public InteractionCategory modifiedDate(DateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(DateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public InteractionCategory status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public InteractionCategory isSubscribed(Boolean isSubscribed) {
    this.isSubscribed = isSubscribed;
    return this;
  }

   /**
   * Get isSubscribed
   * @return isSubscribed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsSubscribed() {
    return isSubscribed;
  }

  public void setIsSubscribed(Boolean isSubscribed) {
    this.isSubscribed = isSubscribed;
  }

  public InteractionCategory associationId(String associationId) {
    this.associationId = associationId;
    return this;
  }

   /**
   * Get associationId
   * @return associationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAssociationId() {
    return associationId;
  }

  public void setAssociationId(String associationId) {
    this.associationId = associationId;
  }

  public InteractionCategory user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractionCategory interactionCategory = (InteractionCategory) o;
    return Objects.equals(this.categoryId, interactionCategory.categoryId) &&
        Objects.equals(this.categoryName, interactionCategory.categoryName) &&
        Objects.equals(this.categoryDescription, interactionCategory.categoryDescription) &&
        Objects.equals(this.interactionType, interactionCategory.interactionType) &&
        Objects.equals(this.createdDate, interactionCategory.createdDate) &&
        Objects.equals(this.modifiedDate, interactionCategory.modifiedDate) &&
        Objects.equals(this.status, interactionCategory.status) &&
        Objects.equals(this.isSubscribed, interactionCategory.isSubscribed) &&
        Objects.equals(this.associationId, interactionCategory.associationId) &&
        Objects.equals(this.user, interactionCategory.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, categoryName, categoryDescription, interactionType, createdDate, modifiedDate, status, isSubscribed, associationId, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractionCategory {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    categoryDescription: ").append(toIndentedString(categoryDescription)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isSubscribed: ").append(toIndentedString(isSubscribed)).append("\n");
    sb.append("    associationId: ").append(toIndentedString(associationId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

