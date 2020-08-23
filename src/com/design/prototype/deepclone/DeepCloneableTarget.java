package com.design.prototype.deepclone;

import java.io.Serializable;

/**
 * @author Wangx
 * @create 2020/8/23
 * @since 1.0.0
 */
public class DeepCloneableTarget implements Serializable, Cloneable {
    private static final long serialVersionUID = -3041953576223019100L;

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }


    //该类的属性都是String类型，因此使用默认的clone完成进行拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
