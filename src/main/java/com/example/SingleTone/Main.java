package com.java.SingleTone;

public class Main
{
    public static void main(String[] args) throws Exception, CloneNotSupportedException {

        // Samosa samosa1 = Samosa.getSamosa();

        // System.out.println(samosa1.hashCode());

        // Samosa samosa2 = Samosa.getSamosa();

        // System.out.println(samosa2.hashCode());

        // System.out.println(Jalebi.getJalebi().hashCode());
        // System.out.println(Jalebi.getJalebi().hashCode());

        /*
         * 1. Reflection API to break singleton pattern
         * solution: 1-> if object is there ==> throw exception from inside constructor
         * 2-> use enum
         *
         *
         * 2. Deserialization:
         * solution: implementing readResolve method
         *
         * 3. cloning
         *
         *
         *
         */

        // Samosa s1 = Samosa.INSTANCE;
        // System.out.println(s1.hashCode());
        // s1.test();

        // Constructor<> constructor = Samosa.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // Samosa s2 = constructor.newInstance();
        // System.out.println(s2.hashCode());
        Singletone singletone = Singletone.getSingletone();
        System.out.println(singletone.hashCode());
        // ObjectOutputStream oos = new ObjectOutputStream(new
        // FileOutputStream("abc.ob"));
        // oos.writeObject(samosa);

        // System.out.println("serialization done..");

        // ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        // Samosa s2 = (Samosa) ois.readObject();
        // System.out.println(s2.hashCode());

        Singletone singletone1 = (Singletone) singletone.clone();
        System.out.println(singletone1.hashCode());
    }
}
