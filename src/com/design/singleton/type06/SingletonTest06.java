package com.design.singleton.type06;

/**
 * @author Wangx
 * @create 2020/8/16
 * @since 1.0.0
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println("懒汉式 (双重检查) 方式创建 ");
        System.out.println("判断是否返回同一个对象:" + (instance == instance1));
        System.out.println("hashCode:" + instance.hashCode() + "^^^^" + instance1.hashCode());
    }
}

//懒汉式 (双重检查)
class Singleton {

    //使用volatile 当一个线程创建的了对象 及时刷新到主内存中  其他线程可见
    private static volatile Singleton singleton;

    //构造器私有化
    private Singleton() {

    }

    //提供一个静态公有方法，当使用该方法的时候才去创建instance
    //加入双重检查 解决线程安全问题同时解决懒加载问题
    public static Singleton getInstance() {
        if (singleton == null) {
            //能够保证只要一个线程进入创建对象
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}

