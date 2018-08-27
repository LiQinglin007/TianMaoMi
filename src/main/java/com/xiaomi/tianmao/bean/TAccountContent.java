package com.xiaomi.tianmao.bean;

public class TAccountContent {
    private Integer id;

    private String loginname;

    private String loginpassword;

    private String accountname;

    private Integer userid;

    public TAccountContent(Integer id, String loginname, String loginpassword, String accountname, Integer userid) {
        this.id = id;
        this.loginname = loginname;
        this.loginpassword = loginpassword;
        this.accountname = accountname;
        this.userid = userid;
    }

    public TAccountContent() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getLoginpassword() {
        return loginpassword;
    }

    public void setLoginpassword(String loginpassword) {
        this.loginpassword = loginpassword == null ? null : loginpassword.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}