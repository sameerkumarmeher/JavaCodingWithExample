package com.java.constructor;

/*
->here we create more than one method with in same class provided they have different number of arguments and different types
of argument.
 */
public class MethodOverloading {
    void test()
    {

        System.out.println("with out arguments");
    }
    void test(int x)
    {
        System.out.println("with arguments");
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.test();
        m.test(10);
    }
}
