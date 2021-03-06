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
import com.iengage.client.model.Comment;
import com.iengage.client.model.VerveResponseBlog;
import com.iengage.client.model.VerveResponseDiscussion;
import com.iengage.client.model.VerveResponseCommentList;
import com.iengage.client.model.VerveResponseBlogList;
import com.iengage.client.model.VerveResponseDiscussionList;
import com.iengage.client.model.Blog;
import com.iengage.client.model.Discussion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CollaborationApi
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollaborationApiTest {

    private CollaborationApi api = null;
    private final ApiClient defaultClient = Configuration.getDefaultApiClient();

    
    /**
     * Post blog
     *
     * This service allows a user to post a blog. The following fields(key:value) are required to be present in the Blog JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API. **Required fields** 1. association      2. title      3. description
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void a_postBlogTest() throws ApiException {
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
        
        
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Post Blog Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseBlog response = api.postBlog(requesterId, clientToken, body, accessToken);
        	if(response!=null){
        		System.out.println(response);
        		bid = response.getData().getBlogId();
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
     * Start discussion
     *
     * This service allows a user to post a discussion. The following fields(key:value) are required to be present in the Discussion JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API. **Required fields**      1. association      2. subject      3. description
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void b_startDiscussionTest() throws ApiException {
        String requesterId = null;
        String clientToken = null;
        String accessToken = null;
       
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Start discussion Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseDiscussion response = api.startDiscussion(requesterId, clientToken, body, accessToken);
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
     * Comment on posted blog
     *
     * This service allows a user to comment on a blog. The following fields(key:value) are required to be present in the Comment JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API. **Required fields**      1. blogId (Path Parameter)     2. commentText
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void c_addCommentBlogTest() throws ApiException {
        Long blogId = null;
        String requesterId = null;
        String clientToken = null;
        String accessToken = null;

        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        
        System.out.println("\n\n\n >>>>>>>>>>>> Add Comment Blog Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseComment response = api.addCommentBlog(blogId, requesterId, clientToken, body, accessToken);
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
     * Comment on discussion
     *
     * This service allows a user to comment on a discussion. The following fields(key:value) are required to be present in the Comment JSON object. Refer to the Model &amp; Model Schema of the expected JSON Object for the body of this API. **Required fields**      1. discussionId (Path Parameter)     2. commentText
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void d_addCommentDiscussionTest() throws ApiException {
        Long discussionId = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
      
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
          
        
        System.out.println("\n\n\n >>>>>>>>>>>> Add Comment Discussion Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseComment response = api.addCommentDiscussion(discussionId, requesterId, clientToken, body, accessToken);
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
     * Get list of comments on blog
     *
     * Returns the list of comments on blog
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws InterruptedException 
     */
    @Test
    public void e_getBlogCommentsTest() throws ApiException, InterruptedException {
    	
        Long blogId = null;
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
      
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get Blog Comments Test >>>>>>>>>>>>>>>>>>>");
        System.out.println(bid);
        try{
        	VerveResponseCommentList response = api.getBlogComments(blogId, start, end, requesterId, clientToken, accessToken);
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
     * Get list of blogs
     *
     * Returns the list of blogs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void f_getBlogsTest() throws ApiException {
        Long association = null;
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
        
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get Blog Test >>>>>>>>>>>>>>>>>>>");
        
        try{
        	VerveResponseBlogList response = api.getBlogs(association, start, end, requesterId, clientToken, fields, accessToken);
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
     * Subscribe blog
     *
     * Allows the user to subscribe to blog. Returns the subscribed blog
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void g_subscribeBlogTest() throws ApiException {
        Long blogId = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
        // VerveResponseBlog response = api.subscribeBlog(blogId, requesterId, clientToken, accessToken);
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Subscribe Blog Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseBlog response = api.subscribeBlog(blogId, requesterId, clientToken, accessToken);
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
     * Subscribe discussion
     *
     * Allows the user to subscribe to a discussion. Returns the subscribed discussion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void h_subscribeDiscussionTest() throws ApiException {
        Long discussionId = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
        // VerveResponseDiscussion response = api.subscribeDiscussion(discussionId, requesterId, clientToken, accessToken);
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Subscribe Discussion Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseDiscussion response = api.subscribeDiscussion(discussionId, requesterId, clientToken, accessToken);
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
     * Get list of comments on discussion
     *
     * Returns the list of comments on discussion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void i_getDiscussionCommentsTest() throws ApiException {
        Long discussionId = null;
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
       
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get Discussion Comments Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseCommentList response = api.getDiscussionComments(discussionId, start, end, requesterId, clientToken, accessToken);
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
     * Get list of discussions
     *
     * Returns the list of discussions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void j_getDiscussionsTest() throws ApiException {
        Long association = null;
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
        
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get discussions Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseDiscussionList response = api.getDiscussions(association, start, end, requesterId, clientToken, fields, accessToken);
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
     * Get list of blogs subscribed by user
     *
     * Returns the list of blogs subscribed by user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void k_getUserSubscribedBlogsTest() throws ApiException {
        Long userId = null;
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
      
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get User Subscribed Blog Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseBlog response = api.getUserSubscribedBlogs(userId, start, end, requesterId, clientToken, fields, accessToken);
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
     * Get list of discussions subscribed by user
     *
     * Returns the list of discussions subscribed by user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void l_getUserSubscribedDiscussionsTest() throws ApiException {
        Long userId = null;
        Integer start = 0;
        Integer end = 10;
        String requesterId = null;
        String clientToken = null;;
        String fields = null;
        String accessToken = null;
      
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Get User subscribed Discussions Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseDiscussionList response = api.getUserSubscribedDiscussions(userId, start, end, requesterId, clientToken, fields, accessToken);
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
     * Update blog
     *
     * Allows the user to update blog. Returns the updated blog
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void m_updateBlogTest() throws ApiException {
        Long blogId = null;
        String blogTitle = null;
        String blogDescription = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
        
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Update Blog Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseBlog response = api.updateBlog(blogId, blogTitle, blogDescription, requesterId, clientToken, accessToken);
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
     * Update blog comment
     *
     * Allows the user to update blog comment. Returns the updated blog comment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void n_updateBlogCommentTest() throws ApiException {
        Long commentId = null;
        String commentText = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;

        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Update Blog comment Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseComment response = api.updateBlogComment(commentId, commentText, requesterId, clientToken, accessToken);
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
     * Update discussion
     *
     * Allows the user to update discussion. Returns the updated discussion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void o_updateDiscussionTest() throws ApiException {
        Long discussionId = null;
        String subject = null;
        String discussionDescription = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
        // VerveResponseDiscussion response = api.updateDiscussion(discussionId, subject, discussionDescription, requesterId, clientToken, accessToken);
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Update Discussion Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseDiscussion response = api.updateDiscussion(discussionId, subject, discussionDescription, requesterId, clientToken, accessToken);
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
     * Update discussion comment
     *
     * Allows the user to update discussion comment. Returns the updated discussion comment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void p_updateDiscussionCommentTest() throws ApiException {
        Long commentId = null;
        String commentText = "Updated Discussion Comment";
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
        
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Update Discussion Comment Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseDiscussion response = api.updateDiscussionComment(commentId, commentText, requesterId, clientToken, accessToken);
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
     * Unsubscribe blog
     *
     * Allows the user to unsubscribe blog. Returns the unsubscribed blog
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void q_unsubscribeBlogTest() throws ApiException {
        Long blogId = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
        
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Unsubscribe Blog Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseBlog response = api.unsubscribeBlog(blogId, requesterId, clientToken, accessToken);
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
     * Unsubscribe discussion
     *
     * Allows the user to unsubscribe to a discussion. Returns the unsubscribed discussion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void r_unsubscribeDiscussionTest() throws ApiException {
        Long discussionId = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
        
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>>Unsubscribe Discussion Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseDiscussion response = api.unsubscribeDiscussion(discussionId, requesterId, clientToken, accessToken);
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
     * Delete blog comment
     *
     * Allows the user to delete blog comment.  Returns the deleted blog comment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void s_deleteBlogCommentTest() throws ApiException {
        Long commentId = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
        
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Delete Blog Comment Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseComment response = api.deleteBlogComment(commentId, requesterId, clientToken, accessToken);
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
     * Delete blog
     *
     * Allows the user to delete blog. Returns the deleted blog
     *
     * @throws ApiException
     *          if the Api call fails
     */
    
    @Test
    public void t_deleteBlogTest() throws ApiException {
        Long blogId = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
        
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Delete Blog Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseBlog response = api.deleteBlog(blogId, requesterId, clientToken, accessToken);
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
     * Delete discussion comment
     *
     * Allows the user to delete discussion comment. Returns the deleted discussion comment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void u_deleteDiscussionCommentTest() throws ApiException {
        Long commentId = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
        
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Delete Discussion Commen Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseComment response = api.deleteDiscussionComment(commentId, requesterId, clientToken, accessToken);
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
     * Delete discussion
     *
     * Allows the user to delete discussion. Returns the deleted discussion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v_deleteDiscussionTest() throws ApiException {
        Long discussionId = null;
        String requesterId = null;
        String clientToken = null;;
        String accessToken = null;
        
        defaultClient.setAccessToken(null);
        api = new CollaborationApi(defaultClient);
        
        System.out.println("\n\n\n >>>>>>>>>>>> Delete Discussion Test >>>>>>>>>>>>>>>>>>>");
        try{
        	VerveResponseDiscussion response = api.deleteDiscussion(discussionId, requesterId, clientToken, accessToken);
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
