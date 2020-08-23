package com.design.prototype.deepclone;

/**
 * @author Wangx
 * @create 2020/8/23
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        DeepProtoType p = new DeepProtoType();
        p.setName("深拷贝");
        p.setDeepCloneableTarget(new DeepCloneableTarget("引用类型", "类"));
       //方式一  深拷贝
        DeepProtoType p2 = (DeepProtoType) p.clone();
        //p 和p2 的引用类型的hashCode 是不一样的
        System.out.println("p=" + p.getName() + "p.getDeepCloneableTarget=" + p.getDeepCloneableTarget().hashCode());
        System.out.println("p2=" + p2.getName() + "p2.getDeepCloneableTarget=" + p2.getDeepCloneableTarget().hashCode());


        //方式二  深拷贝
        DeepProtoType p3 = (DeepProtoType) p.deepClone();
        //p 和p2 的引用类型的hashCode 是不一样的
        System.out.println("p=" + p.getName() + "p.getDeepCloneableTarget=" + p.getDeepCloneableTarget().hashCode());
        System.out.println("p3=" + p3.getName() + "p2.getDeepCloneableTarget=" + p3.getDeepCloneableTarget().hashCode());
    }
}
