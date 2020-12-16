package com.bjpowernode.testStatic;

public class testStatic02 {

        private static int count = 0;
        int id;
        String name;
        int age;

        public testStatic02() {
            id = ++count;
        }

        public String toString() {
            return "Id:" + id + ", Name:" + name + ", Age:" + age;
        }

        public static void main(String[] args) {
            testStatic02 p1 = new testStatic02();
            p1.name = "zhangsan";
            p1.age = 10;
            testStatic02 p2 = new testStatic02();
            p2.name = "lisi";
            p2.age = 12;
            System.out.println(p1);
            System.out.println(p2);
        }
}
