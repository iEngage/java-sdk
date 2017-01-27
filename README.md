# iEngage.io java-SDK (Beta)

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml

<dependency>
    <groupId>io.iengage</groupId>
    <artifactId>iengage-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
<dependency>
      <groupId>com.squareup.okhttp</groupId>
      <artifactId>logging-interceptor</artifactId>
      <version>2.7.5</version>
</dependency>
<dependency>
      <groupId>com.google.code.gson</groupId>
      <artifactId>gson</artifactId>
      <version>2.6.2</version>
</dependency>
<dependency>
      <groupId>joda-time</groupId>
      <artifactId>joda-time</artifactId>
      <version>2.9.3</version>
</dependency>
    
```

### Gradle users

Add this dependency to your project's build file:

```groovy

compile "io.iengage:iengage-java-client:1.0.0"
compile "com.squareup.okhttp:okhttp:2.7.5"
compile "com.squareup.okhttp:logging-interceptor:2.7.5"
compile "com.google.code.gson:gson:2.6.2"
compile "joda-time:joda-time:2.9.3"
    
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/iengage-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.iengage.*;
import com.iengage.auth.*;
import com.iengage.client.model.*;
import com.iengage.service.AugmentedIntelligenceApi;

import java.io.File;
import java.util.*;

public class AugmentedIntelligenceApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: default
        OAuth default = (OAuth) defaultClient.getAuthentication("default");
        default.setAccessToken("YOUR ACCESS TOKEN");

        AugmentedIntelligenceApi apiInstance = new AugmentedIntelligenceApi();
        String text = "text_example"; // String | Text to be classified
        String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
        String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
        String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
        try {
            VerveResponseNLCList result = apiInstance.getInteraction(text, loggedInUserId, accessToken, clientToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AugmentedIntelligenceApi#getInteraction");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.iengage.io:8243/api/1.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AugmentedIntelligenceApi* | [**getInteraction**](docs/AugmentedIntelligenceApi.md#getInteraction) | **GET** /machineLearning/interactionType | Get the type of interaction
*AugmentedIntelligenceApi* | [**getPopularTag**](docs/AugmentedIntelligenceApi.md#getPopularTag) | **GET** /analytics/popular/tags | Get list of popular tag of interactions
*AugmentedIntelligenceApi* | [**getSentiment**](docs/AugmentedIntelligenceApi.md#getSentiment) | **GET** /analytics/sentiments | Get sentiment count of interactions
*AugmentedIntelligenceApi* | [**getTagEntitySentiments**](docs/AugmentedIntelligenceApi.md#getTagEntitySentiments) | **GET** /analytics/tag/entitySentiment | Get list of tag entity sentiment
*BPMApi* | [**assignWFTask**](docs/BPMApi.md#assignWFTask) | **POST** /bpm/tasks/{taskId}/assign | Assign task
*BPMApi* | [**completeWFTask**](docs/BPMApi.md#completeWFTask) | **POST** /bpm/tasks/{taskId}/complete | Complete task
*BPMApi* | [**getBPMTasks**](docs/BPMApi.md#getBPMTasks) | **GET** /bpm/tasks/{taskId} | Get task by task id
*BPMApi* | [**getSearchTask**](docs/BPMApi.md#getSearchTask) | **GET** /bpm/{userId}/tasks/name | Get list of BPM task assigned to user
*BPMApi* | [**getTasksByEntity**](docs/BPMApi.md#getTasksByEntity) | **GET** /bpm/{userId}/tasks/{entityId} | Get list of BPM task assigned to user
*BPMApi* | [**getUserBPMTasks**](docs/BPMApi.md#getUserBPMTasks) | **GET** /bpm/{userId}/tasks | Get list of BPM task assigned to user
*BPMApi* | [**getUserRolesBPMTasks**](docs/BPMApi.md#getUserRolesBPMTasks) | **GET** /bpm/{userId}/roles/tasks | Get list of BPM task assigned to user roles
*CollaborationApi* | [**addCommentBlog**](docs/CollaborationApi.md#addCommentBlog) | **POST** /collaborations/blogs/{blogId}/comments | Comment on posted blog
*CollaborationApi* | [**addCommentDiscussion**](docs/CollaborationApi.md#addCommentDiscussion) | **POST** /collaborations/discussions/{discussionId}/comments | Comment on discussion
*CollaborationApi* | [**deleteBlog**](docs/CollaborationApi.md#deleteBlog) | **DELETE** /collaborations/blogs/{blogId} | Delete blog
*CollaborationApi* | [**deleteBlogComment**](docs/CollaborationApi.md#deleteBlogComment) | **DELETE** /collaborations/blogs/comments/{commentId} | Delete blog comment
*CollaborationApi* | [**deleteDiscussion**](docs/CollaborationApi.md#deleteDiscussion) | **DELETE** /collaborations/discussions/{discussionId} | Delete discussion
*CollaborationApi* | [**deleteDiscussionComment**](docs/CollaborationApi.md#deleteDiscussionComment) | **DELETE** /collaborations/discussions/comments/{commentId} | Delete discussion comment
*CollaborationApi* | [**getBlogComments**](docs/CollaborationApi.md#getBlogComments) | **GET** /collaborations/blogs/{blogId}/comments | Get list of comments on blog
*CollaborationApi* | [**getBlogs**](docs/CollaborationApi.md#getBlogs) | **GET** /collaborations/blogs | Get list of blogs
*CollaborationApi* | [**getDiscussionComments**](docs/CollaborationApi.md#getDiscussionComments) | **GET** /collaborations/discussions/{discussionId}/comments | Get list of comments on discussion
*CollaborationApi* | [**getDiscussions**](docs/CollaborationApi.md#getDiscussions) | **GET** /collaborations/discussions | Get list of discussions
*CollaborationApi* | [**getUserSubscribedBlogs**](docs/CollaborationApi.md#getUserSubscribedBlogs) | **GET** /collaborations/blogs/{userId}/subscribe | Get list of blogs subscribed by user
*CollaborationApi* | [**getUserSubscribedDiscussions**](docs/CollaborationApi.md#getUserSubscribedDiscussions) | **GET** /collaborations/discussions/{userId}/subscribe | Get list of discussions subscribed by user
*CollaborationApi* | [**postBlog**](docs/CollaborationApi.md#postBlog) | **POST** /collaborations/blogs | Post blog
*CollaborationApi* | [**startDiscussion**](docs/CollaborationApi.md#startDiscussion) | **POST** /collaborations/discussions | Start discussion
*CollaborationApi* | [**subscribeBlog**](docs/CollaborationApi.md#subscribeBlog) | **POST** /collaborations/blogs/{blogId}/subscribe | Subscribe blog
*CollaborationApi* | [**subscribeDiscussion**](docs/CollaborationApi.md#subscribeDiscussion) | **POST** /collaborations/discussions/{discussionId}/subscribe | Subscribe discussion
*CollaborationApi* | [**unsubscribeBlog**](docs/CollaborationApi.md#unsubscribeBlog) | **POST** /collaborations/blogs/{blogId}/unsubscribe | Unsubscribe blog
*CollaborationApi* | [**unsubscribeDiscussion**](docs/CollaborationApi.md#unsubscribeDiscussion) | **POST** /collaborations/discussions/{discussionId}/unsubscribe | Unsubscribe discussion
*CollaborationApi* | [**updateBlog**](docs/CollaborationApi.md#updateBlog) | **PUT** /collaborations/blogs/{blogId} | Update blog
*CollaborationApi* | [**updateBlogComment**](docs/CollaborationApi.md#updateBlogComment) | **PUT** /collaborations/blogs/comments/{commentId} | Update blog comment
*CollaborationApi* | [**updateDiscussion**](docs/CollaborationApi.md#updateDiscussion) | **PUT** /collaborations/discussions/{discussionId} | Update discussion
*CollaborationApi* | [**updateDiscussionComment**](docs/CollaborationApi.md#updateDiscussionComment) | **PUT** /collaborations/discussions/comments/{commentId} | Update discussion comment
*ComplaintApi* | [**addComplaint**](docs/ComplaintApi.md#addComplaint) | **POST** /complaints | Share complaint without attachment
*ComplaintApi* | [**addComplaint_0**](docs/ComplaintApi.md#addComplaint_0) | **POST** /complaints/attachment | Share complaint with attachment
*ComplaintApi* | [**addSolution**](docs/ComplaintApi.md#addSolution) | **POST** /complaints/{complaintId}/solutions | Share solution on complaint
*ComplaintApi* | [**createComplaintCategory**](docs/ComplaintApi.md#createComplaintCategory) | **POST** /complaints/categories | Create complaint category
*ComplaintApi* | [**deleteComplaint**](docs/ComplaintApi.md#deleteComplaint) | **DELETE** /complaints/{complaintId} | Delete complaint
*ComplaintApi* | [**deleteComplaintCategory**](docs/ComplaintApi.md#deleteComplaintCategory) | **DELETE** /complaints/categories/{categoryId} | Delete complaint cotegory
*ComplaintApi* | [**deleteSolution**](docs/ComplaintApi.md#deleteSolution) | **DELETE** /complaints/solutions/{solutionId} | Delete solution
*ComplaintApi* | [**dislikeSolution**](docs/ComplaintApi.md#dislikeSolution) | **POST** /complaints/{complaintId}/solutions/{solutionId}/dislike | Dislike Solution
*ComplaintApi* | [**getComplaint**](docs/ComplaintApi.md#getComplaint) | **GET** /complaints/{complaintId} | Get complaint by id
*ComplaintApi* | [**getComplaintCategories**](docs/ComplaintApi.md#getComplaintCategories) | **GET** /complaints/categories | Get list of complaint category
*ComplaintApi* | [**getComplaintsForUser**](docs/ComplaintApi.md#getComplaintsForUser) | **GET** /complaints | Get list of all complaint visible for user
*ComplaintApi* | [**getFriendsComplaints**](docs/ComplaintApi.md#getFriendsComplaints) | **GET** /complaints/friends | Get list of complaints shared by your friends
*ComplaintApi* | [**getRecommendComplaint**](docs/ComplaintApi.md#getRecommendComplaint) | **GET** /complaints/recommend | Get list of recommended complaints
*ComplaintApi* | [**getRecommendedComplaintsFromDB**](docs/ComplaintApi.md#getRecommendedComplaintsFromDB) | **GET** /complaints/{userId}/recommendedComplaints | Get list of recommended complaints from DB
*ComplaintApi* | [**getRecommendedUsersFromDB**](docs/ComplaintApi.md#getRecommendedUsersFromDB) | **GET** /complaints/{complaintId}/recommendedUsers | Get list of recommended Users from DB
*ComplaintApi* | [**getSolutions**](docs/ComplaintApi.md#getSolutions) | **GET** /complaints/{complaintId}/solutions | Get list of solutions by ComplaintId
*ComplaintApi* | [**getUserComplaints**](docs/ComplaintApi.md#getUserComplaints) | **GET** /complaints/{userId}/shared | Get list of complaints shared by user
*ComplaintApi* | [**getUserSubscribedComplaintCategories**](docs/ComplaintApi.md#getUserSubscribedComplaintCategories) | **GET** /complaints/categories/{userId}/subscribe | Get list of Complaint categories subscribed by user
*ComplaintApi* | [**getUserSubscribedComplaints**](docs/ComplaintApi.md#getUserSubscribedComplaints) | **GET** /complaints/{userId}/subscribe | Get list of complaints subscribed by user
*ComplaintApi* | [**likeSolution**](docs/ComplaintApi.md#likeSolution) | **POST** /complaints/{complaintId}/solutions/{solutionId}/like | Like solution
*ComplaintApi* | [**markAsAnSolution**](docs/ComplaintApi.md#markAsAnSolution) | **POST** /complaints/{complaintId}/solutions/{solutionId}/mark | Mark solution as a solution
*ComplaintApi* | [**searchComplaints**](docs/ComplaintApi.md#searchComplaints) | **GET** /complaints/search | Get list of complaints by search
*ComplaintApi* | [**subscribeComplaint**](docs/ComplaintApi.md#subscribeComplaint) | **POST** /complaints/{complaintId}/subscribe | Subscribe complaint
*ComplaintApi* | [**subscribeComplaintCategory**](docs/ComplaintApi.md#subscribeComplaintCategory) | **POST** /complaints/categories/{categoryId}/subscribe | Subscribe complaint category
*ComplaintApi* | [**unmarkAsAnSolution**](docs/ComplaintApi.md#unmarkAsAnSolution) | **POST** /complaints/{complaintId}/solutions/{solutionId}/unmark | Unmark solution as a solution
*ComplaintApi* | [**unsubscribeComplaint**](docs/ComplaintApi.md#unsubscribeComplaint) | **POST** /complaints/{complaintId}/unsubscribe | Unsubscribe Complaint
*ComplaintApi* | [**unsubscribeComplaintCategory**](docs/ComplaintApi.md#unsubscribeComplaintCategory) | **POST** /complaints/categories/{categoryId}/unsubscribe | Unsubscribe complaint category
*ComplaintApi* | [**updateComplaint**](docs/ComplaintApi.md#updateComplaint) | **PUT** /complaints/{complaintId} | Update complaint
*ComplaintApi* | [**updateComplaintCategory**](docs/ComplaintApi.md#updateComplaintCategory) | **PUT** /complaints/categories/{categoryId} | Update complaint category
*ComplaintApi* | [**updateSolution**](docs/ComplaintApi.md#updateSolution) | **PUT** /complaints/solutions/{solutionId} | Update solution
*GroupApi* | [**createGroup**](docs/GroupApi.md#createGroup) | **POST** /groups | Create group
*GroupApi* | [**deleteGroup**](docs/GroupApi.md#deleteGroup) | **DELETE** /groups/{groupId} | Delete group
*GroupApi* | [**followGroup**](docs/GroupApi.md#followGroup) | **POST** /groups/{groupId}/follow | Follow group
*GroupApi* | [**getGroupFollowers**](docs/GroupApi.md#getGroupFollowers) | **GET** /groups/{groupId}/followers | Get the list of followers for the group
*GroupApi* | [**getGroupIdeas**](docs/GroupApi.md#getGroupIdeas) | **GET** /groups/{groupId}/ideas | Get list of all ideas in a group
*GroupApi* | [**getGroups**](docs/GroupApi.md#getGroups) | **GET** /groups | Get the list of groups visible for user
*GroupApi* | [**getRecommendationGroup**](docs/GroupApi.md#getRecommendationGroup) | **GET** /groups/recommend | Get list of recommended groups
*GroupApi* | [**getUserFollowingGroups**](docs/GroupApi.md#getUserFollowingGroups) | **GET** /groups/{userId}/following | Get list of groups that a user is following
*GroupApi* | [**searchGroups**](docs/GroupApi.md#searchGroups) | **GET** /groups/search | Get list of matching groups
*GroupApi* | [**unfollowGroup**](docs/GroupApi.md#unfollowGroup) | **POST** /groups/{groupId}/unfollow | Unfollow group
*GroupApi* | [**updateGroup**](docs/GroupApi.md#updateGroup) | **PUT** /groups/{groupId} | Update group
*IdeaApi* | [**deleteComment**](docs/IdeaApi.md#deleteComment) | **DELETE** /ideas/comments/{commentId} | Delete comment
*IdeaApi* | [**deleteIdea**](docs/IdeaApi.md#deleteIdea) | **DELETE** /ideas/{ideaId} | Delete idea
*IdeaApi* | [**followIdea**](docs/IdeaApi.md#followIdea) | **POST** /ideas/{ideaId}/follow | Follow idea
*IdeaApi* | [**getAllIdeas**](docs/IdeaApi.md#getAllIdeas) | **GET** /ideas | Get list of Ideas
*IdeaApi* | [**getFollowingIdeas**](docs/IdeaApi.md#getFollowingIdeas) | **GET** /ideas/{userId}/following | Get list of ideas that users are following
*IdeaApi* | [**getGroupIdeas**](docs/IdeaApi.md#getGroupIdeas) | **GET** /ideas/getGroupIdeas | Get list of ideas in group
*IdeaApi* | [**getIdea**](docs/IdeaApi.md#getIdea) | **GET** /ideas/{ideaId} | Get idea by id
*IdeaApi* | [**getIdeaComment**](docs/IdeaApi.md#getIdeaComment) | **GET** /ideas/{ideaId}/comments | Get list of comments on idea
*IdeaApi* | [**getIdeaFollowers**](docs/IdeaApi.md#getIdeaFollowers) | **GET** /ideas/{ideaId}/followers | Get list of followers for this idea
*IdeaApi* | [**getIdeaRatingParameters**](docs/IdeaApi.md#getIdeaRatingParameters) | **GET** /ideas/getIdeaRatingParameters | Get rating parameters of idea by user
*IdeaApi* | [**getIdeaRatings**](docs/IdeaApi.md#getIdeaRatings) | **GET** /ideas/getIdeaUserRating | Get list of ideas that are rated by user 
*IdeaApi* | [**getRecommendIdeas**](docs/IdeaApi.md#getRecommendIdeas) | **GET** /ideas/recommend | Get the list of recommended ideas
*IdeaApi* | [**getTopIdeas**](docs/IdeaApi.md#getTopIdeas) | **GET** /ideas/top | Get the list of top ideas
*IdeaApi* | [**getUserIdeas**](docs/IdeaApi.md#getUserIdeas) | **GET** /ideas/{userId}/shared | Get list of ideas shared by user
*IdeaApi* | [**getUserRateIdeas**](docs/IdeaApi.md#getUserRateIdeas) | **GET** /ideas/{userId}/rated | Get list of ideas rated by user
*IdeaApi* | [**rateIdea**](docs/IdeaApi.md#rateIdea) | **POST** /ideas/rateIdea | Rate an idea
*IdeaApi* | [**rateIdea_0**](docs/IdeaApi.md#rateIdea_0) | **GET** /ideas/rateIdeaByParameter | Give rating on idea
*IdeaApi* | [**searchIdeas**](docs/IdeaApi.md#searchIdeas) | **GET** /ideas/search | Get list of matching ideas
*IdeaApi* | [**shareFormIdea**](docs/IdeaApi.md#shareFormIdea) | **POST** /ideas/attachment | Share Idea with attachments
*IdeaApi* | [**shareIdea**](docs/IdeaApi.md#shareIdea) | **POST** /ideas | Share idea  
*IdeaApi* | [**shareIdeaComment**](docs/IdeaApi.md#shareIdeaComment) | **POST** /ideas/{ideaId}/comments | Comment on shared idea
*IdeaApi* | [**unfollowIdea**](docs/IdeaApi.md#unfollowIdea) | **POST** /ideas/{ideaId}/unfollow | Unfollow idea
*IdeaApi* | [**updateCommet**](docs/IdeaApi.md#updateCommet) | **PUT** /ideas/comments/{commentId} | Update comment
*IdeaApi* | [**updateIdea**](docs/IdeaApi.md#updateIdea) | **PUT** /ideas/{ideaId} | Update idea
*InteractionApi* | [**addInteraction**](docs/InteractionApi.md#addInteraction) | **POST** /interactions | Share interaction without attachment
*InteractionApi* | [**addInteraction_0**](docs/InteractionApi.md#addInteraction_0) | **POST** /interactions/attachment | Share interaction with attachment
*InteractionApi* | [**addResponse**](docs/InteractionApi.md#addResponse) | **POST** /interactions/{interactionId}/responses | Response the specified interaction
*InteractionApi* | [**createInteractionCategory**](docs/InteractionApi.md#createInteractionCategory) | **POST** /interactions/categories | Create interaction category
*InteractionApi* | [**deleteInteraction**](docs/InteractionApi.md#deleteInteraction) | **DELETE** /interactions/{interactionId} | Delete interaction
*InteractionApi* | [**deleteInteractionCategory**](docs/InteractionApi.md#deleteInteractionCategory) | **DELETE** /interactions/categories/{categoryId} | Delete interaction category
*InteractionApi* | [**deleteResponse**](docs/InteractionApi.md#deleteResponse) | **DELETE** /interactions/responses/{responseId} | Delete response
*InteractionApi* | [**dislikeResponse**](docs/InteractionApi.md#dislikeResponse) | **POST** /interactions/{interactionId}/responses/{responseId}/dislike | Dislike response
*InteractionApi* | [**getFriendsInteractions**](docs/InteractionApi.md#getFriendsInteractions) | **GET** /interactions/friends | Get list of interactions shared by friends
*InteractionApi* | [**getInteraction**](docs/InteractionApi.md#getInteraction) | **GET** /interactions/{interactionId} | Get interaction by id
*InteractionApi* | [**getInteractionCategories**](docs/InteractionApi.md#getInteractionCategories) | **GET** /interactions/categories | Get the list of interaction categories
*InteractionApi* | [**getInteractionsForUser**](docs/InteractionApi.md#getInteractionsForUser) | **GET** /interactions | Get list of all interactions visible to the user
*InteractionApi* | [**getRecommendInteractions**](docs/InteractionApi.md#getRecommendInteractions) | **GET** /interactions/recommend | Get list of recommended interactions
*InteractionApi* | [**getRecommendedInteractinsFromDB**](docs/InteractionApi.md#getRecommendedInteractinsFromDB) | **GET** /interactions/{userId}/recommendedInteractions | Get list of recommended interactions from DB
*InteractionApi* | [**getRecommendedUsersFromDB**](docs/InteractionApi.md#getRecommendedUsersFromDB) | **GET** /interactions/{interactionId}/recommendedUsers | Get list of recommended Users from DB
*InteractionApi* | [**getResponses**](docs/InteractionApi.md#getResponses) | **GET** /interactions/{interactionId}/responses | Get list of responses by interactionId
*InteractionApi* | [**getUserInteractions**](docs/InteractionApi.md#getUserInteractions) | **GET** /interactions/{userId}/shared | Get list of interactions shared by user
*InteractionApi* | [**getUserSubscribedInteractionCategories**](docs/InteractionApi.md#getUserSubscribedInteractionCategories) | **GET** /interactions/categories/{userId}/subscribe | Get list of interaction categories subscribed by the user
*InteractionApi* | [**getUserSubscribedInteractions**](docs/InteractionApi.md#getUserSubscribedInteractions) | **GET** /interactions/{userId}/subscribe | Get list of interactions subscribed by user
*InteractionApi* | [**likeResponse**](docs/InteractionApi.md#likeResponse) | **POST** /interactions/{interactionId}/responses/{responseId}/like | Like response
*InteractionApi* | [**markAsAnResponse**](docs/InteractionApi.md#markAsAnResponse) | **POST** /interactions/{interactionId}/responses/{responseId}/mark | Mark response as a response
*InteractionApi* | [**searchInteractions**](docs/InteractionApi.md#searchInteractions) | **GET** /interactions/search | Get list of matching interactions
*InteractionApi* | [**subscribeInteractinCategory**](docs/InteractionApi.md#subscribeInteractinCategory) | **POST** /interactions/categories/{categoryId}/subscribe | Subscribe interaction category
*InteractionApi* | [**subscribeInteraction**](docs/InteractionApi.md#subscribeInteraction) | **POST** /interactions/{interactionId}/subscribe | Subscribe interaction
*InteractionApi* | [**unmarkAsAnResponse**](docs/InteractionApi.md#unmarkAsAnResponse) | **POST** /interactions/{interactionId}/responses/{responseId}/unmark | Unmark response as a response
*InteractionApi* | [**unsubscribeInteractinCategory**](docs/InteractionApi.md#unsubscribeInteractinCategory) | **POST** /interactions/categories/{categoryId}/unsubscribe | Unsubscribe interaction category
*InteractionApi* | [**unsubscribeInteraction**](docs/InteractionApi.md#unsubscribeInteraction) | **POST** /interactions/{interactionId}/unsubscribe | Unsubscribe interaction
*InteractionApi* | [**updateInteraction**](docs/InteractionApi.md#updateInteraction) | **PUT** /interactions/{interactionId} | Update interaction
*InteractionApi* | [**updateInteractionCategory**](docs/InteractionApi.md#updateInteractionCategory) | **PUT** /interactions/categories/{categoryId} | Update interaction category
*InteractionApi* | [**updateResponse**](docs/InteractionApi.md#updateResponse) | **PUT** /interactions/responses/{responseId} | Update response
*NotificationApi* | [**getNotifications**](docs/NotificationApi.md#getNotifications) | **GET** /notifications | Get list of notifications
*NotificationApi* | [**markAllNotificationAsRead**](docs/NotificationApi.md#markAllNotificationAsRead) | **POST** /notifications/read/all | Mark all notification as read
*NotificationApi* | [**markNotificationAsRead**](docs/NotificationApi.md#markNotificationAsRead) | **POST** /notifications/read/{notificationId} | Mark notification as read
*NotificationApi* | [**notificationCount**](docs/NotificationApi.md#notificationCount) | **GET** /notifications/count | Get notifications count
*ProjectManagementApi* | [**addMilestoneComment**](docs/ProjectManagementApi.md#addMilestoneComment) | **POST** /milestones/{milestoneId}/comments | Comment on milestone
*ProjectManagementApi* | [**addTaskComment**](docs/ProjectManagementApi.md#addTaskComment) | **POST** /milestones/tasks/{taskId}/comments | Comment on task
*ProjectManagementApi* | [**createMilestone**](docs/ProjectManagementApi.md#createMilestone) | **POST** /milestones | Create milestone
*ProjectManagementApi* | [**createTask**](docs/ProjectManagementApi.md#createTask) | **POST** /milestones/{milestoneId}/tasks | Create task
*ProjectManagementApi* | [**deleteMilestone**](docs/ProjectManagementApi.md#deleteMilestone) | **DELETE** /milestones/{milestoneId} | Delete milestone
*ProjectManagementApi* | [**deleteTask**](docs/ProjectManagementApi.md#deleteTask) | **DELETE** /milestones/tasks/{taskId} | Delete task
*ProjectManagementApi* | [**getMilestones**](docs/ProjectManagementApi.md#getMilestones) | **GET** /milestones | Get list of milestones
*ProjectManagementApi* | [**getMilestonesComments**](docs/ProjectManagementApi.md#getMilestonesComments) | **GET** /milestones/{milestoneId}/comments | Get list of comments written on Milestones
*ProjectManagementApi* | [**getTaskComments**](docs/ProjectManagementApi.md#getTaskComments) | **GET** /milestones/tasks/{taskId}/comments | Get list of Comments written on task
*ProjectManagementApi* | [**getUserTasks**](docs/ProjectManagementApi.md#getUserTasks) | **GET** /milestones/tasks/{userId}/assigned | Get list of task assigned to user
*ProjectManagementApi* | [**updateMilestone**](docs/ProjectManagementApi.md#updateMilestone) | **PUT** /milestones/{milestoneId} | Update milestone
*ProjectManagementApi* | [**updateTask**](docs/ProjectManagementApi.md#updateTask) | **PUT** /milestones/tasks/{taskId} | Update task
*ProjectManagementApi* | [**updateTaskStatus**](docs/ProjectManagementApi.md#updateTaskStatus) | **PUT** /milestones/tasks/{taskId}/status | Update task status
*QuestionApi* | [**addAnswer**](docs/QuestionApi.md#addAnswer) | **POST** /questions/{questionId}/answers | Answer the specified question
*QuestionApi* | [**addQuestion**](docs/QuestionApi.md#addQuestion) | **POST** /questions | Share question without attachment
*QuestionApi* | [**addQuestion_0**](docs/QuestionApi.md#addQuestion_0) | **POST** /questions/attachment | Share question with attachment
*QuestionApi* | [**createQuestionCategory**](docs/QuestionApi.md#createQuestionCategory) | **POST** /questions/categories | Create question category
*QuestionApi* | [**deleteAnswer**](docs/QuestionApi.md#deleteAnswer) | **DELETE** /questions/answers/{answerId} | Delete answer
*QuestionApi* | [**deleteQuestion**](docs/QuestionApi.md#deleteQuestion) | **DELETE** /questions/{questionId} | Delete question
*QuestionApi* | [**deleteQuestionCategory**](docs/QuestionApi.md#deleteQuestionCategory) | **DELETE** /questions/categories/{categoryId} | Delete question category
*QuestionApi* | [**dislikeAnswer**](docs/QuestionApi.md#dislikeAnswer) | **POST** /questions/{questionId}/answers/{answerId}/dislike | Dislike answer
*QuestionApi* | [**getAnswers**](docs/QuestionApi.md#getAnswers) | **GET** /questions/{questionId}/answers | Get list of answers by questionId
*QuestionApi* | [**getFriendsQuestions**](docs/QuestionApi.md#getFriendsQuestions) | **GET** /questions/friends | Get list of questions shared by friends
*QuestionApi* | [**getQuestion**](docs/QuestionApi.md#getQuestion) | **GET** /questions/{questionId} | Get question by id
*QuestionApi* | [**getQuestionCategories**](docs/QuestionApi.md#getQuestionCategories) | **GET** /questions/categories | Get the list of question categories
*QuestionApi* | [**getQuestionsForUser**](docs/QuestionApi.md#getQuestionsForUser) | **GET** /questions | Get list of all questions visible to the user
*QuestionApi* | [**getRecommendQuestion**](docs/QuestionApi.md#getRecommendQuestion) | **GET** /questions/recommend | Get list of recommended questions
*QuestionApi* | [**getRecommendedQuestionsFromDB**](docs/QuestionApi.md#getRecommendedQuestionsFromDB) | **GET** /questions/{userId}/recommendedQuestions | Get list of recommended questions from DB
*QuestionApi* | [**getRecommendedUsersFromDB**](docs/QuestionApi.md#getRecommendedUsersFromDB) | **GET** /questions/{questionId}/recommendedUsers | Get list of recommended Users from DB
*QuestionApi* | [**getUserQuestions**](docs/QuestionApi.md#getUserQuestions) | **GET** /questions/{userId}/shared | Get list of questions shared by user
*QuestionApi* | [**getUserSubscribedQuestionCategories**](docs/QuestionApi.md#getUserSubscribedQuestionCategories) | **GET** /questions/categories/{userId}/subscribe | Get list of question categories subscribed by the user
*QuestionApi* | [**getUserSubscribedQuestions**](docs/QuestionApi.md#getUserSubscribedQuestions) | **GET** /questions/{userId}/subscribe | Get list of questions subscribed by user
*QuestionApi* | [**likeAnswer**](docs/QuestionApi.md#likeAnswer) | **POST** /questions/{questionId}/answers/{answerId}/like | Like answer
*QuestionApi* | [**markAsAnAnswer**](docs/QuestionApi.md#markAsAnAnswer) | **POST** /questions/{questionId}/answers/{answerId}/mark | Mark answer as a answer
*QuestionApi* | [**searchQuestions**](docs/QuestionApi.md#searchQuestions) | **GET** /questions/search | Get list of matching questions
*QuestionApi* | [**subscribeQuestion**](docs/QuestionApi.md#subscribeQuestion) | **POST** /questions/{questionId}/subscribe | Subscribe question
*QuestionApi* | [**subscribeQuestionCategory**](docs/QuestionApi.md#subscribeQuestionCategory) | **POST** /questions/categories/{categoryId}/subscribe | Subscribe question category
*QuestionApi* | [**unmarkAsAnAnswer**](docs/QuestionApi.md#unmarkAsAnAnswer) | **POST** /questions/{questionId}/answers/{answerId}/unmark | Unmark answer as a answer
*QuestionApi* | [**unsubscribeQuestion**](docs/QuestionApi.md#unsubscribeQuestion) | **POST** /questions/{questionId}/unsubscribe | Unsubscribe question
*QuestionApi* | [**unsubscribeQuestionCategory**](docs/QuestionApi.md#unsubscribeQuestionCategory) | **POST** /questions/categories/{categoryId}/unsubscribe | Unsubscribe question category
*QuestionApi* | [**updateAnswer**](docs/QuestionApi.md#updateAnswer) | **PUT** /questions/answers/{answerId} | Update answer
*QuestionApi* | [**updateQuestion**](docs/QuestionApi.md#updateQuestion) | **PUT** /questions/{questionId} | Update question
*QuestionApi* | [**updateQuestionCategory**](docs/QuestionApi.md#updateQuestionCategory) | **PUT** /questions/categories/{categoryId} | Update question category
*RewardsApi* | [**getTopFriends**](docs/RewardsApi.md#getTopFriends) | **GET** /rewards/points/top/friends | Get list of top friends
*RewardsApi* | [**getTopUsers**](docs/RewardsApi.md#getTopUsers) | **GET** /rewards/points/top | Get list of top users
*RewardsApi* | [**getUserPoints**](docs/RewardsApi.md#getUserPoints) | **GET** /rewards/points/{userId} | Get list of user points
*SocialApi* | [**addFriend**](docs/SocialApi.md#addFriend) | **POST** /social/friends/add | Add Friend
*SocialApi* | [**confirmFriendRequest**](docs/SocialApi.md#confirmFriendRequest) | **POST** /social/friends/request/action | confirm/ignore friend request
*SocialApi* | [**follow**](docs/SocialApi.md#follow) | **POST** /social/follow | Follow user
*SocialApi* | [**getUser**](docs/SocialApi.md#getUser) | **GET** /social/users/{userId} | Get user by id 
*SocialApi* | [**getUserDetail**](docs/SocialApi.md#getUserDetail) | **GET** /social/userDetail | Get user details 
*SocialApi* | [**getUserFollowers**](docs/SocialApi.md#getUserFollowers) | **GET** /social/followers/{userId} | Get list of followers
*SocialApi* | [**getUserFollowing**](docs/SocialApi.md#getUserFollowing) | **GET** /social/following/{userId} | Get list of users that are being followed
*SocialApi* | [**getUserFriends**](docs/SocialApi.md#getUserFriends) | **GET** /social/friends{userId} | Get list of friends
*SocialApi* | [**removeFriend**](docs/SocialApi.md#removeFriend) | **POST** /social/friends/remove | Remove friend 
*SocialApi* | [**requestFriend**](docs/SocialApi.md#requestFriend) | **POST** /social/friends/request | Send friend request
*SocialApi* | [**requestsForMe**](docs/SocialApi.md#requestsForMe) | **GET** /social/friends/request | Get list of friend requests
*SocialApi* | [**unfollow**](docs/SocialApi.md#unfollow) | **POST** /social/unfollow | Unfollow user
*UserAuthenticationApi* | [**addNotificationRegisteredId**](docs/UserAuthenticationApi.md#addNotificationRegisteredId) | **POST** /devices | Add device token
*UserAuthenticationApi* | [**addUser**](docs/UserAuthenticationApi.md#addUser) | **POST** /users | Add/Register new user
*UserAuthenticationApi* | [**authenticate**](docs/UserAuthenticationApi.md#authenticate) | **GET** /authenticate | Authenticate User
*UserAuthenticationApi* | [**changePassword**](docs/UserAuthenticationApi.md#changePassword) | **PUT** /users/password | Change password
*UserAuthenticationApi* | [**deleteUser**](docs/UserAuthenticationApi.md#deleteUser) | **DELETE** /users/{userId} | Delete user
*UserAuthenticationApi* | [**getOrganizations**](docs/UserAuthenticationApi.md#getOrganizations) | **GET** /organizations | Get list of organizations
*UserAuthenticationApi* | [**logout**](docs/UserAuthenticationApi.md#logout) | **GET** /logout | Logout


## Documentation for Models

 - [Answer](docs/Answer.md)
 - [Attachment](docs/Attachment.md)
 - [Blog](docs/Blog.md)
 - [Bucket](docs/Bucket.md)
 - [CommandInfo](docs/CommandInfo.md)
 - [Comment](docs/Comment.md)
 - [Complaint](docs/Complaint.md)
 - [ComplaintCategory](docs/ComplaintCategory.md)
 - [ContentDisposition](docs/ContentDisposition.md)
 - [DataFlavor](docs/DataFlavor.md)
 - [DataHandler](docs/DataHandler.md)
 - [DataSource](docs/DataSource.md)
 - [Discussion](docs/Discussion.md)
 - [Entity](docs/Entity.md)
 - [EntitySentiment](docs/EntitySentiment.md)
 - [Group](docs/Group.md)
 - [Idea](docs/Idea.md)
 - [IdeaUserRating](docs/IdeaUserRating.md)
 - [InputStream](docs/InputStream.md)
 - [Interaction](docs/Interaction.md)
 - [InteractionCategory](docs/InteractionCategory.md)
 - [InteractionResponse](docs/InteractionResponse.md)
 - [MediaType](docs/MediaType.md)
 - [Multimedia](docs/Multimedia.md)
 - [NER](docs/NER.md)
 - [NLC](docs/NLC.md)
 - [Notification](docs/Notification.md)
 - [Organization](docs/Organization.md)
 - [OutputStream](docs/OutputStream.md)
 - [ProjectManagement](docs/ProjectManagement.md)
 - [Question](docs/Question.md)
 - [QuestionCategory](docs/QuestionCategory.md)
 - [RequestForMe](docs/RequestForMe.md)
 - [Sentiment](docs/Sentiment.md)
 - [SentimentAnalytics](docs/SentimentAnalytics.md)
 - [Solution](docs/Solution.md)
 - [Tag](docs/Tag.md)
 - [Task](docs/Task.md)
 - [User](docs/User.md)
 - [UserDetail](docs/UserDetail.md)
 - [UserPoints](docs/UserPoints.md)
 - [VerveResponseAnswer](docs/VerveResponseAnswer.md)
 - [VerveResponseAnswerList](docs/VerveResponseAnswerList.md)
 - [VerveResponseBlog](docs/VerveResponseBlog.md)
 - [VerveResponseBlogList](docs/VerveResponseBlogList.md)
 - [VerveResponseComment](docs/VerveResponseComment.md)
 - [VerveResponseCommentList](docs/VerveResponseCommentList.md)
 - [VerveResponseComplaint](docs/VerveResponseComplaint.md)
 - [VerveResponseComplaintCategory](docs/VerveResponseComplaintCategory.md)
 - [VerveResponseComplaintCategoryList](docs/VerveResponseComplaintCategoryList.md)
 - [VerveResponseComplaintList](docs/VerveResponseComplaintList.md)
 - [VerveResponseDiscussion](docs/VerveResponseDiscussion.md)
 - [VerveResponseDiscussionList](docs/VerveResponseDiscussionList.md)
 - [VerveResponseEntitySentimentList](docs/VerveResponseEntitySentimentList.md)
 - [VerveResponseGroup](docs/VerveResponseGroup.md)
 - [VerveResponseGroupList](docs/VerveResponseGroupList.md)
 - [VerveResponseIdea](docs/VerveResponseIdea.md)
 - [VerveResponseIdeaList](docs/VerveResponseIdeaList.md)
 - [VerveResponseIdeaUserRatingList](docs/VerveResponseIdeaUserRatingList.md)
 - [VerveResponseInteraction](docs/VerveResponseInteraction.md)
 - [VerveResponseInteractionCategory](docs/VerveResponseInteractionCategory.md)
 - [VerveResponseInteractionCategoryList](docs/VerveResponseInteractionCategoryList.md)
 - [VerveResponseInteractionList](docs/VerveResponseInteractionList.md)
 - [VerveResponseInteractionResponse](docs/VerveResponseInteractionResponse.md)
 - [VerveResponseInteractionResponseList](docs/VerveResponseInteractionResponseList.md)
 - [VerveResponseMilestone](docs/VerveResponseMilestone.md)
 - [VerveResponseMilestoneList](docs/VerveResponseMilestoneList.md)
 - [VerveResponseNLCList](docs/VerveResponseNLCList.md)
 - [VerveResponseNotificationList](docs/VerveResponseNotificationList.md)
 - [VerveResponseOrganizationList](docs/VerveResponseOrganizationList.md)
 - [VerveResponseQuestion](docs/VerveResponseQuestion.md)
 - [VerveResponseQuestionCategory](docs/VerveResponseQuestionCategory.md)
 - [VerveResponseQuestionCategoryList](docs/VerveResponseQuestionCategoryList.md)
 - [VerveResponseQuestionList](docs/VerveResponseQuestionList.md)
 - [VerveResponseRequestForMeList](docs/VerveResponseRequestForMeList.md)
 - [VerveResponseSentimentAnalytics](docs/VerveResponseSentimentAnalytics.md)
 - [VerveResponseSolution](docs/VerveResponseSolution.md)
 - [VerveResponseSolutionList](docs/VerveResponseSolutionList.md)
 - [VerveResponseString](docs/VerveResponseString.md)
 - [VerveResponseTagList](docs/VerveResponseTagList.md)
 - [VerveResponseTask](docs/VerveResponseTask.md)
 - [VerveResponseTaskList](docs/VerveResponseTaskList.md)
 - [VerveResponseUser](docs/VerveResponseUser.md)
 - [VerveResponseUserDetail](docs/VerveResponseUserDetail.md)
 - [VerveResponseUserList](docs/VerveResponseUserList.md)
 - [VerveResponseUserPoints](docs/VerveResponseUserPoints.md)
 - [VerveResponseUserPointsList](docs/VerveResponseUserPointsList.md)
 - [VerveResponseWFTask](docs/VerveResponseWFTask.md)
 - [VerveResponseWFTaskList](docs/VerveResponseWFTaskList.md)
 - [WFTask](docs/WFTask.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### default 

- **Type**: OAuth
- **Flow**: implicit
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

[iEngage.io](http://iengage.io/) [Aikon Labs Pvt Ltd](http://aikonlabs.com)



