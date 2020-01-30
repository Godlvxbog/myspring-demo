package com.battle_2020.pattern.normalize.adapter;

public class AdapterTest {

    public static void main(String[] args) {


        //类型的选择可以用策略模式选择，
        IUserInfo userInfo = new UserInfo();//

        IUserInfo userInfo1 = new OuterAdapter();//其实是个wapper

        for (int i = 0; i < 100; i++) {
            System.out.println(userInfo.getAddr());

            ///适配
            System.out.println(userInfo1.getAddr());
        }


    }
}
