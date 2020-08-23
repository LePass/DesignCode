package com.design.builder.improve;

/**
 * @author Wangx
 * @create 2020/8/22
 * @since 1.0.0
 * 产品（高楼）继承 抽象建造者
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼的打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼的砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼的透明屋顶");
    }
}
