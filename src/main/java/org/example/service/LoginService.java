package org.example.service;

import org.example.vo.Result;

import java.util.HashMap;

public interface LoginService {

    /**
     * 用户登录
     * @param user
     * @return
     */
    Result login(HashMap map);
}
