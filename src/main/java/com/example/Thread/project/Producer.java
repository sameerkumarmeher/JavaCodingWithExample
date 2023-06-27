package com.java.Thread.project;

public class Producer extends Thread
{
    Company c ;
    Producer(Company c){
        this.c = c;
    }
    public void run(){
        int i=1;
        while(true){

            try {
                this.c.productItem(i);
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
