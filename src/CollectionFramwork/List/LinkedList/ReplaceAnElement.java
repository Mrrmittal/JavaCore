package src.CollectionFramwork.List.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class ReplaceAnElement {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(100);
        linkedList.addFirst(2210);
        linkedList.addFirst(2130);
        linkedList.addFirst(1320);

//        To Replace item in linked list
        Collections.replaceAll(linkedList, 2210, 900);
        System.out.println(linkedList);

//        By Set
        linkedList.set(3,1000);
        System.out.println(linkedList);
    }
}
