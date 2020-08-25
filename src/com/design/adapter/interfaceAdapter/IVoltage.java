package com.design.adapter.interfaceAdapter;

/**
 * @author Wangx
 * @create 2020/8/25
 * @since 1.0.0
 *  目标角色
 *  提供多种输出电压方法
 */
public interface IVoltage {
    int output5V();

    int output10V();

    int output20V();

    int output30V();

}
