package src.CodinngPractice.CollectionFrameWork.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Write a Java program to iterate through all elements in a linked list.
public class IterateLinkedList {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add("Jatin");
        list.add("Mittal");
        list.add(125);
        list.add(789);
        list.add(2589);
        list.add("ABC");

//        Iterate using Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
