package com.design.adapter.objectAdapter;

/**
 * @author Wangx
 * @create 2020/8/25
 * @since 1.0.0
 * 适配器   实现适配接口 聚合被适配的类
 * 将被适配着的200V 电压 转换成5V电压
 */
public class VoltageAdapter implements IVoltage5V {

    // 通过构造器聚合的形式，这里直接采用的类，最好是定义成接口/父类
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }


    @Override
    public int output5V() {
        if (null != voltage220V) {
            //获取220V电压
            int srcV = voltage220V.output220V();
            //转换为5V电压
            int dstV = srcV / 44;
            System.out.println("适配类 将:" + srcV + "伏电压转换为:" + dstV + "伏电压");
            return dstV;
        }
        return 0;
    }
}
