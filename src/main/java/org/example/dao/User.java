package org.example.dao;

import lombok.Data;

@Data
public class User {

    /**id。*/
    private Integer userId;

    /**账号。*/
    private String account;

    /**用户名。*/
    private String userName;

    /**密码。*/
    private String password;
}
