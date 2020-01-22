package com.battle_2020.pattern.simplify.state;

public class PermissionGrantState extends PermissonState {
    public PermissionGrantState(String state) {
        super(state);
    }

    public void grantBy(String admin ){
        //授权之前一定要判断请求的状态的

//        if (!state.equals(CLAIMED)){
//            return;
//        }

        if (!this.admin.equals(admin)){
            return;
        }

        //处理
        //修改状态
        this.state = GRANTED;
    }

}
