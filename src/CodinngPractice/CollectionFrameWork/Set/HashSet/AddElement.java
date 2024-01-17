package src.CodinngPractice.CollectionFrameWork.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

//Write a Java program to append the specified element to the end of a hash set.
public class AddElement {

    public static void main(String[] args) {
        Set set = new HashSet<>();

        set.add(12);
        set.add(24);
        set.add(36);
//   Set Follow unordered and uniqueness
        System.out.println(set);
    }
}
