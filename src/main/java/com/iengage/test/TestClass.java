package com.iengage.test;

import com.iengage.ApiClient;
import com.iengage.ApiException;
import com.iengage.ApiResponse;
import com.iengage.Configuration;
import com.iengage.Pair;
import com.iengage.auth.Authentication;
import com.iengage.auth.OAuth;
import com.iengage.client.model.InteractionInputModel;
import com.iengage.client.model.User;
import com.iengage.client.model.VerveResponseTextClassificationList;
import com.iengage.service.AugmentedIntelligenceApi;
import com.iengage.service.InteractionApi;
import com.iengage.service.UserAuthenticationApi;

public class TestClass {
	
	public static void main(String[] args) throws ApiException {
       // ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: default
//        OAuth def = (OAuth) defaultClient.getAuthentication("defay");
//        def.setAccessToken("Bearer ddfbdfbd-9ff2-3a9e-9b14-7311102abfa3");
//
//        AugmentedIntelligenceApi apiInstance = new AugmentedIntelligenceApi();
//        String text = "text_example"; // String | Text you want classified
//        Long id = 789L; // Long | Classifier ID from the Admin Panel
//        String clientToken = "OXfWfm1FsgM0bacD65sYrw14sh8a"; // String | Use the Client Token. Please generate it from the Applications section under the Production & Sandbox tabs
//        try {
//            VerveResponseTextClassificationList result = apiInstance.classify(text, id, clientToken);
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling AugmentedIntelligenceApi#classify");
//            e.printStackTrace();
//        }
		
		ApiClient client = Configuration.getDefaultApiClient();
		System.out.println(client.getBasePath()); //https://api.iengage.io:8243/api/2.0
		client.setAccessToken("b3e81a61-ef85-30b4-ad9f-a31a6411b29a");
		//client.addDefaultHeader("Accept", "application/json");
		
//		UserAuthenticationApi api = new UserAuthenticationApi(client);
//		User user = api.authenticate("satyaranjannaik2142@gmail.com", "Tendulkar@2142#", "OXfWfm1FsgM0bacD65sYrw14sh8a");
//		System.out.println(user.toString());
//		System.out.println(user.getBirthDate().getYear());
		
		// Add Interaction WOrking fine //
		InteractionApi interactionApi = new InteractionApi(client);
		//String body = "{\"interactionTitle\":\"Satya Interaction\"}";
		
		// Post interactions
		InteractionInputModel body = new InteractionInputModel();
		body.setInteractionTitle("India is a great country");
		body.setCategoryId(0L);
		body.setInteractionType("zzzzz");
		interactionApi.addInteraction("satyaranjannaik2142@gmail.com", "OXfWfm1FsgM0bacD65sYrw14sh8a", body, "b3e81a61-ef85-30b4-ad9f-a31a6411b29a");
		// interaction ids : 638706,638726
		//Get interactions
		
		//interactionApi.getInteraction(interactionId, requesterId, clientToken, fields, accessToken)
		
		
    }
}
