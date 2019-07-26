# GroupApi

All URIs are relative to *https://api.iengage.io:8243/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGroup**](GroupApi.md#createGroup) | **POST** /groups | Create group
[**deleteGroup**](GroupApi.md#deleteGroup) | **DELETE** /groups/{groupId} | Delete group
[**followGroup**](GroupApi.md#followGroup) | **POST** /groups/{groupId}/follow | Follow group
[**getGroupFollowers**](GroupApi.md#getGroupFollowers) | **GET** /groups/{groupId}/followers | Get the list of followers for the group
[**getGroupIdeas**](GroupApi.md#getGroupIdeas) | **GET** /groups/{groupId}/ideas | Get list of all ideas in a group
[**getGroups**](GroupApi.md#getGroups) | **GET** /groups | Get the list of groups visible for user
[**getRecommendationGroup**](GroupApi.md#getRecommendationGroup) | **GET** /groups/recommend | Get list of recommended groups
[**getUserFollowingGroups**](GroupApi.md#getUserFollowingGroups) | **GET** /groups/{userId}/following | Get list of groups that a user is following
[**searchGroups**](GroupApi.md#searchGroups) | **GET** /groups/search | Get list of matching groups
[**unfollowGroup**](GroupApi.md#unfollowGroup) | **POST** /groups/{groupId}/unfollow | Unfollow group
[**updateGroup**](GroupApi.md#updateGroup) | **PUT** /groups/{groupId} | Update group


<a name="createGroup"></a>
# **createGroup**
> VerveResponseGroup createGroup(requesterId, clientToken, body, accessToken)

Create group

This service allows a user to create a group. The following fields(key:value) are required to be present in the Group JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API. **Required fields**      1. association      2. groupName      3. description      4. managerId [1,2,..]      5. accessType

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Group body = new Group(); // Group | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseGroup result = apiInstance.createGroup(requesterId, clientToken, body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#createGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body** | [**Group**](Group.md)|  | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseGroup**](VerveResponseGroup.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteGroup"></a>
# **deleteGroup**
> VerveResponseGroup deleteGroup(groupId, requesterId, clientToken, fields, accessToken)

Delete group

Allows the user to delete a group. Returns the deleted group

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
Long groupId = 789L; // Long | groupId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseGroup result = apiInstance.deleteGroup(groupId, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#deleteGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/ | [optional] [default to groupId,groupName,description,startDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseGroup**](VerveResponseGroup.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="followGroup"></a>
# **followGroup**
> VerveResponseGroup followGroup(groupId, requesterId, clientToken, fields, accessToken)

Follow group

Allows the user to follow a group. Returns the followed group

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
Long groupId = 789L; // Long | groupId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseGroup result = apiInstance.followGroup(groupId, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#followGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/ | [optional] [default to groupId,groupName,description,startDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseGroup**](VerveResponseGroup.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getGroupFollowers"></a>
# **getGroupFollowers**
> VerveResponseUserList getGroupFollowers(groupId, start, end, requesterId, clientToken, fields, accessToken)

Get the list of followers for the group

Returns the list of followers for the group

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
Long groupId = 789L; // Long | groupId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "userId,firstName,lastName,profileImage"; // String | Filter fields in result list        /_*   **A) Default values -**        1)userId       2)firstName       3)lastName       4)profileImage        **A) Available values-**       1)userId       2)firstName       3)lastName       4)emailId       5)profileImage       6)birthDate        *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseUserList result = apiInstance.getGroupFollowers(groupId, start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getGroupFollowers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)userId       2)firstName       3)lastName       4)profileImage        **A) Available values-**       1)userId       2)firstName       3)lastName       4)emailId       5)profileImage       6)birthDate        *_/ | [optional] [default to userId,firstName,lastName,profileImage]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseUserList**](VerveResponseUserList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupIdeas"></a>
# **getGroupIdeas**
> VerveResponseIdeaList getGroupIdeas(groupId, start, end, requesterId, clientToken, fields, accessToken)

Get list of all ideas in a group

Returns the list of all ideas in a group

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
Long groupId = 789L; // Long | groupId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list       /_*   **A) Default values-**      1)ideaId       2)ideaTitle       3)ideaDescription       4)ideaCreationDate        **A) Available values-**        1)ideaId       2)ideaTitle       3)group       4)ideaDescription       5)ideator       6)ideaCreationDate       7)lastModifiedDate       8)ideaStage       9)domain       10)technology       11)accessType       12)videoId       13)activeStatus       14)teamStatus       15)projectStatus       16)totalFollowers       17)totalComments       18)totalBlogs       19)averageRatingScore       20)numberOfRatings       21)currentUserFollowing       22)currentUserRating       23)ideaFileURL       24)sentiment       25)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseIdeaList result = apiInstance.getGroupIdeas(groupId, start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getGroupIdeas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
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

<a name="getGroups"></a>
# **getGroups**
> VerveResponseGroupList getGroups(start, end, requesterId, clientToken, fields, accessToken)

Get the list of groups visible for user

Returns the list of groups

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseGroupList result = apiInstance.getGroups(start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getGroups");
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
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/ | [optional] [default to groupId,groupName,description,startDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseGroupList**](VerveResponseGroupList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendationGroup"></a>
# **getRecommendationGroup**
> VerveResponseGroupList getRecommendationGroup(start, end, requesterId, clientToken, fields, accessToken)

Get list of recommended groups

Returns the list of recommended groups

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseGroupList result = apiInstance.getRecommendationGroup(start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getRecommendationGroup");
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
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/ | [optional] [default to groupId,groupName,description,startDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseGroupList**](VerveResponseGroupList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserFollowingGroups"></a>
# **getUserFollowingGroups**
> VerveResponseGroupList getUserFollowingGroups(userId, start, end, requesterId, clientToken, fields, accessToken)

Get list of groups that a user is following

Returns the list of groups the user is following

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
Long userId = 789L; // Long | User Id whose groups want to get.
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseGroupList result = apiInstance.getUserFollowingGroups(userId, start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getUserFollowingGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id whose groups want to get. |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/ | [optional] [default to groupId,groupName,description,startDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseGroupList**](VerveResponseGroupList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchGroups"></a>
# **searchGroups**
> VerveResponseGroupList searchGroups(query, start, end, requesterId, clientToken, fields, accessToken)

Get list of matching groups

Returns the list of matching group

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
String query = "query_example"; // String | query
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseGroupList result = apiInstance.searchGroups(query, start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#searchGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| query |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/ | [optional] [default to groupId,groupName,description,startDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseGroupList**](VerveResponseGroupList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unfollowGroup"></a>
# **unfollowGroup**
> VerveResponseGroup unfollowGroup(groupId, requesterId, clientToken, fields, accessToken)

Unfollow group

Allows the user to unfollow a group. Returns the unfollowed group

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
Long groupId = 789L; // Long | groupId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseGroup result = apiInstance.unfollowGroup(groupId, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#unfollowGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/ | [optional] [default to groupId,groupName,description,startDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseGroup**](VerveResponseGroup.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateGroup"></a>
# **updateGroup**
> VerveResponseGroup updateGroup(groupId, title, description, requesterId, clientToken, fields, accessToken)

Update group

Allows the user to update the group. Returns the updated group

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
Long groupId = 789L; // Long | groupId
String title = "title_example"; // String | title
String description = "description_example"; // String | description
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseGroup result = apiInstance.updateGroup(groupId, title, description, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#updateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **title** | **String**| title |
 **description** | **String**| description |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)groupId       2)groupName       3)description       4)startDate        **A) Available values-**        1)groupId       2)groupName       3)description       4)startDate       5)ideasCount       6)followersCount       7)currentUserFollowing       8)dueDate       9)participantsCount       10)friendsParticipantsCount       11)friendsIdeasCount   *_/ | [optional] [default to groupId,groupName,description,startDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseGroup**](VerveResponseGroup.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

