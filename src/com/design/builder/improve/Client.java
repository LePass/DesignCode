package com.design.builder.improve;


/**
 * @author Wangx
 * @create 2020/8/22
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //完成创建 返回产品（普通房子）
        House house = houseDirector.constructHouse();

        System.out.println("---------------------------");
        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        //set方式传入高楼对象， 重置建造者
        houseDirector.setHouseBuilder(highBuilding);
        //完成创建 返回产品（高楼房子）
        houseDirector.constructHouse();

    }
}
