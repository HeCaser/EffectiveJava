package chapter01;


import java.io.*;

public class Singleton implements Serializable {

    public static final Singleton instance = new Singleton();
    private Singleton(){}

    // 此方法，在反序列化时调用，可以由用户决定反序列化结果。单例类需要处理
    private Object readResolve(){
        return instance;
    }

    public void function() {
        System.out.println("hpean 我的单例类方法");
    }
}


