package com.java.IIB;

/*
IIB- Instance Initialization Block
->IIB is exccuted when object will be created.
->The main purpose of IIB is to initialised all your non-static member in one place

 */
public class A
{
    static {
        System.out.println("FROM SIB");
    }
    {
        System.out.println("FROM IIB");
    }

    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<5;i++)
        {
            A a1 = new A();
            A a2 = new A();
            count++;
        }
        System.out.println(count);
    }
}
