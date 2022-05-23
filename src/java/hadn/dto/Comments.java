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
public class Comments extends Interactions{
    private int commentid;

    public Comments() {
    }

    public Comments(int commentid, int postid, String content, int userid, int reported, String timecreated, int status) {
        super(postid, content, userid, reported, timecreated, status);
        this.commentid = commentid;
    }

    

    /**
     * @return the commentid
     */
    public int getCommentid() {
        return commentid;
    }

    /**
     * @param commentid the commentid to set
     */
    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }
    
    
}
