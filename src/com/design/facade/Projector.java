package com.design.facade;

/**
 * @author Wangx
 * @create 2020/9/5
 * @since 1.0.0
 */
public class Projector {
    //使用单例模式

    private static Projector projector = new Projector();


    public static Projector getInstance() {
        return projector;
    }

    public void on(){
        System.out.println("投影仪 打开");
    }
    public void off(){
        System.out.println("投影仪 关闭");
    }

    public void focus(){
        System.out.println("投影仪 正在聚焦中");
    }
}
