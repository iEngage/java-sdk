# CollaborationApi

All URIs are relative to *https://api.iengage.io:8243/api/1.0*

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
> VerveResponseComment addCommentBlog(blogId, commentText, loggedInUserId, accessToken, clientToken)

Comment on posted blog

Allows the user to give comment on posted Blog. Returns the comment

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
String commentText = "commentText_example"; // String | Comment Text
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseComment result = apiInstance.addCommentBlog(blogId, commentText, loggedInUserId, accessToken, clientToken);
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
 **commentText** | **String**| Comment Text |
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

<a name="addCommentDiscussion"></a>
# **addCommentDiscussion**
> VerveResponseComment addCommentDiscussion(discussionId, commentText, loggedInUserId, accessToken, clientToken)

Comment on discussion

Allows the user to comment on discussion. Returns the comment

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
String commentText = "commentText_example"; // String | Comment Text
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseComment result = apiInstance.addCommentDiscussion(discussionId, commentText, loggedInUserId, accessToken, clientToken);
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
 **commentText** | **String**| Comment Text |
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

<a name="deleteBlog"></a>
# **deleteBlog**
> VerveResponseBlog deleteBlog(blogId, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseBlog result = apiInstance.deleteBlog(blogId, loggedInUserId, accessToken, clientToken);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseBlog**](VerveResponseBlog.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="deleteBlogComment"></a>
# **deleteBlogComment**
> VerveResponseComment deleteBlogComment(commentId, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseComment result = apiInstance.deleteBlogComment(commentId, loggedInUserId, accessToken, clientToken);
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

<a name="deleteDiscussion"></a>
# **deleteDiscussion**
> VerveResponseDiscussion deleteDiscussion(discussionId, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseDiscussion result = apiInstance.deleteDiscussion(discussionId, loggedInUserId, accessToken, clientToken);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseDiscussion**](VerveResponseDiscussion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="deleteDiscussionComment"></a>
# **deleteDiscussionComment**
> VerveResponseComment deleteDiscussionComment(commentId, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseComment result = apiInstance.deleteDiscussionComment(commentId, loggedInUserId, accessToken, clientToken);
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

<a name="getBlogComments"></a>
# **getBlogComments**
> VerveResponseCommentList getBlogComments(blogId, start, end, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseCommentList result = apiInstance.getBlogComments(blogId, start, end, loggedInUserId, accessToken, clientToken);
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

<a name="getBlogs"></a>
# **getBlogs**
> VerveResponseBlogList getBlogs(organizationId, start, end, loggedInUserId, accessToken, clientToken, fields)

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
Long organizationId = 789L; // Long | organizationId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "blogId,blogTitle,blogDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)blogId<br/>2)blogTitle<br/>3)blogDescription<br/>4)createdDate<br/><b>A )Available values-</b><br/>1)blogId<br/>2)blogTitle<br/>3)blogDescription<br/>4)createdDate<br/>5)user<br/>6)sentiment</br>7)entity
try {
    VerveResponseBlogList result = apiInstance.getBlogs(organizationId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#getBlogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)blogId&lt;br/&gt;2)blogTitle&lt;br/&gt;3)blogDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A )Available values-&lt;/b&gt;&lt;br/&gt;1)blogId&lt;br/&gt;2)blogTitle&lt;br/&gt;3)blogDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)user&lt;br/&gt;6)sentiment&lt;/br&gt;7)entity | [optional] [default to blogId,blogTitle,blogDescription,createdDate]

### Return type

[**VerveResponseBlogList**](VerveResponseBlogList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiscussionComments"></a>
# **getDiscussionComments**
> VerveResponseCommentList getDiscussionComments(discussionId, start, end, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseCommentList result = apiInstance.getDiscussionComments(discussionId, start, end, loggedInUserId, accessToken, clientToken);
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

<a name="getDiscussions"></a>
# **getDiscussions**
> VerveResponseDiscussionList getDiscussions(organizationId, start, end, loggedInUserId, accessToken, clientToken, fields)

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
Long organizationId = 789L; // Long | organizationId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "discussionId,discussionSubject,discussionDescription,createdDate "; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)discussionId<br/>2)discussionSubject<br/>3)discussionDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)discussionId<br/>2)discussionSubject<br/>3)discussionDescription<br/>4)createdDate<br/>5)user<br/>6)sentiment</br>7)entity
try {
    VerveResponseDiscussionList result = apiInstance.getDiscussions(organizationId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#getDiscussions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)discussionId&lt;br/&gt;2)discussionSubject&lt;br/&gt;3)discussionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)discussionId&lt;br/&gt;2)discussionSubject&lt;br/&gt;3)discussionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)user&lt;br/&gt;6)sentiment&lt;/br&gt;7)entity | [optional] [default to discussionId,discussionSubject,discussionDescription,createdDate ]

### Return type

[**VerveResponseDiscussionList**](VerveResponseDiscussionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSubscribedBlogs"></a>
# **getUserSubscribedBlogs**
> VerveResponseBlog getUserSubscribedBlogs(userId, start, end, loggedInUserId, accessToken, clientToken, fields)

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
Long userId = 789L; // Long | userId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "blogId,blogTitle,blogDescription,createdDate"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)blogId<br/>2)blogTitle<br/>3)blogDescription<br/>4)createdDate<br/><b>A )Available values-</b><br/>1)blogId<br/>2)blogTitle<br/>3)blogDescription<br/>4)createdDate<br/>5)user<br/>6)sentiment</br>7)entity
try {
    VerveResponseBlog result = apiInstance.getUserSubscribedBlogs(userId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#getUserSubscribedBlogs");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)blogId&lt;br/&gt;2)blogTitle&lt;br/&gt;3)blogDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A )Available values-&lt;/b&gt;&lt;br/&gt;1)blogId&lt;br/&gt;2)blogTitle&lt;br/&gt;3)blogDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)user&lt;br/&gt;6)sentiment&lt;/br&gt;7)entity | [optional] [default to blogId,blogTitle,blogDescription,createdDate]

### Return type

[**VerveResponseBlog**](VerveResponseBlog.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSubscribedDiscussions"></a>
# **getUserSubscribedDiscussions**
> VerveResponseDiscussionList getUserSubscribedDiscussions(userId, start, end, loggedInUserId, accessToken, clientToken, fields)

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
Long userId = 789L; // Long | userId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "discussionId,discussionSubject,discussionDescription,createdDate "; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)discussionId<br/>2)discussionSubject<br/>3)discussionDescription<br/>4)createdDate<br/><b>A) Available values-</b><br/>1)discussionId<br/>2)discussionSubject<br/>3)discussionDescription<br/>4)createdDate<br/>5)user<br/>6)sentiment</br>7)entity
try {
    VerveResponseDiscussionList result = apiInstance.getUserSubscribedDiscussions(userId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#getUserSubscribedDiscussions");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)discussionId&lt;br/&gt;2)discussionSubject&lt;br/&gt;3)discussionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)discussionId&lt;br/&gt;2)discussionSubject&lt;br/&gt;3)discussionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)user&lt;br/&gt;6)sentiment&lt;/br&gt;7)entity | [optional] [default to discussionId,discussionSubject,discussionDescription,createdDate ]

### Return type

[**VerveResponseDiscussionList**](VerveResponseDiscussionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postBlog"></a>
# **postBlog**
> VerveResponseBlog postBlog(organizationId, blogTitle, blogDescription, loggedInUserId, accessToken, clientToken)

Post blog

Allows the user to post a blog. Returns the posted blog

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
Long organizationId = 789L; // Long | organizationId
String blogTitle = "blogTitle_example"; // String | blogTitle
String blogDescription = "blogDescription_example"; // String | blogDescription
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseBlog result = apiInstance.postBlog(organizationId, blogTitle, blogDescription, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#postBlog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **blogTitle** | **String**| blogTitle |
 **blogDescription** | **String**| blogDescription |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseBlog**](VerveResponseBlog.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="startDiscussion"></a>
# **startDiscussion**
> VerveResponseDiscussion startDiscussion(organizationId, subject, description, loggedInUserId, accessToken, clientToken)

Start discussion

Allows the user to start discussion. Returns the started discussion

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
Long organizationId = 789L; // Long | organizationId
String subject = "subject_example"; // String | subject
String description = "description_example"; // String | description
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseDiscussion result = apiInstance.startDiscussion(organizationId, subject, description, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#startDiscussion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **subject** | **String**| subject |
 **description** | **String**| description |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseDiscussion**](VerveResponseDiscussion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="subscribeBlog"></a>
# **subscribeBlog**
> VerveResponseBlog subscribeBlog(blogId, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseBlog result = apiInstance.subscribeBlog(blogId, loggedInUserId, accessToken, clientToken);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseBlog**](VerveResponseBlog.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="subscribeDiscussion"></a>
# **subscribeDiscussion**
> VerveResponseDiscussion subscribeDiscussion(discussionId, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseDiscussion result = apiInstance.subscribeDiscussion(discussionId, loggedInUserId, accessToken, clientToken);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseDiscussion**](VerveResponseDiscussion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="unsubscribeBlog"></a>
# **unsubscribeBlog**
> VerveResponseBlog unsubscribeBlog(blogId, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseBlog result = apiInstance.unsubscribeBlog(blogId, loggedInUserId, accessToken, clientToken);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseBlog**](VerveResponseBlog.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="unsubscribeDiscussion"></a>
# **unsubscribeDiscussion**
> VerveResponseDiscussion unsubscribeDiscussion(discussionId, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseDiscussion result = apiInstance.unsubscribeDiscussion(discussionId, loggedInUserId, accessToken, clientToken);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseDiscussion**](VerveResponseDiscussion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="updateBlog"></a>
# **updateBlog**
> VerveResponseBlog updateBlog(blogId, blogTitle, blogDescription, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseBlog result = apiInstance.updateBlog(blogId, blogTitle, blogDescription, loggedInUserId, accessToken, clientToken);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseBlog**](VerveResponseBlog.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateBlogComment"></a>
# **updateBlogComment**
> VerveResponseComment updateBlogComment(commentId, commentText, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseComment result = apiInstance.updateBlogComment(commentId, commentText, loggedInUserId, accessToken, clientToken);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseComment**](VerveResponseComment.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateDiscussion"></a>
# **updateDiscussion**
> VerveResponseDiscussion updateDiscussion(discussionId, subject, discussionDescription, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseDiscussion result = apiInstance.updateDiscussion(discussionId, subject, discussionDescription, loggedInUserId, accessToken, clientToken);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseDiscussion**](VerveResponseDiscussion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateDiscussionComment"></a>
# **updateDiscussionComment**
> VerveResponseDiscussion updateDiscussionComment(commentId, commentText, loggedInUserId, accessToken, clientToken)

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
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseDiscussion result = apiInstance.updateDiscussionComment(commentId, commentText, loggedInUserId, accessToken, clientToken);
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
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseDiscussion**](VerveResponseDiscussion.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

