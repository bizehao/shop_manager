package com.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 毕泽浩
 * @Description:
 * @time 19-1-18 下午10:29
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("test")
    public String test(){
        return "test";
    }
}
