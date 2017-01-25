# UserAuthenticationApi

All URIs are relative to *https://api.iengage.io:8243/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNotificationRegisteredId**](UserAuthenticationApi.md#addNotificationRegisteredId) | **POST** /devices | Add device token
[**addUser**](UserAuthenticationApi.md#addUser) | **POST** /users | Add/Register new user
[**authenticate**](UserAuthenticationApi.md#authenticate) | **GET** /authenticate | Authenticate User
[**changePassword**](UserAuthenticationApi.md#changePassword) | **PUT** /users/password | Change password
[**deleteUser**](UserAuthenticationApi.md#deleteUser) | **DELETE** /users/{userId} | Delete user
[**getOrganizations**](UserAuthenticationApi.md#getOrganizations) | **GET** /organizations | Get list of organizations
[**logout**](UserAuthenticationApi.md#logout) | **GET** /logout | Logout


<a name="addNotificationRegisteredId"></a>
# **addNotificationRegisteredId**
> Boolean addNotificationRegisteredId(registeredId, type, loggedInUserId, accessToken, clientToken)

Add device token

Add device token to push notification from server

### Example
```java
// Import classes:
//import com.iengage.ApiException;
//import com.iengage.service.UserAuthenticationApi;


UserAuthenticationApi apiInstance = new UserAuthenticationApi();
String registeredId = "registeredId_example"; // String | Registered device token to be added
String type = "type_example"; // String | Type of device android, ios
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    Boolean result = apiInstance.addNotificationRegisteredId(registeredId, type, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAuthenticationApi#addNotificationRegisteredId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registeredId** | **String**| Registered device token to be added |
 **type** | **String**| Type of device android, ios |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="addUser"></a>
# **addUser**
> VerveResponseUser addUser(screenName, emailId, password, clientToken, firstName, middleName, lastName, birthDay, birthMonth, birthYear, additionInformation)

Add/Register new user

Add/Register new user. Returns the user

### Example
```java
// Import classes:
//import com.iengage.ApiException;
//import com.iengage.service.UserAuthenticationApi;


UserAuthenticationApi apiInstance = new UserAuthenticationApi();
String screenName = "screenName_example"; // String | unique ID of user
String emailId = "emailId_example"; // String | email ID
String password = "password_example"; // String | password
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String firstName = "firstName_example"; // String | first name
String middleName = "middleName_example"; // String | middle name
String lastName = "lastName_example"; // String | last name
Integer birthDay = 56; // Integer | birth day
Integer birthMonth = 56; // Integer | birth month
Integer birthYear = 56; // Integer | birth year
String additionInformation = "additionInformation_example"; // String | addition information
try {
    VerveResponseUser result = apiInstance.addUser(screenName, emailId, password, clientToken, firstName, middleName, lastName, birthDay, birthMonth, birthYear, additionInformation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAuthenticationApi#addUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenName** | **String**| unique ID of user |
 **emailId** | **String**| email ID |
 **password** | **String**| password |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **firstName** | **String**| first name | [optional]
 **middleName** | **String**| middle name | [optional]
 **lastName** | **String**| last name | [optional]
 **birthDay** | **Integer**| birth day | [optional]
 **birthMonth** | **Integer**| birth month | [optional]
 **birthYear** | **Integer**| birth year | [optional]
 **additionInformation** | **String**| addition information | [optional]

### Return type

[**VerveResponseUser**](VerveResponseUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="authenticate"></a>
# **authenticate**
> User authenticate(userName, password, clientToken)

Authenticate User

Authenticate with username &amp; password

### Example
```java
// Import classes:
//import com.iengage.ApiException;
//import com.iengage.service.UserAuthenticationApi;


UserAuthenticationApi apiInstance = new UserAuthenticationApi();
String userName = "userName_example"; // String | User name
String password = "password_example"; // String | Password
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    User result = apiInstance.authenticate(userName, password, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAuthenticationApi#authenticate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**| User name |
 **password** | **String**| Password |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changePassword"></a>
# **changePassword**
> Boolean changePassword(currentPassword, newPassword, loggedInUserId, accessToken, clientToken)

Change password

Allows the user to change password. Returns true if successful

### Example
```java
// Import classes:
//import com.iengage.ApiException;
//import com.iengage.service.UserAuthenticationApi;


UserAuthenticationApi apiInstance = new UserAuthenticationApi();
String currentPassword = "currentPassword_example"; // String | Current password
String newPassword = "newPassword_example"; // String | New password
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    Boolean result = apiInstance.changePassword(currentPassword, newPassword, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAuthenticationApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currentPassword** | **String**| Current password |
 **newPassword** | **String**| New password |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="deleteUser"></a>
# **deleteUser**
> VerveResponseUser deleteUser(userId, clientToken)

Delete user

Allows the user to delete user. Returns the deleted user

### Example
```java
// Import classes:
//import com.iengage.ApiException;
//import com.iengage.service.UserAuthenticationApi;


UserAuthenticationApi apiInstance = new UserAuthenticationApi();
Long userId = 789L; // Long | userId
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseUser result = apiInstance.deleteUser(userId, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAuthenticationApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseUser**](VerveResponseUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="getOrganizations"></a>
# **getOrganizations**
> VerveResponseOrganizationList getOrganizations(loggedInUserId, accessToken, clientToken)

Get list of organizations

Return the list of organizations

### Example
```java
// Import classes:
//import com.iengage.ApiException;
//import com.iengage.service.UserAuthenticationApi;


UserAuthenticationApi apiInstance = new UserAuthenticationApi();
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseOrganizationList result = apiInstance.getOrganizations(loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAuthenticationApi#getOrganizations");
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

[**VerveResponseOrganizationList**](VerveResponseOrganizationList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> Boolean logout(loggedInUserId, accessToken, clientToken)

Logout

Logout rest api session. Returns true if successful

### Example
```java
// Import classes:
//import com.iengage.ApiException;
//import com.iengage.service.UserAuthenticationApi;


UserAuthenticationApi apiInstance = new UserAuthenticationApi();
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    Boolean result = apiInstance.logout(loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAuthenticationApi#logout");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

