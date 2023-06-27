package com.java.Thread;

//The below thread are called as Concurrent Thread because two thread are run at same timing.

public class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Value of i :"+i);
        }
    }

    public static void main(String[] args) {
        MyThread thr = new MyThread();

        Thread t1 = new Thread(thr);

       AnotherThread t2 = new AnotherThread();
        t1.start();
        t2.start();


    }
}
