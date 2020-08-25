package com.design.adapter.classAdapter;

/**
 * @author Wangx
 * @create 2020/8/25
 * @since 1.0.0
 * 适配器   继承被适配的类同时实现适配接口
 * 将被适配着的200V 电压 转换成5V电压
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        //获取220V电压
        int srcV = output220V();
        //转换为5V电压
        int dstV = srcV / 44;
        System.out.println("适配类 将:"+srcV+"伏电压转换为:"+dstV+"伏电压");
        return dstV;
    }
}
