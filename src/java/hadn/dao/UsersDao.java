/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadn.dao;

import hadn.dto.Posts;
import hadn.dto.Users;
import hadn.lib.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class UsersDao {
    private List<Users> listUsers;

    public List<Users> getListUsers() {
        return listUsers;
    }
    public void checkLogin(String email, String password){
        Connection cn = null;
        try {
            cn = Utils.makeConnection();
            if (cn != null){
                String sql = "select [fullname],[role],[status],[postcount],[followercount],[followingcount],[id]\n"
                        + "from users\n"
                        + "where [email] = ? and [password] = ?";
                PreparedStatement stm = cn.prepareStatement(sql);
                stm.setString(1, email);
                stm.setString(2, password);
                ResultSet rs = stm.executeQuery();
                if (this.listUsers == null){
                        this.listUsers = new ArrayList<>();
                    }
                if (rs.next()){
                    String fullname = rs.getString("fullname");
                    String role = rs.getString("role");
                    int status = rs.getInt("status");
                    int postcount = rs.getInt("postcount");
                    int followercount = rs.getInt("followercount");
                    int followingcount = rs.getInt("followingcount");
                    int id = rs.getInt("id");
                    
                    
                    Users u = new Users(email, password, fullname, role, status, id, postcount, followercount, followingcount);
                    
                    this.listUsers.add(u);
                }
                cn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
