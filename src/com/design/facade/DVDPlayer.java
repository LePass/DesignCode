package com.design.facade;

/**
 * @author Wangx
 * @create 2020/9/5
 * @since 1.0.0
 */
public class DVDPlayer {

    //使用单例模式

    private static DVDPlayer dvdPlayer = new DVDPlayer();


    public static DVDPlayer getInstance() {
        return dvdPlayer;
    }

    public void on(){
        System.out.println("DVD 打开");
    }
    public void off(){
        System.out.println("DVD 关闭");
    }

    public void play(){
        System.out.println("DVD 正在播放中");
    }

    public void pause(){
        System.out.println("DVD 暂停");
    }
}
