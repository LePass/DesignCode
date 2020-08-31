package com.design.decorator;

/**
 * @author Wangx
 * @create 2020/8/30
 * @since 1.0.0
 * 具体的被装饰者  ShortBlack咖啡  Drink->Coffee->ShortBlack 子类
 */
public class ShortBlack extends Coffee {

    public ShortBlack() {
        setDes("ShortBlack 咖啡");
        setPrice(4.0f);
    }
}
