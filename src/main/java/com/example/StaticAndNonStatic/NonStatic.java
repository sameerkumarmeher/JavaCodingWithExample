package com.java.StaticAndNonStatic;
/*
->The variable are declare inside the class and outside the method
->After creating the object we can access the non-static variable

 */
public class NonStatic {

    int x=10;
    public static void main(String[] args) {
        NonStatic a = new NonStatic();
        System.out.println(a.x);

    }
}
