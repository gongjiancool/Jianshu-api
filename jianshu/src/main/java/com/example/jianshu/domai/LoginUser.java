package com.example.jianshu.domai;

import lombok.Builder;
import lombok.Data;

/**
 * LoginUser DTO
 */
@Data
public class LoginUser {
    private String email;
    private String password;

    public LoginUser() {
    }

    public LoginUser(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
