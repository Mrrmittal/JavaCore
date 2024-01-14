package src.CollectionFramwork.List.Arraylist;


import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();

        a1.add(100);
        a1.add(200);
        a1.add(300);
        a1.add(400);
        a1.add(500);
        a1.add(600);

        System.out.println("Before");
        System.out.println(a1);
        System.out.println("After Reversing");
        Collections.reverse(a1);
        System.out.println(a1);
//        System.out.println("After Synchronize");
//        Collections.synchronizedList(a1);

    }
}
