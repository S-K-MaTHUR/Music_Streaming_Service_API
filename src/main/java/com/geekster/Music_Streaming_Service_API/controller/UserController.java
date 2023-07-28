package com.geekster.Music_Streaming_Service_API.controller;

import com.geekster.Music_Streaming_Service_API.dto.SignInInput;
import com.geekster.Music_Streaming_Service_API.dto.SignInOutput;
import com.geekster.Music_Streaming_Service_API.dto.SignUpInput;
import com.geekster.Music_Streaming_Service_API.dto.SignUpOutput;
import com.geekster.Music_Streaming_Service_API.models.User;
import com.geekster.Music_Streaming_Service_API.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String signUp(@RequestBody @Valid User user){
        return userService.signUp(user);
    }
    @PostMapping("/signIn")
    public String signIn(@RequestBody @Valid SignInInput signInInput){
        return userService.signIn(signInInput);
    }
}
