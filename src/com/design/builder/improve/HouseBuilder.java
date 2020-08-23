package com.design.builder.improve;

/**
 * @author Wangx
 * @create 2020/8/22
 * @since 1.0.0
 * 抽象建造者
 */
public abstract class HouseBuilder {
    protected House house = new House();

    //建造流程方法，抽象方法
    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    //建造好将产品（房子）返回
    public House buildHouse() {
        return house;
    }

}
