package com.battle_2020.pattern.simplify.state;

public class PermissionClaimState extends PermissonState {
    public PermissionClaimState(String state) {
        super(state);
    }


    public void claimeBy(String admin ){
        //授权之前一定要判断请求的状态的
//
//        if (!state.equals(REQUEST)){
//            return;
//        }

        //处理: handle
        //admin设置
        super.admin = admin;
        //修改状态
        super.state = CLAIMED;
    }
}
