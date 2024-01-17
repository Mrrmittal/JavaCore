package src.CodinngPractice.CollectionFrameWork.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

// Write a Java program to append the specified element to the end of a linked list.
public class AddElement {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add("Jatin");
        list.add("Mittal");
        list.add(125);
        list.add(789);
        list.add(2589);
        list.add("ABC");

        System.out.println(list);
    }
}
