package com.design.composite;

/**
 * @author Wangx
 * @create 2020/9/1
 * @since 1.0.0
 *  叶子对象
 *  系对象
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    //叶子对象没有子对象 直接输出叶子对象名字
    @Override
    protected void print() {
        System.out.println(getName());
    }
}
