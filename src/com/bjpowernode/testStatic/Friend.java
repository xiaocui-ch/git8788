package com.bjpowernode.testStatic;
/*
静态代码块特点：
1.当第一次用到本类时，静态代码块执行唯一的一次
2.静态代码执行总优先与非静态方法
静态代码块用途：
用来一次性对静态成员变量赋值，例子：jdbc*/
public class Friend {
    static {
        System.out.println("静态代码块执行！");
    }
    public Friend() {
        System.out.println("无参构造方法执行！");
    }
}
