# QuestionApi

All URIs are relative to *https://api.iengage.io:8243/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAnswer**](QuestionApi.md#addAnswer) | **POST** /questions/{questionId}/answers | Answer the specified question
[**addQuestion**](QuestionApi.md#addQuestion) | **POST** /questions | Share question without attachment
[**addQuestion_0**](QuestionApi.md#addQuestion_0) | **POST** /questions/attachment | Share question with attachment
[**createQuestionCategory**](QuestionApi.md#createQuestionCategory) | **POST** /questions/categories | Create question category
[**deleteAnswer**](QuestionApi.md#deleteAnswer) | **DELETE** /questions/answers/{answerId} | Delete answer
[**deleteQuestion**](QuestionApi.md#deleteQuestion) | **DELETE** /questions/{questionId} | Delete question
[**deleteQuestionCategory**](QuestionApi.md#deleteQuestionCategory) | **DELETE** /questions/categories/{categoryId} | Delete question category
[**dislikeAnswer**](QuestionApi.md#dislikeAnswer) | **POST** /questions/{questionId}/answers/{answerId}/dislike | Dislike answer
[**getAnswers**](QuestionApi.md#getAnswers) | **GET** /questions/{questionId}/answers | Get list of answers by questionId
[**getFriendsQuestions**](QuestionApi.md#getFriendsQuestions) | **GET** /questions/friends | Get list of questions shared by friends
[**getQuestion**](QuestionApi.md#getQuestion) | **GET** /questions/{questionId} | Get question by id
[**getQuestionCategories**](QuestionApi.md#getQuestionCategories) | **GET** /questions/categories | Get the list of question categories
[**getQuestionsForUser**](QuestionApi.md#getQuestionsForUser) | **GET** /questions | Get list of all questions visible to the user
[**getRecommendQuestion**](QuestionApi.md#getRecommendQuestion) | **GET** /questions/recommend | Get list of recommended questions
[**getRecommendedQuestionsFromDB**](QuestionApi.md#getRecommendedQuestionsFromDB) | **GET** /questions/{userId}/recommendedQuestions | Get list of recommended questions from DB
[**getRecommendedUsersFromDB**](QuestionApi.md#getRecommendedUsersFromDB) | **GET** /questions/{questionId}/recommendedUsers | Get list of recommended Users from DB
[**getUserQuestions**](QuestionApi.md#getUserQuestions) | **GET** /questions/{userId}/shared | Get list of questions shared by user
[**getUserSubscribedQuestionCategories**](QuestionApi.md#getUserSubscribedQuestionCategories) | **GET** /questions/categories/{userId}/subscribe | Get list of question categories subscribed by the user
[**getUserSubscribedQuestions**](QuestionApi.md#getUserSubscribedQuestions) | **GET** /questions/{userId}/subscribe | Get list of questions subscribed by user
[**likeAnswer**](QuestionApi.md#likeAnswer) | **POST** /questions/{questionId}/answers/{answerId}/like | Like answer
[**markAsAnAnswer**](QuestionApi.md#markAsAnAnswer) | **POST** /questions/{questionId}/answers/{answerId}/mark | Mark answer as a answer
[**searchQuestions**](QuestionApi.md#searchQuestions) | **GET** /questions/search | Get list of matching questions
[**subscribeQuestion**](QuestionApi.md#subscribeQuestion) | **POST** /questions/{questionId}/subscribe | Subscribe question
[**subscribeQuestionCategory**](QuestionApi.md#subscribeQuestionCategory) | **POST** /questions/categories/{categoryId}/subscribe | Subscribe question category
[**unmarkAsAnAnswer**](QuestionApi.md#unmarkAsAnAnswer) | **POST** /questions/{questionId}/answers/{answerId}/unmark | Unmark answer as a answer
[**unsubscribeQuestion**](QuestionApi.md#unsubscribeQuestion) | **POST** /questions/{questionId}/unsubscribe | Unsubscribe question
[**unsubscribeQuestionCategory**](QuestionApi.md#unsubscribeQuestionCategory) | **POST** /questions/categories/{categoryId}/unsubscribe | Unsubscribe question category
[**updateAnswer**](QuestionApi.md#updateAnswer) | **PUT** /questions/answers/{answerId} | Update answer
[**updateQuestion**](QuestionApi.md#updateQuestion) | **PUT** /questions/{questionId} | Update question
[**updateQuestionCategory**](QuestionApi.md#updateQuestionCategory) | **PUT** /questions/categories/{categoryId} | Update question category


<a name="addAnswer"></a>
# **addAnswer**
> VerveResponseAnswer addAnswer(questionId, answer, loggedInUserId, accessToken, clientToken, fields)

Answer the specified question

Allows the user to answer the question

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long questionId = 789L; // Long | questionId
String answer = "answer_example"; // String | answer
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "answerId,answerDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/><b>A) Available values -</b><br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/>4)questionId<br/>5)answeringUser<br/>6)isMarkedAnswer<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseAnswer result = apiInstance.addAnswer(questionId, answer, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#addAnswer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **Long**| questionId |
 **answer** | **String**| answer |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)questionId&lt;br/&gt;5)answeringUser&lt;br/&gt;6)isMarkedAnswer&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to answerId,answerDescription,createdDate]

### Return type

[**VerveResponseAnswer**](VerveResponseAnswer.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addQuestion"></a>
# **addQuestion**
> VerveResponseQuestion addQuestion(categoryId, questionTitle, questionDescription, loggedInUserId, accessToken, clientToken)

Share question without attachment

Allows the user to share question without attachment. Returns the question object

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long categoryId = 789L; // Long | categoryId
String questionTitle = "questionTitle_example"; // String | Question Title
String questionDescription = "questionDescription_example"; // String | Describe question
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseQuestion result = apiInstance.addQuestion(categoryId, questionTitle, questionDescription, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#addQuestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Long**| categoryId |
 **questionTitle** | **String**| Question Title |
 **questionDescription** | **String**| Describe question |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseQuestion**](VerveResponseQuestion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addQuestion_0"></a>
# **addQuestion_0**
> VerveResponseQuestion addQuestion_0(body, body2, body3, loggedInUserId, accessToken, clientToken, body4)

Share question with attachment

Allows the user to share question with attachment. Returns the question object

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long body = 789L; // Long | categoryId
String body2 = "body_example"; // String | questionTitle
String body3 = "body_example"; // String | questionDescription
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
List<Attachment> body4 = Arrays.asList(new Attachment()); // List<Attachment> | 
try {
    VerveResponseQuestion result = apiInstance.addQuestion_0(body, body2, body3, loggedInUserId, accessToken, clientToken, body4);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#addQuestion_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Long**| categoryId |
 **body2** | **String**| questionTitle |
 **body3** | **String**| questionDescription |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body4** | [**List&lt;Attachment&gt;**](Attachment.md)|  | [optional]

### Return type

[**VerveResponseQuestion**](VerveResponseQuestion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createQuestionCategory"></a>
# **createQuestionCategory**
> VerveResponseQuestionCategory createQuestionCategory(name, description, loggedInUserId, accessToken, clientToken, organizationId, fields)

Create question category

Creates a question category. Returns the created question category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
String name = "name_example"; // String | Name
String description = "description_example"; // String | description
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long organizationId = 789L; // Long | OrganizationId
String fields = "categoryId,categoryName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2)categoryName<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed
try {
    VerveResponseQuestionCategory result = apiInstance.createQuestionCategory(name, description, loggedInUserId, accessToken, clientToken, organizationId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#createQuestionCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name |
 **description** | **String**| description |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **organizationId** | **Long**| OrganizationId | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed | [optional] [default to categoryId,categoryName]

### Return type

[**VerveResponseQuestionCategory**](VerveResponseQuestionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteAnswer"></a>
# **deleteAnswer**
> VerveResponseAnswer deleteAnswer(answerId, loggedInUserId, accessToken, clientToken, fields)

Delete answer

Allows the user to delete an answer. Returns the deleted answer

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long answerId = 789L; // Long | answerId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "answerId,answerDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/><b>A) Available values -</b><br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/>4)questionId<br/>5)answeringUser<br/>6)isMarkedAnswer<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseAnswer result = apiInstance.deleteAnswer(answerId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#deleteAnswer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answerId** | **Long**| answerId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)questionId&lt;br/&gt;5)answeringUser&lt;br/&gt;6)isMarkedAnswer&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to answerId,answerDescription,createdDate]

### Return type

[**VerveResponseAnswer**](VerveResponseAnswer.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteQuestion"></a>
# **deleteQuestion**
> VerveResponseQuestion deleteQuestion(questionId, loggedInUserId, accessToken, clientToken, fields)

Delete question

Allows the user to delete a question. Returns the deleted answer

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long questionId = 789L; // Long | questionId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "questionId,questionTitle,questionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)issuer<br/>5)noOfAnswers<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseQuestion result = apiInstance.deleteQuestion(questionId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#deleteQuestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **Long**| questionId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfAnswers&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to questionId,questionTitle,questionDescription,createdDate]

### Return type

[**VerveResponseQuestion**](VerveResponseQuestion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteQuestionCategory"></a>
# **deleteQuestionCategory**
> VerveResponseQuestionCategory deleteQuestionCategory(categoryId, loggedInUserId, accessToken, clientToken, fields)

Delete question category

Allows the user to delete the question category. Returns the deleted question category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long categoryId = 789L; // Long | categoryId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2)categoryName<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed
try {
    VerveResponseQuestionCategory result = apiInstance.deleteQuestionCategory(categoryId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#deleteQuestionCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Long**| categoryId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed | [optional] [default to categoryId,categoryName]

### Return type

[**VerveResponseQuestionCategory**](VerveResponseQuestionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="dislikeAnswer"></a>
# **dislikeAnswer**
> VerveResponseAnswer dislikeAnswer(questionId, answerId, loggedInUserId, accessToken, clientToken, fields)

Dislike answer

Allows the user to dislike the answer.

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long questionId = 789L; // Long | questionId
Long answerId = 789L; // Long | answerId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "answerId,answerDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/><b>A) Available values -</b><br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/>4)questionId<br/>5)answeringUser<br/>6)isMarkedAnswer<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseAnswer result = apiInstance.dislikeAnswer(questionId, answerId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#dislikeAnswer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **Long**| questionId |
 **answerId** | **Long**| answerId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)questionId&lt;br/&gt;5)answeringUser&lt;br/&gt;6)isMarkedAnswer&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to answerId,answerDescription,createdDate]

### Return type

[**VerveResponseAnswer**](VerveResponseAnswer.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getAnswers"></a>
# **getAnswers**
> VerveResponseAnswerList getAnswers(questionId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of answers by questionId

Returns the list of answers by questionId

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long questionId = 789L; // Long | questionId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "answerId,answerDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/><b>A) Available values -</b><br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/>4)questionId<br/>5)answeringUser<br/>6)isMarkedAnswer<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseAnswerList result = apiInstance.getAnswers(questionId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#getAnswers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **Long**| questionId |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)questionId&lt;br/&gt;5)answeringUser&lt;br/&gt;6)isMarkedAnswer&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to answerId,answerDescription,createdDate]

### Return type

[**VerveResponseAnswerList**](VerveResponseAnswerList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFriendsQuestions"></a>
# **getFriendsQuestions**
> VerveResponseQuestionList getFriendsQuestions(questionStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields)

Get list of questions shared by friends

Returns the list of questions shared by friends

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
String questionStatus = "questionStatus_example"; // String | Question status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String fields = "questionId,questionTitle,questionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)issuer<br/>5)noOfAnswers<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseQuestionList result = apiInstance.getFriendsQuestions(questionStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#getFriendsQuestions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionStatus** | **String**| Question status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfAnswers&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to questionId,questionTitle,questionDescription,createdDate]

### Return type

[**VerveResponseQuestionList**](VerveResponseQuestionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuestion"></a>
# **getQuestion**
> VerveResponseQuestion getQuestion(questionId, loggedInUserId, accessToken, clientToken, fields)

Get question by id

Returns the question by id

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long questionId = 789L; // Long | questionId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "questionId,questionTitle,questionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)issuer<br/>5)noOfAnswers<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseQuestion result = apiInstance.getQuestion(questionId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#getQuestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **Long**| questionId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfAnswers&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to questionId,questionTitle,questionDescription,createdDate]

### Return type

[**VerveResponseQuestion**](VerveResponseQuestion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuestionCategories"></a>
# **getQuestionCategories**
> VerveResponseQuestionCategoryList getQuestionCategories(start, end, loggedInUserId, accessToken, clientToken, fields)

Get the list of question categories

Returns the list of question categories

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2)categoryName<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed
try {
    VerveResponseQuestionCategoryList result = apiInstance.getQuestionCategories(start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#getQuestionCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed | [optional] [default to categoryId,categoryName]

### Return type

[**VerveResponseQuestionCategoryList**](VerveResponseQuestionCategoryList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuestionsForUser"></a>
# **getQuestionsForUser**
> VerveResponseQuestionList getQuestionsForUser(questionStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields)

Get list of all questions visible to the user

Returns the list of all questions visible to the user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
String questionStatus = "questionStatus_example"; // String | Question status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String fields = "questionId,questionTitle,questionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)issuer<br/>5)noOfAnswers<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseQuestionList result = apiInstance.getQuestionsForUser(questionStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#getQuestionsForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionStatus** | **String**| Question status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfAnswers&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to questionId,questionTitle,questionDescription,createdDate]

### Return type

[**VerveResponseQuestionList**](VerveResponseQuestionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendQuestion"></a>
# **getRecommendQuestion**
> VerveResponseQuestionList getRecommendQuestion(start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of recommended questions

Returns the list of recommended questions

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "questionId,questionTitle,questionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)issuer<br/>5)noOfAnswers<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseQuestionList result = apiInstance.getRecommendQuestion(start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#getRecommendQuestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfAnswers&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to questionId,questionTitle,questionDescription,createdDate]

### Return type

[**VerveResponseQuestionList**](VerveResponseQuestionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendedQuestionsFromDB"></a>
# **getRecommendedQuestionsFromDB**
> VerveResponseQuestionList getRecommendedQuestionsFromDB(userId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of recommended questions from DB

Returns the list of recommended questions from DB

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long userId = 789L; // Long | userId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "questionId,questionTitle,questionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)issuer<br/>5)noOfAnswers<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseQuestionList result = apiInstance.getRecommendedQuestionsFromDB(userId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#getRecommendedQuestionsFromDB");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfAnswers&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to questionId,questionTitle,questionDescription,createdDate]

### Return type

[**VerveResponseQuestionList**](VerveResponseQuestionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendedUsersFromDB"></a>
# **getRecommendedUsersFromDB**
> VerveResponseUserList getRecommendedUsersFromDB(questionId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of recommended Users from DB

Returns the list of recommended users from DB

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long questionId = 789L; // Long | questionId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "userId,firstName,lastName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)userId<br/>2)firstName<br/>3)lastName<br/>4)profileImage<br/><b>A) Available values-</b><br/>1)userId<br/>2)firstName<br/>3)lastName<br/>4)emailId<br/>5)profileImage<br/>6)birthDate<br/>7)currentUserFollowing<br/>8)currentUserFriend<br/>9)equityScore
try {
    VerveResponseUserList result = apiInstance.getRecommendedUsersFromDB(questionId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#getRecommendedUsersFromDB");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **Long**| questionId |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)userId&lt;br/&gt;2)firstName&lt;br/&gt;3)lastName&lt;br/&gt;4)profileImage&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)userId&lt;br/&gt;2)firstName&lt;br/&gt;3)lastName&lt;br/&gt;4)emailId&lt;br/&gt;5)profileImage&lt;br/&gt;6)birthDate&lt;br/&gt;7)currentUserFollowing&lt;br/&gt;8)currentUserFriend&lt;br/&gt;9)equityScore | [optional] [default to userId,firstName,lastName]

### Return type

[**VerveResponseUserList**](VerveResponseUserList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserQuestions"></a>
# **getUserQuestions**
> VerveResponseQuestionList getUserQuestions(userId, questionStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields)

Get list of questions shared by user

Returns the list of questions shared by specific user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long userId = 789L; // Long | userId
String questionStatus = "questionStatus_example"; // String | Question status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String fields = "questionId,questionTitle,questionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)issuer<br/>5)noOfAnswers<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseQuestionList result = apiInstance.getUserQuestions(userId, questionStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#getUserQuestions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **questionStatus** | **String**| Question status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfAnswers&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to questionId,questionTitle,questionDescription,createdDate]

### Return type

[**VerveResponseQuestionList**](VerveResponseQuestionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSubscribedQuestionCategories"></a>
# **getUserSubscribedQuestionCategories**
> VerveResponseQuestionCategoryList getUserSubscribedQuestionCategories(userId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of question categories subscribed by the user

Returns the list of question categories subscribed by the user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long userId = 789L; // Long | userId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2)categoryName<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed
try {
    VerveResponseQuestionCategoryList result = apiInstance.getUserSubscribedQuestionCategories(userId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#getUserSubscribedQuestionCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed | [optional] [default to categoryId,categoryName]

### Return type

[**VerveResponseQuestionCategoryList**](VerveResponseQuestionCategoryList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSubscribedQuestions"></a>
# **getUserSubscribedQuestions**
> VerveResponseQuestionList getUserSubscribedQuestions(userId, questionStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields)

Get list of questions subscribed by user

Returns the list of questions subscribed by specific user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long userId = 789L; // Long | userId
String questionStatus = "questionStatus_example"; // String | Question status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String fields = "questionId,questionTitle,questionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)issuer<br/>5)noOfAnswers<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseQuestionList result = apiInstance.getUserSubscribedQuestions(userId, questionStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#getUserSubscribedQuestions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **questionStatus** | **String**| Question status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfAnswers&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to questionId,questionTitle,questionDescription,createdDate]

### Return type

[**VerveResponseQuestionList**](VerveResponseQuestionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="likeAnswer"></a>
# **likeAnswer**
> VerveResponseAnswer likeAnswer(questionId, answerId, loggedInUserId, accessToken, clientToken, fields)

Like answer

Allows the user to like the answer.

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long questionId = 789L; // Long | questionId
Long answerId = 789L; // Long | answerId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "answerId,answerDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/><b>A) Available values -</b><br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/>4)questionId<br/>5)answeringUser<br/>6)isMarkedAnswer<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseAnswer result = apiInstance.likeAnswer(questionId, answerId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#likeAnswer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **Long**| questionId |
 **answerId** | **Long**| answerId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)questionId&lt;br/&gt;5)answeringUser&lt;br/&gt;6)isMarkedAnswer&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to answerId,answerDescription,createdDate]

### Return type

[**VerveResponseAnswer**](VerveResponseAnswer.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="markAsAnAnswer"></a>
# **markAsAnAnswer**
> VerveResponseAnswer markAsAnAnswer(questionId, answerId, loggedInUserId, accessToken, clientToken, fields)

Mark answer as a answer

Marks the answer as accepted. This means the user is satisfied with the answer &amp; then the question will go into closed state

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long questionId = 789L; // Long | questionId
Long answerId = 789L; // Long | answerId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "answerId,answerDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/><b>A) Available values -</b><br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/>4)questionId<br/>5)answeringUser<br/>6)isMarkedAnswer<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseAnswer result = apiInstance.markAsAnAnswer(questionId, answerId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#markAsAnAnswer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **Long**| questionId |
 **answerId** | **Long**| answerId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)questionId&lt;br/&gt;5)answeringUser&lt;br/&gt;6)isMarkedAnswer&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to answerId,answerDescription,createdDate]

### Return type

[**VerveResponseAnswer**](VerveResponseAnswer.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="searchQuestions"></a>
# **searchQuestions**
> VerveResponseQuestionList searchQuestions(searchText, questionStatus, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of matching questions

Returns the list of matching questions

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
String searchText = "searchText_example"; // String | Search Text, keywords to search
String questionStatus = "questionStatus_example"; // String | Question status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "questionId,questionTitle,questionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)issuer<br/>5)noOfAnswers<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseQuestionList result = apiInstance.searchQuestions(searchText, questionStatus, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#searchQuestions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchText** | **String**| Search Text, keywords to search |
 **questionStatus** | **String**| Question status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfAnswers&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to questionId,questionTitle,questionDescription,createdDate]

### Return type

[**VerveResponseQuestionList**](VerveResponseQuestionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subscribeQuestion"></a>
# **subscribeQuestion**
> VerveResponseQuestion subscribeQuestion(questionId, loggedInUserId, accessToken, clientToken, fields)

Subscribe question

Allows the user to subscribe a question

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long questionId = 789L; // Long | questionId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "questionId,questionTitle,questionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)issuer<br/>5)noOfAnswers<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseQuestion result = apiInstance.subscribeQuestion(questionId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#subscribeQuestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **Long**| questionId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfAnswers&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to questionId,questionTitle,questionDescription,createdDate]

### Return type

[**VerveResponseQuestion**](VerveResponseQuestion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="subscribeQuestionCategory"></a>
# **subscribeQuestionCategory**
> VerveResponseQuestionCategory subscribeQuestionCategory(categoryId, loggedInUserId, accessToken, clientToken, fields)

Subscribe question category

Returns the subscribed question category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long categoryId = 789L; // Long | categoryId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2)categoryName<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed
try {
    VerveResponseQuestionCategory result = apiInstance.subscribeQuestionCategory(categoryId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#subscribeQuestionCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Long**| categoryId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed | [optional] [default to categoryId,categoryName]

### Return type

[**VerveResponseQuestionCategory**](VerveResponseQuestionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="unmarkAsAnAnswer"></a>
# **unmarkAsAnAnswer**
> VerveResponseAnswer unmarkAsAnAnswer(questionId, answerId, loggedInUserId, accessToken, clientToken, fields)

Unmark answer as a answer

Unmarks the answer. This will remove the marked answer.

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long questionId = 789L; // Long | questionId
Long answerId = 789L; // Long | answerId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "answerId,answerDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/><b>A) Available values -</b><br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/>4)questionId<br/>5)answeringUser<br/>6)isMarkedAnswer<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseAnswer result = apiInstance.unmarkAsAnAnswer(questionId, answerId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#unmarkAsAnAnswer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **Long**| questionId |
 **answerId** | **Long**| answerId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)questionId&lt;br/&gt;5)answeringUser&lt;br/&gt;6)isMarkedAnswer&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to answerId,answerDescription,createdDate]

### Return type

[**VerveResponseAnswer**](VerveResponseAnswer.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="unsubscribeQuestion"></a>
# **unsubscribeQuestion**
> VerveResponseQuestion unsubscribeQuestion(questionId, loggedInUserId, accessToken, clientToken, fields)

Unsubscribe question

Allows the user to unsubscribe a question

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long questionId = 789L; // Long | questionId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "questionId,questionTitle,questionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)issuer<br/>5)noOfAnswers<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseQuestion result = apiInstance.unsubscribeQuestion(questionId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#unsubscribeQuestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **Long**| questionId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfAnswers&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to questionId,questionTitle,questionDescription,createdDate]

### Return type

[**VerveResponseQuestion**](VerveResponseQuestion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="unsubscribeQuestionCategory"></a>
# **unsubscribeQuestionCategory**
> VerveResponseQuestionCategory unsubscribeQuestionCategory(categoryId, loggedInUserId, accessToken, clientToken, fields)

Unsubscribe question category

Returns the unsubscribed question category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long categoryId = 789L; // Long | categoryId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2)categoryName<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed
try {
    VerveResponseQuestionCategory result = apiInstance.unsubscribeQuestionCategory(categoryId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#unsubscribeQuestionCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Long**| categoryId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed | [optional] [default to categoryId,categoryName]

### Return type

[**VerveResponseQuestionCategory**](VerveResponseQuestionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateAnswer"></a>
# **updateAnswer**
> VerveResponseAnswer updateAnswer(answerId, answer, loggedInUserId, accessToken, clientToken, fields)

Update answer

Allows the user to update an answer. Returns the updated answer

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long answerId = 789L; // Long | answerId
String answer = "answer_example"; // String | answer
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "answerId,answerDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/><b>A) Available values -</b><br/>1)answerId<br/>2)answerDescription<br/>3)createdDate<br/>4)questionId<br/>5)answeringUser<br/>6)isMarkedAnswer<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseAnswer result = apiInstance.updateAnswer(answerId, answer, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#updateAnswer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answerId** | **Long**| answerId |
 **answer** | **String**| answer |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)answerId&lt;br/&gt;2)answerDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)questionId&lt;br/&gt;5)answeringUser&lt;br/&gt;6)isMarkedAnswer&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to answerId,answerDescription,createdDate]

### Return type

[**VerveResponseAnswer**](VerveResponseAnswer.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateQuestion"></a>
# **updateQuestion**
> VerveResponseQuestion updateQuestion(questionId, questionTitle, questionDescription, loggedInUserId, accessToken, clientToken, fields)

Update question

Allows the user to update question. Returns the updated question

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long questionId = 789L; // Long | questionId
String questionTitle = "questionTitle_example"; // String | Question Title
String questionDescription = "questionDescription_example"; // String | Describe Question
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "questionId,questionTitle,questionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)questionId<br/>2)questionTitle<br/>3)questionDescription<br/>4)issuer<br/>5)noOfAnswers<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseQuestion result = apiInstance.updateQuestion(questionId, questionTitle, questionDescription, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#updateQuestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **Long**| questionId |
 **questionTitle** | **String**| Question Title |
 **questionDescription** | **String**| Describe Question |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)questionId&lt;br/&gt;2)questionTitle&lt;br/&gt;3)questionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfAnswers&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to questionId,questionTitle,questionDescription,createdDate]

### Return type

[**VerveResponseQuestion**](VerveResponseQuestion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateQuestionCategory"></a>
# **updateQuestionCategory**
> VerveResponseQuestionCategory updateQuestionCategory(categoryId, categoryName, categoryDescription, loggedInUserId, accessToken, clientToken, fields)

Update question category

Allows the user to update the question category. Returns the updated question category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.QuestionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

QuestionApi apiInstance = new QuestionApi();
Long categoryId = 789L; // Long | categoryId
String categoryName = "categoryName_example"; // String | Category Name
String categoryDescription = "categoryDescription_example"; // String | Describe category
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2)categoryName<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed
try {
    VerveResponseQuestionCategory result = apiInstance.updateQuestionCategory(categoryId, categoryName, categoryDescription, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionApi#updateQuestionCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Long**| categoryId |
 **categoryName** | **String**| Category Name |
 **categoryDescription** | **String**| Describe category |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed | [optional] [default to categoryId,categoryName]

### Return type

[**VerveResponseQuestionCategory**](VerveResponseQuestionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

