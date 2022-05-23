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
public class Admins extends Person{

    public Admins(String email, String password, String fullname, String role, int status, int id) {
        super( email,  password,  fullname,  role,  status,  id);
    }
    
}
