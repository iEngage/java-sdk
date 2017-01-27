# ProjectManagementApi

All URIs are relative to *https://api.iengage.io:8243/api/1.0*

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
> VerveResponseComment addMilestoneComment(milestoneId, commentText, loggedInUserId, accessToken, clientToken)

Comment on milestone

Allows the user to comment on milestone. Returns the comments

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
String commentText = "commentText_example"; // String | commentText
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseComment result = apiInstance.addMilestoneComment(milestoneId, commentText, loggedInUserId, accessToken, clientToken);
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
 **commentText** | **String**| commentText |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseComment**](VerveResponseComment.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="addTaskComment"></a>
# **addTaskComment**
> VerveResponseComment addTaskComment(taskId, commentText, loggedInUserId, accessToken, clientToken)

Comment on task

Allows  the user to comment on task. Returns the task comment

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
String commentText = "commentText_example"; // String | commentText
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseComment result = apiInstance.addTaskComment(taskId, commentText, loggedInUserId, accessToken, clientToken);
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
 **commentText** | **String**| commentText |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseComment**](VerveResponseComment.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="createMilestone"></a>
# **createMilestone**
> VerveResponseMilestone createMilestone(title, description, dueDate, neverDue, loggedInUserId, accessToken, clientToken, organizationId, fields)

Create milestone

Allows the user to create milestone. Returns the created milestone

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
String title = "title_example"; // String | title
String description = "description_example"; // String | description
String dueDate = "dueDate_example"; // String | Due date(Format: MM-dd-yyyy HH:mm:ss a)
Boolean neverDue = true; // Boolean | neverDue. If neverDue is true, it takes higher priority than dueDate
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long organizationId = 789L; // Long | organizationId
String fields = "milestoneId,milestoneTitle,milestoneDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)milestoneId<br/>2)milestoneTitle<br/>3)milestoneDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)milestoneId<br/>2)milestoneTitle<br/>3)milestoneDescription<br/>4)createdDate<br/>5)status<br/>6)priority<br/>7)dueDate
try {
    VerveResponseMilestone result = apiInstance.createMilestone(title, description, dueDate, neverDue, loggedInUserId, accessToken, clientToken, organizationId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#createMilestone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **String**| title |
 **description** | **String**| description |
 **dueDate** | **String**| Due date(Format: MM-dd-yyyy HH:mm:ss a) |
 **neverDue** | **Boolean**| neverDue. If neverDue is true, it takes higher priority than dueDate |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **organizationId** | **Long**| organizationId | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)milestoneId&lt;br/&gt;2)milestoneTitle&lt;br/&gt;3)milestoneDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)milestoneId&lt;br/&gt;2)milestoneTitle&lt;br/&gt;3)milestoneDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)status&lt;br/&gt;6)priority&lt;br/&gt;7)dueDate | [optional] [default to milestoneId,milestoneTitle,milestoneDescription,createdDate]

### Return type

[**VerveResponseMilestone**](VerveResponseMilestone.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="createTask"></a>
# **createTask**
> VerveResponseTask createTask(title, description, priority, assigneeUserId, dueDate, neverDue, milestoneId, loggedInUserId, accessToken, clientToken, fields)

Create task

Allows user to create task. Returns the created task

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
String title = "title_example"; // String | title
String description = "description_example"; // String | description
Integer priority = 56; // Integer | Task priority <br/> 1 - HIGH <br/> 2 - LOW <br/> 3 - NORMAL
Long assigneeUserId = 789L; // Long | assignee User Id
String dueDate = "dueDate_example"; // String | Due date (Format: MM-dd-yyyy HH:mm:ss a)
Boolean neverDue = true; // Boolean | neverDue. If neverDue is true, it takes higher priority than dueDate
Long milestoneId = 789L; // Long | Milestone Id
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "taskId,taskTitle,taskDescription,dueDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)dueDate<br/><b>A) Available values-</b><br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)status<br/>5)priority<br/>6)dueDate<br/>7)milestoneName<br/>8)groupType<br/>9)groupName
try {
    VerveResponseTask result = apiInstance.createTask(title, description, priority, assigneeUserId, dueDate, neverDue, milestoneId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#createTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **String**| title |
 **description** | **String**| description |
 **priority** | **Integer**| Task priority &lt;br/&gt; 1 - HIGH &lt;br/&gt; 2 - LOW &lt;br/&gt; 3 - NORMAL |
 **assigneeUserId** | **Long**| assignee User Id |
 **dueDate** | **String**| Due date (Format: MM-dd-yyyy HH:mm:ss a) |
 **neverDue** | **Boolean**| neverDue. If neverDue is true, it takes higher priority than dueDate |
 **milestoneId** | **Long**| Milestone Id |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)dueDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)status&lt;br/&gt;5)priority&lt;br/&gt;6)dueDate&lt;br/&gt;7)milestoneName&lt;br/&gt;8)groupType&lt;br/&gt;9)groupName | [optional] [default to taskId,taskTitle,taskDescription,dueDate]

### Return type

[**VerveResponseTask**](VerveResponseTask.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="deleteMilestone"></a>
# **deleteMilestone**
> VerveResponseMilestone deleteMilestone(milestoneId, loggedInUserId, accessToken, clientToken, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "milestoneId,milestoneTitle,milestoneDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)milestoneId<br/>2)milestoneTitle<br/>3)milestoneDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)milestoneId<br/>2)milestoneTitle<br/>3)milestoneDescription<br/>4)createdDate<br/>5)status<br/>6)priority<br/>7)dueDate
try {
    VerveResponseMilestone result = apiInstance.deleteMilestone(milestoneId, loggedInUserId, accessToken, clientToken, fields);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)milestoneId&lt;br/&gt;2)milestoneTitle&lt;br/&gt;3)milestoneDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)milestoneId&lt;br/&gt;2)milestoneTitle&lt;br/&gt;3)milestoneDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)status&lt;br/&gt;6)priority&lt;br/&gt;7)dueDate | [optional] [default to milestoneId,milestoneTitle,milestoneDescription,createdDate]

### Return type

[**VerveResponseMilestone**](VerveResponseMilestone.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="deleteTask"></a>
# **deleteTask**
> VerveResponseTask deleteTask(taskId, loggedInUserId, accessToken, clientToken, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "taskId,taskTitle,taskDescription,dueDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)dueDate<br/><b>A) Available values-</b><br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)status<br/>5)priority<br/>6)dueDate<br/>7)milestoneName<br/>8)groupType<br/>9)groupName
try {
    VerveResponseTask result = apiInstance.deleteTask(taskId, loggedInUserId, accessToken, clientToken, fields);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)dueDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)status&lt;br/&gt;5)priority&lt;br/&gt;6)dueDate&lt;br/&gt;7)milestoneName&lt;br/&gt;8)groupType&lt;br/&gt;9)groupName | [optional] [default to taskId,taskTitle,taskDescription,dueDate]

### Return type

[**VerveResponseTask**](VerveResponseTask.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="getMilestones"></a>
# **getMilestones**
> VerveResponseMilestoneList getMilestones(loggedInUserId, accessToken, clientToken, organizationId, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long organizationId = 789L; // Long | organizationId
String fields = "milestoneId,milestoneTitle,milestoneDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)milestoneId<br/>2)milestoneTitle<br/>3)milestoneDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)milestoneId<br/>2)milestoneTitle<br/>3)milestoneDescription<br/>4)createdDate<br/>5)status<br/>6)priority<br/>7)dueDate
try {
    VerveResponseMilestoneList result = apiInstance.getMilestones(loggedInUserId, accessToken, clientToken, organizationId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#getMilestones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **organizationId** | **Long**| organizationId | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)milestoneId&lt;br/&gt;2)milestoneTitle&lt;br/&gt;3)milestoneDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)milestoneId&lt;br/&gt;2)milestoneTitle&lt;br/&gt;3)milestoneDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)status&lt;br/&gt;6)priority&lt;br/&gt;7)dueDate | [optional] [default to milestoneId,milestoneTitle,milestoneDescription,createdDate]

### Return type

[**VerveResponseMilestoneList**](VerveResponseMilestoneList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMilestonesComments"></a>
# **getMilestonesComments**
> VerveResponseCommentList getMilestonesComments(milestoneId, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseCommentList result = apiInstance.getMilestonesComments(milestoneId, loggedInUserId, accessToken, clientToken);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseCommentList**](VerveResponseCommentList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskComments"></a>
# **getTaskComments**
> VerveResponseCommentList getTaskComments(taskId, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseCommentList result = apiInstance.getTaskComments(taskId, loggedInUserId, accessToken, clientToken);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseCommentList**](VerveResponseCommentList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserTasks"></a>
# **getUserTasks**
> VerveResponseTaskList getUserTasks(userId, status, loggedInUserId, accessToken, clientToken, fields)

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
Long userId = 789L; // Long | userId
Integer status = 56; // Integer | Task status <br/> 0 - ALL <br/> 1 - OPEN <br/> 2 - PERCENT_TWENTY <br/> 3 - PERCENT_FORTY <br/> 4 - PERCENT_SIXTY <br/> 5 - PERCENT_EIGHTY <br/> 6 - RESOLVED <br/> 7 - REOPENED
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "taskId,taskTitle,taskDescription,dueDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)dueDate<br/><b>A) Available values-</b><br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)status<br/>5)priority<br/>6)dueDate<br/>7)milestoneName<br/>8)groupType<br/>9)groupName
try {
    VerveResponseTaskList result = apiInstance.getUserTasks(userId, status, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectManagementApi#getUserTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **status** | **Integer**| Task status &lt;br/&gt; 0 - ALL &lt;br/&gt; 1 - OPEN &lt;br/&gt; 2 - PERCENT_TWENTY &lt;br/&gt; 3 - PERCENT_FORTY &lt;br/&gt; 4 - PERCENT_SIXTY &lt;br/&gt; 5 - PERCENT_EIGHTY &lt;br/&gt; 6 - RESOLVED &lt;br/&gt; 7 - REOPENED |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)dueDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)status&lt;br/&gt;5)priority&lt;br/&gt;6)dueDate&lt;br/&gt;7)milestoneName&lt;br/&gt;8)groupType&lt;br/&gt;9)groupName | [optional] [default to taskId,taskTitle,taskDescription,dueDate]

### Return type

[**VerveResponseTaskList**](VerveResponseTaskList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMilestone"></a>
# **updateMilestone**
> VerveResponseMilestone updateMilestone(milestoneId, title, description, dueDate, loggedInUserId, accessToken, clientToken, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "milestoneId,milestoneTitle,milestoneDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)milestoneId<br/>2)milestoneTitle<br/>3)milestoneDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)milestoneId<br/>2)milestoneTitle<br/>3)milestoneDescription<br/>4)createdDate<br/>5)status<br/>6)priority<br/>7)dueDate
try {
    VerveResponseMilestone result = apiInstance.updateMilestone(milestoneId, title, description, dueDate, loggedInUserId, accessToken, clientToken, fields);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)milestoneId&lt;br/&gt;2)milestoneTitle&lt;br/&gt;3)milestoneDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)milestoneId&lt;br/&gt;2)milestoneTitle&lt;br/&gt;3)milestoneDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)status&lt;br/&gt;6)priority&lt;br/&gt;7)dueDate | [optional] [default to milestoneId,milestoneTitle,milestoneDescription,createdDate]

### Return type

[**VerveResponseMilestone**](VerveResponseMilestone.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="updateTask"></a>
# **updateTask**
> VerveResponseTask updateTask(taskId, title, description, dueDate, status, reAssigneeUserId, loggedInUserId, accessToken, clientToken, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "taskId,taskTitle,taskDescription,dueDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)dueDate<br/><b>A) Available values-</b><br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)status<br/>5)priority<br/>6)dueDate<br/>7)milestoneName<br/>8)groupType<br/>9)groupName
try {
    VerveResponseTask result = apiInstance.updateTask(taskId, title, description, dueDate, status, reAssigneeUserId, loggedInUserId, accessToken, clientToken, fields);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)dueDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)status&lt;br/&gt;5)priority&lt;br/&gt;6)dueDate&lt;br/&gt;7)milestoneName&lt;br/&gt;8)groupType&lt;br/&gt;9)groupName | [optional] [default to taskId,taskTitle,taskDescription,dueDate]

### Return type

[**VerveResponseTask**](VerveResponseTask.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="updateTaskStatus"></a>
# **updateTaskStatus**
> VerveResponseTask updateTaskStatus(taskId, status, loggedInUserId, accessToken, clientToken, fields)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "taskId,taskTitle,taskDescription,dueDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)dueDate<br/><b>A) Available values-</b><br/>1)taskId<br/>2)taskTitle<br/>3)taskDescription<br/>4)status<br/>5)priority<br/>6)dueDate<br/>7)milestoneName<br/>8)groupType<br/>9)groupName
try {
    VerveResponseTask result = apiInstance.updateTaskStatus(taskId, status, loggedInUserId, accessToken, clientToken, fields);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)dueDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)taskId&lt;br/&gt;2)taskTitle&lt;br/&gt;3)taskDescription&lt;br/&gt;4)status&lt;br/&gt;5)priority&lt;br/&gt;6)dueDate&lt;br/&gt;7)milestoneName&lt;br/&gt;8)groupType&lt;br/&gt;9)groupName | [optional] [default to taskId,taskTitle,taskDescription,dueDate]

### Return type

[**VerveResponseTask**](VerveResponseTask.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

