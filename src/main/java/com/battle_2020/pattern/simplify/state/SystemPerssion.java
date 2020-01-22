package com.battle_2020.pattern.simplify.state;

/**
 * 状态模式改造前
 */
public class SystemPerssion {

    private String state;//状态： 请求，管理员受理，授权通过，拒绝
    private String admin;

    private boolean isGranted = false;//是否授权


    private static final String REQUEST ="REQUEST";
    private static final String CLAIMED ="CLAIMED";
    private static final String GRANTED ="GRANTED";
    private static final String DENIED ="DENIED";


    public void claimeBy(String admin ){
        //授权之前一定要判断请求的状态的

        if (!state.equals(REQUEST)){
            return;
        }

        //处理
        //admin设置
        this.admin = admin;
        //修改状态
        this.state = CLAIMED;
    }



    public void denyBy(String admin ){
        //授权之前一定要判断请求的状态的

        if (!state.equals(CLAIMED)){
            return;
        }

        if (!this.admin.equals(admin)){
            return;
        }

        //处理
        //修改状态
        this.state = DENIED;
    }


    public void grantBy(String admin ){
        //授权之前一定要判断请求的状态的

        if (!state.equals(CLAIMED)){
            return;
        }

        if (!this.admin.equals(admin)){
            return;
        }

        //处理
        //修改状态
        this.state = GRANTED;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public boolean isGranted() {
        return isGranted;
    }

    public void setGranted(boolean granted) {
        isGranted = granted;
    }
}

