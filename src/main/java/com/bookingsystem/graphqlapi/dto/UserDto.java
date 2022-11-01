package com.bookingsystem.graphqlapi.dto;

import lombok.Data;

@Data
public class UserDto {
    private String username;
    private byte role;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private byte status;
    private byte type;
}
