package com.bjpowernode.Thread;
//模拟主线程
public class TreadTest01 {
    public static void main(String[] args) {
        Thread t01=new Thread(new MyRunnable());
        t01.setName("可爱多");
        t01.start();
        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t01.interrupt();
    }

}

class MyRunnable implements Runnable{
    @Override
    //注意：子类继承父类不能抛出比父类更多的异常，run()只能try catch.
    //线程睡眠中途可以中断睡眠
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---->"+"begin");


        try {
            Thread.sleep(1000*2*390000000);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        System.out.println(Thread.currentThread().getName()+"---->"+"end");

    }

}