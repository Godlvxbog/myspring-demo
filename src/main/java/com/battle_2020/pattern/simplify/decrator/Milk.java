package com.battle_2020.pattern.simplify.decrator;

public class Milk extends Drink {

    public Milk(float price , String desc){
        super.setDesc(desc);
        super.setPrice(price);
    }

    @Override
    public float cost() {
        return 10;
    }


}
