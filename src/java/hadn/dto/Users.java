/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadn.dto;

/**
 *
 * @author Admin
 */
public class Users extends Person{
    private int postcount;
    private int followercount;
    private int followingcount;

    public Users(String email, String password, String fullname, String role, int status, int id, int postcount, int followercount, int followingcount) {
        super( email,  password,  fullname,  role,  status,  id);
        this.postcount = postcount;
        this.followercount = followercount;
        this.followingcount = followingcount;
    }

    public Users() {
    }

    /**
     * @return the postcount
     */
    public int getPostcount() {
        return postcount;
    }

    /**
     * @param postcount the postcount to set
     */
    public void setPostcount(int postcount) {
        this.postcount = postcount;
    }

    /**
     * @return the followercount
     */
    public int getFollowercount() {
        return followercount;
    }

    /**
     * @param followercount the followercount to set
     */
    public void setFollowercount(int followercount) {
        this.followercount = followercount;
    }

    /**
     * @return the followingcount
     */
    public int getFollowingcount() {
        return followingcount;
    }

    /**
     * @param followingcount the followingcount to set
     */
    public void setFollowingcount(int followingcount) {
        this.followingcount = followingcount;
    }
    
    
}
