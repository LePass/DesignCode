package com.design.brand;

/**
 * @author Wangx
 * @create 2020/8/26
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args) {
        Phone vivo = new UpRightPhone(new Vivo());
        vivo.open();
        vivo.call();
        vivo.close();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Phone xiaomi = new FoldedPhone(new XiaoMi());
        xiaomi.open();
        xiaomi.call();
        xiaomi.close();
    }
}
