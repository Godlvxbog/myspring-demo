package com.battle_2020.pattern.simplify.decrator;

public class Coffee extends Drink {
    public Coffee(float price , String desc){
        super.setDesc(desc);
        super.setPrice(price);
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
