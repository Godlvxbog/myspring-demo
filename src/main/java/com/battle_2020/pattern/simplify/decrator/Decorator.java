package com.battle_2020.pattern.simplify.decrator;

/**
 * 中间层
 */
public class Decorator extends Drink {
    private Drink obj;//主类，装饰者，这里要用接口或者超类

    /**
     * 初始化超类
     * @param obj
     */
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }
}
