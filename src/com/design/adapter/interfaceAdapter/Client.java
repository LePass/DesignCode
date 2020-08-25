package com.design.adapter.interfaceAdapter;



/**
 * @author Wangx
 * @create 2020/8/25
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("^^^^^接口适配器模式^^^^^");
        //调用手机的充电功能 传入适配器 通过适配器得到适配的电压进行充电
       Phone phone = new Phone();
        //聚合方式
        phone.charging(new Voltage5VAdapter(new Voltage220V()));
    }
}
