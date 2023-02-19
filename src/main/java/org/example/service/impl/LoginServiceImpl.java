package org.example.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.example.dao.User;
import org.example.mapper.UserMapper;
import org.example.service.LoginService;
import org.example.vo.ErrorCode;
import org.example.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户登录
     * @param map
     * @return
     */
    @Override
    public Result login(HashMap map) {
        //获取输入的账号和密码
        String account = String.valueOf(map.get("account"));
        String password = String.valueOf(map.get("password"));
        //密码解密
        //password = DigestUtils.md5Hex(password);
        if (StringUtils.isEmpty(account) || StringUtils.isEmpty(password)) {
            return Result.fail(ErrorCode.PARAMS_ERROR.getCode(), ErrorCode.PARAMS_ERROR.getMsg());
        }
        User userAccount = userMapper.findUser(account, password);
        if (userAccount == null){
            return Result.fail(ErrorCode.ACCOUNT_PWD_NOT_EXIST.getCode(),ErrorCode.ACCOUNT_PWD_NOT_EXIST.getMsg());
        }
        map = new HashMap<>();
        map.put("id", userAccount.getUserId());
        return Result.success(map);
    }
}
