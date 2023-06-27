package com.java.ThisKeyword;
/*
->this is a special reference variable that holds object address and it gets created automatically.
 */
public class A {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1);
        a1.test();
    }
    public void test()
    {
        System.out.println(this);
    }
}
