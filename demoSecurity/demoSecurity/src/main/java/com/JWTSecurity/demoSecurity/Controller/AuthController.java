
// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.JWTSecurity.demoSecurity.Controller;

import com.JWTSecurity.demoSecurity.Dto.LoginRequest;
import com.JWTSecurity.demoSecurity.Utility.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@org.springframework.web.bind.annotation.RestController
public class AuthController {
    @PostMapping({"/login"})
    public String login(@RequestBody LoginRequest request) {
        return "ranjith".equals(request.getUsername()) && "1234".equals(request.getPassword()) ? JwtUtil.generateToken(request.getUsername()) : "invalid credentials";
    }

    @GetMapping({"/hello"})
    public String hello(@RequestHeader("Authorization") String token) {
        String username = JwtUtil.validateToken(token.replace("Bearer", ""));
        return "hello" + username;
    }
}