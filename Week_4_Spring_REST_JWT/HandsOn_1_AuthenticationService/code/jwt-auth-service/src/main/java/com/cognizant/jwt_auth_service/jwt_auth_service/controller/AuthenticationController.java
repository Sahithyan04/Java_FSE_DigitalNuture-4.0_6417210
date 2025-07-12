package com.cognizant.jwt_auth_service.jwt_auth_service.controller;

import com.cognizant.jwt_auth_service.jwt_auth_service.util.JwtUtil;
import com.cognizant.jwt_auth_service.jwt_auth_service.model.TokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestHeader("Authorization") String authHeader) {
        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] decoded = Base64.getDecoder().decode(base64Credentials);
            String[] credentials = new String(decoded).split(":", 2);
            String username = credentials[0];
            String password = credentials[1];

            // You can validate user here
            String token = jwtUtil.generateToken(username);
            return ResponseEntity.ok(new TokenResponse(token));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Missing or invalid Authorization header");
        }
    }
}
