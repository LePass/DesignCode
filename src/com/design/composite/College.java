package com.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wangx
 * @create 2020/9/1
 * @since 1.0.0
 * 组合对象 可以包含其它组合对象或者叶子对象
 * 学院对象
 */
public class College extends OrganizationComponent {

    //用来存储组合对象中包含的子组件对象
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent component) {
        organizationComponents.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        organizationComponents.remove(component);
    }


    @Override
    protected void print() {
        //先输出自己
        System.out.println("----------------" + getName() + "-------------");
        //如果包含子组件 就输出子组件对象
        organizationComponents.forEach(s -> s.print());
    }
}
