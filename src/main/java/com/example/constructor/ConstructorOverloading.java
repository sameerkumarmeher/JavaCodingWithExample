package com.java.constructor;

/*
->When we create more than one constructor in same class provided they have different number of argument
or different types of argument is called as Constructor Overloading.
 */
public class ConstructorOverloading
{
    ConstructorOverloading()
    {
        System.out.println("Non parameterized Constructor");
    }
    ConstructorOverloading(int i)
    {
        System.out.println("Parameterised Constructor");
    }

    public static void main(String[] args) {
        ConstructorOverloading constructorOverloading = new ConstructorOverloading();
        ConstructorOverloading constructorOverloading1 = new ConstructorOverloading(10);
    }
}
