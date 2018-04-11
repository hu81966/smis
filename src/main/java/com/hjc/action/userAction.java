package com.hjc.action;

import com.hjc.entity.User;
import com.hjc.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;

public class userAction extends ActionSupport{

    @Resource(name = "userService")
    private UserService userService;

    public String test() {
        System.out.println("进入了Action");
        String id = "王五2";
        User u = userService.SelectPwdById(id);
        System.out.println("pwd:" + u.getPwd());
        return SUCCESS;
    }
}
