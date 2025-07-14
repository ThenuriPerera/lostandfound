package com.example.lostandfound.entity;

import com.example.lostandfound.UserRole;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id @GeneratedValue
    private Long id;

    private String username;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private UserRole role;
}
