package com.altsen.mb.controller;

import com.altsen.mb.pojo.ResponseResult;
import com.altsen.mb.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @AUTOR zxs
 * @Date: 2020/2/21 15:24
 * @Content:
 **/
@Controller
public class LoginController {

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public ResponseResult login(User requestUser) {

        return new ResponseResult(200);
    }
}
