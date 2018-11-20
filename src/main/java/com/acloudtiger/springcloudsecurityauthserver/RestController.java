package com.acloudtiger.springcloudsecurityauthserver;

import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/user")
    Principal getUser(Principal user){
        return user;
    }

}
