package com.kodilla.stream.immutable;

import com.sun.org.apache.xpath.internal.SourceTree;

public final class ForumUser {
    private final String userName;
    private final String realName;

    ForumUser(final String userName, final String realName){
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

}
