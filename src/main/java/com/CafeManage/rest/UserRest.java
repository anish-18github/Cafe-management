package com.CafeManage.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping(path = "/User")
public interface UserRest {

    @PostMapping(path = "/Signup")
    ResponseEntity<String> signUp(@RequestBody Map<String, String> requestMap);

}
