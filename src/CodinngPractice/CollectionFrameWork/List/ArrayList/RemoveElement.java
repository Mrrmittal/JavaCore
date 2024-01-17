package src.CodinngPractice.CollectionFrameWork.List.ArrayList;

// Remove the third element from a array list

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveElement {
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

//        Remove 3rd index element.
        colors.remove(3);
        System.out.println(colors);
    }
}
