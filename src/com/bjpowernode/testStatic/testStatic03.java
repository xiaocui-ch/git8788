package com.bjpowernode.testStatic;

public class testStatic03 {
   private int a=1;
   private static  int b=2;

    public void test01() {
        System.out.println(a);
        System.out.println(b);

    }


    public static void test02() {
        testStatic03 arr=new testStatic03();
        System.out.println(arr.a);
        System.out.println(b);
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        testStatic03.test02();
        testStatic03 arr=new testStatic03();
        arr.test01();
    }


}

