package src.CollectionFramwork.List.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArraylist {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();

        a1.add(100);
        a1.add(200);
        a1.add(300);
        a1.add(400);
        a1.add(500);
        a1.add(600);

        ArrayList a2 = new ArrayList();

        a2.add("Hello");
        a2.add("Hii");
        a2.add("Bye");
        a2.add("Smile");
        a2.add("Cry");
        a2.add("Dance");

        Collections.copy(a1,a2);
        System.out.println(a2);
        System.out.println(a1);
    }
}
