package com.javadatastructures;

import java.util.ArrayList;
import java.util.List;

//Lists are always backed by arrays
public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors);
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));

        //three ways to loop through lists
        for (String color : colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }

        //Creates a list that is immutable
         List<String> colorsUnmodifiable = List.of(
                 "blue",
                 "green",
                 "yellow"
         );
        //colorsUnmodifiable.add("pink"); => Throws an error
    }
}
