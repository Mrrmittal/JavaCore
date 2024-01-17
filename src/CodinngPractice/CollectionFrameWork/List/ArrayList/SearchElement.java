package src.CodinngPractice.CollectionFrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchElement {
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

//        Search for an element in list
        if(colors.contains("Yellow")){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}

