package com.javadatastructures;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TheArrays {
    public static void main(String [] args){
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        int[] integers = {100, 200};
        System.out.println(colors.length);//length of an array

        for(int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }

        //reverse loop
        for(int i = colors.length - 1; i >= 0; i--){
            System.out.println(colors[i]);
        }

        //enhanced for-loop
        for(String color : colors){
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);

    }
}
