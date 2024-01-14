package src.CollectionFramwork.List.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArraylist {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();

        a1.add(430);
        a1.add(65341);
        a1.add(65413);
        a1.add(5413655);
        a1.add(6546);
        a1.add(131);

        Collections.sort(a1);
        System.out.println(a1);
    }
}
