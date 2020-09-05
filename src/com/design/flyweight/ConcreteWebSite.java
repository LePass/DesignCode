package com.design.flyweight;

/**
 * @author Wangx
 * @create 2020/9/5
 * @since 1.0.0
 * 具体的享元角色
 */
public class ConcreteWebSite extends WebSite {
    //共享状态
    private String type = ""; //网站发布的形式（类型）


    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布的形式为:" + type+" 在使用中.....使用者是:"+user.getName());
    }
}
