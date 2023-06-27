package com.java.Thread;

public class AnotherThread extends Thread{

    public void run()
    {
        for(int i=10;i>=1;i--){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Another value i :"+i);
        }
    }
}
