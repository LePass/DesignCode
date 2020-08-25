package com.design.adapter.interfaceAdapter;


/**
 * @author Wangx
 * @create 2020/8/25
 * @since 1.0.0
 * 适配器   继承抽象类 聚合被适配的类
 * 覆盖父类的 output5V方法
 */
public class Voltage5VAdapter extends AbsAdapter {

    private Voltage220V voltage220V;

    public Voltage5VAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        //获取220V电压
        int srcV = voltage220V.output220V();
        //转换为5V电压
        int dstV = srcV / 44;
        System.out.println("适配类 将:" + srcV + "伏电压转换为:" + dstV + "伏电压");
        return dstV;
    }
}
