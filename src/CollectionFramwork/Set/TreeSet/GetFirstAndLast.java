package src.CollectionFramwork.Set.TreeSet;

import java.util.TreeSet;

//Write a Java program to get the first and last elements in a tree set.
public class GetFirstAndLast {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();

        tree.add(12);
//        tree.add(null);  Null value not allowed in TreeSet
        tree.add(56);
        tree.add(89);
        tree.add(90);
        tree.add(52);

        System.out.println(tree);

//        To get first and last element in treeSet
        System.out.println(tree.first()); //for first element
        System.out.println(tree.last()); // for last one
    }
}
