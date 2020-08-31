package com.design.decorator;

/**
 * @author Wangx
 * @create 2020/8/30
 * @since 1.0.0
 *  抽象装饰类
 */
public class Decorator extends Drink {
    private Drink drink; //组合的被装饰者（表示各种 种类的 咖啡）

    //构造方法注入
    public Decorator(Drink drink) {
        this.drink = drink;
    }


    @Override
    public float cost() {
        //getPrice  自己的价格   相当于 被装饰者(咖啡) 和装饰者的价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        //super.getDes()  装饰者名称(牛奶 巧克力 。。。 )    super.getPrice()  装饰者价格(牛奶 巧克力 。。。 )
        //drink.getDes()  被装饰者名称(各种 咖啡)
        return super.getDes() + "  " + super.getPrice() + " && " + drink.getDes();
    }
}
