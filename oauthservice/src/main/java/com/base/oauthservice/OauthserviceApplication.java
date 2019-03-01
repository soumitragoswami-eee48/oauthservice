package com.base.oauthservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
public class OauthserviceApplication {
      private static final Logger LOGGER = LoggerFactory.getLogger(OauthserviceApplication.class);

	public static void main(String[] args) {
                LOGGER.info("firing up application");
		SpringApplication.run(OauthserviceApplication.class, args);
	}

}
