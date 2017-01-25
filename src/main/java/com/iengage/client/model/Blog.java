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
import com.iengage.client.model.NER;
import com.iengage.client.model.Sentiment;
import com.iengage.client.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Blog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-24T14:38:21.881+05:30")
public class Blog {
  @SerializedName("blogId")
  private Long blogId = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("creationTime")
  private DateTime creationTime = null;

  @SerializedName("sentiment")
  private String sentiment = null;

  @SerializedName("sentimentDetails")
  private Sentiment sentimentDetails = null;

  @SerializedName("sentimentWeightage")
  private Double sentimentWeightage = null;

  @SerializedName("entity")
  private List<NER> entity = new ArrayList<NER>();

  public Blog blogId(Long blogId) {
    this.blogId = blogId;
    return this;
  }

   /**
   * Get blogId
   * @return blogId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getBlogId() {
    return blogId;
  }

  public void setBlogId(Long blogId) {
    this.blogId = blogId;
  }

  public Blog user(User user) {
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

  public Blog title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Blog description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Blog creationTime(DateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(DateTime creationTime) {
    this.creationTime = creationTime;
  }

  public Blog sentiment(String sentiment) {
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

  public Blog sentimentDetails(Sentiment sentimentDetails) {
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

  public Blog sentimentWeightage(Double sentimentWeightage) {
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

  public Blog entity(List<NER> entity) {
    this.entity = entity;
    return this;
  }

  public Blog addEntityItem(NER entityItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Blog blog = (Blog) o;
    return Objects.equals(this.blogId, blog.blogId) &&
        Objects.equals(this.user, blog.user) &&
        Objects.equals(this.title, blog.title) &&
        Objects.equals(this.description, blog.description) &&
        Objects.equals(this.creationTime, blog.creationTime) &&
        Objects.equals(this.sentiment, blog.sentiment) &&
        Objects.equals(this.sentimentDetails, blog.sentimentDetails) &&
        Objects.equals(this.sentimentWeightage, blog.sentimentWeightage) &&
        Objects.equals(this.entity, blog.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blogId, user, title, description, creationTime, sentiment, sentimentDetails, sentimentWeightage, entity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Blog {\n");
    
    sb.append("    blogId: ").append(toIndentedString(blogId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
    sb.append("    sentimentDetails: ").append(toIndentedString(sentimentDetails)).append("\n");
    sb.append("    sentimentWeightage: ").append(toIndentedString(sentimentWeightage)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

