package src.CollectionFramwork.List.Arraylist;

import java.util.ArrayList;

public class ReplaceElement {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();

        a1.add("Hello");
        a1.add("Hii");
        a1.add("Bye");
        a1.add("Smile");
        a1.add("Cry");
        a1.add("Dance");

//        Replace an element with specified one
        a1.set(1,"Smell");
        System.out.println(a1);
    }
}
