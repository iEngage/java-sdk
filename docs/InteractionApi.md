# InteractionApi

All URIs are relative to *https://api.iengage.io:8243/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInteraction**](InteractionApi.md#addInteraction) | **POST** /interactions | Share interaction without attachment
[**addInteraction_0**](InteractionApi.md#addInteraction_0) | **POST** /interactions/attachment | Share interaction with attachment
[**addResponse**](InteractionApi.md#addResponse) | **POST** /interactions/{interactionId}/responses | Response the specified interaction
[**createInteractionCategory**](InteractionApi.md#createInteractionCategory) | **POST** /interactions/categories | Create interaction category
[**deleteInteraction**](InteractionApi.md#deleteInteraction) | **DELETE** /interactions/{interactionId} | Delete interaction
[**deleteInteractionCategory**](InteractionApi.md#deleteInteractionCategory) | **DELETE** /interactions/categories/{categoryId} | Delete interaction category
[**deleteResponse**](InteractionApi.md#deleteResponse) | **DELETE** /interactions/responses/{responseId} | Delete response
[**dislikeResponse**](InteractionApi.md#dislikeResponse) | **POST** /interactions/{interactionId}/responses/{responseId}/dislike | Dislike response
[**getFriendsInteractions**](InteractionApi.md#getFriendsInteractions) | **GET** /interactions/friends | Get list of interactions shared by friends
[**getInteraction**](InteractionApi.md#getInteraction) | **GET** /interactions/{interactionId} | Get interaction by id
[**getInteractionCategories**](InteractionApi.md#getInteractionCategories) | **GET** /interactions/categories | Get the list of interaction categories
[**getInteractionsForUser**](InteractionApi.md#getInteractionsForUser) | **GET** /interactions | Get list of all interactions visible to the user
[**getRecommendInteractions**](InteractionApi.md#getRecommendInteractions) | **GET** /interactions/recommend | Get list of recommended interactions
[**getRecommendedInteractinsFromDB**](InteractionApi.md#getRecommendedInteractinsFromDB) | **GET** /interactions/{userId}/recommendedInteractions | Get list of recommended interactions from DB
[**getRecommendedUsersFromDB**](InteractionApi.md#getRecommendedUsersFromDB) | **GET** /interactions/{interactionId}/recommendedUsers | Get list of recommended Users from DB
[**getResponses**](InteractionApi.md#getResponses) | **GET** /interactions/{interactionId}/responses | Get list of responses by interactionId
[**getUserInteractions**](InteractionApi.md#getUserInteractions) | **GET** /interactions/{userId}/shared | Get list of interactions shared by user
[**getUserSubscribedInteractionCategories**](InteractionApi.md#getUserSubscribedInteractionCategories) | **GET** /interactions/categories/{userId}/subscribe | Get list of interaction categories subscribed by the user
[**getUserSubscribedInteractions**](InteractionApi.md#getUserSubscribedInteractions) | **GET** /interactions/{userId}/subscribe | Get list of interactions subscribed by user
[**likeResponse**](InteractionApi.md#likeResponse) | **POST** /interactions/{interactionId}/responses/{responseId}/like | Like response
[**markAsAnResponse**](InteractionApi.md#markAsAnResponse) | **POST** /interactions/{interactionId}/responses/{responseId}/mark | Mark response as a response
[**searchInteractions**](InteractionApi.md#searchInteractions) | **GET** /interactions/search | Get list of matching interactions
[**subscribeInteractinCategory**](InteractionApi.md#subscribeInteractinCategory) | **POST** /interactions/categories/{categoryId}/subscribe | Subscribe interaction category
[**subscribeInteraction**](InteractionApi.md#subscribeInteraction) | **POST** /interactions/{interactionId}/subscribe | Subscribe interaction
[**unmarkAsAnResponse**](InteractionApi.md#unmarkAsAnResponse) | **POST** /interactions/{interactionId}/responses/{responseId}/unmark | Unmark response as a response
[**unsubscribeInteractinCategory**](InteractionApi.md#unsubscribeInteractinCategory) | **POST** /interactions/categories/{categoryId}/unsubscribe | Unsubscribe interaction category
[**unsubscribeInteraction**](InteractionApi.md#unsubscribeInteraction) | **POST** /interactions/{interactionId}/unsubscribe | Unsubscribe interaction
[**updateInteraction**](InteractionApi.md#updateInteraction) | **PUT** /interactions/{interactionId} | Update interaction
[**updateInteractionCategory**](InteractionApi.md#updateInteractionCategory) | **PUT** /interactions/categories/{categoryId} | Update interaction category
[**updateResponse**](InteractionApi.md#updateResponse) | **PUT** /interactions/responses/{responseId} | Update response


<a name="addInteraction"></a>
# **addInteraction**
> VerveResponseInteraction addInteraction(interactionTitle, loggedInUserId, accessToken, clientToken, categoryId, interactionType, interactionDescription)

Share interaction without attachment

Allows the user to share interaction without attachment. Returns the interaction object

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
String interactionTitle = "interactionTitle_example"; // String | Interaction Title
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String interactionType = "interactionType_example"; // String | Interaction Type
String interactionDescription = "interactionDescription_example"; // String | Describe interaction
try {
    VerveResponseInteraction result = apiInstance.addInteraction(interactionTitle, loggedInUserId, accessToken, clientToken, categoryId, interactionType, interactionDescription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#addInteraction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionTitle** | **String**| Interaction Title |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **interactionType** | **String**| Interaction Type | [optional]
 **interactionDescription** | **String**| Describe interaction | [optional]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="addInteraction_0"></a>
# **addInteraction_0**
> VerveResponseInteraction addInteraction_0(body3, loggedInUserId, accessToken, clientToken, body, body2, body4, body5)

Share interaction with attachment

Allows the user to share interaction with attachment. Returns the interaction object

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
String body3 = "body_example"; // String | interactionTitle
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long body = 789L; // Long | categoryId
String body2 = "body_example"; // String | Interaction Type
String body4 = "body_example"; // String | interactionDescription
List<Attachment> body5 = Arrays.asList(new Attachment()); // List<Attachment> | 
try {
    VerveResponseInteraction result = apiInstance.addInteraction_0(body3, loggedInUserId, accessToken, clientToken, body, body2, body4, body5);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#addInteraction_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body3** | **String**| interactionTitle |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body** | **Long**| categoryId | [optional]
 **body2** | **String**| Interaction Type | [optional]
 **body4** | **String**| interactionDescription | [optional]
 **body5** | [**List&lt;Attachment&gt;**](Attachment.md)|  | [optional]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="addResponse"></a>
# **addResponse**
> VerveResponseInteractionResponse addResponse(interactionId, response, loggedInUserId, accessToken, clientToken, fields)

Response the specified interaction

Allows the user to response the interaction

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long interactionId = 789L; // Long | interactionId
String response = "response_example"; // String | response
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionType<br/><b>A) Available values -</b><br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionId<br/>5)respondingUser<br/>6)isMarkedResponse<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked<br/>12)interactionType
try {
    VerveResponseInteractionResponse result = apiInstance.addResponse(interactionId, response, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#addResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionId** | **Long**| interactionId |
 **response** | **String**| response |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionId&lt;br/&gt;5)respondingUser&lt;br/&gt;6)isMarkedResponse&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked&lt;br/&gt;12)interactionType | [optional] [default to responseId,responseDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="createInteractionCategory"></a>
# **createInteractionCategory**
> VerveResponseInteractionCategory createInteractionCategory(interactionType, name, description, loggedInUserId, accessToken, clientToken, organizationId, fields)

Create interaction category

Creates a interaction category. Returns the created interaction category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
String interactionType = "interactionType_example"; // String | Interaction Type
String name = "name_example"; // String | Name
String description = "description_example"; // String | description
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long organizationId = 789L; // Long | OrganizationId
String fields = "categoryId,categoryName,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)interactionType<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed<br/>6)interactionType
try {
    VerveResponseInteractionCategory result = apiInstance.createInteractionCategory(interactionType, name, description, loggedInUserId, accessToken, clientToken, organizationId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#createInteractionCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionType** | **String**| Interaction Type |
 **name** | **String**| Name |
 **description** | **String**| description |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **organizationId** | **Long**| OrganizationId | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed&lt;br/&gt;6)interactionType | [optional] [default to categoryId,categoryName,interactionType]

### Return type

[**VerveResponseInteractionCategory**](VerveResponseInteractionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="deleteInteraction"></a>
# **deleteInteraction**
> VerveResponseInteraction deleteInteraction(interactionId, loggedInUserId, accessToken, clientToken, fields)

Delete interaction

Allows the user to delete a interaction. Returns the deleted response

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long interactionId = 789L; // Long | interactionId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)createdDate<br/>5)interactionType<br/><b>A) Available values-</b><br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)issuer<br/>5)noOfResponses<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity<br/>14)interactionType
try {
    VerveResponseInteraction result = apiInstance.deleteInteraction(interactionId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#deleteInteraction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionId** | **Long**| interactionId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)interactionType&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfResponses&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity&lt;br/&gt;14)interactionType | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="deleteInteractionCategory"></a>
# **deleteInteractionCategory**
> VerveResponseInteractionCategory deleteInteractionCategory(categoryId, loggedInUserId, accessToken, clientToken, fields)

Delete interaction category

Allows the user to delete the interaction category. Returns the deleted interaction category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long categoryId = 789L; // Long | categoryId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)interactionType<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed<br/>6)interactionType
try {
    VerveResponseInteractionCategory result = apiInstance.deleteInteractionCategory(categoryId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#deleteInteractionCategory");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed&lt;br/&gt;6)interactionType | [optional] [default to categoryId,categoryName,interactionType]

### Return type

[**VerveResponseInteractionCategory**](VerveResponseInteractionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="deleteResponse"></a>
# **deleteResponse**
> VerveResponseInteractionResponse deleteResponse(responseId, loggedInUserId, accessToken, clientToken, fields)

Delete response

Allows the user to delete an response. Returns the deleted response

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long responseId = 789L; // Long | responseId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionType<br/><b>A) Available values -</b><br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionId<br/>5)respondingUser<br/>6)isMarkedResponse<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked<br/>12)interactionType
try {
    VerveResponseInteractionResponse result = apiInstance.deleteResponse(responseId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#deleteResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseId** | **Long**| responseId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionId&lt;br/&gt;5)respondingUser&lt;br/&gt;6)isMarkedResponse&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked&lt;br/&gt;12)interactionType | [optional] [default to responseId,responseDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="dislikeResponse"></a>
# **dislikeResponse**
> VerveResponseInteractionResponse dislikeResponse(interactionId, responseId, loggedInUserId, accessToken, clientToken, fields)

Dislike response

Allows the user to dislike the response.

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long interactionId = 789L; // Long | interactionId
Long responseId = 789L; // Long | responseId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionType<br/><b>A) Available values -</b><br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionId<br/>5)respondingUser<br/>6)isMarkedResponse<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked<br/>12)interactionType
try {
    VerveResponseInteractionResponse result = apiInstance.dislikeResponse(interactionId, responseId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#dislikeResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionId** | **Long**| interactionId |
 **responseId** | **Long**| responseId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionId&lt;br/&gt;5)respondingUser&lt;br/&gt;6)isMarkedResponse&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked&lt;br/&gt;12)interactionType | [optional] [default to responseId,responseDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="getFriendsInteractions"></a>
# **getFriendsInteractions**
> VerveResponseInteractionList getFriendsInteractions(interactionStatus, start, end, loggedInUserId, accessToken, clientToken, interactionType, categoryId, fields)

Get list of interactions shared by friends

Returns the list of interactions shared by friends

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
String interactionStatus = "interactionStatus_example"; // String | Interaction status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionType = "interactionType_example"; // String | Interaction Type
Long categoryId = 789L; // Long | categoryId
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)createdDate<br/>5)interactionType<br/><b>A) Available values-</b><br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)issuer<br/>5)noOfResponses<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity<br/>14)interactionType
try {
    VerveResponseInteractionList result = apiInstance.getFriendsInteractions(interactionStatus, start, end, loggedInUserId, accessToken, clientToken, interactionType, categoryId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getFriendsInteractions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionStatus** | **String**| Interaction status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **interactionType** | **String**| Interaction Type | [optional]
 **categoryId** | **Long**| categoryId | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)interactionType&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfResponses&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity&lt;br/&gt;14)interactionType | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteractionList**](VerveResponseInteractionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInteraction"></a>
# **getInteraction**
> VerveResponseInteraction getInteraction(interactionId, loggedInUserId, accessToken, clientToken, fields)

Get interaction by id

Returns the interaction by id

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long interactionId = 789L; // Long | interactionId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)createdDate<br/>5)interactionType<br/><b>A) Available values-</b><br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)issuer<br/>5)noOfResponses<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity<br/>14)interactionType
try {
    VerveResponseInteraction result = apiInstance.getInteraction(interactionId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getInteraction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionId** | **Long**| interactionId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)interactionType&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfResponses&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity&lt;br/&gt;14)interactionType | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInteractionCategories"></a>
# **getInteractionCategories**
> VerveResponseInteractionCategoryList getInteractionCategories(start, end, loggedInUserId, accessToken, clientToken, interactionType, fields)

Get the list of interaction categories

Returns the list of interaction categories

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionType = "interactionType_example"; // String | Interaction Type
String fields = "categoryId,categoryName,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)interactionType<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed<br/>6)interactionType
try {
    VerveResponseInteractionCategoryList result = apiInstance.getInteractionCategories(start, end, loggedInUserId, accessToken, clientToken, interactionType, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getInteractionCategories");
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
 **interactionType** | **String**| Interaction Type | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed&lt;br/&gt;6)interactionType | [optional] [default to categoryId,categoryName,interactionType]

### Return type

[**VerveResponseInteractionCategoryList**](VerveResponseInteractionCategoryList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInteractionsForUser"></a>
# **getInteractionsForUser**
> VerveResponseInteractionList getInteractionsForUser(interactionStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, interactionType, fields)

Get list of all interactions visible to the user

Returns the list of all interactions visible to the user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
String interactionStatus = "interactionStatus_example"; // String | Interaction status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String interactionType = "interactionType_example"; // String | Interaction Type
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)createdDate<br/>5)interactionType<br/><b>A) Available values-</b><br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)issuer<br/>5)noOfResponses<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity<br/>14)interactionType
try {
    VerveResponseInteractionList result = apiInstance.getInteractionsForUser(interactionStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, interactionType, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getInteractionsForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionStatus** | **String**| Interaction status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **interactionType** | **String**| Interaction Type | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)interactionType&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfResponses&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity&lt;br/&gt;14)interactionType | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteractionList**](VerveResponseInteractionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendInteractions"></a>
# **getRecommendInteractions**
> VerveResponseInteractionList getRecommendInteractions(start, end, loggedInUserId, accessToken, clientToken, interactionType, fields)

Get list of recommended interactions

Returns the list of recommended interactions

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionType = "interactionType_example"; // String | interactionType
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)createdDate<br/>5)interactionType<br/><b>A) Available values-</b><br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)issuer<br/>5)noOfResponses<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity<br/>14)interactionType
try {
    VerveResponseInteractionList result = apiInstance.getRecommendInteractions(start, end, loggedInUserId, accessToken, clientToken, interactionType, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getRecommendInteractions");
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
 **interactionType** | **String**| interactionType | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)interactionType&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfResponses&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity&lt;br/&gt;14)interactionType | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteractionList**](VerveResponseInteractionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendedInteractinsFromDB"></a>
# **getRecommendedInteractinsFromDB**
> VerveResponseInteractionList getRecommendedInteractinsFromDB(userId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of recommended interactions from DB

Returns the list of recommended interactions from DB

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long userId = 789L; // Long | userId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)createdDate<br/>5)interactionType<br/><b>A) Available values-</b><br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)issuer<br/>5)noOfResponses<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity<br/>14)interactionType
try {
    VerveResponseInteractionList result = apiInstance.getRecommendedInteractinsFromDB(userId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getRecommendedInteractinsFromDB");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)interactionType&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfResponses&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity&lt;br/&gt;14)interactionType | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,,interactionType]

### Return type

[**VerveResponseInteractionList**](VerveResponseInteractionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendedUsersFromDB"></a>
# **getRecommendedUsersFromDB**
> VerveResponseUserList getRecommendedUsersFromDB(interactionId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of recommended Users from DB

Returns the list of recommended users from DB

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long interactionId = 789L; // Long | interactionId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "userId,firstName,lastName"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)userId<br/>2)firstName<br/>3)lastName<br/>4)profileImage<br/><b>A) Available values-</b><br/>1)userId<br/>2)firstName<br/>3)lastName<br/>4)emailId<br/>5)profileImage<br/>6)birthDate<br/>7)currentUserFollowing<br/>8)currentUserFriend<br/>9)equityScore
try {
    VerveResponseUserList result = apiInstance.getRecommendedUsersFromDB(interactionId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getRecommendedUsersFromDB");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionId** | **Long**| interactionId |
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

<a name="getResponses"></a>
# **getResponses**
> VerveResponseInteractionResponseList getResponses(interactionId, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of responses by interactionId

Returns the list of responses by interactionId

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long interactionId = 789L; // Long | interactionId
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionType<br/><b>A) Available values -</b><br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionId<br/>5)respondingUser<br/>6)isMarkedResponse<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked<br/>12)interactionType
try {
    VerveResponseInteractionResponseList result = apiInstance.getResponses(interactionId, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getResponses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionId** | **Long**| interactionId |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionId&lt;br/&gt;5)respondingUser&lt;br/&gt;6)isMarkedResponse&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked&lt;br/&gt;12)interactionType | [optional] [default to responseId,responseDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteractionResponseList**](VerveResponseInteractionResponseList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserInteractions"></a>
# **getUserInteractions**
> VerveResponseInteractionList getUserInteractions(userId, interactionStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, interactionType, fields)

Get list of interactions shared by user

Returns the list of interactions shared by specific user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long userId = 789L; // Long | userId
String interactionStatus = "interactionStatus_example"; // String | Interaction status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String interactionType = "interactionType_example"; // String | Interaction Type
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)createdDate<br/>5)interactionType<br/><b>A) Available values-</b><br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)issuer<br/>5)noOfResponses<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity<br/>14)interactionType
try {
    VerveResponseInteractionList result = apiInstance.getUserInteractions(userId, interactionStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, interactionType, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getUserInteractions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **interactionStatus** | **String**| Interaction status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **interactionType** | **String**| Interaction Type | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)interactionType&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfResponses&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity&lt;br/&gt;14)interactionType | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteractionList**](VerveResponseInteractionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSubscribedInteractionCategories"></a>
# **getUserSubscribedInteractionCategories**
> VerveResponseInteractionCategoryList getUserSubscribedInteractionCategories(userId, interactionType, start, end, loggedInUserId, accessToken, clientToken, fields)

Get list of interaction categories subscribed by the user

Returns the list of interaction categories subscribed by the user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long userId = 789L; // Long | userId
String interactionType = "interactionType_example"; // String | interactionType
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)interactionType<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed<br/>6)interactionType
try {
    VerveResponseInteractionCategoryList result = apiInstance.getUserSubscribedInteractionCategories(userId, interactionType, start, end, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getUserSubscribedInteractionCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **interactionType** | **String**| interactionType |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed&lt;br/&gt;6)interactionType | [optional] [default to categoryId,categoryName,interactionType]

### Return type

[**VerveResponseInteractionCategoryList**](VerveResponseInteractionCategoryList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSubscribedInteractions"></a>
# **getUserSubscribedInteractions**
> VerveResponseInteractionList getUserSubscribedInteractions(userId, interactionStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, interactionType, fields)

Get list of interactions subscribed by user

Returns the list of interactions subscribed by specific user

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long userId = 789L; // Long | userId
String interactionStatus = "interactionStatus_example"; // String | Interaction status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String interactionType = "interactionType_example"; // String | Interaction Type
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)createdDate<br/>5)interactionType<br/><b>A) Available values-</b><br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)issuer<br/>5)noOfResponses<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity<br/>14)interactionType
try {
    VerveResponseInteractionList result = apiInstance.getUserSubscribedInteractions(userId, interactionStatus, start, end, loggedInUserId, accessToken, clientToken, categoryId, interactionType, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getUserSubscribedInteractions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **interactionStatus** | **String**| Interaction status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **interactionType** | **String**| Interaction Type | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)interactionType&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfResponses&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity&lt;br/&gt;14)interactionType | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteractionList**](VerveResponseInteractionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="likeResponse"></a>
# **likeResponse**
> VerveResponseInteractionResponse likeResponse(interactionId, responseId, loggedInUserId, accessToken, clientToken, fields)

Like response

Allows the user to like the response.

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long interactionId = 789L; // Long | interactionId
Long responseId = 789L; // Long | responseId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionType<br/><b>A) Available values -</b><br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionId<br/>5)respondingUser<br/>6)isMarkedResponse<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked<br/>12)interactionType
try {
    VerveResponseInteractionResponse result = apiInstance.likeResponse(interactionId, responseId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#likeResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionId** | **Long**| interactionId |
 **responseId** | **Long**| responseId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionId&lt;br/&gt;5)respondingUser&lt;br/&gt;6)isMarkedResponse&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked&lt;br/&gt;12)interactionType | [optional] [default to responseId,responseDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="markAsAnResponse"></a>
# **markAsAnResponse**
> VerveResponseInteractionResponse markAsAnResponse(interactionId, responseId, loggedInUserId, accessToken, clientToken, fields)

Mark response as a response

Marks the response as accepted. This means the user is satisfied with the response &amp; then the interaction will go into closed state

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long interactionId = 789L; // Long | interactionId
Long responseId = 789L; // Long | responseId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionType<br/><b>A) Available values -</b><br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionId<br/>5)respondingUser<br/>6)isMarkedResponse<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked<br/>12)interactionType
try {
    VerveResponseInteractionResponse result = apiInstance.markAsAnResponse(interactionId, responseId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#markAsAnResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionId** | **Long**| interactionId |
 **responseId** | **Long**| responseId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionId&lt;br/&gt;5)respondingUser&lt;br/&gt;6)isMarkedResponse&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked&lt;br/&gt;12)interactionType | [optional] [default to responseId,responseDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="searchInteractions"></a>
# **searchInteractions**
> VerveResponseInteractionList searchInteractions(searchText, interactionStatus, start, end, loggedInUserId, accessToken, clientToken, interactionType, fields)

Get list of matching interactions

Returns the list of matching interactions

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
String searchText = "searchText_example"; // String | Search Text, keywords to search
String interactionStatus = "interactionStatus_example"; // String | Interaction status <br/> 1) ALL <br/> 2)  UNREPLIED <br/> 3)  REPLIED <br/> 4)  CLOSED
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionType = "interactionType_example"; // String | Interaction Type
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)createdDate<br/>5)interactionType<br/><b>A) Available values-</b><br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)issuer<br/>5)noOfResponses<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity<br/>14)interactionType
try {
    VerveResponseInteractionList result = apiInstance.searchInteractions(searchText, interactionStatus, start, end, loggedInUserId, accessToken, clientToken, interactionType, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#searchInteractions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchText** | **String**| Search Text, keywords to search |
 **interactionStatus** | **String**| Interaction status &lt;br/&gt; 1) ALL &lt;br/&gt; 2)  UNREPLIED &lt;br/&gt; 3)  REPLIED &lt;br/&gt; 4)  CLOSED |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **interactionType** | **String**| Interaction Type | [optional]
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)interactionType&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfResponses&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity&lt;br/&gt;14)interactionType | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteractionList**](VerveResponseInteractionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subscribeInteractinCategory"></a>
# **subscribeInteractinCategory**
> VerveResponseInteractionCategory subscribeInteractinCategory(categoryId, loggedInUserId, accessToken, clientToken, fields)

Subscribe interaction category

Returns the subscribed interaction category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long categoryId = 789L; // Long | categoryId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)interactionType<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed<br/>6)interactionType
try {
    VerveResponseInteractionCategory result = apiInstance.subscribeInteractinCategory(categoryId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#subscribeInteractinCategory");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed&lt;br/&gt;6)interactionType | [optional] [default to categoryId,categoryName,interactionType]

### Return type

[**VerveResponseInteractionCategory**](VerveResponseInteractionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="subscribeInteraction"></a>
# **subscribeInteraction**
> VerveResponseInteraction subscribeInteraction(interactionId, loggedInUserId, accessToken, clientToken, fields)

Subscribe interaction

Allows the user to subscribe a interaction

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long interactionId = 789L; // Long | interactionId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)createdDate<br/>5)interactionType<br/><b>A) Available values-</b><br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)issuer<br/>5)noOfResponses<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity<br/>14)interactionType
try {
    VerveResponseInteraction result = apiInstance.subscribeInteraction(interactionId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#subscribeInteraction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionId** | **Long**| interactionId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)interactionType&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfResponses&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity&lt;br/&gt;14)interactionType | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="unmarkAsAnResponse"></a>
# **unmarkAsAnResponse**
> VerveResponseInteractionResponse unmarkAsAnResponse(interactionId, responseId, loggedInUserId, accessToken, clientToken, fields)

Unmark response as a response

Unmarks the response. This will remove the marked response.

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long interactionId = 789L; // Long | interactionId
Long responseId = 789L; // Long | responseId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionType<br/><b>A) Available values -</b><br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionId<br/>5)respondingUser<br/>6)isMarkedResponse<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked<br/>12)interactionType
try {
    VerveResponseInteractionResponse result = apiInstance.unmarkAsAnResponse(interactionId, responseId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#unmarkAsAnResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionId** | **Long**| interactionId |
 **responseId** | **Long**| responseId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionId&lt;br/&gt;5)respondingUser&lt;br/&gt;6)isMarkedResponse&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked&lt;br/&gt;12)interactionType | [optional] [default to responseId,responseDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="unsubscribeInteractinCategory"></a>
# **unsubscribeInteractinCategory**
> VerveResponseInteractionCategory unsubscribeInteractinCategory(categoryId, loggedInUserId, accessToken, clientToken, fields)

Unsubscribe interaction category

Returns the unsubscribed interaction category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long categoryId = 789L; // Long | categoryId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)interactionType<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed<br/>6)interactionType
try {
    VerveResponseInteractionCategory result = apiInstance.unsubscribeInteractinCategory(categoryId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#unsubscribeInteractinCategory");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed&lt;br/&gt;6)interactionType | [optional] [default to categoryId,categoryName,interactionType]

### Return type

[**VerveResponseInteractionCategory**](VerveResponseInteractionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="unsubscribeInteraction"></a>
# **unsubscribeInteraction**
> VerveResponseInteraction unsubscribeInteraction(interactionId, loggedInUserId, accessToken, clientToken, fields)

Unsubscribe interaction

Allows the user to unsubscribe a interaction

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long interactionId = 789L; // Long | interactionId
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)createdDate<br/>5)interactionType<br/><b>A) Available values-</b><br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)issuer<br/>5)noOfResponses<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity<br/>14)interactionType
try {
    VerveResponseInteraction result = apiInstance.unsubscribeInteraction(interactionId, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#unsubscribeInteraction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionId** | **Long**| interactionId |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)interactionType&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfResponses&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity&lt;br/&gt;14)interactionType | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-www-form-urlencoded

<a name="updateInteraction"></a>
# **updateInteraction**
> VerveResponseInteraction updateInteraction(interactionId, interactionTitle, interactionDescription, loggedInUserId, accessToken, clientToken, fields)

Update interaction

Allows the user to update interaction. Returns the updated interaction

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long interactionId = 789L; // Long | interactionId
String interactionTitle = "interactionTitle_example"; // String | Interaction Title
String interactionDescription = "interactionDescription_example"; // String | Describe Interaction
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)createdDate<br/>5)interactionType<br/><b>A) Available values-</b><br/>1)interactionId<br/>2)interactionTitle<br/>3)interactionDescription<br/>4)issuer<br/>5)noOfResponses<br/>6)isClosed<br/>7)createdDate<br/>8)lastUpdatedDate<br/>9)videoId<br/>10)fileURL<br/>11)isSubscribed<br/>12)sentiment</br>13)entity<br/>14)interactionType
try {
    VerveResponseInteraction result = apiInstance.updateInteraction(interactionId, interactionTitle, interactionDescription, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#updateInteraction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionId** | **Long**| interactionId |
 **interactionTitle** | **String**| Interaction Title |
 **interactionDescription** | **String**| Describe Interaction |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)interactionType&lt;br/&gt;&lt;b&gt;A) Available values-&lt;/b&gt;&lt;br/&gt;1)interactionId&lt;br/&gt;2)interactionTitle&lt;br/&gt;3)interactionDescription&lt;br/&gt;4)issuer&lt;br/&gt;5)noOfResponses&lt;br/&gt;6)isClosed&lt;br/&gt;7)createdDate&lt;br/&gt;8)lastUpdatedDate&lt;br/&gt;9)videoId&lt;br/&gt;10)fileURL&lt;br/&gt;11)isSubscribed&lt;br/&gt;12)sentiment&lt;/br&gt;13)entity&lt;br/&gt;14)interactionType | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateInteractionCategory"></a>
# **updateInteractionCategory**
> VerveResponseInteractionCategory updateInteractionCategory(categoryId, categoryName, categoryDescription, loggedInUserId, accessToken, clientToken, fields)

Update interaction category

Allows the user to update the interaction category. Returns the updated interaction category

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long categoryId = 789L; // Long | categoryId
String categoryName = "categoryName_example"; // String | Category Name
String categoryDescription = "categoryDescription_example"; // String | Describe category
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)interactionType<br/><b>A) Available values -</b> <br/>1)categoryId<br/>2)categoryName<br/>3)categoryDescription<br/>4)createdDate<br/>5)isSubscribed<br/>6)interactionType
try {
    VerveResponseInteractionCategory result = apiInstance.updateInteractionCategory(categoryId, categoryName, categoryDescription, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#updateInteractionCategory");
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
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt; &lt;br/&gt;1)categoryId&lt;br/&gt;2)categoryName&lt;br/&gt;3)categoryDescription&lt;br/&gt;4)createdDate&lt;br/&gt;5)isSubscribed&lt;br/&gt;6)interactionType | [optional] [default to categoryId,categoryName,interactionType]

### Return type

[**VerveResponseInteractionCategory**](VerveResponseInteractionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateResponse"></a>
# **updateResponse**
> VerveResponseInteractionResponse updateResponse(responseId, response, loggedInUserId, accessToken, clientToken, fields)

Update response

Allows the user to update an response. Returns the updated response

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.InteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

InteractionApi apiInstance = new InteractionApi();
Long responseId = 789L; // Long | responseId
String response = "response_example"; // String | response
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list<br/> <b>A) Default values -</b> <br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionType<br/><b>A) Available values -</b><br/>1)responseId<br/>2)responseDescription<br/>3)createdDate<br/>4)interactionId<br/>5)respondingUser<br/>6)isMarkedResponse<br/>7)noOfLikes<br/>8)noOfDislikes<br/>9)replyCount<br/>10)isLiked<br/>11)isDisliked<br/>12)interactionType
try {
    VerveResponseInteractionResponse result = apiInstance.updateResponse(responseId, response, loggedInUserId, accessToken, clientToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#updateResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseId** | **Long**| responseId |
 **response** | **String**| response |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list&lt;br/&gt; &lt;b&gt;A) Default values -&lt;/b&gt; &lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionType&lt;br/&gt;&lt;b&gt;A) Available values -&lt;/b&gt;&lt;br/&gt;1)responseId&lt;br/&gt;2)responseDescription&lt;br/&gt;3)createdDate&lt;br/&gt;4)interactionId&lt;br/&gt;5)respondingUser&lt;br/&gt;6)isMarkedResponse&lt;br/&gt;7)noOfLikes&lt;br/&gt;8)noOfDislikes&lt;br/&gt;9)replyCount&lt;br/&gt;10)isLiked&lt;br/&gt;11)isDisliked&lt;br/&gt;12)interactionType | [optional] [default to responseId,responseDescription,createdDate,interactionType]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

