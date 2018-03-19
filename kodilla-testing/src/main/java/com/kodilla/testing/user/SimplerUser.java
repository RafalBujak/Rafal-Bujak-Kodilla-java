package com.kodilla.testing.user;

public class SimplerUser {
    private String userName;
    private String realName;


    public SimplerUser(String userName, String realName){
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName(){
        return userName;
    }

    public String getRealName(){
        return realName;
    }

}
