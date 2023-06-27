package com.java.nestedClass;

/*
class - class is the collection of object from one class we can create n number of object and n number of object getting
together to form a class .
Nested class - class with in the class is called as nested class

 */
public class NestedClass {

    private class A{
        void show(){
            System.out.println("I am from A class");
        }
    }
    protected class B {
        void display(){
            System.out.println("I am from B class");
        }
    }

    public static void main(String[] args) {
        NestedClass n = new NestedClass();
        NestedClass.A a = n.new A();
        a.show();
        NestedClass.B b = n.new B();
        b.display();
    }
}
