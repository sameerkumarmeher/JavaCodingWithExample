package com.java.StreamApiUsingCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A
{
    public static void main(String[] args) {

        //[0, 5, 10, 15, 20, 25]

        //way-1 using stream api print string as array

        List<String> list = Arrays.asList("hello","hyy");
        String collect = list.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect);

        //way-2 simple ways to print string as array

        String collect1 = "["+String.join(",",list)+"]";
        System.out.println(collect1);

        //way-1 simple ways print integer value as array
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7);
        Integer[] array = arr.toArray(new Integer[0]);
        String string = Arrays.toString(array);
        System.out.println(string);

        //way-2 using stream api print Integer value as Array
        String collect2 = arr.stream().map(String::valueOf).collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect2);

    }
}
