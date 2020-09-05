package com.design.facade;

/**
 * @author Wangx
 * @create 2020/9/5
 * @since 1.0.0
 */
public class Popcorn {

    //使用单例模式

    private static Popcorn popcorn = new Popcorn();


    public static Popcorn getInstance() {
        return popcorn;
    }

    public void on(){
        System.out.println("爆米花机 打开");
    }
    public void off(){
        System.out.println("爆米花机 关闭");
    }

    public void pop(){
        System.out.println("爆米花机 正在出爆米花");
    }
}
