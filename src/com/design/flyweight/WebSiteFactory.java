package com.design.flyweight;

import java.util.HashMap;

/**
 * @author Wangx
 * @create 2020/9/5
 * @since 1.0.0
 * 享元工厂
 * 网站工厂类
 * 根据需求返回具体的网站
 */
public class WebSiteFactory {

    //集合， 充当池的作用
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站，如果没有就创建一个并存入池中并返回
    public WebSite getWebSiteFactory(String type) {
        if (!pool.containsKey(type)) {
            //没有 创建一个网站并放入池中
            pool.put(type, new ConcreteWebSite(type));
            System.out.println("创建:"+type);
        }
        return (WebSite) pool.get(type);
    }

    //获取网站的分类总数（池中有多少个网站类型）
    public int getWebSiteCount() {
        return pool.size();
    }
}
