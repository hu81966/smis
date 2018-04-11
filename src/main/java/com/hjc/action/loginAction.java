package com.hjc.action;

import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport {

    public String protal() {
        return "page";
    }

    public String login() {
        return SUCCESS;
    }
}
