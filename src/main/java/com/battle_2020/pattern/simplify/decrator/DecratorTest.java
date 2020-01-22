package com.battle_2020.pattern.simplify.decrator;

public class DecratorTest {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate(new Milk(10,"milk"));

        Chocolate chocolate1 = new Chocolate(new Coffee(20,"coffee"));
//        System.out.println(chocolate.cost());
        System.out.println(chocolate1.cost());
    }
}
