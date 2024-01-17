package src.CodinngPractice.CollectionFrameWork.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Write a Java program to iterate through all elements in a linked list starting at the specified position.
public class IterateFromIndex {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add("Jatin");
        list.add("Mittal");
        list.add(125);
        list.add(789);
        list.add(2589);
        list.add("ABC");

//        Iterate from specific position

        ListIterator itr = list.listIterator(2);
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
