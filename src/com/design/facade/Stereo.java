package com.design.facade;

/**
 * @author Wangx
 * @create 2020/9/5
 * @since 1.0.0
 */
public class Stereo {
    //使用单例模式

    private static Stereo screen = new Stereo();


    public static Stereo getInstance() {
        return screen;
    }

    public void on(){
        System.out.println("立体声 打开");
    }
    public void off(){
        System.out.println("立体声 关闭");
    }

    public void up(){
        System.out.println("立体声 音量调大");
    }
}
