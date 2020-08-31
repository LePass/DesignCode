package com.design.decorator;

/**
 * @author Wangx
 * @create 2020/8/30
 * @since 1.0.0
 * 具体的被装饰者  意大利咖啡  Drink->Coffee->Espresso 子类
 */
public class Espresso extends Coffee {

    public Espresso() {
        setDes("意大利咖啡");
        setPrice(6.0f);
    }
}
