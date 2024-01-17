package src.CodinngPractice.CollectionFrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to retrieve an element (at a specified index) from a given array list
public class IndexingInsertion {
    public static void main(String[] args) {
//      Create a ArrayList
        List colors = new ArrayList<>();

//      Insertion
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");
        colors.add("Red"); //Duplication are allowed in List Interface.

        colors.add(2, "Purple"); //Insert element at 2nd index
        colors.add(colors.size(),4567 ); // Add element in last
        colors.add(4,1235); //Insert at 4th index

        System.out.println(colors);


    }
}
