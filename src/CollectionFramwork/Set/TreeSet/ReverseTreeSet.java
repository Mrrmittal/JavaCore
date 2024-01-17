package src.CollectionFramwork.Set.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Write a Java program to create a reverse order view of the elements contained in a given tree set.
public class ReverseTreeSet {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet<>();

        tree.add(56);
        tree.add(85);
        tree.add(78);
        tree.add(04);
        tree.add(26);

        Iterator itr = tree.descendingIterator(); //for cursor
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
