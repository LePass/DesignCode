
package com.design.brand;


import com.design.brand.Brand;

/**
 * @author Wangx
 * @create 2020/8/26
 * @since 1.0.0
 */


public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠样式手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠样式手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
