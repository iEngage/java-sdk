# NotificationApi

All URIs are relative to *https://api.iengage.io:8243/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNotifications**](NotificationApi.md#getNotifications) | **GET** /notifications | Get list of notifications
[**markAllNotificationAsRead**](NotificationApi.md#markAllNotificationAsRead) | **POST** /notifications/read/all | Mark all notification as read
[**markNotificationAsRead**](NotificationApi.md#markNotificationAsRead) | **POST** /notifications/read/{notificationId} | Mark notification as read
[**notificationCount**](NotificationApi.md#notificationCount) | **GET** /notifications/count | Get notifications count


<a name="getNotifications"></a>
# **getNotifications**
> VerveResponseNotificationList getNotifications(type, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of notifications

Return the list of notifications

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.NotificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

NotificationApi apiInstance = new NotificationApi();
String type = "ALL"; // String | Type of count<br/> 1) UNREAD <br/> 2) READ <br/> 3)ALL
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "notificationId,message,isRead,date"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)notificationId<br/>2)message<br/>3)isRead<br/>4)date<br/><b>A) Available values-</b><br/>1)notificationId<br/>2)message<br/>3)isRead<br/>4)date<br/>5)type<br/>6)byUser<br/>7)entity<br/>8)parentEntity
try {
    VerveResponseNotificationList result = apiInstance.getNotifications(type, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#getNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Type of count&lt;br/&gt; 1) UNREAD &lt;br/&gt; 2) READ &lt;br/&gt; 3)ALL | [default to ALL]
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)notificationId&lt;br/&gt;2)message&lt;br/&gt;3)isRead&lt;br/&gt;4)date&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)notificationId&lt;br/&gt;2)message&lt;br/&gt;3)isRead&lt;br/&gt;4)date&lt;br/&gt;5)type&lt;br/&gt;6)byUser&lt;br/&gt;7)entity&lt;br/&gt;8)parentEntity | [optional] [default to notificationId,message,isRead,date]

### Return type

[**VerveResponseNotificationList**](VerveResponseNotificationList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="markAllNotificationAsRead"></a>
# **markAllNotificationAsRead**
> Boolean markAllNotificationAsRead(loggedInUserId, accessToken, clientToken)

Mark all notification as read

Allows the user to mark all the notification as read

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.NotificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

NotificationApi apiInstance = new NotificationApi();
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    Boolean result = apiInstance.markAllNotificationAsRead(loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#markAllNotificationAsRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

**Boolean**

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="markNotificationAsRead"></a>
# **markNotificationAsRead**
> Boolean markNotificationAsRead(notificationId, loggedInUserId, accessToken, clientToken)

Mark notification as read

Allows the user to mark the notification as read

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.NotificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

NotificationApi apiInstance = new NotificationApi();
Long notificationId = 789L; // Long | notification Id
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    Boolean result = apiInstance.markNotificationAsRead(notificationId, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#markNotificationAsRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **Long**| notification Id |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

**Boolean**

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="notificationCount"></a>
# **notificationCount**
> Long notificationCount(type, loggedInUserId, accessToken, clientToken)

Get notifications count

Returns the notification count

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.NotificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

NotificationApi apiInstance = new NotificationApi();
String type = "ALL"; // String | Type of count<br/> 1) UNREAD <br/> 2) READ <br/> 3)ALL
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    Long result = apiInstance.notificationCount(type, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Type of count&lt;br/&gt; 1) UNREAD &lt;br/&gt; 2) READ &lt;br/&gt; 3)ALL | [default to ALL]
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

**Long**

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

