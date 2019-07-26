# ProjectManagementApi

All URIs are relative to *https://api.iengage.io:8243/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMilestoneComment**](ProjectManagementApi.md#addMilestoneComment) | **POST** /milestones/{milestoneId}/comments | Comment on milestone
[**addTaskComment**](ProjectManagementApi.md#addTaskComment) | **POST** /milestones/tasks/{taskId}/comments | Comment on task
[**createMilestone**](ProjectManagementApi.md#createMilestone) | **POST** /milestones | Create milestone
[**createTask**](ProjectManagementApi.md#createTask) | **POST** /milestones/{milestoneId}/tasks | Create task
[**deleteMilestone**](ProjectManagementApi.md#deleteMilestone) | **DELETE** /milestones/{milestoneId} | Delete milestone
[**deleteTask**](ProjectManagementApi.md#deleteTask) | **DELETE** /milestones/tasks/{taskId} | Delete task
[**getMilestones**](ProjectManagementApi.md#getMilestones) | **GET** /milestones | Get list of milestones
[**getMilestonesComments**](ProjectManagementApi.md#getMilestonesComments) | **GET** /milestones/{milestoneId}/comments | Get list of comments written on Milestones
[**getTaskComments**](ProjectManagementApi.md#getTaskComments) | **GET** /milestones/tasks/{taskId}/comments | Get list of Comments written on task
[**getUserTasks**](ProjectManagementApi.md#getUserTasks) | **GET** /milestones/tasks/{userId}/assigned | Get list of task assigned to user
[**updateMilestone**](ProjectManagementApi.md#updateMilestone) | **PUT** /milestones/{milestoneId} | Update milestone
[**updateTask**](ProjectManagementApi.md#updateTask) | **PUT** /milestones/tasks/{taskId} | Update task
[**updateTaskStatus**](ProjectManagementApi.md#updateTaskStatus) | **PUT** /milestones/tasks/{taskId}/status | Update task status


<a name="addMilestoneComment"></a>
# **addMilestoneComment**
> VerveResponseComment addMilestoneComment(milestoneId, requesterId, clientToken, body, accessToken)

Comment on milestone

This service allows a user to comment on a milestone. The following fields(key:value) are required to be present in the Comment JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API.  **Required fields**  1. milestoneId (Path Parameter) 2. commentText  

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ProjectManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ProjectManagementApi apiInstance = new ProjectManagementApi();
Long milestoneId = 789L; // Long | milestoneId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Comment body = new Comment(); // Comment | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseComment result = apiInstance.addMilestoneComment(milestoneId, requesterId, clientToken, body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#addMilestoneComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **milestoneId** | **Long**| milestoneId |
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

<a name="addTaskComment"></a>
# **addTaskComment**
> VerveResponseComment addTaskComment(taskId, requesterId, clientToken, body, accessToken)

Comment on task

This service allows a user to comment on a task. The following fields(key:value) are required to be present in the Comment JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API.  **Required fields**  1. **taskId (Path Parameter)**  2. **commentText**  

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ProjectManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ProjectManagementApi apiInstance = new ProjectManagementApi();
Long taskId = 789L; // Long | taskId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Comment body = new Comment(); // Comment | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseComment result = apiInstance.addTaskComment(taskId, requesterId, clientToken, body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#addTaskComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **Long**| taskId |
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

<a name="createMilestone"></a>
# **createMilestone**
> VerveResponseMilestone createMilestone(requesterId, clientToken, body, accessToken)

Create milestone

This service allows a user to create a milestone. The following fields(key:value) are required to be present in the Milestone JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API.  **Required fields**  1. **milestoneTitle**  2. **milestoneDescription**  3. **dueDate**  4. **neverDue**  

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ProjectManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ProjectManagementApi apiInstance = new ProjectManagementApi();
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Milestone body = new Milestone(); // Milestone | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseMilestone result = apiInstance.createMilestone(requesterId, clientToken, body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#createMilestone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body** | [**Milestone**](Milestone.md)|  | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseMilestone**](VerveResponseMilestone.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="createTask"></a>
# **createTask**
> VerveResponseTask createTask(milestoneId, requesterId, clientToken, body, accessToken)

Create task

This service allows a user to create a task. The following fields(key:value) are required to be present in the Task JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API.   **Required fields**  1. **taskTitle**  2. **taskDescription**  3. **priority**  4. **dueDate**  5. **assigneeUserId**  6. **neverDue**  7. **user: { userId }**

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ProjectManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ProjectManagementApi apiInstance = new ProjectManagementApi();
Long milestoneId = 789L; // Long | Milestone Id
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Task body = new Task(); // Task | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseTask result = apiInstance.createTask(milestoneId, requesterId, clientToken, body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#createTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **milestoneId** | **Long**| Milestone Id |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body** | [**Task**](Task.md)|  | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseTask**](VerveResponseTask.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteMilestone"></a>
# **deleteMilestone**
> VerveResponseMilestone deleteMilestone(milestoneId, requesterId, clientToken, fields, accessToken)

Delete milestone

Allows the user to delete milestone. Returns the deleted milestone

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ProjectManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ProjectManagementApi apiInstance = new ProjectManagementApi();
Long milestoneId = 789L; // Long | milestoneId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "milestoneId,milestoneTitle,milestoneDescription,createdDate"; // String | Filter fields in result list      /_*   **A) Default values -**        1)milestoneId       2)milestoneTitle       3)milestoneDescription       4)createdDate        **A) Available values-**        1)milestoneId       2)milestoneTitle       3)milestoneDescription       4)createdDate       5)status       6)priority       7)dueDate   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseMilestone result = apiInstance.deleteMilestone(milestoneId, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#deleteMilestone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **milestoneId** | **Long**| milestoneId |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)milestoneId       2)milestoneTitle       3)milestoneDescription       4)createdDate        **A) Available values-**        1)milestoneId       2)milestoneTitle       3)milestoneDescription       4)createdDate       5)status       6)priority       7)dueDate   *_/ | [optional] [default to milestoneId,milestoneTitle,milestoneDescription,createdDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseMilestone**](VerveResponseMilestone.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteTask"></a>
# **deleteTask**
> VerveResponseTask deleteTask(taskId, requesterId, clientToken, fields, accessToken)

Delete task

Allows the user to delete task. Returns the deleted task

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ProjectManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ProjectManagementApi apiInstance = new ProjectManagementApi();
Long taskId = 789L; // Long | taskId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "taskId,taskTitle,taskDescription,dueDate"; // String | Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)taskTitle       3)taskDescription       4)dueDate        **A) Available values-**        1)taskId       2)taskTitle       3)taskDescription       4)status       5)priority       6)dueDate       7)milestoneName       8)groupType       9)groupName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseTask result = apiInstance.deleteTask(taskId, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#deleteTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **Long**| taskId |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)taskTitle       3)taskDescription       4)dueDate        **A) Available values-**        1)taskId       2)taskTitle       3)taskDescription       4)status       5)priority       6)dueDate       7)milestoneName       8)groupType       9)groupName   *_/ | [optional] [default to taskId,taskTitle,taskDescription,dueDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseTask**](VerveResponseTask.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getMilestones"></a>
# **getMilestones**
> VerveResponseMilestoneList getMilestones(requesterId, clientToken, organizationId, fields, accessToken)

Get list of milestones

Returns the list of milestones

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ProjectManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ProjectManagementApi apiInstance = new ProjectManagementApi();
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long organizationId = 789L; // Long | organizationId
String fields = "milestoneId,milestoneTitle,milestoneDescription,createdDate"; // String | Filter fields in result list      /_*   **A) Default values -**        1)milestoneId       2)milestoneTitle       3)milestoneDescription       4)createdDate        **A) Available values-**        1)milestoneId       2)milestoneTitle       3)milestoneDescription       4)createdDate       5)status       6)priority       7)dueDate   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseMilestoneList result = apiInstance.getMilestones(requesterId, clientToken, organizationId, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#getMilestones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **organizationId** | **Long**| organizationId | [optional]
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)milestoneId       2)milestoneTitle       3)milestoneDescription       4)createdDate        **A) Available values-**        1)milestoneId       2)milestoneTitle       3)milestoneDescription       4)createdDate       5)status       6)priority       7)dueDate   *_/ | [optional] [default to milestoneId,milestoneTitle,milestoneDescription,createdDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseMilestoneList**](VerveResponseMilestoneList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMilestonesComments"></a>
# **getMilestonesComments**
> VerveResponseCommentList getMilestonesComments(milestoneId, requesterId, clientToken, accessToken)

Get list of comments written on Milestones

Returns the list comments written on milestone

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ProjectManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ProjectManagementApi apiInstance = new ProjectManagementApi();
Long milestoneId = 789L; // Long | milestoneId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseCommentList result = apiInstance.getMilestonesComments(milestoneId, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#getMilestonesComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **milestoneId** | **Long**| milestoneId |
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

<a name="getTaskComments"></a>
# **getTaskComments**
> VerveResponseCommentList getTaskComments(taskId, requesterId, clientToken, accessToken)

Get list of Comments written on task

Returns the list of comments written on task

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ProjectManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ProjectManagementApi apiInstance = new ProjectManagementApi();
Long taskId = 789L; // Long | taskId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseCommentList result = apiInstance.getTaskComments(taskId, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#getTaskComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **Long**| taskId |
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

<a name="getUserTasks"></a>
# **getUserTasks**
> VerveResponseTaskList getUserTasks(userId, status, requesterId, clientToken, fields, accessToken)

Get list of task assigned to user

Returns the list of task assigned to user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ProjectManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ProjectManagementApi apiInstance = new ProjectManagementApi();
Long userId = 789L; // Long | User Id whose assinged task want to get
Integer status = 56; // Integer |   /_*   Task status   0 - ALL   1 - OPEN   2 - PERCENT_TWENTY   3 - PERCENT_FORTY   4 - PERCENT_SIXTY   5 - PERCENT_EIGHTY   6 - RESOLVED   7 - REOPENED   *_/
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "taskId,taskTitle,taskDescription,dueDate"; // String | Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)taskTitle       3)taskDescription       4)dueDate        **A) Available values-**        1)taskId       2)taskTitle       3)taskDescription       4)status       5)priority       6)dueDate       7)milestoneName       8)groupType       9)groupName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseTaskList result = apiInstance.getUserTasks(userId, status, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#getUserTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id whose assinged task want to get |
 **status** | **Integer**|   /_*   Task status   0 - ALL   1 - OPEN   2 - PERCENT_TWENTY   3 - PERCENT_FORTY   4 - PERCENT_SIXTY   5 - PERCENT_EIGHTY   6 - RESOLVED   7 - REOPENED   *_/ |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)taskTitle       3)taskDescription       4)dueDate        **A) Available values-**        1)taskId       2)taskTitle       3)taskDescription       4)status       5)priority       6)dueDate       7)milestoneName       8)groupType       9)groupName   *_/ | [optional] [default to taskId,taskTitle,taskDescription,dueDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseTaskList**](VerveResponseTaskList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMilestone"></a>
# **updateMilestone**
> VerveResponseMilestone updateMilestone(milestoneId, title, description, dueDate, requesterId, clientToken, fields, accessToken)

Update milestone

Allows the user to update milestone. Returns the updated milestone

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ProjectManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ProjectManagementApi apiInstance = new ProjectManagementApi();
Long milestoneId = 789L; // Long | milestoneId
String title = "title_example"; // String | title
String description = "description_example"; // String | description
String dueDate = "dueDate_example"; // String | Due date (Format: MM-dd-yyyy HH:mm:ss a)
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "milestoneId,milestoneTitle,milestoneDescription,createdDate"; // String | Filter fields in result list      /_*   **A) Default values -**        1)milestoneId       2)milestoneTitle       3)milestoneDescription       4)createdDate        **A) Available values-**        1)milestoneId       2)milestoneTitle       3)milestoneDescription       4)createdDate       5)status       6)priority       7)dueDate   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseMilestone result = apiInstance.updateMilestone(milestoneId, title, description, dueDate, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#updateMilestone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **milestoneId** | **Long**| milestoneId |
 **title** | **String**| title |
 **description** | **String**| description |
 **dueDate** | **String**| Due date (Format: MM-dd-yyyy HH:mm:ss a) |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)milestoneId       2)milestoneTitle       3)milestoneDescription       4)createdDate        **A) Available values-**        1)milestoneId       2)milestoneTitle       3)milestoneDescription       4)createdDate       5)status       6)priority       7)dueDate   *_/ | [optional] [default to milestoneId,milestoneTitle,milestoneDescription,createdDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseMilestone**](VerveResponseMilestone.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateTask"></a>
# **updateTask**
> VerveResponseTask updateTask(taskId, title, description, dueDate, status, reAssigneeUserId, requesterId, clientToken, fields, accessToken)

Update task

Allows the user to update task. Returns the updated task

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ProjectManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ProjectManagementApi apiInstance = new ProjectManagementApi();
Long taskId = 789L; // Long | taskId
String title = "title_example"; // String | title
String description = "description_example"; // String | description
String dueDate = "dueDate_example"; // String | Due date
Integer status = 56; // Integer |   /_*   Task status   1 - OPEN   2 - PERCENT_TWENTY   3 - PERCENT_FORTY   4 - PERCENT_SIXTY   5 - PERCENT_EIGHTY   6 - RESOLVED   7 - REOPENED   *_/
Long reAssigneeUserId = 789L; // Long | re-assignee User Id
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "taskId,taskTitle,taskDescription,dueDate"; // String | Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)taskTitle       3)taskDescription       4)dueDate        **A) Available values-**        1)taskId       2)taskTitle       3)taskDescription       4)status       5)priority       6)dueDate       7)milestoneName       8)groupType       9)groupName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseTask result = apiInstance.updateTask(taskId, title, description, dueDate, status, reAssigneeUserId, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#updateTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **Long**| taskId |
 **title** | **String**| title |
 **description** | **String**| description |
 **dueDate** | **String**| Due date |
 **status** | **Integer**|   /_*   Task status   1 - OPEN   2 - PERCENT_TWENTY   3 - PERCENT_FORTY   4 - PERCENT_SIXTY   5 - PERCENT_EIGHTY   6 - RESOLVED   7 - REOPENED   *_/ |
 **reAssigneeUserId** | **Long**| re-assignee User Id |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)taskTitle       3)taskDescription       4)dueDate        **A) Available values-**        1)taskId       2)taskTitle       3)taskDescription       4)status       5)priority       6)dueDate       7)milestoneName       8)groupType       9)groupName   *_/ | [optional] [default to taskId,taskTitle,taskDescription,dueDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseTask**](VerveResponseTask.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateTaskStatus"></a>
# **updateTaskStatus**
> VerveResponseTask updateTaskStatus(taskId, status, requesterId, clientToken, fields, accessToken)

Update task status

Allows the user to update task status. Returns the updated task status

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ProjectManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ProjectManagementApi apiInstance = new ProjectManagementApi();
Long taskId = 789L; // Long | taskId
Integer status = 56; // Integer |   /_*  Task status   1 - OPEN   2 - PERCENT_TWENTY   3 - PERCENT_FORTY   4 - PERCENT_SIXTY   5 - PERCENT_EIGHTY   6 - RESOLVED   7 - REOPENED   *_/
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "taskId,taskTitle,taskDescription,dueDate"; // String | Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)taskTitle       3)taskDescription       4)dueDate        **A) Available values-**        1)taskId       2)taskTitle       3)taskDescription       4)status       5)priority       6)dueDate       7)milestoneName       8)groupType       9)groupName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseTask result = apiInstance.updateTaskStatus(taskId, status, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#updateTaskStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **Long**| taskId |
 **status** | **Integer**|   /_*  Task status   1 - OPEN   2 - PERCENT_TWENTY   3 - PERCENT_FORTY   4 - PERCENT_SIXTY   5 - PERCENT_EIGHTY   6 - RESOLVED   7 - REOPENED   *_/ |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)taskId       2)taskTitle       3)taskDescription       4)dueDate        **A) Available values-**        1)taskId       2)taskTitle       3)taskDescription       4)status       5)priority       6)dueDate       7)milestoneName       8)groupType       9)groupName   *_/ | [optional] [default to taskId,taskTitle,taskDescription,dueDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseTask**](VerveResponseTask.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

