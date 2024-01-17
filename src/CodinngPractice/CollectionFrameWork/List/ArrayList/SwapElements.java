package src.CodinngPractice.CollectionFrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Swap two elements in an array list
public class SwapElements {
    public static void main(String[] args) {
        List list1 = new ArrayList<>();

        list1.add(12);
        list1.add(24);
        list1.add(36);
        list1.add(48);
        list1.add(60);
        list1.add(72);
        list1.add(84);

//        Swap two elements
        Collections.swap(list1,0,5);
        System.out.println(list1);
    }
}
