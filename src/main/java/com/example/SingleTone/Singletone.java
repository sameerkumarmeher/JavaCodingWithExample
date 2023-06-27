package com.java.SingleTone;


import java.io.Serializable;

/*Notes
-------------
Def -> It a design pattern where we create one times and runs many times inside the entire project
1)make constructor private(because no can access i.e repeated object can be happened)
2)Object create with the help of method
3)create field to store object is private
*/
public class Singletone implements Serializable,Cloneable
{
    private static Singletone singletone;

    private Singletone(){
//        if(singletone!=null){
//            throw new RuntimeException("Try to break singleton pattern...");
//        }

    }
    //lazy way of create single object
//    public static Singletone getSingletone(){
//        if(singletone==null){
//          singletone =  new Singletone();
//        }
//        return singletone;
//   }
    public static Singletone getSingletone(){
        if(singletone==null){
            synchronized (Singletone.class){
                if (singletone==null){
                    singletone = new Singletone();
                }
            }
        }
        return singletone;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //return super.clone(); // return different object
        return singletone; // return same object address
    }
}
