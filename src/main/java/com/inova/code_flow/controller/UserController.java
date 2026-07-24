package com.inova.code_flow.controller;


import com.inova.code_flow.dto.request.UserRequest;
import com.inova.code_flow.dto.response.CourseResponse;
import com.inova.code_flow.dto.response.UserResponse;
import com.inova.code_flow.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<UserResponse> createUser( @RequestBody @Valid UserRequest user) {
        return ResponseEntity.ok(userService.createUser(user));

    }

}
