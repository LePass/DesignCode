package com.design.facade;

/**
 * @author Wangx
 * @create 2020/9/5
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^");
        homeTheaterFacade.play();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^");
        homeTheaterFacade.pause();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^");
        homeTheaterFacade.end();


    }
}
