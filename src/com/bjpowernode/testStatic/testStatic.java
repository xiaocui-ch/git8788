package com.bjpowernode.testStatic;

public class testStatic {


        public testStatic(String msg) {
            System.out.println(msg);
        }
    }

      class Person {

        testStatic book1 = new testStatic("book1成员变量初始化");
        static testStatic book2;

        static {
            book2 = new testStatic("static成员book2成员变量初始化");
            book4 = new testStatic("static成员book4成员变量初始化");
        }

        public Person(String msg) {
            System.out.println(msg);
        }

        testStatic book3 = new testStatic("book3成员变量初始化");
        static testStatic book4;

        public static void funStatic() {
            System.out.println("static修饰的funStatic方法");
        }

        public static void main(String[] args) {

        }

    }
