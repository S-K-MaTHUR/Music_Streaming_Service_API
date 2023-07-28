package com.geekster.Music_Streaming_Service_API.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignInInput {

    @Email
    String email;

    @Size(min = 6,max = 18,message ="length of the password lying between 6 to 18 characters")
    String password;
}
