package com.design.flyweight;

/**
 * @author Wangx
 * @create 2020/9/5
 * @since 1.0.0
 * 享元模式
 * 外部状态:  使用的人 user
 * 内部状态:  网站 例如 新闻 博客
 */
public class Client {
    public static void main(String[] args) {

        //创建一个工厂
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        //客户要一个以新闻形式发布的网站
        WebSite webSite1 = webSiteFactory.getWebSiteFactory("新闻");
        webSite1.use(new User("tom"));

        //客户要一个以博客形式发布的网站
        WebSite webSite2 = webSiteFactory.getWebSiteFactory("博客");
        webSite2.use(new User("jack"));

        //客户还要一个以博客形式发布的网站
        WebSite webSite3 = webSiteFactory.getWebSiteFactory("博客");
        webSite3.use(new User("smith"));


        int count = webSiteFactory.getWebSiteCount();
        System.out.println("网站的分类总数:"+count);
    }
}
