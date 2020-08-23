package com.design.singleton.type02;

import com.design.singleton.type02.Singleton;

/**
 * @author Wangx
 * @create 2020/8/16
 * @since 1.0.0
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println("饿汉式，静态代码块 方式创建 ");
        System.out.println("判断是否返回同一个对象:" + (instance == instance1));
        System.out.println("hashCode:" + instance.hashCode() + "^^^^" + instance1.hashCode());
    }
}

//饿汉式  静态代码块
class Singleton {
    //1.构造器私有化
    private Singleton() {

    }

    //2.本类内部创建对象实例
    private static Singleton singleton;

    //在静态代码块中创建单例对象
    static {
        singleton = new Singleton();
    }

    //3.提供一个静态方法 返回实例对象
    public static Singleton getInstance() {
        return singleton;
    }
}

