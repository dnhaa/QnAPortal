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
public class Followers {
    private int followeruserid;
    private int userid1;
    private int userid2;

    public Followers() {
    }

    public Followers(int followeruserid, int userid1, int userid2) {
        this.followeruserid = followeruserid;
        this.userid1 = userid1;
        this.userid2 = userid2;
    }

    /**
     * @return the followeruserid
     */
    public int getFolloweruserid() {
        return followeruserid;
    }

    /**
     * @param followeruserid the followeruserid to set
     */
    public void setFolloweruserid(int followeruserid) {
        this.followeruserid = followeruserid;
    }

    /**
     * @return the userid1
     */
    public int getUserid1() {
        return userid1;
    }

    /**
     * @param userid1 the userid1 to set
     */
    public void setUserid1(int userid1) {
        this.userid1 = userid1;
    }

    /**
     * @return the userid2
     */
    public int getUserid2() {
        return userid2;
    }

    /**
     * @param userid2 the userid2 to set
     */
    public void setUserid2(int userid2) {
        this.userid2 = userid2;
    }
    
}
