package org.example.controller;

import org.example.service.LoginService;
import org.example.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@EnableScheduling
@RestController
@ResponseBody
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 用户登录
     * @param map
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody HashMap map) {
        return loginService.login(map);
    }
}
