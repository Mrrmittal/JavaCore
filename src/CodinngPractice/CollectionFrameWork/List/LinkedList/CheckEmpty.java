package src.CodinngPractice.CollectionFrameWork.List.LinkedList;

import java.util.LinkedList;

//Write a Java program to check if a linked list is empty or not
public class CheckEmpty {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("Jatin");
        list.add("Mittal");
        list.add(125);
        list.add(789);
        list.add(2589);
        list.add("ABC");

        System.out.println(list.isEmpty());
    }
}
