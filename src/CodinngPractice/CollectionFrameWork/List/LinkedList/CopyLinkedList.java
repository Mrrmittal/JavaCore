package src.CodinngPractice.CollectionFrameWork.List.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

//Write a Java program to copy a linked list to another linked list.
public class CopyLinkedList {
    public static void main(String[] args) {
        LinkedList list2 = new LinkedList();

        list2.add("Jatin");
        list2.add("Mittal");
        list2.add(125);
        list2.add(789);
        list2.add(2589);
        list2.add("ABC");

        LinkedList list = new LinkedList<>();
        list.add("Jatin");
        list.add("Mittal");
        list.add(1);
        list.add(7);
        list.add(25);
        list.add("A");

        Collections.copy(list,list2);
        System.out.println(list2);
        System.out.println(list);
    }
}
