package com.example.application.controller;

//import com.example.application.model.User;
//import com.example.application.response.ErrorResponse;
//import com.example.application.response.LoginReq;
//import com.example.application.response.LoginResponse;
//import com.example.application.security.JwtUtil;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class AuthController {
//
//    private final AuthenticationManager authenticationManager;
//
//
//    private JwtUtil jwtUtil;
//    public AuthController(AuthenticationManager authenticationManager, JwtUtil jwtUtil) {
//        this.authenticationManager = authenticationManager;
//        this.jwtUtil = jwtUtil;
//
//    }
//
//
//    @PostMapping("/auth/login")
//    public ResponseEntity login(@RequestBody LoginReq loginReq)  {
//
//        try {
//            Authentication authentication =
//                    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginReq.getEmail(), loginReq.getPassword()));
//            String email = authentication.getName();
//            User user = new User(email,"123456");
//            String token = jwtUtil.createToken(user);
//            LoginResponse loginRes = new LoginResponse(email,token);
//
//            return ResponseEntity.ok(loginRes);
//
//        }catch (BadCredentialsException e){
//            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST,"Invalid username or password");
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
//        }catch (Exception e){
//            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage());
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
//        }
//    }
//}
