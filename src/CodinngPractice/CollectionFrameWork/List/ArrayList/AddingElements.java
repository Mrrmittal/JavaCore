package src.CodinngPractice.CollectionFrameWork.List.ArrayList;

// WAP to Create an arraylist and add some Colors in it.

import java.util.ArrayList;
import java.util.List;

public class AddingElements {
    public static void main(String[] args) {
//        Create a ArrayList
        List<String> colors = new ArrayList<>();

//      Insertion
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Red"); //Duplication are allowed in List Interface.

//       print arraylist
        System.out.println(colors);



    }
}
