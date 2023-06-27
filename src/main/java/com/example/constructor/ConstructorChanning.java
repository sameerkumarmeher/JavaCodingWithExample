package com.java.constructor;
/*
->when we call one constructor from another construct by using this keyword is called constructot channing
 */
public class ConstructorChanning {
    ConstructorChanning(){
        System.out.println(1);
    }
    ConstructorChanning(int a){
        this();
        //System.out.println("hello");
    }
    ConstructorChanning(int a,int b){
        this(100);
    }
    public static void main(String[] args) {
        ConstructorChanning a = new ConstructorChanning(100,200);
    }
}
