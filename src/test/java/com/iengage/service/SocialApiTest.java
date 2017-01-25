/*
 * Stakeholder engagement API
 * This API enables Intelligent Engagement for your Business. iEngage is a platform that combines process, augmented intelligence and rewards to help you intelligently engage customers.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.iengage.service;

import com.iengage.ApiException;
import com.iengage.client.model.VerveResponseRequestForMeList;
import com.iengage.client.model.VerveResponseUser;
import com.iengage.client.model.VerveResponseUserDetail;
import com.iengage.client.model.VerveResponseUserList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SocialApi
 */
@Ignore
public class SocialApiTest {

    private final SocialApi api = new SocialApi();

    
    /**
     * Add Friend
     *
     * Allows the user to add friend. Returns true if successful
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFriendTest() throws ApiException {
        String id1 = null;
        String id2 = null;
        String loggedInUserId = null;
        String accessToken = null;
        String clientToken = null;
        Boolean response = api.addFriend(id1, id2, loggedInUserId, accessToken, clientToken);

        // TODO: test validations
    }
    
    /**
     * confirm/ignore friend request
     *
     * Allows the user to confirm/ignore friend request. Returns true if successful
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmFriendRequestTest() throws ApiException {
        Long userId = null;
        Integer status = null;
        String loggedInUserId = null;
        String accessToken = null;
        String clientToken = null;
        Boolean response = api.confirmFriendRequest(userId, status, loggedInUserId, accessToken, clientToken);

        // TODO: test validations
    }
    
    /**
     * Follow user
     *
     * Allows to follow a user. Returns true if successful
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void followTest() throws ApiException {
        String follower = null;
        String followee = null;
        String loggedInUserId = null;
        String accessToken = null;
        String clientToken = null;
        Boolean response = api.follow(follower, followee, loggedInUserId, accessToken, clientToken);

        // TODO: test validations
    }
    
    /**
     * Get user by id 
     *
     * Returns the user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        Long userId = null;
        String loggedInUserId = null;
        String accessToken = null;
        String clientToken = null;
        String fields = null;
        VerveResponseUser response = api.getUser(userId, loggedInUserId, accessToken, clientToken, fields);

        // TODO: test validations
    }
    
    /**
     * Get user details 
     *
     * Returns the user details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserDetailTest() throws ApiException {
        Long userId = null;
        String loggedInUserId = null;
        String accessToken = null;
        String clientToken = null;
        VerveResponseUserDetail response = api.getUserDetail(userId, loggedInUserId, accessToken, clientToken);

        // TODO: test validations
    }
    
    /**
     * Get list of followers
     *
     * Returns the list of followers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserFollowersTest() throws ApiException {
        Long userId = null;
        String loggedInUserId = null;
        String accessToken = null;
        String clientToken = null;
        String fields = null;
        VerveResponseUserList response = api.getUserFollowers(userId, loggedInUserId, accessToken, clientToken, fields);

        // TODO: test validations
    }
    
    /**
     * Get list of users that are being followed
     *
     * Returns the list of users that are being followed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserFollowingTest() throws ApiException {
        Long userId = null;
        String loggedInUserId = null;
        String accessToken = null;
        String clientToken = null;
        String fields = null;
        VerveResponseUserList response = api.getUserFollowing(userId, loggedInUserId, accessToken, clientToken, fields);

        // TODO: test validations
    }
    
    /**
     * Get list of friends
     *
     * Returns the list of friends
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserFriendsTest() throws ApiException {
        Long userId = null;
        String loggedInUserId = null;
        String accessToken = null;
        String clientToken = null;
        String fields = null;
        VerveResponseUserList response = api.getUserFriends(userId, loggedInUserId, accessToken, clientToken, fields);

        // TODO: test validations
    }
    
    /**
     * Remove friend 
     *
     * Allows the user to remove friend. Returns true if successful
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeFriendTest() throws ApiException {
        String id1 = null;
        String id2 = null;
        String loggedInUserId = null;
        String accessToken = null;
        String clientToken = null;
        Boolean response = api.removeFriend(id1, id2, loggedInUserId, accessToken, clientToken);

        // TODO: test validations
    }
    
    /**
     * Send friend request
     *
     * Allows user to send a friend request. Returns true if successful
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestFriendTest() throws ApiException {
        Long userId = null;
        String loggedInUserId = null;
        String accessToken = null;
        String clientToken = null;
        Boolean response = api.requestFriend(userId, loggedInUserId, accessToken, clientToken);

        // TODO: test validations
    }
    
    /**
     * Get list of friend requests
     *
     * Returns the list of friend requests
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestsForMeTest() throws ApiException {
        String loggedInUserId = null;
        String accessToken = null;
        String clientToken = null;
        VerveResponseRequestForMeList response = api.requestsForMe(loggedInUserId, accessToken, clientToken);

        // TODO: test validations
    }
    
    /**
     * Unfollow user
     *
     * Allows to unfollow user. Returns true if successful
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unfollowTest() throws ApiException {
        String unfollower = null;
        String unfollowee = null;
        String loggedInUserId = null;
        String accessToken = null;
        String clientToken = null;
        Boolean response = api.unfollow(unfollower, unfollowee, loggedInUserId, accessToken, clientToken);

        // TODO: test validations
    }
    
}
