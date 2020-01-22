package com.battle_2020.pattern.simplify.decrator;

public class Chocolate extends Decorator {
    /**
     * 初始化超类
     *
     * @param obj
     */
    public Chocolate(Drink obj) {
        super(obj);

        super.setDesc("巧克力");
        super.setPrice(20);
    }
}
