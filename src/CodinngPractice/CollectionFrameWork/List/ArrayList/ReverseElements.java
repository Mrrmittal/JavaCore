package src.CodinngPractice.CollectionFrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Reverse elements in a array list
public class ReverseElements {
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

//    Reverse Element of an ArrayList
        Collections.reverse(colors);
        System.out.println(colors);
    }
}
