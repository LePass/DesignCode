package com.design.singleton.type07;

/**
 * @author Wangx
 * @create 2020/8/16
 * @since 1.0.0
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println("懒汉式 (静态内部类) 方式创建 ");
        System.out.println("判断是否返回同一个对象:" + (instance == instance1));
        System.out.println("hashCode:" + instance.hashCode() + "^^^^" + instance1.hashCode());
    }
}

//懒汉式 (静态内部类)
class Singleton {
    //构造器私有化
    private Singleton() {

    }

    //静态内部类，该类中有一个静态属性
    //1.在Singleton类装载的时候 SingletonInstance 不会被装载  （懒加载）
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态公有方法 直接返回 对象
    //2.在调用getInstance 方法的时候 SingletonInstance才会去装载，在装载的时候类的静态属性只会在第一次加载的时候初始化
    //  保证了线程的安全性，在类初始化的时候其它线程是无法进入的
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}

