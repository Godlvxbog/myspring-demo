package com.battle_2020.pattern.normalize.template;

public class SimpleSqlExecutor extends SqlExecutor {
    @Override
    protected void precheck() {
        //check
        System.out.println("simplesqlExecutor : check");
    }

    @Override
    protected void postcheck() {
        //postcheck
        System.out.println("simplesqlExecutor: postcheck");
    }
}
