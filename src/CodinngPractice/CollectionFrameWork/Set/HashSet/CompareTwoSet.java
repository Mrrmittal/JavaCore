package src.CodinngPractice.CollectionFrameWork.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Write a Java program to compare two sets.
public class CompareTwoSet {
    public static void main(String[] args) {
        Set set = new HashSet<>();

        set.add(12);
        set.add(24);
        set.add(36);
        set.add(48);
        set.add(60);
        set.add(72);
        set.add(84);

        Set set2 = new HashSet<>();

        set2.add(12);
        set2.add(24);
        set2.add(36);
        set2.add(48);
        set2.add(60);
        set2.add(72);
        set2.add(84);

        Set set3 = new HashSet();

        for (Object e : set){
            set3.add(set2.contains(e) ? "Yes" : "No");
            System.out.println(set3);
        }
    }
}
