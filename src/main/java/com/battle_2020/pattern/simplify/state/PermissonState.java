package com.battle_2020.pattern.simplify.state;

public abstract class PermissonState {

    protected String state;

    protected String admin;

    public PermissonState(String state) {
        this.state = state;
    }

    public static String REQUESTED;
    public static String CLAIMED;
    public static String GRANTED;

}
