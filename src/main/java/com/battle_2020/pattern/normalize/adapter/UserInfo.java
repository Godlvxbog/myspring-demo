package com.battle_2020.pattern.normalize.adapter;

public class UserInfo implements IUserInfo{

    private String id;
    private String addr;

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getNum() {
        return null;
    }

    @Override
    public String getAddr() {
        System.out.println("西湖区");
        return this.addr;
    }
}
