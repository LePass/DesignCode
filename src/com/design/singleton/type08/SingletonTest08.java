package com.design.singleton.type08;

/**
 * @author Wangx
 * @create 2020/8/16
 * @since 1.0.0
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println("懒汉式 (枚举) 方式创建 ");
        System.out.println("判断是否返回同一个对象:" + (instance == instance1));
        System.out.println("hashCode:" + instance.hashCode() + "^^^^" + instance1.hashCode());
        instance.sayOK();
    }
}

//懒汉式 (枚举)
enum Singleton {
    INSTANCE; //属性

    public void sayOK() {
        System.out.println("ok");
    }

}

