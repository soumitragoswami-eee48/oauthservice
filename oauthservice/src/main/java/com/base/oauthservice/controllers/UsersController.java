/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.oauthservice.controllers;

import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sougoswa
 */
@RestController
public class UsersController {
    
     private static final Logger LOGGER = LoggerFactory.getLogger(UsersController.class);
//    @Autowired
//    UserService usrService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<Object> getById() {
//        try {
//            LOGGER.info("getById() called");
//            Users usr = usrService.getUserById(id);
//            return new ResponseEntity<>(usr, HttpStatus.OK);
//
//        } catch (SQLException e) {
//            LOGGER.info("SQL EXCEPTION occured" + e.getMessage());
//            return new ResponseEntity<>("INTERNAL_SERVER_ERROR", HttpStatus.INTERNAL_SERVER_ERROR);
// 
//        }
            LOGGER.info("api is hit");
            return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }
    
}
