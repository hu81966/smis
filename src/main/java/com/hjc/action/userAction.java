package com.hjc.action;

import com.hjc.entity.User;
import com.hjc.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import java.util.List;

public class userAction extends ActionSupport{

    @Resource(name = "userService")
    private UserService userService;

    private List<User> userList;

    public String test() {
        System.out.println("进入了Action");
        String id = "王五2";
        User u = userService.SelectPwdById(id);
        System.out.println("pwd:" + u.getUserPwd());
        return SUCCESS;
    }

    public String list() {
        userList = userService.getAll();
        return SUCCESS;
    }

    public String addUser() {
        return "add";
    }

    public String editUser() {
        return "edit";
    }

    public String deleteUser() {
        return "delete";
    }


    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
