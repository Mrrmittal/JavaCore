package src.CollectionFramwork.Set.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// Write a Java program to iterate through all elements in a tree set.
public class IterateElement {
    public static void main(String[] args) {
        Set tree = new TreeSet();

        tree.add(25);
        tree.add(89);
        tree.add(52);
        tree.add(96);
//        tree.add(52; Duplicate elements not allowed.
        tree.add(63);

        Iterator itr = tree.iterator(); {
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }

    }
}
