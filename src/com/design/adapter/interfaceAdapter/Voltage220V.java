package com.design.adapter.interfaceAdapter;

/**
 * @author Wangx
 * @create 2020/8/25
 * @since 1.0.0
 * 被适配的类  输出 220V电压
 */
public class Voltage220V {
    public int output220V() {
        int src = 220;
        System.out.println("被适配的类   电压=" + src + "伏");
        return src;
    }
}
