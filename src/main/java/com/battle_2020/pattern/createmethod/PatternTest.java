package com.battle_2020.pattern.createmethod;

public class PatternTest {

    public static void main(String[] strs){
        LoanFactory loanFactory = new LoanFactory();
        loanFactory.createRCL("1","1","2");
    }
}

