# InteractionApi

All URIs are relative to *https://api.iengage.io:8243/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInteraction**](InteractionApi.md#addInteraction) | **POST** /interactions | Share interaction without attachment
[**addInteraction_0**](InteractionApi.md#addInteraction_0) | **POST** /interactions/attachment | Share interaction with attachment
[**addResponse**](InteractionApi.md#addResponse) | **POST** /interactions/{interactionId}/responses | Response the specified interaction
[**addResponse_0**](InteractionApi.md#addResponse_0) | **POST** /interactions/{interactionId}/responses/attachment | Response the specified interaction
[**changeInteractionCategory**](InteractionApi.md#changeInteractionCategory) | **PUT** /interactions/{interactionId}/{categoryId} | Change interaction category
[**changeInteractionType**](InteractionApi.md#changeInteractionType) | **PUT** /interactions/{interactionId}/type | Change interaction type
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
> VerveResponseInteraction addInteraction(requesterId, clientToken, body, accessToken)

Share interaction without attachment

This service allows a user to post an interaction. The following fields(key:value) are required to be present in the Interaction JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API.      **Required fields**      1. interactionTitle     

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
InteractionInputModel body = new InteractionInputModel(); // InteractionInputModel | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteraction result = apiInstance.addInteraction(requesterId, clientToken, body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#addInteraction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body** | [**InteractionInputModel**](InteractionInputModel.md)|  | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addInteraction_0"></a>
# **addInteraction_0**
> VerveResponseInteraction addInteraction_0(interactionTitle, file, requesterId, clientToken, categoryId, interactionType, interactionDescription, association, accessToken)

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
String interactionTitle = "interactionTitle_example"; // String | interactionTitle
File file = new File("/path/to/file.txt"); // File | file
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String categoryId = "categoryId_example"; // String | categoryId
String interactionType = "interactionType_example"; // String | interactionType
String interactionDescription = "interactionDescription_example"; // String | interactionDescription
String association = "association_example"; // String | association
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteraction result = apiInstance.addInteraction_0(interactionTitle, file, requesterId, clientToken, categoryId, interactionType, interactionDescription, association, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#addInteraction_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionTitle** | **String**| interactionTitle |
 **file** | **File**| file |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **String**| categoryId | [optional]
 **interactionType** | **String**| interactionType | [optional]
 **interactionDescription** | **String**| interactionDescription | [optional]
 **association** | **String**| association | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="addResponse"></a>
# **addResponse**
> VerveResponseInteractionResponse addResponse(interactionId, requesterId, clientToken, body, accessToken)

Response the specified interaction

This service allows a user to post a response on an interaction. The following fields(key:value) are required to be present in the Response JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API.      **Required fields**     1. interactionId (Path Parameter)     2. responseDescription     

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
InteractionResponse body = new InteractionResponse(); // InteractionResponse | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionResponse result = apiInstance.addResponse(interactionId, requesterId, clientToken, body, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body** | [**InteractionResponse**](InteractionResponse.md)|  | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json
 - **Accept**: application/json

<a name="addResponse_0"></a>
# **addResponse_0**
> VerveResponseInteractionResponse addResponse_0(body, body2, loggedInUserId, accessToken, clientToken, body3, body4)

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
Long body = 789L; // Long | interactionId
String body2 = "body_example"; // String | response
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String body3 = "body_example"; // String | Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/
List<Attachment> body4 = Arrays.asList(new Attachment()); // List<Attachment> | 
try {
    VerveResponseInteractionResponse result = apiInstance.addResponse_0(body, body2, loggedInUserId, accessToken, clientToken, body3, body4);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#addResponse_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Long**| interactionId |
 **body2** | **String**| response |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body3** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/ | [optional]
 **body4** | [**List&lt;Attachment&gt;**](Attachment.md)|  | [optional]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="changeInteractionCategory"></a>
# **changeInteractionCategory**
> VerveResponseInteraction changeInteractionCategory(interactionId, categoryId, requesterId, clientToken, fields, accessToken)

Change interaction category

Allows the user to change the interaction category.

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
Long categoryId = 789L; // Long | New interaction categoryId
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName"; // String | Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteraction result = apiInstance.changeInteractionCategory(interactionId, categoryId, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#changeInteractionCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionId** | **Long**| interactionId |
 **categoryId** | **Long**| New interaction categoryId |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/ | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="changeInteractionType"></a>
# **changeInteractionType**
> VerveResponseInteraction changeInteractionType(interactionId, interactionType, requesterId, clientToken, fields, accessToken)

Change interaction type

Allows the user to change the interaction type. Boolean value

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
String interactionType = "interactionType_example"; // String | New interaction type
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName"; // String | Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteraction result = apiInstance.changeInteractionType(interactionId, interactionType, requesterId, clientToken, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#changeInteractionType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionId** | **Long**| interactionId |
 **interactionType** | **String**| New interaction type |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/ | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="createInteractionCategory"></a>
# **createInteractionCategory**
> VerveResponseInteractionCategory createInteractionCategory(requesterId, clientToken, body, accessToken)

Create interaction category

This service allows a user to create a category. The following fields(key:value) are required to be present in the Category JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API.      **Required fields**      1. associationId      2. categoryName      3. interactionType     

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
InteractionCategory body = new InteractionCategory(); // InteractionCategory | 
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionCategory result = apiInstance.createInteractionCategory(requesterId, clientToken, body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#createInteractionCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **body** | [**InteractionCategory**](InteractionCategory.md)|  | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionCategory**](VerveResponseInteractionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json
 - **Accept**: application/json

<a name="deleteInteraction"></a>
# **deleteInteraction**
> VerveResponseInteraction deleteInteraction(interactionId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName"; // String | Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteraction result = apiInstance.deleteInteraction(interactionId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/ | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteInteractionCategory"></a>
# **deleteInteractionCategory**
> VerveResponseInteractionCategory deleteInteractionCategory(categoryId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName,interactionType"; // String | Filter fields in result list       /_*   **A) Default values -**        1)categoryId       2)categoryName       3)interactionType        **A) Available values -**         1)categoryId       2)categoryName       3)categoryDescription       4)createdDate       5)isSubscribed       6)interactionType   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionCategory result = apiInstance.deleteInteractionCategory(categoryId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)categoryId       2)categoryName       3)interactionType        **A) Available values -**         1)categoryId       2)categoryName       3)categoryDescription       4)createdDate       5)isSubscribed       6)interactionType   *_/ | [optional] [default to categoryId,categoryName,interactionType]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionCategory**](VerveResponseInteractionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteResponse"></a>
# **deleteResponse**
> VerveResponseInteractionResponse deleteResponse(responseId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionResponse result = apiInstance.deleteResponse(responseId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/ | [optional] [default to responseId,responseDescription,createdDate,interactionType]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="dislikeResponse"></a>
# **dislikeResponse**
> VerveResponseInteractionResponse dislikeResponse(interactionId, responseId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionResponse result = apiInstance.dislikeResponse(interactionId, responseId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/ | [optional] [default to responseId,responseDescription,createdDate,interactionType]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getFriendsInteractions"></a>
# **getFriendsInteractions**
> VerveResponseInteractionList getFriendsInteractions(interactionStatus, start, end, requesterId, clientToken, interactionType, categoryId, association, fields, accessToken)

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
String interactionStatus = "interactionStatus_example"; // String |   /_*  Interaction status       1) ALL       2)  UNREPLIED       3)  REPLIED       4)  CLOSED   *_/
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionType = "interactionType_example"; // String | Interaction Type
Long categoryId = 789L; // Long | categoryId
String association = "association_example"; // String | association
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName"; // String | Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionList result = apiInstance.getFriendsInteractions(interactionStatus, start, end, requesterId, clientToken, interactionType, categoryId, association, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getFriendsInteractions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionStatus** | **String**|   /_*  Interaction status       1) ALL       2)  UNREPLIED       3)  REPLIED       4)  CLOSED   *_/ |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **interactionType** | **String**| Interaction Type | [optional]
 **categoryId** | **Long**| categoryId | [optional]
 **association** | **String**| association | [optional]
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/ | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionList**](VerveResponseInteractionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInteraction"></a>
# **getInteraction**
> VerveResponseInteraction getInteraction(interactionId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName"; // String | Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteraction result = apiInstance.getInteraction(interactionId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/ | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInteractionCategories"></a>
# **getInteractionCategories**
> VerveResponseInteractionCategoryList getInteractionCategories(start, end, requesterId, clientToken, interactionType, association, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionType = "interactionType_example"; // String | Interaction Type
String association = "association_example"; // String | association
String fields = "categoryId,categoryName,interactionType"; // String | Filter fields in result list       /_*   **A) Default values -**        1)categoryId       2)categoryName       3)interactionType        **A) Available values -**         1)categoryId       2)categoryName       3)categoryDescription       4)createdDate       5)isSubscribed       6)interactionType   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionCategoryList result = apiInstance.getInteractionCategories(start, end, requesterId, clientToken, interactionType, association, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **interactionType** | **String**| Interaction Type | [optional]
 **association** | **String**| association | [optional]
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)categoryId       2)categoryName       3)interactionType        **A) Available values -**         1)categoryId       2)categoryName       3)categoryDescription       4)createdDate       5)isSubscribed       6)interactionType   *_/ | [optional] [default to categoryId,categoryName,interactionType]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionCategoryList**](VerveResponseInteractionCategoryList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInteractionsForUser"></a>
# **getInteractionsForUser**
> VerveResponseInteractionList getInteractionsForUser(interactionStatus, start, end, requesterId, clientToken, categoryId, interactionType, association, fields, accessToken)

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
String interactionStatus = "interactionStatus_example"; // String |   /_*  Interaction status       1) ALL       2)  UNREPLIED       3)  REPLIED       4)  CLOSED   *_/
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String interactionType = "interactionType_example"; // String | Interaction Type
String association = "association_example"; // String | association
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName"; // String | Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionList result = apiInstance.getInteractionsForUser(interactionStatus, start, end, requesterId, clientToken, categoryId, interactionType, association, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getInteractionsForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionStatus** | **String**|   /_*  Interaction status       1) ALL       2)  UNREPLIED       3)  REPLIED       4)  CLOSED   *_/ |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **interactionType** | **String**| Interaction Type | [optional]
 **association** | **String**| association | [optional]
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/ | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionList**](VerveResponseInteractionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendInteractions"></a>
# **getRecommendInteractions**
> VerveResponseInteractionList getRecommendInteractions(start, end, requesterId, clientToken, interactionType, association, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionType = "interactionType_example"; // String | interactionType
String association = "association_example"; // String | association
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName"; // String | Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionList result = apiInstance.getRecommendInteractions(start, end, requesterId, clientToken, interactionType, association, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **interactionType** | **String**| interactionType | [optional]
 **association** | **String**| association | [optional]
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/ | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionList**](VerveResponseInteractionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendedInteractinsFromDB"></a>
# **getRecommendedInteractinsFromDB**
> VerveResponseInteractionList getRecommendedInteractinsFromDB(userId, start, end, requesterId, clientToken, interactionType, association, fields, accessToken)

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
Long userId = 789L; // Long | User Id whose recommended interactions want to get
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionType = "interactionType_example"; // String | Interaction Type
String association = "association_example"; // String | association
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,,interactionType"; // String | Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionList result = apiInstance.getRecommendedInteractinsFromDB(userId, start, end, requesterId, clientToken, interactionType, association, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getRecommendedInteractinsFromDB");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id whose recommended interactions want to get |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **interactionType** | **String**| Interaction Type | [optional]
 **association** | **String**| association | [optional]
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/ | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,,interactionType]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionList**](VerveResponseInteractionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecommendedUsersFromDB"></a>
# **getRecommendedUsersFromDB**
> VerveResponseUserList getRecommendedUsersFromDB(interactionId, start, end, requesterId, clientToken, association, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String association = "association_example"; // String | association
String fields = "userId,firstName,lastName"; // String | Filter fields in result list        /_*   **A) Default values -**        1)userId       2)firstName       3)lastName       4)profileImage        **A) Available values-**       1)userId       2)firstName       3)lastName       4)emailId       5)profileImage       6)birthDate        *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseUserList result = apiInstance.getRecommendedUsersFromDB(interactionId, start, end, requesterId, clientToken, association, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **association** | **String**| association | [optional]
 **fields** | **String**| Filter fields in result list        /_*   **A) Default values -**        1)userId       2)firstName       3)lastName       4)profileImage        **A) Available values-**       1)userId       2)firstName       3)lastName       4)emailId       5)profileImage       6)birthDate        *_/ | [optional] [default to userId,firstName,lastName]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseUserList**](VerveResponseUserList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResponses"></a>
# **getResponses**
> VerveResponseInteractionResponseList getResponses(interactionId, start, end, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionResponseList result = apiInstance.getResponses(interactionId, start, end, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/ | [optional] [default to responseId,responseDescription,createdDate,interactionType]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionResponseList**](VerveResponseInteractionResponseList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserInteractions"></a>
# **getUserInteractions**
> VerveResponseInteractionList getUserInteractions(userId, interactionStatus, start, end, requesterId, clientToken, categoryId, interactionType, association, fields, accessToken)

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
Long userId = 789L; // Long | userId whose shared interactions want to get
String interactionStatus = "interactionStatus_example"; // String |   /_*  Interaction status       1) ALL       2)  UNREPLIED       3)  REPLIED       4)  CLOSED   *_/
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String interactionType = "interactionType_example"; // String | Interaction Type
String association = "association_example"; // String | association
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName"; // String | Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionList result = apiInstance.getUserInteractions(userId, interactionStatus, start, end, requesterId, clientToken, categoryId, interactionType, association, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getUserInteractions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId whose shared interactions want to get |
 **interactionStatus** | **String**|   /_*  Interaction status       1) ALL       2)  UNREPLIED       3)  REPLIED       4)  CLOSED   *_/ |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **interactionType** | **String**| Interaction Type | [optional]
 **association** | **String**| association | [optional]
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/ | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionList**](VerveResponseInteractionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSubscribedInteractionCategories"></a>
# **getUserSubscribedInteractionCategories**
> VerveResponseInteractionCategoryList getUserSubscribedInteractionCategories(userId, start, end, requesterId, clientToken, interactionType, association, fields, accessToken)

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
Long userId = 789L; // Long | User Id whose subcripbed category want to get
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionType = "interactionType_example"; // String | interactionType
String association = "association_example"; // String | association
String fields = "categoryId,categoryName,interactionType"; // String | Filter fields in result list       /_*   **A) Default values -**        1)categoryId       2)categoryName       3)interactionType        **A) Available values -**         1)categoryId       2)categoryName       3)categoryDescription       4)createdDate       5)isSubscribed       6)interactionType   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionCategoryList result = apiInstance.getUserSubscribedInteractionCategories(userId, start, end, requesterId, clientToken, interactionType, association, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getUserSubscribedInteractionCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id whose subcripbed category want to get |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **interactionType** | **String**| interactionType | [optional]
 **association** | **String**| association | [optional]
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)categoryId       2)categoryName       3)interactionType        **A) Available values -**         1)categoryId       2)categoryName       3)categoryDescription       4)createdDate       5)isSubscribed       6)interactionType   *_/ | [optional] [default to categoryId,categoryName,interactionType]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionCategoryList**](VerveResponseInteractionCategoryList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSubscribedInteractions"></a>
# **getUserSubscribedInteractions**
> VerveResponseInteractionList getUserSubscribedInteractions(userId, interactionStatus, start, end, requesterId, clientToken, categoryId, interactionType, association, fields, accessToken)

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
Long userId = 789L; // Long | User Id whose subcribed interactions wants to get
String interactionStatus = "interactionStatus_example"; // String |   /_*  Interaction status       1) ALL       2)  UNREPLIED       3)  REPLIED       4)  CLOSED   *_/
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
Long categoryId = 789L; // Long | categoryId
String interactionType = "interactionType_example"; // String | Interaction Type
String association = "association_example"; // String | association
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName"; // String | Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionList result = apiInstance.getUserSubscribedInteractions(userId, interactionStatus, start, end, requesterId, clientToken, categoryId, interactionType, association, fields, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteractionApi#getUserSubscribedInteractions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id whose subcribed interactions wants to get |
 **interactionStatus** | **String**|   /_*  Interaction status       1) ALL       2)  UNREPLIED       3)  REPLIED       4)  CLOSED   *_/ |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryId** | **Long**| categoryId | [optional]
 **interactionType** | **String**| Interaction Type | [optional]
 **association** | **String**| association | [optional]
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/ | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionList**](VerveResponseInteractionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="likeResponse"></a>
# **likeResponse**
> VerveResponseInteractionResponse likeResponse(interactionId, responseId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionResponse result = apiInstance.likeResponse(interactionId, responseId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/ | [optional] [default to responseId,responseDescription,createdDate,interactionType]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="markAsAnResponse"></a>
# **markAsAnResponse**
> VerveResponseInteractionResponse markAsAnResponse(interactionId, responseId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionResponse result = apiInstance.markAsAnResponse(interactionId, responseId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/ | [optional] [default to responseId,responseDescription,createdDate,interactionType]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="searchInteractions"></a>
# **searchInteractions**
> VerveResponseInteractionList searchInteractions(searchText, interactionStatus, start, end, requesterId, clientToken, interactionType, association, fields, accessToken)

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
String interactionStatus = "interactionStatus_example"; // String |   /_*  Interaction status       1) ALL       2)  UNREPLIED       3)  REPLIED       4)  CLOSED  *_/
Integer start = 56; // Integer | start, initial value start from 0
Integer end = 56; // Integer | end
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionType = "interactionType_example"; // String | Interaction Type
String association = "association_example"; // String | association
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName"; // String | Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionList result = apiInstance.searchInteractions(searchText, interactionStatus, start, end, requesterId, clientToken, interactionType, association, fields, accessToken);
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
 **interactionStatus** | **String**|   /_*  Interaction status       1) ALL       2)  UNREPLIED       3)  REPLIED       4)  CLOSED  *_/ |
 **start** | **Integer**| start, initial value start from 0 |
 **end** | **Integer**| end |
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **interactionType** | **String**| Interaction Type | [optional]
 **association** | **String**| association | [optional]
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/ | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionList**](VerveResponseInteractionList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subscribeInteractinCategory"></a>
# **subscribeInteractinCategory**
> VerveResponseInteractionCategory subscribeInteractinCategory(categoryId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName,interactionType"; // String | Filter fields in result list       /_*   **A) Default values -**        1)categoryId       2)categoryName       3)interactionType        **A) Available values -**         1)categoryId       2)categoryName       3)categoryDescription       4)createdDate       5)isSubscribed       6)interactionType   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionCategory result = apiInstance.subscribeInteractinCategory(categoryId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)categoryId       2)categoryName       3)interactionType        **A) Available values -**         1)categoryId       2)categoryName       3)categoryDescription       4)createdDate       5)isSubscribed       6)interactionType   *_/ | [optional] [default to categoryId,categoryName,interactionType]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionCategory**](VerveResponseInteractionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="subscribeInteraction"></a>
# **subscribeInteraction**
> VerveResponseInteraction subscribeInteraction(interactionId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName"; // String | Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteraction result = apiInstance.subscribeInteraction(interactionId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/ | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="unmarkAsAnResponse"></a>
# **unmarkAsAnResponse**
> VerveResponseInteractionResponse unmarkAsAnResponse(interactionId, responseId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionResponse result = apiInstance.unmarkAsAnResponse(interactionId, responseId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/ | [optional] [default to responseId,responseDescription,createdDate,interactionType]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="unsubscribeInteractinCategory"></a>
# **unsubscribeInteractinCategory**
> VerveResponseInteractionCategory unsubscribeInteractinCategory(categoryId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "categoryId,categoryName,interactionType"; // String | Filter fields in result list       /_*   **A) Default values -**        1)categoryId       2)categoryName       3)interactionType        **A) Available values -**         1)categoryId       2)categoryName       3)categoryDescription       4)createdDate       5)isSubscribed       6)interactionType   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionCategory result = apiInstance.unsubscribeInteractinCategory(categoryId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)categoryId       2)categoryName       3)interactionType        **A) Available values -**         1)categoryId       2)categoryName       3)categoryDescription       4)createdDate       5)isSubscribed       6)interactionType   *_/ | [optional] [default to categoryId,categoryName,interactionType]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionCategory**](VerveResponseInteractionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="unsubscribeInteraction"></a>
# **unsubscribeInteraction**
> VerveResponseInteraction unsubscribeInteraction(interactionId, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName"; // String | Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteraction result = apiInstance.unsubscribeInteraction(interactionId, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/ | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateInteraction"></a>
# **updateInteraction**
> VerveResponseInteraction updateInteraction(interactionId, interactionTitle, requesterId, clientToken, interactionDescription, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionDescription = "interactionDescription_example"; // String | Describe Interaction
String fields = "interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName"; // String | Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteraction result = apiInstance.updateInteraction(interactionId, interactionTitle, requesterId, clientToken, interactionDescription, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **interactionDescription** | **String**| Describe Interaction | [optional]
 **fields** | **String**| Filter fields in result list      /_*   **A) Default values -**        1)interactionId       2)interactionTitle       3)interactionDescription       4)createdDate       5)interactionType        **A) Available values-**        1)interactionId       2)interactionTitle       3)interactionDescription       4)issuer       5)noOfResponses       6)isClosed       7)createdDate       8)lastUpdatedDate       9)videoId       10)fileURL       11)isSubscribed       12)sentiment       13)entity       14)interactionType       15)categoryId       16)categoryName   *_/ | [optional] [default to interactionId,interactionTitle,interactionDescription,createdDate,interactionType,categoryName]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteraction**](VerveResponseInteraction.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateInteractionCategory"></a>
# **updateInteractionCategory**
> VerveResponseInteractionCategory updateInteractionCategory(categoryId, categoryName, requesterId, clientToken, categoryDescription, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String categoryDescription = "categoryDescription_example"; // String | Describe category
String fields = "categoryId,categoryName,interactionType"; // String | Filter fields in result list       /_*   **A) Default values -**        1)categoryId       2)categoryName       3)interactionType        **A) Available values -**         1)categoryId       2)categoryName       3)categoryDescription       4)createdDate       5)isSubscribed       6)interactionType   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionCategory result = apiInstance.updateInteractionCategory(categoryId, categoryName, requesterId, clientToken, categoryDescription, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **categoryDescription** | **String**| Describe category | [optional]
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)categoryId       2)categoryName       3)interactionType        **A) Available values -**         1)categoryId       2)categoryName       3)categoryDescription       4)createdDate       5)isSubscribed       6)interactionType   *_/ | [optional] [default to categoryId,categoryName,interactionType]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionCategory**](VerveResponseInteractionCategory.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateResponse"></a>
# **updateResponse**
> VerveResponseInteractionResponse updateResponse(responseId, response, requesterId, clientToken, fields, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String fields = "responseId,responseDescription,createdDate,interactionType"; // String | Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseInteractionResponse result = apiInstance.updateResponse(responseId, response, requesterId, clientToken, fields, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **fields** | **String**| Filter fields in result list       /_*   **A) Default values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionType        **A) Available values -**        1)responseId       2)responseDescription       3)createdDate       4)interactionId       5)respondingUser       6)isMarkedResponse       7)noOfLikes       8)noOfDislikes       9)replyCount       10)isLiked       11)isDisliked       12)interactionType   *_/ | [optional] [default to responseId,responseDescription,createdDate,interactionType]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseInteractionResponse**](VerveResponseInteractionResponse.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

