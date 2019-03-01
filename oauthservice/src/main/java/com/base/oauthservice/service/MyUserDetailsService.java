/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.oauthservice.service;

import com.base.oauthservice.dao.UserDao;
import com.base.oauthservice.model.UserModel;
import com.base.oauthservice.model.UserPrincipal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author sougoswa
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserDao usrdao;

    @Override
    public UserPrincipal loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userEntity = null;
        try {
            userEntity = usrdao.getUserByName(username);
            UserPrincipal customUser = new UserPrincipal(userEntity);
            return customUser;
        } catch (Exception e) {
            e.printStackTrace();
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }

    }

}
