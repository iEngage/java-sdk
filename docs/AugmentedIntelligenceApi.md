# AugmentedIntelligenceApi

All URIs are relative to *https://api.iengage.io:8243/api/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInteraction**](AugmentedIntelligenceApi.md#getInteraction) | **GET** /machineLearning/interactionType | Get the type of interaction
[**getPopularTag**](AugmentedIntelligenceApi.md#getPopularTag) | **GET** /analytics/popular/tags | Get list of popular tag of interactions
[**getSentiment**](AugmentedIntelligenceApi.md#getSentiment) | **GET** /analytics/sentiments | Get sentiment count of interactions
[**getTagEntitySentiments**](AugmentedIntelligenceApi.md#getTagEntitySentiments) | **GET** /analytics/tag/entitySentiment | Get list of tag entity sentiment


<a name="getInteraction"></a>
# **getInteraction**
> VerveResponseNLCList getInteraction(text, loggedInUserId, accessToken, clientToken)

Get the type of interaction

Classifies text to question, complaint or suggestion

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.AugmentedIntelligenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

AugmentedIntelligenceApi apiInstance = new AugmentedIntelligenceApi();
String text = "text_example"; // String | Text to be classified
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseNLCList result = apiInstance.getInteraction(text, loggedInUserId, accessToken, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AugmentedIntelligenceApi#getInteraction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Text to be classified |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseNLCList**](VerveResponseNLCList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPopularTag"></a>
# **getPopularTag**
> VerveResponseTagList getPopularTag(startTime, endTime, start, end, loggedInUserId, accessToken, clientToken, interactionType, sentimentType, additionalInformation)

Get list of popular tag of interactions

Return the most popular tag of given interaction type

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.AugmentedIntelligenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

AugmentedIntelligenceApi apiInstance = new AugmentedIntelligenceApi();
Long startTime = 789L; // Long | start time
Long endTime = 789L; // Long | end time
Integer start = 56; // Integer | start
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionType = "interactionType_example"; // String | Interaction Type <br/>1)Question<br/>2)Complaint<br/>3)Idea<br/>4)Blog<br/>5)Discussion
String sentimentType = "sentimentType_example"; // String | Sentiment Type <br/>1)Positive<br/>2)Negative<br/> 3)Neutral
String additionalInformation = "additionalInformation_example"; // String | additional information
try {
    VerveResponseTagList result = apiInstance.getPopularTag(startTime, endTime, start, end, loggedInUserId, accessToken, clientToken, interactionType, sentimentType, additionalInformation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AugmentedIntelligenceApi#getPopularTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Long**| start time |
 **endTime** | **Long**| end time |
 **start** | **Integer**| start |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **interactionType** | **String**| Interaction Type &lt;br/&gt;1)Question&lt;br/&gt;2)Complaint&lt;br/&gt;3)Idea&lt;br/&gt;4)Blog&lt;br/&gt;5)Discussion | [optional]
 **sentimentType** | **String**| Sentiment Type &lt;br/&gt;1)Positive&lt;br/&gt;2)Negative&lt;br/&gt; 3)Neutral | [optional]
 **additionalInformation** | **String**| additional information | [optional]

### Return type

[**VerveResponseTagList**](VerveResponseTagList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSentiment"></a>
# **getSentiment**
> VerveResponseSentimentAnalytics getSentiment(startTime, endTime, loggedInUserId, accessToken, clientToken, interactionType, additionalInformation)

Get sentiment count of interactions

Returns the sum of the sentiment count of given interaction type

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.AugmentedIntelligenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

AugmentedIntelligenceApi apiInstance = new AugmentedIntelligenceApi();
Long startTime = 789L; // Long | start time
Long endTime = 789L; // Long | end time
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionType = "interactionType_example"; // String | Interaction Type <br/>1)Question<br/>2)Complaint<br/>3)Idea<br/>4)Blog<br/>5)Discussion
String additionalInformation = "additionalInformation_example"; // String | additional information
try {
    VerveResponseSentimentAnalytics result = apiInstance.getSentiment(startTime, endTime, loggedInUserId, accessToken, clientToken, interactionType, additionalInformation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AugmentedIntelligenceApi#getSentiment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Long**| start time |
 **endTime** | **Long**| end time |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **interactionType** | **String**| Interaction Type &lt;br/&gt;1)Question&lt;br/&gt;2)Complaint&lt;br/&gt;3)Idea&lt;br/&gt;4)Blog&lt;br/&gt;5)Discussion | [optional]
 **additionalInformation** | **String**| additional information | [optional]

### Return type

[**VerveResponseSentimentAnalytics**](VerveResponseSentimentAnalytics.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTagEntitySentiments"></a>
# **getTagEntitySentiments**
> VerveResponseEntitySentimentList getTagEntitySentiments(tagName, startTime, endTime, start, end, loggedInUserId, accessToken, clientToken, sentimentType, additionalInformation)

Get list of tag entity sentiment

Return the list of tag entity sentiments

### Example
```java
// Import classes:
//import com.iengage.ApiClient;
//import com.iengage.ApiException;
//import com.iengage.Configuration;
//import com.iengage.auth.*;
//import com.iengage.service.AugmentedIntelligenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: default
OAuth default = (OAuth) defaultClient.getAuthentication("default");
default.setAccessToken("YOUR ACCESS TOKEN");

AugmentedIntelligenceApi apiInstance = new AugmentedIntelligenceApi();
String tagName = "tagName_example"; // String | tag name
Long startTime = 789L; // Long | start time
Long endTime = 789L; // Long | end time
Integer start = 56; // Integer | start
Integer end = 56; // Integer | end
String loggedInUserId = "loggedInUserId_example"; // String | User id of logged / authenticated user
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String sentimentType = "sentimentType_example"; // String | Sentiment Type <br/>1)Positive<br/>2)Negative<br/>3)Neutral
String additionalInformation = "additionalInformation_example"; // String | additional information
try {
    VerveResponseEntitySentimentList result = apiInstance.getTagEntitySentiments(tagName, startTime, endTime, start, end, loggedInUserId, accessToken, clientToken, sentimentType, additionalInformation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AugmentedIntelligenceApi#getTagEntitySentiments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagName** | **String**| tag name |
 **startTime** | **Long**| start time |
 **endTime** | **Long**| end time |
 **start** | **Integer**| start |
 **end** | **Integer**| end |
 **loggedInUserId** | **String**| User id of logged / authenticated user |
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **sentimentType** | **String**| Sentiment Type &lt;br/&gt;1)Positive&lt;br/&gt;2)Negative&lt;br/&gt;3)Neutral | [optional]
 **additionalInformation** | **String**| additional information | [optional]

### Return type

[**VerveResponseEntitySentimentList**](VerveResponseEntitySentimentList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

