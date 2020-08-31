package com.design.decorator;

/**
 * @author Wangx
 * @create 2020/8/30
 * @since 1.0.0
 */
public class CofferBar {
    public static void main(String[] args) {

        //1.点一份 LongBlack
        Drink order = new LongBlack();
        System.out.println("点一份 咖啡="+order.getDes());
        System.out.println("费用="+order.cost());

        //2.加入一份牛奶
         order = new Milk(order);
        System.out.println("加一份 牛奶="+order.getDes());
        System.out.println("费用="+order.cost());

        //3.加入一份巧克力
        order=new Chocolate(order);
        System.out.println("加一份 巧克力="+order.getDes());
        System.out.println("费用="+order.cost());

        //4.加入一份巧克力
        order=new Chocolate(order);
        System.out.println("在加一份 巧克力="+order.cost());
        System.out.println("费用="+order.getDes());
    }
}
