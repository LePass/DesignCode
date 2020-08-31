package com.design.decorator;

/**
 * @author Wangx
 * @create 2020/8/30
 * @since 1.0.0
 * 具体的被装饰者  LongBlack咖啡  Drink->Coffee->LongBlack 子类
 */
public class LongBlack extends Coffee {

    public LongBlack() {
        setDes("LongBlack咖啡");
        setPrice(5.0f);
    }
}

