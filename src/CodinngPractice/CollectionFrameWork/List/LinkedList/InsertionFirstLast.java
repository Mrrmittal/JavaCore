package src.CodinngPractice.CollectionFrameWork.List.LinkedList;

import java.util.LinkedList;

//Write a Java program to insert elements into the linked list at the first and last positions.
public class InsertionFirstLast {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("Jatin");
        list.add("Mittal");
        list.add(125);
        list.add(789);
        list.add(2589);
        list.add("ABC");

        list.addFirst("Water");
        list.addLast("Air");

        System.out.println(list);
    }
}
