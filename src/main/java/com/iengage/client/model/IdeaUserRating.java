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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * IdeaUserRating
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-18T06:00:03.235Z")
public class IdeaUserRating   {
  @SerializedName("param")
  private String param = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("ratingScore")
  private Double ratingScore = null;

  public IdeaUserRating param(String param) {
    this.param = param;
    return this;
  }

   /**
   * Get param
   * @return param
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParam() {
    return param;
  }

  public void setParam(String param) {
    this.param = param;
  }

  public IdeaUserRating message(String message) {
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

  public IdeaUserRating ratingScore(Double ratingScore) {
    this.ratingScore = ratingScore;
    return this;
  }

   /**
   * Get ratingScore
   * @return ratingScore
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getRatingScore() {
    return ratingScore;
  }

  public void setRatingScore(Double ratingScore) {
    this.ratingScore = ratingScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdeaUserRating ideaUserRating = (IdeaUserRating) o;
    return Objects.equals(this.param, ideaUserRating.param) &&
        Objects.equals(this.message, ideaUserRating.message) &&
        Objects.equals(this.ratingScore, ideaUserRating.ratingScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(param, message, ratingScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdeaUserRating {\n");
    
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    ratingScore: ").append(toIndentedString(ratingScore)).append("\n");
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

