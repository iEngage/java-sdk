# GroupApi

All URIs are relative to *https://api.iengage.io:8243/api/1.0*

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
> VerveResponseGroup createGroup(organizationId, title, description, managerId, accessType, loggedInUserId, accessToken, clientToken)

Create group

Allows the uer to create a group. Returns the created group

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
Long organizationId = 789L; // Long | organization Id
String title = "title_example"; // String | title
String description = "description_example"; // String | description
Long managerId = 789L; // Long | managerId
String accessType = "accessType_example"; // String | accessType<br>1)open<br>2)restricted
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseGroup result = apiInstance.createGroup(organizationId, title, description, managerId, accessType, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#createGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organization Id |
 **title** | **String**| title |
 **description** | **String**| description |
 **managerId** | **Long**| managerId |
 **accessType** | **String**| accessType&lt;br&gt;1)open&lt;br&gt;2)restricted |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseGroup**](VerveResponseGroup.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteGroup"></a>
# **deleteGroup**
> VerveResponseGroup deleteGroup(groupId, loggedInUserId, accessToken, clientToken, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/><b>A) Available values-</b><br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/>5)ideasCount<br/>6)followersCount<br/>7)currentUserFollowing<br/>8)dueDate<br/>9)participantsCount<br/>10)friendsParticipantsCount<br/>11)friendsIdeasCount
try {
    VerveResponseGroup result = apiInstance.deleteGroup(groupId, loggedInUserId, accessToken, clientToken, fields);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;5)ideasCount&lt;br/&gt;6)followersCount&lt;br/&gt;7)currentUserFollowing&lt;br/&gt;8)dueDate&lt;br/&gt;9)participantsCount&lt;br/&gt;10)friendsParticipantsCount&lt;br/&gt;11)friendsIdeasCount | [optional] [default to groupId,groupName,description,startDate]

### Return type

[**VerveResponseGroup**](VerveResponseGroup.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="followGroup"></a>
# **followGroup**
> VerveResponseGroup followGroup(groupId, loggedInUserId, accessToken, clientToken, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/><b>A) Available values-</b><br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/>5)ideasCount<br/>6)followersCount<br/>7)currentUserFollowing<br/>8)dueDate<br/>9)participantsCount<br/>10)friendsParticipantsCount<br/>11)friendsIdeasCount
try {
    VerveResponseGroup result = apiInstance.followGroup(groupId, loggedInUserId, accessToken, clientToken, fields);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;5)ideasCount&lt;br/&gt;6)followersCount&lt;br/&gt;7)currentUserFollowing&lt;br/&gt;8)dueDate&lt;br/&gt;9)participantsCount&lt;br/&gt;10)friendsParticipantsCount&lt;br/&gt;11)friendsIdeasCount | [optional] [default to groupId,groupName,description,startDate]

### Return type

[**VerveResponseGroup**](VerveResponseGroup.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getGroupFollowers"></a>
# **getGroupFollowers**
> VerveResponseUserList getGroupFollowers(groupId, start, end, loggedInUserId, accessToken, clientToken, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "userId,firstName,lastName,profileImage"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)userId<br/>2)firstName<br/>3)lastName<br/>4)profileImage<br/><b>A) Available values-</b><br/>1)userId<br/>2)firstName<br/>3)lastName<br/>4)emailId<br/>5)profileImage<br/>6)birthDate<br/>7)currentUserFollowing<br/>8)currentUserFriend<br/>9)equityScore
try {
    VerveResponseUserList result = apiInstance.getGroupFollowers(groupId, start, end, loggedInUserId, accessToken, clientToken, fields);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)userId&lt;br/&gt;2)firstName&lt;br/&gt;3)lastName&lt;br/&gt;4)profileImage&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)userId&lt;br/&gt;2)firstName&lt;br/&gt;3)lastName&lt;br/&gt;4)emailId&lt;br/&gt;5)profileImage&lt;br/&gt;6)birthDate&lt;br/&gt;7)currentUserFollowing&lt;br/&gt;8)currentUserFriend&lt;br/&gt;9)equityScore | [optional] [default to userId,firstName,lastName,profileImage]

### Return type

[**VerveResponseUserList**](VerveResponseUserList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupIdeas"></a>
# **getGroupIdeas**
> VerveResponseIdeaList getGroupIdeas(groupId, start, end, loggedInUserId, accessToken, clientToken, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "ideaId,ideaTitle,ideaDescription,ideaCreationDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)ideaId<br/>2)ideaTitle<br/>3)ideaDescription<br/>4)ideaCreationDate<br/><b>A) Available values-</b><br/>1)ideaId<br/>2)ideaTitle<br/>3)group<br/>4)ideaDescription<br/>5)ideator<br/>6)ideaCreationDate<br/>7)lastModifiedDate<br/>8)ideaStage<br/>9)domain<br/>10)technology<br/>11)accessType<br/>12)videoId<br/>13)activeStatus<br/>14)teamStatus<br/>15)projectStatus<br/>16)totalFollowers<br/>17)totalComments<br/>18)totalBlogs<br/>19)averageRatingScore<br/>20)numberOfRatings<br/>21)currentUserFollowing<br/>22)currentUserRating<br/>23)ideaFileURL<br/>24)sentiment</br>25)entity
try {
    VerveResponseIdeaList result = apiInstance.getGroupIdeas(groupId, start, end, loggedInUserId, accessToken, clientToken, fields);
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

<a name="getGroups"></a>
# **getGroups**
> VerveResponseGroupList getGroups(start, end, loggedInUserId, accessToken, clientToken, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/><b>A) Available values-</b><br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/>5)ideasCount<br/>6)followersCount<br/>7)currentUserFollowing<br/>8)dueDate<br/>9)participantsCount<br/>10)friendsParticipantsCount<br/>11)friendsIdeasCount
try {
    VerveResponseGroupList result = apiInstance.getGroups(start, end, loggedInUserId, accessToken, clientToken, fields);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;5)ideasCount&lt;br/&gt;6)followersCount&lt;br/&gt;7)currentUserFollowing&lt;br/&gt;8)dueDate&lt;br/&gt;9)participantsCount&lt;br/&gt;10)friendsParticipantsCount&lt;br/&gt;11)friendsIdeasCount | [optional] [default to groupId,groupName,description,startDate]

### Return type

[**VerveResponseGroupList**](VerveResponseGroupList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendationGroup"></a>
# **getRecommendationGroup**
> VerveResponseGroupList getRecommendationGroup(start, end, loggedInUserId, accessToken, clientToken, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/><b>A) Available values-</b><br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/>5)ideasCount<br/>6)followersCount<br/>7)currentUserFollowing<br/>8)dueDate<br/>9)participantsCount<br/>10)friendsParticipantsCount<br/>11)friendsIdeasCount
try {
    VerveResponseGroupList result = apiInstance.getRecommendationGroup(start, end, loggedInUserId, accessToken, clientToken, fields);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;5)ideasCount&lt;br/&gt;6)followersCount&lt;br/&gt;7)currentUserFollowing&lt;br/&gt;8)dueDate&lt;br/&gt;9)participantsCount&lt;br/&gt;10)friendsParticipantsCount&lt;br/&gt;11)friendsIdeasCount | [optional] [default to groupId,groupName,description,startDate]

### Return type

[**VerveResponseGroupList**](VerveResponseGroupList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserFollowingGroups"></a>
# **getUserFollowingGroups**
> VerveResponseGroupList getUserFollowingGroups(userId, start, end, loggedInUserId, accessToken, clientToken, fields)

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
Long userId = 789L; // Long | userId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/><b>A) Available values-</b><br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/>5)ideasCount<br/>6)followersCount<br/>7)currentUserFollowing<br/>8)dueDate<br/>9)participantsCount<br/>10)friendsParticipantsCount<br/>11)friendsIdeasCount
try {
    VerveResponseGroupList result = apiInstance.getUserFollowingGroups(userId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getUserFollowingGroups");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;5)ideasCount&lt;br/&gt;6)followersCount&lt;br/&gt;7)currentUserFollowing&lt;br/&gt;8)dueDate&lt;br/&gt;9)participantsCount&lt;br/&gt;10)friendsParticipantsCount&lt;br/&gt;11)friendsIdeasCount | [optional] [default to groupId,groupName,description,startDate]

### Return type

[**VerveResponseGroupList**](VerveResponseGroupList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchGroups"></a>
# **searchGroups**
> VerveResponseGroupList searchGroups(query, start, end, loggedInUserId, accessToken, clientToken, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/><b>A) Available values-</b><br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/>5)ideasCount<br/>6)followersCount<br/>7)currentUserFollowing<br/>8)dueDate<br/>9)participantsCount<br/>10)friendsParticipantsCount<br/>11)friendsIdeasCount
try {
    VerveResponseGroupList result = apiInstance.searchGroups(query, start, end, loggedInUserId, accessToken, clientToken, fields);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;5)ideasCount&lt;br/&gt;6)followersCount&lt;br/&gt;7)currentUserFollowing&lt;br/&gt;8)dueDate&lt;br/&gt;9)participantsCount&lt;br/&gt;10)friendsParticipantsCount&lt;br/&gt;11)friendsIdeasCount | [optional] [default to groupId,groupName,description,startDate]

### Return type

[**VerveResponseGroupList**](VerveResponseGroupList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unfollowGroup"></a>
# **unfollowGroup**
> VerveResponseGroup unfollowGroup(groupId, loggedInUserId, accessToken, clientToken, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/><b>A) Available values-</b><br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/>5)ideasCount<br/>6)followersCount<br/>7)currentUserFollowing<br/>8)dueDate<br/>9)participantsCount<br/>10)friendsParticipantsCount<br/>11)friendsIdeasCount
try {
    VerveResponseGroup result = apiInstance.unfollowGroup(groupId, loggedInUserId, accessToken, clientToken, fields);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;5)ideasCount&lt;br/&gt;6)followersCount&lt;br/&gt;7)currentUserFollowing&lt;br/&gt;8)dueDate&lt;br/&gt;9)participantsCount&lt;br/&gt;10)friendsParticipantsCount&lt;br/&gt;11)friendsIdeasCount | [optional] [default to groupId,groupName,description,startDate]

### Return type

[**VerveResponseGroup**](VerveResponseGroup.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateGroup"></a>
# **updateGroup**
> VerveResponseGroup updateGroup(groupId, title, description, loggedInUserId, accessToken, clientToken, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "groupId,groupName,description,startDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/><b>A) Available values-</b><br/>1)groupId<br/>2)groupName<br/>3)description<br/>4)startDate<br/>5)ideasCount<br/>6)followersCount<br/>7)currentUserFollowing<br/>8)dueDate<br/>9)participantsCount<br/>10)friendsParticipantsCount<br/>11)friendsIdeasCount
try {
    VerveResponseGroup result = apiInstance.updateGroup(groupId, title, description, loggedInUserId, accessToken, clientToken, fields);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)groupId&lt;br/&gt;2)groupName&lt;br/&gt;3)description&lt;br/&gt;4)startDate&lt;br/&gt;5)ideasCount&lt;br/&gt;6)followersCount&lt;br/&gt;7)currentUserFollowing&lt;br/&gt;8)dueDate&lt;br/&gt;9)participantsCount&lt;br/&gt;10)friendsParticipantsCount&lt;br/&gt;11)friendsIdeasCount | [optional] [default to groupId,groupName,description,startDate]

### Return type

[**VerveResponseGroup**](VerveResponseGroup.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

