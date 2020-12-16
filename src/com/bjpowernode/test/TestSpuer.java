package com.bjpowernode.test;

public class TestSpuer {

        String name = "TestSpuer";

        public void work() {
            System.out.println("TestSpuer工作!");

    }

    static class B extends TestSpuer{
        String name = "B";

        public B() {
            super(); // 调用父类构造方法
        }

        public void work() {
            System.out.println("B工作！");
        }

        public void pint() {
            System.out.println(name);
            System.out.println(super.name); // 调用父类的实例变量
            super.work(); // 调用父类的方法
        }
    }

    public static class A {
        public static void main(String[] args) {
            B b = new B();
            b.pint();
        }
    }
}
/*测试结果：
B
TestSpuer
TestSpuer工作!
*/