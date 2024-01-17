package src.CodinngPractice.CollectionFrameWork.Set.HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//Write a Java program to empty an hash set.
public class ToEmptyHashSet {
    public static void main(String[] args) {
        Set set = new HashSet<>();

        set.add(12);
        set.add(24);
        set.add(36);
        set.add(48);
        set.add(60);
        set.add(72);
        set.add(84);

        set.removeAll(set);
        System.out.println(set);
    }
}
