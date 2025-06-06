package com.login.service.app.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.service.app.service.authService;
import com.login.service.app.view.Credentials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class authController {

@Autowired
private authService aService;

@PostMapping("/login")
    public ResponseEntity<HttpStatus>login(@RequestBody Credentials credentials) throws Exception {
        if(!aService.authenticate(credentials))
        {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
