package src.CodinngPractice.CollectionFrameWork.List.LinkedList;

import java.util.LinkedList;

//Write a Java program to compare two linked lists.
public class CompareLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("Jatin");
        list.add("Mittal");
        list.add(125);
        list.add(789);
        list.add(2589);
        list.add("ABC");

        LinkedList list2 = new LinkedList();

        list2.add("Jatin");
        list2.add("Mittal");
        list2.add(125);
        list2.add(789);
        list2.add(2589);
        list2.add("ABC");

        LinkedList list3 = new LinkedList<>();
        for (Object e : list){
           list3.add(list.contains(e) ? "Yes" : "No");
        }
        System.out.println(list3);
    }
}
