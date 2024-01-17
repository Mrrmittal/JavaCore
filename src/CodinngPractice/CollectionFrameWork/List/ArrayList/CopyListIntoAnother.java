package src.CodinngPractice.CollectionFrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Copy one array list into another
public class CopyListIntoAnother {
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

        List list = new ArrayList<String>();
        list.add(123);
        list.add(123);
        list.add(123);
        list.add(123);
        list.add(123);
        list.add(123);
        list.add(123);


//        Copy Colors list into list.
        Collections.copy(list,colors);
        System.out.println(colors); //print first list
        System.out.println(list); // print 2nd list
    }
}
