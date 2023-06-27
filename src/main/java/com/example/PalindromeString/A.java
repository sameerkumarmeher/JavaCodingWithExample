package com.java.PalindromeString;

import java.util.Scanner;

/*
palindrome of String
Example :
    input : madam
    output : madam
 */
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str,rev="";
        System.out.println("Enter a String :");
        str=sc.nextLine();
        int length = str.length();
        for(int i=length-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is not  palindrome");
        }
    }
}
