package com.battle_2020.pattern.simplify.state;

public class SateTest {

    public static void main(String[] args) {

        //老的调用
        SystemPerssion perssion = new SystemPerssion();
        perssion.setState("CLAIMED");

        perssion.claimeBy("wubo");


        //新的调用
        PermissionClaimState claimState = new PermissionClaimState(PermissionClaimState.REQUESTED);
        claimState.claimeBy("wubo");


        PermissionGrantState grantState = new PermissionGrantState(PermissionGrantState.CLAIMED);
        //状态改变
        grantState.grantBy("xbog");

    }
}
