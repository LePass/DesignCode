package com.design.brand;

/**
 * @author Wangx
 * @create 2020/8/26
 * @since 1.0.0
 */
public abstract class Phone {
    protected Brand brand;

    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }


    protected void call() {
        this.brand.call();
    }


    protected void close() {
        this.brand.close();
    }

}
