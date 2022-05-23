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
public class Interactions {
    private int postid;
    private String content;
    private int userid;
    private int reported;
    private String timecreated;
    private int status;

    public Interactions() {
    }

    public Interactions(int postid, String content, int userid, int reported, String timecreated, int status) {
        this.postid = postid;
        this.content = content;
        this.userid = userid;
        this.reported = reported;
        this.timecreated = timecreated;
        this.status = status;
    }

    /**
     * @return the postid
     */
    public int getPostid() {
        return postid;
    }

    /**
     * @param postid the postid to set
     */
    public void setPostid(int postid) {
        this.postid = postid;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the userid
     */
    public int getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }

    /**
     * @return the reported
     */
    public int getReported() {
        return reported;
    }

    /**
     * @param reported the reported to set
     */
    public void setReported(int reported) {
        this.reported = reported;
    }

    /**
     * @return the timecreated
     */
    public String getTimecreated() {
        return timecreated;
    }

    /**
     * @param timecreated the timecreated to set
     */
    public void setTimecreated(String timecreated) {
        this.timecreated = timecreated;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    
    
    
}
