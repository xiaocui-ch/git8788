package com.bjpowernode.Thread;

public class test02 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main begin");
Thread thread= new Thread(new myrunnable());

thread.start();
thread.join();

        System.out.println("main end");

    }
}

  class myrunnable  implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(i);
        }

    }
}