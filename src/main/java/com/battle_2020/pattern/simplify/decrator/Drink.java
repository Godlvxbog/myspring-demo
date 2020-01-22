package com.battle_2020.pattern.simplify.decrator;

public abstract class Drink {

    private String desc  ="";
    private float price = 0f;

    public abstract float cost();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
