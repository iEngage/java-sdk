/*
 * iEngage 2.0 API
 * This API enables Intelligent Engagement for your Business. iEngage is a platform that combines process, augmented intelligence and rewards to help you intelligently engage customers.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.iengage.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Association
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-27T14:33:47.218+05:30")
public class Association {
  @SerializedName("associationId")
  private Long associationId = null;

  @SerializedName("name")
  private String name = null;

  public Association associationId(Long associationId) {
    this.associationId = associationId;
    return this;
  }

   /**
   * Get associationId
   * @return associationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getAssociationId() {
    return associationId;
  }

  public void setAssociationId(Long associationId) {
    this.associationId = associationId;
  }

  public Association name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Association association = (Association) o;
    return Objects.equals(this.associationId, association.associationId) &&
        Objects.equals(this.name, association.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associationId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Association {\n");
    
    sb.append("    associationId: ").append(toIndentedString(associationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
