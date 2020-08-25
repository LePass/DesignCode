package com.design.adapter.interfaceAdapter;

/**
 * @author Wangx
 * @create 2020/8/25
 * @since 1.0.0
 * 提供抽象类  对被适配类进行默认实现
 */
public abstract class AbsAdapter implements IVoltage {
    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output10V() {
        return 0;
    }

    @Override
    public int output20V() {
        return 0;
    }

    @Override
    public int output30V() {
        return 0;
    }
}
