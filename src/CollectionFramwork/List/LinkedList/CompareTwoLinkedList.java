package src.CollectionFramwork.List.LinkedList;

import java.util.LinkedList;

public class CompareTwoLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(100);
        linkedList.addFirst(2210);
        linkedList.addFirst(2130);
        linkedList.addFirst(1320);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.addFirst(100);
        linkedList2.addFirst(2210);
        linkedList2.addFirst(2130);
        linkedList2.addFirst(1320);

        System.out.println(linkedList2.equals(linkedList));

//        Using Loop

        LinkedList linkedList3 = new LinkedList<>();

        for(Object e : linkedList ){
            linkedList3.add(linkedList.contains(e) ? "Yes" : "No");
        }
        System.out.println(linkedList3);

    }
}
