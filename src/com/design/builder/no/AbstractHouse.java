package com.design.builder.no;

/**
 * @author Wangx
 * @create 2020/8/22
 * @since 1.0.0
 */
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();


    void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
