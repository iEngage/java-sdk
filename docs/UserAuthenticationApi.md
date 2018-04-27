# UserAuthenticationApi

All URIs are relative to *https://api.iengage.io:8243/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNotificationRegisteredId**](UserAuthenticationApi.md#addNotificationRegisteredId) | **POST** /devices | Add device token
[**addUser**](UserAuthenticationApi.md#addUser) | **POST** /users | Add/Register new user
[**authenticate**](UserAuthenticationApi.md#authenticate) | **GET** /authenticate | Authenticate User
[**changePassword**](UserAuthenticationApi.md#changePassword) | **PUT** /users/password | Change password
[**createAssociation**](UserAuthenticationApi.md#createAssociation) | **POST** /associations | Create association
[**deleteUser**](UserAuthenticationApi.md#deleteUser) | **DELETE** /users/{userId} | Delete user
[**getAssociations**](UserAuthenticationApi.md#getAssociations) | **GET** /associations | Get list of associations
[**logout**](UserAuthenticationApi.md#logout) | **GET** /logout | Logout


<a name="addNotificationRegisteredId"></a>
# **addNotificationRegisteredId**
> Boolean addNotificationRegisteredId(registeredId, type, clientToken, requesterId, accessToken)

Add device token

Add device token to push notification from server

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.UserAuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

UserAuthenticationApi apiInstance = new UserAuthenticationApi();
String registeredId = "registeredId_example"; // String | Registered device token to be added
String type = "type_example"; // String | Type of device android, ios
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    Boolean result = apiInstance.addNotificationRegisteredId(registeredId, type, clientToken, requesterId, accessToken);
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
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **requesterId** | **String**| requesterId can be user id OR email address. | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

**Boolean**

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addUser"></a>
# **addUser**
> VerveResponseUser addUser(screenName, emailId, password, clientToken, firstName, middleName, lastName, birthDay, birthMonth, birthYear, additionInformation)

Add/Register new user

Add/Register new user. Returns the user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.UserAuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

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

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="authenticate"></a>
# **authenticate**
> User authenticate(userName, password, clientToken)

Authenticate User

Authenticate with username &amp; password

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.UserAuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

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

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changePassword"></a>
# **changePassword**
> Boolean changePassword(currentPassword, newPassword, requesterId, clientToken, accessToken)

Change password

Allows the user to change password. Returns true if successful

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.UserAuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

UserAuthenticationApi apiInstance = new UserAuthenticationApi();
String currentPassword = "currentPassword_example"; // String | Current password
String newPassword = "newPassword_example"; // String | New password
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    Boolean result = apiInstance.changePassword(currentPassword, newPassword, requesterId, clientToken, accessToken);
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

<a name="createAssociation"></a>
# **createAssociation**
> VerveResponseAssociation createAssociation(name, requesterId, clientToken, accessToken)

Create association

Create association. Returns the association

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.UserAuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

UserAuthenticationApi apiInstance = new UserAuthenticationApi();
String name = "name_example"; // String | association name
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseAssociation result = apiInstance.createAssociation(name, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAuthenticationApi#createAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| association name |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseAssociation**](VerveResponseAssociation.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> VerveResponseUser deleteUser(userId, clientToken)

Delete user

Allows the user to delete user. Returns the deleted user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.UserAuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

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

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getAssociations"></a>
# **getAssociations**
> VerveResponseAssociationList getAssociations(requesterId, clientToken, accessToken)

Get list of associations

Return the list of association

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.UserAuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

UserAuthenticationApi apiInstance = new UserAuthenticationApi();
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseAssociationList result = apiInstance.getAssociations(requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAuthenticationApi#getAssociations");
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

[**VerveResponseAssociationList**](VerveResponseAssociationList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> Boolean logout(requesterId, clientToken, accessToken)

Logout

Logout rest api session. Returns true if successful

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.UserAuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

UserAuthenticationApi apiInstance = new UserAuthenticationApi();
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    Boolean result = apiInstance.logout(requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAuthenticationApi#logout");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

