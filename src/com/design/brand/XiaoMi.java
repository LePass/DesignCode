
package com.design.brand;


/**
 * @author Wangx
 * @create 2020/8/26
 * @since 1.0.0
 */

public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米 手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米 手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米 手机打电话");
    }
}

