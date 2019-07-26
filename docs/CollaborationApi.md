# CollaborationApi

All URIs are relative to *https://api.iengage.io:8243/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCommentBlog**](CollaborationApi.md#addCommentBlog) | **POST** /collaborations/blogs/{blogId}/comments | Comment on posted blog
[**addCommentDiscussion**](CollaborationApi.md#addCommentDiscussion) | **POST** /collaborations/discussions/{discussionId}/comments | Comment on discussion
[**deleteBlog**](CollaborationApi.md#deleteBlog) | **DELETE** /collaborations/blogs/{blogId} | Delete blog
[**deleteBlogComment**](CollaborationApi.md#deleteBlogComment) | **DELETE** /collaborations/blogs/comments/{commentId} | Delete blog comment
[**deleteDiscussion**](CollaborationApi.md#deleteDiscussion) | **DELETE** /collaborations/discussions/{discussionId} | Delete discussion
[**deleteDiscussionComment**](CollaborationApi.md#deleteDiscussionComment) | **DELETE** /collaborations/discussions/comments/{commentId} | Delete discussion comment
[**getBlogComments**](CollaborationApi.md#getBlogComments) | **GET** /collaborations/blogs/{blogId}/comments | Get list of comments on blog
[**getBlogs**](CollaborationApi.md#getBlogs) | **GET** /collaborations/blogs | Get list of blogs
[**getDiscussionComments**](CollaborationApi.md#getDiscussionComments) | **GET** /collaborations/discussions/{discussionId}/comments | Get list of comments on discussion
[**getDiscussions**](CollaborationApi.md#getDiscussions) | **GET** /collaborations/discussions | Get list of discussions
[**getUserSubscribedBlogs**](CollaborationApi.md#getUserSubscribedBlogs) | **GET** /collaborations/blogs/{userId}/subscribe | Get list of blogs subscribed by user
[**getUserSubscribedDiscussions**](CollaborationApi.md#getUserSubscribedDiscussions) | **GET** /collaborations/discussions/{userId}/subscribe | Get list of discussions subscribed by user
[**postBlog**](CollaborationApi.md#postBlog) | **POST** /collaborations/blogs | Post blog
[**startDiscussion**](CollaborationApi.md#startDiscussion) | **POST** /collaborations/discussions | Start discussion
[**subscribeBlog**](CollaborationApi.md#subscribeBlog) | **POST** /collaborations/blogs/{blogId}/subscribe | Subscribe blog
[**subscribeDiscussion**](CollaborationApi.md#subscribeDiscussion) | **POST** /collaborations/discussions/{discussionId}/subscribe | Subscribe discussion
[**unsubscribeBlog**](CollaborationApi.md#unsubscribeBlog) | **POST** /collaborations/blogs/{blogId}/unsubscribe | Unsubscribe blog
[**unsubscribeDiscussion**](CollaborationApi.md#unsubscribeDiscussion) | **POST** /collaborations/discussions/{discussionId}/unsubscribe | Unsubscribe discussion
[**updateBlog**](CollaborationApi.md#updateBlog) | **PUT** /collaborations/blogs/{blogId} | Update blog
[**updateBlogComment**](CollaborationApi.md#updateBlogComment) | **PUT** /collaborations/blogs/comments/{commentId} | Update blog comment
[**updateDiscussion**](CollaborationApi.md#updateDiscussion) | **PUT** /collaborations/discussions/{discussionId} | Update discussion
[**updateDiscussionComment**](CollaborationApi.md#updateDiscussionComment) | **PUT** /collaborations/discussions/comments/{commentId} | Update discussion comment


<a name="addCommentBlog"></a>
# **addCommentBlog**
> VerveResponseComment addCommentBlog(blogId, requesterId, clientToken, body, accessToken)

Comment on posted blog

This service allows a user to comment on a blog. The following fields(key:value) are required to be present in the Comment JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API. **Required fields**      1. blogId (Path Parameter)     2. commentText

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long blogId = 789L; // Long | blogId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Comment body = new Comment(); // Comment | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseComment result = apiInstance.addCommentBlog(blogId, requesterId, clientToken, body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#addCommentBlog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blogId** | **Long**| blogId |
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

<a name="addCommentDiscussion"></a>
# **addCommentDiscussion**
> VerveResponseComment addCommentDiscussion(discussionId, requesterId, clientToken, body, accessToken)

Comment on discussion

This service allows a user to comment on a discussion. The following fields(key:value) are required to be present in the Comment JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API. **Required fields**      1. discussionId (Path Parameter)     2. commentText

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long discussionId = 789L; // Long | discussionId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Comment body = new Comment(); // Comment | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseComment result = apiInstance.addCommentDiscussion(discussionId, requesterId, clientToken, body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#addCommentDiscussion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discussionId** | **Long**| discussionId |
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

<a name="deleteBlog"></a>
# **deleteBlog**
> VerveResponseBlog deleteBlog(blogId, requesterId, clientToken, accessToken)

Delete blog

Allows the user to delete blog. Returns the deleted blog

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long blogId = 789L; // Long | blog Id
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseBlog result = apiInstance.deleteBlog(blogId, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#deleteBlog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blogId** | **Long**| blog Id |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseBlog**](VerveResponseBlog.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteBlogComment"></a>
# **deleteBlogComment**
> VerveResponseComment deleteBlogComment(commentId, requesterId, clientToken, accessToken)

Delete blog comment

Allows the user to delete blog comment.  Returns the deleted blog comment

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long commentId = 789L; // Long | comment Id
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseComment result = apiInstance.deleteBlogComment(commentId, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#deleteBlogComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **Long**| comment Id |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseComment**](VerveResponseComment.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteDiscussion"></a>
# **deleteDiscussion**
> VerveResponseDiscussion deleteDiscussion(discussionId, requesterId, clientToken, accessToken)

Delete discussion

Allows the user to delete discussion. Returns the deleted discussion

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long discussionId = 789L; // Long | discussion Id
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseDiscussion result = apiInstance.deleteDiscussion(discussionId, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#deleteDiscussion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discussionId** | **Long**| discussion Id |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseDiscussion**](VerveResponseDiscussion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteDiscussionComment"></a>
# **deleteDiscussionComment**
> VerveResponseComment deleteDiscussionComment(commentId, requesterId, clientToken, accessToken)

Delete discussion comment

Allows the user to delete discussion comment. Returns the deleted discussion comment

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long commentId = 789L; // Long | comment Id
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseComment result = apiInstance.deleteDiscussionComment(commentId, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#deleteDiscussionComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **Long**| comment Id |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseComment**](VerveResponseComment.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getBlogComments"></a>
# **getBlogComments**
> VerveResponseCommentList getBlogComments(blogId, start, end, requesterId, clientToken, accessToken)

Get list of comments on blog

Returns the list of comments on blog

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long blogId = 789L; // Long | blogId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseCommentList result = apiInstance.getBlogComments(blogId, start, end, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#getBlogComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blogId** | **Long**| blogId |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
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

<a name="getBlogs"></a>
# **getBlogs**
> VerveResponseBlogList getBlogs(association, start, end, requesterId, clientToken, fields, accessToken)

Get list of blogs

Returns the list of blogs

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long association = 789L; // Long | association
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "blogId,blogTitle,blogDescription,createdDate"; // String | Filter fields in result list       /_*   **A) Default values -**        1)blogId       2)blogTitle       3)blogDescription       4)createdDate        **A )Available values-**        1)blogId       2)blogTitle       3)blogDescription       4)createdDate       5)user       6)sentiment       7)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseBlogList result = apiInstance.getBlogs(association, start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#getBlogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **association** | **Long**| association |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)blogId       2)blogTitle       3)blogDescription       4)createdDate        **A )Available values-**        1)blogId       2)blogTitle       3)blogDescription       4)createdDate       5)user       6)sentiment       7)entity   *_/ | [optional] [default to blogId,blogTitle,blogDescription,createdDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseBlogList**](VerveResponseBlogList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiscussionComments"></a>
# **getDiscussionComments**
> VerveResponseCommentList getDiscussionComments(discussionId, start, end, requesterId, clientToken, accessToken)

Get list of comments on discussion

Returns the list of comments on discussion

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long discussionId = 789L; // Long | discussionId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseCommentList result = apiInstance.getDiscussionComments(discussionId, start, end, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#getDiscussionComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discussionId** | **Long**| discussionId |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
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

<a name="getDiscussions"></a>
# **getDiscussions**
> VerveResponseDiscussionList getDiscussions(association, start, end, requesterId, clientToken, fields, accessToken)

Get list of discussions

Returns the list of discussions

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long association = 789L; // Long | association
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "discussionId,discussionSubject,discussionDescription,createdDate "; // String | Filter fields in result list        /_*   **A) Default values -**        1)discussionId       2)discussionSubject       3)discussionDescription       4)createdDate        **A) Available values-**        1)discussionId       2)discussionSubject       3)discussionDescription       4)createdDate       5)user       6)sentiment       7)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseDiscussionList result = apiInstance.getDiscussions(association, start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#getDiscussions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **association** | **Long**| association |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)discussionId       2)discussionSubject       3)discussionDescription       4)createdDate        **A) Available values-**        1)discussionId       2)discussionSubject       3)discussionDescription       4)createdDate       5)user       6)sentiment       7)entity   *_/ | [optional] [default to discussionId,discussionSubject,discussionDescription,createdDate ]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseDiscussionList**](VerveResponseDiscussionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSubscribedBlogs"></a>
# **getUserSubscribedBlogs**
> VerveResponseBlog getUserSubscribedBlogs(userId, start, end, requesterId, clientToken, fields, accessToken)

Get list of blogs subscribed by user

Returns the list of blogs subscribed by user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long userId = 789L; // Long | User Id whose subcribtions want tp get. 
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "blogId,blogTitle,blogDescription,createdDate"; // String | Filter fields in result list       /_*   **A) Default values -**        1)blogId       2)blogTitle       3)blogDescription       4)createdDate        **A )Available values-**        1)blogId       2)blogTitle       3)blogDescription       4)createdDate       5)user       6)sentiment       7)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseBlog result = apiInstance.getUserSubscribedBlogs(userId, start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#getUserSubscribedBlogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id whose subcribtions want tp get.  |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)blogId       2)blogTitle       3)blogDescription       4)createdDate        **A )Available values-**        1)blogId       2)blogTitle       3)blogDescription       4)createdDate       5)user       6)sentiment       7)entity   *_/ | [optional] [default to blogId,blogTitle,blogDescription,createdDate]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseBlog**](VerveResponseBlog.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSubscribedDiscussions"></a>
# **getUserSubscribedDiscussions**
> VerveResponseDiscussionList getUserSubscribedDiscussions(userId, start, end, requesterId, clientToken, fields, accessToken)

Get list of discussions subscribed by user

Returns the list of discussions subscribed by user 

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long userId = 789L; // Long | User Id whose subcribtions want tp get.
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "discussionId,discussionSubject,discussionDescription,createdDate "; // String | Filter fields in result list        /_*   **A) Default values -**        1)discussionId       2)discussionSubject       3)discussionDescription       4)createdDate        **A) Available values-**        1)discussionId       2)discussionSubject       3)discussionDescription       4)createdDate       5)user       6)sentiment       7)entity   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseDiscussionList result = apiInstance.getUserSubscribedDiscussions(userId, start, end, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#getUserSubscribedDiscussions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id whose subcribtions want tp get. |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)discussionId       2)discussionSubject       3)discussionDescription       4)createdDate        **A) Available values-**        1)discussionId       2)discussionSubject       3)discussionDescription       4)createdDate       5)user       6)sentiment       7)entity   *_/ | [optional] [default to discussionId,discussionSubject,discussionDescription,createdDate ]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseDiscussionList**](VerveResponseDiscussionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postBlog"></a>
# **postBlog**
> VerveResponseBlog postBlog(requesterId, clientToken, body, accessToken)

Post blog

This service allows a user to post a blog. The following fields(key:value) are required to be present in the Blog JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API. **Required fields** 1. association      2. title      3. description

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Blog body = new Blog(); // Blog | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseBlog result = apiInstance.postBlog(requesterId, clientToken, body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#postBlog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body** | [**Blog**](Blog.md)|  | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseBlog**](VerveResponseBlog.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="startDiscussion"></a>
# **startDiscussion**
> VerveResponseDiscussion startDiscussion(requesterId, clientToken, body, accessToken)

Start discussion

This service allows a user to post a discussion. The following fields(key:value) are required to be present in the Discussion JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API. **Required fields**      1. association      2. subject      3. description

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Discussion body = new Discussion(); // Discussion | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseDiscussion result = apiInstance.startDiscussion(requesterId, clientToken, body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#startDiscussion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body** | [**Discussion**](Discussion.md)|  | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseDiscussion**](VerveResponseDiscussion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="subscribeBlog"></a>
# **subscribeBlog**
> VerveResponseBlog subscribeBlog(blogId, requesterId, clientToken, accessToken)

Subscribe blog

Allows the user to subscribe to blog. Returns the subscribed blog

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long blogId = 789L; // Long | blogId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseBlog result = apiInstance.subscribeBlog(blogId, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#subscribeBlog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blogId** | **Long**| blogId |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseBlog**](VerveResponseBlog.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="subscribeDiscussion"></a>
# **subscribeDiscussion**
> VerveResponseDiscussion subscribeDiscussion(discussionId, requesterId, clientToken, accessToken)

Subscribe discussion

Allows the user to subscribe to a discussion. Returns the subscribed discussion

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long discussionId = 789L; // Long | discussionId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseDiscussion result = apiInstance.subscribeDiscussion(discussionId, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#subscribeDiscussion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discussionId** | **Long**| discussionId |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseDiscussion**](VerveResponseDiscussion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="unsubscribeBlog"></a>
# **unsubscribeBlog**
> VerveResponseBlog unsubscribeBlog(blogId, requesterId, clientToken, accessToken)

Unsubscribe blog

Allows the user to unsubscribe blog. Returns the unsubscribed blog

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long blogId = 789L; // Long | blogId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseBlog result = apiInstance.unsubscribeBlog(blogId, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#unsubscribeBlog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blogId** | **Long**| blogId |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseBlog**](VerveResponseBlog.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="unsubscribeDiscussion"></a>
# **unsubscribeDiscussion**
> VerveResponseDiscussion unsubscribeDiscussion(discussionId, requesterId, clientToken, accessToken)

Unsubscribe discussion

Allows the user to unsubscribe to a discussion. Returns the unsubscribed discussion

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long discussionId = 789L; // Long | discussionId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseDiscussion result = apiInstance.unsubscribeDiscussion(discussionId, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#unsubscribeDiscussion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discussionId** | **Long**| discussionId |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseDiscussion**](VerveResponseDiscussion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateBlog"></a>
# **updateBlog**
> VerveResponseBlog updateBlog(blogId, blogTitle, blogDescription, requesterId, clientToken, accessToken)

Update blog

Allows the user to update blog. Returns the updated blog

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long blogId = 789L; // Long | blogId
String blogTitle = "blogTitle_example"; // String | blog title
String blogDescription = "blogDescription_example"; // String | blog description
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseBlog result = apiInstance.updateBlog(blogId, blogTitle, blogDescription, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#updateBlog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blogId** | **Long**| blogId |
 **blogTitle** | **String**| blog title |
 **blogDescription** | **String**| blog description |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseBlog**](VerveResponseBlog.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateBlogComment"></a>
# **updateBlogComment**
> VerveResponseComment updateBlogComment(commentId, commentText, requesterId, clientToken, accessToken)

Update blog comment

Allows the user to update blog comment. Returns the updated blog comment

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long commentId = 789L; // Long | commentId
String commentText = "commentText_example"; // String | comment text
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseComment result = apiInstance.updateBlogComment(commentId, commentText, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#updateBlogComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **Long**| commentId |
 **commentText** | **String**| comment text |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseComment**](VerveResponseComment.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateDiscussion"></a>
# **updateDiscussion**
> VerveResponseDiscussion updateDiscussion(discussionId, subject, discussionDescription, requesterId, clientToken, accessToken)

Update discussion

Allows the user to update discussion. Returns the updated discussion

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long discussionId = 789L; // Long | discussionId
String subject = "subject_example"; // String | subject
String discussionDescription = "discussionDescription_example"; // String | discussion Description
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseDiscussion result = apiInstance.updateDiscussion(discussionId, subject, discussionDescription, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#updateDiscussion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discussionId** | **Long**| discussionId |
 **subject** | **String**| subject |
 **discussionDescription** | **String**| discussion Description |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseDiscussion**](VerveResponseDiscussion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateDiscussionComment"></a>
# **updateDiscussionComment**
> VerveResponseDiscussion updateDiscussionComment(commentId, commentText, requesterId, clientToken, accessToken)

Update discussion comment

Allows the user to update discussion comment. Returns the updated discussion comment

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.CollaborationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

CollaborationApi apiInstance = new CollaborationApi();
Long commentId = 789L; // Long | commentId
String commentText = "commentText_example"; // String | comment text
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseDiscussion result = apiInstance.updateDiscussionComment(commentId, commentText, requesterId, clientToken, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#updateDiscussionComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **Long**| commentId |
 **commentText** | **String**| comment text |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseDiscussion**](VerveResponseDiscussion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

