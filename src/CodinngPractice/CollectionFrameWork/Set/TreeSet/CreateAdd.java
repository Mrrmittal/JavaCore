package src.CodinngPractice.CollectionFrameWork.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

//Write a Java program to create a tree set, add some colors (strings) and print out the tree set
public class CreateAdd {
    public static void main(String[] args) {
        Set tree = new TreeSet();

        tree.add(25);
        tree.add(89);
        tree.add(52);
        tree.add(96);
//        tree.add(52; Duplicate elements not allowed.
        tree.add(63);

        System.out.println(tree); // TreeSet is a Sorted Set.
    }



}
