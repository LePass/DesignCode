package com.design.adapter.interfaceAdapter;

/**
 * @author Wangx
 * @create 2020/8/25
 * @since 1.0.0
 */
public class Voltage10VAdapter extends AbsAdapter {

    private Voltage220V voltage220V;

    public Voltage10VAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output10V() {
        System.out.println("覆盖10V方法");
        return 10;
    }
}
