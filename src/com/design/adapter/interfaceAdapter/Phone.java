package com.design.adapter.interfaceAdapter;


/**
 * @author Wangx
 * @create 2020/8/25
 * @since 1.0.0
 * 手机类
 */
public class Phone {

    //充电
    public void charging(IVoltage iVoltage) {
        if (iVoltage.output5V() == 5) {
            System.out.println("手机类 转换后电压为5V 可以充电");
        } else {
            System.out.println("电压大于5V 无法充电");
        }
    }
}
