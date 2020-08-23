package com.design.builder.improve;

/**
 * @author Wangx
 * @create 2020/8/22
 * @since 1.0.0
 * 产品（普通房子）继承 抽象建造者
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }
}
