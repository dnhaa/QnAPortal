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
public class Posts extends Interactions{
    private int votecount;
    private int commentcount;
    private String tagname;

    public Posts() {
    }

    public Posts(int votecount, int commentcount, String tagname, int postid, String content, int userid, int reported, String timecreated, int status) {
        super(postid, content, userid, reported, timecreated, status);
        this.votecount = votecount;
        this.commentcount = commentcount;
        this.tagname = tagname;
    }

    

    /**
     * @return the votecount
     */
    public int getVotecount() {
        return votecount;
    }

    /**
     * @param votecount the votecount to set
     */
    public void setVotecount(int votecount) {
        this.votecount = votecount;
    }

    /**
     * @return the commentcount
     */
    public int getCommentcount() {
        return commentcount;
    }

    /**
     * @param commentcount the commentcount to set
     */
    public void setCommentcount(int commentcount) {
        this.commentcount = commentcount;
    }

    /**
     * @return the tagname
     */
    public String getTagname() {
        return tagname;
    }

    /**
     * @param tagname the tagname to set
     */
    public void setTagname(String tagname) {
        this.tagname = tagname;
    }
    
}
