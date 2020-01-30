package com.battle_2020.pattern.normalize.template;

public abstract class SqlExecutor {

    public void handle(){
        precheck();
        //主体处理方法
        System.out.println("handle");
        postcheck();


    }


    protected abstract void precheck();
    protected abstract void postcheck();

}
