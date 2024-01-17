package src.CodinngPractice.CollectionFrameWork.List.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

//Write a Java program to replace an element in a linked list.
public class ReplaceElement {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("Jatin");
        list.add("Mittal");
        list.add(125);
        list.add(789);
        list.add(2589);
        list.add("ABC");

        list.set(0,"Water");
        System.out.println(list);
    }
}
