package src.CollectionFramwork.Set.TreeSet;

import java.util.TreeSet;

//Write a Java program to clone a tree set list to another tree set.
public class CompareTreeSet {
    public static void main(String[] args) {
        TreeSet tree1 = new TreeSet<>();

        tree1.add(56);
        tree1.add(89);
        tree1.add(0);
        tree1.add(63);
        tree1.add(78);
        tree1.add(63);

        TreeSet tree2 = new TreeSet<>();

        tree2.add(56);
        tree2.add(89);
        tree2.add(0);
        tree2.add(63);
        tree2.add(78);
        tree2.add(63);

        TreeSet tree3 = new TreeSet<>();
        for (Object e:
             tree1) {
            tree3.add(tree2.contains(e) ? "Yes" : "No");
            System.out.println(tree3);
        }

    }
}
