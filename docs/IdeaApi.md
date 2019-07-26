# IdeaApi

All URIs are relative to *https://api.iengage.io:8243/api/2.0*

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
> VerveResponseComment deleteComment(commentId, requesterId, clientToken, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseComment result = apiInstance.deleteComment(commentId, requesterId, clientToken, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseComment**](VerveResponseComment.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteIdea"></a>
# **deleteIdea**
> VerveResponseIdea deleteIdea(ideaId, requesterId, clientToken, file, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
File file = new File("/path/to/file.txt"); // File | file
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdea result = apiInstance.deleteIdea(ideaId, requesterId, clientToken, file, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **file** | **File**| file |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="followIdea"></a>
# **followIdea**
> VerveResponseIdea followIdea(ideaId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdea result = apiInstance.followIdea(ideaId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getAllIdeas"></a>
# **getAllIdeas**
> VerveResponseIdeaList getAllIdeas(start, end, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdeaList result = apiInstance.getAllIdeas(start, end, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFollowingIdeas"></a>
# **getFollowingIdeas**
> VerveResponseIdeaList getFollowingIdeas(userId, start, end, requesterId, clientToken, fields, accessToken)

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
Long userId = 789L; // Long | User Id whose followed ideas want to get.
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdeaList result = apiInstance.getFollowingIdeas(userId, start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getFollowingIdeas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id whose followed ideas want to get. |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupIdeas"></a>
# **getGroupIdeas**
> VerveResponseIdeaList getGroupIdeas(userId, groupId, start, end, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdeaList result = apiInstance.getGroupIdeas(userId, groupId, start, end, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdea"></a>
# **getIdea**
> VerveResponseIdea getIdea(ideaId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdea result = apiInstance.getIdea(ideaId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdeaComment"></a>
# **getIdeaComment**
> VerveResponseCommentList getIdeaComment(ideaId, start, end, requesterId, clientToken, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseCommentList result = apiInstance.getIdeaComment(ideaId, start, end, requesterId, clientToken, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseCommentList**](VerveResponseCommentList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdeaFollowers"></a>
# **getIdeaFollowers**
> VerveResponseUserList getIdeaFollowers(ideaId, start, end, requesterId, clientToken, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseUserList result = apiInstance.getIdeaFollowers(ideaId, start, end, requesterId, clientToken, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseUserList**](VerveResponseUserList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdeaRatingParameters"></a>
# **getIdeaRatingParameters**
> VerveResponseString getIdeaRatingParameters(userId, ideaStage, requesterId, clientToken, accessToken)

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
String ideaStage = "ideaStage_example"; // String |  /_* Idea stages     1)under-consideration      2) shortlisted      3) accepted      4) prototyping  *_/
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseString result = apiInstance.getIdeaRatingParameters(userId, ideaStage, requesterId, clientToken, accessToken);
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
 **ideaStage** | **String**|  /_* Idea stages     1)under-consideration      2) shortlisted      3) accepted      4) prototyping  *_/ |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseString**](VerveResponseString.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdeaRatings"></a>
# **getIdeaRatings**
> VerveResponseIdeaUserRatingList getIdeaRatings(userId, ideaId, ideaStage, requesterId, clientToken, accessToken)

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
String ideaStage = "ideaStage_example"; // String |  /_* Idea stages     1)under-consideration      2) shortlisted      3) accepted      4) prototyping  *_/
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdeaUserRatingList result = apiInstance.getIdeaRatings(userId, ideaId, ideaStage, requesterId, clientToken, accessToken);
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
 **ideaStage** | **String**|  /_* Idea stages     1)under-consideration      2) shortlisted      3) accepted      4) prototyping  *_/ |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdeaUserRatingList**](VerveResponseIdeaUserRatingList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendIdeas"></a>
# **getRecommendIdeas**
> VerveResponseIdeaList getRecommendIdeas(start, end, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdeaList result = apiInstance.getRecommendIdeas(start, end, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTopIdeas"></a>
# **getTopIdeas**
> VerveResponseIdeaList getTopIdeas(start, end, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdeaList result = apiInstance.getTopIdeas(start, end, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserIdeas"></a>
# **getUserIdeas**
> VerveResponseIdeaList getUserIdeas(userId, start, end, requesterId, clientToken, fields, accessToken)

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
Long userId = 789L; // Long | userId whose shared ideas want to get
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdeaList result = apiInstance.getUserIdeas(userId, start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getUserIdeas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId whose shared ideas want to get |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserRateIdeas"></a>
# **getUserRateIdeas**
> VerveResponseIdeaList getUserRateIdeas(userId, start, end, requesterId, clientToken, fields, accessToken)

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
Long userId = 789L; // Long | userId whose rated ideas want to get
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdeaList result = apiInstance.getUserRateIdeas(userId, start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#getUserRateIdeas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId whose rated ideas want to get |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rateIdea"></a>
# **rateIdea**
> VerveResponseIdea rateIdea(userId, ideaId, ideaStage, requesterId, clientToken, fields, accessToken)

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
String ideaStage = "ideaStage_example"; // String |  /_* Ideas stage      1)under-consideration      2) shortlisted      3) accepted      4) prototyping  *_/
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdea result = apiInstance.rateIdea(userId, ideaId, ideaStage, requesterId, clientToken, fields, accessToken);
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
 **ideaStage** | **String**|  /_* Ideas stage      1)under-consideration      2) shortlisted      3) accepted      4) prototyping  *_/ |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="rateIdea_0"></a>
# **rateIdea_0**
> VerveResponseIdea rateIdea_0(userId, ideaId, ideaStage, parameter, rating, requesterId, clientToken, fields, accessToken)

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
String ideaStage = "ideaStage_example"; // String |  /_* Idea stages      1)under-consideration      2) shortlisted      3) accepted      4) prototyping  *_/
String parameter = "parameter_example"; // String | parameter
Double rating = 3.4D; // Double | rating
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdea result = apiInstance.rateIdea_0(userId, ideaId, ideaStage, parameter, rating, requesterId, clientToken, fields, accessToken);
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
 **ideaStage** | **String**|  /_* Idea stages      1)under-consideration      2) shortlisted      3) accepted      4) prototyping  *_/ |
 **parameter** | **String**| parameter |
 **rating** | **Double**| rating |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchIdeas"></a>
# **searchIdeas**
> VerveResponseIdeaList searchIdeas(searchText, start, end, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdeaList result = apiInstance.searchIdeas(searchText, start, end, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdeaList**](VerveResponseIdeaList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="shareFormIdea"></a>
# **shareFormIdea**
> VerveResponseIdea shareFormIdea(title, description, groupId, file, loggedInUserId, accessToken, clientToken)

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
String title = "title_example"; // String | title
String description = "description_example"; // String | description
String groupId = "groupId_example"; // String | groupId
File file = new File("/path/to/file.txt"); // File | file
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseIdea result = apiInstance.shareFormIdea(title, description, groupId, file, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#shareFormIdea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **String**| title |
 **description** | **String**| description |
 **groupId** | **String**| groupId |
 **file** | **File**| file |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="shareIdea"></a>
# **shareIdea**
> VerveResponseIdea shareIdea(requesterId, clientToken, body, accessToken)

Share idea  

This service allows a user to share a idea. The following fields(key:value) are required to be present in the Idea JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API.  /_*  **Required fields**      1. ideaTitle      2. ideaDescription      3. group: { groupId }  *_/

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Idea body = new Idea(); // Idea | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdea result = apiInstance.shareIdea(requesterId, clientToken, body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdeaApi#shareIdea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body** | [**Idea**](Idea.md)|  | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="shareIdeaComment"></a>
# **shareIdeaComment**
> VerveResponseComment shareIdeaComment(ideaId, requesterId, clientToken, body, accessToken)

Comment on shared idea

This service allows a user to comment on a idea. The following fields(key:value) are required to be present in the Comment JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API. /_* **Required fields**     1. ideaId (Path Parameter)     2. commentText  *_/

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Comment body = new Comment(); // Comment | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseComment result = apiInstance.shareIdeaComment(ideaId, requesterId, clientToken, body, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body** | [**Comment**](Comment.md)|  | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseComment**](VerveResponseComment.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="unfollowIdea"></a>
# **unfollowIdea**
> VerveResponseIdea unfollowIdea(ideaId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdea result = apiInstance.unfollowIdea(ideaId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateCommet"></a>
# **updateCommet**
> VerveResponseComment updateCommet(commentId, commentText, requesterId, clientToken, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseComment result = apiInstance.updateCommet(commentId, commentText, requesterId, clientToken, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseComment**](VerveResponseComment.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateIdea"></a>
# **updateIdea**
> VerveResponseIdea updateIdea(ideaId, ideaTitle, ideaDescription, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdea result = apiInstance.updateIdea(ideaId, ideaTitle, ideaDescription, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/ | [optional] [default to ideaId,ideaTitle,ideaDescription,ideaCreationDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseIdea**](VerveResponseIdea.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

