package src.CollectionFramwork.List.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();

        a1.add("Hello");
        a1.add("Hii");
        a1.add("Bye");
        a1.add("Smile");
        a1.add("Cry");
        a1.add("Dance");

        System.out.println("Without Swapping");
        System.out.println(a1);
        System.out.println("After Swapping");
        Collections.swap(a1, 3, 5);
        System.out.println(a1);
    }
}
