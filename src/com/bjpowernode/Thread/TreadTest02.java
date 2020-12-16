package com.bjpowernode.Thread;

public class TreadTest02 {
    public static void main(String[] args) {
        //创建一个可运行的对象
        MyRunnable01 R = new MyRunnable01();
        //将可运行的对象封装成线程对象
        Thread thread = new Thread(R);
        thread.setName("小天使");
        thread.start();//此方法只为了开栈空间，开出栈空间方法结束

        try {
            thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //run是R对象的一个属性
        R.run=false;
    }
}
class  MyRunnable01 implements  Runnable{
    boolean run=true;
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(run){
                System.out.println(Thread.currentThread().getName()+"--->i");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else return;

        }
    }}

