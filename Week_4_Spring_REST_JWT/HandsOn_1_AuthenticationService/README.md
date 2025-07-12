# REST - JWT Authentication Service

In this project, I created a RESTful Authentication Service using Spring Boot 3 and Spring Security 6. The service exposes an `/authenticate` endpoint that accepts Basic Auth credentials via the `Authorization` header, decodes them, and returns a JWT token if valid. The JWT is generated using the `jjwt` API.

---


## TokenResponse.java

```java
package com.cognizant.jwt_auth_service.jwt_auth_service.model;

public class TokenResponse {
    private String token;

    public TokenResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
```

---

## AuthenticationController.java

```java
package com.cognizant.jwt_auth_service.jwt_auth_service.controller;

import com.cognizant.jwt_auth_service.jwt_auth_service.model.TokenResponse;
import com.cognizant.jwt_auth_service.jwt_auth_service.util.JwtUtil;
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

            // You can validate username/password here

            String token = jwtUtil.generateToken(username);
            return ResponseEntity.ok(new TokenResponse(token));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Missing or invalid Authorization header");
        }
    }
}
```

---

## SecurityConfig.java

```java
package com.cognizant.jwt_auth_service.jwt_auth_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/authenticate").permitAll()
                .anyRequest().authenticated()
            )
            .httpBasic(withDefaults());

        return http.build();
    }
}
```

---

## JwtAuthServiceApplication.java

```java
package com.cognizant.jwt_auth_service.jwt_auth_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtAuthServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(JwtAuthServiceApplication.class, args);
    }
}
```

---

## Testing

To authenticate and get a token, use:

```bash
curl -s -u user:pwd http://localhost:8080/authenticate
```

Sample Response:

```json
{"token":"eyJhbGciOiJIUzI1NiJ9..."}
```