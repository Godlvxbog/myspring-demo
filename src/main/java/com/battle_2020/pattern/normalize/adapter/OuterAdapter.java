package com.battle_2020.pattern.normalize.adapter;

public class OuterAdapter implements IUserInfo {

    OuterUserInfo outerUserInfo;//持有

    @Override
    public String getId() {
        return outerUserInfo.getId();
    }

    @Override
    public String getNum() {
        return null;
    }

    @Override
    public String getAddr() {
        return outerUserInfo.homeInfo.getAddr();
    }
}
