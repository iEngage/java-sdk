# SocialApi

All URIs are relative to *https://api.iengage.io:8243/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFriend**](SocialApi.md#addFriend) | **POST** /social/friends/add | Add Friend
[**confirmFriendRequest**](SocialApi.md#confirmFriendRequest) | **POST** /social/friends/request/action | confirm/ignore friend request
[**follow**](SocialApi.md#follow) | **POST** /social/follow | Follow user
[**getUser**](SocialApi.md#getUser) | **GET** /social/users/{userId} | Get user by id 
[**getUserDetail**](SocialApi.md#getUserDetail) | **GET** /social/userDetail | Get user details 
[**getUserFollowers**](SocialApi.md#getUserFollowers) | **GET** /social/followers/{userId} | Get list of followers
[**getUserFollowing**](SocialApi.md#getUserFollowing) | **GET** /social/following/{userId} | Get list of users that are being followed
[**getUserFriends**](SocialApi.md#getUserFriends) | **GET** /social/friends{userId} | Get list of friends
[**removeFriend**](SocialApi.md#removeFriend) | **POST** /social/friends/remove | Remove friend 
[**requestFriend**](SocialApi.md#requestFriend) | **POST** /social/friends/request | Send friend request
[**requestsForMe**](SocialApi.md#requestsForMe) | **GET** /social/friends/request | Get list of friend requests
[**unfollow**](SocialApi.md#unfollow) | **POST** /social/unfollow | Unfollow user


<a name="addFriend"></a>
# **addFriend**
> Boolean addFriend(id1, id2, requesterId, clientToken, accessToken)

Add Friend

Allows the user to add friend. Returns true if successful

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

SocialApi apiInstance = new SocialApi();
String id1 = "id1_example"; // String | Enter userId/mailId of the person who wants to add a friend
String id2 = "id2_example"; // String | Enter userId /mailId you want to add in friend list
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    Boolean result = apiInstance.addFriend(id1, id2, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#addFriend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id1** | **String**| Enter userId/mailId of the person who wants to add a friend |
 **id2** | **String**| Enter userId /mailId you want to add in friend list |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

**Boolean**

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="confirmFriendRequest"></a>
# **confirmFriendRequest**
> Boolean confirmFriendRequest(userId, status, requesterId, clientToken, accessToken)

confirm/ignore friend request

Allows the user to confirm/ignore friend request. Returns true if successful

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

SocialApi apiInstance = new SocialApi();
Long userId = 789L; // Long | userId of user who sent friend request
Integer status = 56; // Integer |   /_*  Set Friend Request status      CONFIRM - 1      IGNORE - 2   *_/ 
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    Boolean result = apiInstance.confirmFriendRequest(userId, status, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#confirmFriendRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId of user who sent friend request |
 **status** | **Integer**|   /_*  Set Friend Request status      CONFIRM - 1      IGNORE - 2   *_/  |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

**Boolean**

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="follow"></a>
# **follow**
> Boolean follow(follower, followee, requesterId, clientToken, accessToken)

Follow user

Allows to follow a user. Returns true if successful

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

SocialApi apiInstance = new SocialApi();
String follower = "follower_example"; // String | Enter the userId/mailId of the follower
String followee = "followee_example"; // String | Enter the userId/mailId of the user the follower wants to follow
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    Boolean result = apiInstance.follow(follower, followee, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#follow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **follower** | **String**| Enter the userId/mailId of the follower |
 **followee** | **String**| Enter the userId/mailId of the user the follower wants to follow |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

**Boolean**

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> VerveResponseUser getUser(userId, requesterId, clientToken, fields, accessToken)

Get user by id 

Returns the user.

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

SocialApi apiInstance = new SocialApi();
Long userId = 789L; // Long | User Id
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "userId,firstName,lastName,profileImage"; // String | Filter fields in result list        /_*   **A) Default values -**        1)userId       2)firstName       3)lastName       4)profileImage        **A) Available values-**       1)userId       2)firstName       3)lastName       4)emailId       5)profileImage       6)birthDate        *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseUser result = apiInstance.getUser(userId, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)userId       2)firstName       3)lastName       4)profileImage        **A) Available values-**       1)userId       2)firstName       3)lastName       4)emailId       5)profileImage       6)birthDate        *_/ | [optional] [default to userId,firstName,lastName,profileImage]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseUser**](VerveResponseUser.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserDetail"></a>
# **getUserDetail**
> VerveResponseUserDetail getUserDetail(userId, requesterId, clientToken, accessToken)

Get user details 

Returns the user details.

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

SocialApi apiInstance = new SocialApi();
Long userId = 789L; // Long | Enter user Id whose details you need
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseUserDetail result = apiInstance.getUserDetail(userId, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#getUserDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| Enter user Id whose details you need |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseUserDetail**](VerveResponseUserDetail.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserFollowers"></a>
# **getUserFollowers**
> VerveResponseUserList getUserFollowers(userId, requesterId, clientToken, fields, accessToken)

Get list of followers

Returns the list of followers

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

SocialApi apiInstance = new SocialApi();
Long userId = 789L; // Long | User Id whose followers wants to get.
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "userId,firstName,lastName,profileImage"; // String | Filter fields in result list        /_*   **A) Default values -**        1)userId       2)firstName       3)lastName       4)profileImage        **A) Available values-**       1)userId       2)firstName       3)lastName       4)emailId       5)profileImage       6)birthDate        *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseUserList result = apiInstance.getUserFollowers(userId, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#getUserFollowers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id whose followers wants to get. |
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

<a name="getUserFollowing"></a>
# **getUserFollowing**
> VerveResponseUserList getUserFollowing(userId, requesterId, clientToken, fields, accessToken)

Get list of users that are being followed

Returns the list of users that are being followed

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

SocialApi apiInstance = new SocialApi();
Long userId = 789L; // Long | User Id whose followed list want to get
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "userId,firstName,lastName,profileImage"; // String | Filter fields in result list        /_*   **A) Default values -**        1)userId       2)firstName       3)lastName       4)profileImage        **A) Available values-**       1)userId       2)firstName       3)lastName       4)emailId       5)profileImage       6)birthDate        *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseUserList result = apiInstance.getUserFollowing(userId, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#getUserFollowing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id whose followed list want to get |
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

<a name="getUserFriends"></a>
# **getUserFriends**
> VerveResponseUserList getUserFriends(userId, requesterId, clientToken, fields, accessToken)

Get list of friends

Returns the list of friends

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

SocialApi apiInstance = new SocialApi();
Long userId = 789L; // Long | userId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "userId,firstName,lastName,profileImage"; // String | Filter fields in result list        /_*   **A) Default values -**        1)userId       2)firstName       3)lastName       4)profileImage        **A) Available values-**       1)userId       2)firstName       3)lastName       4)emailId       5)profileImage       6)birthDate        *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseUserList result = apiInstance.getUserFriends(userId, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#getUserFriends");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
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

<a name="removeFriend"></a>
# **removeFriend**
> Boolean removeFriend(id1, id2, requesterId, clientToken, accessToken)

Remove friend 

Allows the user to remove friend. Returns true if successful

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

SocialApi apiInstance = new SocialApi();
String id1 = "id1_example"; // String | Enter userId/mailId of the person who wants to remove from friend
String id2 = "id2_example"; // String | Enter userId /mailId you want to remove in friend list
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    Boolean result = apiInstance.removeFriend(id1, id2, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#removeFriend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id1** | **String**| Enter userId/mailId of the person who wants to remove from friend |
 **id2** | **String**| Enter userId /mailId you want to remove in friend list |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

**Boolean**

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="requestFriend"></a>
# **requestFriend**
> Boolean requestFriend(userId, requesterId, clientToken, accessToken)

Send friend request

Allows user to send a friend request. Returns true if successful

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

SocialApi apiInstance = new SocialApi();
Long userId = 789L; // Long | Enter userId /mailId you want to send friend request
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    Boolean result = apiInstance.requestFriend(userId, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#requestFriend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| Enter userId /mailId you want to send friend request |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

**Boolean**

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="requestsForMe"></a>
# **requestsForMe**
> VerveResponseRequestForMeList requestsForMe(requesterId, clientToken, accessToken)

Get list of friend requests

Returns the list of friend requests

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

SocialApi apiInstance = new SocialApi();
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseRequestForMeList result = apiInstance.requestsForMe(requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#requestsForMe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseRequestForMeList**](VerveResponseRequestForMeList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unfollow"></a>
# **unfollow**
> Boolean unfollow(unfollower, unfollowee, requesterId, clientToken, accessToken)

Unfollow user

Allows to unfollow user. Returns true if successful

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

SocialApi apiInstance = new SocialApi();
String unfollower = "unfollower_example"; // String | Enter the userId/mailId of the unfollower
String unfollowee = "unfollowee_example"; // String | Enter the userId/mailId of the user the unfollower wants to unfollow
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    Boolean result = apiInstance.unfollow(unfollower, unfollowee, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#unfollow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unfollower** | **String**| Enter the userId/mailId of the unfollower |
 **unfollowee** | **String**| Enter the userId/mailId of the user the unfollower wants to unfollow |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

**Boolean**

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

