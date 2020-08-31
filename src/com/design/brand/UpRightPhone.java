package com.design.brand;

/**
 * @author Wangx
 * @create 2020/8/26
 * @since 1.0.0
 */
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }
    @Override
    public void open() {
        super.open();
        System.out.println("翻盖手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("翻盖手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("翻盖手机");
    }
}
