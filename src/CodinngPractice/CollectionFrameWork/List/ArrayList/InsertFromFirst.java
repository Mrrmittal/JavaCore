package src.CodinngPractice.CollectionFrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertFromFirst {
    public static void main(String[] args) {
//      Create a ArrayList
        List<String> colors = new ArrayList<>();

//      Insertion
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");
        colors.add("Red"); //Duplication are allowed in List Interface.

//      Insert element from First
        colors.add(0,"Yellow"); //Indexing is allowed in List Interface

        System.out.println(colors);
    }
}
