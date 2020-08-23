package com.design.prototype.improve;


/**
 * @author Wangx
 * @create 2020/8/20
 * @since 1.0.0
 */
public class Client {

    /*
      问题: 现在有一只羊tom，姓名为: tom, 年龄为：1，颜色为：白色，请编写程序创建和tom羊属性完全相同的10只羊
      原型模式实现:  使用克隆方法
     */
    /*public static void main(String[] args) {
        System.out.println("~~~~~~~~~原型模式创建~~~~~~~~");
        Sheep sheep = new Sheep("tom 1", 1, "白色 1");
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();
        Sheep sheep6 = (Sheep) sheep.clone();
        Sheep sheep7 = (Sheep) sheep.clone();
        Sheep sheep8 = (Sheep) sheep.clone();
        Sheep sheep9 = (Sheep) sheep.clone();
        Sheep sheep10 = (Sheep) sheep.clone();
        System.out.println("sheep1 = " + sheep);
        System.out.println("sheep2 = " + sheep2);
        System.out.println("sheep3 = " + sheep3);
        System.out.println("sheep4 = " + sheep4);

    }*/

    /**
     *   浅拷贝
     */
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom 1", 1, "白色 1");
        sheep.setFriend(new Sheep("jack", 2, "黑色"));

        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();

        System.out.println("sheep = " + sheep + "sheep.friend=" + sheep.getFriend().hashCode());
        System.out.println("sheep2 = " + sheep + "sheep2.friend=" + sheep2.getFriend().hashCode());
        System.out.println("sheep3 = " + sheep + "sheep3.friend=" + sheep3.getFriend().hashCode());
    }
}
