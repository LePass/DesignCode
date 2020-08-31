package com.design.decorator;

/**
 * @author Wangx
 * @create 2020/8/30
 * @since 1.0.0
 * 具体装饰者 子类 巧克力
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDes(" 巧克力");
        setPrice(3.0f);
    }
}
