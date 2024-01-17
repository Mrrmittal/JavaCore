package src.CodinngPractice.CollectionFrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Shuffle elements in a array list
public class ShuffleElements {
    public static void main(String[] args) {
        //      Create a ArrayList
        List colors = new ArrayList<String>();

//      Insertion
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");
        colors.add("Red"); //Duplication are allowed in List Interface.

//        Shuffle Elements of an ArrayList
        Collections.shuffle(colors);

    }
}
