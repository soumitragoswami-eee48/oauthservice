/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.oauthservice.dao;

import com.base.oauthservice.model.UserModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 *
 * @author sougoswa
 */
@Repository
public class UserDaoImpl implements UserDao{

   @Autowired
	private JdbcTemplate jdbcTemplate;
    @Override
    public UserModel getUserByName(String name) throws SQLException{
        UserModel usr=new UserModel();
        String sql="SELECT * FROM USERS WHERE NAME = ? ";
         jdbcTemplate.queryForObject(sql, new Object[]{name}, (ResultSet rs, int rowNum) -> {
                usr.setId(String.valueOf(rs.getInt("ID")));
                usr.setUsername(String.valueOf(rs.getString("NAME")));
                usr.setPassword(String.valueOf(rs.getString("PASSWORD")));
//                usr.setPhonenumber(String.valueOf(rs.getString("PHONENUMBER")));
//                usr.setUsertype(String.valueOf(rs.getString("USERTYPE")));
                
                return usr;
            });
        
        return usr;
    }
    
}
