/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadn.dao;

import hadn.dto.Posts;
import hadn.lib.Utils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PostsDao {
    private List<Posts> listPosts;

    public List<Posts> getListPosts() {
        return listPosts;
    }
    public void getPosts(){
        Connection cn = null;
        try {
            cn = Utils.makeConnection();
            if (cn != null){
                String sql = "select postid, content, userid, reported, votecount, commentcount, timecreated, tagname, status from posts";
                Statement stm = cn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                while (rs.next()){
                    int postid = rs.getInt("postid");
                    String content = rs.getString("content");
                    int userid = rs.getInt("userid");
                    int reported = rs.getInt("reported");
                    int votecount = rs.getInt("votecount");
                    int commentcount = rs.getInt("commentcount");
                    String timecreated = rs.getString("timecreated");
                    String tagname = rs.getString("tagname");
                    int status = rs.getInt("status");
                    Posts p = new Posts(votecount, commentcount, tagname, postid, content, userid, reported, timecreated, status);
                    if (this.listPosts == null){
                        this.listPosts = new ArrayList<>();
                    }
                    this.listPosts.add(p);
                }
                cn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
