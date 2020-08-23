package com.design.prototype.no;

/**
 * @author Wangx
 * @create 2020/8/20
 * @since 1.0.0
 */
public class Client {

    /*
      问题: 现在有一只羊tom，姓名为: tom, 年龄为：1，颜色为：白色，请编写程序创建和tom羊属性完全相同的10只羊
      传统方式实现:   直接new 10只羊
      优点: 比较好理解，简单易操作
     */

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom 1", 1, "白色 1");
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep6 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep7 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep8 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep9 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep10 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    }
}
