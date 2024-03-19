package com.scaler.showbooker.controllers;

import com.scaler.showbooker.dtos.SignUpUserRequestDto;
import com.scaler.showbooker.dtos.SignUpUserResponseDto;
import com.scaler.showbooker.models.User;
import com.scaler.showbooker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpUserResponseDto signUpUser(SignUpUserRequestDto request) {
        User user = userService.signUpUser(
                request.getEmail(), request.getPassword()
        );

        SignUpUserResponseDto response = new SignUpUserResponseDto();
        response.setUserId(user.getId());

        return response;
    }
}
