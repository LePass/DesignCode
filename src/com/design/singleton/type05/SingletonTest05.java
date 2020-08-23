package com.design.singleton.type05;

/**
 * @author Wangx
 * @create 2020/8/16
 * @since 1.0.0
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println("懒汉式 (线程不安全，同步代码块) 方式创建 ");
        System.out.println("判断是否返回同一个对象:" + (instance == instance1));
        System.out.println("hashCode:" + instance.hashCode() + "^^^^" + instance1.hashCode());
    }
}

//懒汉式 (线程不安全，同步代码块)
class Singleton {

    private static Singleton singleton;

    //构造器私有化
    private Singleton() {

    }


    //提供一个静态公有方法，当使用该方法的时候才去创建instance
    //加锁 synchronized  虽然加入了同步代码块但是线程还是不安全的
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }

}

