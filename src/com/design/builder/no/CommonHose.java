package com.design.builder.no;

/**
 * @author Wangx
 * @create 2020/8/22
 * @since 1.0.0
 */
public class CommonHose  extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");

    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");

    }
}
