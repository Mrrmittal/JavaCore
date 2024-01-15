package src.CollectionFramwork.List.LinkedList;

import java.util.LinkedList;

public class AddItemFromFront {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(100);
        linkedList.addFirst(2210);
        linkedList.addFirst(2130);
        linkedList.addFirst(1320);

        System.out.println(linkedList);
    }
}
