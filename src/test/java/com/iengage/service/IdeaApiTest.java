/**
 * iEngage 2.0 API
 * This API enables Intelligent Engagement for your Business. iEngage is a platform that combines process, augmented intelligence and rewards to help you intelligently engage customers.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.iengage.service;

import com.iengage.ApiClient;
import com.iengage.ApiException;
import com.iengage.Configuration;
import com.iengage.client.model.VerveResponseComment;
import com.iengage.client.model.VerveResponseIdea;
import java.io.File;
import com.iengage.client.model.VerveResponseIdeaList;
import com.iengage.client.model.VerveResponseCommentList;
import com.iengage.client.model.VerveResponseUserList;
import com.iengage.client.model.VerveResponseString;
import com.iengage.client.model.VerveResponseIdeaUserRatingList;
import com.iengage.client.model.Idea;
import com.iengage.client.model.Comment;
import com.iengage.client.model.Group;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IdeaApi
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IdeaApiTest {

    private  IdeaApi api = null;
    private final ApiClient defaultClient = Configuration.getDefaultApiClient();

    
    
    /**
     * Share idea  
     *
     * This service allows a user to share a idea. The following fields(key:value) are required to be present in the Idea JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API.  /_*  **Required fields**      1. ideaTitle      2. ideaDescription      3. group: { groupId }  *_/
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void a_shareIdeaTest() throws ApiException {
        String requesterId = null;
        String clientToken = null;;
        Idea body = null;
        String accessToken = null;

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Share Idea test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdea response = api.shareIdea(requesterId, clientToken, body, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		null = response.getData().getIdeaId();
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }

        // TODO: test validations
    }

    /**
     * Share Idea with attachments
     *
     * Allows the user to share idea with attachments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void b_shareFormIdeaTest() throws ApiException {
        String title = null;
        String description = null;
        String groupId = null;
        File file = null;
        String loggedInUserId = null;
        String accessToken = null;
        String clientToken = null;;
        // VerveResponseIdea response = api.shareFormIdea(title, description, groupId, file, loggedInUserId, accessToken, clientToken);

        // TODO: test validations
    }
    
    
    /**
     * Comment on shared idea
     *
     * This service allows a user to comment on a idea. The following fields(key:value) are required to be present in the Comment JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API. /_* **Required fields**     1. ideaId (Path Parameter)     2. commentText  *_/
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void c_shareIdeaCommentTest() throws ApiException {
        Long ideaId = null;
        String requesterId = null;
        String clientToken = null;;
        Comment body = null;
        String accessToken = null;
        
		defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Share Idea Comment test >>>>>>>>>>>>>>");
        try{
        	VerveResponseComment response = api.shareIdeaComment(ideaId, requesterId, clientToken, body, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		null = response.getData().getCommentId();
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    
    /**
     * Update idea
     *
     * Allows the user to update idea. Returns the updated idea
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void d_updateIdeaTest() throws ApiException {
        Long ideaId = null;
        String ideaTitle = null;
        String ideaDescription = null;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Update Idea test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdea response = api.updateIdea(ideaId, ideaTitle, ideaDescription, requesterId, clientToken, fields, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    /**
     * Update comment
     *
     * Allows the user to update comment. Returns the updated comment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void e_updateCommetTest() throws ApiException {
        Long commentId = null;
        String commentText = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Share Idea Comment test >>>>>>>>>>>>>>");
        try{
        	VerveResponseComment response = api.updateCommet(commentId, commentText, requesterId, clientToken, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    /**
     * Follow idea
     *
     * Allows the user to follow idea. Returns the followed idea
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void f_followIdeaTest() throws ApiException {
        Long ideaId = null;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
        

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Follow Idea test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdea response = api.followIdea(ideaId, requesterId, clientToken, fields, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    
    /**
     * Get list of Ideas
     *
     * Returns the list of ideas
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void g_getAllIdeasTest() throws ApiException {
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
        

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get All Ideas test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdeaList response = api.getAllIdeas(start, end, requesterId, clientToken, fields, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    
    /**
     * Get list of ideas that users are following
     *
     * Returns the list of ideas being followed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void h_getFollowingIdeasTest() throws ApiException {
        Long userId = null;
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
        

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get Following Ideas test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdeaList response = api.getFollowingIdeas(userId, start, end, requesterId, clientToken, fields, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }

    /**
     * Get list of ideas in group
     *
     * Return the ideas list on group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void i_getGroupIdeasTest() throws ApiException {
        Long userId = null;
        Long groupId = null;
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
        

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get Group Ideas test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdeaList response = api.getGroupIdeas(userId, groupId, start, end, requesterId, clientToken, fields, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    /**
     * Get idea by id
     *
     * Returns the idea by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void j_getIdeaTest() throws ApiException {
        Long ideaId = null;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
        

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get Idea test >>>>>>>>>>>>>>");
        try{
        	 VerveResponseIdea response = api.getIdea(ideaId, requesterId, clientToken, fields, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    /**
     * Get list of comments on idea
     *
     * Returns the list of comments on idea
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k_getIdeaCommentTest() throws ApiException {
        Long ideaId = null;
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get Idea Comment test >>>>>>>>>>>>>>");
        try{
        	VerveResponseCommentList response = api.getIdeaComment(ideaId, start, end, requesterId, clientToken, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    /**
     * Rate an idea
     *
     * Allows the user to rate an idea. Returns the rated idea
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void l_rateIdeaTest() throws ApiException {
        Long userId = null;
        Long ideaId = null;
        String ideaStage = null;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Rate Idea test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdea response = api.rateIdea(userId, ideaId, ideaStage, requesterId, clientToken, fields, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    /**
     * Get list of followers for this idea
     *
     * Returns the list of followers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void m_getIdeaFollowersTest() throws ApiException {
        Long ideaId = null;
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get Idea Followers test >>>>>>>>>>>>>>");
        try{
        	VerveResponseUserList response = api.getIdeaFollowers(ideaId, start, end, requesterId, clientToken, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    
    /**
     * Get rating parameters of idea by user
     *
     * Return the rating parameters of idea by user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void n_getIdeaRatingParametersTest() throws ApiException {
        Long userId = null;
        String ideaStage = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
        

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get Idea Rating Parameters test >>>>>>>>>>>>>>");
        try{
        	VerveResponseString response = api.getIdeaRatingParameters(userId, ideaStage, requesterId, clientToken, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    /**
     * Get list of ideas that are rated by user 
     *
     * Return the rated ideas list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void o_getIdeaRatingsTest() throws ApiException {
        Long userId = null;
        Long ideaId = null;
        String ideaStage = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get Idea Ratings test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdeaUserRatingList response = api.getIdeaRatings(userId, ideaId, ideaStage, requesterId, clientToken, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    /**
     * Get the list of recommended ideas
     *
     * Returns the list of recommended ideas 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void p_getRecommendIdeasTest() throws ApiException {
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
        

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get Recommend Ideas test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdeaList response = api.getRecommendIdeas(start, end, requesterId, clientToken, fields, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    /**
     * Get the list of top ideas
     *
     * Return the list of top ideas
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void q_getTopIdeasTest() throws ApiException {
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get Top Ideas test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdeaList response = api.getTopIdeas(start, end, requesterId, clientToken, fields, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    /**
     * Get list of ideas shared by user
     *
     * Returns the list of ideas shared by user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void r_getUserIdeasTest() throws ApiException {
        Long userId = null;
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
        

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get User Ideas test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdeaList response = api.getUserIdeas(userId, start, end, requesterId, clientToken, fields, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    /**
     * Get list of ideas rated by user
     *
     * Return the list of ideas rated by user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void s_getUserRateIdeasTest() throws ApiException {
        Long userId = null;
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
        

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get user rate ideas test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdeaList response = api.getUserRateIdeas(userId, start, end, requesterId, clientToken, fields, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    
    
    /**
     * Give rating on idea
     *
     * Allows the user to give a rating on idea. Returns the rated idea
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rateIdea_0Test() throws ApiException {
        Long userId = null;
        Long ideaId = null;
        String ideaStage = "";
        String parameter = null;
        Double rating = null;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
        

        
        // TODO: test validations
    }
    
    /**
     * Get list of matching ideas
     *
     * Returns the list of matching ideas
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void t_searchIdeasTest() throws ApiException {
        String searchText = "good";
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
        

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Search Ideas test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdeaList response = api.searchIdeas(searchText, start, end, requesterId, clientToken, fields, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
        
    
    
    /**
     * Unfollow idea
     *
     * Allows the user to unfollow idea. Returns the unfollowed idea
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void u_unfollowIdeaTest() throws ApiException {
        Long ideaId = null;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
        

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Unfollow Idea test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdea response = api.unfollowIdea(ideaId, requesterId, clientToken, fields, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }

    
    /**
     * Delete comment
     *
     * Allows the user to delete comment. Returns the deleted comment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v_deleteCommentTest() throws ApiException {
        Long commentId = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
        

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Api Delete Comment test >>>>>>>>>>>>>>");
        try{
        	VerveResponseComment response = api.deleteComment(commentId, requesterId, clientToken, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }
    
    /**
     * Delete idea
     *
     * Allows the user to delete idea. Returns the deleted idea
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void w_deleteIdeaTest() throws ApiException {
        Long ideaId = null;
        String requesterId = null;
        String clientToken = null;;
        File file = null;
        String fields = null;
        String accessToken = null;
        

        defaultClient.setAccessToken(null);
        api = new IdeaApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Api Delete Idea test >>>>>>>>>>>>>>");
        try{
        	VerveResponseIdea response = api.deleteIdea(ideaId, requesterId, clientToken, file, fields, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		assert true;
        	}
        	else{
        		assert false;
        	}
        }catch(ApiException e){
        	System.out.println(e.getResponseBody());
        	assert false;
        }catch(Exception e){
        	e.printStackTrace();
        	assert false;
        }
        // TODO: test validations
    }  
}
