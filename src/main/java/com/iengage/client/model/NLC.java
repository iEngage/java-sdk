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
import com.iengage.client.model.Bucket;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * NLC
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-24T14:38:21.881+05:30")
public class NLC {
  @SerializedName("nlcId")
  private Long nlcId = null;

  @SerializedName("nlcClassifierName")
  private String nlcClassifierName = null;

  @SerializedName("createdDate")
  private DateTime createdDate = null;

  @SerializedName("modifiedDate")
  private DateTime modifiedDate = null;

  @SerializedName("classification")
  private List<Bucket> classification = new ArrayList<Bucket>();

  public NLC nlcId(Long nlcId) {
    this.nlcId = nlcId;
    return this;
  }

   /**
   * Get nlcId
   * @return nlcId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getNlcId() {
    return nlcId;
  }

  public void setNlcId(Long nlcId) {
    this.nlcId = nlcId;
  }

  public NLC nlcClassifierName(String nlcClassifierName) {
    this.nlcClassifierName = nlcClassifierName;
    return this;
  }

   /**
   * Get nlcClassifierName
   * @return nlcClassifierName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNlcClassifierName() {
    return nlcClassifierName;
  }

  public void setNlcClassifierName(String nlcClassifierName) {
    this.nlcClassifierName = nlcClassifierName;
  }

  public NLC createdDate(DateTime createdDate) {
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

  public NLC modifiedDate(DateTime modifiedDate) {
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

  public NLC classification(List<Bucket> classification) {
    this.classification = classification;
    return this;
  }

  public NLC addClassificationItem(Bucket classificationItem) {
    this.classification.add(classificationItem);
    return this;
  }

   /**
   * Get classification
   * @return classification
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Bucket> getClassification() {
    return classification;
  }

  public void setClassification(List<Bucket> classification) {
    this.classification = classification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NLC NLC = (NLC) o;
    return Objects.equals(this.nlcId, NLC.nlcId) &&
        Objects.equals(this.nlcClassifierName, NLC.nlcClassifierName) &&
        Objects.equals(this.createdDate, NLC.createdDate) &&
        Objects.equals(this.modifiedDate, NLC.modifiedDate) &&
        Objects.equals(this.classification, NLC.classification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nlcId, nlcClassifierName, createdDate, modifiedDate, classification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NLC {\n");
    
    sb.append("    nlcId: ").append(toIndentedString(nlcId)).append("\n");
    sb.append("    nlcClassifierName: ").append(toIndentedString(nlcClassifierName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
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

