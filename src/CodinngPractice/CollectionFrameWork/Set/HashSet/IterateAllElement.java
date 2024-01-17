package src.CodinngPractice.CollectionFrameWork.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Write a Java program to iterate through all elements in a hash list.
public class IterateAllElement {
    public static void main(String[] args) {
        Set set = new HashSet<>();

        set.add(12);
        set.add(24);
        set.add(36);
        set.add(48);
        set.add(60);
        set.add(72);
        set.add(84);

//        Iterate element
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
