package org.example.service;

import org.example.dao.User;

public interface UserService {

    User findUser(String account, String password);
}
