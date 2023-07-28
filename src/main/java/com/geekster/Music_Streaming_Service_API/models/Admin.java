package com.geekster.Music_Streaming_Service_API.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;

    private String adminFullName;

    @Column(unique = true)
    private String adminContactNumber;
    @Email
    @Column(unique = true)
    private String adminEmail;

    private String adminPassword;
}
