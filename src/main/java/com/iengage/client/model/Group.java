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
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * Group
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-18T06:00:03.235Z")
public class Group   {
  @SerializedName("groupId")
  private Long groupId = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("groupType")
  private String groupType = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("currentUserFollowing")
  private Boolean currentUserFollowing = false;

  @SerializedName("startDate")
  private DateTime startDate = null;

  @SerializedName("dueDate")
  private DateTime dueDate = null;

  @SerializedName("ideasCount")
  private Long ideasCount = null;

  @SerializedName("friendsIdeasCount")
  private Long friendsIdeasCount = null;

  @SerializedName("followersCount")
  private Long followersCount = null;

  @SerializedName("participantsCount")
  private Long participantsCount = null;

  @SerializedName("friendsParticipantsCount")
  private Long friendsParticipantsCount = null;

  @SerializedName("association")
  private Long association = null;

  @SerializedName("accessType")
  private String accessType = null;

  @SerializedName("managerId")
  private List<Long> managerId = new ArrayList<Long>();

  @SerializedName("user")
  private User user = null;

  public Group groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public Group groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public Group groupType(String groupType) {
    this.groupType = groupType;
    return this;
  }

   /**
   * Get groupType
   * @return groupType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupType() {
    return groupType;
  }

  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }

  public Group category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Group description(String description) {
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

  public Group currentUserFollowing(Boolean currentUserFollowing) {
    this.currentUserFollowing = currentUserFollowing;
    return this;
  }

   /**
   * Get currentUserFollowing
   * @return currentUserFollowing
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCurrentUserFollowing() {
    return currentUserFollowing;
  }

  public void setCurrentUserFollowing(Boolean currentUserFollowing) {
    this.currentUserFollowing = currentUserFollowing;
  }

  public Group startDate(DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTime startDate) {
    this.startDate = startDate;
  }

  public Group dueDate(DateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(DateTime dueDate) {
    this.dueDate = dueDate;
  }

  public Group ideasCount(Long ideasCount) {
    this.ideasCount = ideasCount;
    return this;
  }

   /**
   * Get ideasCount
   * @return ideasCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getIdeasCount() {
    return ideasCount;
  }

  public void setIdeasCount(Long ideasCount) {
    this.ideasCount = ideasCount;
  }

  public Group friendsIdeasCount(Long friendsIdeasCount) {
    this.friendsIdeasCount = friendsIdeasCount;
    return this;
  }

   /**
   * Get friendsIdeasCount
   * @return friendsIdeasCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getFriendsIdeasCount() {
    return friendsIdeasCount;
  }

  public void setFriendsIdeasCount(Long friendsIdeasCount) {
    this.friendsIdeasCount = friendsIdeasCount;
  }

  public Group followersCount(Long followersCount) {
    this.followersCount = followersCount;
    return this;
  }

   /**
   * Get followersCount
   * @return followersCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getFollowersCount() {
    return followersCount;
  }

  public void setFollowersCount(Long followersCount) {
    this.followersCount = followersCount;
  }

  public Group participantsCount(Long participantsCount) {
    this.participantsCount = participantsCount;
    return this;
  }

   /**
   * Get participantsCount
   * @return participantsCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getParticipantsCount() {
    return participantsCount;
  }

  public void setParticipantsCount(Long participantsCount) {
    this.participantsCount = participantsCount;
  }

  public Group friendsParticipantsCount(Long friendsParticipantsCount) {
    this.friendsParticipantsCount = friendsParticipantsCount;
    return this;
  }

   /**
   * Get friendsParticipantsCount
   * @return friendsParticipantsCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getFriendsParticipantsCount() {
    return friendsParticipantsCount;
  }

  public void setFriendsParticipantsCount(Long friendsParticipantsCount) {
    this.friendsParticipantsCount = friendsParticipantsCount;
  }

  public Group association(Long association) {
    this.association = association;
    return this;
  }

   /**
   * Get association
   * @return association
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getAssociation() {
    return association;
  }

  public void setAssociation(Long association) {
    this.association = association;
  }

  public Group accessType(String accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAccessType() {
    return accessType;
  }

  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }

  public Group managerId(List<Long> managerId) {
    this.managerId = managerId;
    return this;
  }

  public Group addManagerIdItem(Long managerIdItem) {
    this.managerId.add(managerIdItem);
    return this;
  }

   /**
   * Get managerId
   * @return managerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getManagerId() {
    return managerId;
  }

  public void setManagerId(List<Long> managerId) {
    this.managerId = managerId;
  }

  public Group user(User user) {
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
    Group group = (Group) o;
    return Objects.equals(this.groupId, group.groupId) &&
        Objects.equals(this.groupName, group.groupName) &&
        Objects.equals(this.groupType, group.groupType) &&
        Objects.equals(this.category, group.category) &&
        Objects.equals(this.description, group.description) &&
        Objects.equals(this.currentUserFollowing, group.currentUserFollowing) &&
        Objects.equals(this.startDate, group.startDate) &&
        Objects.equals(this.dueDate, group.dueDate) &&
        Objects.equals(this.ideasCount, group.ideasCount) &&
        Objects.equals(this.friendsIdeasCount, group.friendsIdeasCount) &&
        Objects.equals(this.followersCount, group.followersCount) &&
        Objects.equals(this.participantsCount, group.participantsCount) &&
        Objects.equals(this.friendsParticipantsCount, group.friendsParticipantsCount) &&
        Objects.equals(this.association, group.association) &&
        Objects.equals(this.accessType, group.accessType) &&
        Objects.equals(this.managerId, group.managerId) &&
        Objects.equals(this.user, group.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupName, groupType, category, description, currentUserFollowing, startDate, dueDate, ideasCount, friendsIdeasCount, followersCount, participantsCount, friendsParticipantsCount, association, accessType, managerId, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currentUserFollowing: ").append(toIndentedString(currentUserFollowing)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    ideasCount: ").append(toIndentedString(ideasCount)).append("\n");
    sb.append("    friendsIdeasCount: ").append(toIndentedString(friendsIdeasCount)).append("\n");
    sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
    sb.append("    participantsCount: ").append(toIndentedString(participantsCount)).append("\n");
    sb.append("    friendsParticipantsCount: ").append(toIndentedString(friendsParticipantsCount)).append("\n");
    sb.append("    association: ").append(toIndentedString(association)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
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

