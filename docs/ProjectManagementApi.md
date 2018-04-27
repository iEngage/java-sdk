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

This service allows a user to comment on a milestone. The following fields(key:value) are required to be present in the Comment JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API.&lt;/br&gt;&lt;b&gt;Required fields &lt;/br&gt;1. milestoneId (Path Parameter)&lt;/br&gt;2. commentText &lt;/br&gt;

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

This service allows a user to comment on a task. The following fields(key:value) are required to be present in the Comment JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API.&lt;/br&gt;&lt;b&gt;Required fields &lt;/br&gt;1. taskId (Path Parameter)&lt;/br&gt;2. commentText &lt;/br&gt;

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

This service allows a user to create a milestone. The following fields(key:value) are required to be present in the Milestone JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API.&lt;/br&gt;&lt;b&gt;Required fields &lt;/br&gt;1. milestoneTitle &lt;/br&gt;2. milestoneDescription &lt;/br&gt;3. dueDate &lt;/br&gt;4. neverDue &lt;/br&gt;

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

This service allows a user to create a task. The following fields(key:value) are required to be present in the Task JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API.&lt;/br&gt; &lt;b&gt;Required fields &lt;/br&gt;1. taskTitle &lt;/br&gt;2. taskDescription &lt;/br&gt;3. priority &lt;/br&gt;4. dueDate &lt;/br&gt;5. assigneeUserId &lt;/br&gt;6. neverDue &lt;/br&gt;7. user: { userId }&lt;/b&gt;

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
String fields = "milestoneId,milestoneTitle,milestoneDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)milestoneId<br/>2)milestoneTitle<br/>3)milestoneDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)milestoneId<br/>2)milestoneTitle<br/>3)milestoneDescription<br/>4)createdDate<br/>5)status<br/>6)priority<br/>7)dueDate
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)milestoneId&lt;br/&gt;2)milestoneTitle&lt;br/&gt;3)milestoneDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)milestoneId&lt;br/&gt;2)milestoneTitle&lt;br/&gt;3)milestoneDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)status&lt;br/&gt;6)priority&lt;br/&gt;7)dueDate | [optional] [default to milestoneId,milestoneTitle,milestoneDescription,createdDate]
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
String fields = "taskId,taskTitle,taskDescription,dueDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)dueDate<br/><b>A) Available values-</b><br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)status<br/>5)priority<br/>6)dueDate<br/>7)milestoneName<br/>8)groupType<br/>9)groupName
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)dueDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)status&lt;br/&gt;5)priority&lt;br/&gt;6)dueDate&lt;br/&gt;7)milestoneName&lt;br/&gt;8)groupType&lt;br/&gt;9)groupName | [optional] [default to taskId,taskTitle,taskDescription,dueDate]
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
String fields = "milestoneId,milestoneTitle,milestoneDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)milestoneId<br/>2)milestoneTitle<br/>3)milestoneDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)milestoneId<br/>2)milestoneTitle<br/>3)milestoneDescription<br/>4)createdDate<br/>5)status<br/>6)priority<br/>7)dueDate
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)milestoneId&lt;br/&gt;2)milestoneTitle&lt;br/&gt;3)milestoneDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)milestoneId&lt;br/&gt;2)milestoneTitle&lt;br/&gt;3)milestoneDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)status&lt;br/&gt;6)priority&lt;br/&gt;7)dueDate | [optional] [default to milestoneId,milestoneTitle,milestoneDescription,createdDate]
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
Integer status = 56; // Integer | Task status <br/> 0 - ALL <br/> 1 - OPEN <br/> 2 - PERCENT_TWENTY <br/> 3 - PERCENT_FORTY <br/> 4 - PERCENT_SIXTY <br/> 5 - PERCENT_EIGHTY <br/> 6 - RESOLVED <br/> 7 - REOPENED
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "taskId,taskTitle,taskDescription,dueDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)dueDate<br/><b>A) Available values-</b><br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)status<br/>5)priority<br/>6)dueDate<br/>7)milestoneName<br/>8)groupType<br/>9)groupName
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
 **status** | **Integer**| Task status &lt;br/&gt; 0 - ALL &lt;br/&gt; 1 - OPEN &lt;br/&gt; 2 - PERCENT_TWENTY &lt;br/&gt; 3 - PERCENT_FORTY &lt;br/&gt; 4 - PERCENT_SIXTY &lt;br/&gt; 5 - PERCENT_EIGHTY &lt;br/&gt; 6 - RESOLVED &lt;br/&gt; 7 - REOPENED |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)dueDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)status&lt;br/&gt;5)priority&lt;br/&gt;6)dueDate&lt;br/&gt;7)milestoneName&lt;br/&gt;8)groupType&lt;br/&gt;9)groupName | [optional] [default to taskId,taskTitle,taskDescription,dueDate]
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
String fields = "milestoneId,milestoneTitle,milestoneDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)milestoneId<br/>2)milestoneTitle<br/>3)milestoneDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)milestoneId<br/>2)milestoneTitle<br/>3)milestoneDescription<br/>4)createdDate<br/>5)status<br/>6)priority<br/>7)dueDate
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)milestoneId&lt;br/&gt;2)milestoneTitle&lt;br/&gt;3)milestoneDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)milestoneId&lt;br/&gt;2)milestoneTitle&lt;br/&gt;3)milestoneDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)status&lt;br/&gt;6)priority&lt;br/&gt;7)dueDate | [optional] [default to milestoneId,milestoneTitle,milestoneDescription,createdDate]
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
Integer status = 56; // Integer | Task status <br/> 1 - OPEN <br/> 2 - PERCENT_TWENTY <br/> 3 - PERCENT_FORTY <br/> 4 - PERCENT_SIXTY <br/> 5 - PERCENT_EIGHTY <br/> 6 - RESOLVED <br/> 7 - REOPENED
Long reAssigneeUserId = 789L; // Long | re-assignee User Id
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "taskId,taskTitle,taskDescription,dueDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)dueDate<br/><b>A) Available values-</b><br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)status<br/>5)priority<br/>6)dueDate<br/>7)milestoneName<br/>8)groupType<br/>9)groupName
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
 **status** | **Integer**| Task status &lt;br/&gt; 1 - OPEN &lt;br/&gt; 2 - PERCENT_TWENTY &lt;br/&gt; 3 - PERCENT_FORTY &lt;br/&gt; 4 - PERCENT_SIXTY &lt;br/&gt; 5 - PERCENT_EIGHTY &lt;br/&gt; 6 - RESOLVED &lt;br/&gt; 7 - REOPENED |
 **reAssigneeUserId** | **Long**| re-assignee User Id |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)dueDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)status&lt;br/&gt;5)priority&lt;br/&gt;6)dueDate&lt;br/&gt;7)milestoneName&lt;br/&gt;8)groupType&lt;br/&gt;9)groupName | [optional] [default to taskId,taskTitle,taskDescription,dueDate]
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
Integer status = 56; // Integer | Task status <br/> 1 - OPEN <br/> 2 - PERCENT_TWENTY <br/> 3 - PERCENT_FORTY <br/> 4 - PERCENT_SIXTY <br/> 5 - PERCENT_EIGHTY <br/> 6 - RESOLVED <br/> 7 - REOPENED
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "taskId,taskTitle,taskDescription,dueDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)dueDate<br/><b>A) Available values-</b><br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)status<br/>5)priority<br/>6)dueDate<br/>7)milestoneName<br/>8)groupType<br/>9)groupName
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
 **status** | **Integer**| Task status &lt;br/&gt; 1 - OPEN &lt;br/&gt; 2 - PERCENT_TWENTY &lt;br/&gt; 3 - PERCENT_FORTY &lt;br/&gt; 4 - PERCENT_SIXTY &lt;br/&gt; 5 - PERCENT_EIGHTY &lt;br/&gt; 6 - RESOLVED &lt;br/&gt; 7 - REOPENED |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)dueDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)status&lt;br/&gt;5)priority&lt;br/&gt;6)dueDate&lt;br/&gt;7)milestoneName&lt;br/&gt;8)groupType&lt;br/&gt;9)groupName | [optional] [default to taskId,taskTitle,taskDescription,dueDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseTask**](VerveResponseTask.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

