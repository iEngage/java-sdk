# AugmentedIntelligenceApi

All URIs are relative to *https://api.iengage.io:8243/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**classify**](AugmentedIntelligenceApi.md#classify) | **POST** /ml/classifier/classify | Classifies using your classifier
[**getEntities**](AugmentedIntelligenceApi.md#getEntities) | **POST** /ml/ner/classify | Extracts entities from text
[**getInteractionType**](AugmentedIntelligenceApi.md#getInteractionType) | **POST** /ml/interactionType | Returns the type of interaction
[**getKeywords**](AugmentedIntelligenceApi.md#getKeywords) | **POST** /ml/keywords | Returns the keywords of the sentence
[**getPopularTag**](AugmentedIntelligenceApi.md#getPopularTag) | **GET** /analytics/popular/tags | Get list of popular tag of interactions
[**getSentiment**](AugmentedIntelligenceApi.md#getSentiment) | **GET** /analytics/sentiments | Get sentiment count of interactions
[**getTagEntitySentiments**](AugmentedIntelligenceApi.md#getTagEntitySentiments) | **GET** /analytics/tag/entitySentiment | Get list of tag entity sentiment
[**sentiment**](AugmentedIntelligenceApi.md#sentiment) | **POST** /ml/sentiment | Analyzes the sentiment of the content


<a name="classify"></a>
# **classify**
> VerveResponseTextClassificationList classify(text, id, clientToken)

Classifies using your classifier

Returns a classification based on your training in the Classifier Admin Panel. More than one classifier may be trained. Use the correct ID from the Admin Panel to get the corresponding classification

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
String text = "text_example"; // String | Text you want classified
Long id = 789L; // Long | Classifier ID from the Admin Panel
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseTextClassificationList result = apiInstance.classify(text, id, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AugmentedIntelligenceApi#classify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Text you want classified |
 **id** | **Long**| Classifier ID from the Admin Panel |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseTextClassificationList**](VerveResponseTextClassificationList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEntities"></a>
# **getEntities**
> VerveResponseEntitiesClassifiedList getEntities(id, text, clientToken)

Extracts entities from text

Classifies each word of the text as an entity based on your training in the NER Admin panel. More than one classifier may be trained. Use the correct ID from the Admin Panel to get the corresponding classification

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
Long id = 789L; // Long | NER ID present from the Admin Panel
String text = "text_example"; // String | Text from which to extract entities
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseEntitiesClassifiedList result = apiInstance.getEntities(id, text, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AugmentedIntelligenceApi#getEntities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| NER ID present from the Admin Panel |
 **text** | **String**| Text from which to extract entities |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseEntitiesClassifiedList**](VerveResponseEntitiesClassifiedList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInteractionType"></a>
# **getInteractionType**
> VerveResponseFlowFinder getInteractionType(text, clientToken)

Returns the type of interaction

Classifies text to question, complaint, appreciation, suggestion or comment. This is the default classification we assign to the type field of an Interaction

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
String text = "text_example"; // String | Text that is to be classified by type
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseFlowFinder result = apiInstance.getInteractionType(text, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AugmentedIntelligenceApi#getInteractionType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Text that is to be classified by type |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseFlowFinder**](VerveResponseFlowFinder.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getKeywords"></a>
# **getKeywords**
> VerveResponseKeyword getKeywords(text, clientToken)

Returns the keywords of the sentence

Extracts the keywords of a sentence. This could be used for example as tags.

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
String text = "text_example"; // String | Content whose keywords are to be found out
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseKeyword result = apiInstance.getKeywords(text, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AugmentedIntelligenceApi#getKeywords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Content whose keywords are to be found out |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseKeyword**](VerveResponseKeyword.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPopularTag"></a>
# **getPopularTag**
> VerveResponseTagList getPopularTag(startTime, endTime, start, end, requesterId, clientToken, interactionType, sentimentType, additionalInformation, association, categoryId, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionType = "interactionType_example"; // String |   /_*  Interaction Type      1) Question     2) Complaint    3) Idea     4) Blog     5) Discussion   *_/
String sentimentType = "sentimentType_example"; // String |   /_*  Sentiment Type      1)Positive     2)Negative      3)Neutral  *_/
String additionalInformation = "additionalInformation_example"; // String | additional information
String association = "association_example"; // String | association
Long categoryId = 789L; // Long | categoryId
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseTagList result = apiInstance.getPopularTag(startTime, endTime, start, end, requesterId, clientToken, interactionType, sentimentType, additionalInformation, association, categoryId, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **interactionType** | **String**|   /_*  Interaction Type      1) Question     2) Complaint    3) Idea     4) Blog     5) Discussion   *_/ | [optional]
 **sentimentType** | **String**|   /_*  Sentiment Type      1)Positive     2)Negative      3)Neutral  *_/ | [optional]
 **additionalInformation** | **String**| additional information | [optional]
 **association** | **String**| association | [optional]
 **categoryId** | **Long**| categoryId | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseTagList**](VerveResponseTagList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSentiment"></a>
# **getSentiment**
> VerveResponseSentimentAnalytics getSentiment(startTime, endTime, requesterId, clientToken, interactionType, additionalInformation, association, categoryId, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String interactionType = "interactionType_example"; // String |   /_*  Interaction Type      1) Question     2) Complaint     3) Idea     4) Blog     5) Discussion   *_/
String additionalInformation = "additionalInformation_example"; // String | additional information
String association = "association_example"; // String | association
Long categoryId = 789L; // Long | categoryId
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseSentimentAnalytics result = apiInstance.getSentiment(startTime, endTime, requesterId, clientToken, interactionType, additionalInformation, association, categoryId, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **interactionType** | **String**|   /_*  Interaction Type      1) Question     2) Complaint     3) Idea     4) Blog     5) Discussion   *_/ | [optional]
 **additionalInformation** | **String**| additional information | [optional]
 **association** | **String**| association | [optional]
 **categoryId** | **Long**| categoryId | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseSentimentAnalytics**](VerveResponseSentimentAnalytics.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTagEntitySentiments"></a>
# **getTagEntitySentiments**
> VerveResponseEntitySentimentList getTagEntitySentiments(tagName, startTime, endTime, start, end, requesterId, clientToken, sentimentType, additionalInformation, association, interactionType, categoryId, accessToken)

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
String requesterId = "requesterId_example"; // String | requesterId can be user id OR email address.
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
String sentimentType = "sentimentType_example"; // String |   /_*   Sentiment Type      1)Positive     2)Negative     3)Neutral   *_/
String additionalInformation = "additionalInformation_example"; // String | additional information
String association = "association_example"; // String | association
String interactionType = "interactionType_example"; // String |   /_*  Interaction Type      1)Question     2)Complaint     3)Idea     4)Blog     5)Discussion   *_/
Long categoryId = 789L; // Long | categoryId
String accessToken = "accessToken_example"; // String | Unique session token for user. To get access token user will have to authenticate
try {
    VerveResponseEntitySentimentList result = apiInstance.getTagEntitySentiments(tagName, startTime, endTime, start, end, requesterId, clientToken, sentimentType, additionalInformation, association, interactionType, categoryId, accessToken);
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
 **requesterId** | **String**| requesterId can be user id OR email address. |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |
 **sentimentType** | **String**|   /_*   Sentiment Type      1)Positive     2)Negative     3)Neutral   *_/ | [optional]
 **additionalInformation** | **String**| additional information | [optional]
 **association** | **String**| association | [optional]
 **interactionType** | **String**|   /_*  Interaction Type      1)Question     2)Complaint     3)Idea     4)Blog     5)Discussion   *_/ | [optional]
 **categoryId** | **Long**| categoryId | [optional]
 **accessToken** | **String**| Unique session token for user. To get access token user will have to authenticate | [optional]

### Return type

[**VerveResponseEntitySentimentList**](VerveResponseEntitySentimentList.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sentiment"></a>
# **sentiment**
> VerveResponseSentiment sentiment(text, clientToken)

Analyzes the sentiment of the content

The response will be a Sentiment Weightage. -1 is most negative and +1 is most positive. 0 will be neutral

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
String text = "text_example"; // String | Sentence whose sentiment is to be found out
String clientToken = "clientToken_example"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
try {
    VerveResponseSentiment result = apiInstance.sentiment(text, clientToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AugmentedIntelligenceApi#sentiment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Sentence whose sentiment is to be found out |
 **clientToken** | **String**| Use the Client Token. Please generate it from the Applications section under the Production &amp; Sandbox tabs |

### Return type

[**VerveResponseSentiment**](VerveResponseSentiment.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

