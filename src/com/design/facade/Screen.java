package com.design.facade;

/**
 * @author Wangx
 * @create 2020/9/5
 * @since 1.0.0
 */
public class Screen {
    //使用单例模式

    private static Screen screen = new Screen();


    public static Screen getInstance() {
        return screen;
    }

    public void up(){
        System.out.println("屏幕 上升");
    }
    public void down(){
        System.out.println("屏幕 下降");
    }

}
