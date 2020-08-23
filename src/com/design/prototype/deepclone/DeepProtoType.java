package com.design.prototype.deepclone;

import javax.security.auth.Subject;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Wangx
 * @create 2020/8/23
 * @since 1.0.0
 */
public class DeepProtoType implements Serializable, Cloneable {
    private String name;  //String 属性
    private DeepCloneableTarget deepCloneableTarget;//引用类型

    public DeepProtoType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    //深拷贝  方式一 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //深拷贝
        try {
            // 直接调用父类的clone()方法
            DeepProtoType deep = (DeepProtoType) super.clone();
            deep.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
            return deep;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    //深拷贝  方式二 通过对象的序列化实现（推荐）
    public Object deepClone() {
        //创建流对象  输出流
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        //输入流
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //把当前对象以对象流的方式输出
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.getMessage();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
