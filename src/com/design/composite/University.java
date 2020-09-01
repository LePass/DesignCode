package com.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wangx
 * @create 2020/9/1
 * @since 1.0.0
 * 学校对象
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String des) {
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
        System.out.println("----------------" + getName() + "-------------");
        organizationComponents.forEach(s -> s.print());
    }
}
