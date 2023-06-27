package com.java.Thread.project;

public class Company
{
    int n;
    boolean f = false;
    //if f is false chance: producer
    //if f is true chance: consumer

    synchronized public void productItem(int n) throws Exception {
        if(f){
            wait();
        }
        this.n=n;
        System.out.println("Produced : "+this.n);
        f=true;
        notify();
    }
    synchronized public int consumeItem() throws Exception
    {
        if (!f){
            wait();
        }
        System.out.println("Consumed : "+this.n);
        f=false;
        notify();
        return this.n;
    }
}
