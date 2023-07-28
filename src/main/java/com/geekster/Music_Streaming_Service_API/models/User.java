package com.geekster.Music_Streaming_Service_API.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String userFullName;

    @Column(unique = true)
    private String userEmail;

    private String userPassword;

    @Column(unique = true)
    private String userContactNo;

}
