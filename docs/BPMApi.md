# BPMApi

All URIs are relative to *https://api.iengage.io:8243/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignWFTask**](BPMApi.md#assignWFTask) | **POST** /bpm/tasks/{taskId}/assign | Assign task
[**completeWFTask**](BPMApi.md#completeWFTask) | **POST** /bpm/tasks/{taskId}/complete | Complete task
[**getBPMTasks**](BPMApi.md#getBPMTasks) | **GET** /bpm/tasks/{taskId} | Get task by task id
[**getSearchTask**](BPMApi.md#getSearchTask) | **GET** /bpm/{userId}/tasks/name | Get list of BPM task assigned to user
[**getTasksByEntity**](BPMApi.md#getTasksByEntity) | **GET** /bpm/{userId}/tasks/{entityId} | Get list of BPM task assigned to user
[**getUserBPMTasks**](BPMApi.md#getUserBPMTasks) | **GET** /bpm/{userId}/tasks | Get list of BPM task assigned to user
[**getUserRolesBPMTasks**](BPMApi.md#getUserRolesBPMTasks) | **GET** /bpm/{userId}/roles/tasks | Get list of BPM task assigned to user roles


<a name="assignWFTask"></a>
# **assignWFTask**
> VerveResponseWFTask assignWFTask(assigneeUserId, taskId, requesterId, clientToken, comment, dueDate, fields, accessToken)

Assign task

Assign BPM task, It will return task object

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.BPMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

BPMApi apiInstance = new BPMApi();
Long assigneeUserId = 789L; // Long | assigneeUserId - assign to this user
Long taskId = 789L; // Long | taskId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String comment = "comment_example"; // String | comment
Long dueDate = 789L; // Long | dueDate
String fields = "taskId,name,type"; // String | Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)name       3)type        **A) Available values -**         1)taskId       2)name       3)dueDate       4)description       5)transitionList       6)type       7)entityId       8)attributes   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseWFTask result = apiInstance.assignWFTask(assigneeUserId, taskId, requesterId, clientToken, comment, dueDate, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BPMApi#assignWFTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assigneeUserId** | **Long**| assigneeUserId - assign to this user |
 **taskId** | **Long**| taskId |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **comment** | **String**| comment | [optional]
 **dueDate** | **Long**| dueDate | [optional]
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)name       3)type        **A) Available values -**         1)taskId       2)name       3)dueDate       4)description       5)transitionList       6)type       7)entityId       8)attributes   *_/ | [optional] [default to taskId,name,type]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseWFTask**](VerveResponseWFTask.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="completeWFTask"></a>
# **completeWFTask**
> VerveResponseWFTask completeWFTask(userId, taskId, requesterId, clientToken, transition, comment, fields, accessToken)

Complete task

Complete BPM task, It will return task object

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.BPMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

BPMApi apiInstance = new BPMApi();
Long userId = 789L; // Long | userId whose task want to complete
Long taskId = 789L; // Long | taskId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String transition = "transition_example"; // String | transition
String comment = "comment_example"; // String | comment
String fields = "taskId,name,type"; // String | Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)name       3)type        **A) Available values -**         1)taskId       2)name       3)dueDate       4)description       5)transitionList       6)type       7)entityId       8)attributes   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseWFTask result = apiInstance.completeWFTask(userId, taskId, requesterId, clientToken, transition, comment, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BPMApi#completeWFTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId whose task want to complete |
 **taskId** | **Long**| taskId |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **transition** | **String**| transition | [optional]
 **comment** | **String**| comment | [optional]
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)name       3)type        **A) Available values -**         1)taskId       2)name       3)dueDate       4)description       5)transitionList       6)type       7)entityId       8)attributes   *_/ | [optional] [default to taskId,name,type]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseWFTask**](VerveResponseWFTask.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getBPMTasks"></a>
# **getBPMTasks**
> VerveResponseWFTask getBPMTasks(userId, taskId, requesterId, clientToken, fields, accessToken)

Get task by task id

Return the BPM task

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.BPMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

BPMApi apiInstance = new BPMApi();
Long userId = 789L; // Long | userId
Long taskId = 789L; // Long | taskId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "taskId,name,type"; // String | Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)name       3)type        **A) Available values -**         1)taskId       2)name       3)dueDate       4)description       5)transitionList       6)type       7)entityId       8)attributes   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseWFTask result = apiInstance.getBPMTasks(userId, taskId, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BPMApi#getBPMTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **taskId** | **Long**| taskId |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)name       3)type        **A) Available values -**         1)taskId       2)name       3)dueDate       4)description       5)transitionList       6)type       7)entityId       8)attributes   *_/ | [optional] [default to taskId,name,type]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseWFTask**](VerveResponseWFTask.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSearchTask"></a>
# **getSearchTask**
> VerveResponseWFTaskList getSearchTask(userId, searchString, completed, searchByUserRoles, start, end, requesterId, clientToken, type, organizationId, fields, accessToken)

Get list of BPM task assigned to user

Return the list of BPM task

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.BPMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

BPMApi apiInstance = new BPMApi();
Long userId = 789L; // Long | User Id whose tasks want to get
String searchString = "searchString_example"; // String | searchString
Boolean completed = true; // Boolean |   /_*   1) true - Completed   2) false - Pending   *_/
Boolean searchByUserRoles = true; // Boolean |   /_*   1) true - Assigned to roles   2) false - Assigned to user   *_/
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String type = "type_example"; // String | Type
Long organizationId = 789L; // Long | organizationId
String fields = "taskId,name,type"; // String | Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)name       3)type        **A) Available values -**         1)taskId       2)name       3)dueDate       4)description       5)transitionList       6)type       7)entityId       8)attributes   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseWFTaskList result = apiInstance.getSearchTask(userId, searchString, completed, searchByUserRoles, start, end, requesterId, clientToken, type, organizationId, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BPMApi#getSearchTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id whose tasks want to get |
 **searchString** | **String**| searchString |
 **completed** | **Boolean**|   /_*   1) true - Completed   2) false - Pending   *_/ |
 **searchByUserRoles** | **Boolean**|   /_*   1) true - Assigned to roles   2) false - Assigned to user   *_/ |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **type** | **String**| Type | [optional]
 **organizationId** | **Long**| organizationId | [optional]
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)name       3)type        **A) Available values -**         1)taskId       2)name       3)dueDate       4)description       5)transitionList       6)type       7)entityId       8)attributes   *_/ | [optional] [default to taskId,name,type]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseWFTaskList**](VerveResponseWFTaskList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTasksByEntity"></a>
# **getTasksByEntity**
> VerveResponseWFTaskList getTasksByEntity(userId, entityId, completed, searchByUserRoles, start, end, requesterId, clientToken, fields, accessToken)

Get list of BPM task assigned to user

Return the list of BPM task

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.BPMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

BPMApi apiInstance = new BPMApi();
Long userId = 789L; // Long | User Id whose task want to see
Long entityId = 789L; // Long | entityId
Boolean completed = true; // Boolean |   /_*   1) true - Completed   2) false - Pending   *_/
Boolean searchByUserRoles = true; // Boolean |   /_*   1) true - Assigned to roles   2) false - Assigned to user   *_/
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "taskId,name,type"; // String | Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)name       3)type        **A) Available values -**         1)taskId       2)name       3)dueDate       4)description       5)transitionList       6)type       7)entityId       8)attributes   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseWFTaskList result = apiInstance.getTasksByEntity(userId, entityId, completed, searchByUserRoles, start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BPMApi#getTasksByEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id whose task want to see |
 **entityId** | **Long**| entityId |
 **completed** | **Boolean**|   /_*   1) true - Completed   2) false - Pending   *_/ |
 **searchByUserRoles** | **Boolean**|   /_*   1) true - Assigned to roles   2) false - Assigned to user   *_/ |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)name       3)type        **A) Available values -**         1)taskId       2)name       3)dueDate       4)description       5)transitionList       6)type       7)entityId       8)attributes   *_/ | [optional] [default to taskId,name,type]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseWFTaskList**](VerveResponseWFTaskList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserBPMTasks"></a>
# **getUserBPMTasks**
> VerveResponseWFTaskList getUserBPMTasks(userId, completed, start, end, requesterId, clientToken, type, organizationId, fields, accessToken)

Get list of BPM task assigned to user

Return the list of BPM task

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.BPMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

BPMApi apiInstance = new BPMApi();
Long userId = 789L; // Long | User Id whose task want to see
Boolean completed = true; // Boolean |   /_*   Accepted Values   1) true - Completed   2) false - Pending   3) Blank - All   *_/
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String type = "type_example"; // String | Type
Long organizationId = 789L; // Long | organizationId
String fields = "taskId,name,type"; // String | Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)name       3)type        **A) Available values -**         1)taskId       2)name       3)dueDate       4)description       5)transitionList       6)type       7)entityId       8)attributes   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseWFTaskList result = apiInstance.getUserBPMTasks(userId, completed, start, end, requesterId, clientToken, type, organizationId, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BPMApi#getUserBPMTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id whose task want to see |
 **completed** | **Boolean**|   /_*   Accepted Values   1) true - Completed   2) false - Pending   3) Blank - All   *_/ |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **type** | **String**| Type | [optional]
 **organizationId** | **Long**| organizationId | [optional]
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)name       3)type        **A) Available values -**         1)taskId       2)name       3)dueDate       4)description       5)transitionList       6)type       7)entityId       8)attributes   *_/ | [optional] [default to taskId,name,type]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseWFTaskList**](VerveResponseWFTaskList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserRolesBPMTasks"></a>
# **getUserRolesBPMTasks**
> VerveResponseWFTaskList getUserRolesBPMTasks(userId, completed, start, end, requesterId, clientToken, type, organizationId, fields, accessToken)

Get list of BPM task assigned to user roles

Return the list of BPM task

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.BPMApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

BPMApi apiInstance = new BPMApi();
Long userId = 789L; // Long | User Id whose task want to see
Boolean completed = true; // Boolean |   /_*   1) true - Completed   2) false - Pending   3) Blank - All   *_/
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String type = "type_example"; // String | Type
Long organizationId = 789L; // Long | organizationId
String fields = "taskId,name,type"; // String | Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)name       3)type        **A) Available values -**         1)taskId       2)name       3)dueDate       4)description       5)transitionList       6)type       7)entityId       8)attributes   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseWFTaskList result = apiInstance.getUserRolesBPMTasks(userId, completed, start, end, requesterId, clientToken, type, organizationId, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BPMApi#getUserRolesBPMTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id whose task want to see |
 **completed** | **Boolean**|   /_*   1) true - Completed   2) false - Pending   3) Blank - All   *_/ |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **type** | **String**| Type | [optional]
 **organizationId** | **Long**| organizationId | [optional]
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)name       3)type        **A) Available values -**         1)taskId       2)name       3)dueDate       4)description       5)transitionList       6)type       7)entityId       8)attributes   *_/ | [optional] [default to taskId,name,type]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseWFTaskList**](VerveResponseWFTaskList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

