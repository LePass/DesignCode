package com.design.decorator;

/**
 * @author Wangx
 * @create 2020/8/30
 * @since 1.0.0
 * 被装饰的原始对象    抽象类
 */
public abstract class Drink {

    public String des;

    private float price = 0.0f;


    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    //计算费用方法   子类来实现
    public  abstract float cost();
}
