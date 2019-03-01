/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.oauthservice.dao;

import com.base.oauthservice.model.UserModel;
import java.sql.SQLException;
//import org.springframework.security.core.userdetails.User;

/**
 *
 * @author sougoswa
 */

public interface UserDao {
    
    public abstract UserModel getUserByName(String id) throws SQLException; 
    
}
