# IdeaApi

All URIs are relative to *https://api.iengage.io:8243/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteComment**](IdeaApi.md#deleteComment) | **DELETE** /ideas/comments/{commentId} | Delete comment
[**deleteIdea**](IdeaApi.md#deleteIdea) | **DELETE** /ideas/{ideaId} | Delete idea
[**followIdea**](IdeaApi.md#followIdea) | **POST** /ideas/{ideaId}/follow | Follow idea
[**getAllIdeas**](IdeaApi.md#getAllIdeas) | **GET** /ideas | Get list of Ideas
[**getFollowingIdeas**](IdeaApi.md#getFollowingIdeas) | **GET** /ideas/{userId}/following | Get list of ideas that users are following
[**getGroupIdeas**](IdeaApi.md#getGroupIdeas) | **GET** /ideas/getGroupIdeas | Get list of ideas in group
[**getIdea**](IdeaApi.md#getIdea) | **GET** /ideas/{ideaId} | Get idea by id
[**getIdeaComment**](IdeaApi.md#getIdeaComment) | **GET** /ideas/{ideaId}/comments | Get list of comments on idea
[**getIdeaFollowers**](IdeaApi.md#getIdeaFollowers) | **GET** /ideas/{ideaId}/followers | Get list of followers for this idea
[**getIdeaRatingParameters**](IdeaApi.md#getIdeaRatingParameters) | **GET** /ideas/getIdeaRatingParameters | Get rating parameters of idea by user
[**getIdeaRatings**](IdeaApi.md#getIdeaRatings) | **GET** /ideas/getIdeaUserRating | Get list of ideas that are rated by user 
[**getRecommendIdeas**](IdeaApi.md#getRecommendIdeas) | **GET** /ideas/recommend | Get the list of recommended ideas
[**getTopIdeas**](IdeaApi.md#getTopIdeas) | **GET** /ideas/top | Get the list of top ideas
[**getUserIdeas**](IdeaApi.md#getUserIdeas) | **GET** /ideas/{userId}/shared | Get list of ideas shared by user
[**getUserRateIdeas**](IdeaApi.md#getUserRateIdeas) | **GET** /ideas/{userId}/rated | Get list of ideas rated by user
[**rateIdea**](IdeaApi.md#rateIdea) | **POST** /ideas/rateIdea | Rate an idea
[**rateIdea_0**](IdeaApi.md#rateIdea_0) | **GET** /ideas/rateIdeaByParameter | Give rating on idea
[**searchIdeas**](IdeaApi.md#searchIdeas) | **GET** /ideas/search | Get list of matching ideas
[**shareFormIdea**](IdeaApi.md#shareFormIdea) | **POST** /ideas/attachment | Share Idea with attachments
[**shareIdea**](IdeaApi.md#shareIdea) | **POST** /ideas | Share idea  
[**shareIdeaComment**](IdeaApi.md#shareIdeaComment) | **POST** /ideas/{ideaId}/comments | Comment on shared idea
[**unfollowIdea**](IdeaApi.md#unfollowIdea) | **POST** /ideas/{ideaId}/unfollow | Unfollow idea
[**updateCommet**](IdeaApi.md#updateCommet) | **PUT** /ideas/comments/{commentId} | Update comment
[**updateIdea**](IdeaApi.md#updateIdea) | **PUT** /ideas/{ideaId} | Update idea


<a name="deleteComment"></a>
# **deleteComment**
> VerveResponseComment deleteComment(commentId, loggedInUserId, accessToken, clientToken)

Delete comment

Allows the user to delete comment. Returns the deleted comment

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long commentId = 789L; // Long | Comment Id
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseComment result = apiInstance.deleteComment(commentId, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#deleteComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **Long**| Comment Id |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseComment**](VerveResponseComment.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="deleteIdea"></a>
# **deleteIdea**
> VerveResponseIdea deleteIdea(ideaId, loggedInUserId, accessToken, clientToken, fields)

Delete idea

Allows the user to delete idea. Returns the deleted idea

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long ideaId = 789L; // Long | ideaId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdea result = apiInstance.deleteIdea(ideaId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#deleteIdea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ideaId** | **Long**| ideaId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="followIdea"></a>
# **followIdea**
> VerveResponseIdea followIdea(ideaId, loggedInUserId, accessToken, clientToken, fields)

Follow idea

Allows the user to follow idea. Returns the followed idea

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long ideaId = 789L; // Long | idea Id
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdea result = apiInstance.followIdea(ideaId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#followIdea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ideaId** | **Long**| idea Id |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="getAllIdeas"></a>
# **getAllIdeas**
> VerveResponseIdeaList getAllIdeas(start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of Ideas

Returns the list of ideas

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdeaList result = apiInstance.getAllIdeas(start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getAllIdeas");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFollowingIdeas"></a>
# **getFollowingIdeas**
> VerveResponseIdeaList getFollowingIdeas(userId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of ideas that users are following

Returns the list of ideas being followed

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long userId = 789L; // Long | userId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdeaList result = apiInstance.getFollowingIdeas(userId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getFollowingIdeas");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupIdeas"></a>
# **getGroupIdeas**
> VerveResponseIdeaList getGroupIdeas(userId, groupId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of ideas in group

Return the ideas list on group

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long userId = 789L; // Long | user Id
Long groupId = 789L; // Long | group Id
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdeaList result = apiInstance.getGroupIdeas(userId, groupId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getGroupIdeas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| user Id |
 **groupId** | **Long**| group Id |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdea"></a>
# **getIdea**
> VerveResponseIdea getIdea(ideaId, loggedInUserId, accessToken, clientToken, fields)

Get idea by id

Returns the idea by id

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long ideaId = 789L; // Long | idea Id
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdea result = apiInstance.getIdea(ideaId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getIdea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ideaId** | **Long**| idea Id |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdeaComment"></a>
# **getIdeaComment**
> VerveResponseCommentList getIdeaComment(ideaId, start, end, loggedInUserId, accessToken, clientToken)

Get list of comments on idea

Returns the list of comments on idea

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long ideaId = 789L; // Long | idea Id
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseCommentList result = apiInstance.getIdeaComment(ideaId, start, end, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getIdeaComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ideaId** | **Long**| idea Id |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseCommentList**](VerveResponseCommentList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdeaFollowers"></a>
# **getIdeaFollowers**
> VerveResponseUserList getIdeaFollowers(ideaId, start, end, loggedInUserId, accessToken, clientToken)

Get list of followers for this idea

Returns the list of followers

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long ideaId = 789L; // Long | ideaId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseUserList result = apiInstance.getIdeaFollowers(ideaId, start, end, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getIdeaFollowers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ideaId** | **Long**| ideaId |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseUserList**](VerveResponseUserList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdeaRatingParameters"></a>
# **getIdeaRatingParameters**
> VerveResponseString getIdeaRatingParameters(userId, ideaStage, loggedInUserId, accessToken, clientToken)

Get rating parameters of idea by user

Return the rating parameters of idea by user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long userId = 789L; // Long | user Id
String ideaStage = "ideaStage_example"; // String | Idea stages<br/>1)under-consideration <br/>2) shortlisted <br/>3) accepted <br/>4) prototyping
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseString result = apiInstance.getIdeaRatingParameters(userId, ideaStage, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getIdeaRatingParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| user Id |
 **ideaStage** | **String**| Idea stages&lt;br/&gt;1)under-consideration &lt;br/&gt;2) shortlisted &lt;br/&gt;3) accepted &lt;br/&gt;4) prototyping |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseString**](VerveResponseString.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdeaRatings"></a>
# **getIdeaRatings**
> VerveResponseIdeaUserRatingList getIdeaRatings(userId, ideaId, ideaStage, loggedInUserId, accessToken, clientToken)

Get list of ideas that are rated by user 

Return the rated ideas list

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long userId = 789L; // Long | user Id
Long ideaId = 789L; // Long | idea Id
String ideaStage = "ideaStage_example"; // String | Idea stages<br/>1)under-consideration <br/>2) shortlisted <br/>3) accepted <br/>4) prototyping
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseIdeaUserRatingList result = apiInstance.getIdeaRatings(userId, ideaId, ideaStage, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getIdeaRatings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| user Id |
 **ideaId** | **Long**| idea Id |
 **ideaStage** | **String**| Idea stages&lt;br/&gt;1)under-consideration &lt;br/&gt;2) shortlisted &lt;br/&gt;3) accepted &lt;br/&gt;4) prototyping |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseIdeaUserRatingList**](VerveResponseIdeaUserRatingList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendIdeas"></a>
# **getRecommendIdeas**
> VerveResponseIdeaList getRecommendIdeas(start, end, loggedInUserId, accessToken, clientToken, fields)

Get the list of recommended ideas

Returns the list of recommended ideas 

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdeaList result = apiInstance.getRecommendIdeas(start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getRecommendIdeas");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTopIdeas"></a>
# **getTopIdeas**
> VerveResponseIdeaList getTopIdeas(start, end, loggedInUserId, accessToken, clientToken, fields)

Get the list of top ideas

Return the list of top ideas

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdeaList result = apiInstance.getTopIdeas(start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getTopIdeas");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserIdeas"></a>
# **getUserIdeas**
> VerveResponseIdeaList getUserIdeas(userId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of ideas shared by user

Returns the list of ideas shared by user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long userId = 789L; // Long | userId whose ideas you need
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdeaList result = apiInstance.getUserIdeas(userId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getUserIdeas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId whose ideas you need |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserRateIdeas"></a>
# **getUserRateIdeas**
> VerveResponseIdeaList getUserRateIdeas(userId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of ideas rated by user

Return the list of ideas rated by user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long userId = 789L; // Long | userId whose ideas you need
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdeaList result = apiInstance.getUserRateIdeas(userId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getUserRateIdeas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId whose ideas you need |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rateIdea"></a>
# **rateIdea**
> VerveResponseIdea rateIdea(userId, ideaId, ideaStage, loggedInUserId, accessToken, clientToken, fields)

Rate an idea

Allows the user to rate an idea. Returns the rated idea

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long userId = 789L; // Long | user Id
Long ideaId = 789L; // Long | idea Id
String ideaStage = "ideaStage_example"; // String | Ideas stage<br/>1)under-consideration <br/>2) shortlisted <br/>3) accepted <br/>4) prototyping
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdea result = apiInstance.rateIdea(userId, ideaId, ideaStage, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#rateIdea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| user Id |
 **ideaId** | **Long**| idea Id |
 **ideaStage** | **String**| Ideas stage&lt;br/&gt;1)under-consideration &lt;br/&gt;2) shortlisted &lt;br/&gt;3) accepted &lt;br/&gt;4) prototyping |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="rateIdea_0"></a>
# **rateIdea_0**
> VerveResponseIdea rateIdea_0(userId, ideaId, ideaStage, parameter, rating, loggedInUserId, accessToken, clientToken, fields)

Give rating on idea

Allows the user to give a rating on idea. Returns the rated idea

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long userId = 789L; // Long | user Id
Long ideaId = 789L; // Long | idea Id
String ideaStage = "ideaStage_example"; // String | Idea stages<br/>1)under-consideration <br/>2) shortlisted <br/>3) accepted <br/>4) prototyping
String parameter = "parameter_example"; // String | parameter
Double rating = 3.4D; // Double | rating
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdea result = apiInstance.rateIdea_0(userId, ideaId, ideaStage, parameter, rating, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#rateIdea_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| user Id |
 **ideaId** | **Long**| idea Id |
 **ideaStage** | **String**| Idea stages&lt;br/&gt;1)under-consideration &lt;br/&gt;2) shortlisted &lt;br/&gt;3) accepted &lt;br/&gt;4) prototyping |
 **parameter** | **String**| parameter |
 **rating** | **Double**| rating |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchIdeas"></a>
# **searchIdeas**
> VerveResponseIdeaList searchIdeas(searchText, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of matching ideas

Returns the list of matching ideas

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
String searchText = "searchText_example"; // String | Enter text to be searched
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdeaList result = apiInstance.searchIdeas(searchText, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#searchIdeas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchText** | **String**| Enter text to be searched |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="shareFormIdea"></a>
# **shareFormIdea**
> VerveResponseIdea shareFormIdea(body, body2, body3, body4, loggedInUserId, accessToken, clientToken)

Share Idea with attachments

Allows the user to share idea with attachments

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
String body = "body_example"; // String | title
String body2 = "body_example"; // String | description
Long body3 = 789L; // Long | groupId
List<Attachment> body4 = Arrays.asList(new Attachment()); // List<Attachment> | attachments
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseIdea result = apiInstance.shareFormIdea(body, body2, body3, body4, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#shareFormIdea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| title |
 **body2** | **String**| description |
 **body3** | **Long**| groupId |
 **body4** | [**List&lt;Attachment&gt;**](Attachment.md)| attachments |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="shareIdea"></a>
# **shareIdea**
> VerveResponseIdea shareIdea(title, description, groupId, loggedInUserId, accessToken, clientToken)

Share idea  

Allows the user to share idea. Returns the shared idea

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
String title = "title_example"; // String | title
String description = "description_example"; // String | description
Long groupId = 789L; // Long | group Id
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseIdea result = apiInstance.shareIdea(title, description, groupId, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#shareIdea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **String**| title |
 **description** | **String**| description |
 **groupId** | **Long**| group Id |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="shareIdeaComment"></a>
# **shareIdeaComment**
> VerveResponseComment shareIdeaComment(ideaId, commentText, loggedInUserId, accessToken, clientToken)

Comment on shared idea

Allows the user to comment on shared idea. Returns the comment

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long ideaId = 789L; // Long | idea Id
String commentText = "commentText_example"; // String | comment text
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseComment result = apiInstance.shareIdeaComment(ideaId, commentText, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#shareIdeaComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ideaId** | **Long**| idea Id |
 **commentText** | **String**| comment text |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseComment**](VerveResponseComment.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="unfollowIdea"></a>
# **unfollowIdea**
> VerveResponseIdea unfollowIdea(ideaId, loggedInUserId, accessToken, clientToken, fields)

Unfollow idea

Allows the user to unfollow idea. Returns the unfollowed idea

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long ideaId = 789L; // Long | idea Id
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdea result = apiInstance.unfollowIdea(ideaId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#unfollowIdea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ideaId** | **Long**| idea Id |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="updateCommet"></a>
# **updateCommet**
> VerveResponseComment updateCommet(commentId, commentText, loggedInUserId, accessToken, clientToken)

Update comment

Allows the user to update comment. Returns the updated comment

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long commentId = 789L; // Long | commentId
String commentText = "commentText_example"; // String | Comment text
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseComment result = apiInstance.updateCommet(commentId, commentText, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#updateCommet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **Long**| commentId |
 **commentText** | **String**| Comment text |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseComment**](VerveResponseComment.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateIdea"></a>
# **updateIdea**
> VerveResponseIdea updateIdea(ideaId, ideaTitle, ideaDescription, loggedInUserId, accessToken, clientToken, fields)

Update idea

Allows the user to update idea. Returns the updated idea

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.IdeaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

IdeaApi apiInstance = new IdeaApi();
Long ideaId = 789L; // Long | ideaId
String ideaTitle = "ideaTitle_example"; // String | Idea Title
String ideaDescription = "ideaDescription_example"; // String | Describe Idea
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdea result = apiInstance.updateIdea(ideaId, ideaTitle, ideaDescription, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#updateIdea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ideaId** | **Long**| ideaId |
 **ideaTitle** | **String**| Idea Title |
 **ideaDescription** | **String**| Describe Idea |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)ideaDescription&lt;br/&gt;4)ideaCreationDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)ideaId&lt;br/&gt;2)ideaTitle&lt;br/&gt;3)group&lt;br/&gt;4)ideaDescription&lt;br/&gt;5)ideator&lt;br/&gt;6)ideaCreationDate&lt;br/&gt;7)lastModifiedDate&lt;br/&gt;8)ideaStage&lt;br/&gt;9)domain&lt;br/&gt;10)technology&lt;br/&gt;11)accessType&lt;br/&gt;12)videoId&lt;br/&gt;13)activeStatus&lt;br/&gt;14)teamStatus&lt;br/&gt;15)projectStatus&lt;br/&gt;16)totalFollowers&lt;br/&gt;17)totalComments&lt;br/&gt;18)totalBlogs&lt;br/&gt;19)averageRatingScore&lt;br/&gt;20)numberOfRatings&lt;br/&gt;21)currentUserFollowing&lt;br/&gt;22)currentUserRating&lt;br/&gt;23)ideaFileURL&lt;br/&gt;24)sentiment&lt;/br&gt;25)entity | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

