# ComplaintApi

All URIs are relative to *https://api.iengage.io:8243/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addComplaint**](ComplaintApi.md#addComplaint) | **POST** /complaints | Share complaint without attachment
[**addComplaint_0**](ComplaintApi.md#addComplaint_0) | **POST** /complaints/attachment | Share complaint with attachment
[**addSolution**](ComplaintApi.md#addSolution) | **POST** /complaints/{complaintId}/solutions | Share solution on complaint
[**createComplaintCategory**](ComplaintApi.md#createComplaintCategory) | **POST** /complaints/categories | Create complaint category
[**deleteComplaint**](ComplaintApi.md#deleteComplaint) | **DELETE** /complaints/{complaintId} | Delete complaint
[**deleteComplaintCategory**](ComplaintApi.md#deleteComplaintCategory) | **DELETE** /complaints/categories/{categoryId} | Delete complaint cotegory
[**deleteSolution**](ComplaintApi.md#deleteSolution) | **DELETE** /complaints/solutions/{solutionId} | Delete solution
[**dislikeSolution**](ComplaintApi.md#dislikeSolution) | **POST** /complaints/{complaintId}/solutions/{solutionId}/dislike | Dislike Solution
[**getComplaint**](ComplaintApi.md#getComplaint) | **GET** /complaints/{complaintId} | Get complaint by id
[**getComplaintCategories**](ComplaintApi.md#getComplaintCategories) | **GET** /complaints/categories | Get list of complaint category
[**getComplaintsForUser**](ComplaintApi.md#getComplaintsForUser) | **GET** /complaints | Get list of all complaint visible for user
[**getFriendsComplaints**](ComplaintApi.md#getFriendsComplaints) | **GET** /complaints/friends | Get list of complaints shared by your friends
[**getRecommendComplaint**](ComplaintApi.md#getRecommendComplaint) | **GET** /complaints/recommend | Get list of recommended complaints
[**getRecommendedComplaintsFromDB**](ComplaintApi.md#getRecommendedComplaintsFromDB) | **GET** /complaints/{userId}/recommendedComplaints | Get list of recommended complaints from DB
[**getRecommendedUsersFromDB**](ComplaintApi.md#getRecommendedUsersFromDB) | **GET** /complaints/{complaintId}/recommendedUsers | Get list of recommended Users from DB
[**getSolutions**](ComplaintApi.md#getSolutions) | **GET** /complaints/{complaintId}/solutions | Get list of solutions by ComplaintId
[**getUserComplaints**](ComplaintApi.md#getUserComplaints) | **GET** /complaints/{userId}/shared | Get list of complaints shared by user
[**getUserSubscribedComplaintCategories**](ComplaintApi.md#getUserSubscribedComplaintCategories) | **GET** /complaints/categories/{userId}/subscribe | Get list of Complaint categories subscribed by user
[**getUserSubscribedComplaints**](ComplaintApi.md#getUserSubscribedComplaints) | **GET** /complaints/{userId}/subscribe | Get list of complaints subscribed by user
[**likeSolution**](ComplaintApi.md#likeSolution) | **POST** /complaints/{complaintId}/solutions/{solutionId}/like | Like solution
[**markAsAnSolution**](ComplaintApi.md#markAsAnSolution) | **POST** /complaints/{complaintId}/solutions/{solutionId}/mark | Mark solution as a solution
[**searchComplaints**](ComplaintApi.md#searchComplaints) | **GET** /complaints/search | Get list of complaints by search
[**subscribeComplaint**](ComplaintApi.md#subscribeComplaint) | **POST** /complaints/{complaintId}/subscribe | Subscribe complaint
[**subscribeComplaintCategory**](ComplaintApi.md#subscribeComplaintCategory) | **POST** /complaints/categories/{categoryId}/subscribe | Subscribe complaint category
[**unmarkAsAnSolution**](ComplaintApi.md#unmarkAsAnSolution) | **POST** /complaints/{complaintId}/solutions/{solutionId}/unmark | Unmark solution as a solution
[**unsubscribeComplaint**](ComplaintApi.md#unsubscribeComplaint) | **POST** /complaints/{complaintId}/unsubscribe | Unsubscribe Complaint
[**unsubscribeComplaintCategory**](ComplaintApi.md#unsubscribeComplaintCategory) | **POST** /complaints/categories/{categoryId}/unsubscribe | Unsubscribe complaint category
[**updateComplaint**](ComplaintApi.md#updateComplaint) | **PUT** /complaints/{complaintId} | Update complaint
[**updateComplaintCategory**](ComplaintApi.md#updateComplaintCategory) | **PUT** /complaints/categories/{categoryId} | Update complaint category
[**updateSolution**](ComplaintApi.md#updateSolution) | **PUT** /complaints/solutions/{solutionId} | Update solution


<a name="addComplaint"></a>
# **addComplaint**
> VerveResponseComplaint addComplaint(categoryId, complaintTitle, complaintDescription, loggedInUserId, accessToken, clientToken)

Share complaint without attachment

Allows the user to share complaint. Returns complaint

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long categoryId = 789L; // Long | categoryId
String complaintTitle = "complaintTitle_example"; // String | Complaint Title
String complaintDescription = "complaintDescription_example"; // String | Describe complaint
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseComplaint result = apiInstance.addComplaint(categoryId, complaintTitle, complaintDescription, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#addComplaint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Long**| categoryId |
 **complaintTitle** | **String**| Complaint Title |
 **complaintDescription** | **String**| Describe complaint |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseComplaint**](VerveResponseComplaint.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="addComplaint_0"></a>
# **addComplaint_0**
> VerveResponseComplaint addComplaint_0(body, body2, body3, loggedInUserId, accessToken, clientToken, body4)

Share complaint with attachment

Allows the user to share complaints. Returns the complaint object

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long body = 789L; // Long | categoryId
String body2 = "body_example"; // String | complaintTitle
String body3 = "body_example"; // String | complaintDescription
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
List<Attachment> body4 = Arrays.asList(new Attachment()); // List<Attachment> | 
try {
    VerveResponseComplaint result = apiInstance.addComplaint_0(body, body2, body3, loggedInUserId, accessToken, clientToken, body4);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#addComplaint_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Long**| categoryId |
 **body2** | **String**| complaintTitle |
 **body3** | **String**| complaintDescription |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body4** | [**List&lt;Attachment&gt;**](Attachment.md)|  | [optional]

### Return type

[**VerveResponseComplaint**](VerveResponseComplaint.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="addSolution"></a>
# **addSolution**
> VerveResponseSolution addSolution(complaintId, solution, loggedInUserId, accessToken, clientToken, fields)

Share solution on complaint

Allows the user to share a solution on complaint

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long complaintId = 789L; // Long | complaintId
String solution = "solution_example"; // String | solution
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "solutionId,solutionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/><b>A) Available values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/>4)complaintId<br/>5)solvingUser<br/>6)isMarkedSolution<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseSolution result = apiInstance.addSolution(complaintId, solution, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#addSolution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complaintId** | **Long**| complaintId |
 **solution** | **String**| solution |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)complaintId&lt;br/&gt;5)solvingUser&lt;br/&gt;6)isMarkedSolution&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to solutionId,solutionDescription,createdDate]

### Return type

[**VerveResponseSolution**](VerveResponseSolution.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="createComplaintCategory"></a>
# **createComplaintCategory**
> VerveResponseComplaintCategory createComplaintCategory(name, description, loggedInUserId, accessToken, clientToken, organizationId, fields)

Create complaint category

Allows the user to create complaint category. Returns the created complaint category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
String name = "name_example"; // String | Name
String description = "description_example"; // String | description
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long organizationId = 789L; // Long | OrganizationId
String fields = "categoryId,categoryName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2) categoryName<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed
try {
    VerveResponseComplaintCategory result = apiInstance.createComplaintCategory(name, description, loggedInUserId, accessToken, clientToken, organizationId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#createComplaintCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name |
 **description** | **String**| description |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **organizationId** | **Long**| OrganizationId | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2) categoryName&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed | [optional] [default to categoryId,categoryName]

### Return type

[**VerveResponseComplaintCategory**](VerveResponseComplaintCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="deleteComplaint"></a>
# **deleteComplaint**
> VerveResponseComplaint deleteComplaint(complaintId, loggedInUserId, accessToken, clientToken, fields)

Delete complaint

Allows the user to delete complaint. Returns the deleted complaint

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long complaintId = 789L; // Long | complaintId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "complaintId,complaintTitle,complaintDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)createdDate<br/><b>A) Availablevalues-</b><br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)issuer<br/>5)noOfSolutions<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseComplaint result = apiInstance.deleteComplaint(complaintId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#deleteComplaint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complaintId** | **Long**| complaintId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Availablevalues-&lt;/b&gt;&lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfSolutions&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to complaintId,complaintTitle,complaintDescription,createdDate]

### Return type

[**VerveResponseComplaint**](VerveResponseComplaint.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="deleteComplaintCategory"></a>
# **deleteComplaintCategory**
> VerveResponseComplaintCategory deleteComplaintCategory(categoryId, loggedInUserId, accessToken, clientToken, fields)

Delete complaint cotegory

Returns the deleted complaint category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long categoryId = 789L; // Long | categoryId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2) categoryName<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed
try {
    VerveResponseComplaintCategory result = apiInstance.deleteComplaintCategory(categoryId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#deleteComplaintCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Long**| categoryId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2) categoryName&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed | [optional] [default to categoryId,categoryName]

### Return type

[**VerveResponseComplaintCategory**](VerveResponseComplaintCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="deleteSolution"></a>
# **deleteSolution**
> VerveResponseSolution deleteSolution(solutionId, loggedInUserId, accessToken, clientToken, fields)

Delete solution

Allows the user to delete solution. Returns the deleted solution

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long solutionId = 789L; // Long | solutionId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "solutionId,solutionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/><b>A) Available values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/>4)complaintId<br/>5)solvingUser<br/>6)isMarkedSolution<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseSolution result = apiInstance.deleteSolution(solutionId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#deleteSolution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **solutionId** | **Long**| solutionId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)complaintId&lt;br/&gt;5)solvingUser&lt;br/&gt;6)isMarkedSolution&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to solutionId,solutionDescription,createdDate]

### Return type

[**VerveResponseSolution**](VerveResponseSolution.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="dislikeSolution"></a>
# **dislikeSolution**
> VerveResponseSolution dislikeSolution(complaintId, solutionId, loggedInUserId, accessToken, clientToken, fields)

Dislike Solution

Allows the user to dislike the solution. Returns the disliked solution

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long complaintId = 789L; // Long | complaintId
Long solutionId = 789L; // Long | solutionId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "solutionId,solutionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/><b>A) Available values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/>4)complaintId<br/>5)solvingUser<br/>6)isMarkedSolution<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseSolution result = apiInstance.dislikeSolution(complaintId, solutionId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#dislikeSolution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complaintId** | **Long**| complaintId |
 **solutionId** | **Long**| solutionId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)complaintId&lt;br/&gt;5)solvingUser&lt;br/&gt;6)isMarkedSolution&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to solutionId,solutionDescription,createdDate]

### Return type

[**VerveResponseSolution**](VerveResponseSolution.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="getComplaint"></a>
# **getComplaint**
> VerveResponseComplaint getComplaint(complaintId, loggedInUserId, accessToken, clientToken, fields)

Get complaint by id

Returns the complaint by id

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long complaintId = 789L; // Long | complaintId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "complaintId,complaintTitle,complaintDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)createdDate<br/><b>A) Availablevalues-</b><br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)issuer<br/>5)noOfSolutions<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseComplaint result = apiInstance.getComplaint(complaintId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#getComplaint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complaintId** | **Long**| complaintId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Availablevalues-&lt;/b&gt;&lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfSolutions&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to complaintId,complaintTitle,complaintDescription,createdDate]

### Return type

[**VerveResponseComplaint**](VerveResponseComplaint.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getComplaintCategories"></a>
# **getComplaintCategories**
> VerveResponseComplaintCategoryList getComplaintCategories(start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of complaint category

Returns the list of complaint category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2) categoryName<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed
try {
    VerveResponseComplaintCategoryList result = apiInstance.getComplaintCategories(start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#getComplaintCategories");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2) categoryName&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed | [optional] [default to categoryId,categoryName]

### Return type

[**VerveResponseComplaintCategoryList**](VerveResponseComplaintCategoryList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getComplaintsForUser"></a>
# **getComplaintsForUser**
> VerveResponseComplaintList getComplaintsForUser(complaintStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields)

Get list of all complaint visible for user

Returns the list of all complaints visible for user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
String complaintStatus = "complaintStatus_example"; // String | Complaint status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String fields = "complaintId,complaintTitle,complaintDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)createdDate<br/><b>A) Availablevalues-</b><br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)issuer<br/>5)noOfSolutions<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseComplaintList result = apiInstance.getComplaintsForUser(complaintStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#getComplaintsForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complaintStatus** | **String**| Complaint status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Availablevalues-&lt;/b&gt;&lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfSolutions&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to complaintId,complaintTitle,complaintDescription,createdDate]

### Return type

[**VerveResponseComplaintList**](VerveResponseComplaintList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFriendsComplaints"></a>
# **getFriendsComplaints**
> VerveResponseComplaintList getFriendsComplaints(complaintStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields)

Get list of complaints shared by your friends

Returns the list of complaints shared by friends

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
String complaintStatus = "complaintStatus_example"; // String | Complaint status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String fields = "complaintId,complaintTitle,complaintDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)createdDate<br/><b>A) Availablevalues-</b><br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)issuer<br/>5)noOfSolutions<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseComplaintList result = apiInstance.getFriendsComplaints(complaintStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#getFriendsComplaints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complaintStatus** | **String**| Complaint status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Availablevalues-&lt;/b&gt;&lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfSolutions&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to complaintId,complaintTitle,complaintDescription,createdDate]

### Return type

[**VerveResponseComplaintList**](VerveResponseComplaintList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendComplaint"></a>
# **getRecommendComplaint**
> VerveResponseComplaintList getRecommendComplaint(start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of recommended complaints

Returns the list of recommended complaints

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "complaintId,complaintTitle,complaintDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)createdDate<br/><b>A) Availablevalues-</b><br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)issuer<br/>5)noOfSolutions<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseComplaintList result = apiInstance.getRecommendComplaint(start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#getRecommendComplaint");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Availablevalues-&lt;/b&gt;&lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfSolutions&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to complaintId,complaintTitle,complaintDescription,createdDate]

### Return type

[**VerveResponseComplaintList**](VerveResponseComplaintList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendedComplaintsFromDB"></a>
# **getRecommendedComplaintsFromDB**
> VerveResponseComplaintList getRecommendedComplaintsFromDB(userId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of recommended complaints from DB

Returns the list of recommended complaints from DB

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long userId = 789L; // Long | userId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "complaintId,complaintTitle,complaintDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)createdDate<br/><b>A) Availablevalues-</b><br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)issuer<br/>5)noOfSolutions<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseComplaintList result = apiInstance.getRecommendedComplaintsFromDB(userId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#getRecommendedComplaintsFromDB");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Availablevalues-&lt;/b&gt;&lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfSolutions&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to complaintId,complaintTitle,complaintDescription,createdDate]

### Return type

[**VerveResponseComplaintList**](VerveResponseComplaintList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendedUsersFromDB"></a>
# **getRecommendedUsersFromDB**
> VerveResponseUserList getRecommendedUsersFromDB(complaintId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of recommended Users from DB

Returns the list of recommended users from DB

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long complaintId = 789L; // Long | complaintId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "userId,firstName,lastName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)userId<br/>2)firstName<br/>3)lastName<br/>4)profileImage<br/><b>A) Available values-</b><br/>1)userId<br/>2)firstName<br/>3)lastName<br/>4)emailId<br/>5)profileImage<br/>6)birthDate<br/>7)currentUserFollowing<br/>8)currentUserFriend<br/>9)equityScore
try {
    VerveResponseUserList result = apiInstance.getRecommendedUsersFromDB(complaintId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#getRecommendedUsersFromDB");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complaintId** | **Long**| complaintId |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)userId&lt;br/&gt;2)firstName&lt;br/&gt;3)lastName&lt;br/&gt;4)profileImage&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)userId&lt;br/&gt;2)firstName&lt;br/&gt;3)lastName&lt;br/&gt;4)emailId&lt;br/&gt;5)profileImage&lt;br/&gt;6)birthDate&lt;br/&gt;7)currentUserFollowing&lt;br/&gt;8)currentUserFriend&lt;br/&gt;9)equityScore | [optional] [default to userId,firstName,lastName]

### Return type

[**VerveResponseUserList**](VerveResponseUserList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSolutions"></a>
# **getSolutions**
> VerveResponseSolutionList getSolutions(complaintId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of solutions by ComplaintId

Return the list of solutions

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long complaintId = 789L; // Long | complaintId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "solutionId,solutionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/><b>A) Available values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/>4)complaintId<br/>5)solvingUser<br/>6)isMarkedSolution<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseSolutionList result = apiInstance.getSolutions(complaintId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#getSolutions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complaintId** | **Long**| complaintId |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)complaintId&lt;br/&gt;5)solvingUser&lt;br/&gt;6)isMarkedSolution&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to solutionId,solutionDescription,createdDate]

### Return type

[**VerveResponseSolutionList**](VerveResponseSolutionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserComplaints"></a>
# **getUserComplaints**
> VerveResponseComplaintList getUserComplaints(userId, complaintStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields)

Get list of complaints shared by user

Returns the list of complaints shared by the user himself

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long userId = 789L; // Long | userId
String complaintStatus = "complaintStatus_example"; // String | Complaint status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String fields = "complaintId,complaintTitle,complaintDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)createdDate<br/><b>A) Availablevalues-</b><br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)issuer<br/>5)noOfSolutions<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseComplaintList result = apiInstance.getUserComplaints(userId, complaintStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#getUserComplaints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **complaintStatus** | **String**| Complaint status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Availablevalues-&lt;/b&gt;&lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfSolutions&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to complaintId,complaintTitle,complaintDescription,createdDate]

### Return type

[**VerveResponseComplaintList**](VerveResponseComplaintList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSubscribedComplaintCategories"></a>
# **getUserSubscribedComplaintCategories**
> VerveResponseComplaintCategoryList getUserSubscribedComplaintCategories(userId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of Complaint categories subscribed by user

Returns the list of complaint categories subscribed by user himself

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long userId = 789L; // Long | userId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2) categoryName<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed
try {
    VerveResponseComplaintCategoryList result = apiInstance.getUserSubscribedComplaintCategories(userId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#getUserSubscribedComplaintCategories");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2) categoryName&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed | [optional] [default to categoryId,categoryName]

### Return type

[**VerveResponseComplaintCategoryList**](VerveResponseComplaintCategoryList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSubscribedComplaints"></a>
# **getUserSubscribedComplaints**
> VerveResponseComplaintList getUserSubscribedComplaints(userId, complaintStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields)

Get list of complaints subscribed by user

Returns the list of complaints subscribed by user himself

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long userId = 789L; // Long | userId
String complaintStatus = "complaintStatus_example"; // String | Complaint status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String fields = "complaintId,complaintTitle,complaintDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)createdDate<br/><b>A) Availablevalues-</b><br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)issuer<br/>5)noOfSolutions<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseComplaintList result = apiInstance.getUserSubscribedComplaints(userId, complaintStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#getUserSubscribedComplaints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **complaintStatus** | **String**| Complaint status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Availablevalues-&lt;/b&gt;&lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfSolutions&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to complaintId,complaintTitle,complaintDescription,createdDate]

### Return type

[**VerveResponseComplaintList**](VerveResponseComplaintList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="likeSolution"></a>
# **likeSolution**
> VerveResponseSolution likeSolution(complaintId, solutionId, loggedInUserId, accessToken, clientToken, fields)

Like solution

Allows the user to like the solution. Returns the liked solution

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long complaintId = 789L; // Long | complaintId
Long solutionId = 789L; // Long | solutionId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "solutionId,solutionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/><b>A) Available values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/>4)complaintId<br/>5)solvingUser<br/>6)isMarkedSolution<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseSolution result = apiInstance.likeSolution(complaintId, solutionId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#likeSolution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complaintId** | **Long**| complaintId |
 **solutionId** | **Long**| solutionId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)complaintId&lt;br/&gt;5)solvingUser&lt;br/&gt;6)isMarkedSolution&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to solutionId,solutionDescription,createdDate]

### Return type

[**VerveResponseSolution**](VerveResponseSolution.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="markAsAnSolution"></a>
# **markAsAnSolution**
> VerveResponseSolution markAsAnSolution(complaintId, solutionId, loggedInUserId, accessToken, clientToken, fields)

Mark solution as a solution

Allows the user to mark a solution. This means user is satisfied with the solution &amp; the complaint will be closed

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long complaintId = 789L; // Long | complaintId
Long solutionId = 789L; // Long | solutionId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "solutionId,solutionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/><b>A) Available values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/>4)complaintId<br/>5)solvingUser<br/>6)isMarkedSolution<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseSolution result = apiInstance.markAsAnSolution(complaintId, solutionId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#markAsAnSolution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complaintId** | **Long**| complaintId |
 **solutionId** | **Long**| solutionId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)complaintId&lt;br/&gt;5)solvingUser&lt;br/&gt;6)isMarkedSolution&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to solutionId,solutionDescription,createdDate]

### Return type

[**VerveResponseSolution**](VerveResponseSolution.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="searchComplaints"></a>
# **searchComplaints**
> VerveResponseComplaint searchComplaints(searchText, complaintStatus, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of complaints by search

Returns the list of matching complaints

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
String searchText = "searchText_example"; // String | Enter text to be searched
String complaintStatus = "complaintStatus_example"; // String | Complaint status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "complaintId,complaintTitle,complaintDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)createdDate<br/><b>A) Availablevalues-</b><br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)issuer<br/>5)noOfSolutions<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseComplaint result = apiInstance.searchComplaints(searchText, complaintStatus, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#searchComplaints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchText** | **String**| Enter text to be searched |
 **complaintStatus** | **String**| Complaint status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Availablevalues-&lt;/b&gt;&lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfSolutions&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to complaintId,complaintTitle,complaintDescription,createdDate]

### Return type

[**VerveResponseComplaint**](VerveResponseComplaint.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subscribeComplaint"></a>
# **subscribeComplaint**
> VerveResponseComplaint subscribeComplaint(complaintId, loggedInUserId, accessToken, clientToken, fields)

Subscribe complaint

Allows the user to subscribe a complaint. Returns the subscibed complaint

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long complaintId = 789L; // Long | complaintId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "complaintId,complaintTitle,complaintDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)createdDate<br/><b>A) Availablevalues-</b><br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)issuer<br/>5)noOfSolutions<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseComplaint result = apiInstance.subscribeComplaint(complaintId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#subscribeComplaint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complaintId** | **Long**| complaintId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Availablevalues-&lt;/b&gt;&lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfSolutions&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to complaintId,complaintTitle,complaintDescription,createdDate]

### Return type

[**VerveResponseComplaint**](VerveResponseComplaint.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="subscribeComplaintCategory"></a>
# **subscribeComplaintCategory**
> VerveResponseComplaintCategory subscribeComplaintCategory(categoryId, loggedInUserId, accessToken, clientToken, fields)

Subscribe complaint category

Allows the user to subscribe complaint category. Returns the subscribed complaint category.

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long categoryId = 789L; // Long | categoryId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2) categoryName<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed
try {
    VerveResponseComplaintCategory result = apiInstance.subscribeComplaintCategory(categoryId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#subscribeComplaintCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Long**| categoryId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2) categoryName&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed | [optional] [default to categoryId,categoryName]

### Return type

[**VerveResponseComplaintCategory**](VerveResponseComplaintCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="unmarkAsAnSolution"></a>
# **unmarkAsAnSolution**
> VerveResponseSolution unmarkAsAnSolution(complaintId, solutionId, loggedInUserId, accessToken, clientToken, fields)

Unmark solution as a solution

Allows the user to unmark a solution. This will remove the marked solution.

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long complaintId = 789L; // Long | complaintId
Long solutionId = 789L; // Long | solutionId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "solutionId,solutionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/><b>A) Available values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/>4)complaintId<br/>5)solvingUser<br/>6)isMarkedSolution<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseSolution result = apiInstance.unmarkAsAnSolution(complaintId, solutionId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#unmarkAsAnSolution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complaintId** | **Long**| complaintId |
 **solutionId** | **Long**| solutionId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)complaintId&lt;br/&gt;5)solvingUser&lt;br/&gt;6)isMarkedSolution&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to solutionId,solutionDescription,createdDate]

### Return type

[**VerveResponseSolution**](VerveResponseSolution.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="unsubscribeComplaint"></a>
# **unsubscribeComplaint**
> VerveResponseComplaint unsubscribeComplaint(complaintId, loggedInUserId, accessToken, clientToken, fields)

Unsubscribe Complaint

Allows the user to unsubscribe complaint. Returns the unsubscribed complaint

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long complaintId = 789L; // Long | complaintId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "complaintId,complaintTitle,complaintDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)createdDate<br/><b>A) Availablevalues-</b><br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)issuer<br/>5)noOfSolutions<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseComplaint result = apiInstance.unsubscribeComplaint(complaintId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#unsubscribeComplaint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complaintId** | **Long**| complaintId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Availablevalues-&lt;/b&gt;&lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfSolutions&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to complaintId,complaintTitle,complaintDescription,createdDate]

### Return type

[**VerveResponseComplaint**](VerveResponseComplaint.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="unsubscribeComplaintCategory"></a>
# **unsubscribeComplaintCategory**
> VerveResponseComplaintCategory unsubscribeComplaintCategory(categoryId, loggedInUserId, accessToken, clientToken, fields)

Unsubscribe complaint category

Allows the user to unsubscribe complaint category. Returns the unsubscribed complaint category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long categoryId = 789L; // Long | categoryId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2) categoryName<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed
try {
    VerveResponseComplaintCategory result = apiInstance.unsubscribeComplaintCategory(categoryId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#unsubscribeComplaintCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Long**| categoryId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2) categoryName&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed | [optional] [default to categoryId,categoryName]

### Return type

[**VerveResponseComplaintCategory**](VerveResponseComplaintCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="updateComplaint"></a>
# **updateComplaint**
> VerveResponseComplaint updateComplaint(complaintId, complaintTitle, complaintDescription, loggedInUserId, accessToken, clientToken, fields)

Update complaint

Allows the user to update complaint. Returns the updated complaint

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long complaintId = 789L; // Long | complaintId
String complaintTitle = "complaintTitle_example"; // String | Complaint Title
String complaintDescription = "complaintDescription_example"; // String | Describe Complaint
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "complaintId,complaintTitle,complaintDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)createdDate<br/><b>A) Availablevalues-</b><br/>1)complaintId<br/>2)complaintTitle<br/>3)complaintDescription<br/>4)issuer<br/>5)noOfSolutions<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity
try {
    VerveResponseComplaint result = apiInstance.updateComplaint(complaintId, complaintTitle, complaintDescription, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#updateComplaint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complaintId** | **Long**| complaintId |
 **complaintTitle** | **String**| Complaint Title |
 **complaintDescription** | **String**| Describe Complaint |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Availablevalues-&lt;/b&gt;&lt;br/&gt;1)complaintId&lt;br/&gt;2)complaintTitle&lt;br/&gt;3)complaintDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfSolutions&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity | [optional] [default to complaintId,complaintTitle,complaintDescription,createdDate]

### Return type

[**VerveResponseComplaint**](VerveResponseComplaint.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateComplaintCategory"></a>
# **updateComplaintCategory**
> VerveResponseComplaintCategory updateComplaintCategory(categoryId, categoryName, categoryDescription, loggedInUserId, accessToken, clientToken, fields)

Update complaint category

Returns the updated complaint category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long categoryId = 789L; // Long | categoryId
String categoryName = "categoryName_example"; // String | Category Name
String categoryDescription = "categoryDescription_example"; // String | Describe category
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2) categoryName<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed
try {
    VerveResponseComplaintCategory result = apiInstance.updateComplaintCategory(categoryId, categoryName, categoryDescription, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#updateComplaintCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Long**| categoryId |
 **categoryName** | **String**| Category Name |
 **categoryDescription** | **String**| Describe category |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2) categoryName&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed | [optional] [default to categoryId,categoryName]

### Return type

[**VerveResponseComplaintCategory**](VerveResponseComplaintCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateSolution"></a>
# **updateSolution**
> VerveResponseSolution updateSolution(solutionId, solution, loggedInUserId, accessToken, clientToken, fields)

Update solution

Allows the user to update solution. Returns the updated solution

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.ComplaintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

ComplaintApi apiInstance = new ComplaintApi();
Long solutionId = 789L; // Long | solutionId
String solution = "solution_example"; // String | solution
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "solutionId,solutionDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/><b>A) Available values -</b> <br/>1)solutionId<br/>2)solutionDescription<br/>3)createdDate<br/>4)complaintId<br/>5)solvingUser<br/>6)isMarkedSolution<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked
try {
    VerveResponseSolution result = apiInstance.updateSolution(solutionId, solution, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplaintApi#updateSolution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **solutionId** | **Long**| solutionId |
 **solution** | **String**| solution |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)solutionId&lt;br/&gt;2)solutionDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)complaintId&lt;br/&gt;5)solvingUser&lt;br/&gt;6)isMarkedSolution&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked | [optional] [default to solutionId,solutionDescription,createdDate]

### Return type

[**VerveResponseSolution**](VerveResponseSolution.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

