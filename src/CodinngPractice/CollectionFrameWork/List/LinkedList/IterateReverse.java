package src.CodinngPractice.CollectionFrameWork.List.LinkedList;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Write a Java program to iterate a linked list in reverse order.
public class IterateReverse {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("Jatin");
        list.add("Mittal");
        list.add(125);
        list.add(789);
        list.add(2589);
        list.add("ABC");

//        By using Iterator class
        Iterator itr = list.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("************************************88");

//        By using ListIterator class
        ListIterator itr2 = list.listIterator(list.size());
        while (itr2.hasPrevious()){
            System.out.println(itr2.previous());
        }
    }
}
