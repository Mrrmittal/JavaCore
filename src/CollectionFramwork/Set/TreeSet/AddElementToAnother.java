package src.CollectionFramwork.Set.TreeSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Write a Java program to add all the elements of a specified tree set to another tree set.
public class AddElementToAnother {
    public static void main(String[] args) {
        Set tree = new TreeSet();

        tree.add(25);
        tree.add(89);
        tree.add(52);
        tree.add(96);
//        tree.add(52; Duplicate elements not allowed.
        tree.add(63);

        Set tree2 = new TreeSet();

        tree2.add(23);

        tree.addAll(tree2);
        System.out.println(tree);
    }
}
