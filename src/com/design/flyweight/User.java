package com.design.flyweight;

/**
 * @author Wangx
 * @create 2020/9/5
 * @since 1.0.0
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
