package com.design.composite;

/**
 * @author Wangx
 * @create 2020/8/31
 * @since 1.0.0
 * 抽象的组件对象
 */
public abstract class OrganizationComponent {

    private String name;//名字
    private String des;//说明


    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    //添加和删除 默认实现
    protected  void add(OrganizationComponent component){
        // 缺省的实现，抛出异常，因为叶子对象没有这个功能
        throw new  UnsupportedOperationException("对象不支持改功能");
    }

    protected  void remove(OrganizationComponent component){
        // 缺省的实现，抛出异常，因为叶子对象没有这个功能
        throw new  UnsupportedOperationException("对象不支持改功能");
    }

    //打印方法 都必须实现
    protected  abstract  void print();
}
