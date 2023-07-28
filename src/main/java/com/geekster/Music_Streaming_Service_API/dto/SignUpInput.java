package com.geekster.Music_Streaming_Service_API.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpInput {

    @NotBlank
    private String fullName;

    private String email;


    @Size(min = 6,max = 18,message = "Length of the must must lie in between 6 to 18 characters")
    private String userPassword;

    private String phoneNumber;
}
