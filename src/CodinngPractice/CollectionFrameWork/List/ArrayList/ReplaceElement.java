package src.CodinngPractice.CollectionFrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReplaceElement {
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

//        Replace 3rd index element form Yellow
        colors.set(3,"Yellow");
        System.out.println(colors);
    }
}
