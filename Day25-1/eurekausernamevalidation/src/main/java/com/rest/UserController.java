package com.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validate-username")
public class UserController {

    @GetMapping
    public ResponseEntity<String> validateUsername(@RequestParam String username) {
        if (username.length() > 10) {
            return ResponseEntity.ok("valid sername");
        } else {
            return ResponseEntity.ok("invalid username");
        }
    }
}
