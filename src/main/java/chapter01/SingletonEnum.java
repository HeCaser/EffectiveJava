package chapter01;


import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.net.URL;

// 单元素枚举类经常成为实现 Singleton 的最佳方案。
public enum SingletonEnum {
    INSTANCE;

    public void function() {
        System.out.println("hpean 我的单例类方法");
    }
}


