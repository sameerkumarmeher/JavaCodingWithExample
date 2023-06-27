package com.java.Thread;

public class ThreadOperation
{
    public static void main(String[] args) {
        System.out.println("program started....");
        int x = 56 + 34;
        System.out.println("Sum is : " +x);

        //Thread name
        Thread thread = Thread.currentThread();
        String tname = thread.getName();
        System.out.println("Current running thread is : "+tname);

        //setName
        thread.setName("Myname");
        System.out.println("New thread name is : "+thread.getName());

        //sleep thread
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //thread id
        System.out.println(thread.getId());


        System.out.println("program ended...");

        //going to start user defined thread.....

        UserThread userThread = new UserThread();
        userThread.start();
    }
}
