package src.CollectionFramwork.List.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElements {
    public static void main(String[] args) {
        ArrayList<String>  a = new ArrayList();

        a.add("Hello");
        a.add("Hii");
        a.add("Bye");
        a.add("Smile");
        a.add("Cry");
        a.add("Dance");

        System.out.println("Without Shuffling");
        for (Object element : a){
            System.out.println(element);
        }

        System.out.println("Shuffle element");
        Collections.shuffle(a);
        System.out.println(a);
    }
}
