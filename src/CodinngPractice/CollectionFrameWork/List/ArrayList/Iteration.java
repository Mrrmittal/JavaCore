package src.CodinngPractice.CollectionFrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iteration {
    public static void main(String[] args) {

//      Create a ArrayList
        List<String> colors = new ArrayList<>();

//      Insertion
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Red"); //Duplication are allowed in List Interface.

//        Iterate using foreach loop
        for (String element : colors) {
            System.out.println(element);
        }

        System.out.println("*****************************************************");

//        Iterate using ListIterator class (ListIterator only used in List Interface)
        ListIterator itr = colors.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("*****************************************************");

//        Iterate Using Iterator class (Useful for all Collection Interface)
        Iterator itr2 = colors.listIterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
