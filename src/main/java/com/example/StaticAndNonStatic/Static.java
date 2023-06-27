package com.java.StaticAndNonStatic;

/*
->static variable are created inside the class and outside the method by using static keyword
->These variable has global access.
->These variable are called as class member.
->if the variable is declared as static we need not create the object inside the static method.
 */
public class Static
{
    static  int x=10;
    public static void main(String[] args) {
        System.out.println(x);
    }
}
