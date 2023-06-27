package com.java.nestedClass;

public class A {

    private class B{
        static int x=10;
        public void show(){
            System.out.println("I'm from B class");
        }
    }
    protected class C{
        static int y=20;
        public void show(){
            System.out.println("I'm from C class");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        int x = B.x;
        System.out.println(x);
        b.show();

        A.C c = a.new C();
        int y = C.y;
        System.out.println(y);
        c.show();
    }
}
