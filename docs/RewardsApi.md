# RewardsApi

All URIs are relative to *https://api.iengage.io:8243/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTopFriends**](RewardsApi.md#getTopFriends) | **GET** /rewards/points/top/friends | Get list of top friends
[**getTopUsers**](RewardsApi.md#getTopUsers) | **GET** /rewards/points/top | Get list of top users
[**getUserPoints**](RewardsApi.md#getUserPoints) | **GET** /rewards/points/{userId} | Get list of user points


<a name="getTopFriends"></a>
# **getTopFriends**
> VerveResponseUserPointsList getTopFriends(userId, start, end, loggedInUserId, accessToken, clientToken)

Get list of top friends

Returns the list top friends

### Example
```java
// Import classes:
//import com.iengage.ApiException;
//import com.iengage.service.RewardsApi;


RewardsApi apiInstance = new RewardsApi();
Long userId = 789L; // Long | userId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseUserPointsList result = apiInstance.getTopFriends(userId, start, end, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RewardsApi#getTopFriends");
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

### Return type

[**VerveResponseUserPointsList**](VerveResponseUserPointsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTopUsers"></a>
# **getTopUsers**
> VerveResponseUserPointsList getTopUsers(start, end, loggedInUserId, accessToken, clientToken)

Get list of top users

Returns the list of top users

### Example
```java
// Import classes:
//import com.iengage.ApiException;
//import com.iengage.service.RewardsApi;


RewardsApi apiInstance = new RewardsApi();
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseUserPointsList result = apiInstance.getTopUsers(start, end, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RewardsApi#getTopUsers");
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

### Return type

[**VerveResponseUserPointsList**](VerveResponseUserPointsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserPoints"></a>
# **getUserPoints**
> VerveResponseUserPoints getUserPoints(userId, loggedInUserId, accessToken, clientToken)

Get list of user points

Returns the list of user points

### Example
```java
// Import classes:
//import com.iengage.ApiException;
//import com.iengage.service.RewardsApi;


RewardsApi apiInstance = new RewardsApi();
Long userId = 789L; // Long | userId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseUserPoints result = apiInstance.getUserPoints(userId, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RewardsApi#getUserPoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseUserPoints**](VerveResponseUserPoints.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

