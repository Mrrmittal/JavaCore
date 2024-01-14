package src.CollectionFramwork.List.Arraylist;

import java.util.ArrayList;

public class JoinTwoList {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();

        a1.add("Hello");
        a1.add("Hii");
        a1.add("Bye");
        a1.add("Smile");
        a1.add("Cry");
        a1.add("Dance");

        ArrayList<Integer> a2 = new ArrayList<Integer>();

        a2.add(10);
        a2.add(100);
        a2.add(1000);
        a2.add(10000);
        a2.add(100000);

//        a1.add(String.valueOf(a1));
//        System.out.println(a1);

        ArrayList a3 = new ArrayList<>();
        a3.addAll(a1);
        a3.addAll(a2);
        System.out.println(a3);
    }
}
