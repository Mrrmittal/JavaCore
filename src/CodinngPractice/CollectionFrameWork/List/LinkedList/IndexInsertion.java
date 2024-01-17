package src.CodinngPractice.CollectionFrameWork.List.LinkedList;

import java.util.LinkedList;

// Write a Java program to insert the specified element at the specified position in the linked list.
public class IndexInsertion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("Jatin");
        list.add("Mittal");
        list.add(125);
        list.add(789);
        list.add(2589);
        list.add("ABC");

        list.add(5,"Poppye");
        System.out.println(list);
    }
}
