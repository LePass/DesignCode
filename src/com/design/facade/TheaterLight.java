package com.design.facade;

/**
 * @author Wangx
 * @create 2020/9/5
 * @since 1.0.0
 */
public class TheaterLight {
    //使用单例模式

    private static TheaterLight theaterLight = new TheaterLight();


    public static TheaterLight getInstance() {
        return theaterLight;
    }

    public void on(){
        System.out.println("影院灯光 打开");
    }
    public void off(){
        System.out.println("影院灯光 关闭");
    }

    public void bright(){
        System.out.println("影院灯光 调亮");
    }
    public void dim(){
        System.out.println("影院灯光 调暗");
    }
}
