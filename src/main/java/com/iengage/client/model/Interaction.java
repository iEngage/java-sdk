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
import com.iengage.client.model.Multimedia;
import com.iengage.client.model.NER;
import com.iengage.client.model.Sentiment;
import com.iengage.client.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * Interaction
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-18T06:00:03.235Z")
public class Interaction   {
  @SerializedName("interactionId")
  private Long interactionId = null;

  @SerializedName("interactionTitle")
  private String interactionTitle = null;

  @SerializedName("interactionDescription")
  private String interactionDescription = null;

  @SerializedName("interactionType")
  private String interactionType = null;

  @SerializedName("issuer")
  private User issuer = null;

  @SerializedName("noOfResponses")
  private Integer noOfResponses = null;

  @SerializedName("isClosed")
  private Boolean isClosed = false;

  @SerializedName("createdDate")
  private DateTime createdDate = null;

  @SerializedName("lastUpdatedDate")
  private DateTime lastUpdatedDate = null;

  @SerializedName("association")
  private String association = null;

  @SerializedName("videoId")
  private String videoId = null;

  @SerializedName("fileURL")
  private String fileURL = null;

  @SerializedName("fileEntityName")
  private String fileEntityName = null;

  @SerializedName("isSubscribed")
  private Boolean isSubscribed = false;

  @SerializedName("sentiment")
  private String sentiment = null;

  @SerializedName("sentimentDetails")
  private Sentiment sentimentDetails = null;

  @SerializedName("sentimentWeightage")
  private Double sentimentWeightage = null;

  @SerializedName("entity")
  private List<NER> entity = new ArrayList<NER>();

  @SerializedName("attachmentList")
  private List<Multimedia> attachmentList = new ArrayList<Multimedia>();

  @SerializedName("categoryId")
  private Long categoryId = null;

  @SerializedName("categoryName")
  private String categoryName = null;

  @SerializedName("score")
  private Double score = null;

  public Interaction interactionId(Long interactionId) {
    this.interactionId = interactionId;
    return this;
  }

   /**
   * Get interactionId
   * @return interactionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getInteractionId() {
    return interactionId;
  }

  public void setInteractionId(Long interactionId) {
    this.interactionId = interactionId;
  }

  public Interaction interactionTitle(String interactionTitle) {
    this.interactionTitle = interactionTitle;
    return this;
  }

   /**
   * Get interactionTitle
   * @return interactionTitle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInteractionTitle() {
    return interactionTitle;
  }

  public void setInteractionTitle(String interactionTitle) {
    this.interactionTitle = interactionTitle;
  }

  public Interaction interactionDescription(String interactionDescription) {
    this.interactionDescription = interactionDescription;
    return this;
  }

   /**
   * Get interactionDescription
   * @return interactionDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInteractionDescription() {
    return interactionDescription;
  }

  public void setInteractionDescription(String interactionDescription) {
    this.interactionDescription = interactionDescription;
  }

  public Interaction interactionType(String interactionType) {
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

  public Interaction issuer(User issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getIssuer() {
    return issuer;
  }

  public void setIssuer(User issuer) {
    this.issuer = issuer;
  }

  public Interaction noOfResponses(Integer noOfResponses) {
    this.noOfResponses = noOfResponses;
    return this;
  }

   /**
   * Get noOfResponses
   * @return noOfResponses
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getNoOfResponses() {
    return noOfResponses;
  }

  public void setNoOfResponses(Integer noOfResponses) {
    this.noOfResponses = noOfResponses;
  }

  public Interaction isClosed(Boolean isClosed) {
    this.isClosed = isClosed;
    return this;
  }

   /**
   * Get isClosed
   * @return isClosed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsClosed() {
    return isClosed;
  }

  public void setIsClosed(Boolean isClosed) {
    this.isClosed = isClosed;
  }

  public Interaction createdDate(DateTime createdDate) {
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

  public Interaction lastUpdatedDate(DateTime lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * Get lastUpdatedDate
   * @return lastUpdatedDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(DateTime lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public Interaction association(String association) {
    this.association = association;
    return this;
  }

   /**
   * Get association
   * @return association
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAssociation() {
    return association;
  }

  public void setAssociation(String association) {
    this.association = association;
  }

  public Interaction videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * Get videoId
   * @return videoId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public Interaction fileURL(String fileURL) {
    this.fileURL = fileURL;
    return this;
  }

   /**
   * Get fileURL
   * @return fileURL
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFileURL() {
    return fileURL;
  }

  public void setFileURL(String fileURL) {
    this.fileURL = fileURL;
  }

  public Interaction fileEntityName(String fileEntityName) {
    this.fileEntityName = fileEntityName;
    return this;
  }

   /**
   * Get fileEntityName
   * @return fileEntityName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFileEntityName() {
    return fileEntityName;
  }

  public void setFileEntityName(String fileEntityName) {
    this.fileEntityName = fileEntityName;
  }

  public Interaction isSubscribed(Boolean isSubscribed) {
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

  public Interaction sentiment(String sentiment) {
    this.sentiment = sentiment;
    return this;
  }

   /**
   * Get sentiment
   * @return sentiment
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSentiment() {
    return sentiment;
  }

  public void setSentiment(String sentiment) {
    this.sentiment = sentiment;
  }

  public Interaction sentimentDetails(Sentiment sentimentDetails) {
    this.sentimentDetails = sentimentDetails;
    return this;
  }

   /**
   * Get sentimentDetails
   * @return sentimentDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public Sentiment getSentimentDetails() {
    return sentimentDetails;
  }

  public void setSentimentDetails(Sentiment sentimentDetails) {
    this.sentimentDetails = sentimentDetails;
  }

  public Interaction sentimentWeightage(Double sentimentWeightage) {
    this.sentimentWeightage = sentimentWeightage;
    return this;
  }

   /**
   * Get sentimentWeightage
   * @return sentimentWeightage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getSentimentWeightage() {
    return sentimentWeightage;
  }

  public void setSentimentWeightage(Double sentimentWeightage) {
    this.sentimentWeightage = sentimentWeightage;
  }

  public Interaction entity(List<NER> entity) {
    this.entity = entity;
    return this;
  }

  public Interaction addEntityItem(NER entityItem) {
    this.entity.add(entityItem);
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<NER> getEntity() {
    return entity;
  }

  public void setEntity(List<NER> entity) {
    this.entity = entity;
  }

  public Interaction attachmentList(List<Multimedia> attachmentList) {
    this.attachmentList = attachmentList;
    return this;
  }

  public Interaction addAttachmentListItem(Multimedia attachmentListItem) {
    this.attachmentList.add(attachmentListItem);
    return this;
  }

   /**
   * Get attachmentList
   * @return attachmentList
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Multimedia> getAttachmentList() {
    return attachmentList;
  }

  public void setAttachmentList(List<Multimedia> attachmentList) {
    this.attachmentList = attachmentList;
  }

  public Interaction categoryId(Long categoryId) {
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

  public Interaction categoryName(String categoryName) {
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

  public Interaction score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Interaction interaction = (Interaction) o;
    return Objects.equals(this.interactionId, interaction.interactionId) &&
        Objects.equals(this.interactionTitle, interaction.interactionTitle) &&
        Objects.equals(this.interactionDescription, interaction.interactionDescription) &&
        Objects.equals(this.interactionType, interaction.interactionType) &&
        Objects.equals(this.issuer, interaction.issuer) &&
        Objects.equals(this.noOfResponses, interaction.noOfResponses) &&
        Objects.equals(this.isClosed, interaction.isClosed) &&
        Objects.equals(this.createdDate, interaction.createdDate) &&
        Objects.equals(this.lastUpdatedDate, interaction.lastUpdatedDate) &&
        Objects.equals(this.association, interaction.association) &&
        Objects.equals(this.videoId, interaction.videoId) &&
        Objects.equals(this.fileURL, interaction.fileURL) &&
        Objects.equals(this.fileEntityName, interaction.fileEntityName) &&
        Objects.equals(this.isSubscribed, interaction.isSubscribed) &&
        Objects.equals(this.sentiment, interaction.sentiment) &&
        Objects.equals(this.sentimentDetails, interaction.sentimentDetails) &&
        Objects.equals(this.sentimentWeightage, interaction.sentimentWeightage) &&
        Objects.equals(this.entity, interaction.entity) &&
        Objects.equals(this.attachmentList, interaction.attachmentList) &&
        Objects.equals(this.categoryId, interaction.categoryId) &&
        Objects.equals(this.categoryName, interaction.categoryName) &&
        Objects.equals(this.score, interaction.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interactionId, interactionTitle, interactionDescription, interactionType, issuer, noOfResponses, isClosed, createdDate, lastUpdatedDate, association, videoId, fileURL, fileEntityName, isSubscribed, sentiment, sentimentDetails, sentimentWeightage, entity, attachmentList, categoryId, categoryName, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Interaction {\n");
    
    sb.append("    interactionId: ").append(toIndentedString(interactionId)).append("\n");
    sb.append("    interactionTitle: ").append(toIndentedString(interactionTitle)).append("\n");
    sb.append("    interactionDescription: ").append(toIndentedString(interactionDescription)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    noOfResponses: ").append(toIndentedString(noOfResponses)).append("\n");
    sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    association: ").append(toIndentedString(association)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    fileURL: ").append(toIndentedString(fileURL)).append("\n");
    sb.append("    fileEntityName: ").append(toIndentedString(fileEntityName)).append("\n");
    sb.append("    isSubscribed: ").append(toIndentedString(isSubscribed)).append("\n");
    sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
    sb.append("    sentimentDetails: ").append(toIndentedString(sentimentDetails)).append("\n");
    sb.append("    sentimentWeightage: ").append(toIndentedString(sentimentWeightage)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    attachmentList: ").append(toIndentedString(attachmentList)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

