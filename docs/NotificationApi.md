# NotificationApi

All URIs are relative to *https://api.iengage.io:8243/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNotification**](NotificationApi.md#addNotification) | **POST** /notifications | Create custom notification
[**getNotifications**](NotificationApi.md#getNotifications) | **GET** /notifications | Get list of notifications
[**markAllNotificationAsRead**](NotificationApi.md#markAllNotificationAsRead) | **POST** /notifications/read/all | Mark all notification as read
[**markNotificationAsRead**](NotificationApi.md#markNotificationAsRead) | **POST** /notifications/read/{notificationId} | Mark notification as read
[**notificationCount**](NotificationApi.md#notificationCount) | **GET** /notifications/count | Get notifications count


<a name="addNotification"></a>
# **addNotification**
> Boolean addNotification(requesterId, clientToken, body, accessToken)

Create custom notification

This service allows a user to create a notification. The following fields(key:value) are required to be present in the Notification JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API. **Required fields**  1. title  2. body  3. extraData  4. roleName OR toUser: { emailId }

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Notification body = new Notification(); // Notification | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    Boolean result = apiInstance.addNotification(requesterId, clientToken, body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#addNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body** | [**Notification**](Notification.md)|  | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

**Boolean**

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getNotifications"></a>
# **getNotifications**
> VerveResponseNotificationList getNotifications(type, start, end, requesterId, clientToken, fields, accessToken)

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
String type = "ALL"; // String |   /_*   Type of count  1) UNREAD   2) READ   3)ALL   *_/
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "notificationId,message,isRead,date"; // String | Filter fields in result list        /_*   **A) Default values -**        1)notificationId       2)message       3)isRead       4)date        **A) Available values-**        1)notificationId       2)message       3)isRead       4)date       5)type       6)byUser       7)entity       8)parentEntity /n *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseNotificationList result = apiInstance.getNotifications(type, start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#getNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|   /_*   Type of count  1) UNREAD   2) READ   3)ALL   *_/ | [default to ALL]
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)notificationId       2)message       3)isRead       4)date        **A) Available values-**        1)notificationId       2)message       3)isRead       4)date       5)type       6)byUser       7)entity       8)parentEntity /n *_/ | [optional] [default to notificationId,message,isRead,date]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseNotificationList**](VerveResponseNotificationList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="markAllNotificationAsRead"></a>
# **markAllNotificationAsRead**
> Boolean markAllNotificationAsRead(requesterId, clientToken, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    Boolean result = apiInstance.markAllNotificationAsRead(requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#markAllNotificationAsRead");
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

**Boolean**

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="markNotificationAsRead"></a>
# **markNotificationAsRead**
> Boolean markNotificationAsRead(notificationId, requesterId, clientToken, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    Boolean result = apiInstance.markNotificationAsRead(notificationId, requesterId, clientToken, accessToken);
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

<a name="notificationCount"></a>
# **notificationCount**
> Long notificationCount(type, requesterId, clientToken, accessToken)

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
String type = "ALL"; // String |   /_*  Type of count  1) UNREAD   2) READ   3)ALL   *_/
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    Long result = apiInstance.notificationCount(type, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|   /_*  Type of count  1) UNREAD   2) READ   3)ALL   *_/ | [default to ALL]
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

**Long**

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

